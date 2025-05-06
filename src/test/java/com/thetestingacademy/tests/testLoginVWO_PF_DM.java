package com.thetestingacademy.tests;

import com.thetestingacademy.base.CommonToAllTest;
import com.thetestingacademy.pages.pageFactory.LoginPage_PF;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static com.thetestingacademy.driver.DriverManager.driver;

public class testLoginVWO_PF_DM extends CommonToAllTest {

    private static final Logger logger = LogManager.getLogger(testLoginVWO_PF_DM.class);


    @Test
    public void testNegativeVWOLogin() throws FileNotFoundException {

        logger.info("Starting Test");
        LoginPage_PF loginVWO_pf=new LoginPage_PF(driver);

        logger.info("Opening the Url");
        loginVWO_pf.openVWOLoginUrl();

        String error_msg=loginVWO_pf.testVWOLoginInvalidCredentials();

        logger.info("Verifying the results");
        Assert.assertEquals(error_msg,"Your email, password, IP address or location did not match");

    }
}
