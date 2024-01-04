@CoffeeAcademyPage
Feature: Coffee Academy Page

  @TextAndComponent
  Scenario: Coffee Academy Page Text And Component Control
    Given user on the Coffee Academy Page
    Then user should see the Coffee Academy Page Title: "TRAUM COFFEE ACADEMY" on Coffee Academy Page
    Then user should see the Courses Area Title: "SPECIALTY COFFEE ASSOCIATION (SCA) COURSES" on Coffee Academy Page
    Then user should see the Calendar Area Title: "TRAUM COFFEE ACADEMY CALENDAR" on Coffee Academy Page

