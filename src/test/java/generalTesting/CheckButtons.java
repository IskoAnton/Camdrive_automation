package generalTesting;


import org.testng.annotations.*;

import ru.stqa.selenium.TestNgTestBase;
import static org.testng.Assert.*;
import org.openqa.selenium.*;


public class CheckButtons extends TestNgTestBase {

  @Test
  public void testCheckButtons() throws Exception {
    driver.get(baseUrl + "/online");
    driver.findElement(By.xpath("//td//a[@href=\"http://ms4.camdrive.lan/archive\"]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.id("calendar"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//td//a[@href=\"http://ms4.camdrive.lan/observers\"]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("div#body input.create"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//td//a[@href=\"http://ms4.camdrive.lan/settings/tariffs\"]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.id("tariff_preset_s"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//td//a[@href=\"http://ms4.camdrive.lan/payment\"]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("div#filter select.item"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//td//a[@href=\"http://ms4.camdrive.lan/information\"]")).click();
    driver.findElement(By.xpath("//td//a[@href=\"http://ms4.camdrive.lan/online\"]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.id("screens"))) break; } catch (Exception e) {}
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
