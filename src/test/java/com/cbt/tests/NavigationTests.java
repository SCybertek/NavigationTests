package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;

import org.openqa.selenium.WebDriver;



public class NavigationTests {

    static WebDriver driver ;

    public static void main(String[] args) throws Exception {
        //If y ou are using Mac OS, create test    methods for   Chrome, Firefox,Safari.

            testChrome();
           //testFirefox();
        //testSafari();

    }

    public static void testChrome () throws Exception{

        driver = BrowserFactory.getDriver("chrome");

        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        Thread.sleep(2000);

        driver.get("https://etsy.com");
        String titleEtsy = driver.getTitle();

        driver.navigate().back();
        Thread.sleep(1000);

        StringUtility.verifyEquals(title,driver.getTitle());

        driver.navigate().forward();

        StringUtility.verifyEquals(titleEtsy,driver.getTitle());

        driver.quit();

        }

        public static void testFirefox() throws Exception {


        driver = BrowserFactory.getDriver("firefox");
        driver.get("https://www.google.com/");

        String title = driver.getTitle();
        Thread.sleep(2000);

        driver.get("https://etsy.com");
        String titleEtsy = driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(title, driver.getTitle());

        driver.navigate().forward();
        StringUtility.verifyEquals(titleEtsy,driver.getTitle());

        driver.quit();

        }
    public static void testSafari() throws Exception {


        driver = BrowserFactory.getDriver("safari");

        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        Thread.sleep(2000);

        driver.get("https://etsy.com");
        String titleEtsy = driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(title, driver.getTitle());

        driver.navigate().forward();
        StringUtility.verifyEquals(titleEtsy,driver.getTitle());

        driver.quit();

    }

    }

