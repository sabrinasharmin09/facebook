#@Chrome
#Feature: Create a Gmail address for signing in to  Google Account
#  Scenario Outline: As a user i want to create gmail address for sign in.
#    Given I want to go to "https://accounts.google.com/signup/v2" in
#    When I type "<username>"
#    And I click on next button
#    Then I verify the <status>
#    Examples:
#    |username|status|

  @tag
  Feature: Create a Gmail address for sign in to Google Account

  Scenario Outline: As a user i want to create gmail address for sign in.
    Given I want to go to "https://accounts.google.com/signup/v2" in
    When I type "<username>"
    And I click on next button
    Then I verify the <status> in

    Examples:
      |username|