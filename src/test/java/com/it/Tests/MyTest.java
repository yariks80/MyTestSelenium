package com.it.Tests;

import com.it.App;
import com.it.Pages.DashBoardPage;
import com.it.Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
    @Test
    public void test() {
/**
 * validLogin=ittest2
 * validPassword=337774a
 * validEmail=ittest2@i.ua
 */
        App app = new App();
        app.login.login("ittest2","337774a");
        Assert.assertEquals(app.dashBoard.getLoginEmail(),"ittest2@i.ua");
        app.common.stopApp();
         }
}
