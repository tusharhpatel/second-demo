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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Clickandhold {
	WebDriver driver= null;
	

	@Before
	public void setUp() throws Exception {
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		
		
	}

	@Test
	public void tearDown() throws Exception {
		WebElement selectableitems=driver.findElement(By.id("selectable"));
		Actions doubleclick= new Actions(driver);
		doubleclick.click(selectableitems).release();
		
	    
		
	}


	}
}