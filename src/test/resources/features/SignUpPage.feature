@SignUpPage
Feature: Sign Up Page

  @TextAndComponent
  Scenario: Text And Component Control
    Given user on the Sign Up Page
    Then should see Title: "Sign Up For An Account" on Sign Up Page
    Then should see First Name: "First Name" on Sign Up Page
    Then should see First Name Textbox: "First Name" on Sign Up Page
    Then should see Last Name: "Last Name" on Sign Up Page
    Then should see Last Name Textbox: "Last Name" on Sign Up Page
    Then should see Email Address: "Email Address" on Sign Up Page
    Then should see Email Address Textbox: "E-Mail Address" on Sign Up Page
    Then should see Password: "Password" on Sign Up Page
    Then should see Password Textbox: "Password" on Sign Up Page
    Then should see Password Hidden Button on Sign Up Page
    Then should see Confirm Password: "Confirm Password" on Sign Up Page
    Then should see Confirm Password Textbox: "Password" on Sign Up Page
    Then should see Confirm Password Hidden Button on Sign Up Page
    Then should see Sign Up Button: "SIGN UP" on Sign Up Page
    Then should see Have an account: "Already have an account?" on Sign Up Page
    Then should see Sign In: "Sign in" on Sign Up Page

  @EmptyFirstNameMessage
  Scenario: Empty First Name Control
    Given user on the Sign Up Page
    When sendkeys Last Name: "Test" on Sign Up Page
    When sendkeys Email: "test2@test.com" on Sign Up Page
    When sendkeys Password: "123123Test" on Sign Up Page
    When sendkeys Confirm Password: "123123Test" on Sign Up Page
    When click Sign Up Button on Sign Up Page
    Then should see Popup Message: "Please fill all the fields" on Sign Up Page
    Then should see Popup Icon on Sign Up Page

  @EmptyLastNameMessage
  Scenario: Empty Last Name Control
    Given user on the Sign Up Page
    When sendkeys First Name: "Test" on Sign Up Page
    When sendkeys Email: "test2@test.com" on Sign Up Page
    When sendkeys Password: "123123Test" on Sign Up Page
    When sendkeys Confirm Password: "123123Test" on Sign Up Page
    When click Sign Up Button on Sign Up Page
    Then should see Popup Message: "Please fill all the fields" on Sign Up Page
    Then should see Popup Icon on Sign Up Page

  @EmptyEmailMessage
  Scenario: Empty Email Message
    Given user on the Sign Up Page
    When sendkeys First Name: "Test" on Sign Up Page
    When sendkeys Last Name: "Test" on Sign Up Page
    When sendkeys Password: "123123Test" on Sign Up Page
    When sendkeys Confirm Password: "123123Test" on Sign Up Page
    When click Sign Up Button on Sign Up Page
    Then should see Empty Email Message: "You have entered an invalid email address!" on Sign Up Page

  @EmptyPasswordMessage
  Scenario: Empty Password Control
    Given user on the Sign Up Page
    When sendkeys First Name: "Test" on Sign Up Page
    When sendkeys Last Name: "Test" on Sign Up Page
    When sendkeys Email: "test2@test.com" on Sign Up Page
    When click Sign Up Button on Sign Up Page
    Then should see Empty Password Message: "Password must contain at least 8 characters, including uppercase, lowercase letters and numbers!" on Sign Up Page

  @EmptyConfirmPasswordMessage
  Scenario: Empty Confirm Password Control
    Given user on the Sign Up Page
    When sendkeys First Name: "Test" on Sign Up Page
    When sendkeys Last Name: "Test" on Sign Up Page
    When sendkeys Email: "test2@test.com" on Sign Up Page
    When sendkeys Password: "123123Test" on Sign Up Page
    When click Sign Up Button on Sign Up Page
    Then should see Empty Confirm Password Message: "Passwords do not match" on Sign Up Page

  @EmailInvalidMessage
  Scenario: Invalid Email Control
    Given user on the Sign Up Page
    When sendkeys First Name: "Test" on Sign Up Page
    When sendkeys Last Name: "Test" on Sign Up Page
    When sendkeys Email: "test2" on Sign Up Page
    When sendkeys Password: "123123Test" on Sign Up Page
    When sendkeys Confirm Password: "123123Test" on Sign Up Page
    When click Sign Up Button on Sign Up Page
    Then should see Invalid Email Message: "You have entered an invalid email address!" on Sign Up Page

  @PasswordInvalidMessage
  Scenario: Invalid Password Control
    Given user on the Sign Up Page
    When sendkeys First Name: "Test" on Sign Up Page
    When sendkeys Last Name: "Test" on Sign Up Page
    When sendkeys Email: "test2@test.com" on Sign Up Page
    When sendkeys Password: "1et" on Sign Up Page
    When click Sign Up Button on Sign Up Page
    Then should see Invalid Password Message: "Password must contain at least 8 characters, including uppercase, lowercase letters and numbers!" on Sign Up Page

  @PasswordsDoNotMatchMessage
  Scenario: Passwords Don't Match
    Given user on the Sign Up Page
    When sendkeys First Name: "Test" on Sign Up Page
    When sendkeys Last Name: "Test" on Sign Up Page
    When sendkeys Email: "test2@test.com" on Sign Up Page
    When sendkeys Password: "123123Test" on Sign Up Page
    When sendkeys Confirm Password: "123123Tes" on Sign Up Page
    When click Sign Up Button on Sign Up Page
    Then should see Passwords Do Not Match Message: "Passwords do not match" on Sign Up Page

  @UserAlreadyExistsMessage
  Scenario: User Already Exists
    Given user on the Sign Up Page
    When sendkeys First Name: "Test" on Sign Up Page
    When sendkeys Last Name: "Test" on Sign Up Page
    When sendkeys Email: "test1@test.com" on Sign Up Page
    When sendkeys Password: "123123Test" on Sign Up Page
    When sendkeys Confirm Password: "123123Test" on Sign Up Page
    When click Sign Up Button on Sign Up Page
    Then should see Popup Message: "User already exists"

  @SuccessfullSignUp
  Scenario: Successfull Sign Up Control
    Given user on the Sign Up Page
    When sendkeys First Name: "Test" on Sign Up Page
    When sendkeys Last Name: "Test" on Sign Up Page
    When sendkeys Email: Random Mail on Sign Up Page
    When sendkeys Password: "123123Test" on Sign Up Page
    When sendkeys Confirm Password: "123123Test" on Sign Up Page
    When click Sign Up Button on Sign Up Page
    Then should see the Sign In Page