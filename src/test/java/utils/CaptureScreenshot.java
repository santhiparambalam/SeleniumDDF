package utils;

/**
 *The screenshotsnap contains method to capture screenshot
 *
 *File output type: File
 *File format:png
 *Source:
 *Destination:project directory ./screenshots/ folder
 *
 * @param	driver, name
 * @return  none
 * @author  santhiparambalam
 * @version 1.0 07/12/18
 */

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class CaptureScreenshot {
	
	public static void captureScreenshot(WebDriver driver, String Name)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("./Screenshots/"+Name+".png"));
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Unable to create screenshot");
		}
	}
}
