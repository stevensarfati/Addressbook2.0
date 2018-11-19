package com.telRan.trello.manager;

import com.telRan.trello.manager.HelperBase;
import com.telRan.trello.model.Board;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BoardHelper extends HelperBase {

  public BoardHelper(WebDriver wd) {
    super(wd);
  }

  public void confirmBoardCreation() {
    click(By.cssSelector("button[type=submit]"));
  }

  public void fillBoardForm(Board board) {
    type(By.cssSelector("input.subtle-input"),board.getTitle());
  }

  public void initBoardCreation() {
    click(By.cssSelector("a.js-open-add-menu"));
    click(By.cssSelector("a.js-new-board"));
  }

  public void confirmAlert() {
    wd.switchTo().alert().accept();
  }

  public void deleteContact() {
    click(By.cssSelector("[onclick='DeleteSel()']"));
  }
  //*[@onclick='DeleteSel()']

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void initContactModification() {
    click(By.cssSelector("[title=EDIT]"));
  }

  public void confirmContactModification() {
    click(By.name("update"));  }

  public boolean isContactPresent() {
    return isElementPresent(By.name("selected[]"));
  }

  public void createBoard() {
    initBoardCreation();
    fillBoardForm(new Board().setTitle("BoardTest55"));
    confirmBoardCreation();
  }

  public void selectContactByIndex(int i) {
    wd.findElements(By.name("selected[]")).get(i).click();
  }

  public boolean isOnTheHomePage(){return isElementPresent(By.id("maintable"));}

  public int getContactCount() {
    return wd.findElements(By.name("selected[]")).size();
  }
}