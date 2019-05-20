package TestCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class Login_testcase extends Base{

	
		@BeforeMethod
		public void setup_browser() throws FileNotFoundException {
			intializtion();
			
			
		}
		
//		@AfterMethod
//		
//		public void close_browser() {
//			driver.quit();
//		}
		
		
		@Test
		
		public void Login_Valid() throws IOException, InterruptedException {
			
			String Expecting="Dashboard";
		String ActualData=	Login.LoginTest("9985444702", "Testing123");
		System.out.println(ActualData);
		
		Assert.assertEquals(Expecting, ActualData);
		
		
		//	LoginTest();
			
			
		}
		
		

	}


