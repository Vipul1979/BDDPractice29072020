Feature: Search on Zaizi website
  As a user
  I want to see the Zaizi website
  So that user can see the resepective result
  @Smoke
  Scenario: User go to Zaizi website and look for who we are Zaizi Group
    Given User is on Zaizi web site
    When User click on Who we are and select Team and then click on it
    And user print all the team member name
    And User then print "Mendy Hundal" name and verify her position as a "Project Manager"
    Then User can see the respective result

