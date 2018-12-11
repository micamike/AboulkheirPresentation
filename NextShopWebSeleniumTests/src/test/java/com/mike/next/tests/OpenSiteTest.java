package com.mike.next.tests;

import com.mike.next.manager.ApplicationManager;
import com.mike.next.manager.HelperBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenSiteTest extends TestBase {

    @Test
    public void openSiteEnglishByLink(){
        app.opensite("https://www.next.co.il/he");
        app.getNavigationHelper().clickOnEnglishArea();
        //Boolean MyAccount = app.getHelperBase().isElementPresent(By.xpath("//a[@title='My Account']"));
        //Assert.assertTrue(MyAccount);
    }

    @Test
    public void openSiteHebrewByLink(){
        app.opensite("https://www.next.co.il/en");
        app.getNavigationHelper().clickOnHebrewArea();
        Boolean MyAccount = app.getHelperBase().isElementPresent(By.xpath("//a[@title='כניסה לצפייה בפרטי החשבון']"));
        Assert.assertTrue(MyAccount);
    }

    @Test
    public void openSiteEnglishByFlag(){
        app.opensite("https://www.next.co.il/he");
        app.getNavigationHelper().clickOnFlag();
        app.getNavigationHelper().clickOnEnglishButton();

        //Boolean MyAccount = app.getHelperBase().isElementPresent(By.xpath("//a[@title='My Account']"));
        //Assert.assertTrue(MyAccount);
    }

    @Test
    public void openSiteHebrewByFlag(){
        app.opensite("https://www.next.co.il/en");
        app.getNavigationHelper().clickOnFlag();
        app.getNavigationHelper().clickOnHebrewButton();

        Boolean MyAccount = app.getHelperBase().isElementPresent(By.xpath("//a[@title='כניסה לצפייה בפרטי החשבון']"));
        Assert.assertTrue(MyAccount);
    }


}
