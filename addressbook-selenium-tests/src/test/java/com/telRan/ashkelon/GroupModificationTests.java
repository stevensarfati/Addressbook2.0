package com.telRan.ashkelon;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupModificationTests extends  TestBase {
    @Test
    public void testGroupModification(){
        openGroupsPage();
        selectGroup();
        initGroupModification();
        fillGroupForm("new name", "", "");
        confirmGroupModification();
        returnToGroupsPage();
    }

}
