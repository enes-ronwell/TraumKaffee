@AccountDetailsPage
Feature: Account Details Page

  @AccountDetailsArea @TextAndComponent
  Scenario: Account Details Area Text and Component Control
    Given user on the Account Details Page with Mail:"accountDetailsTestAutomation1@ronwell.net" and Password:"Ronwell.2023"
    Then should see Account Details Area First Name: "First Name*" on Account Details Page
    Then should see Account Details Area Last Name: "Last Name*" on Account Details Page
    Then should see Account Details Area Email: "Email*" on Account Details Page
    Then should see Account Details Area Password: "Password*" on Account Details Page
    Then should see Account Details Area Password Eye on Account Details Page
    Then should see Account Details Area Checkbox: "I would like to receive marketing emails and News. By clicking this, I accept the privacy policy." on Account Details Page
    Then should see Account Details Area Checkbox on Account Details Page
    Then should see Account Details Area Update: "UPDATE" on Account Details Page

  @AccountDetailsArea @Empty @FirstName @A
  Scenario: Account Details Area Empty First Name Control
    Given user on the Account Details Page with Mail:"accountDetailsTestAutomation1@ronwell.net" and Password:"Ronwell.2023"
    When user click First Name Text Box on Account Details Page
    When clear Account Details Area First Name on Account Details Page
    When sendkeys Account Details Area Last Name: "Digital" on Account Details Page
    When click Account Details Area Update on Account Details Page
    Then should see Popup Close Icon
    Then should see Popup Icon
    Then should see Popup Message: "Something went wrong"

  @AccountDetailsArea @Empty @LastName @A
  Scenario: Account Details Area Empty Last Name Control
    Given user on the Account Details Page with Mail:"accountDetailsTestAutomation1@ronwell.net" and Password:"Ronwell.2023"
    When sendkeys Account Details Area First Name: "Ronwell" on Account Details Page
    When clear Account Details Area Last Name on Account Details Page
    When click Account Details Area Update on Account Details Page
    Then should see Popup Close Icon
    Then should see Popup Icon
    Then should see Popup Message: "Something went wrong"

  @AccountDetailsArea @Successfully @FirstName
  Scenario: Account Details Area Successfully Change First Name Control
    Given user on the Account Details Page with Mail:"accountDetailsTestAutomation1@ronwell.net" and Password:"Ronwell.2023"
    When sendkeys Account Details Area First Name: "Ronwell" on Account Details Page
    When sendkeys Account Details Area Last Name: "Digital" on Account Details Page
    When click Account Details Area Update on Account Details Page
    Then should see Popup Close Icon
    Then should see Popup Icon
    Then should see Popup Message: "Account Details Updated Successfully"
