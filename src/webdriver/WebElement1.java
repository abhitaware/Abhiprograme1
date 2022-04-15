package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1

{
        public static void main(String[] args) 
{
        	System.setProperty("webdriver.chrome.driver","E:\\driver download\\chromedriver_win32 (2)\\chromedriver.exe");
        	
        	WebDriver driver = new ChromeDriver();
        	
        	driver.manage().window().maximize();
        	
        	
        	driver.get("https://vctcpune.com/selenium/practice.html");
        	
//        	is displayed
        	
    	  WebElement display = driver.findElement(By.xpath("//input[@id=\"hide-textbox\"]"));
    	  display.click();
      	  
      	  WebElement textbox=driver.findElement(By.xpath("//input[@name='show-hide']"));
      	  boolean a = textbox.isDisplayed();
      	 
      	  System.out.println(a);
      	
//       is enable()
      	  
      	  WebElement country = driver.findElement(By.xpath("//input[@id='autocomplete']"));
      	  boolean result =country.isEnabled();
      	  System.out.println(result);

      	  
//      	  is selected 
      	  
      	 WebElement radio =driver.findElement(By.xpath("//input[@type='radio']"));
      	 radio.click();
      	 
      	 boolean result1 = radio.isSelected();
      	 System.out.println(result1);
      	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
}
