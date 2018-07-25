import static org.junit.Assert.assertEquals;

import ccvalidation.CreditCard;
import core.Constants;
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
		assertEquals(response.getMessage(), Constants.RELOAD_SUCCESS);
	}

	@Then("^the kiosk displays a message that the travel card was reloaded successfully$")
	public void the_kiosk_displays_a_message_that_the_travel_card_was_reloaded_successfully() {
		assertEquals(response.getMessage(), Constants.RELOAD_SUCCESS);
	}

	@Given("^the kiosk is out of order$")
	public void the_kiosk_is_out_of_order() {
		kiosk.setOrderStatus(false);
	}

	@Then("^the kiosk displays a message that the travel card failed to reload$")
	public void the_kiosk_displays_a_message_that_the_travel_card_failed_to_reload() {
		assertEquals(response.getMessage(), Constants.RELOAD_FAILURE);
	}

}