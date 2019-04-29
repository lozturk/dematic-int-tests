package com.dematic.tests;

import com.dematic.pages.ContactPage;
import com.dematic.pages.HomePage;
import com.dematic.utilities.BrowserUtilities;
import com.dematic.utilities.Driver;
import com.dematic.utilities.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactPageTests extends TestBase {

    @Test
    public void fillAContactFormTest () {
        HomePage homePg = new HomePage();
        BrowserUtilities.scrollToElement(homePg.contactLinkAtButtomHomePage);
        homePg.contactLinkAtButtomHomePage.click();
        ContactPage contactPg = new ContactPage();
        Driver.getDriver().switchTo().frame(0);
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String company = faker.company().name();
        String email = faker.internet().emailAddress();
        String phoneNumber = faker.phoneNumber().cellPhone();
        contactPg.firstNameBox.sendKeys(firstName);
        contactPg.lastNameBox.sendKeys(lastName);
        contactPg.companyBox.sendKeys(company);
        Select selectCountry = new Select(contactPg.countryBox);
        selectCountry.selectByVisibleText("United States");
        contactPg.emailBox.sendKeys(email);
        contactPg.phoneBox.sendKeys(phoneNumber);
        Select selectInterest = new Select(contactPg.mainAreaOfInterest);
        selectInterest.selectByIndex(7);
        contactPg.commentsBox.sendKeys("I'm interested in Software Products, please ignore this request");
        contactPg.checkBox.click();
        contactPg.sendButton.click();
        String afterContactRequestMessage = "Thank you for your interest in Dematic." +
                " If necessary, someone will reach out to you shortly.";
        String actualMessage = contactPg.messageAfterSubmission.getText();
        Assert.assertEquals(actualMessage,afterContactRequestMessage);
    }
}
