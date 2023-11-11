@FAQPage
Feature: FAQ Page

  @HelpWithArea @TextAndComponent
  Scenario: Help With Area Text and Component Control
    Given user on the FAQ Page
    Then should see Help With Area Title: "HELP WITH" on FAQ Page
    Then should see Help With Area Shop: "Shop" on FAQ Page
    Then should see Help With Area My Orders: "My Orders" on FAQ Page
    Then should see Help With Area Brew Guides: "Brew Guides" on FAQ Page
    Then should see Help With Area ContactUs: "Contact Us" on FAQ Page
    Then should see FAQ Area Title: "FAQ" on FAQ Page
    Then should see FAQ Area Question One: "What Is Traum?" on FAQ Page
    When click FAQ Area Question One on FAQ Page
    Then should see FAQ Area Answer One: "Traum Kaffee is a retail and wholesale coffee brand that focuses on producing high-quality coffee using German roasting automation technology to ensure consistency." on FAQ Page
    Then should see FAQ Area Question Two: "Are The Coffees Whole Bean Or Ground?" on FAQ Page
    When click FAQ Area Question Two on FAQ Page
    Then should see FAQ Area Answer Two: "We provide both whole and ground coffee. Most customers prefer whole beans if they have a coffee grinder. A cup of coffee that has been freshly roasted and the ground is the finest way to enjoy its full flavor." on FAQ Page
    Then should see FAQ Area Question Three: "What Is A Grinding Method?" on FAQ Page
    When click FAQ Area Question Three on FAQ Page
    Then should see FAQ Area Answer Three: "The grinding method is breaking down coffee beans into smaller particles for brewing. At Traum Kaffee, we have multiple grinding methods available. You can explore different options by visiting our ‘’Shop’’ section on our website." on FAQ Page
    Then should see FAQ Area Question Four: "What Are The Coffee Storage Conditions?" on FAQ Page
    When click FAQ Area Question Four on FAQ Page
    Then should see FAQ Area Answer Four: "Coffee should be stored in a cool, dry, and dark place, away from heat, moisture, and light, in an airtight container. It is important to avoid exposing coffee to oxygen, as this can cause the coffee to become stale more quickly." on FAQ Page
    Then should see FAQ Area Question Five: "What Do We Need To Do To Place A Bulk Or Corporate Order?" on FAQ Page
    When click FAQ Area Question Five on FAQ Page
    Then should see FAQ Area Answer Five: "To place a bulk or corporate order, please visit our Wholesale Coffee page and fill out the provided form, which will help us gather the necessary information and expedite the ordering process." on FAQ Page
    Then should see FAQ Area Question Six: "If I Make A Return/Cancellation, When Will I Get A Refund?" on FAQ Page
    When click FAQ Area Question Six on FAQ Page
    Then should see FAQ Area Answer Six: "For non-coffee orders, once we receive your returned item and inspect it, we will notify you of the status of your refund. If your return is approved, we will initiate a refund to your credit card (or original method of payment). You can expect to receive the credit within 3-4 business days, depending on your card issuer's policies.For more information on our returns policy, please visit our website's Return and Refund Policy page." on FAQ Page
    Then should see FAQ Area Pagination Left Icon on FAQ Page
    Then should see FAQ Area Pagination Right Icon on FAQ Page
    Then should see FAQ Area Pagination Text: "1" on FAQ Page
    Then should see FAQ Area Pagination Text: "2" on FAQ Page
    When click Second Page on Pagionation on FAQ Page
    Then should see FAQ Area Title: "FAQ" on FAQ Page
    Then should see FAQ Area Question One: "How Can I Cancel My Order? How Can I Cancel My Order?" on FAQ Page
    When click FAQ Area Question One on FAQ Page
    Then should see FAQ Area Answer One: "We understand that sometimes plans change, and you may need to cancel your order. To cancel an order, you must contact us by emailing ‘contact@traumkaffee.com’ at least 12 hours before delivery. Once your shipment is on the way to you, we will not be able to cancel it. For more information on our returns policy, please visit our website's Return and Refund Policy page." on FAQ Page
    Then should see FAQ Area Question Two: "How Can I Return My Order?" on FAQ Page
    When click FAQ Area Question Two on FAQ Page
    Then should see FAQ Area Answer Two: "For non-coffee orders, you have 7 calendar days from the date of the invoice to return an item. To be eligible for a return, your item must be unused, not damaged, and in the same condition that you received it. It must also be in its original packaging and have a receipt or proof of purchase. For more information on our returns policy, please visit our website's Return and Refund Policy page." on FAQ Page
    Then should see FAQ Area Question Three: "My Order Was Delivered Faulty / Damaged; What Should I Do?" on FAQ Page
    When click FAQ Area Question Three on FAQ Page
    Then should see FAQ Area Answer Three: "If your order is delivered faulty or damaged, please contact our customer service team as soon as possible. You can reach us by email at contact@traumkaffee.com or through our website's contact form. Please note that this policy only applies to non-coffee orders; we do not offer returns or refunds for coffee that has been delivered.For more information on our returns policy, please visit our website's Return and Refund Policy page." on FAQ Page


  @HelpWithArea @Navigaiton @Shop
  Scenario: Help With Area Navigation Control
    Given user on the FAQ Page
    When click Help With Area Shop on FAQ Page
    Then should see the Home Page

  @HelpWithArea @Navigaiton @All
  Scenario: Help With Area Navigation Control
    Given user on the FAQ Page
    When click Help With Area My Orders on FAQ Page
    Then should see the Sign In Page

  @HelpWithArea @Navigaiton @All
  Scenario: Help With Area Navigation Control with Sign In
    Given user on the FAQ Page
    Given successfully Sign In with Mail:"faqsTestAutomation1@ronwell.net" and Password:"Ronwell.2023" on Sign In Page
    Given user on the FAQ Page
    When click Help With Area My Orders on FAQ Page
    Then should see Order History Page

  @HelpWithArea @Navigaiton @All
  Scenario: Help With Area Navigation Control
    Given user on the FAQ Page
    When click Help With Area Coffee on FAQ Page
    Then should see the Brew Guides Page

  @HelpWithArea @Navigaiton @All
  Scenario: Help With Area Navigation Control
    Given user on the FAQ Page
    When click Help With Area ContactUs on FAQ Page
    Then should see the Contact Page


