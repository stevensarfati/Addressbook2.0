package com.telRan.ashkelon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GroupCreationTests extends TestBase{

    @Test
    public void testGroupCreation(){
        openGroupsPage();
        initNewGroupCreation();
        fillGroupForm("name", "header", "footer");
        confirmNewGroupCreation();
        returnToGroupsPage();
    }

    @Test
    public void testGroupCreationlongName(){
        openGroupsPage();
        initNewGroupCreation();
        fillGroupForm("nameeeeeeeeeeeeeeee", "headereeeeeeeeeeeee", "footereeeeeeeeeeeeeeeee");
        confirmNewGroupCreation();
        returnToGroupsPage();
    }

    @Test
    public void testGroupCreationEmpty(){
        openGroupsPage();
        initNewGroupCreation();
        fillGroupForm("", "", "");
        confirmNewGroupCreation();
        returnToGroupsPage();
    }


}
