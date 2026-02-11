package scrooge.tests.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import scrooge.framework.driver.DriverFactory;

public class BaseTest {

    @BeforeEach
    public void setUp(){
        DriverFactory.initDriver();
        com.codeborne.selenide.Configuration.timeout = 5000;
        com.codeborne.selenide.Configuration.screenshots = true;
    }

    @AfterEach
    public void tearDown(){
        DriverFactory.quitDriver();
    }

}
