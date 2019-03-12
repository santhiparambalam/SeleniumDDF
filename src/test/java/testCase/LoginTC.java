package testCase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import actionScript.LoginPageScript;
import configItem.BaseClass;
import utils.DataProvide;

public class LoginTC extends BaseClass{
	
	@Test(dataProvider="Login Authentication", dataProviderClass=DataProvide.class)
	public void Logintestcase(String sUsername,String sPassword)
	{
		LoginPageScript.loginpageexecute(driver, sUsername, sPassword);
	}
	
}
