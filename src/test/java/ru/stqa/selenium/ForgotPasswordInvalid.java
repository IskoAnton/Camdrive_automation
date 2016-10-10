package ru.stqa.selenium;


import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class ForgotPasswordInvalid extends TestNgTestBase {
  
  @Test
  public void testForgotPasswordInvalid() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("������ ������?")).click();
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("adsfdgfgfgs");
    driver.findElement(By.name("submit")).click();
    assertEquals(driver.findElement(By.cssSelector("div.error p")).getText(), "���������� ����� ������");
    driver.findElement(By.xpath("//input[@value='��������']")).click();
    assertEquals(driver.findElement(By.cssSelector("div.info-title")).getText(), "������ �������");
  }
}
