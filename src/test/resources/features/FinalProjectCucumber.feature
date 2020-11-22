



  Feature: Final project tests.
    @SmokeTest
    Scenario: Buy product on site
      Given Open Chrome browser
      When I open https://www.1a.lv/
      And I login to my profile
      Then I enter geforce 1660 super in search line
      And I press search button
      And I choose first product
      And I remember product price
      And I remember product name
      And I press put in cart button
      And I go to cart
      And I compare product name
      And I press next button

      And I choose get product in shop center
      And I choose any shop
      And I press last time next button

      And I compare product price
      And I choose pay with cash
      And I close browser
