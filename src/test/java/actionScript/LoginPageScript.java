package actionScript;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import configItem.BaseClass;
import pageObject.LoginPage;
import utils.CaptureScreenshot;
import utils.DataProvide;

public class LoginPageScript extends BaseClass	{

	public static LoginPage loginpage;
	
	@Test(dataProvider="Login Authentication", dataProviderClass=DataProvide.class)
	public static void loginpageexecute(WebDriver driver,String sUsername,String sPassword)
	{
		loginpage=new LoginPage(driver);
		loginpage.click_signinbutton();
		loginpage.enter_uname(sUsername);
		loginpage.enter_pword(sPassword);
		loginpage.click_login();
		String title=driver.getTitle();
		boolean titlefound=title.contains("Log masuk ke Facebook | Facebook");
		if(titlefound==true)
		{  
			System.out.println("Negative test case Passed: User unable to login");
			CaptureScreenshot.captureScreenshot(driver, "invalid login");
		}
		else
		{
			System.out.println("Positive test case Passed: User able to login");
			CaptureScreenshot.captureScreenshot(driver, "valid login");
		}		
		loginpage.click_logoutbutton();

		
		
			//String titleloginpg=driver.getTitle();
			//Assert.assertEquals("Facebook - Log masuk atau daftar", titleloginpg);//Step1: Open browser and Verify Page Title
			//LoginPage.username_txtbox(driver).sendKeys(sUsername);//Step2: Enter username
			//LoginPage.password_txtbox(driver).sendKeys(sPassword);//Step3: Enter password
			//LoginPage.login_button(driver).click(); //Step4: Click on login button
			//String title=driver.getTitle();
			//System.out.println(title);
			//boolean titlefound=title.contains("Log masuk ke Facebook | Facebook");//Step5: Check title display Log masuk ke Facebook | Facebook
			//if(titlefound==true)
			//{
				//Step6: If yes, invalid credential.  
			//	System.out.println("Negative test case Passed: User unable to login");//Display message in console
			//	CaptureScreenshot.screenshotsnap(driver, "invalid login");//capture screenshot
			//}
			//else
			//{
				//Step7: If No, valid credential
				//System.out.println("Positive test case Passed: User able to login");//Display message in console
				//CaptureScreenshot.screenshotsnap(driver, "valid login");//capture screenshot
			//}		
	}
	

}
