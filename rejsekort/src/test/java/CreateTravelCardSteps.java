import static org.junit.Assert.assertEquals;

import ccvalidation.CreditCard;
import core.User;
import core.Constants;
import core.Kiosk;
import core.ResponseObject;
import core.TravelCardUsers;
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

	@Then("^the kiosk displays a message that a travel card is issued$")
	public void the_kiosk_displays_a_message_that_a_travel_card_is_issued() {
		assertEquals(response.getMessage(), Constants.TRAVEL_CARD_CREATION_SUCCESS);
	}

	@Given("^a userID number \"([^\"]*)\" is registered in the system$")
	public void a_userID_number_is_registered_in_the_system(String userIDnumber) {
		user = new User(userIDnumber);
		registrationKiosk.getTcUsers().add(user);
	}

	@Then("^the kiosk displays a message that a travel card not issued$")
	public void the_kiosk_displays_a_message_that_a_travel_card_not_issued() throws Throwable {
		assertEquals(response.getMessage(), Constants.TRAVEL_CARD_CREATION_FAILURE);
	}

}