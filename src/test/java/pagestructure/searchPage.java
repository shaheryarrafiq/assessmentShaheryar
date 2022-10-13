package pagestructure;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class searchPage{

	//Constructor

	protected WebDriver driver;
	public searchPage(WebDriver driver)
	{
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this);

	}

	//Methods
	
	

	public void verify_items(String searchTerm)
	{
		List<WebElement> items = driver.findElements(By.xpath("//div[@class='right-block']//a[@class='product-name']"));
		
		
		
		System.out.println(items.size());
		//if you want to print matching results
		     for(WebElement results: items)
		       {
		         String value= results.getAttribute("title");
		         System.out.println(value);
		         
		         Assert.assertEquals(value,searchTerm);
		         
		        
       
	}
	}
	}













