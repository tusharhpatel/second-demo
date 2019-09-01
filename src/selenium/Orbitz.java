package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Orbitz {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orbitz.com/");
		
		driver.findElement(By.id("tab-flight")).click();
		driver.findElement(By.xpath("input[@type='text']")).sendKeys("Baltimore, MD (BWI-Baltimore Washington Intl. Thurgood Marshall)");
		driver.findElement(By.id("package-destination-hp-package" )).sendKeys("Boston, MA (BOS-Logan Intl.");
		driver.findElement(By.id("package-departing-hp-package")).sendKeys("07/30/2019");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
