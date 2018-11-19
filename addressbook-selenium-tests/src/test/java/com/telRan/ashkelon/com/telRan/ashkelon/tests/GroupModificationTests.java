package com.telRan.ashkelon.com.telRan.ashkelon.tests;

import com.telRan.ashkelon.com.telRan.ashkelon.data.GroupData;
import com.telRan.ashkelon.com.telRan.ashkelon.provider.StaticProvider;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupModificationTests extends  TestBase {
    @BeforeMethod
    /*public void ensurePreconditions(){
        openGroupsPage();
        if(!isGroupPresent()){
            createGroup();
        }
    }*/


        @Test(dataProvider = "validGroups",dataProviderClass = StaticProvider.class)
    public void testGroupModification(GroupData group){

        openGroupsPage();
        selectGroup();
        initGroupModification();

        fillGroupForm(group);

        confirmGroupModification();
        returnToGroupsPage();
    }

}
