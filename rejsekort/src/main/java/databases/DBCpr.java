package databases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBCpr extends DBConn {

	private List<CPR> dbCPR;
	public DBCpr()  {
		super();
		try {
			connectCPR();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	private void connectCPR() throws Exception {
		try {

			dbCPR = new ArrayList<CPR>();
			// Result set get the result of the SQL query
			preparedStatement = connect.prepareStatement("SELECT *  from " + DB_TABLE_CPR);
			resultSet = preparedStatement.executeQuery();
			retrieveCPRs(resultSet);

		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}

	}

	private void retrieveCPRs(ResultSet resultSet) throws SQLException {
		// ResultSet is initially before the first data set

		while (resultSet.next()) {
			String cprNumber = resultSet.getString("cprNumber");
			String name = resultSet.getString("name");
			String surname = resultSet.getString("surname");

			int age = resultSet.getInt("age");
			System.out.println("cprNumber: " + cprNumber);
			System.out.println("name: " + name);
			System.out.println("surname: " + surname);
			System.out.println("age: " + age);
			CPR cpr = new CPR(name, surname, cprNumber, age);
			dbCPR.add(cpr);
		}
	}

	public List<CPR> getDbCPR() {
		return dbCPR;
	}

	public void setDbCPR(List<CPR> dbCPR) {
		this.dbCPR = dbCPR;
	}

}
