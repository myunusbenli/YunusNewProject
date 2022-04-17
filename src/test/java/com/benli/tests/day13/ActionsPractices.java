package com.benli.tests.day13;

import com.benli.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractices {

    //1. go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondbclick2
    //2. switch to iframe
    //3. double click on the text "Double-click me to change my text color."
    //4. Assert: text's "style" attribute value contains "red".

    @Test
    public void p2_double_click_test(){
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondbclick2");

        //2. step
        Driver.getDriver().switchTo().frame("iframeResult");

        //3. step
        WebElement textToDoubleClick = Driver.getDriver().findElement(By.id("demo"));

        Actions actions = new Actions(Driver.getDriver());

        actions.doubleClick(textToDoubleClick).perform();

        //4. step
        String expectedInStyle = "red";
        String actual = textToDoubleClick.getAttribute("style");

        Assert.assertTrue(actual.contains(expectedInStyle));
    }

}
