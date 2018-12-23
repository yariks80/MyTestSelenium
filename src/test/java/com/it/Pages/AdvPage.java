package com.it.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AdvPage extends  BasePage {

    @FindBy(xpath = "//div[@class='panelBig']")
    private WebElement windowsAdv;

    @FindBy(xpath = "//a[@id='close']")
    private WebElement btnClose;


     public void closeAdv(){
        if (driver.findElements(By.xpath("//iframe[contains(@id,'holderIframe_holder')]")).size()!=0){
         WebDriver adv = driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'holderIframe_holder')]")));
         adv.findElement(By.xpath("//a[@id='close']")).click();
         adv.switchTo().defaultContent();}
         }
     }



