package tariffsTestsuite;

import org.testng.annotations.*;
import ru.stqa.selenium.TestNgTestBase;
import static org.testng.Assert.*;
import org.openqa.selenium.*;


public class tariffCorporate extends TestNgTestBase {

  @Test
  public void testTariffCorporate() throws Exception {
    driver.findElement(By.xpath("//ul[@id='tariff_preset_s']/li[6]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//div[@id='contents']//li[6][@data-item='tariff']"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//div[@id='contents']//li[6][@data-item='tariff']")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//ul[@id='quality_preset_s']/li[4][contains(@class, 'selected')]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//ul[@id='duration_s']//li[2][contains(@class, 'selected')]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//ul[@id='quantity_s']//li[4][contains(@class, 'selected')]"))) break; } catch (Exception e) {}
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
