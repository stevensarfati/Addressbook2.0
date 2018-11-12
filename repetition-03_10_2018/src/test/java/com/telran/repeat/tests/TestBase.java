package com.telran.repeat.tests;

import com.telran.repeat.manager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
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
