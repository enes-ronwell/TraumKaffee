package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.TermsConditionsPage;
import utils.DriverFactory;

public class TermsConditionsPageDefinitions {
    TermsConditionsPage TermsConditionsPage = new TermsConditionsPage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the Terms Conditions Page")
    public void userOnTheTermsConditionsPage() {
        TermsConditionsPage.userOnTheTermsConditionsPage();
    }
    //WHEN's

    //THEN's
    @Then("should see the Terms Conditions Page")
    public void shouldSeeTheTermsConditionsPage() {
        TermsConditionsPage.shouldSeeTheTermsConditionsPage();
    }
}
