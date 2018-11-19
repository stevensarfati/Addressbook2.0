package com.telRan.ashkelon.com.telRan.ashkelon.tests;

import com.telRan.ashkelon.com.telRan.ashkelon.data.GroupData;
import com.telRan.ashkelon.com.telRan.ashkelon.provider.StaticProvider;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase{


    @Test(dataProvider = "validGroups", dataProviderClass = StaticProvider.class)
    public void testGroupCreation(GroupData group){
        openGroupsPage();
        initNewGroupCreation();


        fillGroupForm(group);

        confirmNewGroupCreation();
        returnToGroupsPage();
    }

    @Test(dataProvider = "validGroups", dataProviderClass = StaticProvider.class)
    public void testGroupCreationlongName(GroupData group){
        openGroupsPage();
        initNewGroupCreation();

        fillGroupForm(group);

        confirmNewGroupCreation();
        returnToGroupsPage();
    }

    @Test(dataProvider = "validGroups",dataProviderClass = StaticProvider.class)
    public void testGroupCreationEmpty(GroupData group){
        openGroupsPage();
        initNewGroupCreation();

        fillGroupForm(group);
        confirmNewGroupCreation();
        returnToGroupsPage();
    }


}
