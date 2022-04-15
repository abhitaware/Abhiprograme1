package webdriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takescreenshot2 

{
	 public static WebDriver driver;
	public static void Datetime(WebDriver driver) throws IOException
	{
		Date date=new Date();
		DateFormat d =new SimpleDateFormat("mm-dd-yy & kk-mm-ss");
		String newdate = d.format(date);
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\automation lecture\\screenshots\\testing "+newdate+".jpg");
		FileHandler.copy(source, destination);
		
	}
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\driver download\\chromedriver_win32 (2)\\chromedriver.exe");
         driver=new ChromeDriver();
         
         driver.manage().window().maximize();
         
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
         
         
         driver.navigate().to("https://www.saucedemo.com/");
         
         Takescreenshot2.Datetime(driver);
         
         WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
         username.sendKeys("standard_user");
         
         WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
         password.sendKeys("secret_sauce");
         
         WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
         loginbutton.click();
         
         Thread.sleep(3000);
         
         Takescreenshot2.Datetime(driver);
         
         System.out.println("end of programe");
         
	
	
	
	}
	
}
