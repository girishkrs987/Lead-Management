package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium_practices.date_picker_javascript;



public class webtable   {
	//public static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//driver.get("http://beta.docnu.com/");
		 driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
		// Thread.sleep(2000);
		 driver.findElement(By.id("UserName")).sendKeys("9880062888");
		 driver.findElement(By.id("DocLoginpassword")).sendKeys("Puneeth@129");
		/// Thread.sleep(2000);
		 driver.findElement(By.id("DoctorLogin")).click();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//i[contains(@class,'fa fa-share')]")).click(); // click om myreferrals menu
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href = '/MyReferal/TodayReferal']")).click(); // clcik my referrals ubmneu 

	
		
			
	//*[@id="DataTables_Table_0"]/tbody/tr[1]/td[3]
	//*[@id="DataTables_Table_0"]/tbody/tr[2]/td[3]
	
	//*[@id="DataTables_Table_0"]/tbody/tr[1]/td[7]/a
	
	
	String BEforeXpath_ViewLink= "//*[@id=\"DataTables_Table_0\"]/tbody/tr[";
	
	String AfterXptah_ViewLink="]/td[3]";
	
	//*[@id="DataTables_Table_0"]/tbody/tr[0]/td[7]/a"}
	  
	//*[@id="DataTables_Table_0"]/tbody/tr[1]/td[3]/a
	//*[@id="DataTables_Table_0"]/tbody/tr[1]/td[9]/a
	//for (int i=0; i)
	
	//div[@id='labdivid']
	
	//@SuppressWarnings("unchecked")
	// List<WebElement> list=new List (driver.findElements(By.xpath("//div[@id='labdivid']")));
	
//	System.out.println(list.size());
	
//	
//for (int i=1; i<=6;i++) {
//
//String Name= driver.findElement(By.xpath(BEforeXpath_ViewLink+i+AfterXptah_ViewLink)).getText();
//System.out.println(Name);
//
//if (Name.contains(Name))
//driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr["+i+"]/td[7]/a")).click();
//
//Thread.sleep(2000);
//driver.findElement(By.xpath("//*[@id=\"ConfirmedLabReferalDetails\"]/div/div[2]/div[1]/button/span")).click();
//Thread.sleep(2000);
//}

driver.findElement(By.xpath("//td[contains(text(),'poorna')]/following-sibling::td//a[contains(text(),'View')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"ConfirmedLabReferalDetails\"]/div/div[2]/div[1]/button/span")).click();
Thread.sleep(2000);

}}
