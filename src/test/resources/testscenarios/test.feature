Feature: Website search, filter and cart functionality

  @ts1
  Scenario: Users are able to search for an item using the search bar
    Given user is on homepage
    And user put any search "Blouse" term in the search bar
    When user click search button
    Then user is able to see the searched item "Blouse"

  @ts2
  Scenario: Users are able to filter search results under Women category by Color and Category
    Given user is on homepage
    And user click on Women category
    When user select any value from the Color and Category filter item
    Then the results returned matches the filter criteria

  @ts3
  Scenario: Users are able to view the details of any clothing item from the POPULAR section and add them to the cart
    Given user is on homepage
    When user select "Faded Short Sleeve T-shirts" from the POPULAR section and add them to the cart
    Then Validate that "Faded Short Sleeve T-shirts" has successfully been added to the cart
