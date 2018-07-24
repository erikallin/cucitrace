package databases;

public class CPR {

	private String name;
	private String surname;
	private String cpr;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCpr() {
		return cpr;
	}

	public void setCpr(String cpr) {
		this.cpr = cpr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public CPR(String name, String surname, String cpr, int age) {
		this.name = name;
		this.surname = surname;
		this.cpr = cpr;
		this.age = age;

	}

	public CPR(String cpr) {
		this.cpr = cpr;
		this.age = -1;
		this.name = null;
		this.surname = null;

	}

}
