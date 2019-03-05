import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

import com.creditcard.CreditCard;
import com.employeecard.Constants;
import com.employeecard.ResponseObject;
import com.employeecard.SelfServiceMachine;


public class ValidateCreditCardSteps {

	CreditCard creditCard;
	
	
	SelfServiceMachine selfServiceMachine;
	
	
	ResponseObject response;
	

	@Given("^a self service machine at canteen \"([^\"]*)\"$")
	public void a_self_service_machine_at_canteen(String canteenName) {
		selfServiceMachine = new SelfServiceMachine(canteenName);
	}

	
	
	
	
	@Given("^a credit card with number \"([^\"]*)\"$")
	public void a_credit_card_with_number(String ccnumber) {
		creditCard = new CreditCard(ccnumber);
	}
	
	
	
	
	
	@When("^the self service machine validates the credit card$")
	public void the_self_service_machine_validates_the_credit_card() {
		response = selfServiceMachine.b(creditCard);

	}
	
	
	
	

	@Then("^the self service machine informs the employee that the provided credit card is valid$")
	public void the_self_service_machine_informs_the_employee_that_the_provided_credit_card_is_valid() {
		assertEquals(response.Y(), Constants.ak);

	}
	
	
	
	

	@Then("^the self service machine informs the employee that the provided credit card is invalid because it contains characters$")
	public void the_self_service_machine_informs_the_employee_that_the_provided_credit_card_is_invalid_because_it_contains_characters() {
		assertEquals(response.Y(), Constants.ac);
	}
	
	
	
	

	@Then("^the self service machine informs the employee that the provided credit card is invalid because it has too few digits$")
	public void the_self_service_machine_informs_the_employee_that_the_provided_credit_card_is_invalid_because_it_has_too_few_digits() {
		assertEquals(response.Y(), Constants.ab);
	}

	
	
	
	
	@Then("^the self service machine informs the employee that the provided credit card because it does not belong to a company provider$")
	public void the_self_service_machine_informs_the_employee_that_the_provided_credit_card_because_it_does_not_belong_to_a_company_provider() {
		assertEquals(response.Y(), Constants.aa);
	}
	

}
