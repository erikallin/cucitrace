import static org.junit.Assert.assertEquals;

import com.creditcard.CreditCard;
import com.employeecard.Constants;
import com.employeecard.EmployeeCard;
import com.employeecard.ResponseObject;
import com.employeecard.SelfServiceMachine;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ActivateEmployeeCardForPurchasesSteps {
	
	EmployeeCard currentUser_ec;
	
	CreditCard ccInUse;
	
	SelfServiceMachine selfServiceMachine;
	
	ResponseObject response;

	
	@Given("^an employee at a self service machine at canteen \"([^\"]*)\"$")
	public void an_employee_at_a_self_service_machine_at_canteen(String canteenName) {
		selfServiceMachine = new SelfServiceMachine(canteenName);
	}
	
	
	
	

	@Given("^his credit card \"([^\"]*)\" was successfully verified by the self service machine$")
	public void his_credit_card_was_successfully_verified_by_the_self_service_machine(String ccNumber) {
		ccInUse = new CreditCard(ccNumber);
		ccInUse.d(true);
		selfServiceMachine.a(ccInUse);
	}
	
	
	
	

	@Given("^his credit card accepts to charge the amount of (\\d+)$")
	public void his_credit_card_accepts_to_charge_the_amount_of(int amount) {
		ccInUse.j(amount);
	}
	
	
	
	

	@Given("^his credit card declines to charge the amount of (\\d+)$")
	public void his_credit_card_declines_to_charge_the_amount_of(int amount) {
		ccInUse.j(Constants.ae - amount);
	}
	
	
	
	

	@Given("^an employeeID \"([^\"]*)\" is not registered in the system$")
	public void an_employeeID_is_not_registered_in_the_system(String employeeID) {
		currentUser_ec = new EmployeeCard(employeeID);
	}

	
	
	
	
	@When("^activate purchases on an employee card$")
	public void activate_purchases_on_an_employee_card() {
		response = selfServiceMachine.c(currentUser_ec);
	}

	
	
	
	
	@Then("^an employee card is registered for purchases$")
	public void an_employee_card_user_is_registered_for_purchases() {
		assertEquals(selfServiceMachine.ab().contains(currentUser_ec), true);
	}
	
	
	
	

	@Then("^the self service machine displays a message that an employee card is activated for purchases$")
	public void the_self_service_machine_displays_a_message_that_an_employee_card_is_activated_for_purchases() {
		assertEquals(response.Y(), Constants.aj);
	}

	
	
	
	
	@Given("^an employeeID \"([^\"]*)\" is registered in the system$")
	public void an_employeeID_is_registered_in_the_system(String employeeID) {
		currentUser_ec = new EmployeeCard(employeeID);
		selfServiceMachine.ab().add(currentUser_ec);
	}
	
	
	
	

	@Then("^the self service machine displays a message that an employee card is not registered for purchases because user already registered in the system$")
	public void the_self_service_machine_displays_a_message_that_an_employee_card_is_not_registered_for_purchases_because_user_already_registered_in_the_system() {
		assertEquals(response.Y(), Constants.ai);
	}

	
	
	
	
	@Then("^the self service machine displays a message that an employee card is not registered for purchases because credit card was declined$")
	public void the_self_service_machine_displays_a_message_that_an_employee_card_not_registered_for_purchases_because_credit_card_was_declined() {
		assertEquals(response.Y(), Constants.ad);
	}
	
	
	
	

	@Then("^the self service machine posts that message on the system log$")
	public void the_self_service_machine_posts_that_message_on_the_system_log() {
		selfServiceMachine.Z();
	}

}