package scrooge.framework.pages.base;

import io.appium.java_client.windows.WindowsDriver;

import scrooge.framework.driver.DriverFactory;

public abstract class BasePage {

    protected WindowsDriver driver;

    public BasePage(){
        this.driver = DriverFactory.getDriver();
    }

}
