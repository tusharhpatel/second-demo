package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flint {
	WebDriver driver;
    @Before
	public void setup() {
	}{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://accounts.google.com/signin");
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	    @Test
		public void Flint_login() {
		}{
		driver.findElement(By.id("identifierId")).sendKeys("tusharpatel.india@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tu786787");
		driver.findElement(By.className("CwaK9")).click();
		String title=driver.getTitle();
		System.out.println("Title="+title);
		
		String CurrentURl=driver.getCurrentUrl();
		System.out.println("CurrentUrl:"+CurrentURl);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().to("https://www.facebook.com/");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().back();
		}
		@After
		public void cleanup() {
		}{
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


