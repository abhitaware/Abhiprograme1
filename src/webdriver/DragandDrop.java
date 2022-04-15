package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop
{
	public static void main(String[] args) throws InterruptedException
	{
         System.setProperty("webdriver.chrome.driver", "E:\\driver download\\chromedriver_win32 (2)\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		 Actions act = new Actions(driver);
		
		 driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
	    WebElement Italy = driver.findElement(By.xpath("//div[@id='box106']"));
	    WebElement Rome= driver.findElement(By.xpath("//div[@id='box6']"));
		Thread.sleep(5000);
        act.dragAndDrop(Rome, Italy).perform();                     
	
		Thread.sleep(5000);
		
		
		 WebElement Norway = driver.findElement(By.xpath("//div[@id='box101']"));
		 WebElement Copenhagan= driver.findElement(By.xpath("//div[@id='box1']"));
		 Thread.sleep(5000);
		 act.dragAndDrop(Copenhagan, Norway).perform();
		 
		 
		 
		 WebElement denmark = driver.findElement(By.xpath("//div[@id='box104']"));
		 WebElement oslo = driver.findElement(By.xpath("//div[@id='box4']"));
		 Thread.sleep(5000);
		 act.dragAndDrop(oslo,denmark).perform();
		 
		 
		 WebElement southkorea = driver.findElement(By.xpath("//div[@id='box105']"));
		 WebElement seoul = driver.findElement(By.xpath("(//div[text()='Seoul'])[2]"));
		 Thread.sleep(5000);
		 act.dragAndDrop(seoul,southkorea ).perform();
	
		 
		 WebElement spain = driver.findElement(By.xpath("//div[@id='box107']"));
		 WebElement madrid = driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"));
		 Thread.sleep(5000);
		 act.dragAndDrop(madrid, spain).perform();
		 
		 
		 
		 WebElement sweden = driver.findElement(By.xpath("//div[@id='box102']"));
		 WebElement stockholm = driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]"));
		 Thread.sleep(5000);
		 act.dragAndDrop(stockholm, sweden).perform();
		 
		 
		 
		 WebElement un = driver.findElement(By.xpath("//div[@id='box103']"));
		 WebElement washington = driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
		 Thread.sleep(5000);
		 act.dragAndDrop(washington,un).perform();
		 
		 
		 
		 
		WebElement capitals=driver.findElement(By.xpath("//div[@id='capitals']"));
		
		act.dragAndDrop(washington, capitals).perform();
		
		act.dragAndDrop(stockholm, capitals).perform();
		
		act.dragAndDrop(madrid, capitals).perform();
		
		act.dragAndDrop(seoul, capitals).perform();
		
		act.dragAndDrop(oslo, capitals).perform();
		
		act.dragAndDrop(Copenhagan, capitals).perform();
		
	act.dragAndDrop(Rome, capitals).perform();

		
		
		System.out.println("EOD");
		
		
		
	}

}
