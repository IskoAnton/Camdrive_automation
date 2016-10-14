package monitoring;

import org.testng.annotations.*;

import ru.stqa.selenium.TestNgTestBase;

import static org.testng.Assert.*;
import org.openqa.selenium.*;


public class CheckOnlineMs6 extends TestNgTestBase {



  @Test
  public void testCheckOnlineMs6() throws Exception {
    String ms6_channel_id = "23d6fb09e101dc587b8b16db3cf7b5dd";
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.linkText("CD600(EF78)_ms6_serv"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.linkText("CD600(EF78)_ms6_serv")).click();
    driver.findElement(By.id("screen_1")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//object[@id='flash_1']//param[contains(@value, '" + ms6_channel_id + "')]"))) break; } catch (Exception e) {}
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
