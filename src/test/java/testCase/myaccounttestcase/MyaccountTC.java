package testCase.myaccounttestcase;


import org.testng.annotations.Test;
import actionscript.MyAccountPageScript;
import baseclass.BaseClass;

public class MyaccountTC extends BaseClass{
	
	@Test
	public void verifyMyAccountpage()
	{
		MyAccountPageScript.checkMyAccountheaderandnavigation(driver);
		MyAccountPageScript.checkMyAccountpage(driver);
	}
}
