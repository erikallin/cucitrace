package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConn {

	protected Connection connect = null;
	protected Statement statement = null;
	protected PreparedStatement preparedStatement = null;
	protected ResultSet resultSet = null;

	protected final String DB_TABLE_CPR = "dbmyprj.dbcpr";

	protected final String DB_TABLE_TC_USERS = "dbmyprj.dbtcusers";
	protected final String DB_TABLE_CC_BANK = "dbmyprj.dbccbank";
	
	public final String url = "jdbc:mysql://localhost/dbmyprj?user=sqluser&password=sqluserpw";

	public DBConn() {
		try {
			connect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void connect() throws Exception {
		// This will load the MySQL driver, each DB has its own driver
		Class.forName("com.mysql.jdbc.Driver");

		// Setup the connection with the DB
		connect = DriverManager.getConnection(url);

		// Statements allow to issue SQL queries to the database
		statement = connect.createStatement();

	}

	// You need to close the resultSet
	protected void close() {
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
