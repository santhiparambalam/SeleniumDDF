package utils;

import org.testng.annotations.DataProvider;

public class DataProvide {
	public static ConfigReader reader=new ConfigReader();
	
	@DataProvider(name="Valid Login Authentication")
	  public static Object[][] validlogindata()
	  {
		  ExcelUtil excelutil=new ExcelUtil(ConfigReader.getpathtestdata()+ConfigReader.getfilenametestdata());		  
		  int row=ExcelUtil.getrowcount(ConfigReader.getvalidloginsheet());
		  int col=ExcelUtil.getcolcount(ConfigReader.getvalidloginsheet());
		  Object[][] logindata=new Object[row][col];
		  for(int rowct=1;rowct<=row;rowct++)
		  {		
			  for(int colct=0;colct<col;colct++)
			  {	
				  logindata[rowct-1][colct]=ExcelUtil.getrowData(ConfigReader.getvalidloginsheet(), rowct, colct);
			  }
		  }
		  ExcelUtil.closeExcel();
	  return logindata;
	  }
	  
	@DataProvider(name="Invalid Login Authentication")
	  public static Object[][] invalidlogindata()
	  {
		  ExcelUtil excelutil=new ExcelUtil(ConfigReader.getpathtestdata()+ConfigReader.getfilenametestdata());		  
		  int row=ExcelUtil.getrowcount(ConfigReader.getinvalidloginsheet());
		  int col=ExcelUtil.getcolcount(ConfigReader.getinvalidloginsheet());
		  Object[][] logindata=new Object[row][col];
		  for(int rowct=1;rowct<=row;rowct++)
		  {		
			  for(int colct=0;colct<col;colct++)
			  {	
				  logindata[rowct-1][colct]=ExcelUtil.getrowData(ConfigReader.getinvalidloginsheet(), rowct, colct);
			  }
		  }
		  ExcelUtil.closeExcel();
	  return logindata;
	  }
}
