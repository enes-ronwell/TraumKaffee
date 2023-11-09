@CafesAndCoffeeShopsPage
Feature: Cafes And Coffee Shops Page

  @CoffeeAndCoffeeShopsArea @TextAndComponent
  Scenario: Cafes and Coffee Shops Area Text and Component Control
    Given user on the Cafes and Coffee Shops Page
    Then should see Cafes and Coffee Shops Area Title: "Cafes And Coffee Shops" on Cafes and Coffee Shops Page
    Then should see Cafes and Coffee Shops Area Description: "Traum is a great choice for cafes and coffee shops looking to impress their customers with high quality coffee, sustainably sourced and carefully roasted to perfection." on Cafes and Coffee Shops Page
    Then should see Cafes and Coffee Shops Area Image on Cafes and Coffee Shops Page
    Then should see Description Area Description: "Welcome to Traum, where we specialize in providing high-quality coffee for cafes and coffee shops. We know that coffee is an essential part of your business, and we want to help you offer your customers the best possible coffee experience.Our coffee beans are sourced from around the world and carefully selected for their quality and unique flavor profiles. We roast our beans in small batches to ensure that each bag of coffee is fresh and flavorful. Our coffee experts are dedicated to crafting the perfect blends to meet your specific needs.We also offer support and resources to help you and your staff learn about coffee brewing techniques, equipment maintenance, and other important aspects of coffee service.We believe that coffee is more than just a drink; it's a way to connect with others, build relationships, and create memorable experiences." on Cafes and Coffee Shops Page
    Then should see Are You Brewing Up Area Title: "Are You Brewing Up A Coffee Business Or Looking To Expand?" on Cafes and Coffee Shops Page
    Then should see Are You Brewing Up Area Description: "We understand what your cafe needs!At Traum Kaffee, we're here to support your coffee business, whether you are starting a new coffee business or you're expanding to new locations, upgrading your equipment, or adding to your team.  We offer a range of top-quality espresso machines, grinders, and accessories to help you serve the best coffee possible.Traum Kaffee is more than just a coffee supplier - we're part of your operations team. We offer customized service, equipment set-up, and training from our expert baristas to ensure your success.We care about your success and will work with you to create a customized solution that meets your cafe needs." on Cafes and Coffee Shops Page
    Then should see Are You Brewing Up Area Image on Cafes and Coffee Shops Page
    Then should see The Art Of Making Area Title: "The Art Of Making The Perfect Coffee" on Cafes and Coffee Shops Page
    Then should see The Art Of Making Area Description: "We train new businesses, existing customers, and those wishing to advance or refresh their barista skills. Whether you need a refresher, have new team members joining, or want to learn new skills, our training can be a game-changer.Visit our Training page, specially designed to help them master the art of coffee preparation." on Cafes and Coffee Shops Page
    Then should see The Art Of Making Area Image on Cafes and Coffee Shops Page
    Then should see The Art Of Making Area Training Button: "TRAINING" on Cafes and Coffee Shops Page
    Then should see Lets Grab a Coffee Area Title: "Let's Grab a Coffee!" on Cafes and Coffee Shops Page
    Then should see Lets Grab a Coffee Area Description: "For more information on how to partner with us and to learn more about our wholesale coffee program,contact us now!" on Cafes and Coffee Shops Page
    Then should see Lets Grab a Coffee Area Full Name: "Full Name" on Cafes and Coffee Shops Page
    Then should see Lets Grab a Coffee Area Email: "Email" on Cafes and Coffee Shops Page
    Then should see Lets Grab a Coffee Area Contact Number: "Contact Number" on Cafes and Coffee Shops Page
    Then should see Lets Grab a Coffee Area Business Name: "Business Name" on Cafes and Coffee Shops Page
    Then should see Lets Grab a Coffee Area Type of Business: "Type of Business" on Cafes and Coffee Shops Page
    When click Lets Grab a Coffee Area Type of Busines on Cafes and Coffee Shops Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Hotel" on Cafes and Coffee Shops Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Restaurant" on Cafes and Coffee Shops Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Cafe" on Cafes and Coffee Shops Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Office" on Cafes and Coffee Shops Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Events" on Cafes and Coffee Shops Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Other" on Cafes and Coffee Shops Page
    Then should see Lets Grab a Coffee Area Tell us: "Tell us a bit about your business... the more info the better!" on Cafes and Coffee Shops Page
    Then should see Lets Grab a Coffee Area Send Button: "SEND" on Cafes and Coffee Shops Page
    Then should see Stand Out Area Title: "Stand Out In The Coffee Industry" on Cafes and Coffee Shops Page
    Then should see Stand Out Area Description: "We understand that standing out in the coffee industry can be a challenge.With Traum, you can offer your customers a unique and unforgettable coffee experience. Let us show how we can help you stand out in the crowded coffee industry with our quality coffee and exceptional consultancy!" on Cafes and Coffee Shops Page
    Then should see Stand Out Area Image on Cafes and Coffee Shops Page

  @TheArtOfMakingArea @Navigate
  Scenario: From Barista Area Navigate Control
    Given user on the Cafes and Coffee Shops Page
    When click The Art Of Making Area Training Button on Cafes and Coffee Shops Page
    Then should see the Training Page

  @LetsGrabaCoffeeArea @Successfully
  Scenario Outline: Lets Grab a Coffee Area Successfully Send Control
    Given user on the Cafes and Coffee Shops Page
    When sendkeys Lets Grab a Coffee Area Full Name: "<fullName>" on Cafes and Coffee Shops Page
    When sendkeys Lets Grab a Coffee Area Mail: "<mail>" on Cafes and Coffee Shops Page
    When sendkeys Lets Grab a Coffee Area Contact Number: "<contactNumber>" on Cafes and Coffee Shops Page
    When sendkeys Lets Grab a Coffee Area Business Name: "<businessName>" on Cafes and Coffee Shops Page
    When select Lets Grab a Coffee Area Type of Business: "<type>" on Cafes and Coffee Shops Page
    When sendkeys Lets Grab a Coffee Area Tell us: "<tellUs>" on Cafes and Coffee Shops Page
    When click Lets Grab a Coffee Area Send Button on Cafes and Coffee Shops Page
    Then should see Popup Message: "Your message has been sent successfully."
    Then should see Popup Icon
    Then should see Popup Close Icon
    Examples:
      | fullName | mail          | contactNumber | businessName | type  | tellUs  |
      | Enes     | mail@mail.com | +905439459532 | ronwell      | Hotel | tell us |

  @LetsGrabaCoffeeArea @Empty
  Scenario: Lets Grab a Coffee Area Empty Fields Send Control
    Given user on the Cafes and Coffee Shops Page
    When click Lets Grab a Coffee Area Send Button on Cafes and Coffee Shops Page
    Then should see Lets Grab a Coffee Area Full Name Error: "This is required." on Cafes and Coffee Shops Page
    Then should see Lets Grab a Coffee Area Email Error: "Email is invalid." on Cafes and Coffee Shops Page
    Then should see Lets Grab a Coffee Area Contact Number Error: "Invalid Phone" on Cafes and Coffee Shops Page
    Then should see Lets Grab a Coffee Area Business Name Error: "This is required." on Cafes and Coffee Shops Page
    Then should see Lets Grab a Coffee Area Type of Business Error: "This is required." on Cafes and Coffee Shops Page
    Then should see Lets Grab a Coffee Area Tell us Error: "This is required." on Cafes and Coffee Shops Page
