package carepaper.teststepsdefinition;



import carepaper.pagestructure.dashboardPage;
import carepaper.pagestructure.loginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dashboardsteps {
	
	loginPage login =  new loginPage(driverUtilities.driver);
	dashboardPage dashboard =  new dashboardPage(driverUtilities.driver);
	
	@When("user open the dropdown")
	public void user_open_the_dropdown() throws InterruptedException {
	   dashboard.click_drop_down();
		Thread.sleep(2000);

	}

	@When("user click on Logout")
	public void user_click_on_logout() throws InterruptedException {
	   dashboard.click_logout();
		Thread.sleep(4000);

	}

	@Then("user is able to logout sucessfully")
	public void user_is_able_to_logout_sucessfully() throws InterruptedException {
	    login.signoutmessage();
		Thread.sleep(2000);

	}

}
