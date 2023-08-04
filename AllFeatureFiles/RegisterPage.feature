@EndToEndTesting
Feature: Test Guru99 Register Application

  Scenario: Test Register Page functinality
    Given user open Guru99 register page on "edge" broweser
    When user enter valid contactinfo as firstname lastname phone and email
      | abc | xyx | 1234567890 | abc@gmail.com |
    Then user enter valid maillinginfo as address city state postalcode and country
      | pune | Pune | Maharashta | 444444 | INDIA |
    And enter valid userinfo as username password confirmpassword and user click  on submit button
      | abc123 | abc@123 | abc@123 |

  Scenario: Test RegisterPageSuccess Functinality
    When user is on RegisterPageSuccess and user capture screenshot
    And user click on sign-in link
