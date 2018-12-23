package com.it.Pages;

import com.it.Drivers.DriverFactory;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected Logger log = Logger.getLogger(this.getClass().getSimpleName());
    protected static WebDriver driver = DriverFactory.getDriver();


       public BasePage() {

        PageFactory.initElements(driver, this);
    }
}
