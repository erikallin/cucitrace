package ccvalidation;

public class CreditCard {

	private String creditCardNumber;
	private boolean valid;

	private CreditCardCompany cardType;
	private int chargedAmount;

	public CreditCard(String ccNumber) {
		this.creditCardNumber = ccNumber;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public CreditCardCompany getCardType() {
		return cardType;
	}

	public void setCardType(CreditCardCompany cardType) {
		this.cardType = cardType;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public void charge(int amount) {
		this.setChargedAmount(amount);
		// service to charge amount
		// add a scenario if there is not enough amount
	}

	public int getChargedAmount() {
		// TODO Auto-generated method stub
		return this.chargedAmount;
	}

	public void setChargedAmount(int chargedAmount) {
		this.chargedAmount = chargedAmount;
	}

}
