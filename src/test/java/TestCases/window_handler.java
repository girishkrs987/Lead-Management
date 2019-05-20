package TestCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class window_handler {

	
	// script for browser window handler
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
			driver.get("file:///C:/Users/Girish/Desktop/window.html");
			
			
//			Thread.sleep(2000);
//			
//			 driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
//			 Thread.sleep(2000);
//			 driver.findElement(By.id("UserName")).sendKeys("9880062888");
//			 driver.findElement(By.id("DocLoginpassword")).sendKeys("Puneeth@128");
//			 Thread.sleep(2000);
//			 driver.findElement(By.id("DoctorLogin")).click();
//			 
//			 Thread.sleep(2000);
//			 
//			//i[contains(@class,'fa fa-share')]
//			 
//			 driver.findElement(By.xpath("//*[@id=\"navigation\"]/li[9]/a/span")).click();
//			// Thread.sleep(2000);
//			 
//			 driver.findElement(By.xpath("//a[contains(text(), 'My Referrals')]")).click();
//			 
//			//*[@id="DataTables_Table_0"]/tbody/tr[1]/td[7]/a
//			 
//			 driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[7]/a")).click();
//			 
//			 // which contains all child window names and assigend to variable
//			 Set <String> handler = driver.getWindowHandles(); 
//			 
//			 System.out.println(handler);
//			 
//			 // by using Iterator interface we will perform element one by one 
//			 
//			  Iterator <String>it=handler.iterator();
//			  
//			//  String Parent_window =it.next();
//			  
//			//  System.out.println("Parent window"+Parent_window);
//			  
//			String Child_window =it.next(); 
//			
//			System.out.println("Child window"+Child_window);
//			driver.switchTo().window(Child_window);
//			
//			String Label=driver.findElement(By.xpath("//button[contains(@id,'BookAppointmentreferral')]")).getText();
//			
//			System.out.println(Label);
//			driver.findElement(By.xpath("//button[contains(@id,'BookAppointmentreferral')]")).click();
//			
			
		driver.get("https://economictimes.indiatimes.com/");
		Thread.sleep(2000);
		// find the news links and click on 
		
		driver.findElement(By.xpath("//a[contains(text(),'CREATE PORTFOLIO')]")).click();
		Thread.sleep(2000);
		
		//Actions action = new Actions(driver);
		
	//	action.moveToElement(driver.findElement(By.xpath("//a[contains(@data-sharetype, 'tumblr')]"))).build().perform();
		// clcik tumbeler iocn for share 
		
		//driver.findElement(By.xpath("//a[contains(@data-sharetype, 'tumblr')]")).click();
		
		 Set <String> handler = driver.getWindowHandles(); 
	 
	 System.out.println(handler);
//		 
//		 // by using Iterator interface we will perform element one by one 
//		 
	  Iterator <String>it=handler.iterator();
//		  
	    String Parent_window =it.next();
//		  
  System.out.println("Parent window"+Parent_window);
//		  
	String Child_window =it.next(); 
//		
	System.out.println("Child window"+Child_window);
driver.switchTo().window(Child_window).findElement(By.xpath("//button[contains(text(),'SIGN IN')]")).click();

Thread.sleep(2000);


//driver.findElement(By.xpath("//input[contains(text(),'Sign in with Facebook')]")).click();
//driver.findElement(By.xpath("//button[contains(text(),'SIGN IN')]")).click();

Set <String> handler1 = driver.getWindowHandles(); 

//driver.findElement(By.xpath("//input[contains(text(),'Sign in with Facebook')]")).click();

Iterator <String>that=handler1.iterator();
//

String Child_Parent_window =that.next();
String Child_child_window =that.next();

System.out.println("child parent child windows"+Child_Parent_window);
System.out.println("child  child windows"+Child_child_window);


driver.switchTo().window(Child_child_window).findElement(By.xpath("//input[contains(text(),'Sign in with Facebook')]")).click();

		driver.close();
	}

}
