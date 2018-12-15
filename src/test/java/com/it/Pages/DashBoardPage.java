package com.it.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage  extends  BasePage{



    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement emailLogin;



    public String getLoginEmail() {
        return emailLogin.getText();
    }
}
