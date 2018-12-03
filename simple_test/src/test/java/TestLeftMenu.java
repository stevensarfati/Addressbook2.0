import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestLeftMenu extends TestBase{


    @Test
    public void testMenuLeft() {
        openSite("https://jqueryui.com");
        List<WebElement> widgetList = wd.findElements(By.xpath("//div[@id='sidebar']//aside"));


        for (WebElement WidgetLinks: widgetList) {
            WidgetLinks.getText();

            for (int i = 1 ; i < 6; i++) //INTERACTION
            {
                System.out.println( wd.findElement(By.xpath("//div[@id='sidebar']//aside[1]//ul[1]//li[" + i + "]")).getText());
                wd.findElement(By.xpath("//div[@id='sidebar']//aside[1]//ul[1]//li[" + i + "]")).click();
            }

            for (int i = 1 ; i < 15; i++)//WIDGETS
            {
                System.out.println( wd.findElement(By.xpath("//div[@id='sidebar']//aside[2]//ul[1]//li[" + i + "]")).getText());
                wd.findElement(By.xpath("//div[@id='sidebar']//aside[2]//ul[1]//li[" + i + "]")).click();
            }

            for (int i = 1 ; i < 11; i++)//EFFECTS
            {
                System.out.println( wd.findElement(By.xpath("//div[@id='sidebar']//aside[3]//ul[1]//li[" + i + "]")).getText());
                wd.findElement(By.xpath("//div[@id='sidebar']//aside[3]//ul[1]//li[" + i + "]")).click();
            }
            for (int i = 1 ; i < 3; i++)//UTILITIES
            {
                System.out.println( wd.findElement(By.xpath("//div[@id='sidebar']//aside[4]//ul[1]//li[" + i + "]")).getText());
                wd.findElement(By.xpath("//div[@id='sidebar']//aside[4]//ul[1]//li[" + i + "]")).click();
            }



            }

        }

}
