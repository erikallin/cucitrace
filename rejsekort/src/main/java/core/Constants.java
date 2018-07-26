package core;

public class Constants {

	public static final String CHECKED_OUT_SUCCESS = "Success: Travel card is checked-out";
	public static final String CHECKED_OUT_FAILURE = "Failure: Travel card is not checked-in";

	public static final String CHECKED_IN_SUCCESS = "Travel card is checked in";
	public static final String CHECKED_IN_FAILURE_LOW_BALANCE = "Travel card balance is too low";
	public static final String CHECKED_IN_FAILURE_ALREADY = "Travel card is already checked in";

	public static final String VALID_CC = "credit card is valid";
	public static final String INVALID_CC_LETTERS = "credit card is invalid because it contains characters";
	public static final String INVALID_CC_LENGTH = "credit card is invalid because it has too few digits";
	public static final String INVALID_CC_COMPANY = "credit card is invalid it does not belong to a company provider";

	public static final String INVALID_CC_LOW_BALANCE = "credit card does not have enough balance";
	public static final String VALID_CC_BALANCE = "credit card does have enough balance";

	public static final String RELOAD_SUCCESS = "Travel card was reloaded successfully";
	public static final String RELOAD_FAILURE = "Travel card failed to reload";
	public static final String TRAVEL_CARD_CREATION_SUCCESS = "Travel card was created";
	public static final String TRAVEL_CARD_CREATION_FAILURE = "Travel card was not created because user already registered in the system";

	public static final int notEnoughBalance = 0;

}
