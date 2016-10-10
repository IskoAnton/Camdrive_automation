package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LanguageAz {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://camdrive.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testLanguageAz() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//div[@class=\"form-header\"]//li[3]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("Şəxsi kabinet".equals(driver.findElement(By.cssSelector("div.info-title")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    assertEquals(driver.findElement(By.xpath("//form[@action=\"http://ms4.camdrive.lan/\"]//tr[1]//td[1]")).getText(), "Loqin");
    assertEquals(driver.findElement(By.xpath("//form[@action=\"http://ms4.camdrive.lan/\"]//tr[2]//td")).getText(), "Parol");
    assertEquals(driver.findElement(By.id("login")).getAttribute("value"), "Daxil olun");
    assertEquals(driver.findElement(By.xpath("//form[@action=\"http://ms4.camdrive.lan/\"]//tr[3]//small")).getText(), "Məni yadda saxla");
    assertTrue(driver.findElement(By.linkText("Parolu unutmuzunuz?")).getText().matches("^exact:Parolu unutmuzunuz[\\s\\S]$"));
  }

  @AfterClass(alwaysRun = true)
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
