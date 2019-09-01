package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class demo_3 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.yahoo.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled3() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("uh-mail-link")).click();
    driver.findElement(By.id("login-username")).click();
    driver.findElement(By.id("login-username")).clear();
    driver.findElement(By.id("login-username")).sendKeys("tusharh_patel@yahoo.com");
    driver.findElement(By.id("login-signin")).click();
    driver.findElement(By.id("login-signin")).click();
    driver.findElement(By.id("login-passwd")).sendKeys("Tu786787");
    driver.findElement(By.id("login-signin")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[@role=button]")).click();;
	 driver.findElement(By.xpath("//select[@id='from']")).sendKeys("tusharpatel_india@yahoo.co.in");
	 driver.findElement(By.xpath("//input[@id='subject']")).sendKeys("about demo");
	 driver.findElement(By.name("text")).sendKeys("how are you and i am fine");
	 driver.findElement(By.name("action")).click();
	 
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
