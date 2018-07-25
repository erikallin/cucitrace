package core;

import java.util.ArrayList;
import java.util.List;

import ccvalidation.CreditCard;
import ccvalidation.CreditCardCompany;

public class Kiosk {

	private String stationName;
	private String textOnScreen;


	private final int FARE_TRAVEL_CARD_CREATION = 100;
	private ResponseObject response;
	private boolean orderStatus;
	private CreditCard insertedCC;
	private List<CPR> tcUsers = new ArrayList<CPR>();

	public Kiosk(String stationName) {
		this.setStationName(stationName);
		TravelCardUsers tcu = new TravelCardUsers();
		tcUsers = tcu.getCPRs();
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public void verify(CreditCard creditCard) {
		String card = creditCard.getCreditCardNumber().replaceAll("[^0-9]+", "");
		if ((card == null) || (card.length() < 13) || (card.length() > 19)) {
			this.textOnScreen = Constants.INVALID_CC;
			return;
		}

		if (!luhnCheck(card)) {
			this.textOnScreen = Constants.INVALID_CC;
			return;
		}

		CreditCardCompany cc = CreditCardCompany.gleanCompany(card);
		if (cc == null) {
			this.textOnScreen = Constants.INVALID_CC;
			return;
		}
		this.textOnScreen = Constants.VALID_CC;
		setInsertedCC(creditCard);

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
			response = new ResponseObject(300, Constants.RELOAD_SUCCESS);
			tc.addBalance(amount);
			insertedCC.charge(amount);
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

	public ResponseObject issueTravelCard(CPR cpr, CreditCard cc) {

		if (!tcUsers.contains(cpr)) {
			tcUsers.add(cpr);
			cc.charge(FARE_TRAVEL_CARD_CREATION);
			response = new ResponseObject(400, Constants.TRAVEL_CARD_CREATION_SUCCESS);
		} else
			response = new ResponseObject(410, Constants.TRAVEL_CARD_CREATION_FAILURE);

		return response;
	}

	public List<CPR> getTcUsers() {
		return tcUsers;
	}

	public void setTcUsers(List<CPR> tcUsers) {
		this.tcUsers = tcUsers;
	}

}
