package monitoring;

import org.testng.annotations.*;

import ru.stqa.selenium.TestNgTestBase;

import static org.testng.Assert.*;
import org.openqa.selenium.*;


public class CheckOnlineMs1 extends TestNgTestBase {

  @Test
  public void testCheckOnlineMs1() throws Exception {
    String ms1_channel_id = "aee40e829262b7930f529c4fee6d326a";
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.linkText("CD100(E75A)_ms1_dev"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.linkText("CD100(E75A)_ms1_dev")).click();
    driver.findElement(By.id("screen_1")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//object[@id='flash_1']//param[contains(@value, '" + ms1_channel_id + "')]"))) break; } catch (Exception e) {}
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
