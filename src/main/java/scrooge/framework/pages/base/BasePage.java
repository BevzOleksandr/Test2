package scrooge.framework.pages.base;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;

import scrooge.framework.driver.DriverFactory;

import static com.codeborne.selenide.Selenide.$;

public abstract class BasePage {

    protected WindowsDriver driver;

    public BasePage(){
        this.driver = DriverFactory.getDriver();
    }

    //Можна буде додати логування чи вейти, поки залишу без змін
    protected void click(By locator){
        $(locator).click();
    }

    protected void type(By locator, String text){
        $(locator).setValue(text);
    }

    protected String getText(By locator){
        return $(locator).text();
    }

}
