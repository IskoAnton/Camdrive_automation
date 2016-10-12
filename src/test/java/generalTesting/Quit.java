package generalTesting;

import org.testng.annotations.*;
import ru.stqa.selenium.TestNgTestBase;
import org.openqa.selenium.*;

public class Quit extends TestNgTestBase {

  @Test
  public void testQuit() throws Exception {
    driver.get(baseUrl + "/online");
    driver.findElement(By.xpath("//input[@value='Выйти']")).click();
  }
}
