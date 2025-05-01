package com.thetestingacademy.tests;

import com.thetestingacademy.pages.pageObjectModel.LoginPage_POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testLoginVWO_POM {
    @Test

    public  void testLoginVWONegative1(){
        WebDriver driver= new EdgeDriver();
        LoginPage_POM loginPage_pom =new LoginPage_POM(driver);
        String error_msg_text= loginPage_pom.loginVWOCredentials("adminq1230","Hello@12345");
        Assert.assertEquals(error_msg_text,"Your email, password, IP address or location did not match");
        driver.quit();
    }

    @Test
    public  void testLoginVWONegative2(){
        WebDriver driver= new EdgeDriver();
        LoginPage_POM loginPage_pom =new LoginPage_POM(driver);
        String error_msg_text= loginPage_pom.loginVWOCredentials("adminq1245","Passwoerd@123");
        Assert.assertEquals(error_msg_text,"Your email, password, IP address or location did not match");
        driver.quit();
    }


}
