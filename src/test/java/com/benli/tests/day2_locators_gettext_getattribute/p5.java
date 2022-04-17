package com.benli.tests.day2_locators_gettext_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p5 {
    public static void main(String[] args) throws InterruptedException {

        //TC #5: Basic login authentication
        //1- Open a chrome browser
        //2- Go to:
        //      http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        //3- Verify title equals:
        //      Expected: Web Orders Login
        //4- Enter username: Tester
        //5- Enter password: test
        //6- Click “Sign In” button
        //7- Verify title equals:
        //      Expected: Web Orders

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        Thread.sleep(1000);

        System.out.println("driver.getTitle() = " + driver.getTitle());

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        Thread.sleep(1000);

        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        Thread.sleep(1000);

        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        Thread.sleep(1000);

        System.out.println("driver.getTitle() = " + driver.getTitle());

        driver.close();
    }
}
