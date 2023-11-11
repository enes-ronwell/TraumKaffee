@Footer
Feature: Footer

  @TraumKaffeeArea @TextAndComponent
  Scenario: Traum Kaffee Area Text and Component Control
    Given user on the Home Page
    Then should see Traum Kaffee Area Title: "Traum Kaffee Co." on Footer
    Then should see Traum Kaffee Area Image on Footer
    Then should see Traum Kaffee Area All Rights Reserved: "© 2023, Traum Kaffee Co. | All Rights Reserved" on Footer

  @TraumKaffeeArea @Navigaiton
  Scenario: Traum Kaffee Area Navigation Control
    Given user on the About Page
    When click Traum Kaffee Area Image on Footer
    Then should see the Home Page

  @QuickLinksArea @TextAndComponent
  Scenario: Quick Links Area Text and Component Control
    Given user on the Home Page
    Then should see Quick Links Area Title: "Quick Links" on Footer
    Then should see Quick Links Area My Account: "My Account" on Footer
    Then should see Quick Links Area FAQ: "FAQ" on Footer
    Then should see Quick Links Area Become Our Partner: "Become Our Partner" on Footer
    Then should see Quick Links Area Contact: "Contact" on Footer
    Then should see Quick Links Area Products: "Products" on Footer
    Then should see Quick Links Area Blog: "Blog" on Footer

  @QuickLinksArea @Navigation @MyAccount
  Scenario: Quick Links Area My Account Navigation Control
    Given user on the Home Page
    When click Quick Links Area My Account on Footer
    Then should see the Sign In Page

  @QuickLinksArea @Navigation @MyAccount
  Scenario: Quick Links Area My Account Navigation Control
    Given user on the Home Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    When click Quick Links Area My Account on Footer
    Then should see the My Account Page

  @QuickLinksArea @Navigation @FAQ
  Scenario: Quick Links Area FAQ Navigation Control
    Given user on the Home Page
    When click Quick Links Area FAQ on Footer
    Then should see the FAQ Page

  @QuickLinksArea @Navigation @BecomeOurPartner
  Scenario: Quick Links Area Become Our Partner Navigation Control
    Given user on the Home Page
    When click Quick Links Area Become Our Partner on Footer
    Then should see the Become Our Partner Page

  @QuickLinksArea @Navigation @MyAccount
  Scenario: Quick Links Area Contact Navigation Control
    Given user on the Home Page
    When click Quick Links Area Contact on Footer
    Then should see the Contact Page

  @QuickLinksArea @Navigation @Products
  Scenario: Quick Links Area Products Navigation Control
    Given user on the Home Page
    When click Quick Links Area Products on Footer
    Then should see the Products Page

  @QuickLinksArea @Navigation @Blog
  Scenario: Quick Links Area Blog Navigation Control
    Given user on the Home Page
    When click Quick Links Area Blog on Footer
    Then should see the Blogs Page

  @LegalsArea @TextAndComponent
  Scenario: Legals Area Text and Component Control
    Given user on the Home Page
    Then should see Legals Area Title: "Legal" on Footer
    Then should see Legals Area Privacy Policy: "Privacy Policy" on Footer
    Then should see Legals Area Terms Conditions: "Terms & Conditions" on Footer
    Then should see Legals Area Refund Policy: "Refund Policy" on Footer

  @LegalsArea @Navigation @PrivacyPolicy
  Scenario: Quick Links Area Privacy Policy Navigation Control
    Given user on the Home Page
    When click Legals Area Privacy Policy on Footer
    Then should see the Privacy Policy Page

  @LegalsArea @Navigation @TermsConditions
  Scenario: Quick Links Area Terms Conditions Navigation Control
    Given user on the Home Page
    When click Legals Area Terms Conditions on Footer
    Then should see the Terms Conditions Page

  @LegalsArea @Navigation @RefundPolicy
  Scenario: Quick Links Area Refund Policy Navigation Control
    Given user on the Home Page
    When click Legals Area Refund Policy on Footer
    Then should see the Refund Policy Page


  @LetsStayInTouchArea @TextAndComponent
  Scenario: Lets Stay In Touch Area Text and Component Control
    Given user on the Home Page
    Then should see Lets Stay In Touch Area Title: "Let’S Stay In Touch!" on Footer
    Then should see Lets Stay In Touch Area Email Box: "E-Mail Address" on Footer
    Then should see Lets Stay In Touch Area Email Box Icon on Footer
    Then should see Lets Stay In Touch Area Facebook Icon on Footer
    Then should see Lets Stay In Touch Area Twitter Icon on Footer
    Then should see Lets Stay In Touch Area Instagram Icon on Footer

  @LetsStayInTouchArea @Navigation @Facebook
  Scenario: Lets Stay In Touch Area Facebook Navigation Control
    Given user on the Home Page
    When click Lets Stay In Touch Area Facebook Icon on Footer
    Then should see the Traum Kaffee Facebook Page

  @LetsStayInTouchArea @Navigation @Instagram
  Scenario: Lets Stay In Touch Area Instagram Navigation Control
    Given user on the Home Page
    When click Lets Stay In Touch Area Instagram Icon on Footer
    Then should see the Traum Kaffee Instagram Page

  @LetsStayInTouchArea @Navigation @Twitter
  Scenario: Lets Stay In Touch Area Twitter Navigation Control
    Given user on the Home Page
    When click Lets Stay In Touch Area Twitter Icon on Footer
    Then should see the Traum Kaffee Twitter Page


  @LetsStayInTouchArea @EmptyMail
  Scenario: Lets Stay In Touch Area Empty Mail Control
    Given user on the Home Page
    When click Lets Stay In Touch Area Email Box Icon on Footer
    Then should see Popup Icon
    Then should see Popup Close Icon
    Then should see Popup Message: "Something went wrong"

  @LetsStayInTouchArea @FalseMail
  Scenario: Lets Stay In Touch Area False Mail Control
    Given user on the Home Page
    When sendkeys Lets Stay In Touch Area Email Box: "ee" on Footer
    When click Lets Stay In Touch Area Email Box Icon on Footer
    Then should see Popup Icon
    Then should see Popup Close Icon
    Then should see Popup Message: "Something went wrong"

  @LetsStayInTouchArea @Successfully
  Scenario: Lets Stay In Touch Area Successfully Control
    Given user on the Home Page
    When sendkeys Lets Stay In Touch Area Email Box: "mail@mail.com" on Footer
    When click Lets Stay In Touch Area Email Box Icon on Footer
    Then should see Popup Icon
    Then should see Popup Close Icon
    Then should see Popup Message: "Subscribed Successfully"