package BDDPractice29072020.StepDefinition;

import BDDPractice29072020.PageObject.WhatWeDo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WhatWeDoSteps {
    WhatWeDo whatWeDo = new WhatWeDo();
    @Given("^user is on Zaizi website$")
    public void user_is_on_Zaizi_website() throws Throwable {
    whatWeDo.assertZaiziHomePageURL();
    }

    @When("^user hoover on what we do and click on our approarch$")
    public void user_hoover_on_what_we_do_and_click_on_our_approarch() throws Throwable {
    whatWeDo.clickOnOurApproach();
    }

    @Then("^user should see messege \"([^\"]*)\"$")
    public void user_should_see_messege(String arg1) throws Throwable {
        whatWeDo.assertDeliveringYourProject();
    }


} //hello
