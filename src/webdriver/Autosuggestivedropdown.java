package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autosuggestivedropdown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\driver download\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement dropdown1 =driver.findElement(By.xpath("//input[@list='mah-district']"));
		WebElement dropdown = driver.findElement(By.xpath("//datalist[@id=\"mah-district\"]/option[3]"));
		dropdown1.click();
		Actions x=new Actions(driver);
		x.clickAndHold().doubleClick(dropdown);
		
//		WebElement dropdown = driver.findElement(By.xpath("/html/body/section[6]/div/div/div[1]/datalist"));
//		dropdown.sendKeys("Pune");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
