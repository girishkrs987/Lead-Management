package TestCases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;


// use the listener annotations to call the take screenshots methods from the custom listner class 

@Listeners(CustomListener.class)
public class Screenshots_TestCase  extends Base{

static Login login; 
@BeforeMethod()
public void setup() throws FileNotFoundException {
	
	intializtion();
	
}

@AfterMethod()
public void TearDown() {
	
	//driver.findElement(By.xpath("//img[@src=' /images/usr_pro.jpg']")).click();
	
	WebDriverWait wait= new WebDriverWait(driver, 20);
	//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@id='BtnLogout']")))).click();
	
	
			
			//a[@id='BtnLogout']
	driver.quit();
}

@Test
public static  void Login_valid() throws InterruptedException, IOException {
	
	login=new Login(); 
	
	String Expected="Dashboard";
	String ActualValue=login.LoginTest("9972921986", "Test@123");
	
	
	System.out.println(ActualValue);
	
	Thread.sleep(3000);
	Assert.assertEquals(ActualValue, Expected);
	
	//Assert.assertEquals();
	//Assert.assertEquals(expected, actual);
}

@Test
public static  void Home_page() throws FileNotFoundException, InterruptedException {
	

	
	//System.out.println(ActualValue);
	Thread.sleep(3000);
	Assert.assertEquals(true, false);
	
	
	//Assert.assertEquals();
	//Assert.assertEquals(expected, actual);
}
@Test
public static void test12() throws IOException {
	Assert.assertEquals(false, true);
	

}
}
