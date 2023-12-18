@Location @Smoke
Feature: Location functionality

  Background:
    Given I login to location site

  Scenario: My location directions
    Given User navigates to "My Address" page
    When User clicks on directions
    Then Map should be displayed with directions
