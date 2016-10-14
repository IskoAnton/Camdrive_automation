package monitoring;


import org.testng.annotations.*;

import ru.stqa.selenium.TestNgTestBase;

import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class CheckOnlineMs2 extends TestNgTestBase {
  private WebDriver driver;


  @Test
  public void testCheckOnlineMs2() throws Exception {
    String ms2_channel_id = "7ff0d8bbfc199726562c93e3ac9795e0";
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.linkText("CD120(C141)_ms2_dev"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.linkText("CD120(C141)_ms2_dev")).click();
    driver.findElement(By.id("screen_2")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//object[@id='flash_2']//param[contains(@value, '" + ms2_channel_id + "')]"))) break;  } catch (Exception e) {}
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
