package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GeneralElements {

	public GeneralElements(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.CSS, using="h1[class='page-heading']")
	private WebElement pageheader;
	
	@FindBy(how=How.CSS, using="span[class='navigation_page']")
	private WebElement navigationbutton;
	
	
	public WebElement getpageheader()
	{
		return pageheader;
	}
	
	public WebElement getnavigationbutton()
	{
		return navigationbutton;
	}
}
