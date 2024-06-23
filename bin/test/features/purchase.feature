Feature: Purchase products at Demoblaze

  Scenario: Purchase products
    Given User is on the Demoblaze homepage
    When User adds "Samsung galaxy s6" to the cart
    And User views the cart
    And User completes the order form
    Then User verifies the purchase
