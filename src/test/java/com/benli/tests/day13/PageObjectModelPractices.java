package com.benli.tests.day13;

import com.benli.pages.LibraryLoginPage;
import com.benli.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageObjectModelPractices {

    LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

    @Test
    public void negative_login_to_library_test(){

        //1- go to library
        Driver.getDriver().get("https://library2.cybertekschool.com/login.html");

        //2- enter incorrect email
        libraryLoginPage.inputPassword.sendKeys("wrong@gmail.com");

        //3- enter incorrect password
        libraryLoginPage.inputPassword.sendKeys("wrong password");

        //4- click to sign in button
        libraryLoginPage.signInButton.click();

        //5- verify error message is displayed
        Assert.assertTrue(libraryLoginPage.incorrectEmailOrPasswordError.isDisplayed());
    }

}
