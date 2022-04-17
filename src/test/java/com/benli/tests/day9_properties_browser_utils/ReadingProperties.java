package com.benli.tests.day9_properties_browser_utils;

import com.benli.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public static void reading_from_properties_file() throws IOException {

        //1# Create object of properties class (coming from java lib)

        Properties properties = new Properties();

        FileInputStream file = new FileInputStream("configuration.properties");

        properties.load(file);

        //reading from configuration.properties
        properties.getProperty("browser");

        System.out.println("properties.getProperty(\"browser\") = " + ConfigurationReader.getProperty("browser"));

    }
}
