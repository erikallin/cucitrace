//import static org.junit.Assert.assertEquals;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import databases.CPR;
//import validation.CreditCard;
//
//public class CreateTravelCard{
//	
//	private final String validCreditCardNumber = "378282246310005" ;
//	private final int pass = 1234;
//	private final String invalidCreditCardNumber = "55544a561" ;
//	TravelCardUsers tcUsersDB = new TravelCardUsers();
//	CreditCard validCC = new CreditCard();
//	CreditCard invalidCC = new CreditCard();
//	
//	ResponseObject resTcUsersDB ; 
//	
//	CPR cpr ;
//	User user; 
//	
//	@Given("^a cpr number \"([^\"]*)\"$")
//	public void a_cpr_number(String cprNumber) {
//		cpr = new CPR(cprNumber);
//		user = new User(cpr);
//		//check in database if exists its notokay / okay
//	}
//
//	@Given("^a verified credit card$")
//	public void a_verified_credit_card(){
//		validCC.setCreditCardNumber(validCreditCardNumber);
//		validCC.setCreditCardPassword(pass);
//		
//		validCC.setCreditCardNumber(invalidCreditCardNumber);
//		validCC.setCreditCardPassword(pass);
//		
//	}
//
//	@Given("^credit card verified status is true$")
//	public void credit_card_verified_status_is_true() {
//		validCC.setValid(true);
//	}
//
//	@When("^issue a personal travel card$")
//	public void issue_a_personal_travel_card() {
//		TravelCard tc = new TravelCardPersonal();
//		user.setTc(tc); 
//		resTcUsersDB = tcUsersDB.addUser(user); 		
//	}
//
//	@Then("^a new User is registered$")
//	public void a_new_User_is_registered() {
//		assertEquals(resTcUsersDB.getErrorMessage(), "New User Okay");
//	}
//
//	@Then("^the kiosk issues a new personal travel card$")
//	public void the_kiosk_issues_a_new_personal_travel_card(){
//		//assertEquals(resTcUsersDB.getErrorMessage(), "card is issued");
//	}
//	@Given("^credit card verified status is false$")
//	public void credit_card_verified_status_is_false(){
//	//	invalidCC.setValid(false);
//	}
//
//	@Then("^the kiosk displays a message is shown that travel card not created$")
//	public void the_kiosk_displays_a_message_is_shown_that_travel_card_not_created() {
//
//		//assertEquals(resTcUsersDB.getErrorMessage(), "error not generated");
//	}
//
//	
//}
////extends General{
////}
////
////
////
////
////	
////
////@Given("^a cpr number \"([^\"]*)\"$")
////public void a_cpr_number(String cpr) {
////	conn.getDATABASE_CPR_NUMBERRS().contains(cpr);
////	user.setCpr(cpr);
////}
////
////
////
////@Given("^a credit card number (\\d+)$")
////public void a_credit_card_number(int cc_number) {
////	
////	user.setCcNumber(cc_number);
////	userAnonymous.setCcNumber(cc_number);
////	
////	
////}
////
////
////@When("^issue$")
////public void issue() {
////	card = new TravelCard();
////	user.setTc(card);
////	responseReal = conn.exist(user.getCpr(), user.getCcNumber());
////	response = travelcardusers.addUsers(user);
////	response = travelcardusers.addUsers(userAnonymous);
////}
////
////
////@Then("^a new personal card is issued$")
////public void a_new_personal_card_is_issued() {
////	assertEquals(response.getErrorMessage(), "card is issued");
////}
////
//////@Then("^an error message is shown that travel card not created$")
//////public void an_error_message_is_shown_that_travel_card_not_created() {
//////
//////	assertEquals(responseReal.getErrorMessage(), "travel card not created");
//////}
////
////@Then("^the kiosk displays a message is shown that travel card not created$")
////public void the_kiosk_displays_a_message_is_shown_that_travel_card_not_created(){
////	assertEquals(responseReal.getErrorMessage(), "travel card not created");
////}
////
////
//////@Then("^a new anonymous Travel Card is issued$")
//////public void a_new_anonymous_Travel_Card_is_issued(){
//////	assertEquals(response.getErrorMessage(), "card is issued");
//////}
////
////@Then("^the kiosk issues an anonymous travel card$")
////public void the_kiosk_issues_an_anonymous_travel_card() {
////	assertEquals(response.getErrorMessage(), "card is issued");
////}
//////We need to distinguish between anonymous card issued and personal card issued
////
////@Then("^a new personal Travel Card is issued$")
////public void a_new_personal_Travel_Card_is_issued(){
////
////	assertEquals(response.getErrorMessage(), "card is issued");
////}
////}
