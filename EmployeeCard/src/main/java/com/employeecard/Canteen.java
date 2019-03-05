package com.employeecard;

public class Canteen {

	
	private DepositToEmployeeCard depositMoney;
	
	
	private WithdrawFromEmployeeCard withdrawMoney;
	
	
	private int countWithdrawals;
	
	
	private int countDeposits;
	
	
	private SelfServiceMachine selfServiceMachine;

	
	private String canteenName;

	
	public Canteen(String canteenName) {
		super();
		this.canteenName = canteenName;
	}

	
	
	
	
	public DepositToEmployeeCard getDepositMoney() {
		return depositMoney;
	}

	
	
	
	
	public WithdrawFromEmployeeCard getWithdrawMoney() {
		return withdrawMoney;
	}

	
	
	
	
	public int getCountDeposits() {
		return countDeposits;
	}
	
	
	
	
	
	public int getCountWithdrawals() {
		return countWithdrawals;
	}

	
	

	
	public SelfServiceMachine getSelfServiceMachine() {
		return selfServiceMachine;
	}

	
	
	
	
	public String getCanteenName() {
		return canteenName;
	}

	
		
	
	
	public void setDeposit(DepositToEmployeeCard deposit) {
		this.depositMoney = deposit;
	}





	public void setWithdraw(WithdrawFromEmployeeCard withdraw) {
		this.withdrawMoney = withdraw;
	}





	public void setCountDeposits(int countDeposits) {
		this.countDeposits = countDeposits;
	}





	public void setCountWithdrawals(int countWithdrawals) {
		this.countWithdrawals = countWithdrawals;
	}

	
	
	
	
	public void setSelfServiceMachine(SelfServiceMachine selfServiceMachine) {
		this.selfServiceMachine = selfServiceMachine;
	}

	
	
	
	
	public void setCanteenName(String canteenName) {
		this.canteenName = canteenName;
	}
	
	
	
	
}
