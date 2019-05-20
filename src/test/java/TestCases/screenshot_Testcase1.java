package TestCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;


@Listeners(Clistners.class)
public class screenshot_Testcase1 extends Base {

	
	@BeforeMethod
	public void setup() throws FileNotFoundException {
		
		intializtion();
	}
	
	@AfterMethod
	public static void clsoebrowser() {
		
		driver.quit();
	}
	
	
	@Test
	public static void Login_test1() throws IOException, InterruptedException {
		Login login=new Login(); 
		String ActualData= Login.LoginTest("Rashiadmin", "Admin@@2019"); 
		String ExpectedValue="Dashboard"; 
		
		Assert.assertEquals(ExpectedValue, ActualData);
		
	}
	
	
	
	@Test
	public static void Login_test2() throws IOException, InterruptedException {
		Login login=new Login(); 
		String ActualData= Login.LoginTest("Rashiadmin", "Admin@@2019"); 
		String ExpectedValue="Dashboard9"; 
		
		Assert.assertEquals(ExpectedValue, ActualData);
		
	
	

}
}