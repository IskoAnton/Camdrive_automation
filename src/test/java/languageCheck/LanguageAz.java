package languageCheck;

import org.testng.annotations.*;

import ru.stqa.selenium.TestNgTestBase;
import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class LanguageAz extends TestNgTestBase {

  @Test
  public void testLanguageAz() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//div[@class=\"form-header\"]//span[@class=\"selected\"]")).click();
    driver.findElement(By.xpath("//div[@class=\"form-header\"]//li[3]")).click();
   /* for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("Şəxsi kabinet".equals(driver.findElement(By.cssSelector("div.info-title")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    } */

    Thread.sleep(5000);
    assertEquals(driver.findElement(By.cssSelector("div.info-title")).getText(), "Şəxsi kabinet");
    assertEquals(driver.findElement(By.xpath("//div[@id=\"login-box\"]//tr[1]//td[1]")).getText(), "Loqin");
    assertEquals(driver.findElement(By.xpath("//div[@id=\"login-box\"]//tr[2]//td")).getText(), "Parol");
    assertEquals(driver.findElement(By.id("login")).getAttribute("value"), "Daxil olun");
    assertEquals(driver.findElement(By.xpath("//div[@id=\"login-box\"]//tr[3]//small")).getText(), "Məni yadda saxla");
    assertEquals(driver.findElement(By.xpath("//div[@id=\"login-box\"]//small/a")).getText(), "Parolu unutmuzunuz?");
    
    }

}
