package online;


import org.testng.annotations.*;

import ru.stqa.selenium.TestNgTestBase;

import static org.testng.Assert.*;
import org.openqa.selenium.*;


public class checkMenu extends TestNgTestBase {

  @Test
  public void testCheckMenu() throws Exception {
    driver.get(baseUrl + "/online");
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//div[@id='jstree']//li/ul//ul//li[1]//a"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@id='jstree']//li/ul//ul//li[1]//a")).click();
    driver.findElement(By.id("screen_1")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//div[@id='1']//object[@style='visibility: visible;']"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//div[@id='jstree']//li/ul//ul//li[2]//a")).click();
    driver.findElement(By.id("screen_2")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//div[@id='2']//object[@style='visibility: visible;']"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//div[@id='jstree']//li/ul//ul//li[3]//a")).click();
    driver.findElement(By.id("screen_3")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//div[@id='3']//object[@style='visibility: visible;']"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//div[@id='jstree']//li/ul//ul//li[4]//a")).click();
    driver.findElement(By.id("screen_4")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//div[@id='4']//object[@style='visibility: visible;']"))) break; } catch (Exception e) {}
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
