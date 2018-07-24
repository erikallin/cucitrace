//package databases;
//
//import validation.CreditCardValidationResult;
//import validation.RegexCardValidator;
//
//public class DBBank extends DBConn {
//
//	private boolean chargedCC;
//	CreditCardValidationResult result;
//	RegexCardValidator rcv;
//
//	public DBBank(CreditCardValidationResult result, RegexCardValidator rcv) {
//		super();
//		this.result = result;
//		this.rcv = rcv;
//		try {
//			charge();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		// TODO Auto-generated constructor stub
//	}
//
//	private void charge() throws Exception {
//		try {
//			if (result.isValid()) {
//				chargedCC = true;
//
//				/** 
//				 * Because database is not connected
//				 */
////				// Result set get the result of the SQL query
////				preparedStatement = connect
////						.prepareStatement("SELECT *  from " + DB_TABLE_CC_BANK + "WHERE CreditCardNumber="
////								+ rcv.getCreditCardNumber() + "CreditCardPassword =" + rcv.getCreditCardPassword());
////				resultSet = preparedStatement.executeQuery();
////				if (resultSet.next()) {
////					if (resultSet.wasNull()) {
////						chargedCC = false;
////					} else
////						chargedCC = true;
////
////				}
//			} else
//				chargedCC = false;
//
//		} catch (Exception e) {
//			throw e;
//		} finally {
//			close();
//		}
//
//	}
//
//	public boolean isChargedCC() {
//		return chargedCC;
//	}
//
//	public void setChargedCC(boolean chargedCC) {
//		this.chargedCC = chargedCC;
//	}
//
//}
