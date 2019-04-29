package com.dematic.pages;

import com.dematic.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

    public ContactPage (){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//label[.='First Name']/../input")
    public WebElement firstNameBox;

    @FindBy (xpath = "//label[.='Last Name']/../input")
    public WebElement lastNameBox;

    @FindBy (xpath = "//label[.='Company']/../input")
    public WebElement companyBox;

    @FindBy (xpath = "//label[.='Country']/../select")
    public WebElement countryBox;

    @FindBy (xpath = "//label[.='Email']/../input")
    public WebElement emailBox;

    @FindBy (xpath = "//label[.='Phone']/../input")
    public WebElement phoneBox;

    @FindBy (xpath = "//label[.='Main Area of Interest']/../select")
    public WebElement mainAreaOfInterest;

    @FindBy (xpath = "//label[.='Comments']/../textarea")
    public WebElement commentsBox;

    @FindBy (xpath = "//input[@type='checkbox']")
    public WebElement checkBox;

    @FindBy (xpath = "//input[@value='Send']")
    public WebElement sendButton;

    @FindBy(xpath = "//*[@id='pardot-form']/p/span/span")
    public WebElement messageAfterSubmission;






}
