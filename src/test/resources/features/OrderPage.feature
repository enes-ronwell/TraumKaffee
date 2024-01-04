@OrderPage @New
  Feature: Order Page

    Scenario:
      Given user on the ShopTwo Page
      When user should click to Honduras Opalca Coffee ShopTwo Page
      When user should click Add more Button in HondurasOpalcaCoffee Detail on Shop Two Page
      When user should click Add to Basket Button on shopTwo Page
      When user should click Complete Your Order in Basket on ShopTwo Page
      When user should write e mail : "otomasyonmail@ronwell.net" in email section on Order Page
      When user should write name : "Ronwell otomasyon" in name section on Order Page
      When user should write : "Dubai" in adress section on Order Page
      When user should select Dubai : "دبي — Dubai" in adress section on Order Page
      When user should write phone number : "0501234567" in phone number section on Order Page
      When user should write card number : "4242424242424242" in card number section  on Order Page
      When user should write card validate date :"424" in card validate date section on Order Page
      When user should write card security code :"424" in card security code section on Order Page
      When user should click Ode Button on Order Page
      Then user should see Your Order Is Placed :"Your Order Is Placed!" in Order Page