package com.it.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {
    @Test
    public void test() {
        WebDriver driver = app.common.getDriver();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getWindowHandles());
        app.login.loginValidUser();
        Assert.assertEquals(app.dashBoard.getLoginEmail(), validUser.getEmail());
    }
}
