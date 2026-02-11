package scrooge.tests.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import scrooge.framework.driver.DriverFactory;

public class BaseTest {

    @BeforeEach
    public void setUp(){
        DriverFactory.initDriver();
    }

    @AfterEach
    public void tearDown(){
        DriverFactory.quitDriver();
    }

}
