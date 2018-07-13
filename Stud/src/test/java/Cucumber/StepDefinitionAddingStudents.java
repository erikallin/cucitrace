package Cucumber;
import static org.junit.Assert.assertEquals;

import app.model.DTUStudent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionAddingStudents extends regist{
	
	
	
	//Add Student
	@Given("^an administrator wants to add a student with first name \"([^\"]*)\", last name \"([^\"]*)\", and cpr \"([^\"]*)\" to the system$")
	public void an_administrator_wants_to_add_a_student_with_first_name_last_name_and_cpr_to_the_system(String firstName, String lastName, String cpr) {
		student = new DTUStudent(firstName, lastName, cpr);
	}
	
	
	@And("^the student existance status is false$")
	public void the_student_existance_status_is_false() {
	    assertEquals(reg.userExists(student), false);
	}
	
	@And("^the student existance status is true$")
	public void the_student_existance_status_is_true() {
		assertEquals(reg.userExists(student), true);
	}
	
	@When("^sign-up$")
	public void sign_up() {
		reg.signUp(student);
	}
	
	@Then("^the student is added to the system$")
	public void the_student_is_added_to_the_system() {
		assertEquals(reg.userExists(student),true);
	}
	
	
	@Then("^the administrator will be presented with an error message that the user is already in the system$")
	public void the_administrator_will_be_presented_with_an_error_message_that_the_user_is_already_in_the_system() {
		reg.signUp(student);
	}
}
