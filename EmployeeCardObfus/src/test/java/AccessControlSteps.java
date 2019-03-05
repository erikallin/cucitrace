import static org.junit.Assert.assertEquals;

import com.employeecard.AccessControl;
import com.employeecard.EmployeeCard;
import com.employeecard.ResponseObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccessControlSteps {

	EmployeeCard card = new EmployeeCard();
	  

	AccessControl accessControl;
	  

	ResponseObject responseAccessControl;

	@Given("^an employee card with an access level of (\\d+)$")
	public void an_employee_card_with_an_access_level_of(int accessLevel) {
		card.s(accessLevel);
	}

	
	
	
	
	@Given("^an access control with the ID (\\d+)$ and an access level set to (\\d+)$")
	public void an_access_control_with_ID_and_an_access_level_set_to(int accessLevelRequired, int accessControlID) {
		accessControl = new AccessControl(accessLevelRequired, accessControlID);
	}
	
	
	
	

	@Given("^an employee card with in use status is (true|false)$")
	public void an_employee_card_with_in_use_status_is_false(boolean inUseStatus) {
		card.e(inUseStatus);
	}
	
	
	
	

	@When("^an employee card is set to in use and is used at the access control")
	public void an_employee_card_is_set_to_in_use_and_is_used_at_the_access_control() {
		responseAccessControl = accessControl.b(card);
	}

	
	
	
	
	@Then("^the employee card is allowed access")
	public void the_employee_card_is_allowed_access(boolean accessGranted) {
		assertEquals(accessControl.b(card), accessGranted);
	}





	@Then("^the access control displays a message that \"([^\"]*)\"$")
	public void the_access_control_displays_a_message_that(String msg) {
		assertEquals(responseAccessControl.Y(), msg);
	}




	
	@Then("^the access control posts that message in the system log$")
	public void the_access_control_posts_that_message_in_the_system_log() {
		accessControl.C();
	}
	


}
