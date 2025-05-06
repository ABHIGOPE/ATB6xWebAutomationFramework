package com.thetestingacademy.tests;

import com.thetestingacademy.pages.pageFactory.LoginPage_PF;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class testLoginVWO_PF {
    @Test

    public void testVWOLoginNegative1() throws FileNotFoundException {
        WebDriver driver= new EdgeDriver();
        LoginPage_PF loginPage_pf=new LoginPage_PF(driver);
        String error_msg=loginPage_pf.testVWOLoginInvalidCredentials();
        Assert.assertEquals(error_msg,"Your email, password, IP address or location did not match");
        driver.quit();
    }

}
