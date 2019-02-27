import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

import com.a.a.a;
import com.c.a.c;
import com.c.a.e;
import com.c.a.f;

public class CreditCardVerificationSteps {

	a creditCard;
	
	
	e kiosk;
	
	
	f response;
	

	@Given("^a kiosk at station \"([^\"]*)\"$")
	public void a_kiosk_at_station(String stationName) {
		kiosk = new e(stationName);

	}

	
	
	
	
	@Given("^a credit card with number \"([^\"]*)\"$")
	public void a_credit_card_with_number(String ccnumber) {
		creditCard = new a(ccnumber);
	}
	
	
	
	
	
	@When("^the kiosk verifies the credit card$")
	public void the_kiosk_verifies_the_credit_card() {
		response = kiosk.b(creditCard);

	}
	
	
	
	

	@Then("^the kiosk informs the user that the provided credit card is valid$")
	public void the_kiosk_informs_the_user_that_the_provided_credit_card_is_valid() {
		assertEquals(response.bt(), c.cR);

	}
	
	
	
	

	@Then("^the kiosk informs the user that the provided credit card is invalid because it contains characters$")
	public void the_kiosk_informs_the_user_that_the_provided_credit_card_is_invalid_because_it_contains_characters() {
		assertEquals(response.bt(), c.cI);
	}
	
	
	
	

	@Then("^the kiosk informs the user that the provided credit card is invalid because it has too few digits$")
	public void the_kiosk_informs_the_user_that_the_provided_credit_card_is_invalid_because_it_has_too_few_digits() {
		assertEquals(response.bt(), c.cH);
	}

	
	
	
	
	@Then("^the kiosk informs the user that the provided credit card because it does not belong to a company provider$")
	public void the_kiosk_informs_the_user_that_the_provided_credit_card_because_it_does_not_belong_to_a_company_provider() {
		assertEquals(response.bt(), c.cG);
	}
	

}
