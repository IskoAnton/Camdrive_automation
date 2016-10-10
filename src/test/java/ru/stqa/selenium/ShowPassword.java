package ru.stqa.selenium;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class ShowPassword extends TestNgTestBase {
 
  private StringBuffer verificationErrors = new StringBuffer();

 
  @Test
  public void testShowPassword() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("tester5");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("tester5");
    driver.findElement(By.cssSelector("div.show-password-link")).click();
    try {
      assertEquals(driver.findElement(By.name("password")).getAttribute("value"), "tester5");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }
}
