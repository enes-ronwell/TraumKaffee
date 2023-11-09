@ShoppingCartPage
Feature: Shopping Cart Page

  @TextAndComponent
  Scenario: Text and Component Control
    Given user on the Shopping Cart Page
    Then should see Featured Items Area Title: "FEATURED ITEM’S TO GET YOU STARTED" on Shopping Cart Page
    Then should see Featured Items Area First Product Image on Shopping Cart Page
    Then should see Featured Items Area First Product Name: "Traum Kickstart Capsule Coffee X 10" on Shopping Cart Page
    When click Featured Items Area First Product Image on Shopping Cart Page
    Then should see Featured Items Area First Product Price: "AED30" on Shopping Cart Page
    Then should see Featured Items Area First Product Add Button on Shopping Cart Page
    Then should see Featured Items Area Second Product Image on Shopping Cart Page
    Then should see Featured Items Area Second Product Name: "Kenya Capsule Coffee X10" on Shopping Cart Page
    When click Featured Items Area Second Product Image on Shopping Cart Page
    Then should see Featured Items Area Second Product Price: "AED35" on Shopping Cart Page
    Then should see Featured Items Area Second Product Add Button on Shopping Cart Page
    Then should see Featured Items Area Third Product Image on Shopping Cart Page
    Then should see Featured Items Area Third Product Name: "Chocolate Colombia Coffee" on Shopping Cart Page
    When click Featured Items Area Third Product Image on Shopping Cart Page
    Then should see Featured Items Area Third Product Price: "AED45" on Shopping Cart Page
    Then should see Featured Items Area Third Product Add Button on Shopping Cart Page
    Then should see Featured Items Area Fourth Product Image on Shopping Cart Page
    Then should see Featured Items Area Fourth Product Name: "Almond Colombia Coffee" on Shopping Cart Page
    When click Featured Items Area Fourth Product Image on Shopping Cart Page
    Then should see Featured Items Area Fourth Product Price: "AED45" on Shopping Cart Page
    Then should see Featured Items Area Fourth Product Add Button on Shopping Cart Page
    Then should see Total Area Sub Total Header: "Sub Total" on Shopping Cart Page
    Then should see Total Area Sub Total: "AED0" on Shopping Cart Page
    Then should see Total Area Discount Header: "Discount" on Shopping Cart Page
    Then should see Total Area Discount: "-AED0" on Shopping Cart Page
    Then should see Total Area Delivery Header: "Delivery" on Shopping Cart Page
    Then should see Total Area Delivery: "TO BE DETERMINED" on Shopping Cart Page
    Then should see Total Area Tax Header: "Tax" on Shopping Cart Page
    Then should see Total Area Tax: "TO BE DETERMINED" on Shopping Cart Page
    Then should see Total Area Estimated Total Header: "Estimated Total" on Shopping Cart Page
    Then should see Total Area Estimated Total: "$AED0" on Shopping Cart Page
    Then should see Total Area Continue Shopping: "Continue Shopping" on Shopping Cart Page
    Then should see Total Area Go To Payment: "Go To Payment" on Shopping Cart Page
    Then should see Shopping Cart Area Title: "Shopping Cart" on Shopping Cart Page
    Then should see Shopping Cart Area Image on Shopping Cart Page
    Then should see Shopping Cart Area Description: "Looks Like You Haven’T Decided What To Taste Yet! Visit Our Guides Or Go Shopping !" on Shopping Cart Page

  @EmptyShoppingCart
  Scenario: Empty Shopping Cart
    Given user on the Shopping Cart Page
    When click Shopping Cart Area Our Guides Text On Shopping Cart Page
    Then should see the Brew Guides Page

  @EmptyShoppingCart
  Scenario: Empty Shopping Cart
    Given user on the Shopping Cart Page
    When click Shopping Cart Area Shopping Text On Shopping Cart Page
    Then should see the Products Page

  @EmptyShoppingCart
  Scenario: Empty Shopping Cart
    Given user on the Shopping Cart Page
    When click Total Area Continue Shopping on Shopping Cart Page
    Then should see the Products Page

  @FeaturedItems
  Scenario: Featured Items Area First Product Detail
    Given user on the Shopping Cart Page
    When click Featured Items Area First Product Image on Shopping Cart Page
    Then should see Featured Items Area First Product Price: "AED30" on Shopping Cart Page
    Then should see Featured Items Area First Product Add Button on Shopping Cart Page
    When click Featured Items Area First Product Add Button on Shopping Cart Page

  @FeaturedItems
  Scenario: Featured Items Area Second Product Detail
    Given user on the Shopping Cart Page
    When click Featured Items Area Second Product Image on Shopping Cart Page
    Then should see Featured Items Area Second Product Price: "AED35" on Shopping Cart Page
    Then should see Featured Items Area Second Product Add Button on Shopping Cart Page
    When click Featured Items Area Second Product Add Button on Shopping Cart Page

  @FeaturedItems
  Scenario: Featured Items Area Third Product Detail
    Given user on the Shopping Cart Page
    When click Featured Items Area Third Product Image on Shopping Cart Page
    Then should see Featured Items Area Third Product Price: "AED45" on Shopping Cart Page
    Then should see Featured Items Area Third Product Add Button on Shopping Cart Page
    When click Featured Items Area Third Product Add Button on Shopping Cart Page

  @FeaturedItems
  Scenario: Featured Items Area Fourth Product Detail
    Given user on the Shopping Cart Page
    When click Featured Items Area Fourth Product Image on Shopping Cart Page
    Then should see Featured Items Area Fourth Product Price: "AED45" on Shopping Cart Page
    Then should see Featured Items Area Fourth Product Add Button on Shopping Cart Page
    When click Featured Items Area Fourth Product Add Button on Shopping Cart Page

  @AddProductToCart
  Scenario: Add Product To Cart
    Given user on the Shopping Cart Page
    When click Featured Items Area First Product Image on Shopping Cart Page
    When click Featured Items Area First Product Add Button on Shopping Cart Page
    Then should see First Product Name: "Traum Kickstart Capsule Coffee x 10" on Shopping Cart Page
    When click First Product Quantity Up Icon on Shopping Cart Page
    Then should see First Product Quantity: "2" on Shopping Cart Page
    Then should see Total Area Estimated Total: "AED60" on Shopping Cart Page

  @AddProductToCart
  Scenario: Add Two Products To Cart
    Given user on the Shopping Cart Page
    When click Featured Items Area First Product Image on Shopping Cart Page
    When click Featured Items Area First Product Add Button on Shopping Cart Page
    Then should see First Product Name: "Traum Kickstart Capsule Coffee x 10" on Shopping Cart Page
    When click Featured Items Area Second Product Image on Shopping Cart Page
    When click Featured Items Area Second Product Add Button on Shopping Cart Page
    Then should see Second Product Name: "Kenya Capsule Coffee x10" on Shopping Cart Page
    Then should see Total Area Estimated Total: "AED65" on Shopping Cart Page

  @DeleteProductFromCart
  Scenario: Delete Product From Cart
    Given user on the Shopping Cart Page
    When click Featured Items Area First Product Image on Shopping Cart Page
    When click Featured Items Area First Product Add Button on Shopping Cart Page
    Then should see First Product Name: "Traum Kickstart Capsule Coffee x 10" on Shopping Cart Page
    When click First Product Quantity Down Button On Shopping Cart Page
    Then should see Shopping Cart Area Image on Shopping Cart Page

  @DecreaseProduct
  Scenario: Decrease Product
    Given user on the Shopping Cart Page
    When click Featured Items Area First Product Image on Shopping Cart Page
    When click Featured Items Area First Product Add Button on Shopping Cart Page
    Then should see First Product Name: "Traum Kickstart Capsule Coffee x 10" on Shopping Cart Page
    When click First Product Quantity Up Icon on Shopping Cart Page
    Then should see First Product Quantity: "2" on Shopping Cart Page
    Then should see Total Area Estimated Total: "AED60" on Shopping Cart Page
    When click First Product Quantity Down Button On Shopping Cart Page
    Then should see First Product Quantity: "1" on Shopping Cart Page
    Then should see Total Area Estimated Total: "AED30" on Shopping Cart Page

  @GoToPaymentPage
  Scenario: Go To Payment Page
    Given user on the Shopping Cart Page
    When click Featured Items Area First Product Image on Shopping Cart Page
    When click Featured Items Area First Product Add Button on Shopping Cart Page
    Then should see First Product Name: "Traum Kickstart Capsule Coffee x 10" on Shopping Cart Page
    Then should see Total Area Estimated Total: "AED30" on Shopping Cart Page
    When click Go To Payment Button on Shopping Cart Page






