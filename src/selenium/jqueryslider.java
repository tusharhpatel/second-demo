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

public class jqueryslider {
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
	WebElement dragElementfrom= driver.findElement(By.xpath("//*[@id='slider']/span"));
	new Actions(driver).dragAndDropBy(dragElementfrom, 100, 0).build().perform();
	Thread.sleep(3000);
	
	new Actions(driver).clickAndHold(dragElementfrom).moveByOffset(100, 0).release().perform();
	Thread.sleep(2000);
	new Actions(driver).dragAndDropBy(dragElementfrom, -100, -100).build().perform();
	
	}

	@After
	public void test() {
		driver.quit();
		driver.close();
	}

}
