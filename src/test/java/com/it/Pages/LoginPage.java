package com.it.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@name='login']")
    private WebElement login;

	@FindBy(xpath = "//input[@name='pass']")
	private WebElement password;

	@FindBy(xpath = "//input[@type='submit' and @tabindex]")
	private WebElement submit;



	public void login(String name,String pass) {
		login.sendKeys(name);
		password.sendKeys(pass);
		submit.click();
	}


}
