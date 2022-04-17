package com.benli.tests.day12;

import com.benli.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadPractice {

    @Test
    public void upload_test(){
        //1. go to http://practice.cybertekschool.com/upload
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");

        //2. find some small file from your computer, and get the path of it.
        String path = "C://Users/myunu/OneDrive/Desktop";

        //3. upload the file
        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));
        WebElement fileSubmitButton = Driver.getDriver().findElement(By.id("file-submit"));

        //sending the file path to the chooseFile WebElement
        chooseFile.sendKeys(path);

        //click to upload button
        fileSubmitButton.click();

        //4. assert:
        // - file upload text is displayed on the page
        WebElement fileUploadedMessage = Driver.getDriver().findElement(By.tagName("h3"));

        Assert.assertTrue(fileUploadedMessage.isDisplayed());

        Driver.closeDriver();
    }
}
