package com.benli.tests.day12;

import com.benli.utilities.BrowserUtils;
import com.benli.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractice {

    /*
    TC15 Hover Test
    1. go to http://practice.cybertekschool.com/hovers
    2. hover over to first image
    3.assert:
        a."name: user1" is displayed
    4. hover over to second image
    5.Assert:
        a."name: user2" is displayed
    6. hover over to third image
    7.confirm
        a."name: user3" is displayed
     */

    @Test
    public void actions_practice(){
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        //locating all of the images here:
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        //locating all the "user" texts
        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(img1).perform();
        Assert.assertTrue(user1.isDisplayed());
        BrowserUtils.sleep(1);

        actions.moveToElement(img2).perform();
        Assert.assertTrue(user2.isDisplayed());
        BrowserUtils.sleep(1);

        actions.moveToElement(img3).perform();
        Assert.assertTrue(user3.isDisplayed());
        BrowserUtils.sleep(1);
    }

    @Test
    public void scrolling_test(){
        Driver.getDriver().get("http://practice.cybertekschool.com/");

        Actions actions = new Actions(Driver.getDriver());

        WebElement poweredByCybertekSchool = Driver.getDriver().findElement(By.linkText("Cybertek School"));

        actions.moveToElement(poweredByCybertekSchool).perform();

        //scrolling up using Keys.Page_UP button
        BrowserUtils.sleep(2);
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }
}
