package utility;

/**
 *The DataProvide class stores the data provider Login Authentication
 *which provides credentials required to login
 *
 *STEP1: Create object of excelutils with test data path from configDetails
 *STEP2: Count number of rows in test data
 *STEP3: Count number of cols in test data
 *STEP4: Get credential data from each row and col
 *
 * @param	none
 * @return  logindata
 * @author  santhiparambalam
 * @version 1.0 07/12/18
 */

import org.testng.annotations.DataProvider;

import configItem.ConfigDetails;

public class DataProvide {
	@DataProvider(name="Login Authentication")
	  public static Object[][] credentialdata()
	  {
		  ExcelUtils config=new ExcelUtils(ConfigDetails.path_testdata+ConfigDetails.filename_testdata);//STEP1: Create object of excelutils with test data path from configDetails
		  int row=config.rowcountfx("Sheet1");//STEP2: Count number of rows in test data
		  int col=config.colcountfx("Sheet1");//STEP3: Count number of cols in test data
		  Object[][] logindata=new Object[row][col-1];
		  for(int rowct=0;rowct<row;rowct++)//STEP4: Get credential data from each row and col
		  {		
			  logindata[rowct][0]=config.getData("Sheet1", rowct, 0);
			  int colct=col-2;
			  logindata[rowct][colct]=config.getData("Sheet1", rowct, colct);
		  }
	  return logindata;
	  }
	  

}
