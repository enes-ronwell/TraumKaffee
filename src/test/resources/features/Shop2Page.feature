@Shop2Page
Feature: Shop2Page

  Scenario: Shop2 Page text and component control
    Given user on the ShopTwo Page
    Then user should see Change Button on ShopTwo Page
    Then user should see Whole Bean Coffees Button Title : "Whole Bean Coffees" on ShopTwo Page
    Then user should see Capsules Coffees Button Title : "Capsules Coffees" on ShopTwo Page
    Then user should see Drip Coffees Button Title : "Drip Coffees" on ShopTwo Page
    Then user should see Whole Bean Coffees Title : "Whole Bean Coffees" on ShopTwo Page
    Then user should see Whole Bean Coffees Logo on ShopTwo Page
    Then user should see Capsules Coffees Title : "Capsules Coffees" on ShopTwo Page
    Then user should see Capsules Coffees Logo on ShopTwo Page
    Then user should see Drip Coffees Title : "Drip Coffees" on ShopTwo Page
    Then user should see Drip Coffees Logo on ShopTwo Page
    Then user should see Honduras Opalca Coffee Title "Honduras Opalca Coffee" on ShopTwo Page
    Then user should see Honduras Opalca Coffee price : "AED50" on ShopTwo Page
    Then user should see Honduras Opalca Coffee Image on ShopTwo Page
    Then user should see Chocolate Colombia Capsule Coffee Title : "Chocolate Colombia Capsule Coffee" on ShopTwo Page
    Then user should see Colombia Capsule Coffee Coffee price : "AED50" on ShopTwo Page
    Then user should see Colombia Capsule Coffee Image on ShopTwo Page
    Then user should see Traum Blend Capsule Coffee Title "Traum Blend Capsule Coffee" on ShopTwo Page
    Then user should see Traum Blend Capsule Coffee price : "AED40" on ShopTwo Page
    Then user should see Traum Blend Capsule Coffee Image on ShopTwo Page
    Then user should see Burundi Drip Coffee Title "Burundi Drip Coffee" on ShopTwo Page
    Then user should see Burundi Drip Coffee price : "AED80" on ShopTwo Page
    Then user should see Burundi Drip Coffee Image on ShopTwo Page
    Then user should see Basket : "BASKET" on ShopTwo Page
    Then user should see Complete Your Order Title : "COMPLETE YOUR ORDER" on ShopTwo Page

  Scenario: Whole Bean Coffees Button Control
    Given user on the ShopTwo Page
    When user click Whole Bean Coffees on ShopTwo Page
    Then user should see Whole Bean Coffees Area on Shop Two Page

  Scenario: Capsules Coffees Button Control
    Given user on the ShopTwo Page
    When user click Capsules Coffees Button on ShopTwo Page
    Then user should see Capsules Coffees Area on ShopTwo Page

  Scenario: Drip Coffees Button Control
    Given user on the ShopTwo Page
    When user click Drip Coffees Button on ShopTwo Page
    Then user should see Drip Coffees Area on ShopTwo Page

  Scenario: Basket Control
    Given user on the ShopTwo Page
    Then user should see Basket : "BASKET" on ShopTwo Page
    Then user should see No Items : "NO ITEMS" on ShopTwo Page
    Then user should see Complete Your Order : "COMPLETE YOUR ORDER" on ShopTwo Page
    Then user should see AED : "AED0" on ShopTwo Page


