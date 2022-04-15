package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPUP3 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
	   System.setProperty("webdriver.chrome.driver","E:\\driver download\\chromedriver_win32 (2)\\chromedriver.exe");
	   
	   WebDriver driver = new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
//	 1----  
//	   driver.get("https://the-internet.herokuapp.com/basic_auth");
//	   
//	   driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
//		2----way
	   String start ="https://";
	   String username="admin";
	   String password = "admin";
	   String url ="the-internet.herokuapp.com/basic_auth";
	   
//	   concat 
	   String finalurl =start+username+":"+password+"@"+url ;
	Thread.sleep(3000);	
	   driver.get(finalurl);
		
	}
	

}
