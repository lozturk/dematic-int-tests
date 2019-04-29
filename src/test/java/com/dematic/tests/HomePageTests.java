package com.dematic.tests;


import com.dematic.pages.HomePage;
import com.dematic.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {

    @Test
    public void upperGrayBarTest (){
        HomePage homePage = new HomePage();
        System.out.println(homePage.getGrayBarList());
        Assert.assertTrue(homePage.getGrayBarList().contains("Downloads & Resources"));
    }



}
