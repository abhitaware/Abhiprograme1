package webdriver;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setpositionanddimension 

{
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\driver download\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		
		Dimension d=new Dimension(200, 500);
		
		Thread.sleep(3000);
	    
		driver.manage().window().setSize(d);
	    
	    Point p=new Point(200,200);
	    
	    driver.manage().window().setPosition(p);
		
	}
	

}
