package teststepsdefinition;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriverService;
import java.util.logging.Level;
import java.util.logging.Logger;


public class driverUtilities {

	public static WebDriver driver ;


	@Before

	//Initializing the driver
	public void browserSetup()
	{
		String projectPath = System.getProperty("user.dir"); //Getting project directory
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));	

	}
	
	//To disable the ChromeDriverService loggers warnings
	public static void disableSeleniumLogs() {    
	    System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	    Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
	}
	@After
	public void teardown()
	{
		//driver.close();
		driver.quit();
	}




}

