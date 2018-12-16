package com.it.Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
    static public WebDriver getDriver() {
        WebDriver driver;
        String sysDriver = System.getProperty("driver");

        if ("firefox".equals(sysDriver)) {
            driver = new FirefoxDriver();
        } else if ("ie".equals(sysDriver)) {
            driver = new InternetExplorerDriver();
        } else {
            System.getProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.get("https://www.i.ua/");
        return  driver;
    }
}
