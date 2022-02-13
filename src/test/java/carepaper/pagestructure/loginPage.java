package carepaper.pagestructure;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	//Constructor

	public loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//PageElements

	@FindBy(xpath ="//h1[@class='h4 text-gray-900 mb-4']" )
	@CacheLookup
	WebElement login_title;

	@FindBy(xpath ="//input[@id='user_email']" )
	@CacheLookup
	WebElement user_name;

	@FindBy(xpath ="//input[@id='user_password']" )
	@CacheLookup
	WebElement pass_word;

	@FindBy(xpath ="//input[@name='commit']" )
	@CacheLookup
	WebElement btn_login;

	@FindBy(xpath ="//a[normalize-space()='Forgot your password?']" )
	@CacheLookup
	WebElement link_forgot_password;

	@FindBy(xpath ="//a[normalize-space()='Sign up']" )
	@CacheLookup
	WebElement link_sign_up;

	@FindBy(xpath ="//a[normalize-space()=\\\"Didn't receive confirmation instructions?\\\"]" )
	@CacheLookup
	WebElement link_confirmation_email;

	@FindBy(xpath ="//span[@data-notify='message']//p[@class='message'][normalize-space()='Signed out successfully.']" )
	@CacheLookup
	WebElement signout_message;

	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/span[3]/p[1]" )
	@CacheLookup
	WebElement wrongemailalert;
	//Maybe you haven't registered with this Email or using a wrong password.

	@FindBy(xpath ="//span[@data-notify='message']//p[@class='message'][normalize-space()='You need a correct password.']" )
	@CacheLookup
	WebElement wrongpasswordalert;

	@FindBy(xpath ="//span[@data-notify='message']//p[@class='message'][contains(text(),'You will receive an email with instructions on how')]" )
	@CacheLookup
	WebElement forgotpasswordalert;

	@FindBy(xpath ="//span[@data-notify='message']//p[@class='message'][normalize-space()='Your password has been changed successfully.']" )
	@CacheLookup
	WebElement changepasswordalert;


	//span[@data-notify='message']//p[@class='message'][normalize-space()='Your password has been changed successfully.']






	//Methods

	public void verify_login_title()
	{
		String actualtitle= login_title.getText();
		String expectedtitle= "Welcome Back!";
		Assert.assertEquals( actualtitle, expectedtitle);

	}

	public void enterUsername(String username)
	{
		user_name.sendKeys(username);
	}
	public void enterPassword(String password)
	{
		pass_word.sendKeys(password);
	}
	public void clicklogin() 
	{
		btn_login.click();
	}
	public void clickforgotpassword() 
	{
		link_forgot_password.click();
	}
	public void clicksignup() 
	{
		link_sign_up.click();
	}
	public void clickemailcomfirmation()
	{
		link_confirmation_email.click();
	}

	public void signoutmessage()
	{
		signout_message.isDisplayed();
	}

	public void verifywrongemailmessage()
	{
		String actualtitle= wrongemailalert.getText();
		//System.out.println(actualtitle);		
		String expectedtitle= "Maybe you haven't registered with this Email or using a wrong password.";
		Assert.assertEquals( actualtitle, expectedtitle);

	}

	public void verifywrongpasswordalert()
	{
		String actualtitle= wrongpasswordalert.getText();
		//System.out.println(actualtitle);		
		String expectedtitle= "You need a correct password.";
		Assert.assertEquals( actualtitle, expectedtitle);

	}

	public void verifyforgotpasswordmessage()
	{
		String actualtitle= forgotpasswordalert.getText();
		//System.out.println(actualtitle);		
		String expectedtitle= "You will receive an email with instructions on how to reset your password in a few minutes.";
		Assert.assertEquals( actualtitle, expectedtitle);

	}

	public void verifychangepasswordmessage()
	{
		String actualtitle= changepasswordalert.getText();
		//System.out.println(actualtitle);		
		String expectedtitle= "Your password has been changed successfully.";
		Assert.assertEquals( actualtitle, expectedtitle);

	}

}











