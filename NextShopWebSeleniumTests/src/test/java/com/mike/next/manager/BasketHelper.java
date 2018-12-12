package com.mike.next.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasketHelper extends HelperBase{

    public BasketHelper(WebDriver wd) {
        super(wd);
    }

    public void removeItem() {
        click(By.xpath("//a[@title='Click to remove this item']"));
    }

    public String checkItemCount(){
       return wd.findElement(By.xpath("//div[@class='ItemCount']")).getText();
    }

    public void clickOnBasket(){
        click(By.xpath("//div[@class='ItemCount']"));
    }

    public void clickOnViewBasket() {
        click(By.xpath("//a[@class='view_edit_bag']"));
    }

    public void modifyQtt(){

    }


}
