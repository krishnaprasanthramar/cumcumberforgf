
@Productscenario
Feature: Endtoend scenario for testmeapp
  login with lalitha account and purchase the items.

Background: login with valid creditials
     Given user is on homepage
     When User enters username "Lalitha"
      Then user enters Password "Password123"
     Then User should be logged in and verify.
 
  @AddToCartPaymentProcess
  Scenario: successfull checkout
    Given navigate to all categories-Electronics and headphone
    And add to cart the selected checkouts
    When get into checkout page
    And make some payment and add creditials
    Then redirected into the thankyoupage
   
  
