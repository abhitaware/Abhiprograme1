package webdriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takescreenshot1 
{
	static WebDriver driver;
public static void Takes() throws IOException
{
	TakesScreenshot ts = (TakesScreenshot)driver;
	
	File source =ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("E:\\automation lecture\\screenshots\\img.jpg"); 
	FileHandler.copy(source, dest);
}

  public static void main(String[] args) throws IOException 
  {
	System.setProperty("webdriver.chrome.driver", "E:\\driver download\\chromedriver_win32 (2)\\chromedriver.exe");
	
    driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	
	driver.get("https://www.saucedemo.com/");
	
	Takescreenshot1.Takes();
	


  }
}
