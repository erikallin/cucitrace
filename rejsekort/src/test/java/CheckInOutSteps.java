import static org.junit.Assert.assertEquals;

import com.travelcard.core.CheckInAutomaton;
import com.travelcard.core.CheckOutAutomaton;
import com.travelcard.core.Constants;
import com.travelcard.core.ResponseObject;
import com.travelcard.core.TravelCard;

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

	@Given("^a check-out automaton at \"([^\"]*)\"$")
	public void a_check_out_automaton_at(String stationName) {
		outAutomaton = new CheckOutAutomaton(stationName);
	}

	@When("^a travel card check-out$")
	public void a_travel_card_check_out() {
		responseCheckOutAutomaton = outAutomaton.checkOut(card);
	}

	@Then("^the travel card after check-out has a new balance (\\d+)$")
	public void the_travel_card_after_check_out_has_a_new_balance(int newBalance) {
		assertEquals(card.getBalance(), newBalance);

	}

	@Then("^the check in automaton displays a message that \"([^\"]*)\"$")
	public void the_check_in_automaton_displays_a_message_that(String msg) {
		assertEquals(responseCheckInAutomaton.getMessage(), msg);

	}

	@Then("^the check out automaton displays a message that \"([^\"]*)\"$")
	public void the_check_out_automaton_displays_a_message_that(String msg) {
		assertEquals(responseCheckOutAutomaton.getMessage(), msg);

	}
	

@Then("^the check-out automaton posts a successful message on the system log$")
public void the_check_out_automaton_posts_a_successful_message_on_the_system_log(){
 //check that the message was posted. (read the file txt and find the message)
}

}
