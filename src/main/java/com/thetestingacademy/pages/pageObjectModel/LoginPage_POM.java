package com.thetestingacademy.pages.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage_POM {

    WebDriver driver;
    public LoginPage_POM(WebDriver driver){
        this.driver=driver;

    }

    private By username=By.id("login-username");
    private By password =By.id("login-password");
    private By signInBUtton =By.id("js-login-btn");
    private By error_msg =By.id("js-notification-box-msg");


    //Login-Page Actions:
    //
    public String loginVWOCredentials(String user , String pass){
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(signInBUtton).click();

        try {
            Thread.sleep(Long.parseLong("3000"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        String error_msg_text  = error_msg.getText();
        System.out.println(error_msg_text);




        return error_msg_text;

    }



}
