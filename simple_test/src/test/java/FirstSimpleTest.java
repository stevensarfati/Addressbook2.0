import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class FirstSimpleTest extends TestBase {

    @Test
    public void searchElements(){

        openSite("https://jqueryui.com");

        List<WebElement> items = wd.findElements(By.xpath("//div[@id='sidebar']"));

        for (int i = 0; i < items.size()-1; i++)
        {
            click(By.cssSelector("li"));
        }

    }



    @Test
    public void searchTestWithEnter(){
        openSite("https://jqueryui.com");
        type(By.name("s"), "button" + Keys.ENTER);
        //proceedToSearchClickEnter();

        String actualText = wd.findElement(By.cssSelector("h1 span")).getText().toLowerCase();
        System.out.println(actualText);

        Assert.assertEquals(actualText,"button");
    }

    @Test
    public void SearchTestWithLoupe(){
        openSite("https://jqueryui.com");
        type(By.name("s"), "button");
        proceedToSearch();

        String actualText = wd.findElement(By.cssSelector("h1 span")).getText().toLowerCase();
        System.out.println(actualText);

        Assert.assertEquals(actualText,"button");
    }




}