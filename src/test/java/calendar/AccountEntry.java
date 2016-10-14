package calendar;


import org.testng.annotations.*;

import ru.stqa.selenium.TestNgTestBase;

import static org.testng.Assert.*;
import org.openqa.selenium.*;


public class AccountEntry extends TestNgTestBase {


  @Test
  public void testAccountEntry() throws Exception {
    driver.get(baseUrl + "/");
    String login = "monitoring";
    String password = "monitoring";
    driver.findElement(By.xpath("//input[@name='username']")).clear();
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(login);
    driver.findElement(By.xpath("//input[@name='password']")).clear();
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    driver.findElement(By.id("login")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("".equals(driver.findElement(By.id("screen_1")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }
    
  }
 
}
