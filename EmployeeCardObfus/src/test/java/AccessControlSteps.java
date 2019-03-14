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

	
	
	
	
	@Given("^an employee card which has the in use status (true|false)$")
	public void an_employee_card_which_has_the_in_use_status_false(boolean inUseStatus) {
		card.e(inUseStatus);
	}
	
	
	
	
	
	@Given("^an access control with the ID (\\d+) and a required access level set to (\\d+)$")
	public void an_access_control_with_ID_and_a_required_access_level_set_to(int accessLevelRequired, int accessControlID) {
		accessControl = new AccessControl(accessLevelRequired, accessControlID);
	}
	
	
		
	
	
	@When("^an employee card is set to in use and is used at the access control")
	public void an_employee_card_is_set_to_in_use_and_is_used_at_the_access_control() {
		responseAccessControl = accessControl.b(card);
	}

	
	
	
	
	@Then("^the employee card is allowed access")
	public void the_employee_card_is_allowed_access() {
		assertEquals(responseAccessControl.Y(), "employee card account have access through this access control");
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
