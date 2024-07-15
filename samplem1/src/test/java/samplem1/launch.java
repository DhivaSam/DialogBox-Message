package samplem1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {

	public static void main(String[] args) throws InterruptedException  {  
		
		 
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Downloads\\driver\\chromedriver-win64\\chromedriver.exe");  
		 
		  WebDriver driver=new ChromeDriver(); 
		
	
		  driver.get("https://makyee.com/");

		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//span[text()='Buy']")).click();
		  Thread.sleep(2000);
		  WebElement e1=driver.findElement(By.id("searchInputHeader"));
		  e1.click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@data-name='Palm Jumeirah']")).click();
		  driver.findElement(By.xpath("//span[@class='text-updater']")).click();
		  driver.findElement(By.xpath("//label[text()='Penthouse']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@href='/listings/url?order=lowest-price&city=como-residence&category=penthouse']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//li[@class='list-inline-item small-one-160 my-2 my-sm-0']")).click();
		  driver.findElement(By.xpath("//label[text()='Apartment']")).click();
		  Thread.sleep(2000);

		 driver.findElement(By.xpath("//td[@class='for-desk-mini'][7]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@class='fav_icon__khaled_alam'][1]")).click(); 
		  Thread.sleep(200);
		  String s1= driver.findElement(By.xpath("//h2[text()='Fail']")).getText();
			 System.out.println(s1);
		  String s= driver.findElement(By.xpath("//div[text()='You need to login first']")).getText();
		 System.out.println(s);
	}
}

