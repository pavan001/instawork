package com.instawork.in.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GoogleLocatorPage {

    
    @FindBy(xpath = ".//*[@name='q']")
    public WebElement searchbox;

    @FindBy(xpath = ".//*[@value='Google Search']")
    public WebElement searchbutton;


    @FindAll({@FindBy(xpath="//cite")})
    public List<WebElement> sites;
}
