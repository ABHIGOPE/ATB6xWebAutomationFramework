package com.thetestingacademy.base;

import com.thetestingacademy.driver.DriverManager;
import com.thetestingacademy.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.time.Duration;

import static com.thetestingacademy.driver.DriverManager.getDriver;


public class CommonToAll {

    public CommonToAll() {
    }


    public  void openVWOLoginUrl() throws FileNotFoundException {
        getDriver().get(PropertyReader.readKey("url"));

    }

    public  void clickElement(WebElement by){
        by.click();
    }

    public void clickElement(By by){
        getDriver().findElement(by).click();
    }

    public void enterInput(WebElement element, String key){
        element.sendKeys(key);
    }
    public void enterInput(By by, String key){
       getDriver().findElement(by).click();
    }

    public WebElement presenceOfElement(By elementLocation) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public WebElement visibilityOfElement(By elementLocation) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }

    public WebElement getElement(By key) {
        return getDriver().findElement(key);
    }

    public WebElement getElement(WebElement element) {
        return element;
    }
}
