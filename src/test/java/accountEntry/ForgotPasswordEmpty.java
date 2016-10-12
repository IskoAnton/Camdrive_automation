package accountEntry;


import org.testng.annotations.*;

import ru.stqa.selenium.TestNgTestBase;

import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class ForgotPasswordEmpty extends TestNgTestBase {

  @Test
  public void testForgotPasswordEmpty() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("������ ������?")).click();
    driver.findElement(By.name("submit")).click();
    assertEquals(driver.findElement(By.cssSelector("p")).getText(), "��������� ������� �����.");
    driver.findElement(By.xpath("//input[@value='��������']")).click();
    assertEquals(driver.findElement(By.cssSelector("div.info-title")).getText(), "������ �������");
  }

}
