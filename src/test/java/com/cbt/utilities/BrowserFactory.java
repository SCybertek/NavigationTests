package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {
    public static void main(String[] args) {

    }

    public static WebDriver getDriver(String browser) {
        //Java class that use System.getProperty("os.name")
        // to detect which type of operating system (OS) you are using now.

        String operatingSystem = System.getProperty("os.name").toLowerCase();

        if  ( operatingSystem.contains("windows") && browser.equalsIgnoreCase("safari")) {
            return null;
        } else if ( operatingSystem.contains("mac") && browser.equalsIgnoreCase("edge") ) {
            return null;
        }
        if (browser.equalsIgnoreCase("chrome") ) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("safari")) { //no set up needed for safari on mac
            return new SafariDriver();
        }
        return null;
    }


}
