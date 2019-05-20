package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;



public class headlessBrowser {
	
	public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
//		Properties prop = new Properties();
//		//FileInputStream ip; 
//		
//		FileInputStream ip=new FileInputStream("C:\\Users\\Girish\\eclipse-workspace\\Lead_Management\\ObjectRepository.properties");
//		prop.load(ip);
//		
//		 System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
//  	   driver = new HtmlUnitDriver ();
//		driver.manage().window().maximize();
//		
//		String bw=  prop.getProperty("Browser"); 
//       String url_ads=   prop.getProperty("URL");
//        driver.get(url_ads);
//        System.out.println(bw);
//
//        System.out.println(url_ads);
//
//        String Page_title=driver.getTitle();
//        
//        System.out.println("Page title after login"+Page_title); 
//        
//        
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(prop.getProperty("Doctor_Login_Button_xpath"))).click(); 
//
//		driver.findElement(By.id(prop.getProperty("Username_id"))).sendKeys(prop.getProperty("User_name"));
//		driver.findElement(By.id(prop.getProperty("Password_id"))).sendKeys(prop.getProperty("Password"));
//				driver.findElement(By.id(prop.getProperty("Login_button_id"))).click();
//				
//				String Page_after_ttile=driver.getTitle();
//				
//				System.out.println("Page title after login"+Page_after_ttile);
//				
//
//	}
//	
////	public static String Login_headless() {
////		return null;
//		
//		
		
		
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Girish\\eclipse-workspace\\Lead_Management\\ObjectRepository.properties");
		prop.load(ip);



		String browser = prop.getProperty("Browser");
		String url = prop.getProperty("URL");

		System.out.println(browser);
		System.out.println(url);



		System.setProperty("webdriver.chrome.driver","C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");

		driver = new HtmlUnitDriver();



		driver.get(url);

		driver.manage().window().maximize();


		String Page_title = driver.getTitle();
		System.out.println(Page_title);

		driver.findElement(By.xpath(prop.getProperty("Doctor_Login_button_xpath"))).click();
		Thread.sleep(2000);
		driver.findElement(By.id(prop.getProperty("Username_id"))).sendKeys(prop.getProperty("Username"));
		driver.findElement(By.name(prop.getProperty("Password_name"))).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.id(prop.getProperty("login_button_id"))).click();


		String Page_title_login = driver.getTitle();
		System.out.println(Page_title_login);

		}

		
	

}
