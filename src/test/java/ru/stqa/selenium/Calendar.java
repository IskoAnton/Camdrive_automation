package ru.stqa.selenium;


import org.testng.annotations.*;


public class Calendar extends TestNgTestBase {
  

  @Test
  public void testCalendar() throws Exception {
    driver.get(baseUrl + "/online");
  }
}
