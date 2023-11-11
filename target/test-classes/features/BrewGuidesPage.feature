@BrewGuidesPage
Feature: Brew Guides Page

  @TextAndComponent
  Scenario: Text and Component Control
    Given user on the Brew Guides Page
    Then should see Title: "Brew Guides" on Brew Guides Page
    Then should see Chemax Title: "Chemex" on Brew Guides Page
    Then should see Chemax Start Guide: "START GUIDE" on Brew Guides Page
    Then should see Chemax Image on Brew Guides Page
    Then should see French Press Title: "French Press" on Brew Guides Page
    Then should see French Press Start Guide: "START GUIDE" on Brew Guides Page
    Then should see French Press Image on Brew Guides Page
    Then should see Espresso Title: "Espresso" on Brew Guides Page
    Then should see Espresso Start Guide: "START GUIDE" on Brew Guides Page
    Then should see Espresso Image on Brew Guides Page
    Then should see Siphon Title: "Siphon" on Brew Guides Page
    Then should see Siphon Start Guide: "START GUIDE" on Brew Guides Page
    Then should see Siphon Image on Brew Guides Page
    Then should see Aeropress Title: "Aeropress" on Brew Guides Page
    Then should see Aeropress Start Guide: "START GUIDE" on Brew Guides Page
    Then should see Aeropress Image on Brew Guides Page
    Then should see Hario V60 Title: "Hario V60" on Brew Guides Page
    Then should see Hario V60 Start Guide: "START GUIDE" on Brew Guides Page
    Then should see Hario V60 Image on Brew Guides Page

  @Navigate @Chemax
  Scenario: Chemax Navigate Control
    Given user on the Brew Guides Page
    When click Chemax on Brew Guides Page
    Then should see Chemax the Brew Details Page

  @Navigate @French
  Scenario: French Navigate Control
    Given user on the Brew Guides Page
    When click French on Brew Guides Page
    Then should see French the Brew Details Page

  @Navigate @Espresso
  Scenario: Espresso Navigate Control
    Given user on the Brew Guides Page
    When click Espresso on Brew Guides Page
    Then should see Espresso the Brew Details Page

  @Navigate @Siphon
  Scenario: Siphon Navigate Control
    Given user on the Brew Guides Page
    When click Siphon on Brew Guides Page
    Then should see Siphon the Brew Details Page

  @Navigate @Aeropress
  Scenario: Aeropress Navigate Control
    Given user on the Brew Guides Page
    When click Aeropress on Brew Guides Page
    Then should see Aeropress the Brew Details Page

  @Navigate @HarioV60
  Scenario: Hario V60 Navigate Control
    Given user on the Brew Guides Page
    When click Hario V60 on Brew Guides Page
    Then should see Hario V60 the Brew Details Page