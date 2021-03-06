package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

	public MyAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.CSS, using="a[href='http://automationpractice.com/index.php?controller=history']")
	private WebElement orders_button;
	
	@FindBy(how=How.CSS, using="a[href='http://automationpractice.com/index.php?controller=order-slip']")
	private WebElement creditslips_button;
	
	@FindBy(how=How.CSS, using="a[href='http://automationpractice.com/index.php?controller=addresses']")
	private WebElement addresses_button;
	
	@FindBy(how=How.CSS, using="a[href='http://automationpractice.com/index.php?controller=identity']")
	private WebElement information_button;
	
	@FindBy(how=How.CSS, using="a[href='http://automationpractice.com/index.php?fc=module&module=blockwishlist&controller=mywishlist']")
	private WebElement mywishlist_button;
		

	public WebElement getorder_button()
	{
		return orders_button;
	}
	
	public WebElement getcreditslips_button()
	{
		return creditslips_button;
	}
	
	public WebElement getaddresses_button()
	{
		return addresses_button;
	}
	
	public WebElement getinformation_button()
	{
		return information_button;
	}
	
	public WebElement getmywishlist_button()
	{
		return mywishlist_button;
	}
}
