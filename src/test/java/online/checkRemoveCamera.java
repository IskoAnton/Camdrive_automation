package online;



import org.testng.annotations.*;
import ru.stqa.selenium.TestNgTestBase;
import static org.testng.Assert.*;
import org.openqa.selenium.*;


public class checkRemoveCamera extends TestNgTestBase {
 

  @Test
  public void testCheckRemoveCamera() throws Exception {
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//div[@id='jstree']//li[@class='jstree-last jstree-open']"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }
    Thread.sleep(10000);
    driver.findElement(By.id("deactivation-device")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//input[@value='Закрыть']"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//input[@value='Закрыть']")).click();
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
