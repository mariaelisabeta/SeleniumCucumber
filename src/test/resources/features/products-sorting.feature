Feature: Products Sorting
  As a customer
  I want to sort products by different criteria
  So that i Can easily find what I need

#  Scenario: Sort by price
#    Given I open the homepage
#    And I search a product by "vase"
#    When I sort the products by "Price"
#    And I sort the products in descending order
#    Then products should be sorted by "Price" in descending order.



  Scenario Outline: Sort by price
    Given I open the homepage
    And I search a product by "<keyword>"
    When I sort the products by "<sort criteria>"
    And I sort the products in <sort direction> order
    Then products should be sorted by "<sort criteria>" in <sort direction> order.

    Examples:

      | keyword | sort criteria | sort direction |
      | vase    | Price         | descending     |
      | shirt   | Name          | ascending      |
