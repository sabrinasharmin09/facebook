@BasicPage
  Feature: Create basic information for my feature file.
    Scenario Outline: As a user i want to create basic information.
      Given I want to go to "https://accounts.google.com/signup/v2" in step
      When I type "<firstname>" and click next button
      And  I type the "<month>" mo
      And  I type the "<day>" day
      And  I type the "<year>" year
      And  I type the "<gender>" gender
      And  I click on next
      Then I verify the <status> in step
      Examples:
     |firstname |month| day|year|gender|
     | Charles|May  | 20 |1999|Male|

#@tag
#Feature: Title of your feature
#  I want to use this template for my feature file
#  Scenario Outline: Title of your scenario outline
#    Given I want to write a step with <name>
#    When I check for the <value> in step
#    Then I verify the <status> in step
#
#    Examples:
#      | name  | value | status  |
#      | name1 |     5 | success |
#      | name2 |     7 | Fail    |
