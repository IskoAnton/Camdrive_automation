package monitoring;


import org.testng.annotations.*;
import ru.stqa.selenium.TestNgTestBase;
import static org.testng.Assert.*;
import org.openqa.selenium.*;


public class CheckOnlineMs5 extends TestNgTestBase {

  @Test
  public void testCheckOnlineMs5() throws Exception {
    String ms5_channel_id = "e6acd50066e5057039a8c217944e3e88";
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.linkText("CD120(EAF9)_ms5_serv"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.linkText("CD120(EAF9)_ms5_serv")).click();
    driver.findElement(By.id("screen_4")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//object[@id='flash_4']//param[contains(@value, '" + ms5_channel_id + "')]"))) break; } catch (Exception e) {}
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
