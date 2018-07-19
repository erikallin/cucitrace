
public class User {

	private String name;
	private String lname;
	private String cpr;
	private int ccNumber;

	private TravelCard tc;

	public TravelCard getTc() {
		return tc;
	}

	public void setTc(TravelCard tc) {
		this.tc = tc;
	}

	public User(String name, String lname, String cpr) {
		this.name = name;
		this.lname = lname;
		this.cpr = cpr;
		// TODO Auto-generated constructor stub
	}

	public User(String cpr) {
		this.cpr = cpr;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCpr() {
		return cpr;
	}

	public void setCpr(String cpr) {
		this.cpr = cpr;
	}

	public int getCcNumber() {
		return ccNumber;
	}

	public void setCcNumber(int ccNumber) {
		this.ccNumber = ccNumber;
	}

}
