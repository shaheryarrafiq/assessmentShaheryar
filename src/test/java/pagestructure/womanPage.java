package pagestructure;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class womanPage{

	//Constructor

	protected WebDriver driver;
	public womanPage(WebDriver driver)
	{
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this);


	}

	//PageElements

	@FindBy(xpath ="//input[@id='layered_category_4']" )
	WebElement TopsCheckbox;
	
	//input[@id='layered_id_attribute_group_8']
	@FindBy(xpath ="//input[@id='layered_id_attribute_group_8']" )
	WebElement colorwhite;

	@FindBy(xpath ="//span[@class='cat-name']" )
	WebElement cat;
	

	

	//Methods
	
	public void clickTops()
	{
		TopsCheckbox.click();
	}
	
	public void clickWhite()
	{
		colorwhite.click();
	}
	
	public void verify_cat()
	{
		String AR = cat.getText();
		String ER = "WOMEN > CATEGORIES TOPS > COLOR WHITE";
		Assert.assertEquals("Condition true", ER,AR);
		
	}

	public void verify_items()
	
	{
		List<WebElement> items = driver.findElements(By.xpath("//div[@class='color-list-container']//a[@class='color_pick']"));
		System.out.println(items.size());
		//to print matching results
		     for(WebElement results: items)
		       {
		         String color= results.getAttribute("id");
		         System.out.println(color);
		       }
	}
	
	//To match filtered result
	public void verify_filter_URL()
	{
		String actualfilterURL=  driver.getCurrentUrl();
		String expectedfilterURL= "http://automationpractice.com/index.php?id_category=3&controller=category#/categories-tops/color-white";
		Assert.assertEquals("Condition true", expectedfilterURL,actualfilterURL);

	}
}



