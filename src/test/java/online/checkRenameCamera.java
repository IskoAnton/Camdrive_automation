package online;


import org.testng.annotations.*;
import ru.stqa.selenium.TestNgTestBase;
import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class checkRenameCamera extends TestNgTestBase {

  @Test
  public void testCheckRenameCamera() throws Exception {
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//div[@id='jstree']//li[@class='jstree-last jstree-open']"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }
    
    Thread.sleep(2000);
    driver.findElement(By.id("rename-channel")).click();
    assertTrue(isElementPresent(By.cssSelector("input.jstree-rename-input")));
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
