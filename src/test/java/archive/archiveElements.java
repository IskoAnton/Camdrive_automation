package archive;


import org.testng.annotations.*;
import ru.stqa.selenium.TestNgTestBase;
import static org.testng.Assert.*;
import org.openqa.selenium.*;


public class archiveElements extends TestNgTestBase {

@Test
  public void testArchiveElements() throws Exception {
    driver.get(baseUrl + "/online");
    driver.findElement(By.linkText("�����")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.id("create-group"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    assertTrue(isElementPresent(By.id("rename-group")));
    assertTrue(isElementPresent(By.id("remove-group")));
    assertFalse(isElementPresent(By.id("screen_1")));
    assertFalse(isElementPresent(By.id("screen_2")));
    assertFalse(isElementPresent(By.id("screen_3")));
    assertFalse(isElementPresent(By.id("screen_4")));
    assertTrue(isElementPresent(By.id("activation-device")));
    assertTrue(isElementPresent(By.id("deactivation-device")));
    assertTrue(isElementPresent(By.id("rename-channel")));
    assertTrue(isElementPresent(By.id("1")));
    assertEquals(driver.findElement(By.cssSelector("div#archive_download div.heading")).getText(), "������� ����������");
    assertEquals(driver.findElement(By.xpath("//div[@id='archive_download']/div/table/tbody/tr[1]/td")).getText(), "����:");
    assertEquals(driver.findElement(By.xpath("//div[@id='archive_download']/div/table/tbody/tr[2]/td")).getText(), "�����:");
    assertEquals(driver.findElement(By.xpath("//div[@id='archive_download']/div/table/tbody/tr[3]/td")).getText(), "������������:");
    assertTrue(isElementPresent(By.xpath("//img[@title='�������� ����']")));
    assertTrue(isElementPresent(By.xpath("//img[@title='�������� �����']")));
    assertTrue(isElementPresent(By.xpath("//img[@title='�������� ������������']")));
    assertTrue(isElementPresent(By.xpath("//div[@id='archive_download']//input[@id='generate_link']")));
    assertEquals(driver.findElement(By.xpath("//div[@id='archive_download']//div[@class='notes left']")).getText(), "��� ���������� ��������� ����������� � ������ ����� ����� ������� �������� �������� ���������� ������ ������, �� ���� 1p/Mb");
    assertEquals(driver.findElement(By.xpath("//div[@id='rpanel']/div[@class='bmenu']")).getText(), "���������");
    assertEquals(driver.findElement(By.xpath("//div[@id='calendar']//td[1][@class='week']")).getText(), "��");
    assertEquals(driver.findElement(By.xpath("//div[@id='calendar']//td[2][@class='week']")).getText(), "��");
    assertEquals(driver.findElement(By.xpath("//div[@id='calendar']//td[3][@class='week']")).getText(), "��");
    assertEquals(driver.findElement(By.xpath("//div[@id='calendar']//td[4][@class='week']")).getText(), "��");
    assertEquals(driver.findElement(By.xpath("//div[@id='calendar']//td[5][@class='week']")).getText(), "��");
    assertEquals(driver.findElement(By.xpath("//div[@id='calendar']//td[6][@class='week']")).getText(), "��");
    assertEquals(driver.findElement(By.xpath("//div[@id='calendar']//td[7][@class='week']")).getText(), "��");
    assertEquals(driver.findElement(By.cssSelector("#rpanel > div.tmenu")).getText(), "��������� ���������");
    assertTrue(isElementPresent(By.id("time-intervals")));
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
