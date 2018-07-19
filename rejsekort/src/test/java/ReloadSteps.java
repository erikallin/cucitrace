import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReloadSteps extends General {
	
	@Given("^automaton in service is (true|false)$")
	public void automaton_in_service_is_true(boolean isInService) {
		automaton.setInService(isInService);
	}



//	Something is amiss here as well. Indi
	@When("^a user reloads with (\\d+)$")
	public void a_user_reloads_with(int amount) {
//	response = automaton.isInService();
	   response= card.addBalance(amount, automaton);
	}


	
	@Then("^the automaton displays message that reload succeeded$")
	public void the_automaton_displays_message_that_reload_succeeded(){
		assertEquals(response.getErrorMessage(), "reload succeeded");
	}

	@Then("^the automaton displays message that reload failed$")
	public void the_automaton_displays_message_that_reload_failed() {
		assertEquals(response.getErrorMessage(), "reload failed");
	}



}
