package com.benli.tests.day4;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cybertek_Forgot_Password_Practice {
    public static void main(String[] args) {

        //TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        //a. “Home” link
        WebElement homeButton = driver.findElement(By.cssSelector("a[class='nav-link']"));
        System.out.println(homeButton.isDisplayed());
        //b. “Forgot password” header
        WebElement forgotPassword = driver.findElement(By.tagName("h2"));
        System.out.println(forgotPassword.isDisplayed());
        //c. “E-mail” text
        WebElement email = driver.findElement(By.cssSelector("label[for='email']"));
        System.out.println(email.isDisplayed());
        //d. E-mail input box
        WebElement inputBox = driver.findElement(By.cssSelector("input[name='email']"));
        System.out.println(inputBox.isDisplayed());
        //e. “Retrieve password” button
        WebElement retrievePassword = driver.findElement(By.id("form_submit"));
        System.out.println(retrievePassword.isDisplayed());
        //f. “Powered by Cybertek School” text
        WebElement poweredByCybertek = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        System.out.println(poweredByCybertek.isDisplayed());
        //4. Verify all WebElements are displayed.

        driver.close();

    }
}
