Feature: User do register in the page amazon.com


  Scenario: User access in the page amazon.com
    Given the user is in the page amazon.com
    When User choose a product
    And Add product on the cart
    Then User confirm your buy