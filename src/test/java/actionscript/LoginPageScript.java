package actionscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobject.LoginPage;
import utils.CaptureScreenshot;

public class LoginPageScript{

	public static LoginPage loginpage;
	
	public static void logintopage(WebDriver driver,String sUsername,String sPassword)
	{
		loginpage=new LoginPage(driver);
		loginpage.username_textbox.clear();
		loginpage.enter_uname(sUsername);
		loginpage.password_textbox.clear();
		loginpage.enter_pword(sPassword);
		loginpage.click_login();
	}
	
	public static void verifylogin(WebDriver driver)
	{
		String pageheader=driver.findElement(By.cssSelector("h1[class='page-heading']")).getText();
		if(pageheader.equalsIgnoreCase("My Account")){
			System.out.println("Positive test case Passed: User able to login");
			CaptureScreenshot.captureScreenshot(driver, "valid login");
		}
		else {
			System.out.println("Negative test case Passed: User unable to login");
			CaptureScreenshot.captureScreenshot(driver, "invalid login");
		}
	}	
}
