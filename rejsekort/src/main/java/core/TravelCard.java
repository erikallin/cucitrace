package core;

public class TravelCard {
	ResponseObject response;
	int balance;

	private boolean isCheckedInStatus;

	public TravelCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TravelCard(int tcBalance) {
		this.balance =tcBalance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}


	public boolean isCheckedInStatus() {
		return isCheckedInStatus;
	}

	public void setCheckedInStatus(boolean isCheckedInStatus) {
		this.isCheckedInStatus = isCheckedInStatus;
	}

	public void addBalance(int amount) {
		this.balance+=amount;
	}

}
