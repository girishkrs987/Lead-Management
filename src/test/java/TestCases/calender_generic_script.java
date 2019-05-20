package TestCases;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;




public class calender_generic_script {
	public static WebDriver driver;
	
	Logger log= Logger.getLogger(calender_generic_script.class);
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		BasicConfigurator.configure();  // Use this BasicConfigurator class to quickly configure the package.
		
		// Configure Method - Initializes the log4net system with a default configuration.
		
		Logger log = Logger.getLogger(calender_generic_script.class.getName()); 
		
		
		Properties prop = new Properties();
		//FileInputStream ip; 
		
		FileInputStream ip=new FileInputStream("C:\\Users\\Girish\\eclipse-workspace\\Lead_Management\\ObjectRepository.properties");
		prop.load(ip);
		
		
//System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
          String bw=  prop.getProperty("Browser"); 
          String url_ads=    prop.getProperty("URL");
          System.out.println(bw);

          System.out.println(url_ads);
          
          if (bw.equals("Chrome")) {
        	  
        	  System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
        	   driver = new ChromeDriver ();
    		driver.manage().window().maximize();
//      			
        	  
          }
          
         else {
        	  System.setProperty("webdriver.geckodriver.driver", "C:/Users/Girish/Downloads/geckodriver-v0.20.0-win64/geckodriver.exe");
        	   driver = new FirefoxDriver ();
    		driver.manage().window().maximize();
//      		
        	  
          }
          
          
//		WebDriver driver = new ChromeDriver ();
//		driver.manage().window().maximize();
	//driver.get("http://beta.docnu.com/");
driver.get(url_ads);
log.info("enter the beta docnu url adds ");

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.findElement(By.xpath(prop.getProperty("Doctor_Login_Button_xpath"))).click(); 
log.info("click on Doctor login button");

driver.findElement(By.id(prop.getProperty("Username_id"))).sendKeys(prop.getProperty("User_name"));
log.info("input valid user name");
driver.findElement(By.id(prop.getProperty("Password_id"))).sendKeys(prop.getProperty("Password"));

log.info("input valid passowrd");
		driver.findElement(By.id(prop.getProperty("Login_button_id"))).click();
		
		log.info("clcik login button");
		
		
          //prop.get(url_ads); 
        


//			
//log.debug("launching docnu application");
//			//Thread.sleep(2000);
//			
//			 driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
//			 
//			 log.info("click on doctor login button");
//			 Thread.sleep(2000);
//			 driver.findElement(By.id("UserName")).sendKeys("9880062888");
//			 
//			 log.info("enter the user name ");
//			 driver.findElement(By.id("DocLoginpassword")).sendKeys("Puneeth@129");
//			 log.info("enter the password ");
//			 Thread.sleep(2000);
//			 driver.findElement(By.id("DoctorLogin")).click();
//			 
//			 log.info("click login button ");
//			 
//			 Thread.sleep(3000);
	//	 WebElement calender_textbox=driver.findElement(By.xpath("//input[contains(@id,'AppointmentDate')]"));
//			 
//			 calender_textbox.click();
//			 
//			 String date = "9/Jun/2020"; 
//			 
//			 // split the date from forward slash and assigen into array varible.
//			 
//			 String array[]=date.split("/");
//			 
//			 String day =array[0];
//			 String month= array[1];
//			 String year= array[2];
//			 
//			 // month dropdown control 
//			 Select select1 = new  Select(driver.findElement(By.xpath("//select[contains(@class,'ui-datepicker-month')]")));
//			 
//			 select1.selectByVisibleText(month);		
//			 // Year dropdown control 
//			 
//			 Select select2=new Select(driver.findElement(By.xpath("//select[contains(@class,'ui-datepicker-year')]")));
//			 
//			 select2.selectByVisibleText(year);
//			 
//			 String BeforeXpath="//a[text()='";
//			 String AfterXpath="']";
//			 
//			 // select date by usng custom xpath 
//			 driver.findElement(By.xpath(BeforeXpath+day+AfterXpath)).click();
//					 
//			 
//			 Select select3= new Select(driver.findElement(By.xpath(BeforeXpath+day+AfterXpath)));
////			 
//		 select3.selectByVisibleText(day);
//			 
			//a[text()='30']
			 
			 
			 
			//select[contains(@class,'ui-datepicker-year')]
			 
		//	 System.out.println(array[0]); 
			 
			 
			 
			 
//			 for (int i=0; i<array.length;i++) {
//				 
//				 
//				 
//				 System.out.println(array[i]);
//				 
//				 
//			 }


	}

}
