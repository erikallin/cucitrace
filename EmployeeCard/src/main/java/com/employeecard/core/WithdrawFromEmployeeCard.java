package com.employeecard.core;

public class WithdrawFromEmployeeCard {

	
	private int countWithdrawals = 0;
	
	
	private final int FEE = 1;
	private final int MINIMUM_ACCOUNT_BALANCE = 50;
	
	
	private ResponseObject response;
	
	
	private String canteenName;

	
	public WithdrawFromEmployeeCard(String canteenName) {
		this.setCanteenName(canteenName);
	}

	
	
	
	
	public ResponseObject withdraw(EmployeeCard account, int amount) {
	
		if (!account.isInUseStatus()) {
			
			if (hasEnoughBalance(account)) {
			
				account.setInUseStatus(true);
				chargeFee(account);

				account.withdrawBalance(amount);
				response = new ResponseObject(230, Constants.WITHDRAWAL_SUCCESS);

				InitSystem.isl.getLogger()
						.info("WITHDRAWAL: Self-service machine at " + canteenName + " : " + Constants.WITHDRAWAL_SUCCESS + amount + " DKK");
				InitSystem.isl.printLog();
				countWithdrawals++;
			
			} else {
				
				response = new ResponseObject(220, Constants.WITHDRAWAL_FAILURE_LOW_BALANCE);
			
			}

		} else {

			response = new ResponseObject(240, Constants.WITHDRAWAL_FAILURE);
		
		}
		
		account.setInUseStatus(false);
		return response;
	}

	
	
	
	
	public void withdrawalLog() {

		InitSystem.isl.logContains(Constants.WITHDRAWAL_SUCCESS);

	}

	
	
	
	
	public String getCanteenName() {
		return canteenName;
	}

	
	
	
	
	public void setCanteenName(String canteenName) {
		this.canteenName = canteenName;
	}

	
	
	
	
	private void chargeFee(EmployeeCard account) {

		account.setBalance(account.getBalance() - FEE);

	}

	
	private boolean hasEnoughBalance(EmployeeCard account) {
		return account.getBalance() > MINIMUM_ACCOUNT_BALANCE;
	}
	
	
	
}
