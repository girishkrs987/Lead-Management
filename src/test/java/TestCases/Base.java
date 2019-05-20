package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	
	public static WebDriver driver ; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	}
	
	public static void intializtion() throws FileNotFoundException {
		Properties prop = new Properties();
		//FileInputStream ip; 
		
		FileInputStream ip=new FileInputStream("C:\\Users\\Girish\\eclipse-workspace\\Lead_Management\\ObjectRepository.properties");
		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.get(prop.getProperty("URL"));
		
	}

	// this method for take screenshots 
	public static void failed(WebDriver driver,String Methodname) throws IOException {
		
		
		// TakesScreenshot is a Interface which Indicates a driver that can capture a screenshot and store it in different ways.
		// OutputType is a interface which Defines the output type for a screenshot.
		// File - Obtain the screenshot into a temporary file that will be deleted once the JVM exits. 
		// and It is up to users to make a copy of this file
		//File is a class 
		
		// getScreenshotAs is a method - Capture the screenshot and store it in the specified location. 

		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		// FileUtils its a class which will be using to work with files and directories in Java. 
		//The examples read, write, copy, create, delete, list and get size of files.
		
		FileUtils.copyFile(screenshotFile, new File ("C:\\Users\\Girish\\eclipse-workspace\\Lead_Management\\Screen_Shots\\"+Methodname+"-"+".jpg"));
	}
}
