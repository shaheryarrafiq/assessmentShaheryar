package carepaper.pagestructure;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class signupconfirmationPage{

	//Constructor
	public signupconfirmationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//PageElements

	@FindBy(xpath ="//h1[@class='h4 text-gray-900 mb-3']" )
	WebElement successfull_text;



	@FindBy(xpath ="//span[@data-notify='message']//p[@class='message'][contains(text(),'A message with a confirmation link has been sent t')]" )
	WebElement success_message;




	//Methods
	public void verify_dashboard_title()
	{
		String actualdashboardtitle= successfull_text.getText();
		String expecteddashboadtitle= "You have successfully signed up!";
		Assert.assertEquals("Condition true", actualdashboardtitle, expecteddashboadtitle);

	}


	public void sign_in_success_message_displayed()
	{
		success_message.isDisplayed();
	}


}











