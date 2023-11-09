@EquipmentsPage
Feature: Equipments Page

  @EquipmentsArea @TextAndComponent
  Scenario: Equipments Area Text and Component Control
    Given user on the Equipment Page
    Then should see Equipment Area Title: "Equipments" on Equipment Page
    Then should see Equipment Area Description: "At Traum Kaffee, we are dedicated to supplying the best equipment to make the best coffee." on Equipment Page
    Then should see Equipment Area Image on Equipment Page
    Then should see Description Area Description: "We provide comprehensive training, installation, and ongoing service to ensure you get the best out of your equipment.We are here to support you every step of the way, from installation to ongoing maintenance and service, to ensure your coffee business succeeds." on Equipment Page
    Then should see High Quality Coffee Area Title: "High-Quality Coffee Machines and Grinders" on Equipment Page
    Then should see High Quality Coffee Area Description: "At Traum Kaffee, we understand the importance of investing in high-quality coffee machines and grinders to ensure your coffee tastes consistently delicious. That’s why we have established partnerships with only the most reputable and industry-leading brands to provide you with the best possible equipment options. Our machines are carefully selected to meet the highest standards of quality, durability, and performance, so you can have confidence in your investment.Our knowledgeable team can guide you through the selection process to ensure you choose the right equipment for your specific needs and preferences. Whether you’re looking for precision, speed, ease of use, or all of the above, we have the perfect machine for you.With Traum, you can have peace of mind knowing that you are investing in the highest quality coffee equipment and service available in the industry." on Equipment Page
    Then should see High Quality Coffee Area Image on Equipment Page
    Then should see Installation Area Title: "Installation" on Equipment Page
    Then should see Installation Area Description: "We understand that proper installation is crucial to ensuring your coffee equipment operates correctly and produces the best possible coffee.Our experienced technicians will handle the installation process with care and attention to detail, ensuring your equipment is set up according to manufacturer specifications and local regulations.We also provide guidance on optimal placement and setup to ensure that your equipment is both functional and aesthetically pleasing. Our goal is to provide you with a seamless installation process that minimizes downtime and maximizes your return on investment." on Equipment Page
    Then should see Installation Area Image on Equipment Page
    Then should see Comprehensive Training Area Title: "Comprehensive Training" on Equipment Page
    Then should see Comprehensive Training Area Description: "At Traum Kaffee, we take pride in providing our customers with the highest level of service and expertise.We offer comprehensive training to ensure that you are able to use your new equipment effectively and efficiently. Our experienced technicians will guide you through the setup process, demonstrate how to use the machine, and provide tips on maintenance and cleaning.Our goal is to empower you to create the best possible coffee experience for your customers, and we believe that proper training is essential to achieving that goal." on Equipment Page
    Then should see Comprehensive Training Area Image on Equipment Page
    Then should see Ongoing Technical Area Title: "Ongoing Technical Service" on Equipment Page
    Then should see Ongoing Technical Area Description: "We want our customers' coffee equipment to be always in top condition.That’s why we offer ongoing service to provide regular maintenance and support for your coffee machines and grinders. Our team is available to diagnose and repair any issues that may arise, ensuring that your equipment operates at peak performance.Our goal is to provide you with peace of mind and the knowledge that your coffee equipment will always be operating at its best so that you can focus on creating the perfect cup of coffee for your customers." on Equipment Page
    Then should see Ongoing Technical Area Image on Equipment Page
    Then should see Lets Grab a Coffee Area Title: "Let's Grab a Coffee!" on Equipment Page
    Then should see Lets Grab a Coffee Area Description: "For more information on how to partner with us and to learn more about our wholesale coffee program,contact us now!" on Equipment Page
    Then should see Lets Grab a Coffee Area Full Name: "Full Name" on Equipment Page
    Then should see Lets Grab a Coffee Area Email: "Email" on Equipment Page
    Then should see Lets Grab a Coffee Area Contact Number: "Contact Number" on Equipment Page
    Then should see Lets Grab a Coffee Area Business Name: "Business Name" on Equipment Page
    Then should see Lets Grab a Coffee Area Type of Business: "Type of Business" on Equipment Page
    When click Lets Grab a Coffee Area Type of Busines on Equipment Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Hotel" on Equipment Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Restaurant" on Equipment Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Cafe" on Equipment Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Office" on Equipment Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Events" on Equipment Page
    Then should see Lets Grab a Coffee Area Type of Business Option: "Other" on Equipment Page
    Then should see Lets Grab a Coffee Area Tell us: "Tell us a bit about your business... the more info the better!" on Equipment Page
    Then should see Lets Grab a Coffee Area Send Button: "SEND" on Equipment Page

  @LetsGrabaCoffeeArea @Successfully
  Scenario Outline: Lets Grab a Coffee Area Successfully Send Control
    Given user on the Equipment Page
    When sendkeys Lets Grab a Coffee Area Full Name: "<fullName>" on Equipment Page
    When sendkeys Lets Grab a Coffee Area Mail: "<mail>" on Equipment Page
    When sendkeys Lets Grab a Coffee Area Contact Number: "<contactNumber>" on Equipment Page
    When sendkeys Lets Grab a Coffee Area Business Name: "<businessName>" on Equipment Page
    When select Lets Grab a Coffee Area Type of Business: "<type>" on Equipment Page
    When sendkeys Lets Grab a Coffee Area Tell us: "<tellUs>" on Equipment Page
    When click Lets Grab a Coffee Area Send Button on Equipment Page
    Then should see Popup Message: "Your message has been sent successfully."
    Then should see Popup Icon
    Then should see Popup Close Icon
    Examples:
      | fullName | mail          | contactNumber | businessName | type  | tellUs  |
      | Enes     | mail@mail.com | +905439459532 | ronwell      | Hotel | tell us |

  @LetsGrabaCoffeeArea @Empty
  Scenario: Lets Grab a Coffee Area Empty Fields Send Control
    Given user on the Equipment Page
    When click Lets Grab a Coffee Area Send Button on Equipment Page
    Then should see Lets Grab a Coffee Area Full Name Error: "This is required." on Equipment Page
    Then should see Lets Grab a Coffee Area Email Error: "Email is invalid." on Equipment Page
    Then should see Lets Grab a Coffee Area Contact Number Error: "Invalid Phone" on Equipment Page
    Then should see Lets Grab a Coffee Area Business Name Error: "This is required." on Equipment Page
    Then should see Lets Grab a Coffee Area Type of Business Error: "This is required." on Equipment Page
    Then should see Lets Grab a Coffee Area Tell us Error: "This is required." on Equipment Page
