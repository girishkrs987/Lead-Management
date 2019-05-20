package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Login extends Base{

	public static void main(String[] args) {
		
//			try {
//				intializtion();
////				File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
////				FileUtils.copyFile(screenshotFile, new File ("C:\\Users\\Girish\\eclipse-workspace\\Lead_Management\\Screen_Shots\\testimag1.jpg"));
//				
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
//			// TODO Auto-generated catch block
//	
//			try {
//				LoginTest("9972921986", "Test@123");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		
			// TODO Auto-generated catch block
		
	}

	
	public static String LoginTest (String Username, String Password) throws IOException, InterruptedException  {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
			
			driver.findElement(By.xpath("//a[@class='btn btn-primary btn-sm']")).click();
			
			driver.findElement(By.id("UserName")).sendKeys(Username);
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			Thread.sleep(2000);
			driver.findElement(By.id("DocLoginpassword")).sendKeys(Password);

			driver.findElement(By.id("DoctorLogin")).click();
			String ExpectedValue=driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
			
			WebElement element=driver.findElement(By.xpath("//input[@id='AppointmentDate']")); 
			element.click();
			List<WebElement> var=	driver.findElements(By.xpath("//select[@class='ui-datepicker-year']")); 
			
			
			Select var1= new Select(	(WebElement) driver.findElements(By.xpath("//select[@class='ui-datepicker-year']"))); 
			
			var1.selectByVisibleText("2021");
			var1.selectByIndex(0);
			
			//var1.selectByValue(arg0);
			
			var.size();
			
			for(WebElement c:var) {
				
				System.out.println(c.getText());
				
				
			}
			
			//System.out.println(ExpectedValue);
		//return ExpectedValue;
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(screenshotFile, new File ("C:\\Users\\Girish\\eclipse-workspace\\Lead_Management\\Screen_Shots\\testimag.jpg"));
			
			return ExpectedValue;

		
	}
	
	
}
