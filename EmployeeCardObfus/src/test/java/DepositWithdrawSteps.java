import static org.junit.Assert.assertEquals;

import com.employeecard.DepositToEmployeeCard;
import com.employeecard.EmployeeCard;
import com.employeecard.ResponseObject;
import com.employeecard.WithdrawFromEmployeeCard;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DepositWithdrawSteps {

	EmployeeCard card = new EmployeeCard();
  

	DepositToEmployeeCard depositSelfService;
  

	WithdrawFromEmployeeCard withdrawSelfService;
  

	ResponseObject responseDepositMoneySelfService;
  

	ResponseObject responseWithdrawMoneySelfService;


	@Given("^an employee card with a balance of (\\d+)$")
	public void an_employee_card_with_a_balance_of(int balance) {
		card.j(balance);
	}

	
	
	
	
	@Given("^a self-service machine for depositing at \"([^\"]*)\"$")
	public void a_self_service_machine_for_depositing_at(String canteenName) {
		depositSelfService = new DepositToEmployeeCard(canteenName);
	}
	
	
	
	

	@Given("^an employee card with in use status is (true|false)$")
	public void an_employee_card_with_in_use_status_is_false(boolean inUseStatus) {
		card.e(inUseStatus);
	}
	
	
	
	

	@When("^an employee card is set to in use and is deposited with a balance of (\\d+)$")
	public void an_employee_card_is_set_to_in_use_and_is_deposited_with_a_balance_of(int amount) {
		responseDepositMoneySelfService = depositSelfService.a(card, amount);
	}

	
	
	
	
	@Then("^the employee card after a deposit has a new balance (\\d+)$")
	public void the_employee_card_after_a_deposit_has_a_new_balance(int newBalance) {
		assertEquals(card.u(), newBalance);
	}
	
	
	
	
	
	@Given("^a self-service machine for withdrawing at \"([^\"]*)\"$")
	public void a_withdrawing_self_service_machine_at(String canteenName) {
		withdrawSelfService = new WithdrawFromEmployeeCard(canteenName);
	}
	
	
	
	

	@When("^an employee card is set to in use and is withdrawn with a balance of (\\d+)$")
	public void an_employee_card_is_set_to_in_use_and_is_withdrawn_with_a_balance_of(int amount) {
		responseWithdrawMoneySelfService = withdrawSelfService.c(card, amount);
	}

	
	
	
	
	@Then("^the employee card after a withdrawal has a new balance (\\d+)$")
	public void the_employee_card_after_a_withdrawal_has_a_new_balance(int newBalance) {
		assertEquals(card.u(), newBalance);

	}

	
	
	
	
	@Then("^the depositing self-service machine displays a message that \"([^\"]*)\"$")
	public void the_depositing_self_service_machine_displays_a_message_that(String msg) {
		assertEquals(responseDepositMoneySelfService.Y(), msg);
	}
	
	
	
	

	@Then("^the withdrawing self-service machine displays a message that \"([^\"]*)\"$")
	public void the_withdrawing_self_service_machine_displays_a_message_that(String msg) {
		assertEquals(responseWithdrawMoneySelfService.Y(), msg);

	}
	
	
	
	

	@Then("^the depositing self-service machine posts that message in the system log$")
	public void the_depositing_self_service_machine_posts_that_message_in_the_system_log() {
		depositSelfService.R();
	}
	
	
	
	

	@Then("^the withdrawing self-service machine posts that message in the system log$")
	public void the_withdrawing_self_service_machine_posts_that_message_in_the_system_log(){
		withdrawSelfService.ag();
	}


}
