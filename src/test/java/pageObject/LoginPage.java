package pageObject;

/**
 *The LoginPage class contains web elements 
 *found in login page
 *
 *Element1: Username textbox
 *Element2: Password textbox
 *Element3: Log in button
 *
 * @param	none
 * @return  none
 * @author  santhiparambalam
 * @version 1.0 07/12/18
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
	//Login Page object model-> list all the elements in Login
			private static WebElement element=null;
			
			
			public static WebElement username_txtbox(WebDriver driver)
			{
				element=driver.findElement(By.cssSelector("input[name='email']"));//Element1: Username textbox
				return element;
			}
			
			public static WebElement password_txtbox(WebDriver driver)
			{
				element=driver.findElement(By.cssSelector("input[name='pass']"));//Element2: Password textbox
				return element;
			}
			
			public static WebElement login_button(WebDriver driver)
			{
				element=driver.findElement(By.cssSelector("input[type='submit']"));//Element3: Log in button
				return element;
			}
			
			


}
