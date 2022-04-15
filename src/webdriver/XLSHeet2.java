package webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSHeet2
{
	
	public static void main(String[] args) throws IOException 
	{
		
	
	String path ="C:\\Users\\Dell\\Desktop\\saucedemo.xlsx";
	
	FileInputStream file = new FileInputStream(path);
	
	XSSFWorkbook worksheet = new XSSFWorkbook(file);
	
	XSSFSheet sheet = worksheet.getSheet("Sheet1");
	
	for(int i=1;i<5;i++)
	{
	  for(int j=0;j<2;j++)
	  {
		  XSSFRow row = sheet.getRow(i);
		  XSSFCell cell=row.getCell(j);
		  String data=cell.getStringCellValue();
		  System.out.println(data);
		  
	  }
	}
	
	}
}
