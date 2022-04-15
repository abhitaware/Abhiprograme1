package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogout 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\driver download\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("9022645280");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("pritiabhi@30");
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		
		WebElement dropdown = driver.findElement(By.xpath("//div[@aria-label='Account']"));
		dropdown.click();
		
		Thread.sleep(5000);
        WebElement logout = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div[3]/div/div[4]/div/div[1]/div[2]/div/div/div/div/span"));
    	logout.click();
    	
		
		System.out.println("EOD");
	}
	
}


