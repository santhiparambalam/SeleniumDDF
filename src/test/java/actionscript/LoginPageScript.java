package actionscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobject.LoginPage;
import utils.CaptureScreenshot;
import utils.Log;

public class LoginPageScript{

	public static LoginPage loginpage;
	
	public static void logintopage(WebDriver driver,String sUsername,String sPassword)
	{
		loginpage=new LoginPage(driver);
		loginpage.username_textbox.clear();
		loginpage.enter_uname(sUsername);
		Log.info("Key in username");
		loginpage.password_textbox.clear();
		loginpage.enter_pword(sPassword);
		Log.info("Key in password");
		loginpage.click_login();
		Log.info("Click on log in button");
	}
	
	public static void verifylogin(WebDriver driver)
	{
		String pageheader=driver.findElement(By.cssSelector("h1[class='page-heading']")).getText();
		if(pageheader.equalsIgnoreCase("My Account")){
			System.out.println("Positive test case Passed: User able to login");
			CaptureScreenshot.captureScreenshot(driver, "valid login");
			Log.info("Verify page header contains My Account");
		}
		else {
			System.out.println("Negative test case Passed: User unable to login");
			CaptureScreenshot.captureScreenshot(driver, "invalid login");
			Log.info("Verify page header does not contain My Account");
		}
	}	
}
