@ProductDetailPage
Feature: Product Detail Page

  @TextAndComponent
  Scenario: Text and Component Control
    Given user on the Product Detail Page
    Then should see Product Path: "Home > Products > Traum Kickstart Capsule Coffee X 10" on Product Detail Page
    Then should see Product Name: "Traum Kickstart Capsule Coffee X 10" on Product Detail Page
    Then should see Product Description: "With The Convenience Of 10-Pack Capsules, Wake Up To The Magic Of Traum Kickstart Capsule Coffee- The Blend Notes Of Dark Chocolate, Plum, Round Body, And Molasses." on Product Detail Page
    Then should see Product Image on Product Detail Page
    Then should see Product Image Option on Product Detail Page
    Then should see Product Coffee Type: "Coffee Type" on Product Detail Page
    Then should see Product Coffee Type Option: "Capsule" on Product Detail Page
    Then should see Product Piece: "Piece" on Product Detail Page
    Then should see Product Piece Option: "10" on Product Detail Page
    Then should see Product Quantity Header: "Quantity" on Product Detail Page
    Then should see Product Quantity: "0" on Product Detail Page
    Then should see Product Quantity Down Icon on Product Detail Page
    Then should see Product Quantity Up Icon on Product Detail Page
    Then should see Product Price: "AED30" on Product Detail Page
    Then should see Product Add To Cart Button: "ADD TO CART" on Product Detail Page
    Then should see Product Continue Shopping Button: "Continue Shopping" on Product Detail Page
    Then should see Product Free Shipping: "Free Shipping" on Product Detail Page
    Then should see Product Cancel Anytime: "Cancel Anytime" on Product Detail Page

  @Navigation
  Scenario: Continue Shopping Navigate Control
    Given user on the Product Detail Page
    When click Continue Shopping Button on Product Detail Page
    Then should see the Products Page

  @AddQuantityMessage
  Scenario: Add Quantity Message Control
    Given user on the Product Detail Page
    When click Add To Cart Button on Product Detail Page
    Then should see Please Select Quantity Message: "Please select quantity!" on Product Detail Page

  @SuccessfullyAdd
  Scenario: Successfully Add Control
    Given user on the Product Detail Page
    When click Quantity Up Icon on Product Detail Page
    When click Add To Cart Button on Product Detail Page
    Then should see Popup Close Icon
    Then should see Popup Message: "Added to cart!"
    Then should see Popup Icon
    Then should see NavBar Area Shopping Cart Count: "1" on Navigation Bar