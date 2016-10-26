package archive;

import org.testng.annotations.*;
import ru.stqa.selenium.TestNgTestBase;
import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class archiveVideo extends TestNgTestBase {

  @Test
  public void testArchiveVideo() throws Exception {
    driver.get(baseUrl + "/archive");
    driver.findElement(By.xpath("//div[@id='calendar']//td/div[contains(@class, 'item day')]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='time-intervals']//td//div[@class='time item  button' or @class='time item  detection' or @class='time item  constant']")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//object[@id='flash_1' and @style='visibility: visible;']"))) break; } catch (Exception e) {}
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
