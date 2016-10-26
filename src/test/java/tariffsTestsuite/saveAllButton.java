package tariffsTestsuite;

import org.testng.annotations.*;
import ru.stqa.selenium.TestNgTestBase;
import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class saveAllButton extends TestNgTestBase {

  @Test
  public void testSavaAllButton() throws Exception {
    driver.findElement(By.xpath("//div[@id='contents']/div[2]/div/div[2]/button[2]")).click();
    driver.findElement(By.xpath("//button[@type='button']")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//div[@id='ajaxnotice']/div[@style='display: block;']"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    assertTrue(driver.findElement(By.xpath("//div[@id='ajaxnotice']/div[@style='display: block;']/span/p")).getText().matches("^[\\s\\S]*Дата применения тарифа[\\s\\S]*для данной камеры[\\s\\S]*$"));
    driver.findElement(By.linkText("close")).click();
    driver.findElement(By.cssSelector("button.tariff-button.save")).click();
    driver.findElement(By.xpath("//button[2][@type='button']")).click();
    assertFalse(isElementPresent(By.xpath("//div[@id='ajaxnotice']/div[@style='display: block;']")));
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
