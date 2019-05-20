package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sayem.util.Xls_Reader;

public class webtable_excerisie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//driver.get("http://beta.docnu.com/");
			driver.get("http://beta.docnu.com/");
		 driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
		// Thread.sleep(2000);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.id("UserName")).sendKeys("9740049222");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.id("DocLoginpassword")).sendKeys("Test@@124");
		/// Thread.sleep(2000);
		 driver.findElement(By.id("DoctorLogin")).click();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//i[contains(@class,'fa fa-share')]")).click(); // click om myreferrals menu
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href = '/MyReferal/TodayReferal']")).click(); // clcik my referrals ubmneu 

			List<WebElement> table=	driver.findElements(By.xpath("//tr[@role='row']")); 
			
			// find the size of the webtable
			
			System.out.println(table.size());
			
			
			// xpath of patient couliumn
			
			
			//*[@id="DataTables_Table_0"]/tbody/tr[1]/td[3]
		String 	BeforeXpath="//*[@id=\"DataTables_Table_0\"]/tbody/tr[";
			String Afterxpath="]/td[3]"; 
			
			
			// xpath of Referred B couliumn
			
			
						//*[@id="DataTables_Table_0"]/tbody/tr[1]/td[3]
			String 	BeforeXpath_Ref_By="//*[@id=\"DataTables_Table_0\"]/tbody/tr[";
			String Afterxpath_Ref_By="]/td[4]"; 		
			
			
			
			Xls_Reader reader=new Xls_Reader("C:\\Users\\Girish\\Desktop\\Selenium_Data.xlsx"); 
			
			reader.addSheet("Docnu_Test_Data");
			reader.addColumn("Docnu_Test_Data", "Patients");
			reader.addColumn("Docnu_Test_Data", "Referred By");
						
			
			
			for (int i=1; i<=table.size();i++) {
				
				String Actual_data= driver.findElement(By.xpath(BeforeXpath+i+Afterxpath)).getText(); 
				String Actual_data_referredby= driver.findElement(By.xpath(BeforeXpath_Ref_By+i+Afterxpath_Ref_By)).getText(); 
				
				
				System.out.println(Actual_data);
				System.out.println(Actual_data_referredby);
				
				reader.setCellData("Docnu_Test_Data", "Patients", i+1, Actual_data);
				reader.setCellData("Docnu_Test_Data", "Referred By", i+1, Actual_data_referredby);
				
			}
			
	}

}
