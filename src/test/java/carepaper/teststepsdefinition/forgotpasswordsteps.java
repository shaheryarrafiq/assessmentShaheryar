package carepaper.teststepsdefinition;

import carepaper.pagestructure.forgotpasswordPage;
import carepaper.pagestructure.gmailPage;
import carepaper.pagestructure.loginPage;
import io.cucumber.java.en.*;


public class forgotpasswordsteps {
	
	
	//loginPage login =  new loginPage(driver);
	loginPage login =  new loginPage(driverUtilities.driver);
	forgotpasswordPage forgotpassword =  new forgotpasswordPage(driverUtilities.driver);
	gmailPage gmail =  new gmailPage(driverUtilities.driver);
	driverUtilities driverutil = new  driverUtilities();
	

	@When("click on forgot password")
	public void click_on_forgot_password() throws InterruptedException {
	    login.clickforgotpassword();
	    Thread.sleep(2000);
	}

	@Then("user is on forgotpassword page")
	public void user_is_on_forgotpassword_page() throws InterruptedException {
	    forgotpassword.verify_forgot_title();
	    Thread.sleep(2000);
	}

	@When("user enter the email{string}")
	public void user_enter_the_email(String Email) throws InterruptedException {
	   forgotpassword.enterEmail(Email);
	   Thread.sleep(2000);
	}

	@When("click on reset button")
	public void click_on_reset_button() throws InterruptedException {
	    forgotpassword.clickreset();
	    Thread.sleep(2000);
	}

	@Then("user is navigated to the login page and a comfirmation message is shown")
	public void user_is_navigated_to_the_login_page_and_a_comfirmation_message_is_shown() {
	    login.verifyforgotpasswordmessage();
	}
	
	@Then("user opens the email and enter email{string} and click next and enter password{string} and click next")
	public void user_opens_the_email_and_enter_email_carepaperautomation_gmail_com_and_click_next_and_enter_password_password_carepaper_and_click_next(String email,String password) throws InterruptedException {
		driverUtilities. opengmail();
		Thread.sleep(2000);
		gmail.enteremail(email);
	    Thread.sleep(2000);
	    gmail.clicknext();
	    Thread.sleep(4000);
	    gmail.enterPassword(password);
	    Thread.sleep(2000);
	    gmail.clicknext2();
		Thread.sleep(10000);
	}
	
   
 
	@Then("user is navigated to inbox and opens the {string} mail")
	public void user_is_navigated_to_inbox_and_opens_the_mail(String emailsubject) throws InterruptedException {
		gmail.clickEmail(emailsubject);
	    Thread.sleep(10000);
	
	}
	
	@And("user click on Rest Password button")
	public void user_click_on_rest_password_button() throws InterruptedException {
	    gmail.clickresetbutton();
	    Thread.sleep(8000);
	    
	}
	
	@Then("user navigate to changepassword screen")
	public void user_navigate_to_changepassword_screen() throws InterruptedException {
		driverUtilities.switchwindow();
		forgotpassword.verify_change_title();
		 Thread.sleep(4000);
		 
	}

	@Then("user enter new password {string} and confirm new password{string}")
	public void user_enter_new_password_and_confirm_new_password(String newpw,String newpwc) throws InterruptedException {
		forgotpassword.setnewpassword(newpw);
		forgotpassword.confirmnewpassword(newpwc);
		 Thread.sleep(4000);
	}

	@Then("user click change password button")
	public void user_click_change_password_button() throws InterruptedException {
		forgotpassword.clickchangepasswordbutton();
		 Thread.sleep(4000);
	}
	
	@Then("user is navigated to login page")
	public void user_is_navigated_to_login_page() throws InterruptedException {
	   login.verify_login_title();
	   login.verifychangepasswordmessage();
	   Thread.sleep(4000);
	}
	
	@Given("User navigate back to email screen")
	public void user_navigate_back_to_email_screen() {
	    driverUtilities.switcholdwindow();
	}
}
