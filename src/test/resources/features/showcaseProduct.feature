@showCaseProduct
Feature: dr Showcase Test
  Background:
    Given User goes to url

  Scenario: TC03 Showcase Product

    When  Scroll Down to Showcase Products
    And   Clicks Show All button
    And   Assert that if Tuncmatic Economy 600 is visible
    And   Writes valid Surname in Surnamebox
    And   writes email address in mailbox
    And   writes password
    And   Clicks membership agreement Checkbox
    And   Clicks clarification checkbox
    And   Clicks Register button