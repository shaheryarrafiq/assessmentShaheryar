package pagestructure;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

	//Web PageElements
	//@tc1
	@FindBy(xpath ="//input[@id='search_query_top']" )
	WebElement searchfield;


	@FindBy(xpath ="//button[@name='submit_search']" )
	WebElement searchbutton;
	
	//@tc2
	
	@FindBy(xpath ="//a[@title='Women']" )
	WebElement women;
	
	//@tc3
	@FindBy(xpath ="//a[@class='homefeatured']" )
	WebElement popular;
	
	@FindBy(xpath ="//div[@class='right-block']//a[@title= 'Add to cart']" )
	//@FindBy(css ="a[href*='id_product=7']" 
	WebElement addtocartbutton;
	
	@FindBy(xpath ="//div[@class='clearfix']" )
	WebElement addtocartwindow;
	
	@FindBy(xpath ="//span[@title='Close window']" )
	WebElement closeicon;
	
	@FindBy(xpath ="//span[normalize-space()='Proceed to checkout']" )
	WebElement proceed;
	
	
	
	public WebElement product(String item)
	{
		
	    return driver.findElement(By.xpath("//div[@class='right-block']//a[@title= '"+item+"']"));
	}
	
	
	

	//Methods

	public void verify_dashboard_URL()
	{
		String actualdashboardURL=  driver.getCurrentUrl();
		String expecteddashboadURL= "http://automationpractice.com/index.php";
		Assert.assertEquals("Condition true", actualdashboardURL,expecteddashboadURL);

	}

	public void entersearchitem(String item)
	{
		searchfield.sendKeys(item);
	}

	public void clicksearch()
	{
		searchbutton.click();
	}
	
	public void clickwomen()
	{
		women.click();
	}
	
	public void clickpopular()
	{
		popular.click();
	}
	
	public void hoveritem(String item) {
		
		Actions action = new Actions(driver);
		
    	//action.moveToElement(product(item)).perform();
		action.moveToElement(product(item)).moveToElement(addtocartbutton).click().build().perform();
	}
	
	public void additem()
	{
		addtocartbutton.click();
	}
	
	public void verifywindow()
	{
		addtocartwindow.isDisplayed();
	}
	
	public void closewindow()
	{
		
		closeicon.click();
	}
	
	public void proceed()
	{
		
proceed.click();
	}


}








