@StoreSelectionPage
  Feature: Store Selection Page

    @TextAndComponent
    Scenario: Store Selection Page Text and Component Control
      Given user on the Store Selection Page
      Then should see Title: "SELECT A STORE TO START YOUR ORDER" on Store Selection Page
      Then should see First Stores Order Now Button: "ORDER NOW" on Store Selection Page
      Then should see Second Stores Order Now Button: "ORDER NOW" on Store Selection Page
      Then should see Map on Store Selection Page
      Then should see Place Icon on Store Selection Page
      Then should see the Zoom In Button on Store Selection Page
      Then should see the Zoom Out Button on Store Selection Page
      Then should see the First Stores Address: "Kiosk is inside China Court opposite to Mediclinics, Ibn Battuta Mall - Dubai - Birleşik Arap Emirlikleri" on Store Selection Page
      Then should see the Second Stores Address: "Dubai Science Park, Al Barsha South 2 - Dubai - Birleşik Arap Emirlikleri" on Store Selection Page

    Scenario: User should see First Store's Address when clicked the First Store's Order Now Button
      Given user on the Store Selection Page
      When click the First Stores Order Now Button on Store Selection Page
      Then should see the First Stores Address: "Kiosk is inside China Court opposite to Mediclinics, Ibn Battuta Mall - Dubai - Birleşik Arap Emirlikleri" on the Shop Page

    Scenario: User should see Second Store's Address when clicked the First Store's Order Now Button
      Given user on the Store Selection Page
      When click the Second Stores Order Now Button on Store Selection Page
      Then should see the Second Stores Address: "Dubai Science Park, Al Barsha South 2 - Dubai - Birleşik Arap Emirlikleri" on the Shop Page
