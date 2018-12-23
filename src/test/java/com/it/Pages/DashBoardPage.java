package com.it.Pages;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardPage  extends  BasePage{



    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement emailLogin;



    public String getLoginEmail() {
        /*WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(webDriver -> {});*/
        return emailLogin.getText();
    }
}
