package com.mike.next.manager;

import com.mike.next.model.SearchBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void clickOnFlag() {
       click(By.xpath("//div[contains(@class,'HeaderFlag flagBackground flag-Israel')]"));
    }

    public void clickOnEnglishArea() {click(By.cssSelector("area[href='https://www.next.co.il/en']"));
    }

    public void clickOnHebrewArea() {click(By.cssSelector("area[href='../he']"));
    }

    public void clickOnEnglishButton() {
        click(By.xpath("//input[@value='English']"));
        click(By.xpath("//a[@id='btnFlagSelectorShopNow']"));
    }

    public void clickOnHebrewButton() {
        click(By.xpath("//input[contains(@value,'עברית')]"));
        click(By.xpath("//a[@id='btnFlagSelectorShopNow']"));
    }

    public void searchBar(String text) {
        type(By.xpath("//input[@id='sli_search_1']"), text);
    }

    public void searchBar2(SearchBar searchBar) {
        type(By.xpath("//input[@id='sli_search_1']"), searchBar.getText());
    }

    public void proceedToSearch() {
        click(By.xpath("//input[@title='Search Items']"));
    }
}
