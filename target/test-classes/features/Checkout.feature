@Checkout

  Feature: Feature check out

    Scenario: Add to Cart
      Given User open the website sauce demo
      When User input "standard_user" as userName and input "secret_sauce" as password
      And User sort product list by name z to a
      And User pick item Sauce Labs Onesie
      And User pick item Test.allTheThings T-Shirt Red
      And User click cart
      Then Verify item1
      Then Verify item2
      And User remove test allthethings tshirt
      And User click checkout
      And User input "Andreas" as firstName and "Bagas" as lastName and "12345" as postalCode
      And User click continue button
      Then Verify item Total
      Then Verify item Tax
      Then Verify total payment
      And User click button finish
      Then Verify value text "THANK YOU FOR YOUR ORDER"




#      Given User open the website sauce demo
#      When user input "standard_user" as userName and input "secret_sauce" as password
#      And User select "Price (low to high)" to Filter Product
#      And User pick item Sauce Labs Backpack



#  Scenario : Filter Product and Add Product To Cart
#    Given User open the website sauce demo
#    When User input "standard_user" as userName and input "secret_sauce" as password
#
#    And User pick item Sauce Labs Backpack