package com.mike.next.manager;

import com.mike.next.tests.MyListener;
import com.sun.org.apache.xml.internal.security.utils.HelperNodeList;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager{

  EventFiringWebDriver wd;
  private String browser;
  private HelperBase helperBase;
  private NavigationHelper navigationHelper;
  private ItemHelper itemHelper;
  private BasketHelper basketHelper;

  public ApplicationManager(String browser) {
    this.browser = browser;
  }


  public void start() {

    if (browser.equals(BrowserType.CHROME)) {
      wd = new EventFiringWebDriver(new ChromeDriver());
    } else if (browser.equals(BrowserType.FIREFOX)) {
      wd = new EventFiringWebDriver(new FirefoxDriver());
    } else if (browser.equals(BrowserType.EDGE)) {
      wd = new EventFiringWebDriver(new EdgeDriver());
    }

    wd.register(new MyListener());
    helperBase = new HelperBase(wd);
    navigationHelper = new NavigationHelper(wd);
    itemHelper = new ItemHelper(wd);
    basketHelper = new BasketHelper(wd);
    wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    //wd.navigate().to("https://www.next.co.il/he");
  }


  public void stop() {
    wd.quit();
  }


  public void opensite(String url) {
    wd.navigate().to(url);
  }


  public HelperBase getHelperBase() {
    return helperBase;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public ItemHelper getItemHelper() { return itemHelper;  }

  public BasketHelper getBasketHelper() { return basketHelper; }

}
