package databases;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class dbCpr{

    private Connection connect = null;
	private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    List<CPR> dbCPR ;
    @SuppressWarnings("deprecation")
	public void readDataBase() throws Exception {
        try {
        	
        	dbCPR= new ArrayList<CPR>();
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/dbmyprj?"
                            + "user=sqluser&password=sqluserpw");

            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query

            preparedStatement = connect
                    .prepareStatement("SELECT *  from dbmyprj.dbcpr");
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
            CPR cpr = new CPR(name,surname,cprNumber,age);
            dbCPR.add(cpr);
        }
    }
	
    public List<CPR> getDbCPR() {
		return dbCPR;
	}

	public void setDbCPR(List<CPR> dbCPR) {
		this.dbCPR = dbCPR;
	}

    // You need to close the resultSet
    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }

}


