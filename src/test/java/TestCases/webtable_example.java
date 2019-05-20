package TestCases;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sayem.util.Xls_Reader;
import java.util.List;



public class webtable_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//driver.get("http://beta.docnu.com/");
			driver.get("http://192.168.16.12/");
		 driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
		// Thread.sleep(2000);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.id("UserName")).sendKeys("9972921986");
		 driver.findElement(By.id("DocLoginpassword")).sendKeys("KRs117743");
		/// Thread.sleep(2000);
		 driver.findElement(By.id("DoctorLogin")).click();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//i[contains(@class,'fa fa-share')]")).click(); // click om myreferrals menu
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href = '/MyReferal/TodayReferal']")).click(); // clcik my referrals ubmneu 

			// xpath of column of Patient name 
			String BeforeXpath_patinet="//*[@id=\"DataTables_Table_0\"]/tbody/tr[";
			String AfterXpath_patinet="]/td[3]";
			
			
			// xpath of column of Ref BY 
			String BeforeXpath_patinet_Ref="//*[@id=\"DataTables_Table_0\"]/tbody/tr[";
			String AfterXpath_patinet_Ref="]/td[4]";
		
			
			// xpath of column of Ref BY Hospital 
						String BeforeXpath_Ref_By_Hospital="//*[@id=\"DataTables_Table_0\"]/tbody/tr[";
						String AfterXpath__Ref_By_Hospital="]/td[5]";
						
						// xpath of column of Preferred Date 
						String BeforeXpath_Pref_Date="//*[@id=\"DataTables_Table_0\"]/tbody/tr[";
						String AfterXpath__Pref_Date="]/td[6]";
	// xpath of column of Preferred Time 
	String BeforeXpath_Pref_Time="//*[@id=\"DataTables_Table_0\"]/tbody/tr[";
	String AfterXpath__Pref_Time="]/td[7]";					
						
	
	//*[@id="DataTables_Table_0"]/tbody/tr[1]/td[7]
			ArrayList <WebElement>irows =new ArrayList <WebElement>(driver.findElements(By.xpath("//tr[@role='row']")));
			
			System.out.println(irows.size());
			
			
			
			Xls_Reader reader=new Xls_Reader("C:\\Users\\Girish\\Desktop\\lead1.xlsx");
			
			if (reader.isSheetExist("TestData")) {
				
				
			}
		reader.addSheet("TestData");
			
			reader.addColumn("TestData", "Patients_name");
			reader.addColumn("TestData", "Ref By");
			reader.addColumn("TestData", "Ref By Hospital");
			reader.addColumn("TestData", "Preferred date");
			reader.addColumn("TestData", "Preferred Time");
			//*[@id="DataTables_Table_0_wrapper"]/div[2]/div
			//th[@tabindex='0' and text()='Patient']
			
			
			for (int i=1; i<=irows.size()-3;i++) {
				// xpath of column of Patient name 
				String PatientName=driver.findElement(By.xpath(BeforeXpath_patinet+i+AfterXpath_patinet)).getText();
				// xpath of column of Ref BY 
				String ReferredBy=driver.findElement(By.xpath(BeforeXpath_patinet_Ref+i+AfterXpath_patinet_Ref)).getText();
				// xpath of column of Referred By hospital
				String RefHopsital=driver.findElement(By.xpath(BeforeXpath_Ref_By_Hospital+i+AfterXpath__Ref_By_Hospital)).getText();
				// xpath of column of Preferred Date
				String PrefDate=driver.findElement(By.xpath(BeforeXpath_Pref_Date+i+AfterXpath__Pref_Date)).getText();
				
				// xpath of column of Preferred Time 
				
				String PrefTime=driver.findElement(By.xpath(BeforeXpath_Pref_Time+i+AfterXpath__Pref_Time)).getText();	
				System.out.println(PatientName);
				System.out.println(ReferredBy);
				
				System.out.println(RefHopsital);
				System.out.println(PrefDate);
				System.out.println(PrefTime);
				
				int j=i+1;
				reader.setCellData("TestData", "Patients_name", j, PatientName);
				reader.setCellData("TestData", "Ref By", j, ReferredBy);
				reader.setCellData("TestData", "Ref By Hospital", j, RefHopsital);
				reader.setCellData("TestData", "Preferred date", j, PrefDate);
				reader.setCellData("TestData", "Preferred Time", j, PrefTime);
				

	}

}}
