package databases;

import java.sql.ResultSet;
import java.util.ArrayList;

public class DBBank extends DBConn {
	private boolean isValidCC = false;

	// check it out here -- checksum
	// https://gist.github.com/icchan/47d83bacc5113db59fbc
	public DBBank() {
		super();
		isValidCC = false;
		try {
			connectCPR();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void connectCPR() throws Exception {
		try {

			// Result set get the result of the SQL query
			preparedStatement = connect.prepareStatement("SELECT *  from " + DB_TABLE_CPR);
			resultSet = preparedStatement.executeQuery();
			validCreditCard(resultSet);

		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}

	}

	private void validCreditCard(ResultSet resultSet) {
		isValidCC = true;
		return;
	}

	public boolean isValidCC() {
		return isValidCC;
	}

	public void setValidCC(boolean isValidCC) {
		this.isValidCC = isValidCC;
	}

}
