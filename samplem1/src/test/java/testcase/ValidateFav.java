package testcase;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.BaseTest;

public class ValidateFav extends BaseTest{
	@Test
	public  void ValidFavv() throws InterruptedException  {  
		
		// to check
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//span[text()='Buy']")).click();
		 // Thread.sleep(2000);
		  WebElement e1=driver.findElement(By.id("searchInputHeader"));
		  e1.click();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//a[@data-name='Palm Jumeirah']")).click();
		  driver.findElement(By.xpath("//span[@class='text-updater']")).click();
		  driver.findElement(By.xpath("//label[text()='Penthouse']")).click();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//a[@href='/listings/url?order=lowest-price&city=como-residence&category=penthouse']")).click();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//li[@class='list-inline-item small-one-160 my-2 my-sm-0']")).click();
		  driver.findElement(By.xpath("//label[text()='Apartment']")).click();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		 driver.findElement(By.xpath("//td[@class='for-desk-mini'][7]")).click();
		  
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	@Test
	public void assetCheck() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//div[@class='fav_icon__khaled_alam'][1]")).click(); 
		  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		  String s1= driver.findElement(By.xpath("//h2[text()='Fail']")).getText();
		  System.out.println(s1);
		  String s= driver.findElement(By.xpath("//div[text()='You need to login first']")).getText();
		  System.out.println(s);
		  String actual="You need to login first";
		  assertEquals(actual,s);
		  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		 
	}

}
