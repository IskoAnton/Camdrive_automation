package online;


import org.testng.annotations.*;
import ru.stqa.selenium.TestNgTestBase;
import static org.testng.Assert.*;
import org.openqa.selenium.*;


public class deleteScreen extends TestNgTestBase {

  @Test
  public void testDeleteScreen() throws Exception {
    driver.get(baseUrl + "/online");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//img[@title='Закрыть']")).click();
    assertTrue(isElementPresent(By.xpath("//div[@id='1']/div[@style='display: none;']")));
    driver.findElement(By.xpath("(//img[@title='Закрыть'])[2]")).click();
    assertTrue(isElementPresent(By.xpath("//div[@id='2']/div[@style='display: none;']")));
    driver.findElement(By.xpath("(//img[@title='Закрыть'])[3]")).click();
    assertTrue(isElementPresent(By.xpath("//div[@id='3']/div[@style='display: none;']")));
    driver.findElement(By.xpath("(//img[@title='Закрыть'])[4]")).click();
    assertTrue(isElementPresent(By.xpath("//div[@id='4']/div[@style='display: none;']")));
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
