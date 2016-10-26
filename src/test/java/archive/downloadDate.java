package archive;


import org.testng.annotations.*;

import ru.stqa.selenium.TestNgTestBase;


import org.openqa.selenium.*;


public class downloadDate extends TestNgTestBase {


  @Test
  public void testDownloadDate() throws Exception {
    driver.get(baseUrl + "/archive");
    driver.findElement(By.cssSelector("img.ui-datepicker-trigger")).click();
    driver.findElement(By.linkText("17")).click();
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
