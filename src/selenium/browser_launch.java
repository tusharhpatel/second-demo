package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;
import com.thoughtworks.selenium.Wait.WaitTimedOutException;


public class browser_launch {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.id("btn2")).click();
		//Actions action= new Actions(driver);
		//WebDriverWait wait= new WebDriverWait(driver,3);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//image[@id='header']")));
		
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Anjali");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Patel");
		
		Select dd= new Select(driver.findElement(By.id("Skills")));
		dd.selectByVisibleText("Art Design");
		
		 
		 
		 
		 
		 
		 
	}
	
	

}
