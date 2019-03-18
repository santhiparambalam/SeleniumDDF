/****************************************************************************************
 *ExcelUtils: Read and interact with excel file
 ****************************************************************************************
 *Constructor ExcelUtils: Read excel file  @param String path
 *Method getrowcount: Count number of rows with data @param String sheet, @return int rowcount
 *Method getrowData: Count number of cols with data @param	String sheet, int rownum, int colnum @return String data
 *Method closeExcel: Close excel file @param FileInputStream fis
 * 
 * @author  santhiparambalam
 * @version 1.0 05/03/19
 *****************************************************************************************/

package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtil {
	private static File file;
	private static XSSFWorkbook wb;
	private static XSSFSheet ws;
	private static FileInputStream fis;

	public ExcelUtil(String path)
	{
		try {
		file=new File(path);
		fis = new FileInputStream(file);
		wb=new XSSFWorkbook(fis);
		} catch (IOException e) {
			System.out.println("Could not read the Excel sheet");
			e.printStackTrace();
		}
	}
	
	public static int getrowcount(String sheet)
	{
		ws=wb.getSheet(sheet);
		int lastrow=ws.getLastRowNum();
		return lastrow;
	}
	
	public static int getcolcount(String sheet)
	{
		ws=wb.getSheet(sheet);
		int colcount=ws.getRow(0).getPhysicalNumberOfCells();
		return colcount;
	}

	public static String getrowData(String sheet, int rownum, int colnum)
	{
		ws=wb.getSheet(sheet);
		String data=ws.getRow(rownum).getCell(colnum).getStringCellValue();
		return data;
	}
	
	public static void closeExcel()
	{
		try {
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Unable to close excel File");
		}	
	}	

}
