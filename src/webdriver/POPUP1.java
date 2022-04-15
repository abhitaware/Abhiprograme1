package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPUP1 
{
	
//	hidden pop up which is open on the same page and hide the parent page 

	public static void main(String[] args) 
	{
	
		
		System.setProperty("webdriver.chrome.driver","E:\\driver download\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("1- open chrome browser");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println("2-opened url");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		WebElement forget= driver.findElement(By.xpath("//a[@role='button']"));
		forget.click();
		
		System.out.println("3-clicked on open new account tab ");
		
		System.out.println("4-opened new pop up window");
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("aaaaaaaaaaaa");
		
		System.out.println("5-entered firstname");
		
		WebElement lastname =driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("sgsudsdgdyfahc");
		
		System.out.println("6-entered lastname");
		
		
		System.out.println("7- End of Programe");
	
		
		
	}
}
