package com.dematic.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BrowserUtilities {

    public static String getScreenshot(String name) {
       String time = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
       TakesScreenshot takesScreenshot = (TakesScreenshot)Driver.getDriver();
       File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
       String target = System.getProperty("user.dir") + "/test-output/ScreenShots" + name + time + ".png";
       File finalDestination = new File(target);
       try {
           FileUtils.copyFile(source, finalDestination);
        } catch (IOException io) {
       }
       return target;
    }

    public static void scrollToElement (WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }



}
