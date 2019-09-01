package selenium;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.jetty.html.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoClass1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.orbitz.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("primary-header-flight")).click();
	String	title= driver.getTitle();
	System.out.println("Title="+ title );
	
		Thread.sleep(2000);
		
		driver.findElement(By.id("flight-origin-flp")).sendKeys("bwi");
		String Flighttitle=driver.getTitle();
		System.out.println("Title="+ Flighttitle);
		
		driver.findElement(By.id("flight-destination-flp")).sendKeys("IAD");
		driver.findElement(By.xpath("//input[@name='starDate']")).click();
		
		
		 
		
	
	
		
	}

}
