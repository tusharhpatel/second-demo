package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_com {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://accounts.google.com/signin");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("identifierId")).sendKeys("tusharpatel.india@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tu786787");
		driver.findElement(By.className("CwaK9")).click();
		String title=driver.getTitle();
		System.out.println("Title="+title);
		
		String CurrentURl=driver.getCurrentUrl();
		System.out.println("CurrentUrl:"+CurrentURl);
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		//String footer=driver.findElement(By.className("e8yP4b null")).getText();
		//System.out.println("Footer="+footer);
		
		String link=driver.findElement(By.id("gb_71")).getAttribute("href");
		System.out.println("Attribute="+link);
		
		String tag=driver.f
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
