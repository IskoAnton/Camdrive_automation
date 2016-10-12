package languageCheck;

import org.testng.annotations.*;

import ru.stqa.selenium.TestNgTestBase;
import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class LanguageEng extends TestNgTestBase {

  @Test
  public void testLanguageEng() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//div[@class=\"form-header\"]//span[@class=\"selected\"]")).click();
    driver.findElement(By.xpath("//div[@class=\"form-header\"]//li[2]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("Account".equals(driver.findElement(By.cssSelector("div.info-title")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    assertEquals(driver.findElement(By.xpath("//div[@id=\"login-box\"]//tr[1]//td[1]")).getText(), "Login");
    assertEquals(driver.findElement(By.xpath("//div[@id=\"login-box\"]//tr[2]//td")).getText(), "Password");
    assertEquals(driver.findElement(By.id("login")).getAttribute("value"), "Login");
    assertEquals(driver.findElement(By.xpath("//div[@id=\"login-box\"]//tr[3]//small")).getText(), "Remember me");
    assertEquals(driver.findElement(By.xpath("//div[@id=\"login-box\"]//small/a")).getText(), "Forgot your password?");
    driver.findElement(By.id("login")).click();
    }
}
