@GoogleAccount
  Feature: Homepage of google Account
    Scenario Outline: As a user I want to go to create google account page so that i can access the application.
      Given I am in homepage "https://accounts.google.com/signup/v2"
      When I enter "<firstname>"
      And  click on next
      Then I am in create new account page
      Examples:
      |firstname|
      |Charles|




