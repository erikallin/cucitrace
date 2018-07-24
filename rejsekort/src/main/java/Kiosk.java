import ccvalidation.CreditCard;
import ccvalidation.CreditCardCompany;

public class Kiosk {

	private String stationName;
	private String textOnScreen;

	private final String VALID_CC = "credit card is valid";
	private final String INVALID_CC = "credit card is invalid";

	public Kiosk(String stationName) {
		this.setStationName(stationName);
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
			this.textOnScreen = INVALID_CC;
			return;
		}

		if (!luhnCheck(card)) {
			this.textOnScreen = INVALID_CC;
			return;
		}

		CreditCardCompany cc = CreditCardCompany.gleanCompany(card);
		if (cc == null) {
			this.textOnScreen = INVALID_CC;
			return;
		}
		this.textOnScreen = VALID_CC;

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

	public void printOnScreen() {
		System.out.println("The" + textOnScreen);
	}
}
