package testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class test {
//LOGIN(INVALID)
//LOGIN(VALID)	- done
//Step 1:Go to url
//Step 2:Enter username
//Step 3:Enter password
//Step 4:Click sign in
//Step 5:Check My Account page
	
//MYACCOUNT - done
//Step 6:Check buttons my wishlist, information, address, orders, order-slip
//Step 7:Check navigation button - My Account
//Step 8:Check page header - My Account

	
//ADD ADDRESS(add multiple address) - done
//Step 9:Click on addresses button
//Step 10:Click on add address
//Step 11:Enter all details
//Step 12:Click save
//Step 13:View saved address detail
//Step 14:Verify address details saved correctly
	
//WOMEN CATEGORY
//Step 15:Check navigation button - Women
//Step 16:Check page header - Women
//Step 17:Click on addresses Women
//Step 18:Verify drop down values for women categor
//Step 19:Click on drop down value
//Step 20:Check page
	
//DRESSES CATEGORY
//Step 21:Check navigation button - dresses
//Step 22:Check page header - dresses
//Step 23:Click on addresses dresses
//Step 24:Verify drop down values for dresses category
//Step 25:Click on drop down value
//Step 26:Check page
	
//LOGOUT
//Step 27:Click sign out
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/");
		driver.findElement(By.cssSelector("a[class='login']")).click();;
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("santhi.asusvivobook@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("automation123");
		driver.findElement(By.id("SubmitLogin")).click();
		
		/*Add Address
		driver.findElement(By.cssSelector("a[title='Add an address']")).click();
		driver.findElement(By.cssSelector("input[name='firstname']")).clear();
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Santhi");
		driver.findElement(By.cssSelector("input[name='lastname']")).clear();
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Test");
		driver.findElement(By.cssSelector("input[name='company']")).sendKeys("xyz");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("Jalan pinang");
		driver.findElement(By.cssSelector("input[name='address2']")).sendKeys("empty");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Petaling jaya");
		String state="Alaska";
		Select statedropdown=new Select(driver.findElement(By.cssSelector("select[name='id_state']")));
		switch(state)
		{
		case "Alabama":
			statedropdown.selectByValue("1");
			break;
		case "Alaska":
			statedropdown.selectByValue("2");
		}
		driver.findElement(By.cssSelector("input[name='postcode']")).sendKeys("12345");;
		String country="United States";
		Select countrydropdown=new Select(driver.findElement(By.cssSelector("select[name='id_country']")));
		switch(country)
		{
		case "United States":
			countrydropdown.selectByValue("21");
			break;
		}
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("01545646466");
		driver.findElement(By.cssSelector("input[name='phone_mobile']")).sendKeys("01545646466");
		driver.findElement(By.cssSelector("textarea[name='other']")).sendKeys("testing");
		driver.findElement(By.cssSelector("input[name='alias']")).clear();
		driver.findElement(By.cssSelector("input[name='alias']")).sendKeys("testadd1");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		*/
		Actions action=new Actions(driver);
		WebElement womentabbutton=driver.findElement(By.cssSelector("a[href='http://automationpractice.com/index.php?id_category=3&controller=category']"));
		action.moveToElement(womentabbutton).build().perform();
		
		driver.findElement(By.cssSelector("ul > li:nth-child(1)")); 
		//driver.findElement(By.cssSelector("a[class='logout']")).click();
		//driver.close();
	}
}
