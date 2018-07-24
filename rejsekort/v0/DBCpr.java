package databases;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBCpr extends DBConn {
	private CPR cpr;
	private boolean cprOk;

	public DBCpr(String cprNumber) {
		super();
		cpr = new CPR(cprNumber);

		cprOk = false;
		try {
			connectCPR();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void connectCPR() throws Exception {
		try {

			if (cpr.equals("cprOK")) {
				cprOk = true;

			} else {
				cprOk = false;
			}
			/**
			 * Commented because no connection to server yet
			 */
			// // Result set get the result of the SQL query
			// preparedStatement = connect.prepareStatement("SELECT * from " +
			// DB_TABLE_CPR +"WHERE CPR =" + cpr );
			// resultSet = preparedStatement.executeQuery();
			// retrieveCPRs(resultSet);

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
			cpr = new CPR(name, surname, cprNumber, age);

		}

	}

	public boolean cprExists() {
		if (cprOk) {
			return true;
		} else
			return false;
	}

}
