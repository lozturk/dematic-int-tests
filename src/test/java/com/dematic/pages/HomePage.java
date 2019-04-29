package com.dematic.pages;

import com.dematic.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage {

public HomePage(){
    PageFactory.initElements(Driver.getDriver(), this);
}

    public List<String> getGrayBarList() {
        List<WebElement> grayBarElement = Driver.getDriver().findElements(By.xpath("//ul[@class='navbar-nav']/li/a"));
        List<String> list = new ArrayList<>();
        for (WebElement listItem : grayBarElement) {
            list.add(listItem.getText());
        }
    return list;
    }

    @FindBy (xpath = "(//*[.='Contact'])[2]")
    public WebElement contactLinkAtButtomHomePage;

}
