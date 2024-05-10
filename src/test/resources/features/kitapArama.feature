@searchBook
Feature: dr Home Page Test
  Background:
    Given User goes to url

  Scenario: TC01 Search Book

    When  Searches Harry Potter
    Then  Asserts that if the results contain Harry Potter
    And   Assert that "335" product listed
    And   Click Best Seller
    And   Add HArry Potter and Plisopher Stone to the chart
    And   Click chart icon
    Then  Assert that if the book is in the chart
    When  user increase number of the pruduct in basket
    Then  Assert if the quantity updated

