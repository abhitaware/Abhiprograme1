package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait 

{
public static void main(String[] args)
{

	System.setProperty("webdriver.chrome.driver","E:\\driver download\\chromedriver_win32 (2)\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.saucedemo.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	WebElement username =driver.findElement(By.xpath("//input[@id='user-name']"));
	username.sendKeys("standard_user");
	
	 WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
     password.sendKeys("secret_sauce");
     
     WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
     loginbutton.click();
     
	
	
	
	
}
	
	
}
