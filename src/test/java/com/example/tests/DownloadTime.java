package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import ru.stqa.selenium.TestNgTestBase;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DownloadTime extends TestNgTestBase {


  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {

  }

  @Test
  public void testDownloadTime() throws Exception {
    driver.get(baseUrl + "/archive");
    driver.findElement(By.xpath("//img[@alt='Выберите время']")).click();
    driver.findElement(By.xpath("//dd[@id='ui_tpicker_hour_downloadtime']/a")).click();
    driver.findElement(By.xpath("//dd[@id='ui_tpicker_minute_downloadtime']/a")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
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
