package ru.stqa.selenium;


import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class AccountEntry extends TestNgTestBase {

  @Test
  public void testAccountEntry() throws Exception {
    driver.get(baseUrl + "/");
    String login = "tester5";
    String password = "tester5";
    driver.findElement(By.xpath("//input[@name='username']")).clear();
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(login);
    driver.findElement(By.xpath("//input[@name='password']")).clear();
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    driver.findElement(By.id("login")).click();
    

  }

}
