package com.employeecard;

public class EmployeeCard {
	
	
	private int balance;

	
	private int accessLevel;
	
	
	private boolean inUseStatus;
	
	
	private String employeeID;

	
	public EmployeeCard() {
	}





	public EmployeeCard(int balance) {
		this.balance = balance;
	}





	public EmployeeCard(String employeeID) {
		this.employeeID = employeeID;
	}





	public EmployeeCard(String employeeID, int balance, int accessLevel, boolean inUseStatus) {
		this.employeeID = employeeID;
		this.balance = balance;
		this.accessLevel = accessLevel;
		this.inUseStatus = inUseStatus;
	}

	
	
	
	
	public void depositBalance(int amount) {
		this.balance += amount;
		// bankLogger.getLogger().info("new Employee card balance "+ balance);
	}

	

	public void withdrawBalance(int amount) {
		this.balance -= amount;
		// bankLogger.getLogger().info("new Employee card balance "+ balance);
	}
	
	
	
	public int getBalance() {
		return balance;
	}





	public int getAccessLevel() {
		return accessLevel;
	}





	public String getEmployeeID() {
		return employeeID;
	}

	
	
	
	
	public boolean isInUseStatus() {
		return inUseStatus;
	}

	
	
	
	
	public void setBalance(int balance) {
		this.balance = balance;
	}





	public void setAccessLevel(int accessLevel) {
		this.accessLevel = accessLevel;
	}





	public void setInUseStatus(boolean isInUseStatus) {
		this.inUseStatus = isInUseStatus;
	}

	
	
	
	
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	
	
	
	
}
