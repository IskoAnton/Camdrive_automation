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
    driver.findElement(By.linkText("Забыли пароль?")).click();
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys(loginTrue);
    driver.findElement(By.name("submit")).click();
    assertEquals(driver.findElement(By.cssSelector("div.success p")).getText(), "На почтовый ящик отправлено письмо, содержащее дальнейшие указания по восстановлению пароля.");
    driver.findElement(By.xpath("//input[@value='Отменить']")).click();
    assertEquals(driver.findElement(By.cssSelector("div.info-title")).getText(), "Личный кабинет");
  }
}
