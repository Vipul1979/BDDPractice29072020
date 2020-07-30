package BDDPractice29072020.BaseClassPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;
    public DriverFactory(){
        PageFactory.initElements(driver,this);
    }
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://zaizi.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }//OpenBrowser method end
    public void closeBrowser() throws IOException {
        TakesScreenshot screenshot = ((TakesScreenshot)driver);
        File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
        File destinationfile = new File("C:\\Users\\Vipul\\Desktop\\ScreenShot.png");
        FileUtils.copyFile(sourcefile,destinationfile);
        driver.close();
    }// closerBrowser method end
}

