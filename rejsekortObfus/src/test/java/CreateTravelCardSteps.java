import static org.junit.Assert.assertEquals;

import com.a.aa.a;
import com.c.aa.c;
import com.c.aa.e;
import com.c.aa.f;
import com.c.aa.j;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateTravelCardSteps {
	
	j currentUser_tc;
	
	
	a ccInUse;
	
	
	e registrationKiosk;
	
	
	f response;


	
	@Given("^a customer at a registration kiosk at station \"([^\"]*)\"$")
	public void a_customer_at_a_registration_kiosk_at_station(String stationName) {
		registrationKiosk = new e(stationName);
	}
	
	
	
	

	@Given("^his credit card \"([^\"]*)\" was successfully verified by the registration kiosk$")
	public void his_credit_card_was_successfully_verified_by_the_registration_kiosk(String ccNumber) {
		ccInUse = new a(ccNumber);
		ccInUse.c(true);
		registrationKiosk.a(ccInUse);
	}
	
	
	
	

	@Given("^his credit card accepts to charge the amount of (\\d+)$")
	public void his_credit_card_accepts_to_charge_the_amount_of(int amount) {
		ccInUse.k(amount);

	}
	
	
	
	

	@Given("^his credit card declines to charge the amount of (\\d+)$")
	public void his_credit_card_declines_to_charge_the_amount_of(int amount) {
		ccInUse.k(c.cK - amount);
	}
	
	
	
	

	@Given("^a userID number \"([^\"]*)\" is not registered in the system$")
	public void a_userID_number_is_not_registered_in_the_system(String userIDnumber) {
		currentUser_tc = new j(userIDnumber);
	}

	
	
	
	
	@When("^issue a travel card$")
	public void issue_a_travel_card() {
		response = registrationKiosk.e(currentUser_tc);
	}

	
	
	
	
	@Then("^a travel card user is registered$")
	public void a_travel_card_user_is_registered() {

		assertEquals(registrationKiosk.bp().contains(currentUser_tc), true);

	}
	
	
	
	

	@Then("^the registration kiosk displays a message that a travel card is issued$")
	public void the_registration_kiosk_displays_a_message_that_a_travel_card_is_issued() {
		assertEquals(response.bt(), c.cQ);
	}

	
	
	
	
	@Given("^a userID number \"([^\"]*)\" is registered in the system$")
	public void a_userID_number_is_registered_in_the_system(String userIDnumber) {
		currentUser_tc = new j(userIDnumber);
		registrationKiosk.bp().add(currentUser_tc);
	}
	
	
	
	

	@Then("^the registration kiosk displays a message that a travel card not issued because user already registered in the system$")
	public void the_registration_kiosk_displays_a_message_that_a_travel_card_not_issued_because_user_already_registered_in_the_system() {
		assertEquals(response.bt(), c.cP);
	}

	
	
	
	
	@Then("^the registration kiosk displays a message that a travel card not issued because credit card was declined$")
	public void the_registration_kiosk_displays_a_message_that_a_travel_card_not_issued_because_credit_card_was_declined() {
		assertEquals(response.bt(), c.cJ);
	}
	
	
	
	

	@Then("^the registration kiosk posts that message on the system log$")
	public void the_registration_kiosk_posts_that_message_on_the_system_log() {
		registrationKiosk.bm();
	}

}