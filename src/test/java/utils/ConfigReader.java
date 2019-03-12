/****************************************************************************************
 *ConfigReader: Read and interact with config.properties
 ****************************************************************************************
 *Constructor ConfigReader: Read config.properties 
 *Method getdrivertype: Get driverttype with getproperty @return DriverType
 *Method getenvironment: Get environmenttype with getproperty @return EnvironmentType
 *Method getdrivertype: Get driverpath with getproperty @return String driverpath
 *Method getURL: Get url with getproperty @return String url
 *Method getimplicitlywait: Get implicitlywait with getproperty @return Long implicitwait
 *Method getexceltestdata: Get exceltestdata with getproperty @return String excelTDpath
 *Method getexcelactionkeyword: Get excelactionkeyword with getproperty @return String excelAKpath
 * 
 * @author  santhiparambalam
 * @version 1.0 05/03/19
 *****************************************************************************************/


package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private static Properties Config;
	private static String propertyFilepath="D:\\Eclipse QA\\SeleniumDDF\\Config\\config.properties";
	
	public ConfigReader() 
	{
		BufferedReader reader;
		try {
			reader=new BufferedReader(new FileReader(propertyFilepath));
			Config=new Properties();
			try {
				Config.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException("Unable to load reader");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Unable to find config.property");
		}
		
	}
	
	public static String getdriverpath()
	{
		String driverpath=Config.getProperty("driverpath");
		if (driverpath!=null) return driverpath;
		else throw new RuntimeException("Driverpath is not found");
	}
	
	public static String getURL()
	{
		String url=Config.getProperty("URL");
		System.out.println(url);
		if (url!=null) return url;
		else throw new RuntimeException("Driverpath is not found");
	}
	
	public static long getimplicitlywait()
	{
		String implicitwait=Config.getProperty("implicitlywait");
		if (implicitwait!=null) return Long.parseLong(implicitwait);
		else throw new RuntimeException("Implicit wait is not found");
	}
	
	public static String getpathtestdata()
	{
		String excelTDpath=Config.getProperty("path_testdata");
		if (excelTDpath!=null) return excelTDpath;
		else throw new RuntimeException("Test data excel file path is not found");
	}
	
	public static String getfilenametestdata()
	{
		String excelFN=Config.getProperty("filename_testdata");
		if (excelFN!=null) return excelFN;
		else throw new RuntimeException("Test data excel file name is not found");
	}
	
	public static String getsheetname()
	{
		String sheetName=Config.getProperty("sheet");
		if (sheetName!=null) return sheetName;
		else throw new RuntimeException("Excel sheet name is not found");
	}
}
