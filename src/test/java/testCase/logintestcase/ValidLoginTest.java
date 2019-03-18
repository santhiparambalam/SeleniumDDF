package testCase.logintestcase;

import org.testng.annotations.Test;
import actionscript.LoginPageScript;
import baseclass.BaseClass;
import utils.DataProvide;

public class ValidLoginTest extends BaseClass{

	@Test(dataProvider="Valid Login Authentication", dataProviderClass=DataProvide.class)
	public void validLoginTest(String sUsername,String sPassword)
	{
		LoginPageScript.logintopage(driver, sUsername, sPassword);
		LoginPageScript.verifylogin(driver);
	}
	
}
