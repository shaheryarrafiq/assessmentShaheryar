package carepaper.teststepsdefinition;

import carepaper.pagestructure.dashboardPage;
import carepaper.pagestructure.loginPage;
import io.cucumber.java.en.*;


public class loginsteps {
	
	
	//loginPage login =  new loginPage(driver);
	loginPage login =  new loginPage(driverUtilities.driver);
	dashboardPage dashboard =  new dashboardPage(driverUtilities.driver);
	

	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		
		login.verify_login_title();
		Thread.sleep(2000);

	}
	@When("user enter the email {string} and password {string}")
	public void user_enter_the_email_and_password(String username,String password ) throws InterruptedException {
		login.enterUsername(username);
		login.enterPassword(password);
		Thread.sleep(2000);
	}

	@And("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		login.clicklogin();
		Thread.sleep(4000);

	}
	

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		dashboard.verify_dashboard_title();
		dashboard.dashboarddisplayed();
		//dashboard.sign_in_success_message_displayed();

		Thread.sleep(2000);
	}
	
	@Then("user should see a wrong email message")
	public void user_should_see_a_wrong_email_message() throws InterruptedException {
		login.verifywrongemailmessage();

		Thread.sleep(2000);

	}
	@Then("user should see a wrong password message")
	public void user_should_see_a_wrong_password_message() throws InterruptedException {
		login.verifywrongpasswordalert();

		Thread.sleep(2000);

	}
	
	
}
