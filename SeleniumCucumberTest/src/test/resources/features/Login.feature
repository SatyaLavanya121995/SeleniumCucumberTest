@Login @smoke
Feature: Login functionality

  Scenario Outline: Validate user login
    Given User navigates to the login page
    When User enters the login details "<username>" "<password>"
    Then User should be able to view the dashboard

    Examples:
    |username|password|
    | Admin  | admin123 |
    | Admin  | admin12  |
