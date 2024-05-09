@Registration
Feature: dr Registration Test
  Background:
    Given User goes to url

  Scenario: Registration

    When  Clicks menu button
    And   Clicks registeritation button
    And   Writes valid Name in namebox
    And   Writes valid Surname in Surnamebox
    And   writes email address in mailbox
    And   writes password
    And   Clicks membership agreement Checkbox
    And   Clicks clarification checkbox
    And   Clicks Register button