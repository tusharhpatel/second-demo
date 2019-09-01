package selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class annotation2 {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.out.print("open webbrowser");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/gmail/about/");
		Thread.sleep(3000);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws Exception {
		driver.findElement(By.linkText("Create an account")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Tushar");
		driver.findElement(By.id("lastName")).sendKeys("patel");
		driver.findElement(By.id("username")).sendKeys("tusharpatel.usa");
		Thread.sleep(2000);
		
	}
	

}
