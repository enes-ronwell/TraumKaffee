package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.CoffeeAcademyPage;
import utils.DriverFactory;

public class CoffeeAcademyPageDefinitions {

    CoffeeAcademyPage coffeeAcademyPage = new CoffeeAcademyPage(DriverFactory.getDriver());

    @Given("user on the Coffee Academy Page")
    public void userOnTheCoffeeAcademyPage() {
        coffeeAcademyPage.userOnTheCoffeeAcademyPage();
    }

    @Then("user should see the Coffee Academy Page Title: {string} on Coffee Academy Page")
    public void userShouldSeeTheCoffeeAcademyPageTitle(String title) {
        String CoffeeAcademyPageTitle = coffeeAcademyPage.checkCoffeeAcademyPageTitle();
        Assert.assertEquals(CoffeeAcademyPageTitle.replaceAll("\\s+", ""), title.replaceAll("\\s+", ""));
    }

    @Then("should see the Coffee Academy Page")
    public void shouldSeeTheCoffeeAcademyPage() {
        coffeeAcademyPage.checkUrl();
    }

    @Then("user should see the Courses Area Title: {string} on Coffee Academy Page")
    public void userShouldSeeTheCoursesAreaTitleOnCoffeeAcademyPage(String title) {
        String text = coffeeAcademyPage.userShouldSeeTheCoursesAreaTitle();
        Assert.assertEquals(title, text);
    }

    @Then("user should see the Calendar Area Title: {string} on Coffee Academy Page")
    public void userShouldSeeTheCalendarAreaTitleOnCoffeeAcademyPage(String title) {
        String text = coffeeAcademyPage.userShouldSeeTheCalendarAreaTitle();
        Assert.assertEquals(title, text);
    }
}
