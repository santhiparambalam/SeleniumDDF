package utils;

import org.testng.annotations.DataProvider;

public class DataProvide {
	@DataProvider(name="Login Authentication")
	  public static Object[][] credentialdata()
	  {
		  ConfigReader reader=new ConfigReader();
		  ExcelUtil excelutil=new ExcelUtil(ConfigReader.getpathtestdata()+ConfigReader.getfilenametestdata());		  
		  int row=ExcelUtil.getrowcount(ConfigReader.getsheetname());
		  int col=ExcelUtil.getcolcount(ConfigReader.getsheetname());
		  Object[][] logindata=new Object[row][col];
		  for(int rowct=0;rowct<row;rowct++)
		  {		
			  for(int colct=0;colct<col;colct++)
			  {	
				  logindata[rowct][colct]=ExcelUtil.getrowData(ConfigReader.getsheetname(), rowct, colct);
			  }
		  }
	  return logindata;
	  }
	  

}
