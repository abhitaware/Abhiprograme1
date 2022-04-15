package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements 
{

//	for signup facebook page
	
//	  webelement methods
//	1)clear   2)click  3)getattribute    4)gettext    5) gettagname  6)getsize using dimension class object
//	7)getlocation using point class object    8)sendkeys() 9)is displayed
	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\driver download\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	    
		 
		 WebElement signup= driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	     signup.click();
//	     sendkeys method for webelement
	     WebElement firstname=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	     firstname.sendKeys("xyz");
	     
//	     WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[3]")) ;
//	     lastname.sendKeys("wxyz");
//	     
//	     WebElement mobileno =driver.findElement(By.xpath("(//input[@type='text'])[4]"));
//	     mobileno.sendKeys("663726372333");
//	     
//	     WebElement password =driver.findElement(By.xpath("(//input[@type='password'])[2]"));
//	     password.sendKeys("aaaaaaa@32322");
//	       
//	     WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
//	     date.click();
//	     
//	      findelement method of  webdriver-----return webelement
//	     with the help of  "By"   class
//	     
//	     
//	     Select s= new Select(date);
//	     s.selectByVisibleText("17");
//	     
//	     WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
//	     month.click();
//	     
//	    Select x=new Select(month);
//	    x.selectByValue("10");
//		
//	    WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
//	    year.click();
//	    
//	    attribute value may change but the tagname will never change
//	    hence to find the dynamic webelements absolute or relative xpath are majorly used
//	    
//	    to handle dropdown 
//	    Select  Y = new Select(year);
//	    Y.selectByValue("2000");
//	    getattributevalue
	     String fn= firstname.getAttribute("name");
	     System.out.println(fn);
//	     get size of webelement 
	     Dimension a= firstname.getSize();
	     System.out.println(a);
//	     get location for webelement
	     Point a1=firstname.getLocation();
	     System.out.println(a1);
	     
	     int a2=firstname.getLocation().getX();
	     System.out.println(a2);
	     
	     firstname.clear();
//	     gettagname
	     String a4=firstname.getTagName();
	     System.out.println(a4);
	     
	     String a5=firstname.getText();
	     System.out.println(a5);

//	     to gettext
	     WebElement female =driver.findElement(By.xpath("(//label[@class='_58mt'])[1]"));
	     female.click();
	     
	     String custom1=female.getText();
	     System.out.println(custom1);
	     
//	is displayed
	
	  WebElement display = driver.findElement(By.xpath("//input[@id=\"hide-textbox\"]"));
	  display.click();
	  
	  WebElement textbox=driver.findElement(By.xpath("//input[@name='show-hide']"));
	  textbox.isDisplayed();
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
}
