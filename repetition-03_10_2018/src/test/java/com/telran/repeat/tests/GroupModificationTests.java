package com.telran.repeat.tests;

import com.telran.repeat.model.Group;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupModificationTests extends  TestBase{
  @BeforeMethod
  public void ensurePreconditions(){
    app.getNavigationHelper().openGroupsPage();

    if(!app.getGroupHelper().isGroupPresent()){
      app.getGroupHelper().createGroup();
    }
  }




  @Test
  public  void  testGroupModification(){
    int before = app.getGroupHelper().getGroupsCount();

    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new Group().withGroupName(""));
    app.getGroupHelper().confirmGroupModification();
    app.getGroupHelper().returnToGroupsPage();

    int after = app.getGroupHelper().getGroupsCount();

    Assert.assertEquals(before, after);


  }

  @Test
  public  void  testEmptyGroupModification(){
    int before = app.getGroupHelper().getGroupsCount();

    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new Group().withGroupName(""));
    app.getContactHelper().confirmContactModification();
    app.getGroupHelper().returnToGroupsPage();
    int after = app.getGroupHelper().getGroupsCount();

    Assert.assertEquals(after, before);


  }

}
