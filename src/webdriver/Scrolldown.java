package webdriver;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown

{
	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver","E:\\driver download\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
//		casting
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");  // "window.scrollBy(x,y)" 
		
		
		
		
		
		
	}
	

	
}
