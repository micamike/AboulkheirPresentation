package com.mike.next.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemHelper extends HelperBase {

    public ItemHelper(WebDriver wd) {
        super(wd);
    }

    public void selectFirstItem(){
        click(By.cssSelector(".Item"));
    }

    public void addItemToBag(){
        click(By.xpath("//a[@class='nxbtn primary btn-addtobag addToBagCTA Enabled']"));
    }

    public void chooseSize(){
        click(By.cssSelector(".SizeSelector"));
        click(By.cssSelector(".SizeSelector .InStock"));
    }

}
