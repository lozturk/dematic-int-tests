package com.dematic.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    public WebDriver driver;


@BeforeMethod
    public void setUp(){
    driver = Driver.getDriver();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get(ConfigurationReader.getProperty("url"));
}

@AfterMethod
    public void tearDown(ITestResult result){
    if (result.getStatus() == ITestResult.FAILURE) {
        BrowserUtilities.getScreenshot(result.getName());
    }
    Driver.closeDriver();
}




}
