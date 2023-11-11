@OrderHistoryPage
Feature: Order History Page

  @Empty @TextAndComponent
  Scenario: Empty Text and Component Control
    Given user on the Home Page
    Given successfully Sign In with Mail:"orderHistoryTestAutomation1@ronwell.net" and Password:"Ronwell.2023" on Sign In Page
    When click NavBar Area My Account on Navigation Bar
    When click My Account Area Order History on My Account Page
    Then should see Order History Area Title: "Order History" on Order History Page
    Then should see Order Placed Header: "Order Placed:" on Order History Page
    Then should see Order Placed: "9/20/2023" on Order History Page
    Then should see Total Header: "Total:" on Order History Page
    Then should see Total: "AED48" on Order History Page
    Then should see Ship To Header: "Ship To:" on Order History Page
    Then should see Ship To: "Edirne Dsasadsa ,Pekcan Sdasa, , Abu Dhabi" on Order History Page
    Then should see Order Image on Order History Page
    Then should see Order Name: "Traum Kickstart Capsule Coffee X 10" on Order History Page
    Then should see Order Type: "Capsule / 10" on Order History Page
    Then should see Order Count: "1" on Order History Page
    Then should see Order Price: "AED30" on Order History Page
    Then should see Reorder Button: "REORDER" on Order History Page
    Then should see NavBar Area Shopping Cart Count: "0" on Navigation Bar
    When click Reorder Button on Order History Page
    Then should see Popup Icon
    Then should see Popup Message: "Products have been added to your cart!"
    Then should see Popup Close Icon
    Then should see NavBar Area Shopping Cart Count: "1" on Navigation Bar
