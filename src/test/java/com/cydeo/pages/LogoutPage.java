package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.apache.commons.logging.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    public LogoutPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement loginButton;

    @FindBy(id = "expand")
    public WebElement Ebutton;

    @FindBy(xpath = "//li[@data-id='logout']")
    public WebElement logoutButton;


}
