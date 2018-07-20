import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateNewUser extends General{




	

@Given("^a cpr number \"([^\"]*)\"$")
public void a_cpr_number(String cpr) {
	conn.getDATABASE_CPR_NUMBERRS().contains(cpr);
	user.setCpr(cpr);
}



@Given("^a credit card number (\\d+)$")
public void a_credit_card_number(int cc_number) {
	
	user.setCcNumber(cc_number);
	userAnonymous.setCcNumber(cc_number);
	
	
}


@When("^issue$")
public void issue() {
	card = new TravelCard();
	user.setTc(card);
	responseReal = conn.exist(user.getCpr(), user.getCcNumber());
	response = travelcardusers.addUsers(user);
	response = travelcardusers.addUsers(userAnonymous);
}


@Then("^a new personal card is issued$")
public void a_new_personal_card_is_issued() {
	assertEquals(response.getErrorMessage(), "card is issued");
}

//@Then("^an error message is shown that travel card not created$")
//public void an_error_message_is_shown_that_travel_card_not_created() {
//
//	assertEquals(responseReal.getErrorMessage(), "travel card not created");
//}

@Then("^the kiosk displays a message is shown that travel card not created$")
public void the_kiosk_displays_a_message_is_shown_that_travel_card_not_created(){
	assertEquals(responseReal.getErrorMessage(), "travel card not created");
}


//@Then("^a new anonymous Travel Card is issued$")
//public void a_new_anonymous_Travel_Card_is_issued(){
//	assertEquals(response.getErrorMessage(), "card is issued");
//}

@Then("^the kiosk issues an anonymous travel card$")
public void the_kiosk_issues_an_anonymous_travel_card() {
	assertEquals(response.getErrorMessage(), "card is issued");
}
//We need to distinguish between anonymous card issued and personal card issued

@Then("^a new personal Travel Card is issued$")
public void a_new_personal_Travel_Card_is_issued(){

	assertEquals(response.getErrorMessage(), "card is issued");
}
}
