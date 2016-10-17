package online;

import org.testng.annotations.*;

import ru.stqa.selenium.TestNgTestBase;

import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class openTree extends TestNgTestBase {

  @Test
  public void testOpenTree() throws Exception {
    driver.get(baseUrl + "/online");
    Thread.sleep(5000);
    driver.findElement(By.cssSelector("ins.jstree-icon")).click();
    assertTrue(isElementPresent(By.xpath("//div[@id='jstree']//li[contains(@class, 'jstree-closed')]")));
    driver.findElement(By.cssSelector("ins.jstree-icon")).click();
    assertTrue(isElementPresent(By.xpath("//div[@id='jstree']//li[contains(@class, 'jstree-open')]")));
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
