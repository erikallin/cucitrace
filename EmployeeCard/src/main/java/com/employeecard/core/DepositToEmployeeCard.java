package com.employeecard.core;

public class DepositToEmployeeCard {

	
	private int countDeposits = 0;


	private ResponseObject response;


	private String canteenName;

	
	public DepositToEmployeeCard(String canteenName) {
		this.canteenName = canteenName;

	}





	public ResponseObject deposit(EmployeeCard account, int amount) {

		if (!account.isInUseStatus()) {

			account.setInUseStatus(true);
			account.depositBalance(amount);
			response = new ResponseObject(200, Constants.DEPOSIT_SUCCESS);

			InitSystem.isl.getLogger().info("DEPOSIT: Self-service machine at " + canteenName + " : "
					+ Constants.DEPOSIT_SUCCESS + amount + " DKK");
			InitSystem.isl.printLog();
			setCountDeposits(getCountDeposits() + 1);
			
		} else {
			
			response = new ResponseObject(210, Constants.DEPOSIT_FAILURE_ALREADY);
		
		}
		
		account.setInUseStatus(false);
		return response;
	}

	
	
	
	
	public void depositLog() {
		InitSystem.isl.logContains(Constants.DEPOSIT_SUCCESS);
	}

	
	
	
	
	public String getCanteenName() {
		return canteenName;
	}

	
	
	
	
	public void setCanteenName(String canteenName) {
		this.canteenName = canteenName;
	}

	
	
	
	public int getCountDeposits() {
		return countDeposits;
	}





	public void setCountDeposits(int countDeposits) {
		this.countDeposits = countDeposits;
	}	

	
	
	
	
}
