Feature: Header Page Functionality

  Scenario: Header -Mega menu- searching function
    Given user logged in
    When  user uses the search input field to search for products milk
    Then user should be navigated to the result page