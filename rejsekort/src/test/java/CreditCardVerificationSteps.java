import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

import ccvalidation.CreditCard;
import core.Constants;
import core.Kiosk;

public class CreditCardVerificationSteps {

	CreditCard creditCard;
	Kiosk kiosk;

	@Given("^a kiosk at station \"([^\"]*)\"$")
	public void a_kiosk_at_station(String stationName) {
		kiosk = new Kiosk(stationName);

	}

	@Given("^a credit card with number \"([^\"]*)\"$")
	public void a_credit_card_with_number(String ccnumber) {
		creditCard = new CreditCard(ccnumber);
	}

	@When("^the kiosk verifies the credit card$")
	public void the_kiosk_verifies_the_credit_card() {
		kiosk.verify(creditCard);

	}

	@Then("^the kiosk informs the customer that the provided credit card is valid$")
	public void the_kiosk_informs_the_customer_that_the_provided_credit_card_is_valid() {
		assertEquals(kiosk.getTextOnScreen(), Constants.VALID_CC);

	}

	@Then("^the kiosk informs the customer that the provided credit card is invalid$")
	public void the_kiosk_informs_the_customer_that_the_provided_credit_card_is_invalid() {
		assertEquals(kiosk.getTextOnScreen(), Constants.INVALID_CC);
	}

}
