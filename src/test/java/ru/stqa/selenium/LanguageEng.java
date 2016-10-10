package ru.stqa.selenium;


import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;


public class LanguageEng extends TestNgTestBase {

  @Test
  public void testLanguageEng() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//div[@class=\"form-header\"]//li[2]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("Account".equals(driver.findElement(By.cssSelector("div.info-title")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    assertEquals(driver.findElement(By.xpath("//form[@action=\"http://ms4.camdrive.lan/\"]//tr[1]//td[1]")).getText(), "Login");
    assertEquals(driver.findElement(By.xpath("//form[@action=\"http://ms4.camdrive.lan/\"]//tr[2]//td")).getText(), "Password");
    assertEquals(driver.findElement(By.id("login")).getAttribute("value"), "Login");
    assertEquals(driver.findElement(By.xpath("//form[@action=\"http://ms4.camdrive.lan/\"]//tr[3]//small")).getText(), "Remember me");
    assertTrue(driver.findElement(By.linkText("Forgot your password?")).getText().matches("^exact:Forgot your password[\\s\\S]$"));
  }

}
