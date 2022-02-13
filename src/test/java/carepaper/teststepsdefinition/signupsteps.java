package carepaper.teststepsdefinition;

import carepaper.pagestructure.loginPage;
import carepaper.pagestructure.signupPage;
import carepaper.pagestructure.signupconfirmationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signupsteps {

	loginPage login =  new loginPage(driverUtilities.driver);
	signupPage signup = new signupPage(driverUtilities.driver);
	signupconfirmationPage signupc = new signupconfirmationPage(driverUtilities.driver);


	@When("user Click on Signup")
	public void user_click_on_signup() throws InterruptedException {
		login.clicksignup();
		Thread.sleep(2000);

	}
	
	@Then("User is Navigated to the registration page")
	public void user_is_navigated_to_the_registration_page() throws InterruptedException {
		signup.verify_signup_title();
		Thread.sleep(2000);
	}

	@When("user enter the  firstname{string},lastname{string},mobile{string},email{string},password{string} and confirmpassword{string}")
	public void user_enter_the_firstname_lastname_mobile_email_password_and_confirmpassword(String firstname,String lastname,String mobile,String email,String password,String confirmpassword) throws InterruptedException {
		signup.setfirstname(firstname);
		signup.setlastname(lastname);
		signup.setmobile(mobile);
		signup.setemail(email);
		signup.enterPassword(password);
		signup.enter_cPassword(confirmpassword);

		Thread.sleep(2000);
	}

	@When("user click on Signup button")
	public void user_click_on_signup_button() throws InterruptedException {
		signup.clicksignup();
		Thread.sleep(2000);

	}

	@Then("user is navigated to the confirmation page")
	public void user_is_navigated_to_the_confirmation_page() throws InterruptedException {
		signupc.sign_in_success_message_displayed();
		signupc.verify_dashboard_title();
		Thread.sleep(2000);

	}
	
	
	@When("user enter  the  firstname{string},lastname{string},mobile{string},already used email{string},password{string} and confirmpassword{string}")
	public void user_enter_the_firstname_lastname_mobile_already_used_email_password_and_confirmpassword(String firstname1,String lastname1,String mobile1,String email1,String password1,String confirmpassword1) throws InterruptedException {
		signup.setfirstname(firstname1);
		signup.setlastname(lastname1);
		signup.setmobile(mobile1);
		signup.setalreadyusedemail(email1);
		signup.enterPassword(password1);
		signup.enter_cPassword(confirmpassword1);

		Thread.sleep(2000);
	}
	@Then("user should not be able to signup and see validations")
	public void user_should_not_be_able_to_signup_and_see_validations() throws InterruptedException {

		signup.verifyalreadyusedemailmessage();
		signup.verifyshortpasswordmessage();
		signup.verifynotmatchedpasswrodmessage();
		signup.verifyinvalidnumbermessage();
	}

}