@SmokeTest
Feature: OneA choose and buy product.

  Background: Open 1a.lv website
    Given Open Chrome browser
    When I open https://www.1a.lv/
    Then I compare title is he Lielākais interneta veikals Latvijā | 1a.lv
    And I login to my profile

  Scenario: Buy product on site
    Then I enter geforce 1660 super in search line
    And I press search button
    And I choose first product
    And I remember product price
    And I remember product name
    And I press put in cart button
    Then I go to cart
    And I compare product name
    And I press next button
    And I choose get product in shop center
    And I choose any shop
    And I press last time next button
    And I choose pay with cash
    And I compare product price
    And I close browser
