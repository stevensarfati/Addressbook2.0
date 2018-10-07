package com.telran.repeat.tests;

import com.telran.repeat.model.Group;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupModificationTests extends  TestBase{
  @Test
  public  void  testGroupModification(){
    app.getNavigationHelper().openGroupsPage();
    int before = app.getGroupHelper().getGroupsCount();

    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new Group("name", "header", "footer"));
    app.getGroupHelper().confirmGroupModification();
    app.getGroupHelper().returnToGroupsPage();

    int after = app.getGroupHelper().getGroupsCount();

    Assert.assertEquals(before, after);


  }

  @Test
  public  void  testEmtyGroupModification(){
    app.getNavigationHelper().openGroupsPage();
    int before = app.getGroupHelper().getGroupsCount();

    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new Group("", "", ""));
    app.getContactHelper().confirmContactModification();
    app.getGroupHelper().returnToGroupsPage();
    int after = app.getGroupHelper().getGroupsCount();

    Assert.assertEquals(after, before);


  }

}
