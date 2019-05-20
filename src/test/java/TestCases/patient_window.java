package TestCases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class patient_window {

	public static void main(String[] args) throws InterruptedException {
	
		
		
System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
	//driver.get("http://beta.docnu.com/");
	
	driver.get("file:///C:/Users/Girish/Desktop/window.html");
	
	driver.findElement(By.xpath("//input[contains(@type,'button')]")).click();
	//Thread.sleep(2000);
	
//	 driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
//	 Thread.sleep(2000);
//	 driver.findElement(By.id("UserName")).sendKeys("9880062888");
//	 driver.findElement(By.id("DocLoginpassword")).sendKeys("Puneeth@129");
//	 Thread.sleep(2000);
//	 driver.findElement(By.id("DoctorLogin")).click();
//	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	 
//	 String Actual_name="shadab";
//		driver.findElement(By.xpath("//input[contains(@id,'txtpatientname')]")).sendKeys(Actual_name);  
//		String Name= driver.findElement(By.xpath("//input[contains(@id,'txtpatientname')]")).getText();
////		
////		
//		// search patient name
//driver.findElement(By.xpath("//button[contains(@id,'btnpatientsearch')]")).click();
//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
////
////
//String BeforeXpath ="//a[text()='" ;
////
//String AfterXpath ="']" ;
//
//
////a[text()='shadab']
//
//if(Name.contains(Name)) {
////	 
////	 
// driver.findElement(By.xpath(BeforeXpath+Actual_name+AfterXpath)).click();
 
 // collect child tabs/windows and assigen into varibales
 
 Set<String> Windows=driver.getWindowHandles();
 
 System.out.println(Windows);
 
 Iterator<String>  it= Windows.iterator();
 String W1=it.next();
 
 String W2=it.next();
 
 String W3=it.next();
 
 System.out.println(W1);
 System.out.println(W2);
 System.out.println(W3);
 
 driver.switchTo().window(W3);
 
 String url=driver.getTitle();
 
 System.out.println(url);
 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
// 
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
 
 
	}
	}

