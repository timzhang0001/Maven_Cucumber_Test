Feature: CartPage Functionality
  @gogo
  Scenario: CartPage- add product and select date and proceed
    Given user logged in
    And  user select a item Value Lite Milk to chat
    When user increase the number which is of selected product
    And user select the deliver date
    And user click the proceed button
    Then the checkout page is display