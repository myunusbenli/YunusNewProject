package com.benli.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    public static Properties properties = new Properties();

    static {
        try {
            FileInputStream file = new FileInputStream("configuration.properties");

            properties.load(file);

            file.close();
        } catch (IOException e) {
            System.out.println("file not found in configuration properties.");
        }
    }

    public static String getProperty(String keyWord){
        return properties.getProperty("keyWord");
    }



}
