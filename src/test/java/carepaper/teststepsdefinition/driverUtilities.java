package carepaper.teststepsdefinition;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class driverUtilities {
	//private static final String URL = "http://carepaper-v3.herokuapp.com/login";
	public static WebDriver driver ;

	@SuppressWarnings("deprecation")
	@Before
	public void browserSetup()
	{
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+System.getenv("Window_Chrome"));
		//System.setProperty("webdriver.chrome.driver",);
		driver = new ChromeDriver();
		driver.navigate().to(System.getenv("URL_LIVE"));
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

	}
	@After
	public void teardown()
	{
		driver.close();
		driver.quit();
	}

	
	public static void opengmail()
	{
	
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to(System.getenv("gmail_login"));
	}
	
	public static void switchwindow()
	{
		// store window ids in array list
	      ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
	      //switch to active tab
	      driver.switchTo().window(wid.get(2));
	      System.out.println("Page title of active tab: " + driver.getTitle());
		
	}
	
	
	
	public static void switcholdwindow()
	{
		// store window ids in array list
	      ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
	      //switch to active tab
	      driver.switchTo().window(wid.get(1));
	      System.out.println("Page title of active tab: " + driver.getTitle());
		
	}
	
	
}

