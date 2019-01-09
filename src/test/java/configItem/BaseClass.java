package configItem;

//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

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
	@Parameters("browsers")
	public void start(String browserName) 
	{
		if(browserName.equalsIgnoreCase("ie"))
		{
		System.setProperty("webdriver.ie.driver", "C:\\Program Files\\drivers\\IEDriverServer.exe");
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability("nativeEvents", false);
		caps.setCapability("ignoreZoomSetting", true);
		driver = new InternetExplorerDriver(caps);
		BaseClass.initiatebrowser();
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		BaseClass.initiatebrowser();
		}
		
	 }
	
	public static void initiatebrowser()
	{
		driver.manage().window().maximize();
		driver.navigate().to(ConfigDetails.URL);
		driver.navigate().refresh();
	}
	
	//AfterMethod close browser
	@AfterMethod
	 public void teardown() 
	{
	  	 driver.quit();
	 }

}
