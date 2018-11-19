package com.telRan.ashkelon.com.telRan.ashkelon.tests;

import com.telRan.ashkelon.com.telRan.ashkelon.data.GroupData;
import com.telRan.ashkelon.com.telRan.ashkelon.data.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
       wd = new ChromeDriver();
       wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
       wd.get("http://localhost/addressbook/");
       login("admin", "secret");
    }

    public void returnToGroupsPage() {
        click(By.cssSelector("i a"));
    }

    public void confirmNewGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData group) {
        type(By.name("group_name"), group.getGroupName());
        type(By.name("group_header"), group.getGroupHeader());
        type(By.name("group_footer"), group.getGroupFooter());
    }

    public void initNewGroupCreation() {
        click(By.name("new"));
    }

    public void openGroupsPage() {
        click(By.xpath("//a[@href='group.php']"));
    }

    @AfterClass
    public void tearDown(){
        wd.quit();
    }

    public void login(String userName, String password) {
        type(By.name("user"), userName);
        type(By.name("pass"), password);

        click(By.xpath("//*[@type='submit']"));
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void confirmGroupModification() {
        click(By.name("update"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void deleteGroup() {
        click(By.name("delete"));
    }

    public void createGroup(String groupName, String groupHeader, String groupFooter) {
        initNewGroupCreation();

        GroupData group = new GroupData()
                .withGroupName(groupName)
                .withGroupHeader(groupHeader)
                .withGroupFooter(groupFooter);

        fillGroupForm(group);

        confirmNewGroupCreation();
        returnToGroupsPage();
    }

    public boolean isGroupPresent() {
        return isElementPresent(By.name("selected[]"));
    }

    public boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void selectGroupByIndex(int index) {
      wd.findElements(By.name("selected[]")).get(index).click();
    }

    public int getGroupsCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getfName());
        type(By.name("lastname"), contactData.getlName());
        type(By.name("address"), contactData.getAddress());
        type(By.name("email"), contactData.getEmail());
        type(By.name("home"), contactData.getPhoneHome());
    }

    public void initContactCreation() {
        click(By.xpath("//a[@href='edit.php']"));
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }
}
