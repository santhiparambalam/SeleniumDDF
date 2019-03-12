package configItem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import pageObject.LoginPage;
import utils.ConfigReader;


public class BaseClass {
	public static WebDriver driver;
	public ConfigReader configreader=new ConfigReader();

	
	@BeforeClass
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
		driver.manage().window().maximize();
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
	 }
	
	@BeforeMethod
	public static void initiatebrowser()
	{
		driver.navigate().to(ConfigReader.getURL());
		driver.navigate().refresh();
	}
	
	
	@AfterClass
	 public void teardown() 
	{
	  	 driver.quit();
	 }

}
