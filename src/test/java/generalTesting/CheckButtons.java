package generalTesting;


import org.testng.annotations.*;

import ru.stqa.selenium.TestNgTestBase;
import static org.testng.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.*;


public class CheckButtons extends TestNgTestBase {

  @Test
  public void testCheckButtons() throws Exception {
    driver.get(baseUrl + "/online");
    driver.findElement(By.xpath("//td//a[@href=\'" + baseUrl + "archive\']")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.id("calendar"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }
    
 String regexp = "[0-9]{1,2}[:][0-9]{1,2}";
    
    Pattern pattern = Pattern.compile(regexp);

    String str = "Запись по нажатию кнопки вызова: с 08:12:00 по 08:23:59";
    String finalStr = "";
    Matcher matcher = pattern.matcher(str);
    if (matcher.find()) {
    	finalStr = matcher.group();
    }

    driver.findElement(By.xpath("//td//a[@href=\'" + baseUrl + "observers\']")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("div#body input.create"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//td//a[@href=\'" + baseUrl + "settings/tariffs\']")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.id("tariff_preset_s"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//td//a[@href=\'" + baseUrl + "payment\']")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("div#filter select.item"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//td//a[@href=\'" + baseUrl + "information\']")).click();
    driver.findElement(By.xpath("//td//a[@href=\'" + baseUrl + "online\']")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.id("screens"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

}
