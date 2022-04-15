package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait
{

	public static void main(String[] args)
	{
		
		
		System.setProperty("webdriver.chrome.driver","E:\\driver download\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']")) ;
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(12));
		wait.until(ExpectedConditions.visibilityOf(username));
	
		username.sendKeys("standard_user");
		
		
		
		
		
		
		
		
		
				
		
		
	}
	
	
	
	
	
	
	
	
}
