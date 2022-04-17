package com.benli.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LibraryUtils {

    @Test
    public static void login_test(WebDriver driver){

        WebElement inputUsername = driver.findElement(By.xpath("//input[@id='inputEmail']"));
        inputUsername.sendKeys("student11@library");

        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='inputPassword']"));
        inputPassword.sendKeys("tScBPCUr");

        WebElement loginButton = driver.findElement(By.xpath("//button[.='Sign in']"));
        loginButton.click();


    }
}
