package com.benli.tests.day12;

import com.benli.utilities.BrowserUtils;
import com.benli.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecuterPractice {

    @Test
    public void scroll_using_jsExecutor_test1(){
        Driver.getDriver().get("http://practice.cybertekchool.com/infinite_scroll");

        //down casting our driver type to javascriptexecuter so we can reach methods in this interface
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //using js we reach executeScript method so we are allowed to pass JavaScript functions.
        //this method is capable of accepting JavaScript functions and apply that into our Java+Selenium code
        for (int i = 0; i<10; i++){
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0, 750)");
        }
        js.executeScript("window.scrollBy(0, -750)");
    }
    @Test
    public void scroll_using_jsExecutor_test2(){

        Driver.getDriver().get("http://practice.cybertekschool.com/large");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        WebElement cybertekSchoolLink = Driver.getDriver().findElement(By.linkText("Cybertek School"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

        //use js.executer with different scrolling JavaScript function
        js.executeScript("arguments[0].scrollIntoView(true)", cybertekSchoolLink);
    }
}
