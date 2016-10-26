package tariffsTestsuite;


import org.testng.annotations.*;
import ru.stqa.selenium.TestNgTestBase;
import static org.testng.Assert.*;
import org.openqa.selenium.*;


public class goToSchedule extends TestNgTestBase {


  @Test
  public void testGoToSchedule() throws Exception {
    driver.findElement(By.id("pass-schedule")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.id("schedule"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.linkText("Тарифы")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("button.tariff-button.save"))) break; } catch (Exception e) {}
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
