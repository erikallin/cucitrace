
public class TravelCard {
	ResponseObject response;
	int balance;
	
	boolean isCheckedIn;

	public boolean isCheckedIn() {
		return isCheckedIn;
	}

	public void setCheckedIn(boolean isCheckedIn) {
		this.isCheckedIn = isCheckedIn;
	}

	public TravelCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}



	public ResponseObject addBalance(int amount, Automaton automaton) {
		if(automaton.isInService()){
			this.balance+= amount + 0.1*amount;
				return response = new ResponseObject(232, "reload succeeded");
		}else
			return response = new ResponseObject(233, "reload failed");

	}

}
