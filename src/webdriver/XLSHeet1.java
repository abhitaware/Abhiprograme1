package webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XLSHeet1 

{

	public static void main(String[] args) throws IOException 
	{
		String path = "C:\\Users\\Dell\\Desktop\\saucedemo.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet =workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(0);
		System.out.println("get username from excelsheet");
		String data = cell.getStringCellValue();
		System.out.println(data);
		XSSFRow row1 =sheet.getRow(1);
		XSSFCell cell1=row1.getCell(1);
		System.out.println("get password from excelsheet  ");
		String data2 = cell1.getStringCellValue();
		System.out.println(data2);
		
		System.setProperty("webdriver.chrome.driver","E:\\driver download\\chromedriver_win32 (2)\\chromedriver.exe");
		System.out.println("3-set property for system");
		WebDriver driver = new ChromeDriver();
		System.out.println("4-open chrome browser");
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("5-open url");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys(data);
		System.out.println("6-entered user name");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(data2);
		System.out.println("7-entered password");
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
		System.out.println("8-clicked on login button ");
		
		System.out.println("9-login sucessfully");
		
		
		
	}
	
	
	
}
