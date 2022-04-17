package com.benli.tests.day5;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_Xpath_Practice_1 {
    public static void main(String[] args) {

        //TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/forgot_password
        //3. Locate all the WebElements on the page using XPATH locator only (total of 6)
                //a. “Home” link
                //b. “Forgot password” header
                //c. “E-mail” text
                //d. E-mail input box
                //e. “Retrieve password” button
                //f. “Powered by Cybertek School” text
                //4. Verify all WebElements are displayed.

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homeLink = driver.findElement(By.xpath("//a[.='Home']"));

        WebElement forgotPassword = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));

        WebElement retrieveButton = driver.findElement(By.xpath("//button[@id='form_submit']"));

        WebElement footerText = driver.findElement(By.xpath("//a[.='Cybertek School']/.."));

        if (homeLink.isDisplayed() && forgotPassword.isDisplayed() && emailLabel.isDisplayed()
                && emailInput.isDisplayed() && retrieveButton.isDisplayed() && footerText.isDisplayed()){
            System.out.println("All the webelements are displayed");
        }else {
            System.out.println("one or more webelement are not displayed");
        }

        driver.close();
    }
}
