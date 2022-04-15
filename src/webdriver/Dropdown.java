package webdriver;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 

{
   public static void main(String[]args) throws InterruptedException
     {
        System.setProperty("webdriver.chrome.driver","E:\\driver download\\chromedriver_win32 (2)\\chromedriver.exe");
        
        WebDriver driver =new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        
        driver.get("https://vctcpune.com/selenium/practice.html");
//     1------dropdown type first   
        WebElement dropdown =driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
        dropdown.click();
        
        Select s = new Select(dropdown);
        s.selectByIndex(1);
        Thread.sleep(2000);
        dropdown.click();
        s.selectByValue("option2");
        Thread.sleep(2000);
        dropdown.click();
        s.selectByVisibleText("Option3");
	
	
//	radio button click
	
	WebElement checkbox1 = driver.findElement(By.xpath("/html/body/section[1]/div/div/div[4]/label[1]/input"));
	boolean result=checkbox1.isSelected();
	
	System.out.println(result);
	
	if(result==true)
	{
		System.out.println("radiobutton1 is selected");
	}
	else
	{
		System.out.println("radio is not selected");
		System.out.println("select the radio button");
	
	}
	checkbox1.click();
	
        

	
	

}
	
	
	
	
}
