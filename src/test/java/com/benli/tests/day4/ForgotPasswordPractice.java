package com.benli.tests.day4;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPractice {
    public static void main(String[] args) throws InterruptedException {

        //TC #3: PracticeCybertek/ForgotPassword URL verification
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/forgot_password
        //3. Enter any email into input box
        //4. Click on Retrieve password
        //5. Verify URL contains:
        //          Expected: “email_sent”
        //6. Verify textbox displayed the content as expected.
        //          Expected: “Your e-mail’s been sent!”

        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();

        //**** we created WebDriverFactory class instead writing

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        driver.findElement(By.name("email")).sendKeys("any@gmail.com");

        driver.findElement(By.id("form_submit")).click();

        //verify url contains "email_sent"
        String expectedContains = "email_sent";
        String actual = driver.getCurrentUrl();
        if (actual.contains(expectedContains)){
            System.out.println("verified");
        }else {
            System.out.println("not verified");
        }

        String expectedText = "Your e-mail's been sent!";
        String actualText = driver.findElement(By.name("confirmation_message")).getText();
        System.out.println("actualText = " + actualText);

        Thread.sleep(1000);
        if (actualText.equals(expectedText)){
            System.out.println("verified");
        }else {
            System.out.println("not verified");
        }

        driver.close();
    }
}
