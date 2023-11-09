@CoffeeAtWorkPage
Feature: Coffee At Work Page

  @CoffeeAndCoffeeShopsArea @TextAndComponent
  Scenario: Coffee At Work Area Text and Component Control
    Given user on the Coffee At Work Page
    Then should see Coffee At Work Area Title: "Coffee At Work" on Coffee At Work Page
    Then should see Coffee At Work Area Description: "From early-morning meetings to late-night deadlines, Traum Kaffee is the reliable companion that fuels your workday." on Coffee At Work Page
    Then should see Coffee At Work Area Image on Coffee At Work Page
    Then should see Description Area Description: "Traum Kaffee is proud to offer wholesale coffee for offices, providing businesses with the highest quality coffee options to keep their employees fueled and productive. Our expertly crafted blends are sourced from the best beans around the world and roasted to perfection, ensuring a rich and flavorful coffee experience every time." on Coffee At Work Page
    Then should see The Favorite Drink Area Title: "The favorite drink of white-collar workers? It's no secret - coffee! " on Coffee At Work Page
    Then should see The Favorite Drink Area Description: "With Traum's premium coffee beans, they can enjoy a delicious and unforgettable coffee experience that will help them power through their busy workdays with ease." on Coffee At Work Page
    Then should see The Favorite Drink Area Image on Coffee At Work Page
    Then should see Brewing Great Area Title: "Brewing Great Coffee In The Office" on Coffee At Work Page
    Then should see Brewing Great Area Description: "Serving great coffee in the office requires more than just a coffee pot and some beans. To provide a truly satisfying coffee experience for employees, offices need high-quality coffee beans that are freshly roasted and ground.Reliable coffee-making equipment is also essential. Providing a variety of coffee blends and single origin flavors can cater to different tastes and preferences among employees." on Coffee At Work Page
    Then should see Brewing Great Area Image on Coffee At Work Page
    Then should see Brewing Great Area Equipment Button: "EQUIPMENT" on Coffee At Work Page
    Then should see Engaging Coffee Area Title: "Engaging Coffee Workshop For Office Workers" on Coffee At Work Page
    Then should see Engaging Coffee Area Description: "Let Traum guide you through an immersive workshop or a short-term training session where you can learn all about the art of coffee making. Our expert coffee trainers will teach you the secrets behind our premium coffee." on Coffee At Work Page
    Then should see Engaging Coffee Area Image on Coffee At Work Page
    Then should see Engaging Coffee Area Training Button: "TRAINING" on Coffee At Work Page
    Then should see A Coffee Break Area Title: "A Coffee Break At Work?" on Coffee At Work Page
    Then should see A Coffee Break Area Description: "At Traum, we believe that a great cup of coffee can do more than just energize you for work - it can also create a sense of community among office workers. That's why we offer high-quality coffee that is designed to make you feel like you're catching up with friends over a cup of coffee, even when you're at work.Our ethically sourced and expertly roasted coffee beans offer a delicious and memorable coffee experience that will leave you feeling relaxed and refreshed, just like you've taken a break with your colleagues." on Coffee At Work Page
    Then should see A Coffee Break Area Image on Coffee At Work Page
    Then should see Lets Grab a Coffee Area Title: "Let's Grab a Coffee!" on Coffee At Work Page
    Then should see Lets Grab a Coffee Area Description: "For more information on how to partner with us and to learn more about our wholesale coffee program,contact us now!" on Coffee At Work Page
    Then should see Lets Grab a Coffee Area Full Name: "Full Name" on Coffee At Work Page
    Then should see Lets Grab a Coffee Area Email: "Email" on Coffee At Work Page
    Then should see Lets Grab a Coffee Area Contact Number: "Contact Number" on Coffee At Work Page
    Then should see Lets Grab a Coffee Area Business Name: "Business Name" on Coffee At Work Page
    Then should see Lets Grab a Coffee Area Type of Business: "Type of Business" on Coffee At Work Page
    When click Lets Grab a Coffee Area Type of Busines on Coffee At Work Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Hotel" on Coffee At Work Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Restaurant" on Coffee At Work Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Cafe" on Coffee At Work Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Office" on Coffee At Work Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Events" on Coffee At Work Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Other" on Coffee At Work Page
    Then should see Lets Grab a Coffee Area Tell us: "Tell us a bit about your business... the more info the better!" on Coffee At Work Page
    Then should see Lets Grab a Coffee Area Send Button: "SEND" on Coffee At Work Page

  @BrewingGreatArea @Navigate
  Scenario: Brewing Great Area Navigate Control
    Given user on the Coffee At Work Page
    When click Brewing Great Area Equipment Button on Coffee At Work Page
    Then should see the Equipment Page

  @BrewingGreatArea @Navigate
  Scenario: Engaging Coffee Area Navigate Control
    Given user on the Coffee At Work Page
    When click Engaging Coffee Area Equipment Button on Coffee At Work Page
    Then should see the Training Page

  @LetsGrabaCoffeeArea @Successfully
  Scenario Outline: Lets Grab a Coffee Area Successfully Send Control
    Given user on the Coffee At Work Page
    When sendkeys Lets Grab a Coffee Area Full Name: "<fullName>" on Coffee At Work Page
    When sendkeys Lets Grab a Coffee Area Mail: "<mail>" on Coffee At Work Page
    When sendkeys Lets Grab a Coffee Area Contact Number: "<contactNumber>" on Coffee At Work Page
    When sendkeys Lets Grab a Coffee Area Business Name: "<businessName>" on Coffee At Work Page
    When select Lets Grab a Coffee Area Type of Business: "<type>" on Coffee At Work Page
    When sendkeys Lets Grab a Coffee Area Tell us: "<tellUs>" on Coffee At Work Page
    When click Lets Grab a Coffee Area Send Button on Coffee At Work Page
    Then should see Popup Message: "Your message has been sent successfully."
    Then should see Popup Icon
    Then should see Popup Close Icon
    Examples:
      | fullName | mail          | contactNumber | businessName | type  | tellUs  |
      | Enes     | mail@mail.com | +905439459532 | ronwell      | Hotel | tell us |

  @LetsGrabaCoffeeArea @Empty
  Scenario: Lets Grab a Coffee Area Empty Fields Send Control
    Given user on the Coffee At Work Page
    When click Lets Grab a Coffee Area Send Button on Coffee At Work Page
    Then should see Lets Grab a Coffee Area Full Name Error: "This is required." on Coffee At Work Page
    Then should see Lets Grab a Coffee Area Email Error: "Email is invalid." on Coffee At Work Page
    Then should see Lets Grab a Coffee Area Contact Number Error: "Invalid Phone" on Coffee At Work Page
    Then should see Lets Grab a Coffee Area Business Name Error: "This is required." on Coffee At Work Page
    Then should see Lets Grab a Coffee Area Type of Business Error: "This is required." on Coffee At Work Page
    Then should see Lets Grab a Coffee Area Tell us Error: "This is required." on Coffee At Work Page
