Feature: Product Detail Page Functionality
  Scenario: PDP Page- add product to cart
    Given user logged in
    When user search forAnchor Blue Milk and navigated to product detail page
    And user select different uom case
    And user select 2 numbers of product
    And user add the product to cart
    Then the cart should show the added items