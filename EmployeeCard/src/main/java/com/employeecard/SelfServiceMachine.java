package com.employeecard;

import java.util.ArrayList;
import java.util.List;

import com.creditcard.CreditCard;
import com.creditcard.CreditCardCompany;

public class SelfServiceMachine {

	
	/**
	 * Checks for a valid credit card number.
	 * 
	 * @param cardNumber
	 *            Credit Card Number.
	 * @return Whether the card number passes the luhnCheck.
	 */
	
	
	private static boolean luhnCheck(String cardNumber) {
		// number must be validated as 0..9 numeric first!!
		int digits = cardNumber.length();
		int oddOrEven = digits & 1;
		long sum = 0;
		for (int count = 0; count < digits; count++) {
			int digit = 0;
			try {
				digit = Integer.parseInt(cardNumber.charAt(count) + "");
			} catch (NumberFormatException e) {
				return false;
			}

			if (((count & 1) ^ oddOrEven) == 0) { // not
				digit *= 2;
				if (digit > 9) {
					digit -= 9;
				}
			}
			sum += digit;
		}

		return (sum == 0) ? false : (sum % 10 == 0);
	}

	
	
	
	
	private final int EMPLOYEE_CARD_INITIAL_BALANCE = 100;

	
	private CreditCard insertedCC;
	
	
	private ResponseObject response;
	
	
	private String canteenName;
	
	
	private List<EmployeeCard> ecUsers;

	
	private String textOnScreen;

	
	public SelfServiceMachine(String canteenName) {
		this.setCanteenName(canteenName);
		ecUsers = new ArrayList<EmployeeCard>();
		EmployeeCardList ecu = new EmployeeCardList();
		ecUsers = ecu.getEmployeeIDs();
	}

	
	
	
	
	public ResponseObject addBalance(EmployeeCard ecInUse, int amount) {
	
		if (validate(insertedCC).getCode() == 530) {
			
			insertedCC.charge(amount);
		
			if (insertedCC.isSuccessfullyCharged()) {
			
				response = new ResponseObject(300, Constants.DEPOSIT_SUCCESS);
				ecInUse.depositBalance(amount);
				InitSystem.isl.getLogger().info("CREDIT CARD :" + Constants.VALID_CC + Constants.DEPOSIT_SUCCESS);
				InitSystem.isl.printLog();
			
			} else {
			
				response = new ResponseObject(320, Constants.INVALID_CC_LOW_BALANCE);
			
			}
		
		}
		
		return response;

	}

	
	
	
	public void checkRegistered() {
		InitSystem.isl.logContains(Constants.VALID_CC + Constants.EMPLOYEE_CARD_ACTIVATED_FOR_PURCHASES_SUCCESS);

	}

	
	
	
	public CreditCard getInsertedCC() {
		return insertedCC;
	}

	
	
	
	
	public String getCanteenName() {
		return canteenName;
	}

	
	
	
	
	public List<EmployeeCard> getEcUsers() {
		return ecUsers;
	}

	
	
	
	
	public String getTextOnScreen() {
		return textOnScreen;
	}

	
	
	
	
	public ResponseObject activateEmployeeCardPurchases(EmployeeCard user) {

		if (!ecUsers.contains(user)) {
	
			insertedCC.charge(EMPLOYEE_CARD_INITIAL_BALANCE);
			
			if (insertedCC.isSuccessfullyCharged()) {

				ecUsers.add(user);
				response = new ResponseObject(400, Constants.EMPLOYEE_CARD_ACTIVATED_FOR_PURCHASES_SUCCESS);
				InitSystem.isl.getLogger()
						.info("CREDIT CARD :" + Constants.VALID_CC + Constants.EMPLOYEE_CARD_ACTIVATED_FOR_PURCHASES_SUCCESS);
				InitSystem.isl.printLog();

			} else {
			
				response = new ResponseObject(420, Constants.INVALID_CC_LOW_BALANCE);
			
			}

		} else{
		
			response = new ResponseObject(410, Constants.EMPLOYEE_CARD_ACTIVATED_FOR_PURCHASES_FAILURE);
		
		}
		
		return response;
	
	}

	
	
	
	
	public void setInsertedCC(CreditCard insertedCC) {
		this.insertedCC = insertedCC;
	}

	
	
	
	
	public void setCanteenName(String canteenName) {
		this.canteenName = canteenName;
	}

	
	
	
	
	public void setEcUsers(List<EmployeeCard> ecUsers) {
		this.ecUsers = ecUsers;
	}

	
	
	
	
	public void setTextOnScreen(String textOnScreen) {
		this.textOnScreen = textOnScreen;
	}

	
	
	
	
	public ResponseObject validate(CreditCard creditCard) {
	
		String cardNumber = creditCard.getCreditCardNumber().replaceAll("[^0-9]+", "");
		
		if ((cardNumber == null) || (cardNumber.length() < 13) || (cardNumber.length() > 19)) {
		
			this.textOnScreen = Constants.INVALID_CC_LENGTH;

			return new ResponseObject(500, Constants.INVALID_CC_LENGTH);
		
		}

		if (!luhnCheck(cardNumber)) {
	
			this.textOnScreen = Constants.INVALID_CC_LETTERS;
		
			return new ResponseObject(510, Constants.INVALID_CC_LETTERS);
		
		}

		CreditCardCompany cc = CreditCardCompany.obtainCompany(cardNumber);
		
		if (cc == null) {
		
			this.textOnScreen = Constants.INVALID_CC_COMPANY;

			return new ResponseObject(520, Constants.INVALID_CC_COMPANY);
		
		}

		this.textOnScreen = Constants.VALID_CC;
		setInsertedCC(creditCard);

		return new ResponseObject(530, Constants.VALID_CC);

	}

}
