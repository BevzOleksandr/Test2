package scrooge.framework.pages.base;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import scrooge.framework.driver.DriverFactory;

public abstract class BasePage {

    protected WindowsDriver driver;

    public BasePage(){
        this.driver = DriverFactory.getDriver();
    }

    //Можна буде додати логування чи вейти, поки залишу без змін
    protected void click(By locator){
        driver.findElement(locator).click();
    }

    protected void type(By locator, String text){
        WebElement element = driver.findElement(locator);
        element.click();
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
        element.sendKeys(text);
    }

    protected String getText(By locator){
        return driver.findElement(locator).getText();
    }

}
