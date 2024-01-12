Feature: Application Feature
Background:
Given Env is stable

@smoke @regression
  Scenario: Admin Page default Login
    Given User is on Phone Bankin landing Page
    When user login into application online
    |Sara|
    |Kalu|
    |Golu|
    Then landing Page is displayed
   
@smoke @regression
  Scenario Outline: Admin Page with multiple users
    Given User is on Net Bankin landing Page
    When user login into application with username "<Username>" and password "<Password>"
    Then Home Page is displayed
    And Cards are displayed

    Examples: 
      | Username | Password |
      | Sara1    | Vivi1    |
      | Sara2    | Vivi2    |
      | Sara3    | Vivi3    |
