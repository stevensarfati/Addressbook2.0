package com.telRan.ashkelon.com.telRan.ashkelon.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDeletionTests extends  TestBase{
    /*@BeforeMethod
    public void ensurePreconditions(){
        openGroupsPage();
        if(!isGroupPresent()){
            createGroup();
        }
    }*/

    @Test
    public void testFirstGroupDeletion(){
      int before = getGroupsCount();
      selectGroup();
      deleteGroup();
      returnToGroupsPage();
      int after = getGroupsCount();

      Assert.assertEquals(after, before-1);


  }

    @Test
    public void testLastGroupDeletion(){
        int before = getGroupsCount();
        selectGroupByIndex(before-1);
        deleteGroup();
        returnToGroupsPage();
        int after = getGroupsCount();

        Assert.assertEquals(after, before-1);


    }


}
