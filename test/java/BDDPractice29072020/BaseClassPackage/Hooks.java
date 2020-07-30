package BDDPractice29072020.BaseClassPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();
    @Before
    public void setUp(){
        driverFactory.openBrowser();
    }//setUp method end
    @After
    public void tearDown() throws IOException {
        driverFactory.closeBrowser();
    }
}// Class end
