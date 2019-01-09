package actionScript;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObject.LoginPage;
import utility.CaptureScreenshot;

/**
 *The LoginPageScript class check valid and invalid credential
 * by entering username and password in login page
 *
 *TCO01: Verify user able to login with valid credential
 *TCO02: Verify user unable to login with invalid credential
 *
 *Step1: Open browser and Verify Page Title
 *Step2: Enter username
 *Step3: Enter password
 *Step4: Click on login button
 *Step5: Check title display Log masuk ke Facebook | Facebook
 *Step6: If yes, invalid credential. Display message in console and capture screenshot
 *Step7: If No, valid credential. Display message in console and capture screenshot
 *
 * @param	driver, sUsername, sPassword
 * @return  no return value
 * @author  santhiparambalam
 * @version 1.0 07/12/18
 */

public class LoginPageScript {

	public static void loginpageexecute(WebDriver driver,String sUsername,String sPassword)
	{
			String titleloginpg=driver.getTitle();
			Assert.assertEquals("Facebook - Log masuk atau daftar", titleloginpg);//Step1: Open browser and Verify Page Title
			LoginPage.username_txtbox(driver).sendKeys(sUsername);//Step2: Enter username
			LoginPage.password_txtbox(driver).sendKeys(sPassword);//Step3: Enter password
			LoginPage.login_button(driver).click(); //Step4: Click on login button
			String title=driver.getTitle();
			System.out.println(title);
			boolean titlefound=title.contains("Log masuk ke Facebook | Facebook");//Step5: Check title display Log masuk ke Facebook | Facebook
			if(titlefound==true)
			{
				//Step6: If yes, invalid credential.  
				System.out.println("Negative test case Passed: User unable to login");//Display message in console
				CaptureScreenshot.screenshotsnap(driver, "invalid login");//capture screenshot
			}
			else
			{
				//Step7: If No, valid credential
				System.out.println("Positive test case Passed: User able to login");//Display message in console
				CaptureScreenshot.screenshotsnap(driver, "valid login");//capture screenshot

			}		
	}
	

}
