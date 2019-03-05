import static org.junit.Assert.assertEquals;

import com.employeecard.Canteen;
import com.employeecard.CanteenList;
import com.employeecard.EmployeeCardList;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateAdminReportsSteps {
	
	
	CanteenList lcanteen;
	
	
	Canteen testCanteen;
	
	
	String caName;
	
	
	EmployeeCardList lecuser;
	

	@Given("^the manager wants to know the number of employee cards being deposited and withdrawn from in all canteens$")
	public void the_manager_wants_to_know_the_number_of_employee_cards_being_deposited_and_withdrawn_from_in_all_canteens() {
		lcanteen = new CanteenList();
	}
	
	
	
	

	@When("^he generates a canteen statistics report$")
	public void he_generates_a_canteen_statistics_report() {

		lcanteen.generateCanteenStatisticsReport();
	}
	
	
	
	

	@Then("^the system produces a pdf report named as \"([^\"]*)\"$")
	public void the_system_produces_a_pdf_report_named_as(String reportName) {
		assertEquals(lcanteen.reportExists(reportName), true);
	}
	
	
	
	

	@Given("^the manager wants to see a list with the names of employees registered in the system$")
	public void the_manager_wants_to_see_a_list_with_the_names_of_employees_registered_in_the_system() {
		lecuser = new EmployeeCardList();
	}
	
	
	
	

	@When("^he generates an employee list$")
	public void he_generates_an_employee_list() {
		lecuser.generateEmployeeList();
	}
	
	
	
	

	@Then("^the system produces a text file named as \"([^\"]*)\" which contains the employee list$")
	public void the_system_produces_a_text_file_named_as_which_contains_the_employee_list(String reportName) {
		assertEquals(lecuser.reportExists(reportName), true);
	}

}
