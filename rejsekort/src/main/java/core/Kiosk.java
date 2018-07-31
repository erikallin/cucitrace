package core;

import java.util.ArrayList;
import java.util.List;

import ccvalidation.CreditCard;
import ccvalidation.CreditCardCompany;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import LogUtil.RejsekortLogger;

public class Kiosk {

	// assumes the current class is called MyLogger
	private final static Logger LOGGER = Logger.getLogger(RejsekortLogger.class.getName());
	private String stationName;
	private String textOnScreen;

	private final int FARE_TRAVEL_CARD_CREATION = 100;
	private ResponseObject response;
	private boolean orderStatus;
	private CreditCard insertedCC;
	private List<User> tcUsers;

	public Kiosk(String stationName) {
		this.setStationName(stationName);
		tcUsers = new ArrayList<User>();
		TravelCardUsers tcu = new TravelCardUsers();
		tcUsers = tcu.getUserIDs();
		LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME).setLevel(Level.FINE);
	}

	public ResponseObject verify(CreditCard creditCard) {
		String card = creditCard.getCreditCardNumber().replaceAll("[^0-9]+", "");
		if ((card == null) || (card.length() < 13) || (card.length() > 19)) {
			this.textOnScreen = Constants.INVALID_CC_LENGTH;

			return new ResponseObject(500, Constants.INVALID_CC_LENGTH);
		}

		if (!luhnCheck(card)) {
			this.textOnScreen = Constants.INVALID_CC_LETTERS;
			return new ResponseObject(510, Constants.INVALID_CC_LETTERS);
		}

		CreditCardCompany cc = CreditCardCompany.gleanCompany(card);
		if (cc == null) {
			this.textOnScreen = Constants.INVALID_CC_COMPANY;
			return new ResponseObject(520, Constants.INVALID_CC_COMPANY);
		}
		this.textOnScreen = Constants.VALID_CC;
		setInsertedCC(creditCard);
		return new ResponseObject(530, Constants.VALID_CC);

	}

	/**
	 * Checks for a valid credit card number.
	 * 
	 * @param cardNumber
	 *            Credit Card Number.
	 * @return Whether the card number passes the luhnCheck.
	 */
	private static boolean luhnCheck(String cardNumber) {
		// number must be validated as 0..9 numeric first!!
		int digits = cardNumber.length();
		int oddOrEven = digits & 1;
		long sum = 0;
		for (int count = 0; count < digits; count++) {
			int digit = 0;
			try {
				digit = Integer.parseInt(cardNumber.charAt(count) + "");
			} catch (NumberFormatException e) {
				return false;
			}

			if (((count & 1) ^ oddOrEven) == 0) { // not
				digit *= 2;
				if (digit > 9) {
					digit -= 9;
				}
			}
			sum += digit;
		}

		return (sum == 0) ? false : (sum % 10 == 0);
	}

	public String getTextOnScreen() {
		return textOnScreen;
	}

	public void setTextOnScreen(String textOnScreen) {
		this.textOnScreen = textOnScreen;
	}

	public void setOrderStatus(boolean orderStatus) {
		this.orderStatus = orderStatus;
		// TODO Auto-generated method stub

	}

	public boolean getOrderStatus() {
		return this.orderStatus;
		// TODO Auto-generated method stub

	}

	public ResponseObject addBalance(TravelCard tc, int amount) {
		if (orderStatus) {
			insertedCC.charge(amount);
			if (insertedCC.isSuccessfullyCharged()) {
				response = new ResponseObject(300, Constants.RELOAD_SUCCESS);
				tc.addBalance(amount);

			} else {
				response = new ResponseObject(320, Constants.INVALID_CC_LOW_BALANCE);
			}
		} else {
			response = new ResponseObject(310, Constants.RELOAD_FAILURE);
		}
		return response;
		// TODO Auto-generated method stub

	}

	public CreditCard getInsertedCC() {
		return insertedCC;
	}

	public void setInsertedCC(CreditCard insertedCC) {
		this.insertedCC = insertedCC;
	}

	public ResponseObject issueTravelCard(User user, CreditCard cc) {

		if (!tcUsers.contains(user)) {
			cc.charge(FARE_TRAVEL_CARD_CREATION);
			if (insertedCC.isSuccessfullyCharged()) {

				tcUsers.add(user);
				response = new ResponseObject(400, Constants.TRAVEL_CARD_CREATION_SUCCESS);
			} else {
				response = new ResponseObject(420, Constants.INVALID_CC_LOW_BALANCE);
			}

		} else
			response = new ResponseObject(410, Constants.TRAVEL_CARD_CREATION_FAILURE);

		return response;
	}

	public List<User> getTcUsers() {
		return tcUsers;
	}

	public void setTcUsers(List<User> tcUsers) {
		this.tcUsers = tcUsers;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

}
