package app.model;

import java.io.Serializable;

abstract public class User implements Comparable<User>, Serializable {
	private static final long serialVersionUID = 1693295470116937316L;

	// Attributes of user
	String firstName, lastName, email, cpr, id, address, role, birthdate;
	public String password;
	
	Object department;

	int phoneNumber;

	// Getters and setters

	// First name
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// Last name
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// Role
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	// Department
	public Object getDepartment() {
		return department;
	}

	public void setDepartment(Object department) {
		this.department = department;
	}

	// Id
	public String getId() {
		return id;
	}

	// Email
	public String getEmail() {
		return email;
	}

	// Cpr
	public String getCpr() {
		return cpr;
	}

	public void setCpr(String cpr) {
		this.cpr = cpr;
		cprToBirthdate();
	}

	// Address
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// Phone no
	public int getPhonenumber() {
		return (phoneNumber);
	}

	public void setPhonenumber(int phoneNo) {
		this.phoneNumber = phoneNo;
	}

	// Password
	public String getPassword() {
		return password;
	}

	public void setPassword() {
		this.password = firstName;
	}

	// Birthdate
	public void cprToBirthdate() {
		int decade = Character.getNumericValue(cpr.charAt(4));
		if (decade > 3) {
			this.birthdate = cpr.substring(0, 2) + "." + cpr.substring(2, 4) + ".19" + cpr.substring(4, 6);
		} else {
			this.birthdate = cpr.substring(0, 2) + "." + cpr.substring(2, 4) + ".20" + cpr.substring(4, 6);
		}
	}
	
	public String getBirthdate() {
		return birthdate;
	}

	// Overwriting compareable
	@Override
	public int compareTo(User otherUser) {
		return cpr.compareTo(otherUser.cpr);
	}
}
