package configItem;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 *
 *The BaseClass class provides after and before method 
 *
 *
 *BeforeMethod opens browser
 *AfterMethod close browser
 *
 * @param	none
 * @return  none
 * @author  santhiparambalam
 * @version 1.0 07/12/18
 */


public class BaseClass {
public static WebDriver driver;
	
	//BeforeMethod opens browser
	@BeforeMethod
	public void start() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(ConfigDetails.URL);
		driver.manage().window().maximize();
	 }
	
	//AfterMethod close browser
	@AfterMethod
	 public void teardown() 
	{
	  	 driver.quit();
	 }

}
