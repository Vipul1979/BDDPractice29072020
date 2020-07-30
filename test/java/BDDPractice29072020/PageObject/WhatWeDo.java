package BDDPractice29072020.PageObject;

import BDDPractice29072020.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class WhatWeDo extends DriverFactory {
    @FindBy(xpath = "//a[contains(text(),'Our Approach')]")
    WebElement whatWeDo;
    @FindBy(xpath = "//a[contains(text(),'Our Approach')]")
    WebElement ourApproach;
        public void clickOnOurApproach(){
            Actions action = new Actions(driver);
            action.moveToElement(whatWeDo).perform();
            action.moveToElement((ourApproach)).click().perform();
        }

       public void assertDeliveringYourProject(){
            String actualDelveringYourProjectpageInWhatWeDo = driver.getTitle();
           Assert.assertThat(actualDelveringYourProjectpageInWhatWeDo, Matchers.containsString(""));
            System.out.println(actualDelveringYourProjectpageInWhatWeDo);
       }
       public void assertZaiziHomePageURL(){

           String actualHomePageURL =  driver.getCurrentUrl();
            Assert.assertThat(actualHomePageURL,Matchers.containsString("https://zaizi.com/"));
            System.out.println(actualHomePageURL);
        }
}//Class end

