package testCase.logintestcase;

import org.testng.annotations.Test;
import actionscript.LoginPageScript;
import baseclass.BaseClass;
import pageobject.LoginPage;
import utils.ConfigReader;
import utils.DataProvide;

public class InvalidLoginTest extends BaseClass {

	@Test(dataProvider="Invalid Login Authentication", dataProviderClass=DataProvide.class)
	public void invalidLoginTest(String sUsername,String sPassword)
	{
		driver.navigate().to(ConfigReader.getURL());
		loginpage=new LoginPage(driver);
		loginpage.click_signinbutton();
		LoginPageScript.logintopage(driver, sUsername, sPassword);
		LoginPageScript.verifylogin(driver);
	}
}
