package Cucumber;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import app.model.LogIn;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionLoginStudent extends regist {

	LogIn login = new LogIn();

	String sId;
	String sPassword;
	
	@Given("^a student tries to login to the system with student ID \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void a_student_tries_to_login_to_the_system_with_student_id_and_password(String studentId, String password) {
		this.sId = studentId;
		this.sPassword = password;
	}
	@Given("^the user with student ID \"([^\"]*)\" and password \"([^\"]*)\" has correct credentials$")
	public void the_user_with_student_ID_and_password_has_correct_credentials(String studentId, String password) {
		
		assertTrue(login.correctCredentials(studentId, password, reg));
	}

	@Given("^the user with student ID \"([^\"]*)\" and password \"([^\"]*)\" does not have  correct credentials$")
	public void the_user_with_student_ID_and_password_does_not_have_correct_credentials(String studentId, String password) {
		
		assertFalse(login.correctCredentials(studentId, password, reg));
	}

	@Then("^the user will be presented an error message that the student ID or password is wrong$")
	public void the_user_will_be_presented_an_error_message_that_the_student_ID_or_password_is_wrong(){
	}
	
	

	@When("^logging in to the system$")
	public void logging_in_to_the_system() {
		//More of controller
	}

	@Then("^the user will be logged in the system$")
	public void the_user_will_be_logged_in_the_system() {
		//More of controller
	}

	@Then("^the user will be redirected to the main page$")
	public void the_user_will_be_redirected_to_the_main_page() {
		//More of controller
	}



	@Then("^the user will not be logged in the system$")
	public void the_user_will_not_be_logged_in_the_system() {
		//More of controller
	}

	@Then("^the user will be presented an error message, that the student ID or password is wrong$")
	public void the_user_will_be_presented_an_error_message_that_the_student_id_or_password_is_wrong() {
		//More of view
		
	}
	
	
}
