import static org.junit.Assert.assertEquals;

import com.creditcard.validation.CreditCard;
import com.travelcard.core.Constants;
import com.travelcard.core.Kiosk;
import com.travelcard.core.ResponseObject;
import com.travelcard.core.TravelCardUserList;
import com.travelcard.core.User;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateTravelCardSteps {
	User user;
	CreditCard ccInUse;
	Kiosk registrationKiosk;

	ResponseObject response;

	@Given("^a customer at a registration kiosk at station \"([^\"]*)\"$")
	public void a_customer_at_a_registration_kiosk_at_station(String stationName) {
		registrationKiosk = new Kiosk(stationName);
	}

	@Given("^his credit card \"([^\"]*)\" was successfully verified by the registration kiosk$")
	public void his_credit_card_was_successfully_verified_by_the_registration_kiosk(String ccNumber) {
		ccInUse = new CreditCard(ccNumber);
		ccInUse.setValid(true);
		registrationKiosk.setInsertedCC(ccInUse);
	}

	@Given("^his credit card has enough balance to charge the amount of (\\d+)$")
	public void his_credit_card_has_enough_balance_to_charge_the_amount_of(int amount) {
		ccInUse.setBalance(amount);

	}

	@Given("^his credit card does not have enough balance to charge the amount of (\\d+)$")
	public void his_credit_card_does_not_have_enough_balance_to_charge_the_amount_of(int amount) {
		ccInUse.setBalance(Constants.notEnoughBalance - amount);
	}

	@Given("^a userID number \"([^\"]*)\" is not registered in the system$")
	public void a_userID_number_is_not_registered_in_the_system(String userIDnumber) {
		user = new User(userIDnumber);
	}

	@When("^issue a travel card$")
	public void issue_a_travel_card() {
		response = registrationKiosk.issueTravelCard(user, ccInUse);
	}

	@Then("^a travel card user is registered$")
	public void a_travel_card_user_is_registered() {

		assertEquals(registrationKiosk.getTcUsers().contains(user), true);

	}

	@Then("^the registration kiosk displays a message that a travel card is issued$")
	public void the_registration_kiosk_displays_a_message_that_a_travel_card_is_issued() {
		assertEquals(response.getMessage(), Constants.TRAVEL_CARD_CREATION_SUCCESS);
	}

	@Given("^a userID number \"([^\"]*)\" is registered in the system$")
	public void a_userID_number_is_registered_in_the_system(String userIDnumber) {
		user = new User(userIDnumber);
		registrationKiosk.getTcUsers().add(user);
	}

	@Then("^the registration kiosk displays a message that a travel card not issued because user already registered in the system$")
	public void the_registration_kiosk_displays_a_message_that_a_travel_card_not_issued_because_user_already_registered_in_the_system() {
		assertEquals(response.getMessage(), Constants.TRAVEL_CARD_CREATION_FAILURE);
	}

	@Then("^the registration kiosk displays a message that a travel card not issued because credit card does not have enough balance$")
	public void the_registration_kiosk_displays_a_message_that_a_travel_card_not_issued_because_credit_card_does_not_have_enough_balance()
			throws Throwable {
		assertEquals(response.getMessage(), Constants.INVALID_CC_LOW_BALANCE);
	}

}