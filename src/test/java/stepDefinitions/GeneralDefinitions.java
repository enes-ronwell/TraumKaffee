package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.General;
import pages.HomePage;
import utils.DriverFactory;

public class GeneralDefinitions {
    General general = new General(DriverFactory.getDriver());

    //GİVEN's

    //WHEN's
    @When("taps navigate back")
    public void tapsNavigateBack() {
        general.tapsNavigateBack();
    }



    //THEN's
    @Then("should see the Traum Kaffee Facebook Page")
    public void shouldSeeTheTraumKaffeeFacebookPage() {
        general.shouldSeeTheTraumKaffeeFacebookPage("traumkaffee");
    }

    @Then("should see the Traum Kaffee Instagram Page")
    public void shouldSeeTheTraumKaffeeInstagramPage() {
        general.shouldSeeTheTraumKaffeeInstagramPage("traumkaffeeroastery/");
    }

    @Then("should see the Traum Kaffee Twitter Page")
    public void shouldSeeTheTraumKaffeeTwitterPage() {
        general.shouldSeeTheTraumKaffeeTwitterPage("TraumKaffee");
    }

    @Then("should see the Traum Kaffee Tiktok Page")
    public void shouldSeeTheTraumKaffeeTiktokPage() {
        general.shouldSeeTheTraumKaffeeTiktokPage();
    }

    @Then("should see Popup Message: {string}")
    public void shouldSeePopupMessage(String message) {
        String text = general.shouldSeePopupMessage();
        Assert.assertEquals(text, message);
    }

    @Then("should see Popup Close Icon")
    public void shouldSeePopupCloseIcon() {
        general.shouldSeePopupCloseIcon();
    }

    @Then("should see Popup Icon")
    public void shouldSeePopupIcon() {
        general.shouldSeePopupIcon();
    }


}
