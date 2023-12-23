@BlogsPage
Feature: Blogs Page

  @FreshlyBrewedArea @TextAndComponent
  Scenario: Freshly Brewed Area Text and Component Control
    Given user on the Blogs Page
    Then should see Freshly Brewed Area Title: "Freshly Brewed" on Blogs Page
    Then should see Freshly Brewed Area Sub Title: "Discover the latest trends in the coffee industry, from innovative brewing methods to sustainable practices that shape the future of coffee production." on Blogs Page
    Then should see Freshly Brewed Area Description: "So grab your favorite mug, settle into a comfortable spot, and join us on this caffeinated journey." on Blogs Page
    Then should see Freshly Brewed Area Image on Blogs Page
    Then should see Our Blog Area Title: "Our Blog" on Blogs Page
    Then should see Our Blog Area First Blog Date: "11/27/2023" on Blogs Page
    Then should see Our Blog Area First Blog Title: "Everything About Drip Coffee|2023 Update" on Blogs Page
    Then should see Our Blog Area First Blog Description: "What is drip coffee, how to make it, brewing methods and more, we have prepared for you in our blog post." on Blogs Page
    Then should see Our Blog Area Second Blog Date: "11/27/2023" on Blogs Page
    Then should see Our Blog Area Second Blog Title: "Coffee Beans Dubai: The Ultimate Guide" on Blogs Page
    Then should see Our Blog Area Second Blog Description: "From coffee bean basics to different coffee bean types, roasting levels, and the best places to find green coffee beans in Dubai, we've got you covered." on Blogs Page
    Then should see Our Blog Area Third Blog Date: "11/27/2023" on Blogs Page
    Then should see Our Blog Area Third Blog Title: "Americano vs. Black Coffee: Exploring the Differences in Flavor and Brewing Techniques - Which One Suits Your Palate?" on Blogs Page
    Then should see Our Blog Area Third Blog Description: "Discover the differences between Americano and black coffee to help you choose the perfect cup for your taste preferences in our comprehensive blog." on Blogs Page
    Then should see Our Blog Area Show More Button: "Show More" on Blogs Page

  @OurBlogArea @ShowMore
  Scenario: Our Blog Area Show More Control
    Given user on the Blogs Page
    Then should see Blog Count: "3" on Blogs Page
    When click Our Blog Area Show More Button on Blogs Page
    Then should see Blog Count: "9" on Blogs Page
    When click Our Blog Area Show More Button on Blogs Page
    Then should see Blog Count: "15" on Blogs Page
    When click Our Blog Area Show More Button on Blogs Page
    Then should see Blog Count: "21" on Blogs Page

  @OurBlogArea @Navigation
  Scenario: Our Blog Area Show More Control
    Given user on the Blogs Page
    When click Our Blog Area First Blog on Blogs Page
    Then should see the Blog Detail Page

