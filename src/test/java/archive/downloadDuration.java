package archive;

import org.testng.annotations.*;
import ru.stqa.selenium.TestNgTestBase;
import org.openqa.selenium.*;


public class downloadDuration extends TestNgTestBase {

  @Test
  public void testDownloadDuration() throws Exception {
    driver.get(baseUrl + "/archive");
    driver.findElement(By.xpath("//img[@alt='Выберите длительность']")).click();
    driver.findElement(By.xpath("//dd[@id='ui_tpicker_minute_downloadduration']/a")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
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
