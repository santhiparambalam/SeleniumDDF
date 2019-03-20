package baseclass;

import java.util.NoSuchElementException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import pageobject.LoginPage;
import utils.ConfigReader;
import utils.Log;


public class BaseClass {
	public static WebDriver driver;
	public ConfigReader configreader=new ConfigReader();
	public static LoginPage loginpage;

	
	@BeforeSuite
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
		Log.info("Open Browser");
		DOMConfigurator.configure("log4j.xml");
		}
	 }
	
	@BeforeTest
	public static void initiatebrowser()
	{
		driver.navigate().to(ConfigReader.getURL());
		Log.info("Navigate to URL");
		loginpage=new LoginPage(driver);
		loginpage.click_signinbutton();
		Log.info("Click on sign in button");
		//driver.navigate().refresh();
	}
	
	
	@AfterTest
	public static void signout() throws NoSuchElementException
	{
		try 
		{
			if(loginpage.log_out_button.isDisplayed()) 
		     {
				loginpage.log_out_button.click();
				Log.info("Click on sign out button");
		     }
		}
		catch (Exception e)
		{
		    //do nothing
		}
	}
	
	@AfterSuite
	 public void teardown() 
	{
	  	 driver.quit();
	  	 Log.info("Close Browser");
	 }

}
