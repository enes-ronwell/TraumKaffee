@NavigationBar
Feature: Navigation Bar

  @NavBarArea @TextAndComponent
  Scenario: NavBar Area Text and Component Control
    Given user on the Home Page
    Then should see NavBar Area Traum Image on Navigation Bar
    Then should see NavBar Area Shop: "Shop" on Navigation Bar
    Then should see NavBar Area About: "About" on Navigation Bar
    Then should see NavBar Area Learn: "Learn" on Navigation Bar
    Then should see NavBar Area Whosale: "Wholesale" on Navigation Bar
    Then should see NavBar Area Become Our Partner: "Become Our Partner" on Navigation Bar
    Then should see NavBar Area Sign In Button: "Sign In" on Navigation Bar
    Then should see NavBar Area Shopping Cart Icon on Navigation Bar
    Then should see NavBar Area Shopping Cart Count: "0" on Navigation Bar
    Then should see NavBar Area Sign In Button: "Sign In" on Navigation Bar
    When hover NavBar Area About on Navigation Bar
    Then should see NavBar Area About Option: "About" on Navigation Bar
    Then should see NavBar Area About Option: "Sustainability" on Navigation Bar
    Then should see NavBar Area About Option: "Contact" on Navigation Bar
    When hover NavBar Area Learn on Navigation Bar
    Then should see NavBar Area Learn Option: "Brew Guides" on Navigation Bar
    Then should see NavBar Area Learn Option: "Blog" on Navigation Bar
    When hover NavBar Area Whosale on Navigation Bar
    Then should see NavBar Area Whosale Option: "Wholesale" on Navigation Bar
    Then should see NavBar Area Whosale Option: "Coffee For Restaurant" on Navigation Bar
    Then should see NavBar Area Whosale Option: "Coffee For Hotels" on Navigation Bar
    Then should see NavBar Area Whosale Option: "Cafes And Coffee Shops" on Navigation Bar
    Then should see NavBar Area Whosale Option: "Coffee At Work" on Navigation Bar
    Then should see NavBar Area Whosale Option: "Equipments" on Navigation Bar
    Then should see NavBar Area Whosale Option: "Training" on Navigation Bar

  @NavBarArea @Navigation @Shop
  Scenario: NavBar Area Shop Navigation Control
    Given user on the Home Page
    When click NavBar Area Shop on Navigation Bar
    Then should see the Store Selection Page

  @NavBarArea @Navigation @About
  Scenario: NavBar Area About Navigation Control
    Given user on the Home Page
    When hover NavBar Area About on Navigation Bar
    When click NavBar Area About on Navigation Bar
    Then should see the Home Page

  @NavBarArea @Navigation @AboutOption
  Scenario: NavBar Area About Option Navigation Control
    Given user on the Home Page
    When hover NavBar Area About on Navigation Bar
    When click NavBar Area Option About on Navigation Bar
    Then should see the About Page

  @NavBarArea @Navigation @Sustainability
  Scenario: NavBar Area Sustainability Navigation Control
    Given user on the Home Page
    When hover NavBar Area About on Navigation Bar
    When click NavBar Area Sustainability on Navigation Bar
    Then should see the Sustainability Page

  @NavBarArea @Navigation @Contact
  Scenario: NavBar Area Contact Navigation Control
    Given user on the Home Page
    When hover NavBar Area About on Navigation Bar
    When click NavBar Area Contact on Navigation Bar
    Then should see the Contact Page

  @NavBarArea @Navigation @Learn
  Scenario: NavBar Area Learn Navigation Control
    Given user on the Home Page
    When hover NavBar Area Learn on Navigation Bar
    When click NavBar Area Learn on Navigation Bar
    Then should see the Home Page

  @NavBarArea @Navigation @BrewGuides
  Scenario: NavBar Area Brew Guides Navigation Control
    Given user on the Home Page
    When hover NavBar Area Learn on Navigation Bar
    When click NavBar Area Brew Guides on Navigation Bar
    Then should see the Brew Guides Page

  @NavBarArea @Navigation @Blog
  Scenario: NavBar Area Blog Navigation Control
    Given user on the Home Page
    When hover NavBar Area Learn on Navigation Bar
    When click NavBar Area Blog on Navigation Bar
    Then should see the Blogs Page

  @NavBarArea @Navigation @Whosale
  Scenario: NavBar Area Whosale Navigation Control
    Given user on the Home Page
    When hover NavBar Area Whosale on Navigation Bar
    When click NavBar Area Whosale on Navigation Bar
    Then should see the Home Page

  @NavBarArea @Navigation @WhosaleOption
  Scenario: NavBar Area Whosale Option Navigation Control
    Given user on the Home Page
    When hover NavBar Area Whosale on Navigation Bar
    When click NavBar Area Whosale Option on Navigation Bar
    Then should see the Whosale Page

  @NavBarArea @Navigation @CoffeeForRestaurant
  Scenario: NavBar Area Coffee For Restaurant Navigation Control
    Given user on the Home Page
    When hover NavBar Area Whosale on Navigation Bar
    When click NavBar Area Coffee for Restaurant on Navigation Bar
    Then should see the Coffee for Restaurant Page

  @NavBarArea @Navigation @CoffeeForHotels
  Scenario: NavBar Area Coffee For Hotels Navigation Control
    Given user on the Home Page
    When hover NavBar Area Whosale on Navigation Bar
    When click NavBar Area Coffee For Hotels on Navigation Bar
    Then should see the Coffee for Hotels Page

  @NavBarArea @Navigation @CafesAndCoffeeShops
  Scenario: NavBar Area Cafes And Coffee Shops Navigation Control
    Given user on the Home Page
    When hover NavBar Area Whosale on Navigation Bar
    When click NavBar Area Cafes And Coffee Shops on Navigation Bar
    Then should see the Cafes and Coffee Shops Page

  @NavBarArea @Navigation @CoffeeAtWork
  Scenario: NavBar Area Coffee At Work Navigation Control
    Given user on the Home Page
    When hover NavBar Area Whosale on Navigation Bar
    When click NavBar Area Coffee At Work on Navigation Bar
    Then should see the Coffee At Work Page

  @NavBarArea @Navigation @Equipments
  Scenario: NavBar Area Equipments Navigation Control
    Given user on the Home Page
    When hover NavBar Area Whosale on Navigation Bar
    When click NavBar Area Equipments on Navigation Bar
    Then should see the Equipment Page

  @NavBarArea @Navigation @Training
  Scenario: NavBar Area Training Navigation Control
    Given user on the Home Page
    When hover NavBar Area Whosale on Navigation Bar
    When click NavBar Area Training on Navigation Bar
    Then should see the Training Page

  @NavBarArea @Navigation @BecomeOurPartner
  Scenario: NavBar Area Become Our Partner Navigation Control
    Given user on the Home Page
    When hover NavBar Area Whosale on Navigation Bar
    When click NavBar Area Become Our Partner on Navigation Bar
    Then should see the Become Our Partner Page

  @NavBarArea @CoffeeAcademy @Navigation
  Scenario: NavBar Area Coffee Academy Navigation Control
    Given user on the Home Page
    When click Navbar Area Coffee Academy on Navigation Bar
    Then should see the Coffee Academy Page

  @NavBarArea @Navigation @SignIn
  Scenario: NavBar Area Sign In Navigation Control
    Given user on the Home Page
    When click NavBar Area Sign In on Navigation Bar
    Then should see the Sign In Page

  @NavBarArea @Navigation @MyAccount
  Scenario: NavBar Area My Account  Navigation Control
    Given user on the Home Page
    Given successfully Sign In with Mail:"navigationBarTestAutomation@ronwell.net" and Password:"Ronwell.2023" on Sign In Page
    When click NavBar Area My Account on Navigation Bar
    Then should see the My Account Page



