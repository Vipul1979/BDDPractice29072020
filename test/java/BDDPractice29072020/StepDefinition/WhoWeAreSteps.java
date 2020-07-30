package BDDPractice29072020.StepDefinition;

import BDDPractice29072020.PageObject.WhoWeAre;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WhoWeAreSteps {
    WhoWeAre whoWeAre = new WhoWeAre();
    @Given("^User is on Zaizi web site$")
    public void user_is_on_Zaizi_web_site() throws Throwable {
        whoWeAre.zaiziHomePageUrl();
    }

    @When("^User click on Who we are and select Team and then click on it$")
    public void user_click_on_Who_we_are_and_select_Team_and_then_click_on_it() throws Throwable {
        whoWeAre.whoWe();
        whoWeAre.clickOnLoadMore();
    }

    @When("^user print all the team member name$")
    public void user_print_all_the_team_member_name() throws Throwable {
        whoWeAre.printAllTeamMemberName();
    }

    @When("^User then print \"([^\"]*)\" name and verify her position as a \"([^\"]*)\"$")
    public void user_then_print_name_and_verify_her_position_as_a(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^User can see the respective result$")
    public void user_can_see_the_respective_result() throws Throwable {
        whoWeAre.assertTeamPageURL();
    //    whoWeAre.clickOnMarkRogersName();
   //     whoWeAre.assertTeamMarkRogersPage();
        whoWeAre.rogerPostionAssertion();
    }
}
