@MyAccountPage
Feature: My Account Page

  @MyAccountArea @TextAndComponent
  Scenario: My Account Area Text and Component Control
    Given user on the My Account Page with Mail: "myAccountTestAutomation1@ronwell.net" and Password: "Ronwell.2023"
    Then should see My Account Area Title: "My Account" on My Account Page
    Then should see My Account Area Account: "Account" on My Account Page
    Then should see My Account Area Account Image on My Account Page
    Then should see My Account Area Addresses: "Addresses" on My Account Page
    Then should see My Account Area Addresses Image on My Account Page
    Then should see My Account Area Order History: "Order History" on My Account Page
    Then should see My Account Area Order History Image on My Account Page
    Then should see My Account Area Sign Out: "Sign Out" on My Account Page
    Then should see My Account Area Sign Out Image on My Account Page

  @MyAccountArea @Navigation @Account
  Scenario: My Account Area Account Details Navigation Control
    Given user on the My Account Page with Mail: "myAccountTestAutomation1@ronwell.net" and Password: "Ronwell.2023"
    When click My Account Area Account on My Account Page
    Then should see Account Details Page

  @MyAccountArea @Navigation @Addresses
  Scenario: My Account Area Addresses Navigation Control
    Given user on the My Account Page with Mail: "myAccountTestAutomation1@ronwell.net" and Password: "Ronwell.2023"
    When click My Account Area Addresses on My Account Page
    Then should see Addresses Page

  @MyAccountArea @Navigation @OrderHistory
  Scenario: My Account Area OrderHistory Navigation Control
    Given user on the My Account Page with Mail: "myAccountTestAutomation1@ronwell.net" and Password: "Ronwell.2023"
    When click My Account Area Order History on My Account Page
    Then should see Order History Page

  @MyAccountArea @Navigation @SignOut
  Scenario: My Account Area SignOut Navigation Control
    Given user on the My Account Page with Mail: "myAccountTestAutomation1@ronwell.net" and Password: "Ronwell.2023"
    When click My Account Area Sign Out on My Account Page
    Then should see the Sign In Page
