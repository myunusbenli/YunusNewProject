package com.benli.tests.day11;

import com.benli.utilities.Driver;
import org.testng.annotations.Test;

public class DriverClassUsingExample {

    @Test
    public void how_to_use_driver(){
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
    }

}
