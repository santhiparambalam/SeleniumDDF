package testCase.logintestcase;

import org.testng.annotations.Test;
import actionscript.LoginPageScript;
import baseclass.BaseClass;
import utils.DataProvide;
import utils.Log;

public class ValidLoginTest extends BaseClass{

	@Test(dataProvider="Valid Login Authentication", dataProviderClass=DataProvide.class)
	public void validLoginTest(String sUsername,String sPassword)
	{
		Log.startTestCase("Valid login");
		LoginPageScript.logintopage(driver, sUsername, sPassword);
		LoginPageScript.verifylogin(driver);
		Log.endTestCase();
	}
	
}
