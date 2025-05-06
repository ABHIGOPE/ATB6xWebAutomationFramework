package com.thetestingacademy.pages.pageFactory;

import com.thetestingacademy.base.CommonToAll;
import com.thetestingacademy.utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;

public class LoginPage_PF extends CommonToAll {
    WebDriver driver;
    public  LoginPage_PF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    //Page Locators:

    @FindBy(id = "login-username")
    private WebElement username;

    @FindBy(id = "login-password")
    private WebElement password;

    @FindBy(id = "js-login-btn")
    private WebElement signInBUtton;

    @FindBy(id = "js-notification-box-msg")
    private WebElement error_msg;


    public String testVWOLoginInvalidCredentials () throws FileNotFoundException {
        enterInput(username, PropertyReader.readKey("invalid_username"));
        enterInput(password,PropertyReader.readKey("invalid_password"));
        clickElement(signInBUtton);

        signInBUtton.click();
        try {
            Thread.sleep(Long.parseLong("3000"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        return error_msg.getText();
    }

}
