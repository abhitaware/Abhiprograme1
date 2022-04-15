package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse2
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\driver download\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		
		System.out.println("open url");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions act = new Actions(driver);
		
		WebElement click = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		act.click(click).perform();
		
		System.out.println("1-click on click button");
		Thread.sleep(5000);
		
		WebElement right = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		act.contextClick(right).perform();
		
		System.out.println("2-preform right click");
		Thread.sleep(5000);
		
		
		WebElement doubleclick = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		act.doubleClick(doubleclick).perform();
		
		System.out.println("3- perform double click");
		Thread.sleep(4000);
		
		
		WebElement element = driver.findElement(By.xpath("(//span[@class='text'])[1]"));
		Thread.sleep(4000);
		act.moveToElement(element).click().perform();
		
		System.out.println("4- preform click on text box");
//		WebElement textbox = driver.findElement(By.xpath("(//span[@class='text'])[1]"));
//		act.doubleClick(textbox).click().perform();
		
		
		
		System.out.println("end of programme");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
