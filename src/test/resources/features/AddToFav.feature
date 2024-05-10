@AddFav
Feature: dr Add to favorite Test
  Background:
    Given User goes to url

  Scenario: Add Fav

    When   Clicks menu button
    And   Clicks electronic button
    And   Click cellphones
    And   Asserts that page title contains CellPhones
    And   Filter the newest products
    And   Click the product
    And   Clicks heart icon

