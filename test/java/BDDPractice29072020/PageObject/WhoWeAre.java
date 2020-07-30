package BDDPractice29072020.PageObject;

import BDDPractice29072020.BaseClassPackage.DriverFactory;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WhoWeAre extends DriverFactory {
    @FindBy(partialLinkText = "WHO WE A")
    WebElement whoWeAre;
    @FindBy(xpath = "//a[contains(text(),'Team')]")
    WebElement team;
    @FindBy(xpath = "//a[@class='button']")
    WebElement loadMoreButton;
    @FindBy(css = "team-name")
    WebElement teamName;

    public void zaiziHomePageUrl() {
        String actualZaiziHomePageURL = driver.getCurrentUrl();
        Assert.assertThat(actualZaiziHomePageURL, Matchers.containsString("https://zaizi.com/"));
    }

    public void whoWe() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(whoWeAre).perform();
        action.moveToElement(team).click().perform();
    }

    public void clickOnLoadMore() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-1000)");

        Thread.sleep(2000);
        loadMoreButton.click();
    }//whoWe method end

    public void printAllTeamMemberName() throws InterruptedException {
        Thread.sleep(5000);
        List<WebElement> teams = driver.findElements(By.cssSelector(".team-name"));

        for (WebElement team : teams)
        { String allName = team.getText();
        System.out.println(allName);}
        if (team.getText().contains("Mark Rogers")){
            team.click();
            }//if block end
    }//foreach loop end

        public void assertTeamPageURL(){
            String actualTeamPageUrl = driver.getCurrentUrl();
            Assert.assertThat(actualTeamPageUrl,Matchers.containsString("who-we-are/team"));
            {System.out.println("We are on team page");}
    }//teamPageUrl method end

    @FindBy(xpath = "//div[contains(@class,'team-info')]//a[contains(text(),'Mark Rogers')]")
     WebElement hooverOnMarkName;
    @FindBy(linkText = "Mark Rogers")
     WebElement markRogers;
    public void clickOnMarkRogersName(){
        Actions actions = new Actions(driver);
        actions.moveToElement(hooverOnMarkName).perform();
        actions.moveToElement(markRogers).click().perform();
    }
    public void assertTeamMarkRogersPage(){
        String actualMarkDetailPage = driver.getTitle();
        Assert.assertThat(actualMarkDetailPage,Matchers.containsString("Mark Rogers | Zaizi"));
    }

    @FindBy(xpath = "//div[contains(text(),'Senior Technical Lead')]")
    WebElement rogerPosition;
    public void rogerPostionAssertion(){
        JavascriptExecutor js1 = (JavascriptExecutor)driver;
       // js1.executeScript("arguments[0],scrollIntoview",rogerPosition);
        js1.executeScript("window.scrollBy(0,-1300)");
        System.out.println(rogerPosition.getText());

    }
}//WhoWeAre Class end
