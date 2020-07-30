Feature: What we do
  @Regression
  Scenario: User go to Zaizi website and search for what we do
    Given user is on Zaizi website
    When user hoover on what we do and click on our approarch
    Then user should see messege "Delevering your Project"