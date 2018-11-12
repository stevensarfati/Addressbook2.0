package com.telRan.trello.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper  extends  HelperBase{
  public SessionHelper(WebDriver wd) {
    super(wd);
  }
  public void login(String user, String password) {
    type(By.name("user"), user);
    type(By.name("password"), password);
    click(By.id("login"));
  }
}
