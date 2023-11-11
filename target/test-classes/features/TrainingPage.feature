@TrainingPage
Feature: Training Page

  @TrainingArea @TextAndComponent
  Scenario: Training Area Text and Component Control
    Given user on the Training Page
    Then should see Training Area Title: "Training" on Training Page
    Then should see Training Area Description: "At Traum, we believe that making the perfect cup of coffee is an art form that requires not only skill but also knowledge and passion." on Training Page
    Then should see Training Area Image on Training Page
    Then should see Description Area Description: "Our training program is designed to help you and your staff develop the skills and knowledge you need to create high-quality coffee drinks and provide an exceptional coffee experience for your customers.At Traum Kaffee, our goal is not only to help you make the perfect cup of coffee but also to share our knowledge and passion for coffee with you. We believe that by understanding the coffee-making process from start to finish, you can appreciate the art and science behind this beloved beverage and ultimately serve your customers the best possible coffee experience." on Training Page
    Then should see Coffee Training Area Title: "Coffee Training" on Training Page
    Then should see Coffee Training Area Description: "Our coffee education program goes beyond just teaching you how to brew coffee. We also take the time to educate you on the origins of coffee, the factors that impact the quality and flavor of coffee, and how we select our coffee beans through a process called cupping. This helps you make informed decisions when it comes to selecting and brewing coffee and allows you to appreciate the art and science behind this beloved beverage.In addition, we are passionate about the roasting process and take great care in roasting our coffee beans to perfection. We would be delighted to share our roasting process with you and show you how we carefully roast our coffees to bring out their unique and delicious flavors." on Training Page
    Then should see Coffee Training Area Image on Training Page
    Then should see Machine Training Area Title: "Machine Training" on Training Page
    Then should see Machine Training Area Description: "Our machine training program is designed to teach you and your staff how to operate and maintain your coffee equipment to ensure that it operates at peak performance.We cover everything from routine cleaning and maintenance to troubleshooting common issues that may arise. With our machine training, you can ensure that your equipment is always in top condition, allowing you to serve high-quality coffee to your customers consistently." on Training Page
    Then should see Machine Training Area Image on Training Page
    Then should see Barista Training Area Title: "Barista Training" on Training Page
    Then should see Barista Training Area Description: "Our barista training program is a comprehensive and hands-on learning experience that will teach you and your staff everything you need to know to become skilled coffee professionals. We start by teaching the fundamentals of espresso extraction, including grind size, dose, and tamping pressure. Once you have a solid foundation in espresso preparation, we move on to milk steaming and texturing techniques. You'll learn how to create the silky microfoam that's essential for latte art and how to pour beautiful designs like hearts, rosettas, and tulips.But our training program isn't just about technique. We also cover the science behind coffee extraction and milk chemistry, helping you understand how different variables can affect the taste of your drinks. We'll also teach you how to troubleshoot common issues, so you can ensure that your drinks are always perfect." on Training Page
    Then should see Barista Training Area Image on Training Page
    Then should see Workshops Area Title: "Workshops" on Training Page
    Then should see Workshops Area Description: "We offer various workshops covering various topics, including advanced latte art, coffee cupping, and coffee brewing techniques. Our workshops are designed to be interactive!Contact us to learn more about our workshop offerings and how we can help you take your coffee game to the next level." on Training Page
    Then should see Workshops Area Image on Training Page
    Then should see Lets Grab a Coffee Area Title: "Let's Grab a Coffee!" on Training Page
    Then should see Lets Grab a Coffee Area Description: "For more information on how to partner with us and to learn more about our wholesale coffee program,contact us now!" on Whosale Page
    Then should see Lets Grab a Coffee Area Full Name: "Full Name" on Training Page
    Then should see Lets Grab a Coffee Area Email: "Email" on Training Page
    Then should see Lets Grab a Coffee Area Contact Number: "Contact Number" on Training Page
    Then should see Lets Grab a Coffee Area Business Name: "Business Name" on Training Page
    Then should see Lets Grab a Coffee Area Type of Business: "Type of Business" on Training Page
    When click Lets Grab a Coffee Area Type of Busines on Whosale Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Hotel" on Training Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Restaurant" on Training Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Cafe" on Training Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Office" on Training Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Events" on Training Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Other" on Training Page
    Then should see Lets Grab a Coffee Area Tell us: "Tell us a bit about your business... the more info the better!" on Training Page
    Then should see Lets Grab a Coffee Area Send Button: "SEND" on Training Page

  @LetsGrabaCoffeeArea @Successfully
  Scenario Outline: Lets Grab a Coffee Area Successfully Send Control
    Given user on the Training Page
    When sendkeys Lets Grab a Coffee Area Full Name: "<fullName>" on Training Page
    When sendkeys Lets Grab a Coffee Area Mail: "<mail>" on Training Page
    When sendkeys Lets Grab a Coffee Area Contact Number: "<contactNumber>" on Training Page
    When sendkeys Lets Grab a Coffee Area Business Name: "<businessName>" on Training Page
    When select Lets Grab a Coffee Area Type of Business: "<type>" on Training Page
    When sendkeys Lets Grab a Coffee Area Tell us: "<tellUs>" on Training Page
    When click Lets Grab a Coffee Area Send Button on Training Page
    Then should see Popup Message: "Your message has been sent successfully."
    Then should see Popup Icon
    Then should see Popup Close Icon
    Examples:
      | fullName | mail          | contactNumber | businessName | type  | tellUs  |
      | Enes     | mail@mail.com | +905439459532 | ronwell      | Hotel | tell us |

  @LetsGrabaCoffeeArea @Empty
  Scenario: Lets Grab a Coffee Area Empty Fields Send Control
    Given user on the Training Page
    When click Lets Grab a Coffee Area Send Button on Training Page
    Then should see Lets Grab a Coffee Area Full Name Error: "This is required." on Training Page
    Then should see Lets Grab a Coffee Area Email Error: "Email is invalid." on Training Page
    Then should see Lets Grab a Coffee Area Contact Number Error: "Invalid Phone" on Training Page
    Then should see Lets Grab a Coffee Area Business Name Error: "This is required." on Training Page
    Then should see Lets Grab a Coffee Area Type of Business Error: "This is required." on Training Page
    Then should see Lets Grab a Coffee Area Tell us Error: "This is required." on Training Page
