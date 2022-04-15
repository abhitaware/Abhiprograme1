package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard2 

{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\driver download\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://text-compare.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		WebElement text1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		
		text1.sendKeys("i love india");
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.keyDown(text1,Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		
		WebElement text2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
        
		Thread.sleep(2000);
		act.keyDown(text2, Keys.CONTROL).sendKeys("v").build().perform();
		
		System.out.println("EOD");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
