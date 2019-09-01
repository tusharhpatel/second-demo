package selenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestJunit {
	WebDriver driver= null;
	int i ;

	@Before
	public void testAdd() throws Exception {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://accounts.google.com/signin");
		driver.manage().window().maximize();
	}

	
		
	

	@After
	public void tearDown(TimeUnit TimeUnit) throws Exception {
		driver.findElement(By.id("identifierId")).sendKeys("tusharpatel.india@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tu786787");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		for(i=0;i<20;i++);
		{
		
		WebElement btn=driver.findElement(By.className("Cwak9"));
		{
		if(btn.isEnabled());
		System.out.println("button is enabled to login");
		
		driver.findElement(By.className("Cwak9")).click();
	}
	
		else if
		{
			System.out.println("button is disable");
		}
			
		}
		
	
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
