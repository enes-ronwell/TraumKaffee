package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.RefundPolicyPage;
import utils.DriverFactory;

public class RefundPolicyPageDefinitions {
    RefundPolicyPage RefundPolicyPage = new RefundPolicyPage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the Refund Policy Page")
    public void userOnTheRefundPolicyPage() {
        RefundPolicyPage.userOnTheRefundPolicyPage();
    }
    //WHEN's

    //THEN's
    @Then("should see the Refund Policy Page")
    public void shouldSeeTheRefundPolicyPage() {
         RefundPolicyPage.shouldSeeTheRefundPolicyPage();
    }
}
