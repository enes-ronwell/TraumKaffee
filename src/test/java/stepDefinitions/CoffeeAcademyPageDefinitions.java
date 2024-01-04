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

    @Then("user should see the Coffee Academy Page Title: {string}")
    public void userShouldSeeTheCoffeeAcademyPageTitle(String title) {
        String CoffeeAcademyPageTitle = coffeeAcademyPage.checkCoffeeAcademyPageTitle();
        Assert.assertEquals(CoffeeAcademyPageTitle.replaceAll("\\s+", ""), title.replaceAll("\\s+", ""));
    }

    @Then("should see the Coffee Academy Page")
    public void shouldSeeTheCoffeeAcademyPage() {
        coffeeAcademyPage.checkUrl();
    }
}
