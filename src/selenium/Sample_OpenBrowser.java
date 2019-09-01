package selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample_OpenBrowser {
	WebDriver driver= new FirefoxDriver();

	

	@Test
	public void test() {
		driver.manage().window().maximize();
		System.out.println("window maximize");
		driver.get("https://www.yahoo.com/");
		System.out.println("Open site");
		driver.quit();
		System.out.println("end of test");
		
		
		
	}

}
