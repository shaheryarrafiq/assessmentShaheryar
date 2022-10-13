package teststepsdefinition;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


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
	@After
	public void teardown()
	{
		driver.close();
		driver.quit();
	}




}

