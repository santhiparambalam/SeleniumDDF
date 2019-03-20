package testCase.myaccounttestcase;


import org.testng.annotations.Test;
import actionscript.MyAccountPageScript;
import baseclass.BaseClass;
import utils.Log;

public class MyaccountTC extends BaseClass{
	
	@Test
	public void verifyMyAccountpage()
	{
		Log.startTestCase("Verify My Account Page");
		MyAccountPageScript.checkMyAccountheaderandnavigation(driver);
		MyAccountPageScript.checkMyAccountpage(driver);
		Log.endTestCase();
	}
}
