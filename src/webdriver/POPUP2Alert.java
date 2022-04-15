package webdriver;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POPUP2Alert 
{
 
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
	 
		System.setProperty("webdriver.chrome.driver","E:\\driver download\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		
//		1) type click only ok button on alert pop up
		
		
		
//		WebElement clickbutton = driver.findElement(By.xpath("//button[@id='alertButton']"));
//		clickbutton.click();
//		Thread.sleep(3000);
//		Alert alt=driver.switchTo().alert();
//		Thread.sleep(5000);
//		alt.accept();
		
		
		
//        2)type click on confirmation button

		
		
//		WebElement confirmbutton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
//		confirmbutton.click();
//		
//		Alert alt= driver.switchTo().alert();
//		
//		alt.dismiss();
		
		
		
//		3) alert window see after 5 seconds
		
//		WebElement afterwait=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
//		afterwait.click();
		
//		 try {
//	            driver.findElement(By.id("timerAlertButton")).click();
//	            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
//	            wait.until(ExpectedConditions.alertIsPresent());
//	            Alert simpleAlert = driver.switchTo().alert();
//	            simpleAlert.accept();
//	            System.out.println("Unexpected alert accepted");
//	        } catch (Exception e) {
//	            System.out.println("unexpected alert not present");
//	        }
//	   
//      4) send text to the alert 
		 
		 WebElement sendkey=driver.findElement(By.xpath("//button[@id='promtButton']"));
		 sendkey.click();
		 
		 Alert alt = driver.switchTo().alert();
		 
		 Thread.sleep(5000);
		 alt.sendKeys("abhijeet");
         alt.accept();
		
		
		
		
		
		
	}
}
