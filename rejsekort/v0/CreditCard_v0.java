package validation;

public class CreditCard_v0 {
	private String creditCardNumber;
	private int creditCardPassword;
	private boolean isValid;

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getCreditCardPassword() {
		return creditCardPassword;
	}

	public void setCreditCardPassword(int creditCardPassword) {
		this.creditCardPassword = creditCardPassword;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public void verify() {
		
		
	}

}
