@ContactPage
Feature: Contact Page

  @TextAndComponent
  Scenario: Contact Page Text and Component Control
    Given user on the Contact Page
    Then should see Contact Area Title: "Contact Us" on Contact Page
    Then should see Contact Area Image on Contact Page
    Then should see Our Office Area Title: "Our Office" on Contact Page
    Then should see Our Office Area Our Office Address Title: "OFFICE ADDRESS" on Contact Page
    Then should see Our Office Area Our Office Address Description: "Al Quoz 1 Street, Warehouse No.12, Street 8, Dubai, AE" on Contact Page
    Then should see Our Office Area Our Office Address Icon on Contact Page
    Then should see Our Office Area Our Office Phone Title: "OFFICE PHONE" on Contact Page
    Then should see Our Office Area Our Office Phone Description: "+971 503852855" on Contact Page
    Then should see Our Office Area Our Office Phone Icon on Contact Page
    Then should see Follow Us Area Title: "Follow Us" on Contact Page
    Then should see Follow Us Area Facebook Icon on Contact Page
    Then should see Follow Us Area Instagram Icon on Contact Page
    Then should see Follow Us Area Twitter Icon on Contact Page
    Then should see Follow Us Area Tiktok Icon on Contact Page
    Then should see Web Support Area Title: "Web Support" on Contact Page
    Then should see Web Support Area Mail: "contact@traumkaffee.com" on Contact Page
    Then should see Get In Touch Area Title: "Get In Touch" on Contact Page
    Then should see Get In Touch Area Name: "Name*" on Contact Page
    Then should see Get In Touch Area Name Textbox on Contact Page
    Then should see Get In Touch Area Email: "Email*" on Contact Page
    Then should see Get In Touch Area Email Textbox on Contact Page
    Then should see Get In Touch Area Subject: "Subject*" on Contact Page
    Then should see Get In Touch Area Subject Dropdown on Contact Page
    When click Get In Touch Area Subject Dropdown on Contact Page
    Then should see Get In Touch Area Subject Option: "General question" on Contact Page
    Then should see Get In Touch Area Subject Option: "Where is my cargo ?" on Contact Page
    Then should see Get In Touch Area Subject Option: "Payment system problem" on Contact Page
    Then should see Get In Touch Area Subject Option: "Return process" on Contact Page
    Then should see Get In Touch Area Order Number: "Order Number*" on Contact Page
    Then should see Get In Touch Area Order Number Textbox on Contact Page
    Then should see Get In Touch Area Message: "Message*" on Contact Page
    Then should see Get In Touch Area Message Textbox on Contact Page
    Then should see Get In Touch Area Send Button: "SEND" on Contact Page

  @FollowUsArea @Navigation @Facebook
  Scenario: Follow Us Area Facebook Navigation Control
    Given user on the Contact Page
    When click Follow Us Area Facebook Icon on Contact Page
    Then should see the Traum Kaffee Facebook Page

  @FollowUsArea @Navigation @Instagram
  Scenario: Follow Us Area Instagram Navigation Control
    Given user on the Contact Page
    When click Follow Us Area Instagram Icon on Contact Page
    Then should see the Traum Kaffee Instagram Page

  @FollowUsArea @Navigation @Twitter
  Scenario: Follow Us Area Twitter Navigation Control
    Given user on the Contact Page
    When click Follow Us Area Twitter Icon on Contact Page
    Then should see the Traum Kaffee Twitter Page

  @FollowUsArea @Navigation @Tiktok
  Scenario: Follow Us Area Tiktok Navigation Control
    Given user on the Contact Page
    When click Follow Us Area Tiktok Icon on Contact Page
    Then should see the Traum Kaffee Tiktok Page

  @GetInTouchArea @EmptyField
  Scenario: Get In Touch Area Empty Fields Control
    Given user on the Contact Page
    When click Get In Touch Area Send Button on Contact Page
    Then should see Get In Touch Area Name Required Message: "This is required." on Contact Page
    Then should see Get In Touch Area Mail Invalid Message: "Email is invalid." on Contact Page
    Then should see Get In Touch Area Subject Required Message: "This is required." on Contact Page
    Then should see Get In Touch Area Order Number Required Message: "This is required." on Contact Page
    Then should see Get In Touch Area Message Required Message: "This is required." on Contact Page

  @GetInTouchArea @Successfully
  Scenario: Get In Touch Area Successfully Control
    Given user on the Contact Page
    When sendkeys Get In Touch Area Name: "Enes" on Contact Page
    When sendkeys Get In Touch Area Email: "enes.erdogan@ronwell.net" on Contact Page
    When select Get In Touch Area Subject: "Payment system problem" on Contact Page
    When sendkeys Get In Touch Area Order Number: "1" on Contact Page
    When sendkeys Get In Touch Area Message: "Test Otomasyon Mesajı" on Contact Page
    When click Get In Touch Area Send Button on Contact Page
    Then should see Popup Message: "Your message has been sent successfully."
    Then should see Popup Icon
    Then should see Popup Close Icon
