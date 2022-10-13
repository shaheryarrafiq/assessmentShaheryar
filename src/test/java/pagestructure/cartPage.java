package pagestructure;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class cartPage{

	//Constructor

	protected WebDriver driver;
	public cartPage(WebDriver driver)
	{
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this);


	}

	//Web PageElements

	@FindBy(xpath ="//span[@id='summary_products_quantity']" )
	WebElement quantity;

	@FindBy(xpath ="//td[@class='cart_description']//a" )
	WebElement productname;

	

	//Methods

	public void verify_quantity()
	{
		String ActualQuantity = quantity.getText(); 
		String ExpectedQuantity = "1 Product";
		Assert.assertEquals("Condition true", ExpectedQuantity, ActualQuantity);
		
	}
	public void verify_product(String product1)
	{
		String AR = productname.getText();
		String ER = product1;
		Assert.assertEquals("Condition true", ER, AR);
		
	}
	
	
	
	}
	













