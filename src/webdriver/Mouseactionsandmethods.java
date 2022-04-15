package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactionsandmethods
{

  public static void main(String[] args) 
  {
	System.setProperty("webdriver.chrome.driver","E:\\driver download\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://vctcpune.com/selenium/practice.html");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement ratiobutton =driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	ratiobutton.click();
	
	WebElement radiodown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	Actions act = new Actions(driver);
	act.moveToElement(radiodown).click().perform();
	
//	double click 
	
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
	
	
	
	
}
