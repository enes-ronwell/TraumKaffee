@ProductsPage
Feature: Products Page

  @CategoriesArea @TextAndComponent
    Scenario: Text And Component Control
    Given user on the Products Page
    Then should see Categories Area Title: "Categories" on Products Page
    Then should see Categories Area Shop All: "Shop All" on Products Page
    Then should see Categories Area Shop All Checkbox on Products Page
    Then should see Categories Area Ground Coffees: "Ground Coffees" on Products Page
    Then should see Categories Area Ground Coffees Checkbox on Products Page
    Then should see Categories Area Capsules Coffees: "Capsules Coffees" on Products Page
    Then should see Categories Area Capsules Coffees Checkbox on Products Page
    Then should see Categories Area Drip Coffees: "Drip Coffees" on Products Page
    Then should see Categories Area Drip Coffees Checkbox on Products Page
    Then should see Search Area Textbox: "Search Store" on Products Page
    Then should see Search Area Image on Products Page
    Then should see Search Area Searching Results For Header: "\"No search results\"" on Products Page
    Then should see Search Area Searching Results For: "Searching Results For" on Products Page
    Then should see Product Area Product Image on Products Page
    Then should see Product Area Product Tag: "Capsule" on Products Page
    Then should see Product Area Product Name: "Traum Kickstart Capsule Coffee X 10" on Products Page
    Then should see Product Area Product Description: "Nespresso Compatible Capsules" on Products Page
    Then should see Product Area Product Price: "AED30" on Products Page
    Then should see Product Area Show More Button: "Show More" on Products Page
    Then should see Product Area Brew Guides Text: "To Create Beautiful Mornings" on Products Page
    Then should see Product Area Brew Guides Image on Products Page
    Then should see Product Area Brew Guides Title: "Learn How To Brew Your Dream Coffee!" on Products Page
    Then should see Product Area Brew Guides Visit: "Visit Brew Guides" on Products Page
    Then should see Product Area Blog Text: "Coffee Is Good When Drunk Together" on Products Page
    Then should see Product Area Blog Image on Products Page
    Then should see Product Area Blog Title: "Discover How To Brew A Dream" on Products Page
    Then should see Product Area Blog Visit: "Visit Blog" on Products Page

  @ProductsArea @Navigation @ProductDetail
  Scenario: Products Area Product Detail Navigaiton Control
    Given user on the Products Page
    When click Product Area Product Image on Products Page
    Then should see the Product Detail Page


  @ProductsArea @Navigation @BrewGuides
  Scenario: Products Area Brew Guides Navigaiton Control
    Given user on the Products Page
    When click Product Area Brew Guides Image on Products Page
    Then should see the Brew Guides Page

  @ProductsArea @Navigation @Blog
  Scenario: Products Area Blog Navigation Control
    Given user on the Products Page
    When click Product Area Blog Image on Products Page
    Then should see the Blogs Page

  @ChooseCategory
  Scenario: Choose Category
    Given user on the Products Page
    When click Ground Coffees Checkbox on Products Page
    Then should see First Product Name: "" on Products Page

  @ChooseCategory
  Scenario: Choose Category
    Given user on the Products Page
    When click Drip Coffees Checkbox on Products Page
    Then should see First Product Name: "" on Products Page




