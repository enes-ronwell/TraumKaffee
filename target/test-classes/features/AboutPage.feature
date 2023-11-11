@AboutPage
Feature: About Page

  @AboutsArea @TextAndComponent
  Scenario: About Area Text and Component Control
    Given user on the About Page
    Then should see About Area Title: "About Traum Life Isn’T Perfect But Your Coffee Can Be" on About Page
    Then should see About Area Description: "We are a coffee roastery where everyone can meet and build meaningful relationships around the aroma of freshly roasted coffee." on About Page
    Then should see About Area Image on About Page
    Then should see How It All Began Area Title: "How It All Began?" on About Page
    Then should see How It All Began Area Description: "Traum began as a dream to create something meaningful. We started this journey because we love quality coffee and want to share it with others. Traum is a home for you to come together and share your dreams. Coffee, quality, and community are what we bring to you. Our goal is to build a coffee community. At our table, there is a place for everyone." on About Page
    Then should see How It All Began Area Image on About Page
    Then should see Our Dream Area Title: "Our Dream Is To Connect Everyone Around The Aroma Of Freshly Roasted Coffee. Let Us Make Your ’’Traum’’ Come True!" on About Page
    Then should see Our Dream Area Left Image on About Page
    Then should see Our Dream Area Right Image on About Page
    Then should see From Mountaintop Area Title: "From Mountaintop To Countertop" on About Page
    Then should see From Mountaintop Area Description: "We are the gold standard in all we do, from seed to cup, and we strive for excellence in everything we do. Finding the best quality seed is the first step in making great coffee. We begin with the highest quality ingredients to provide our customers with the most exceptional coffee experiences in the world. Our production teams make our dreams come true, from roasteries to countertops." on About Page
    Then should see From Mountaintop Area Image on About Page
    Then should see Lets Grab A Coffee Area Title: "Let’s Grab a Coffee!" on About Page
    Then should see Lets Grab A Coffee Area Contact Button: "Contact" on About Page
    Then should see Lets Grab A Coffee Area Image on About Page

  @LetsGrabACoffeeArea @Navigation
  Scenario: Lets Grab A Coffee Area Navigation Control
    Given user on the About Page
    When click Lets Grab A Coffee Area Contact Button on About Page
    Then should see the Contact Page

