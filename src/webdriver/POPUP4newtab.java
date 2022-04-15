package webdriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPUP4newtab 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver","E:\\driver download\\chromedriver_win32 (2)\\chromedriver.exe");
        
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		   WebElement seleniumButton =  driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
	 	   seleniumButton.click();  

	    
	    List<String> allPageAdd = new ArrayList<String>(driver.getWindowHandles());
	    System.out.println(allPageAdd);
 	     driver.switchTo().window(allPageAdd.get(1));
 	     
 	    WebElement countryTextBox =  driver.findElement(By.xpath("//input[@id='autocomplete']"));
 	 	  countryTextBox.sendKeys("India");
	}
}
