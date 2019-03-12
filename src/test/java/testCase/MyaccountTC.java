package testCase;

import org.testng.annotations.Test;

import actionScript.MyAccountPageScript;

public class MyaccountTC extends LoginTC {

	@Test
	public void verifyMyAccountpage()
	{
		MyAccountPageScript.checkMyAccountpage(driver);
	}
}
