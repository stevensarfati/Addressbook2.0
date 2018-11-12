package com.telRan.trello.tests;


import com.telRan.trello.manager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

  protected static ApplicationManager app = new ApplicationManager(BrowserType.FIREFOX);

  @BeforeSuite
  public void setUp(){
    app.start();
  }
  @AfterSuite
  public  void tearDown(){
    app.stop();
  }

}
