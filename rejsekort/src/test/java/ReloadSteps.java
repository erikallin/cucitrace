import static org.junit.Assert.assertEquals;

import com.creditcard.validation.CreditCard;
import com.travelcard.core.Constants;
import com.travelcard.core.Kiosk;
import com.travelcard.core.ResponseObject;
import com.travelcard.core.TravelCard;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReloadSteps {
	private final String RELOAD_SUCCESS = "Travel card was reloaded successfully";
	private final String RELOAD_FAILURE = "Travel card failed to reload";

	private CreditCard ccInUse;

	private Kiosk reloadKiosk;
	private ResponseObject response;
	TravelCard tcInUse;

	@Given("^a travel card user at a reload kiosk at station \"([^\"]*)\"$")
	public void a_travel_card_user_at_a_reload_kiosk_at_station(String stationName) {
		reloadKiosk = new Kiosk(stationName);
	}

	@Given("^his travel card has a balance of (\\d+)$")
	public void his_travel_card_has_a_balance_of(int tcBalance) {
		tcInUse = new TravelCard(tcBalance);
	}

	@Given("^his credit card \"([^\"]*)\" was successfully verified by the reload kiosk$")
	public void his_credit_card_was_successfully_verified_by_the_reload_kiosk(String ccNumber) {
		ccInUse = new CreditCard(ccNumber);
		ccInUse.setValid(true);
		reloadKiosk.setInsertedCC(ccInUse);
	}


@Given("^his credit card has enough balance to charge (\\d+)$")
public void his_credit_card_has_enough_balance_to_charge(int amount){
	ccInUse.setBalance(amount);
}

	@Given("^the reload kiosk at the station is in working order$")
	public void the_reload_kiosk_at_the_station_is_in_working_order() {
		reloadKiosk.setOrderStatus(true);
	}

	@When("^the travel card user reloads the travel card with (\\d+)$")
	public void the_travel_card_user_reloads_the_travel_card_with(int amount) {
		response = reloadKiosk.addBalance(tcInUse, amount);
	}

	@Then("^the travel card after reload has a new balance (\\d+)$")
	public void the_travel_card_after_reload_has_a_new_balance(int newBalance) {
		assertEquals(tcInUse.getBalance(), newBalance);
	}


	@Then("^the credit card is charged with (\\d+)$")
	public void the_credit_card_is_charged_with(int chargedAmount) {
		// check the charge amount
		assertEquals(ccInUse.isSuccessfullyCharged(),true);
	}

	@Then("^the reload kiosk displays a message that the travel card was reloaded successfully$")
	public void the_reload_kiosk_displays_a_message_that_the_travel_card_was_reloaded_successfully() {
		assertEquals(response.getMessage(), Constants.RELOAD_SUCCESS);
	}

	@Given("^the reload kiosk at the station is out of order$")
	public void the_reload_kiosk_at_the_station_is_out_of_order() {
		reloadKiosk.setOrderStatus(false);
	}

	@Then("^the reload kiosk displays a message that the travel card failed to reload$")
	public void the_reload_kiosk_displays_a_message_that_the_travel_card_failed_to_reload() {
		assertEquals(response.getMessage(), Constants.RELOAD_FAILURE);
	}

}