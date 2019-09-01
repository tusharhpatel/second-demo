package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class automation_practice {

	public static void main(String[] args) {
	
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.className("sf-with-ul")).click();
		driver.findElement(By.className("replace-2x")).click();
		driver.findElement(By.className("color_pick")).click();
		
		
        
	}

}
