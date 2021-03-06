package accountEntry;


import org.testng.annotations.*;

import ru.stqa.selenium.TestNgTestBase;

import static org.testng.Assert.*;
import org.openqa.selenium.*;


public class LoginTrue extends TestNgTestBase {

  @Test
  public void testLoginTrue() throws Exception {
    driver.get(baseUrl + "/");
    String login = "tester5";
    String password = "tester5";
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys(login);
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys(password);
    driver.findElement(By.id("login")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//input[@value='�����']"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//input[@value='�����']")).click();
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
