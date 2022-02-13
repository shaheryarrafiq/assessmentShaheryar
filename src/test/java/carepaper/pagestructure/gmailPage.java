package carepaper.pagestructure;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmailPage {

	//Constructor

	public gmailPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//PageElements

	@FindBy(xpath ="//h1[@class='h4 text-gray-900 mb-4']" )
	@CacheLookup
	WebElement login_title;

	@FindBy(xpath ="//input[@id='identifierId']" )
	@CacheLookup
	WebElement email;

	@FindBy(xpath ="//span[normalize-space()='Next']" )
	@CacheLookup
	WebElement next;

	@FindBy(xpath ="//input[@name='password']" )
	@CacheLookup
	WebElement password;

	@FindBy(xpath ="//span[normalize-space()='Next']" )
	@CacheLookup
	WebElement next2;

	@FindBy(xpath ="//span[@class='bog']" )
	@CacheLookup
	List<WebElement> emailThreads;

	@FindBy(xpath ="//a[normalize-space()='Change my password']" )
	@CacheLookup
	WebElement resetbutton;









	//Methods



	public void enteremail(String Email)
	{
		email.sendKeys(Email);
	}
	public void clicknext() 
	{
		next.click();
	}
	public void enterPassword(String Password)
	{
		password.sendKeys(Password);
	}
	public void clicknext2() 
	{
		next2.click();
	}

	public void clickEmail(String Emailsubject)

	{


		for (int i = 0; i < emailThreads.size(); i++)
		{

			if (emailThreads.get(i).getText().contains(Emailsubject))
			{
				emailThreads.get(i).click();
				System.out.println("email clicked");
				break;
			}
		}

	}


	public void clickresetbutton() 
	{
		resetbutton.click();

	}




}











