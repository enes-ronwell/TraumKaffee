package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.PrivacyPolicyPage;
import utils.DriverFactory;

public class PrivacyPolicyPageDefinitions {
    PrivacyPolicyPage PrivacyPolicyPage = new PrivacyPolicyPage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the Privacy Policy Page")
    public void userOnThePrivacyPolicyPage() {
        PrivacyPolicyPage.userOnThePrivacyPolicyPage();
    }
    //WHEN's

    //THEN's
    @Then("should see the Privacy Policy Page")
    public void shouldSeeThePrivacyPolicyPage() {
        PrivacyPolicyPage.shouldSeeThePrivacyPolicyPage();
    }
}
