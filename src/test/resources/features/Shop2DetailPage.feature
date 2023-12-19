@Shop2Detail
Feature: Shop2DetailPage

  Scenario:Shop2 Page1 First Item Control
    Given user on the ShopTwo Page
    When user click on the first item ShopTwo Page
    Then user should see section Honduras Opalca Coffee Title : "Honduras Opalca Coffee" on ShopTwo Page
    Then user should see gr : "250gr" on ShopTwo Page
    Then user should see Coffee Type title : "Coffee Type" on ShopTwo Page
    Then user should see Add to Basket : "ADD TO BASKET" on ShopTwo Page
    Then user should press Add Button in Detail page on ShopTwo Page
    Then user should click Add to Basket Button on shopTwo Page
    Then user should see Honduras Opalca Coffee Title in basket : "Honduras Opalca Coffee" on ShopTwo Page


  Scenario:
    Given user on the ShopTwo Page
    When user click on the second item on ShopTwo Page
    Then user should see section Chocolate Colombia Capsule Coffee Title : "Chocolate Colombia Capsule Coffee" on ShopTwo Page
    Then user should see gr : "12" on ShopTwo Page
    Then user should see Add to Basket : "ADD TO BASKET" on ShopTwo Page
    Then user should press Add Button in Detail page on ShopTwo Page
    Then user should click Add to Basket Button on shopTwo Page
    Then user should see Chocolate Colombia Capsule Coffee Title in basket : "Chocolate Colombia Capsule Coffee" on ShopTwo Page

  Scenario:
    Given user on the ShopTwo PageTwo
    When user click on the Chocolate Colombia Coffee on ShopTwo PageTwo
    Then user should see section Chocolate Colombia Coffee Title : "Chocolate Colombia Coffee" on ShopTwo PageTwo
    Then user should see gr : "250gr" on ShopTwo PageTwo
    Then user should see Coffee Type title : "Coffee Type" on ShopTwo PageTwo
    Then user should see Add to Basket : "ADD TO BASKET" on ShopTwo PageTwo
    Then user should press Add Button in Detail page on ShopTwo Page
    Then user should click Add to Basket Button on shopTwo PageTwo
    Then user should see Chocolate Colombia Coffee Title in basket : "Chocolate Colombia Coffee" on ShopTwo PageTwo
  @aaa
  Scenario:
    Given user on the ShopTwo PageTwo
    When user click on the Burundi Drip Coffee on ShopTwo PageTwo
    Then user should see section Burundi Drip Coffee Title : "Burundi Drip Coffee" on ShopTwo PageTwo
    Then user should see Add to Basket : "ADD TO BASKET" on ShopTwo PageTwo
    Then user should press Add Button in Detail page on ShopTwo Page
    Then user should click Add to Basket Button on shopTwo PageTwo
    Then user should see Burundi Drip Coffee Title in basket : "Burundi Drip Coffee" on ShopTwo PageTwo
