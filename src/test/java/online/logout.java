package online;

import org.testng.annotations.*;
import ru.stqa.selenium.TestNgTestBase;
import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class logout extends TestNgTestBase {

  @Test
  public void testLogout() throws Exception {
    driver.get(baseUrl + "/online");
    driver.findElement(By.xpath("//input[@value='Выйти']")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//input[@id='login']"))) break; } catch (Exception e) {}
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
