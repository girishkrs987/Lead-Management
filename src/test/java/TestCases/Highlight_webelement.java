package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;



public class Highlight_webelement {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();


		driver.get("http://beta.docnu.com");
		
		Thread.sleep(2000);
	WebElement DoctorLoginButin=driver.findElement(By.xpath("//a[@class='btn btn-primary btn-sm']"));
		
	flash(driver,DoctorLoginButin); 
		
	}
	
	public static void flash(WebDriver driver, WebElement element) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
	String Value=	element.getCssValue("background-color");
	
	for(int i=0; i<=50; i++) {
		
		changecolor("rgb(0,200,0)",driver,element); 
		changecolor(Value,driver,element);
	}
		
		
	}

	public static void changecolor(String color, WebDriver driver, WebElement element) {
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.background='"+color+"'",element);
		
		try {
			Thread.sleep(2000);
			
		}
		catch(Exception e) {
			
			
		}
	}
	
}
