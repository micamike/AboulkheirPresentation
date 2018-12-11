package com.mike.next.tests;

import com.mike.next.model.SearchBar;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SearchBarTest extends TestBase {

    @Test
    public void searchTest(){

        app.getNavigationHelper().clickOnEnglishArea();
        app.getNavigationHelper().searchBar("shoes");
        app.getNavigationHelper().proceedToSearch();

        Boolean found = app.getNavigationHelper().isElementPresent(By.xpath("//h1[contains(text(),'footwear')]"));
        Assert.assertTrue(found);
    }

    @Test(dataProvider = "searchValid")
    public void searchTestProvider(SearchBar searchBar){

        app.opensite("https://www.next.co.il/en");
        app.getNavigationHelper().searchBar2(searchBar);
        app.getNavigationHelper().proceedToSearch();

        //Boolean found = app.getNavigationHelper().isElementPresent(By.xpath("//h1[contains(text(),'footwear')]"));
        //Assert.assertTrue(found);
    }

    @DataProvider
    public Iterator<Object[]> searchValid() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/searchValid.csv")));
        String line = reader.readLine();
        while (line != null){
            String[] split = line.split(";");
            list.add(new Object[] {new SearchBar()
                    .setText(split[0])});
            line=reader.readLine();
        }
        return list.iterator();
    }
}
