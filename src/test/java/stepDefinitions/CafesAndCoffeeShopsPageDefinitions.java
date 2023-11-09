package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CafesAndCoffeeShopsPage;
import utils.DriverFactory;

public class CafesAndCoffeeShopsPageDefinitions {
    CafesAndCoffeeShopsPage CafesAndCoffeeShopsPage = new CafesAndCoffeeShopsPage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the Cafes and Coffee Shops Page")
    public void userOnTheCafesAndCoffeeShopsPage() {
        CafesAndCoffeeShopsPage.userOnTheCafesAndCoffeeShopsPage();
    }

    //WHEN's
    @When("click Lets Grab a Coffee Area Type of Busines on Cafes and Coffee Shops Page")
    public void clickLetsGrabACoffeeAreaTypeOfBusinesOnCafesAndCoffeeShopsPage() {
        CafesAndCoffeeShopsPage.clickLetsGrabACoffeeAreaTypeOfBusines();
    }

    @When("click The Art Of Making Area Training Button on Cafes and Coffee Shops Page")
    public void clickTheArtOfMakingAreaTrainingButtonOnCafesAndCoffeeShopsPage() {
        CafesAndCoffeeShopsPage.clickTheArtOfMakingAreaTrainingButton();
    }

    @When("sendkeys Lets Grab a Coffee Area Full Name: {string} on Cafes and Coffee Shops Page")
    public void sendkeysLetsGrabACoffeeAreaFullNameOnCafesAndCoffeeShopsPage(String name) {
        CafesAndCoffeeShopsPage.sendkeysLetsGrabACoffeeAreaFullName(name);
    }

    @When("sendkeys Lets Grab a Coffee Area Mail: {string} on Cafes and Coffee Shops Page")
    public void sendkeysLetsGrabACoffeeAreaMailOnCafesAndCoffeeShopsPage(String mail) {
        CafesAndCoffeeShopsPage.sendkeysLetsGrabACoffeeAreaMail(mail);
    }

    @When("sendkeys Lets Grab a Coffee Area Contact Number: {string} on Cafes and Coffee Shops Page")
    public void sendkeysLetsGrabACoffeeAreaContactNumberOnCafesAndCoffeeShopsPage(String number) {
        CafesAndCoffeeShopsPage.sendkeysLetsGrabACoffeeAreaContactNumber(number);
    }

    @When("sendkeys Lets Grab a Coffee Area Business Name: {string} on Cafes and Coffee Shops Page")
    public void sendkeysLetsGrabACoffeeAreaBusinessNameOnCafesAndCoffeeShopsPage(String name) {
        CafesAndCoffeeShopsPage.sendkeysLetsGrabACoffeeAreaBusinessName(name);
    }

    @When("select Lets Grab a Coffee Area Type of Business: {string} on Cafes and Coffee Shops Page")
    public void selectLetsGrabACoffeeAreaTypeOfBusinessOnCafesAndCoffeeShopsPage(String type) {
        CafesAndCoffeeShopsPage.selectLetsGrabACoffeeAreaTypeOfBusiness(type);

    }

    @When("sendkeys Lets Grab a Coffee Area Tell us: {string} on Cafes and Coffee Shops Page")
    public void sendkeysLetsGrabACoffeeAreaTellUsOnCafesAndCoffeeShopsPage(String tellUs) {
        CafesAndCoffeeShopsPage.sendkeysLetsGrabACoffeeAreaTellUs(tellUs);
    }

    @When("click Lets Grab a Coffee Area Send Button on Cafes and Coffee Shops Page")
    public void clickLetsGrabACoffeeAreaSendButtonOnCafesAndCoffeeShopsPage() {
        CafesAndCoffeeShopsPage.clickLetsGrabACoffeeAreaSendButton();
    }

    //THEN's
    @Then("should see the Cafes and Coffee Shops Page")
    public void shouldSeeTheCafesAndCoffeeShopsPage() {
        CafesAndCoffeeShopsPage.shouldSeeTheCafesAndCoffeeShopsPage();
    }

