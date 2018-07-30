package ccvalidation;


public class CreditCard {

	private String creditCardNumber;
	private boolean valid;

	private CreditCardCompany cardType;
	private int chargedAmount;
	private int balance;
	private boolean successfullyCharged;

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
		if (getServiceCreditCardBalance() - amount>=0){
			setSuccessfullyCharged(true);
		}else
			setSuccessfullyCharged(false);
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

	public void setBalance(int amount) {
		this.balance = amount;
		// TODO Auto-generated method stub

	}

	public int getBalance() {
		return this.balance;

	}

	public boolean isSuccessfullyCharged() {
		return successfullyCharged;
	}

	public void setSuccessfullyCharged(boolean successfullyCharged) {
		this.successfullyCharged = successfullyCharged;
	}
	
	private int getServiceCreditCardBalance(){
		//communication with Bank to get credit card balance
		return this.balance;
	}

}
