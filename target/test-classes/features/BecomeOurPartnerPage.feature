@BecomeOurPartnerPage
Feature: Become Our Partner Page

  @BecomeOurPartnerArea @TextAndComponent
  Scenario: Become Our Partner Area Text and Component Control
    Given user on the Become Our Partner Page
    Then should see Become Our Partner Area Title: "Become Our Partner" on Become Our Partner Page
    Then should see Become Our Partner Area Description: "Traum is ready to work with you to fulfill your business’ coffee, training, equipment and service needs. " on Become Our Partner Page
    Then should see Become Our Partner Area Image on Become Our Partner Page
    Then should see Lets Grab a Coffee Area Title: "Let's Grab a Coffee!" on Become Our Partner Page
    Then should see Lets Grab a Coffee Area Description: "For more information on how to partner with us and to learn more about our wholesale coffee program,contact us now!" on Become Our Partner Page
    Then should see Lets Grab a Coffee Area Full Name: "Full Name" on Become Our Partner Page
    Then should see Lets Grab a Coffee Area Email: "Email" on Become Our Partner Page
    Then should see Lets Grab a Coffee Area Contact Number: "Contact Number" on Become Our Partner Page
    Then should see Lets Grab a Coffee Area Business Name: "Business Name" on Become Our Partner Page
    Then should see Lets Grab a Coffee Area Type of Business: "Type of Business" on Become Our Partner Page
    When click Lets Grab a Coffee Area Type of Busines on Become Our Partner Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Hotel" on Become Our Partner Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Restaurant" on Become Our Partner Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Cafe" on Become Our Partner Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Office" on Become Our Partner Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Events" on Become Our Partner Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Other" on Become Our Partner Page
    Then should see Lets Grab a Coffee Area Tell us: "Tell us a bit about your business... the more info the better!" on Become Our Partner Page
    Then should see Lets Grab a Coffee Area Send Button: "SEND" on Become Our Partner Page

  @LetsGrabaCoffeeArea @Successfully
  Scenario Outline: Lets Grab a Coffee Area Successfully Send Control
    Given user on the Become Our Partner Page
    When sendkeys Lets Grab a Coffee Area Full Name: "<fullName>" on Become Our Partner Page
    When sendkeys Lets Grab a Coffee Area Mail: "<mail>" on Become Our Partner Page
    When sendkeys Lets Grab a Coffee Area Contact Number: "<contactNumber>" on Become Our Partner Page
    When sendkeys Lets Grab a Coffee Area Business Name: "<businessName>" on Become Our Partner Page
    When select Lets Grab a Coffee Area Type of Business: "<type>" on Become Our Partner Page
    When sendkeys Lets Grab a Coffee Area Tell us: "<tellUs>" on Become Our Partner Page
    When click Lets Grab a Coffee Area Send Button on Become Our Partner Page
    Then should see Popup Message: "Your message has been sent successfully."
    Then should see Popup Icon
    Then should see Popup Close Icon
    Examples:
      | fullName | mail          | contactNumber | businessName | type  | tellUs  |
      | Enes     | mail@mail.com | +905439459532 | ronwell      | Hotel | tell us |

  @LetsGrabaCoffeeArea @Empty
  Scenario: Lets Grab a Coffee Area Empty Fields Send Control
    Given user on the Become Our Partner Page
    When click Lets Grab a Coffee Area Send Button on Become Our Partner Page
    Then should see Lets Grab a Coffee Area Full Name Error: "This is required." on Become Our Partner Page
    Then should see Lets Grab a Coffee Area Email Error: "Email is invalid." on Become Our Partner Page
    Then should see Lets Grab a Coffee Area Contact Number Error: "Invalid Phone" on Become Our Partner Page
    Then should see Lets Grab a Coffee Area Business Name Error: "This is required." on Become Our Partner Page
    Then should see Lets Grab a Coffee Area Type of Business Error: "This is required." on Become Our Partner Page
    Then should see Lets Grab a Coffee Area Tell us Error: "This is required." on Become Our Partner Page
