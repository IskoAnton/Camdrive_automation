package languageCheck;

import org.testng.annotations.*;

import ru.stqa.selenium.TestNgTestBase;

import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class LanguageRus extends TestNgTestBase {

	@Test
  public void testLanguageRus() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//div[@class=\"form-header\"]//span[@class=\"selected\"]")).click();
    driver.findElement(By.xpath("//div[@class=\"form-header\"]//li[1]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("Личный кабинет".equals(driver.findElement(By.cssSelector("div.info-title")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    assertEquals(driver.findElement(By.xpath("//div[@id=\"login-box\"]//tr[1]//td[1]")).getText(), "Логин");
    assertEquals(driver.findElement(By.xpath("//div[@id=\"login-box\"]//tr[2]//td")).getText(), "Пароль");
    assertEquals(driver.findElement(By.id("login")).getAttribute("value"), "Войти");
    assertEquals(driver.findElement(By.xpath("//div[@id=\"login-box\"]//tr[3]//small")).getText(), "Запомнить меня");
    assertEquals(driver.findElement(By.xpath("//div[@id=\"login-box\"]//small/a")).getText(), "Забыли пароль?");
  }

}
