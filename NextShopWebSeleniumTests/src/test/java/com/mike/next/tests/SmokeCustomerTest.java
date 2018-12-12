package com.mike.next.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SmokeCustomerTest extends TestBase {



    @Test
    public void CustomerTest1() throws InterruptedException {

        app.opensite("https://www.next.co.il/en");
        app.getNavigationHelper().searchBar("shoes");
        app.getNavigationHelper().proceedToSearch();
        app.getNavigationHelper().click(By.xpath("//input[@id='gender2']"));
        app.getItemHelper().selectFirstItem();
        app.getItemHelper().chooseSize();
        Thread.sleep(2000);
        app.getItemHelper().addItemToBag();
        Thread.sleep(2000);
        app.getBasketHelper().checkItemCount();
        app.getBasketHelper().clickOnBasket();
        app.getBasketHelper().clickOnViewBasket();
        app.getBasketHelper().removeItem();

    }
}
