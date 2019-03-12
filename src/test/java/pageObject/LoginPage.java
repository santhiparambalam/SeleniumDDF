package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
			public LoginPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			@FindBy(how=How.CSS, using="a[class='login']")
			public WebElement sign_in_button;
			
			@FindBy(how=How.CSS, using="a[class='logout']")
			public WebElement log_out_button;
			
			@FindBy(how=How.CSS, using="input[name='email']")
			public WebElement username_textbox;
			
			@FindBy(how=How.NAME, using="passwd")
			public WebElement password_textbox;
			
			@FindBy(how=How.ID, using="SubmitLogin")
			public WebElement login_button;
			
			public void click_signinbutton()
			{
				sign_in_button.click();
			}
			
			public void click_logoutbutton()
			{
				log_out_button.click();
			}
			
			public void enter_uname(String username)
			{
				username_textbox.sendKeys(username);
			}
			
			public void enter_pword(String password)
			{
				password_textbox.sendKeys(password);
			}
			
			public void click_login()
			{
				login_button.click();
			}
}
