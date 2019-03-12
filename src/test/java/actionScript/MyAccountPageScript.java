package actionScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.MyAccountPage;

public class MyAccountPageScript {
	public static MyAccountPage myaccountpage;
	
	@Test
	public static void checkMyAccountpage(WebDriver driver)
	{
		myaccountpage=new MyAccountPage(driver);
		String accountpagetitle=driver.getTitle();
		if(accountpagetitle.contains("My account"))
		{
			System.out.println("View my accountpage");
		}
		Assert.assertTrue(myaccountpage.getorder_button().isDisplayed());
		Assert.assertTrue(myaccountpage.getcreditslips_button().isDisplayed());
		Assert.assertTrue(myaccountpage.getaddresses_button().isDisplayed());
		Assert.assertTrue(myaccountpage.getinformation_button().isDisplayed());
		Assert.assertTrue(myaccountpage.getmywishlist_button().isDisplayed());
	}
	
}
