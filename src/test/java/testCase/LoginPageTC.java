package testCase;

/**
 *The LoginPageTC class is runs
 *TCO01: Verify user able to login with valid credential
 *TCO02: Verify user unable to login with invalid credential 
 *
 * @param	sUsername, sPassword
 * @dataprovider Login Authentication
 * @return  none
 * @author  santhiparambalam
 * @version 1.0 07/12/18
 */

import org.testng.annotations.Test;
import actionScript.LoginPageScript;
import configItem.BaseClass;
import utility.DataProvide;

public class LoginPageTC extends BaseClass{
	@Test(dataProvider="Login Authentication", dataProviderClass=DataProvide.class)
	public void Logintestcase(String sUsername,String sPassword)
	{
		LoginPageScript.loginpageexecute(driver, sUsername, sPassword);
	}
	
}
