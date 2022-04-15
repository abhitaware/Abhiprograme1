package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methodsofwebdriver 

{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","E:\\driver download\\chromedriver_win32 (2)\\chromedriver.exe");
		
		System.out.println("1-set property for browser");
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("2-open the browser");

		driver.manage().window().maximize();
		
		System.out.println("3- maximize the browser");
		
//     webdriver methods 
		
		
//		driver.get("https://www.saucedemo.com/");
		
//		System.out.println("url opened ");
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		System.out.println("url opened");
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password =driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
	   
		String actualurl =driver.getCurrentUrl();
         System.out.println(actualurl);
		
         Thread.sleep(5000);
         String title=driver.getTitle();
         System.out.println(title);
        Thread.sleep(5000);
         String page=driver.getPageSource();
         System.out.println(page);
		driver.navigate().back();
		
		
		
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.close();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}
}