    @Then("should see Cafes and Coffee Shops Area Title: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeCafesAndCoffeeShopsAreaTitleOnCafesAndCoffeeShopsPage(String title) {
        String text = CafesAndCoffeeShopsPage.shouldSeeCafesAndCoffeeShopsAreaTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Cafes and Coffee Shops Area Description: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeCafesAndCoffeeShopsAreaDescriptionOnCafesAndCoffeeShopsPage(String desc) {
        String text = CafesAndCoffeeShopsPage.shouldSeeCafesAndCoffeeShopsAreaDescription();
        Assert.assertEquals(text,desc);
    }

    @Then("should see Cafes and Coffee Shops Area Image on Cafes and Coffee Shops Page")
    public void shouldSeeCafesAndCoffeeShopsAreaImageOnCafesAndCoffeeShopsPage() {
        CafesAndCoffeeShopsPage.shouldSeeCafesAndCoffeeShopsAreaImage();


    }

    @Then("should see Description Area Description: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeDescriptionAreaDescriptionOnCafesAndCoffeeShopsPage(String desc) {
        String text = CafesAndCoffeeShopsPage.shouldSeeDescriptionAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""),desc.replaceAll("\\s+",""));
    }

    @Then("should see Are You Brewing Up Area Title: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeAreYouBrewingUpAreaTitleOnCafesAndCoffeeShopsPage(String title) {
        String text = CafesAndCoffeeShopsPage.shouldSeeAreYouBrewingUpAreaTitle();
        Assert.assertEquals(text.replaceAll("\\s+",""),title.replaceAll("\\s+",""));
    }

    @Then("should see Are You Brewing Up Area Description: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeAreYouBrewingUpAreaDescriptionOnCafesAndCoffeeShopsPage(String desc) {
        String text = CafesAndCoffeeShopsPage.shouldSeeAreYouBrewingUpAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""),desc.replaceAll("\\s+",""));
    }

    @Then("should see Are You Brewing Up Area Image on Cafes and Coffee Shops Page")
    public void shouldSeeAreYouBrewingUpAreaImageOnCafesAndCoffeeShopsPage() {
        CafesAndCoffeeShopsPage.shouldSeeAreYouBrewingUpAreaImage();
    }

    @Then("should see The Art Of Making Area Title: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeTheArtOfMakingAreaTitleOnCafesAndCoffeeShopsPage(String title) {
        String text = CafesAndCoffeeShopsPage.shouldSeeTheArtOfMakingAreaTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see The Art Of Making Area Description: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeTheArtOfMakingAreaDescriptionOnCafesAndCoffeeShopsPage(String desc) {
        String text = CafesAndCoffeeShopsPage.shouldSeeTheArtOfMakingAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""),desc.replaceAll("\\s+",""));
    }

    @Then("should see The Art Of Making Area Image on Cafes and Coffee Shops Page")
    public void shouldSeeTheArtOfMakingAreaImageOnCafesAndCoffeeShopsPage() {
        CafesAndCoffeeShopsPage.shouldSeeTheArtOfMakingAreaImage();
    }

    @Then("should see The Art Of Making Area Training Button: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeTheArtOfMakingAreaTrainingButtonOnCafesAndCoffeeShopsPage(String button) {
        String text = CafesAndCoffeeShopsPage.shouldSeeTheArtOfMakingAreaTrainingButton();
        Assert.assertEquals(text,button);
    }

    @Then("should see Stand Out Area Title: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeStandOutAreaTitleOnCafesAndCoffeeShopsPage(String title) {
        String text = CafesAndCoffeeShopsPage.shouldSeeStandOutAreaTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Stand Out Area Description: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeStandOutAreaDescriptionOnCafesAndCoffeeShopsPage(String desc) {
        String text = CafesAndCoffeeShopsPage.shouldSeeStandOutAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""),desc.replaceAll("\\s+",""));
    }

    @Then("should see Stand Out Area Image on Cafes and Coffee Shops Page")
    public void shouldSeeStandOutAreaImageOnCafesAndCoffeeShopsPage() {
        CafesAndCoffeeShopsPage.shouldSeeStandOutAreaImage();
    }

    @Then("should see Lets Grab a Coffee Area Title: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeLetsGrabACoffeeAreaTitleOnCafesAndCoffeeShopsPage(String title) {
        String text = CafesAndCoffeeShopsPage.shouldSeeLetsGrabACoffeeAreaTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Lets Grab a Coffee Area Description: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeLetsGrabACoffeeAreaDescriptionOnCafesAndCoffeeShopsPage(String desc) {
        String text = CafesAndCoffeeShopsPage.shouldSeeLetsGrabACoffeeAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""),desc.replaceAll("\\s+",""));
    }

    @Then("should see Lets Grab a Coffee Area Full Name: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeLetsGrabACoffeeAreaFullNameOnCafesAndCoffeeShopsPage(String name) {
        String text = CafesAndCoffeeShopsPage.shouldSeeLetsGrabACoffeeAreaFullName();
        Assert.assertEquals(text,name);
    }

    @Then("should see Lets Grab a Coffee Area Email: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeLetsGrabACoffeeAreaEmailOnCafesAndCoffeeShopsPage(String mail) {
        String text = CafesAndCoffeeShopsPage.shouldSeeLetsGrabACoffeeAreaEmail();
        Assert.assertEquals(text,mail);
    }

    @Then("should see Lets Grab a Coffee Area Contact Number: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeLetsGrabACoffeeAreaContactNumberOnCafesAndCoffeeShopsPage(String number) {
        String text = CafesAndCoffeeShopsPage.shouldSeeLetsGrabACoffeeAreaContactNumber();
        Assert.assertEquals(text,number);
    }

    @Then("should see Lets Grab a Coffee Area Business Name: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeLetsGrabACoffeeAreaBusinessNameOnCafesAndCoffeeShopsPage(String name) {
        String text = CafesAndCoffeeShopsPage.shouldSeeLetsGrabACoffeeAreaBusinessName();
        Assert.assertEquals(text,name);
    }

    @Then("should see Lets Grab a Coffee Area Type of Business: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOnCafesAndCoffeeShopsPage(String type) {
        String text = CafesAndCoffeeShopsPage.shouldSeeLetsGrabACoffeeAreaTypeOfBusiness();
        Assert.assertEquals(text,type);
    }

    @Then("should see Lets Grab a Coffee Area Type of Business Option: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOptionOnCafesAndCoffeeShopsPage(String option) {
       CafesAndCoffeeShopsPage.shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOption(option);
    }

    @Then("should see Lets Grab a Coffee Area Tell us: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeLetsGrabACoffeeAreaTellUsOnCafesAndCoffeeShopsPage(String tellUs) {
        String text = CafesAndCoffeeShopsPage.shouldSeeLetsGrabACoffeeAreaTellUs();
        Assert.assertEquals(text.replaceAll("\\s+",""),tellUs.replaceAll("\\s+",""));
    }

    @Then("should see Lets Grab a Coffee Area Send Button: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeLetsGrabACoffeeAreaSendButtonOnCafesAndCoffeeShopsPage(String button) {
        String text = CafesAndCoffeeShopsPage.shouldSeeLetsGrabACoffeeAreaSendButton();
        Assert.assertEquals(text,button);
    }

    @Then("should see Lets Grab a Coffee Area False Email Message: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeLetsGrabACoffeeAreaFalseEmailMessageOnCafesAndCoffeeShopsPage(String message) {
        String text = CafesAndCoffeeShopsPage.shouldSeeLetsGrabACoffeeAreaFalseEmailMessage();
        Assert.assertEquals(text,message);
    }

    @Then("should see Lets Grab a Coffee Area Full Name Error: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeLetsGrabACoffeeAreaFullNameErrorOnBecomeOurPartnerPage(String text) {
        String expText = CafesAndCoffeeShopsPage.shouldSeeLetsGrabACoffeeAreaFullNameError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Email Error: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeLetsGrabACoffeeAreaEmailErrorOnBecomeOurPartnerPage(String text) {
        String expText = CafesAndCoffeeShopsPage.shouldSeeLetsGrabACoffeeAreaEmailError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Contact Number Error: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeLetsGrabACoffeeAreaContactNumberErrorOnBecomeOurPartnerPage(String text) {
        String expText = CafesAndCoffeeShopsPage.shouldSeeLetsGrabACoffeeAreaContactNumberError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Business Name Error: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeLetsGrabACoffeeAreaBusinessNameErrorOnBecomeOurPartnerPage(String text) {
        String expText = CafesAndCoffeeShopsPage.shouldSeeLetsGrabACoffeeAreaBusinessNameError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Type of Business Error: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessErrorOnBecomeOurPartnerPage(String text) {
        String expText = CafesAndCoffeeShopsPage.shouldSeeLetsGrabACoffeeAreaTypeOfBusinessError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Tell us Error: {string} on Cafes and Coffee Shops Page")
    public void shouldSeeLetsGrabACoffeeAreaTellUsErrorOnBecomeOurPartnerPage(String text) {
        String expText = CafesAndCoffeeShopsPage.shouldSeeLetsGrabACoffeeAreaTellUsError();
        Assert.assertEquals(expText, text);
    }
}
