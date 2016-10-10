package ru.stqa.selenium;


import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;


public class LoginFalse extends TestNgTestBase{

  @Test
  public void testLoginFalse() throws Exception {
    driver.get(baseUrl + "/");
    String invalidLogin = "wrongLogin";
    String invalidPassword = "123456";
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys(invalidLogin);
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys(invalidPassword);
    driver.findElement(By.id("login")).click();
    assertEquals(driver.findElement(By.xpath("//div[@class='closable notification s error']//p")).getText(), "Ошибка идентификации. Проверьте правильность логина и введите Ваш пароль еще раз.");
  }

}
