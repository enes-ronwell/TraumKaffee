@BrewDetailsPage
Feature: Brew Details Page

  @BrewDetailsArea @TextAndComponent
  Scenario: Brew Details Area Text and Component Control
    Given user on the Brew Details Page
    Then should see Brew Details Area Title: "Chemex" on Brew Details Page
    Then should see Brew Details Area Description: "A sophisticated way brewing coffee" on Brew Details Page
    Then should see Brew Details Area Image on Brew Details Page
    Then should see Makings Area Minute Image on Brew Details Page
    Then should see Makings Area Minute: "3-4 Min" on Brew Details Page
    Then should see Makings Area Sea Salt Image on Brew Details Page
    Then should see Makings Area Sea Salt: "Sea Salt" on Brew Details Page
    Then should see Makings Area Coffee Image on Brew Details Page
    Then should see Makings Area Coffee: "50 Gr" on Brew Details Page
    Then should see Makings Area Tempreture Image on Brew Details Page
    Then should see Makings Area Tempreture: "700Gr 205°- 210°" on Brew Details Page
    Then should see What You Will Need Area Title: "WHAT YOU WILL NEED" on Brew Details Page
    Then should see What You Will Need Area Option: "Chemex Carafe" on Brew Details Page
    Then should see What You Will Need Area Option: "Chemex Filters" on Brew Details Page
    Then should see What You Will Need Area Option: "Kettle" on Brew Details Page
    Then should see What You Will Need Area Option: "Grinder" on Brew Details Page
    Then should see What You Will Need Area Option: "Digital Scale" on Brew Details Page
    Then should see What You Will Need Area Option: "Timer" on Brew Details Page
    Then should see Share Area Title: "SHARE" on Brew Details Page
    Then should see Share Area Facebook Icon on Brew Details Page
    Then should see Share Area Twitter Icon on Brew Details Page
    Then should see Share Area Instagram Icon on Brew Details Page
    Then should see Share Area Tiktok Icon on Brew Details Page
    Then should see Background Area Title: "Background" on Brew Details Page
    Then should see Background Area Description: "The Chemex is an essential tool for every coffee lover, thanks to its unique blend of ingenuity and practicality. Since its invention in 1941 by Peter Schlumbohm, its design has remained untouched. Chemex-prepared coffee tastes remarkably similar to drip coffee but with more variability. To have the greatest results, you must grind your coffee beans more coarsely than you would for a ceramic drip and pay special attention to the pour rate." on Brew Details Page
    Then should see Brew Your Dream Area Title: "Brew Your Dream" on Brew Details Page
    Then should see Brew Your Dream Area Shop Our Coffee Button: "Shop Our Coffee" on Brew Details Page
    Then should see Brew Your Dream Area Image on Brew Details Page

  @ShareArea @Facebook @Navigaiton
  Scenario: Share Area Facebook Navigation Control
    Given user on the Brew Details Page
    When click Share Area Facebook Icon on Brew Details Page
    Then should see the Traum Kaffee Facebook Page

  @ShareArea @Twitter @Navigaiton
  Scenario: Share Area Twitter Navigation Control
    Given user on the Brew Details Page
    When click Share Area Twitter Icon on Brew Details Page
    Then should see the Traum Kaffee Twitter Page

  @ShareArea @Instagram @Navigaiton
  Scenario: Share Area Instagram Navigation Control
    Given user on the Brew Details Page
    When click Share Area Instagram Icon on Brew Details Page
    Then should see the Traum Kaffee Instagram Page

  @ShareArea @Tiktok @Navigaiton
  Scenario: Share Area Tiktok Navigation Control
    Given user on the Brew Details Page
    When click Share Area Tiktok Icon on Brew Details Page
    Then should see the Traum Kaffee Tiktok Page

  @BrewYourDreamArea @Navigation @Deneme
  Scenario: Brew Your Dream Area Navigation Control
    Given user on the Brew Details Page
    When click Brew Your Dream Area Shop Our Coffee Button on Brew Details Page
    Then should see the Products Page