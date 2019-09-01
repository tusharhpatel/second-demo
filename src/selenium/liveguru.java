package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class liveguru {

	public static void main(String[] args) {
	  WebDriver driver= new FirefoxDriver();
	  
	  driver.get("http://live.guru99.com/");
	  driver.manage().window().maximize();
	  System.out.println("browser open");
	  driver.getTitle();
	  String title= driver.getTitle();
	  System.out.println("Title="+ title);
	 // Assert.assertEquals("Home Page",title);
	  
	  driver.findElement(By.className("level0 ")).click();
	  driver.getTitle();
	  System.out.println("Title="+title);
	  WebElement Addtocart=driver.findElement(By.xpath("//button[@class='button btn-cart']"));
	  Addtocart.click();
	  
	  
	  
	  

	}

}
