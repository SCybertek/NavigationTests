package com.cbt.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class testSafari {
    public static void main(String[] args) throws Exception {


        WebDriver driver = new SafariDriver() ;
        driver.get("https://www.google.com");

        Thread.sleep(2000);

        driver.quit();

//to allow remote automation on safari: first enable Develop menu from advanced preferences.
// then click on allow remote automation through that develop menu that appeared between bookmarks and Window
    }
}
