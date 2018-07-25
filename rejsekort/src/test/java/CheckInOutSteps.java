import static org.junit.Assert.assertEquals;

import core.CheckInAutomaton;
import core.CheckOutAutomaton;
import core.Constants;
import core.ResponseObject;
import core.TravelCard;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckInOutSteps {

	TravelCard card = new TravelCard();
	CheckInAutomaton inAutomaton;
	CheckOutAutomaton outAutomaton;
	ResponseObject responseCheckInAutomaton;

	ResponseObject responseCheckOutAutomaton;

	@Given("^a travel card with a balance of (\\d+)$")
	public void a_travel_card_with_a_balance_of(int balance) {
		card.setBalance(balance);
	}

	@Given("^a check-in automaton at \"([^\"]*)\"$")
	public void a_check_in_automaton_at(String stationName) {
		inAutomaton = new CheckInAutomaton(stationName);
	}

	@Given("^a travel card with check-in status is (true|false)$")
	public void a_travel_card_with_check_in_status_is_false(boolean isCheckedIn) {
		card.setCheckedInStatus(isCheckedIn);
	}

	@When("^Check-in$")
	public void check_in() {
		responseCheckInAutomaton = inAutomaton.checkIn(card);
	}

	@Then("^the automaton displays a message that the travel card is checked-in$")
	public void the_automaton_displays_a_message_that_the_travel_card_is_checked_in() {
		assertEquals(responseCheckInAutomaton.getMessage(), Constants.CHECKED_IN_SUCCESS);
	}

	@Then("^the automaton displays a message that the travel card is already checked-in$")
	public void the_automaton_displays_a_message_that_the_travel_card_is_already_checked_in() {

		assertEquals(responseCheckInAutomaton.getMessage(), Constants.CHECKED_IN_FAILURE_ALREADY);
	}

	@Then("^the automaton displays a message that the balance of the travel card is too low$")
	public void the_automaton_displays_a_message_that_the_balance_of_the_travel_card_is_too_low() {
		assertEquals(responseCheckInAutomaton.getMessage(), Constants.CHECKED_IN_FAILURE_LOW_BALANCE);
	}

	@Given("^a check-out automaton at \"([^\"]*)\"$")
	public void a_check_out_automaton_at(String stationName) {
		outAutomaton = new CheckOutAutomaton(stationName);
	}

	@When("^a travel card check-out$")
	public void a_travel_card_check_out() {
		responseCheckOutAutomaton = outAutomaton.checkOut(card);
	}

	@Then("^the automaton displays a message that the travel card is successfully checked-out$")
	public void the_automaton_displays_a_message_that_the_travel_card_is_successfully_checked_out() {
		assertEquals(responseCheckOutAutomaton.getMessage(), Constants.CHECKED_OUT_SUCCESS);
	}

	@Then("^the travel card after check-out has a new balance (\\d+)$")
	public void the_travel_card_after_check_out_has_a_new_balance(int newBalance) {
		assertEquals(card.getBalance(), newBalance);
	}

	@Then("^the automaton displays a message that the travel card is not checked-in$")
	public void the_automaton_displays_a_message_that_the_travel_card_is_not_checked_in() {
		assertEquals(responseCheckOutAutomaton.getMessage(), Constants.CHECKED_OUT_FAILURE);
	}

	// @Then("^automaton displays a message that the card is not checked-in$")
	// public void
	// automaton_displays_a_message_that_the_card_is_not_checked_in() {
	// assertEquals(response.getErrorMessage(), "Not checked-in");
	// }

	//
	// @Given("^check-in on a bus$")
	// public void check_in_on_a_bus() {
	// response = inStation.checkIn(card,true);
	//
	// }
	//

}
