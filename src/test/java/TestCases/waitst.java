package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitst {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
			driver.get("http://beta.docnu.com/");
			//Thread.sleep(5000);
			
			 driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
			// Thread.sleep(2000);
			// Thread.sleep(10000);
	
			 
			 driver.findElement(By.id("UserName")).sendKeys("9880062888");
			 driver.findElement(By.id("DocLoginpassword")).sendKeys("Puneeth@129");
			// Thread.sleep(2000);
			 driver.findElement(By.id("DoctorLogin")).click();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
			 //Thread.sleep(2000);
			 
			 WebDriverWait wait = new WebDriverWait(driver,10);
			 
			 WebElement button=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div[1]/section/div[1]/a"));
			 
			// wait.until(ExpectedConditions.visibilityOf(button)); 
			 wait.until(ExpectedConditions.elementToBeClickable(button));
			 
			 
			// driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div[1]/section/div[1]/a")).click();

	}

}
