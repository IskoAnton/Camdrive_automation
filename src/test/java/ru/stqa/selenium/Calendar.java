package ru.stqa.selenium;


import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;



public class Calendar extends TestNgTestBase {
 

  @Test
  public void testCalendar() throws Exception {
    driver.get(baseUrl + "/online");
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//div[@id='jstree']//li/ul//li[1]//a"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//div[@id='jstree']//li/ul//li[1]//a")).click();
    driver.findElement(By.linkText("Архив")).click();
    driver.findElement(By.cssSelector("img.ui-datepicker-trigger")).click();
    assertTrue(isElementPresent(By.xpath("//div[@id='ui-datepicker-div' and contains(@style, 'display: block;')]")));
    driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//tr[2]//td[4][contains(@data-handler, 'selectDay')]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//div[@id='ui-datepicker-div' and contains(@style, 'display: none;')]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
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

 
}
