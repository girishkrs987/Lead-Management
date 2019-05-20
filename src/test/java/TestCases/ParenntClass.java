package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ParenntClass {

	
	public static WebDriver driver;// = null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		try {
		base("http://beta.docnu.com/");
		Thread.sleep(2000);
		
		
		login("9985444702","Testing123");
		Thread.sleep(2000);
		search("9897878978");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public static WebElement base(String url){
		System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		WebElement Dr_butotn=driver.findElement(By.xpath("//a[@data-target ='#Doctor_Login']"));
		
		Dr_butotn.click();
		return Dr_butotn;
		
	}
	public static boolean login(String userid, String password) throws InterruptedException{
		

		//driver.findElement(By.xpath("//a[@data-target ='#Doctor_Login']")).click();
		driver.findElement(By.id("UserName")).sendKeys(userid);
		Thread.sleep(2000);
		 driver.findElement(By.id("DocLoginpassword")).sendKeys(password);
		 driver.findElement(By.id("DoctorLogin")).click();
		// Thread.sleep(3000);
		 return true;
		
	}

	public static void search (String mobileno ){
		
		//public static void search (String pname,String pid, String mobileno ){
		//driver.findElement(By.id("txtpatientname")).sendKeys(pname);
		//driver.findElement(By.id("txtpatientid")).sendKeys(pid);
		driver.findElement(By.id("txtmobileno")).sendKeys(mobileno);
	}
	public static Boolean takeappointment(String dateval , String timeval){
		
		
		return true;
	}
	public static void selectdate(WebDriver driver,WebElement element, String datevalue) {
		
		JavascriptExecutor js= ((JavascriptExecutor) driver);
		
		js.executeScript("arguments[0].setAttribute('value',' " +datevalue+"');", element); 
		}
}
