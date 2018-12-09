package utility;

/**
 *The ExcelUtils class contains all method involving excel file
 *
 *Method ExcelUtils
 *STEP1: Read excel file
 * @param	path
 * @return  wb
 * 
 * Method rowcountfx
 * STEP2: Count number of rows with data
 * @param	sheet
 * @return  rowcount
 * 
 * Method colcountfx
 * STEP3: Count number of cols with data
 * @param	sheet
 * @return  colcount
 * 
 * Method getData
 * STEP4: Read data from excel file into array
 * @param	sheetname,rowcount,colcount
 * @return  data
 * 
 * Method closeexcel
 * STEP5: Close excel file
 * @param	fis
 * @return  none
 * 
 * @author  santhiparambalam
 * @version 1.0 07/12/18
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtils {
	File src;
	XSSFWorkbook wb;
	XSSFSheet ws;
	
	public ExcelUtils(String path)//STEP1: Read excel file
	{
		try {
		src=new File(path);
		FileInputStream fis = new FileInputStream(src);
		wb=new XSSFWorkbook(fis);
		} catch (IOException e) {
			System.out.println("Could not read the Excel sheet");
			e.printStackTrace();
		}
	}
	
	public int rowcountfx(String sheet)//STEP2: Count number of rows with data
	{
		int rowcount=wb.getSheet(sheet).getLastRowNum();	
		rowcount=rowcount+1;
		return rowcount;
	}
	
	public int colcountfx(String sheet)//STEP3: Count number of cols with data
	{
		int colcount=wb.getSheet(sheet).getRow(0).getPhysicalNumberOfCells();
		colcount=colcount+1;
		return colcount;
	}

	public String getData(String sheetname,int rowcount, int colcount)//STEP4: Read data from excel file into array
	{	
		ws=wb.getSheet(sheetname);
		String data=ws.getRow(rowcount).getCell(colcount).getStringCellValue();
		return data;
	}

	public void closeexcel(FileInputStream fis)//STEP5: Close excel file
	{
		try {
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



}
