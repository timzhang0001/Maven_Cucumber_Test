Feature: PLP Functionalities
  Scenario: PLP page- user using the search function and select a product
    Given user logged in
    When  user uses the search input field to search for products milk
    Then user should be navigated to the result page
    And  user select a productAnchor Blue Milk
    Then user can navigate to product detail page
