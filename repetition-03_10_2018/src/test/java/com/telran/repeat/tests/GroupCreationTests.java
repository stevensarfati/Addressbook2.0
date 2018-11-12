package com.telran.repeat.tests;

import com.telran.repeat.model.Group;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {
@Test
  public void testGroupCreation(){
  app.getNavigationHelper().openGroupsPage();
  int before = app.getGroupHelper().getGroupsCount();

  app.getGroupHelper().initGroupCreation();
  app.getGroupHelper().fillGroupForm(new Group()
                  .withGroupName("")
                  .withGroupHeader("")
                  .withGroupFooter(""));

  app.getGroupHelper().confirmGroupCreation();
  app.getGroupHelper().returnToGroupsPage();

  int after = app.getGroupHelper().getGroupsCount();

 // System.out.println("count before is: " + before + " and count after is: " + after);
  Assert.assertEquals(after, before+1);

}
}
