package carepaper.pagestructure;

import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signupPage {
	protected WebDriver driver;

	//Constructor

	public signupPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//PageElements

	@FindBy(xpath ="//h1[@class='h4 text-gray-900 mb-4']" )
	WebElement signup_title;

	@FindBy(xpath ="//input[@id='user_first_name']" )
	WebElement first_name;

	@FindBy(xpath ="//input[@id='user_last_name']" )
	WebElement last_name;

	@FindBy(xpath ="//input[@id='user_mobile']" )
	WebElement mobile;
	@FindBy(xpath ="//input[@id='user_email']" )
	WebElement email;

	@FindBy(xpath ="//input[@id='user_password']" )
	WebElement password;

	@FindBy(xpath ="//input[@id='user_password_confirmation']" )
	WebElement confirm_password;

	@FindBy(xpath ="//input[@name='commit']" )
	WebElement btn_signup;

	@FindBy(xpath ="//a[normalize-space()='Log in']" )
	WebElement link_login;

	@FindBy(xpath ="//a[normalize-space()=\\\"Didn't receive confirmation instructions?\\\"]" )
	WebElement link_confirmation_email;

	@FindBy(xpath ="//p[normalize-space()='Email has already been taken']" )
	WebElement alreadyusedemail;

	@FindBy(xpath ="//p[normalize-space()='Password is too short (minimum is 6 characters)']" )
	WebElement shortpassword;

	@FindBy(xpath ="//p[normalize-space()=\"Password confirmation doesn't match Password\"]" )
	WebElement notmatchedpasswrod;

	@FindBy(xpath ="//p[normalize-space()='Mobile only allows numbers']" )
	WebElement invalidnumber;





	//Methods
	public void verify_signup_title()
	{
		String actualtitle= signup_title.getText();
		String expectedtitle= "Registration Form";
		Assert.assertEquals( actualtitle, expectedtitle);

	}
	public void setfirstname(String firstname)
	{
		first_name.sendKeys(firstname);
	}

	public void setlastname(String lastname)
	{
		last_name.sendKeys(lastname);
	}

	public void setmobile(String mobilenumber)
	{
		mobile.sendKeys(mobilenumber);
	}

	public void setemail(String Email)
	{
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(100000);  
		email.sendKeys(Email+ randomInt +"@gmail.com");  
	}
	public void setalreadyusedemail(String Email1)
	{

		email.sendKeys(Email1);  
	}
	public void enterPassword(String password1)
	{
		password.sendKeys(password1);
	}

	public void enter_cPassword(String password2)
	{
		confirm_password.sendKeys(password2);
	}
	public void clicksignup() 
	{
		btn_signup.click();
	}
	public void clicklogin() 
	{
		link_login.click();
	}
	public void clickemailcomfirmation()
	{
		link_confirmation_email.click();
	}

	public void verifyalreadyusedemailmessage()
	{
		alreadyusedemail.isDisplayed();
	}

	public void verifyshortpasswordmessage()
	{
		shortpassword.isDisplayed();
	}

	public void verifynotmatchedpasswrodmessage()
	{
		notmatchedpasswrod.isDisplayed();
	}

	public void verifyinvalidnumbermessage()
	{
		invalidnumber.isDisplayed();
	}





}











