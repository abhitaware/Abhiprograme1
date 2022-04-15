package webdriver;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSHeet
{

	public static void main(String[] args) throws IOException 
	{
	
       String path = "E:\\automation lecture\\Mock Marks Group 01 to 05.xlsx";		
		
       FileInputStream file = new FileInputStream(path);
       
       XSSFWorkbook workbook = new XSSFWorkbook(file);
       
       XSSFSheet sheet = workbook.getSheet("sheet");
       
       XSSFRow row =sheet.getRow(5);
       
       XSSFCell cell= row.getCell(1);
       
       String data=cell.getStringCellValue();
       System.out.println(data);
		
		
		
		
		
		
	}
	



}
