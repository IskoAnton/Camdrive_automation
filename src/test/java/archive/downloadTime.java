package archive;

import org.testng.annotations.*;
import ru.stqa.selenium.TestNgTestBase;
import org.openqa.selenium.*;

public class downloadTime extends TestNgTestBase {

  @Test
  public void testDownloadTime() throws Exception {
    driver.get(baseUrl + "/archive");
    driver.findElement(By.xpath("//img[@alt='Выберите время']")).click();
    driver.findElement(By.xpath("//dd[@id='ui_tpicker_hour_downloadtime']/a")).click();
    driver.findElement(By.xpath("//dd[@id='ui_tpicker_minute_downloadtime']/a")).click();
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
