import databases.CPR;

public class User {

	private CPR cpr;
	private int ccNumber;

	private TravelCard tc;

	public TravelCard getTc() {
		return tc;
	}

	public void setTc(TravelCard tc) {
		this.tc = tc;
	}

	public User(CPR cpr) {
		super();
		this.cpr = cpr;
	}

	public CPR getCpr() {
		return cpr;
	}

	public void setCpr(CPR cpr) {
		this.cpr = cpr;
	}

	public int getCcNumber() {
		return ccNumber;
	}

	public void setCcNumber(int ccNumber) {
		this.ccNumber = ccNumber;
	}

}