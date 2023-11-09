@CoffeeForHotelsPage
Feature: Coffee For Hotels Page

  @CoffeeForRestaurantArea @TextAndComponent
  Scenario: Coffee For Hotels Area Text and Component Control
    Given user on the Coffee for Hotels Page
    Then should see Coffee For Hotels Area Title: "Coffee For Hotels" on Coffee for Hotels Page
    Then should see Coffee For Hotels Area Description: "Looking for the perfect coffee partner for your hotel? Look no further than Traum Kaffee!" on Coffee for Hotels Page
    Then should see Coffee For Hotels Area Image on Coffee for Hotels Page
    Then should see Description Area Description: "Our exceptional coffee is crafted from high-quality, sustainably sourced beans and roasted to perfection, resulting in a rich and flavorful experience that your guests won't forget.Traum is not like other hotel coffee suppliers. We also offer specialized coffee workshops for hotel guests and expert training for hotel staff to ensure that your coffee offerings are second to none.Let us help you elevate your hotel's coffee game and provide an unforgettable experience for your guests." on Coffee for Hotels Page
    Then should see Taste Difference Area Title: "Taste the Difference: Traum Commitment to Quality Coffee" on Coffee for Hotels Page
    Then should see Taste Difference Area Description: "We believe that quality is key when it comes to coffee. That's why we source only the finest beans from around the world and expertly roast them to bring out their unique flavor profiles. Our commitment to quality extends beyond the beans themselves - we also provide customized solutions for hotels and other businesses to ensure that their coffee offerings meet their specific needs and preferences." on Coffee for Hotels Page
    Then should see Taste Difference Area Image on Coffee for Hotels Page
    Then should see Coffee Revolation Area Title: "The Coffee Revolution: Where Innovation Meets Taste" on Coffee for Hotels Page
    Then should see Coffee Revolation Area Description: "We believe in pushing the boundaries of what is possible when it comes to coffee. Our team of expert roasters and baristas is always experimenting with new blends, brewing methods, and flavor profiles to offer our customers something truly unique.We also offer specialized training for hotel staff to ensure that they can provide the best possible coffee experience for their guests." on Coffee for Hotels Page
    Then should see Coffee Revolation Area Image on Coffee for Hotels Page
    Then should see Brewing With Hospitally Area Title: "Brewing with Hospitality" on Coffee for Hotels Page
    Then should see Brewing With Hospitally Area Description: "We are passionate about providing exceptional customer service to our partners.We believe in building long-term partnerships with our customers and working closely with them to meet their specific needs. Whether you are a hotel manager, food and beverage director, or executive chef, we are here to provide you with personalized solutions and support." on Coffee for Hotels Page
    Then should see Brewing With Hospitally Area Image on Coffee for Hotels Page
    Then should see Sustainably Delicious Area Title: "Sustainably Delicious" on Coffee for Hotels Page
    Then should see Sustainably Delicious Area Description: "We are committed to sustainability in every aspect of our business, from the way we source our beans to the materials we use in our packaging. We work with farmers who use sustainable growing practices." on Coffee for Hotels Page
    Then should see Sustainably Delicious Area Image on Coffee for Hotels Page
    Then should see From Barista Area Title: "From Barista to Pro: Specialized Coffee Training for Hotel Staff" on Coffee for Hotels Page
    Then should see From Barista Area Description: "We also offer specialized training for hotel staff to ensure that they can provide the best possible coffee experience for their guests. By working closely with hotel staff, we help them to improve their skills and knowledge, which in turn leads to happy and satisfied guests." on Coffee for Hotels Page
    Then should see From Barista Area Image on Coffee for Hotels Page
    Then should see From Barista Area Training Button: "TRAINING" on Coffee for Hotels Page
    Then should see What Makes Us Area Title: "What makes us your perfect partner?" on Coffee for Hotels Page
    Then should see What Makes Us Area Description: "At Traum Kaffee, we go beyond supplying coffee. We offer a comprehensive range of services to enhance your coffee experience. We help you choose the right coffee machine, provide regular technical and quality service, and offer professional barista training for you and your team. From installation to serving your first cup of coffee, we take care of everything so you can focus on your business." on Coffee for Hotels Page
    Then should see What Makes Us Area Image on Coffee for Hotels Page
    Then should see Lets Grab a Coffee Area Title: "Let's Grab a Coffee!" on Coffee for Hotels Page
    Then should see Lets Grab a Coffee Area Description: "For more information on how to partner with us and to learn more about our wholesale coffee program,contact us now!" on Coffee for Hotels Page
    Then should see Lets Grab a Coffee Area Full Name: "Full Name" on Coffee for Hotels Page
    Then should see Lets Grab a Coffee Area Email: "Email" on Coffee for Hotels Page
    Then should see Lets Grab a Coffee Area Contact Number: "Contact Number" on Coffee for Hotels Page
    Then should see Lets Grab a Coffee Area Business Name: "Business Name" on Coffee for Hotels Page
    Then should see Lets Grab a Coffee Area Type of Business: "Type of Business" on Coffee for Hotels Page
    When click Lets Grab a Coffee Area Type of Busines on Coffee for Hotels Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Hotel" on Coffee for Hotels Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Restaurant" on Coffee for Hotels Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Cafe" on Coffee for Hotels Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Office" on Coffee for Hotels Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Events" on Coffee for Hotels Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Other" on Coffee for Hotels Page
    Then should see Lets Grab a Coffee Area Tell us: "Tell us a bit about your business... the more info the better!" on Coffee for Hotels Page
    Then should see Lets Grab a Coffee Area Send Button: "SEND" on Coffee for Hotels Page

  @FromBaristaArea @Navigate
  Scenario: From Barista Area Navigate Control
    Given user on the Coffee for Hotels Page
    When click From Barista Area Training Button on Coffee for Hotels Page
    Then should see the Training Page

  @LetsGrabaCoffeeArea @Successfully
  Scenario Outline: Lets Grab a Coffee Area Successfully Send Control
    Given user on the Coffee for Hotels Page
    When sendkeys Lets Grab a Coffee Area Full Name: "<fullName>" on Coffee for Hotels Page
    When sendkeys Lets Grab a Coffee Area Mail: "<mail>" on Coffee for Hotels Page
    When sendkeys Lets Grab a Coffee Area Contact Number: "<contactNumber>" on Coffee for Hotels Page
    When sendkeys Lets Grab a Coffee Area Business Name: "<businessName>" on Coffee for Hotels Page
    When select Lets Grab a Coffee Area Type of Business: "<type>" on Coffee for Hotels Page
    When sendkeys Lets Grab a Coffee Area Tell us: "<tellUs>" on Coffee for Hotels Page
    When click Lets Grab a Coffee Area Send Button on Coffee for Hotels Page
    Then should see Popup Message: "Your message has been sent successfully."
    Then should see Popup Icon
    Then should see Popup Close Icon
    Examples:
      | fullName | mail          | contactNumber | businessName | type  | tellUs  |
      | Enes     | mail@mail.com | +905439459532 | ronwell      | Hotel | tell us |

  @LetsGrabaCoffeeArea @Empty
  Scenario: Lets Grab a Coffee Area Empty Fields Send Control
    Given user on the Coffee for Hotels Page
    When click Lets Grab a Coffee Area Send Button on Coffee for Hotels Page
    Then should see Lets Grab a Coffee Area Full Name Error: "This is required." on Coffee for Hotels Page
    Then should see Lets Grab a Coffee Area Email Error: "Email is invalid." on Coffee for Hotels Page
    Then should see Lets Grab a Coffee Area Contact Number Error: "Invalid Phone" on Coffee for Hotels Page
    Then should see Lets Grab a Coffee Area Business Name Error: "This is required." on Coffee for Hotels Page
    Then should see Lets Grab a Coffee Area Type of Business Error: "This is required." on Coffee for Hotels Page
    Then should see Lets Grab a Coffee Area Tell us Error: "This is required." on Coffee for Hotels Page
