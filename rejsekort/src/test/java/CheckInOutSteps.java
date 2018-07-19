import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckInOutSteps extends General {


	@Given("^a travel card with a balance of (\\d+)$")
	public void a_travel_card_with_a_balance_of(int balance) {

		card.setBalance(balance);

	}

	@Given("^check-in status is (true|false)$")
	public void check_in_status_is_false(boolean isCheckedIn) {
		// Write code here that turns the phrase above into concrete actions
		card.setCheckedIn(isCheckedIn);
	}

	@Given("^a check-in automaton at \"([^\"]*)\"$")
	public void a_check_in_automaton_at(String station) {
		// Write code here that turns the phrase above into concrete actions
		inStation = new CheckInStation(station);
	}

	@When("^Check-in$")
	public void check_in() {
		// Write code here that turns the phrase above into concrete actions
		response = inStation.checkIn(card, false);
	}

	@Then("^the automaton displays message that the card is checked-in$")
	public void the_automaton_displays_message_that_the_card_is_checked_in() {
		// Write code here that turns the phrase above into concrete actions
		assertEquals(response.getErrorMessage(), "Checked In");
	}

	@Then("^the automaton displays message that the card is already checked-in$")
	public void the_automaton_displays_message_that_the_card_is_already_checked_in() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		assertEquals(response.getErrorMessage(), "Already Checked In");
	}

	@Then("^the automaton displays message that the balance is too low$")
	public void the_automaton_displays_message_that_the_balance_is_too_low() throws Throwable {
		assertEquals(response.getErrorMessage(), "Balance too low");
	}

	@Given("^a check-out automaton at \"([^\"]*)\"$")
	public void a_check_out_automaton_at(String arg1) {
		outStation = new CheckOutStation(arg1);
	}

	@When("^a check-out$")
	public void a_check_out() {
		response = outStation.checkOut(card);
	}

	@Then("^automaton displays message that the card is checked-out$")
	public void automaton_displays_message_that_the_card_is_checked_out() {
		assertEquals(response.getErrorMessage(), "checked-out");
	}

	@Then("^automaton displays message that the card is not checked-in$")
	public void automaton_displays_message_that_the_card_is_not_checked_in() {
		assertEquals(response.getErrorMessage(), "Not checked-in");
	}

	@Then("^travel card has a new balance (\\d+)$")
	public void travel_card_has_a_new_balance(int balance) {
		assertEquals(card.getBalance(), balance);
	}

@Given("^check-in on a bus$")
public void check_in_on_a_bus() {
	response = inStation.checkIn(card,true );
	
}


}
