package accountEntry;


import org.testng.annotations.*;

import ru.stqa.selenium.TestNgTestBase;

import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class ForgotPassword extends TestNgTestBase {

  @Test
  public void testForgotPassword() throws Exception {
    driver.get(baseUrl + "/");
    String loginTrue = "tester5";
    driver.findElement(By.linkText("������ ������?")).click();
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys(loginTrue);
    driver.findElement(By.name("submit")).click();
    assertEquals(driver.findElement(By.cssSelector("div.success p")).getText(), "�� �������� ���� ���������� ������, ���������� ���������� �������� �� �������������� ������.");
    driver.findElement(By.xpath("//input[@value='��������']")).click();
    assertEquals(driver.findElement(By.cssSelector("div.info-title")).getText(), "������ �������");
  }
}
