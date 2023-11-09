@CoffeeForRestaurantPage
Feature: Coffee For Restaurant Page

  @CoffeeForRestaurantArea @TextAndComponent
  Scenario: Coffee For Restaurant Area Text and Component Control
    Given user on the Coffee for Restaurant Page
    Then should see Coffee For Restaurant Area Title: "Coffee For Restaurant" on Coffee for Restaurant Page
    Then should see Coffee For Restaurant Area Description: "If your business serves coffee, Traum Kaffee is your perfect partner. Whether you own a small venue or a restaurant chain, we provide the perfect coffee for you and your customers." on Coffee for Restaurant Page
    Then should see Coffee For Restaurant Area Image on Coffee for Restaurant Page
    Then should see Description Area Description: "At Traum Kaffee, we understand that working in the restaurant industry can be demanding and time-consuming. That's why we strive to be a reliable coffee partner for restaurants, providing high-quality coffee and time-saving services.We know that serving great coffee is more than just a beverage – it's an experience that keeps customers coming back for more. That's why we take pride in crafting the perfect coffee blends that deliver rich, bold flavors and aromas that will satisfy and refresh your customers.Our team of coffee experts is available to offer advice and insights on customer preferences, as well as provide timely delivery of food service supplies. With our comprehensive restaurant coffee program, restaurant owners can focus on running their businesses while we take care of the coffee." on Coffee for Restaurant Page
    Then should see Why Partner Area Title: "Looking for the perfect cup of coffee to complement your restaurant's delicious cuisine?" on Coffee for Restaurant Page
    Then should see Why Partner Area Description: "Look no further! Our high-quality coffee beans are carefully sourced and expertly roasted to create a rich, complex flavor that will elevate your guests' dining experience to new heights." on Coffee for Restaurant Page
    Then should see Why Partner Area Image on Coffee for Restaurant Page
    Then should see Our Commitment Area Title: "Our Commitment To Quality Doesn'T End There" on Coffee for Restaurant Page
    Then should see Our Commitment Area Description: "We also provide training and support to our restaurant partners to ensure that our coffee is prepared and served in the best possible way. From expert barista training to custom brewing guides, we are here to help you create the perfect cup of coffee every time." on Coffee for Restaurant Page
    Then should see Our Commitment Area Training Button: "TRAINING" on Coffee for Restaurant Page
    Then should see Our Commitment Area Image on Coffee for Restaurant Page
    Then should see Why Settle Area Title: "Why Settle For Ordinary Coffee When You Can Offer Your Guests Something Truly Special?" on Coffee for Restaurant Page
    Then should see Why Settle Area Description: "Our high-quality coffee will not only satisfy your customers' caffeine cravings but will also leave them with a lasting impression of your restaurant's commitment to excellence. We offer them coffee workshops led by our expert baristas." on Coffee for Restaurant Page
    Then should see Why Settle Area Image on Coffee for Restaurant Page
    Then should see Lets Grab a Coffee Area Title: "Let's Grab a Coffee!" on Coffee for Restaurant Page
    Then should see Lets Grab a Coffee Area Description: "For more information on how to partner with us and to learn more about our wholesale coffee program,contact us now!" on Coffee for Restaurant Page
    Then should see Lets Grab a Coffee Area Full Name: "Full Name" on Coffee for Restaurant Page
    Then should see Lets Grab a Coffee Area Email: "Email" on Coffee for Restaurant Page
    Then should see Lets Grab a Coffee Area Contact Number: "Contact Number" on Coffee for Restaurant Page
    Then should see Lets Grab a Coffee Area Business Name: "Business Name" on Coffee for Restaurant Page
    Then should see Lets Grab a Coffee Area Type of Business: "Type of Business" on Coffee for Restaurant Page
    When click Lets Grab a Coffee Area Type of Busines on Coffee for Restaurant Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Hotel" on Coffee for Restaurant Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Restaurant" on Coffee for Restaurant Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Cafe" on Coffee for Restaurant Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Office" on Coffee for Restaurant Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Events" on Coffee for Restaurant Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Other" on Coffee for Restaurant Page
    Then should see Lets Grab a Coffee Area Tell us: "Tell us a bit about your business... the more info the better!" on Coffee for Restaurant Page
    Then should see Lets Grab a Coffee Area Send Button: "SEND" on Coffee for Restaurant Page

  @OurCommitmentArea @Navigation
  Scenario: Our Commitment Area Navigation Control
    Given user on the Coffee for Restaurant Page
    When click Our Commitment Area Training Button on Coffee for Restaurant Page
    Then should see the Training Page

  @LetsGrabaCoffeeArea @Successfully
  Scenario Outline: Lets Grab a Coffee Area Successfully Send Control
    Given user on the Coffee for Restaurant Page
    When sendkeys Lets Grab a Coffee Area Full Name: "<fullName>" on Coffee for Restaurant Page
    When sendkeys Lets Grab a Coffee Area Mail: "<mail>" on Coffee for Restaurant Page
    When sendkeys Lets Grab a Coffee Area Contact Number: "<contactNumber>" on Coffee for Restaurant Page
    When sendkeys Lets Grab a Coffee Area Business Name: "<businessName>" on Coffee for Restaurant Page
    When select Lets Grab a Coffee Area Type of Business: "<type>" on Coffee for Restaurant Page
    When sendkeys Lets Grab a Coffee Area Tell us: "<tellUs>" on Coffee for Restaurant Page
    When click Lets Grab a Coffee Area Send Button on Coffee for Restaurant Page
    Then should see Popup Message: "Your message has been sent successfully."
    Then should see Popup Icon
    Then should see Popup Close Icon
    Examples:
      | fullName | mail | contactNumber | businessName | type | tellUs |
      | Enes     | mail@mail.com | +905439459532 | ronwell      | Hotel | tell us |

  @LetsGrabaCoffeeArea @Empty
  Scenario: Lets Grab a Coffee Area Empty Fields Send Control
    Given user on the Coffee for Hotels Page
    When click Lets Grab a Coffee Area Send Button on Coffee for Restaurant Page
    Then should see Lets Grab a Coffee Area Full Name Error: "This is required." on Coffee for Restaurant Page
    Then should see Lets Grab a Coffee Area Email Error: "Email is invalid." on Coffee for Restaurant Page
    Then should see Lets Grab a Coffee Area Contact Number Error: "Invalid Phone" on Coffee for Restaurant Page
    Then should see Lets Grab a Coffee Area Business Name Error: "This is required." on Coffee for Restaurant Page
    Then should see Lets Grab a Coffee Area Type of Business Error: "This is required." on Coffee for Restaurant Page
    Then should see Lets Grab a Coffee Area Tell us Error: "This is required." on Coffee for Restaurant Page
