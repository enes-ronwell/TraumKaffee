@SignInPage
Feature: Sign In Page

  @TextAndComponent
  Scenario: Text and Component Control
    Given user on the Sign In Page
    Then should see Email: "Email" on Sign In Page
    Then should see Email Textbox: "E-Mail Address" on Sign In Page
    Then should see Password: "Password" on Sign In Page
    Then should see Password Textbox: "Password" on Sign In Page
    Then should see Password Hidden Button on Sign In Page
    Then should see Remember Me: "Remember me" on Sign In Page
    Then should see Remember Me Checkbox on Sign In Page
    Then should see I have forgotten my password: "I have forgotten my password" on Sign In Page
    Then should see SignIn Button: "SIGN IN" on Sign In Page
    Then should see Or Sign Up: "Or" on Sign In Page
    Then should see Create an account: "Create an Account" on Sign In Page
    Then should see Sign Up: "Sign Up" on Sign In Page

  @EmptyEmailMessage
  Scenario: Empty Email Control
    Given user on the Sign In Page
    When sendkeys Password: "Ronwell.2023" on Sign In Page
    When click Sign In button on Sign In Page
    Then should see Popup Message: "Please enter a valid email"
    Then should see Popup Close Icon
    Then should see Popup Icon

  @EmptyPasswordMessage
  Scenario: Empty Password Control
    Given user on the Sign In Page
    When sendkeys Email: "mail@mail.com" on Sign In Page
    When click Sign In button on Sign In Page
    Then should see Password Empty Message: "Password field cannot be empty!" on Sign In Page

  @EmailInvalidMessage
  Scenario: Uncorrect Email Control
    Given user on the Sign In Page
    When sendkeys Email: "mail" on Sign In Page
    When sendkeys Password: "Ronwell.2023" on Sign In Page
    Then should see Email Invalid Message: "Email is invalid" on Sign In Page
    When click Sign In button on Sign In Page
    Then should see Popup Message: "Please enter a valid email"
    Then should see Popup Close Icon
    Then should see Popup Icon

  @PasswordInvalidMessage
  Scenario: UnCorrect Password Control
    Given user on the Sign In Page
    When sendkeys Email: "mail@mail.com" on Sign In Page
    When sendkeys Password: "aaa" on Sign In Page
    Then should see Password Invalid Message: "Password must contain at least 8 characters, including uppercase, lowercase letters and numbers!" on Sign In Page

  @NonExistUser
  Scenario: NonExistUser SignIn Control
    Given user on the Sign In Page
    When sendkeys Email: "sallamamail@mail.com" on Sign In Page
    When sendkeys Password: "Ronwell.2023" on Sign In Page
    When click Sign In button on Sign In Page
    Then should see Popup Message: "Something went wrong"
    Then should see Popup Close Icon
    Then should see Popup Icon

  @FalsePassword
  Scenario: False Password SignIn Control
    Given user on the Sign In Page
    When sendkeys Email: "enes.erdogan@ronwell.net" on Sign In Page
    When sendkeys Password: "Ronwell.2023" on Sign In Page
    When click Sign In button on Sign In Page
    Then should see Popup Message: "Something went wrong"
    Then should see Popup Close Icon
    Then should see Popup Icon

  @Successfull
  Scenario: Successfull SignIn Control
    Given user on the Sign In Page
    When sendkeys Email: "otomasyonmail@ronwell.net" on Sign In Page
    When sendkeys Password: "Otomasyon.12" on Sign In Page
    When click Sign In button on Sign In Page
    Then should see the Home Page

  @Successfull @Navigate @HomePage
  Scenario: Successfull SignIn Home Page Navigate Control
    Given user on the Home Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page


  @Successfull @Navigate @About
  Scenario: Successfull SignIn About Page Navigate Control
    Given user on the About Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page

  @Successfull @Navigate @Sustainability
  Scenario: Successfull SignIn Sustainability Page Navigate Control
    Given user on the Sustainability Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page

  @Successfull @Navigate @Contact
  Scenario: Successfull SignIn Contact Page Navigate Control
    Given user on the Contact Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page

  @Successfull @Navigate @BrewGuides
  Scenario: Successfull SignIn Brew Guides Page Navigate Control
    Given user on the Brew Guides Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page

  @Successfull @Navigate @BrewDetails
  Scenario: Successfull SignIn Brew Details Page Navigate Control
    Given user on the Brew Details Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page

  @Successfull @Navigate @Blogs
  Scenario: Successfull SignIn Blogs Page Navigate Control
    Given user on the Blogs Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page

  @Successfull @Navigate @BlogDetail
  Scenario: Successfull SignIn Blog Detail Page Navigate Control
    Given user on the Blog Detail Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page

  @Successfull @Navigate @Whosale
  Scenario: Successfull SignIn Whosale Page Navigate Control
    Given user on the Whosale Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page

  @Successfull @Navigate @CoffeeForRestaurant
  Scenario: Successfull SignIn Coffee for Restaurant Page Navigate Control
    Given user on the Coffee for Restaurant Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page

  @Successfull @Navigate @CoffeeForHotels
  Scenario: Successfull SignIn Coffee for Hotels Page Navigate Control
    Given user on the Coffee for Hotels Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page

  @Successfull @Navigate @CafesAndCoffeeShops
  Scenario: Successfull SignIn Cafes and Coffee Shops Page Navigate Control
    Given user on the Cafes and Coffee Shops Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page

  @Successfull @Navigate @CoffeeAtWork
  Scenario: Successfull SignIn Coffee At Work Page Navigate Control
    Given user on the Coffee At Work Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page

  @Successfull @Navigate @Equipment
  Scenario: Successfull SignIn Equipment Page Navigate Control
    Given user on the Equipment Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page

  @Successfull @Navigate @Training
  Scenario: Successfull SignIn Training Page Navigate Control
    Given user on the Training Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page

  @Successfull @Navigate @BecomeOurPartner
  Scenario: Successfull SignIn Become Our Partner Page Navigate Control
    Given user on the Become Our Partner Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page

  @Successfull @Navigate @ShoppingCart
  Scenario: Successfull SignIn Shopping Cart Page Navigate Control
    Given user on the Store Selection Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page

  @Successfull @Navigate @FAQ
  Scenario: Successfull SignIn FAQ Page Navigate Control
    Given user on the FAQ Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page

  @Successfull @Navigate @PrivacyPolicy
  Scenario: Successfull SignIn Privacy Policy Page Navigate Control
    Given user on the Privacy Policy Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page

  @Successfull @Navigate @TermsConditions
  Scenario: Successfull SignIn Terms Conditions Page Navigate Control
    Given user on the Terms Conditions Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page

  @Successfull @Navigate @RefundPolicy
  Scenario: Successfull SignIn Refund Policy Page Navigate Control
    Given user on the Refund Policy Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page

  @Successfull @NavigateBack @HomePage
  Scenario: Successfull SignIn Home Page Navigate Control
    Given user on the Home Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page
    When taps navigate back
    Then should see the Home Page


  @Successfull @NavigateBack @About
  Scenario: Successfull SignIn About Page Navigate Control
    Given user on the About Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page
    When taps navigate back
    Then should see the Home Page

  @Successfull @NavigateBack @Sustainability
  Scenario: Successfull SignIn Sustainability Page Navigate Control
    Given user on the Sustainability Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page
    When taps navigate back
    Then should see the Home Page

  @Successfull @NavigateBack @Contact
  Scenario: Successfull SignIn Contact Page Navigate Control
    Given user on the Contact Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page
    When taps navigate back
    Then should see the Home Page

  @Successfull @NavigateBack @BrewGuides
  Scenario: Successfull SignIn Brew Guides Page Navigate Control
    Given user on the Brew Guides Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page
    When taps navigate back
    Then should see the Home Page

  @Successfull @NavigateBack @BrewDetails
  Scenario: Successfull SignIn Brew Details Page Navigate Control
    Given user on the Brew Details Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page
    When taps navigate back
    Then should see the Home Page

  @Successfull @NavigateBack @Blogs
  Scenario: Successfull SignIn Blogs Page Navigate Control
    Given user on the Blogs Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page
    When taps navigate back
    Then should see the Home Page

  @Successfull @NavigateBack @BlogDetail
  Scenario: Successfull SignIn Blog Detail Page Navigate Control
    Given user on the Blog Detail Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page
    When taps navigate back
    Then should see the Home Page

  @Successfull @NavigateBack @Whosale
  Scenario: Successfull SignIn Whosale Page Navigate Control
    Given user on the Whosale Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page
    When taps navigate back
    Then should see the Home Page

  @Successfull @NavigateBack @CoffeeForRestaurant
  Scenario: Successfull SignIn Coffee for Restaurant Page Navigate Control
    Given user on the Coffee for Restaurant Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page
    When taps navigate back
    Then should see the Home Page

  @Successfull @NavigateBack @CoffeeForHotels
  Scenario: Successfull SignIn Coffee for Hotels Page Navigate Control
    Given user on the Coffee for Hotels Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page
    When taps navigate back
    Then should see the Home Page

  @Successfull @NavigateBack @CafesAndCoffeeShops
  Scenario: Successfull SignIn Cafes and Coffee Shops Page Navigate Control
    Given user on the Cafes and Coffee Shops Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page
    When taps navigate back
    Then should see the Home Page

  @Successfull @NavigateBack @CoffeeAtWork
  Scenario: Successfull SignIn Coffee At Work Page Navigate Control
    Given user on the Coffee At Work Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page
    When taps navigate back
    Then should see the Home Page

  @Successfull @NavigateBack @Equipment
  Scenario: Successfull SignIn Equipment Page Navigate Control
    Given user on the Equipment Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page
    When taps navigate back
    Then should see the Home Page

  @Successfull @NavigateBack @Training
  Scenario: Successfull SignIn Training Page Navigate Control
    Given user on the Training Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page
    When taps navigate back
    Then should see the Home Page

  @Successfull @NavigateBack @BecomeOurPartner
  Scenario: Successfull SignIn Become Our Partner Page Navigate Control
    Given user on the Become Our Partner Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page
    When taps navigate back
    Then should see the Home Page



  @Successfull @NavigateBack @FAQ
  Scenario: Successfull SignIn FAQ Page Navigate Control
    Given user on the FAQ Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page
    When taps navigate back
    Then should see the Home Page

  @Successfull @NavigateBack @PrivacyPolicy
  Scenario: Successfull SignIn Privacy Policy Page Navigate Control
    Given user on the Privacy Policy Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page
    When taps navigate back
    Then should see the Home Page

  @Successfull @NavigateBack @TermsConditions
  Scenario: Successfull SignIn Terms Conditions Page Navigate Control
    Given user on the Terms Conditions Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page
    When taps navigate back
    Then should see the Home Page

  @Successfull @NavigateBack @RefundPolicy
  Scenario: Successfull SignIn Refund Policy Page Navigate Control
    Given user on the Refund Policy Page
    Given successfully Sign In with Mail:"otomasyonmail@ronwell.net" and Password:"Otomasyon.12" on Sign In Page
    Then should see the Home Page
    When taps navigate back
    Then should see the Home Page