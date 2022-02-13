package carepaper.pagestructure;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class dashboardPage{

	//Constructor

	protected WebDriver driver;
	public dashboardPage(WebDriver driver)
	{
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this);


	}

	//PageElements

	@FindBy(xpath ="//h2[@class='title']" )
	WebElement title_dashboard;


	@FindBy(xpath ="//p[normalize-space()='Dashboard']" )
	WebElement txt_dashboard;

	@FindBy(xpath ="//span[@data-notify='message']//p[@class='message'][normalize-space()='Signed in successfully.']" )
	WebElement success_message;
	//span[@data-notify='message']//p[@class='message'][normalize-space()='Signed in successfully.']

	@FindBy(xpath= "//a[@id='navbarDropdownMenuLink']")
	WebElement navdropdown;
	@FindBy(xpath= "//a[@class='dropdown-item'][normalize-space()='Logout']")
	WebElement btn_logout;

	//Methods

	public void verify_dashboard_title()
	{
		String actualdashboardtitle= title_dashboard.getText();
		String expecteddashboadtitle= "My Dashboard";
		Assert.assertEquals("Condition true", actualdashboardtitle, expecteddashboadtitle);

	}

	public void dashboarddisplayed()
	{
		txt_dashboard.isDisplayed();
	}

	public void sign_in_success_message_displayed()
	{
		success_message.isDisplayed();
	}
	public void click_drop_down()
	{
		navdropdown.click();
	}
	public void click_logout()
	{
		btn_logout.click();
	}





}











