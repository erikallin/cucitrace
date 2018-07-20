import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReloadSteps extends General {
	
//	@Given("^automaton in service is (true|false)$")
//	public void automaton_in_service_is_true(boolean isInService) {
//		automaton.setInService(isInService);
//	}




	@When("^a user reloads with (\\d+)$")
	public void a_user_reloads_with(int amount) {
//	response = automaton.isInService();
	   response= card.addBalance(amount, automaton);
	}


	
//	@Then("^the automaton displays message that reload succeeded$")
//	public void the_automaton_displays_message_that_reload_succeeded(){
//		assertEquals(response.getErrorMessage(), "reload succeeded");
//	}

//	@Then("^the automaton displays message that reload failed$")
//	public void the_automaton_displays_message_that_reload_failed() {
//		assertEquals(response.getErrorMessage(), "reload failed");
//	}


	
	@Given("^kiosk in service is (true|false)$")
	public void kiosk_in_service_is_true(boolean isInService) {
		automaton.setInService(isInService);
	}

	@Then("^the kiosk displays message that reload succeeded$")
	public void the_kiosk_displays_message_that_reload_succeeded() {
		assertEquals(response.getErrorMessage(), "reload succeeded");
	}

	@Given("^kiosk in service is false$")
	public void kiosk_in_service_is_false() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the kiosk displays message that reload failed$")
	public void the_kiosk_displays_message_that_reload_failed() {
		assertEquals(response.getErrorMessage(), "reload failed");
	}



}
