@showCaseProduct
Feature: dr Showcase Test
  Background:
    Given User goes to url

  Scenario: TC03 Showcase Product

    When  Scroll Down to Showcase Products
    And   Clicks Show All button
    Then  Assert that "658" pruducts listed
    And   Clicks out of stock
    Then  Asserts that "845" pruducts listed
    When  Clicks Most Commented products
    And   Clicks Dogan Cuceloglu's Book Var Misin
    And   Clicks stars icon
    Then  Asserts there are "154" comments
    And   Asserts if Cok guzel kitap rahat akici kesinlikle okuyun
