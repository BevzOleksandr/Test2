package scrooge.framework.driver;

import io.appium.java_client.windows.WindowsDriver;
import lombok.Getter;
import org.aeonbits.owner.ConfigFactory;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import scrooge.framework.config.AppConfig;
import java.util.concurrent.TimeUnit;

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
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        } catch (MalformedURLException exception){
            throw new RuntimeException("Неправильний URL у конфігу!", exception);
        }
    }

    public static void quitDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

}
