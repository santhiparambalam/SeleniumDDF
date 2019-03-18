package actionscript;

import org.openqa.selenium.WebDriver;
import junit.framework.Assert;
import pageobject.GeneralElements;
import pageobject.MyAccountPage;

public class MyAccountPageScript {
	public static MyAccountPage myaccountpage;
	public static GeneralElements generalelement;
	

	public static void checkMyAccountheaderandnavigation(WebDriver driver)
	{
		generalelement=new GeneralElements(driver);
		Assert.assertTrue(generalelement.getpageheader().getText().equalsIgnoreCase("My Account"));
		System.out.println("Page header is My Account");
		Assert.assertTrue(generalelement.getnavigationbutton().getText().equalsIgnoreCase("My Account"));
		System.out.println("Navigation button is My Account");
	}
	
	public static void checkMyAccountpage(WebDriver driver)
	{
		myaccountpage=new MyAccountPage(driver);
		Assert.assertTrue(myaccountpage.getorder_button().isDisplayed());
		System.out.println("Order button is found");
		Assert.assertTrue(myaccountpage.getcreditslips_button().isDisplayed());
		System.out.println("Credit slips button is found");
		Assert.assertTrue(myaccountpage.getaddresses_button().isDisplayed());
		System.out.println("Addresses button is found");
		Assert.assertTrue(myaccountpage.getinformation_button().isDisplayed());
		System.out.println("Information button is found");
		Assert.assertTrue(myaccountpage.getmywishlist_button().isDisplayed());
		System.out.println("My Wishlist button is found");
	}
	
}
