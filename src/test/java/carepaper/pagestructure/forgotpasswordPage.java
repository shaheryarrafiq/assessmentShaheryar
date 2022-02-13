package carepaper.pagestructure;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class forgotpasswordPage{

	//Constructor
	public forgotpasswordPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//PageElements

	@FindBy(xpath ="//h1[@class='h4 text-gray-900 mb-2']" )
	WebElement forgottitle;

	@FindBy(xpath ="//input[@id='user_email']" )
	WebElement emailfield;



	@FindBy(xpath ="//input[@name='commit']" )
	WebElement resetbutton;

	@FindBy(xpath ="//input[@id='user_password']" )
	WebElement newpassword;

	@FindBy(xpath ="//input[@id='user_password_confirmation']" )
	WebElement newpasswordconfirmation;

	@FindBy(xpath ="//h1[@class='h4 text-gray-900 mb-2']" )
	WebElement titlechangepassword;

	@FindBy(xpath ="//input[@name='commit']" )
	WebElement changepasswordbutton;


	@FindBy(xpath ="//h3[@class='card-title']" )
	WebElement profiletitle;



	//Methods

	public void verify_forgot_title()
	{
		String actualtitle= forgottitle.getText();
		System.out.println(actualtitle);
		String expectedtitle= "Forgot Your Password?";
		Assert.assertEquals("Condition true", actualtitle, expectedtitle);

	}

	public void verify_change_title()
	{
		String actualtitle= titlechangepassword.getText();
		System.out.println(actualtitle);
		String expectedtitle= "Change your password";
		Assert.assertEquals("Condition true", actualtitle, expectedtitle);

	}




	public void enterEmail(String email)
	{
		emailfield.sendKeys(email);
	}

	public void clickreset()
	{
		resetbutton.click();
	}

	public void setnewpassword(String Newpassword)
	{
		newpassword.sendKeys(Newpassword);
	}

	public void confirmnewpassword(String confirmnewpassword)
	{
		newpasswordconfirmation.sendKeys(confirmnewpassword);
	}


	public void clickchangepasswordbutton()
	{
		changepasswordbutton.click();

	}


}











