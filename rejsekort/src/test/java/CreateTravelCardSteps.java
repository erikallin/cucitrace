import static org.junit.Assert.assertEquals;

import ccvalidation.CreditCard;
import core.CPR;
import core.Constants;
import core.Kiosk;
import core.ResponseObject;
import core.TravelCardUsers;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateTravelCardSteps {
	CPR cpr;
	CreditCard cc = new CreditCard("378282246310005");
	Kiosk kiosk = new Kiosk("Norreport St");

	ResponseObject response;

	@Given("^a cpr number \"([^\"]*)\" is not registered in the system$")
	public void a_cpr_number_is_not_registered_in_the_system(String cprnumber) {
		cpr = new CPR(cprnumber);
	}

	@When("^issue a travel card$")
	public void issue_a_travel_card() {
		response = kiosk.issueTravelCard(cpr, cc);
	}

	@Then("^a travel card user is registered$")
	public void a_travel_card_user_is_registered() {

		assertEquals(kiosk.getTcUsers().contains(cpr), true);

	}

	@Then("^the kiosk displays a message that a travel card is issued$")
	public void the_kiosk_displays_a_message_that_a_travel_card_is_issued() {
		assertEquals(response.getMessage(), Constants.TRAVEL_CARD_CREATION_SUCCESS);
	}

	@Given("^a cpr number \"([^\"]*)\" is registered in the system$")
	public void a_cpr_number_is_registered_in_the_system(String cprnumber) {
		cpr = new CPR(cprnumber);
		kiosk.getTcUsers().add(cpr);
	}

	@Then("^the kiosk displays a message that a travel card not issued$")
	public void the_kiosk_displays_a_message_that_a_travel_card_not_issued() throws Throwable {
		assertEquals(response.getMessage(), Constants.TRAVEL_CARD_CREATION_FAILURE);
	}

}