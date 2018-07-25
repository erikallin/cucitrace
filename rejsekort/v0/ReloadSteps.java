import static org.junit.Assert.assertEquals;

import ccvalidation.CreditCard;
import core.Kiosk;
import core.ResponseObject;
import core.TravelCard;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReloadSteps {
	private final String RELOAD_SUCCESS = "Travel card was reloaded successfully";
	private final String RELOAD_FAILURE = "Travel card failed to reload";
	private final String verifiedccNumber = "378282246310005";

	private final int tcBalance = 50;

	private CreditCard ccInUse;

	private Kiosk kiosk = new Kiosk("Norreport Station");
	private ResponseObject response;
	TravelCard tc = new TravelCard(tcBalance);

	@Given("^a verified credit card$")
	public void a_verified_credit_card() {
		ccInUse = new CreditCard(verifiedccNumber);
		ccInUse.setValid(true);
		kiosk.setInsertedCC(ccInUse);
	}

	@Given("^the kiosk is in working order$")
	public void the_kiosk_is_in_working_order() throws Throwable {
		kiosk.setOrderStatus(true);
	}

	@When("^the travel card user reloads the travel card with (\\d+)$")
	public void the_travel_card_user_reloads_the_travel_card_with(int amount) {
		response = kiosk.addBalance(tc, amount);

	}

	@Then("^the travel card after reload has a new balance (\\d+)$")
	public void the_travel_card_after_reload_has_a_new_balance(int newBalance) {
		assertEquals(tc.getBalance(), newBalance);
	}

@Then("^the verified credit card is charged with (\\d+)$")
public void the_verified_credit_card_is_charged_with(int amount) {
	assertEquals(response.getMessage(), RELOAD_SUCCESS);
}
@Then("^the kiosk displays a message that the travel card was reloaded successfully$")
public void the_kiosk_displays_a_message_that_the_travel_card_was_reloaded_successfully(){
	assertEquals(response.getMessage(), RELOAD_SUCCESS);
}



@Given("^the kiosk is out of order$")
public void the_kiosk_is_out_of_order(){
	kiosk.setOrderStatus(false);
}

@Then("^the kiosk displays a message that the travel card failed to reload$")
public void the_kiosk_displays_a_message_that_the_travel_card_failed_to_reload(){
	assertEquals(response.getMessage(), RELOAD_FAILURE);
}


	// @Given("^a valid credit card is inserted into a kiosk$")
	// public void a_valid_credit_card_is_inserted_into_a_kiosk() throws
	// Throwable {
	// Kiosk kiosk = new Kiosk(stationName);
	//// kiosk.read(ccNo);
	// }
	//
	// @Given("^a valid credit card is inserted into a kiosk$")
	// public void a_valid_credit_card_is_inserted_into_a_kiosk(int ccNo){
	//// Kiosk kiosk = new Kiosk(stationName);
	//// kiosk.read(ccNo);
	// }

	// @Given("^automaton in service is (true|false)$")
	// public void automaton_in_service_is_true(boolean isInService) {
	// automaton.setInService(isInService);
	//// }
	//
	//
	//
	//
	// @When("^a user reloads with (\\d+)$")
	// public void a_user_reloads_with(int amount) {
	//// response = automaton.isInService();
	// response= card.addBalance(amount, automaton);
	// }

	// @Then("^the automaton displays message that reload succeeded$")
	// public void the_automaton_displays_message_that_reload_succeeded(){
	// assertEquals(response.getErrorMessage(), "reload succeeded");
	// }

	// @Then("^the automaton displays message that reload failed$")
	// public void the_automaton_displays_message_that_reload_failed() {
	// assertEquals(response.getErrorMessage(), "reload failed");
	// }

	//
	//
	// @Given("^kiosk in service is (true|false)$")
	// public void kiosk_in_service_is_true(boolean isInService) {
	// automaton.setInService(isInService);
	// }
	//
	// @Then("^the kiosk displays message that reload succeeded$")
	// public void the_kiosk_displays_message_that_reload_succeeded() {
	// assertEquals(response.getErrorMessage(), "reload succeeded");
	// }
	//
	// @Given("^kiosk in service is false$")
	// public void kiosk_in_service_is_false() throws Throwable {
	// // Write code here that turns the phrase above into concrete actions
	// throw new PendingException();
	// }
	//
	// @Then("^the kiosk displays message that reload failed$")
	// public void the_kiosk_displays_message_that_reload_failed() {
	// assertEquals(response.getErrorMessage(), "reload failed");
	// }

}
