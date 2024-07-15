package base;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseTest {

	
	public static WebDriver driver;
	
	
	
	@BeforeTest
	public void setUp() throws IOException  {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Downloads\\driver\\chromedriver-win64\\chromedriver.exe");  
		 driver=new ChromeDriver(); 
	
		  driver.get("https://makyee.com/");

		  driver.manage().window().maximize();
		  

			  
			
		}
	
	
	
	@AfterTest
public void taerDown() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
		
		driver.close();
	
		System.out.println("Tear down completed");
}
}
