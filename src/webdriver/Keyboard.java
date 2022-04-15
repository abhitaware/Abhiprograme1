package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","E:\\driver download\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement input = driver.findElement(By.xpath("//input[@id='target']"));
		Thread.sleep(5000);
		act.sendKeys("H").perform();
//		act.sendKeys(Keys.BACK_SPACE).click();
//		act.sendKeys(Keys.ENTER).perform();
		WebElement output = driver.findElement(By.xpath("//p[@id='result']"));
		
		
		
		String actualresult = output.getText();
		System.out.println(actualresult);
		String expectedresult="You entered: H";
		
		if(actualresult.equals(expectedresult))
		{
			System.out.println("test case is passed");
			
		}
		else
		{
			System.out.println("test case is failed");
		}
	}
}
