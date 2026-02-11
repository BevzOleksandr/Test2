package scrooge.framework.driver;

import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.windows.WindowsDriver;
import lombok.Getter;
import org.aeonbits.owner.ConfigFactory;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import scrooge.framework.config.AppConfig;

public class DriverFactory {

    @Getter
    private static WindowsDriver driver;
    private static final AppConfig config = ConfigFactory.create(AppConfig.class);


    public static void initDriver() {
        DesiredCapabilities capabilities =  new DesiredCapabilities();

        capabilities.setCapability("app", config.appPath());
        capabilities.setCapability("platformName", "Windows");
        capabilities.setCapability("deviceName", "WindowsPC");

        try{
            driver = new WindowsDriver(new URL(config.remoteUrl()), capabilities);
            WebDriverRunner.setWebDriver(driver);
        } catch (MalformedURLException exception){
            throw new RuntimeException("Can't create driver!", exception);
        }
    }

    public static void quitDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

}
