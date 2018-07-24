import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

import ccvalidation.CreditCard;

public class CreditCardVerifierSteps {

	CreditCard creditCard;
	Kiosk kiosk;

	@Given("^a kiosk at station \"([^\"]*)\"$")
	public void a_kiosk_at_station(String stationName) {
		kiosk = new Kiosk(stationName);

	}

	@Given("^a customer inserts a credit card to the kiosk with number \"([^\"]*)\"$")
	public void a_customer_inserts_a_credit_card_to_the_kiosk_with_number(String ccnumber) {
		creditCard = new CreditCard(ccnumber);
	}

	@When("^the kiosk verifies the credit card$")
	public void the_kiosk_verifies_the_credit_card() {
		kiosk.verify(creditCard);

	}

	@Then("^the kiosk informs the customer that the provided credit card is valid$")
	public void the_kiosk_informs_the_customer_that_the_provided_credit_card_is_valid() {
		assertEquals(kiosk.getTextOnScreen(), "credit card is valid");

	}

	@Then("^the kiosk informs the customer that the provided credit card is invalid$")
	public void the_kiosk_informs_the_customer_that_the_provided_credit_card_is_invalid() {
		assertEquals(kiosk.getTextOnScreen(), "credit card is invalid");
	}

}
