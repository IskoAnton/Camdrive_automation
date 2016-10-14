package online;

import org.testng.annotations.*;
import ru.stqa.selenium.TestNgTestBase;
import static org.testng.Assert.*;
import org.openqa.selenium.*;


public class scale extends TestNgTestBase {
 
  @Test
  public void testScale() throws Exception {
    driver.get(baseUrl + "/online");
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//div[@class='dashboard']//img[@title='Формат 1:1'])[1]")).click();
    Thread.sleep(3000);
    assertTrue(isElementPresent(By.xpath("//div[@id='1' and contains(@class, 'b')]")));
    driver.findElement(By.xpath("//div[@class='dashboard']//img[@title='Формат 1:4']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//div[@class='dashboard']//img[@title='Формат 1:1'])[2]")).click();
    Thread.sleep(3000);
    assertTrue(isElementPresent(By.xpath("//div[@id='2' and contains(@class, 'b')]")));
    driver.findElement(By.xpath("(//div[@class='dashboard']//img[@title='Формат 1:4'])[2]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//div[@class='dashboard']//img[@title='Формат 1:1'])[3]")).click();
    Thread.sleep(3000);
    assertTrue(isElementPresent(By.xpath("//div[@id='3' and contains(@class, 'b')]")));
    driver.findElement(By.xpath("(//div[@class='dashboard']//img[@title='Формат 1:4'])[3]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//div[@class='dashboard']//img[@title='Формат 1:1'])[4]")).click();
    Thread.sleep(3000);
    assertTrue(isElementPresent(By.xpath("//div[@id='4' and contains(@class, 'b')]")));
    driver.findElement(By.xpath("(//img[@title='Формат 1:4'])[4]")).click();
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
