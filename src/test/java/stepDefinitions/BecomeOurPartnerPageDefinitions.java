package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BecomeOurPartnerPage;
import utils.DriverFactory;

public class BecomeOurPartnerPageDefinitions {
    BecomeOurPartnerPage BecomeOurPartner = new BecomeOurPartnerPage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the Become Our Partner Page")
    public void userOnTheBecomeOurPartnerPage() {
        BecomeOurPartner.userOnTheBecomeOurPartnerPage();
    }

    //WHEN's
    @When("click Lets Grab a Coffee Area Type of Busines on Become Our Partner Page")
    public void clickLetsGrabACoffeeAreaTypeOfBusinesOnBecomeOurPartnerPage() {
        BecomeOurPartner.clickLetsGrabACoffeeAreaTypeOfBusines();
    }

    @When("sendkeys Lets Grab a Coffee Area Full Name: {string} on Become Our Partner Page")
    public void sendkeysLetsGrabACoffeeAreaFullNameOnBecomeOurPartnerPage(String name) {
        BecomeOurPartner.sendkeysLetsGrabACoffeeAreaFullName(name);
    }

    @When("sendkeys Lets Grab a Coffee Area Mail: {string} on Become Our Partner Page")
    public void sendkeysLetsGrabACoffeeAreaMailOnBecomeOurPartnerPage(String mail) {
        BecomeOurPartner.sendkeysLetsGrabACoffeeAreaMail(mail);
    }

    @When("sendkeys Lets Grab a Coffee Area Contact Number: {string} on Become Our Partner Page")
    public void sendkeysLetsGrabACoffeeAreaContactNumberOnBecomeOurPartnerPage(String number) {
        BecomeOurPartner.sendkeysLetsGrabACoffeeAreaContactNumber(number);
    }

    @When("sendkeys Lets Grab a Coffee Area Business Name: {string} on Become Our Partner Page")
    public void sendkeysLetsGrabACoffeeAreaBusinessNameOnBecomeOurPartnerPage(String business) {
        BecomeOurPartner.sendkeysLetsGrabACoffeeAreaBusinessName(business);
    }

    @When("select Lets Grab a Coffee Area Type of Business: {string} on Become Our Partner Page")
    public void selectLetsGrabACoffeeAreaOtherOnBecomeOurPartnerPage(String type) {
        BecomeOurPartner.selectLetsGrabACoffeeAreaOther(type);
    }

    @When("sendkeys Lets Grab a Coffee Area Tell us: {string} on Become Our Partner Page")
    public void sendkeysLetsGrabACoffeeAreaTellUsOnBecomeOurPartnerPage(String tellUs) {
        BecomeOurPartner.sendkeysLetsGrabACoffeeAreaTellUs(tellUs);
    }

    @When("click Lets Grab a Coffee Area Send Button on Become Our Partner Page")
    public void clickLetsGrabACoffeeAreaSendButtonOnBecomeOurPartnerPage() {
        BecomeOurPartner.clickLetsGrabACoffeeAreaSendButton();
    }

    //THEN's
    @Then("should see Become Our Partner Area Title: {string} on Become Our Partner Page")
    public void shouldSeeBecomeOurPartnerAreaTitleOnBecomeOurPartnerPage(String title) {
        String text = BecomeOurPartner.shouldSeeBecomeOurPartnerAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Become Our Partner Area Description: {string} on Become Our Partner Page")
    public void shouldSeeBecomeOurPartnerAreaDescriptionOnBecomeOurPartnerPage(String desc) {
        String text = BecomeOurPartner.shouldSeeBecomeOurPartnerAreaDescription();
        Assert.assertEquals(text, desc);
    }

    @Then("should see Become Our Partner Area Image on Become Our Partner Page")
    public void shouldSeeBecomeOurPartnerAreaImageOnBecomeOurPartnerPage() {
        BecomeOurPartner.shouldSeeBecomeOurPartnerAreaImage();
    }

    @Then("should see Lets Grab a Coffee Area Title: {string} on Become Our Partner Page")
    public void shouldSeeLetsGrabACoffeeAreaTitleOnBecomeOurPartnerPage(String title) {
        String text = BecomeOurPartner.shouldSeeLetsGrabACoffeeAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Lets Grab a Coffee Area Description: {string} on Become Our Partner Page")
    public void shouldSeeLetsGrabACoffeeAreaDescriptionOnBecomeOurPartnerPage(String desc) {
        String text = BecomeOurPartner.shouldSeeLetsGrabACoffeeAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Lets Grab a Coffee Area Full Name: {string} on Become Our Partner Page")
    public void shouldSeeLetsGrabACoffeeAreaFullNameOnBecomeOurPartnerPage(String name) {
        String text = BecomeOurPartner.shouldSeeLetsGrabACoffeeAreaFullName();
        Assert.assertEquals(text, name);
    }

    @Then("should see Lets Grab a Coffee Area Email: {string} on Become Our Partner Page")
    public void shouldSeeLetsGrabACoffeeAreaEmailOnBecomeOurPartnerPage(String mail) {
        String text = BecomeOurPartner.shouldSeeLetsGrabACoffeeAreaEmail();
        Assert.assertEquals(text, mail);
    }

    @Then("should see Lets Grab a Coffee Area Contact Number: {string} on Become Our Partner Page")
    public void shouldSeeLetsGrabACoffeeAreaContactNumberOnBecomeOurPartnerPage(String number) {
        String text = BecomeOurPartner.shouldSeeLetsGrabACoffeeAreaContactNumber();
        Assert.assertEquals(text, number);
    }

    @Then("should see Lets Grab a Coffee Area Business Name: {string} on Become Our Partner Page")
    public void shouldSeeLetsGrabACoffeeAreaBusinessNameOnBecomeOurPartnerPage(String business) {
        String text = BecomeOurPartner.shouldSeeLetsGrabACoffeeAreaBusinessName();
        Assert.assertEquals(text, business);
    }

    @Then("should see Lets Grab a Coffee Area Type of Business: {string} on Become Our Partner Page")
    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOnBecomeOurPartnerPage(String type) {
        String text = BecomeOurPartner.shouldSeeLetsGrabACoffeeAreaTypeOfBusiness();
        Assert.assertEquals(text, type);
    }

    @Then("should see Lets Grab a Coffee Area Type of Business Option: {string} on Become Our Partner Page")
    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOptionOnBecomeOurPartnerPage(String option) {
        BecomeOurPartner.shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOption(option);
    }

    @Then("should see Lets Grab a Coffee Area Tell us: {string} on Become Our Partner Page")
    public void shouldSeeLetsGrabACoffeeAreaTellUsOnBecomeOurPartnerPage(String tellus) {
        String text = BecomeOurPartner.shouldSeeLetsGrabACoffeeAreaTellUs();
        Assert.assertEquals(text.replaceAll("\\s+", ""), tellus.replaceAll("\\s+", ""));
    }

    @Then("should see Lets Grab a Coffee Area Send Button: {string} on Become Our Partner Page")
    public void shouldSeeLetsGrabACoffeeAreaSendButtonOnBecomeOurPartnerPage(String button) {
        String text = BecomeOurPartner.shouldSeeLetsGrabACoffeeAreaSendButton();
        Assert.assertEquals(text, button);
    }

    @Then("should see Lets Grab a Coffee Area False Email Message: {string} on Become Our Partner Page")
    public void shouldSeeLetsGrabACoffeeAreaFalseEmailMessageOnBecomeOurPartnerPage(String falseEMail) {
        String text = BecomeOurPartner.shouldSeeLetsGrabACoffeeAreaFalseEmailMessage();
        Assert.assertEquals(text, falseEMail);
    }

    @Then("should see Lets Grab a Coffee Area Full Name Error: {string} on Become Our Partner Page")
    public void shouldSeeLetsGrabACoffeeAreaFullNameErrorOnBecomeOurPartnerPage(String text) {
        String expText = BecomeOurPartner.shouldSeeLetsGrabACoffeeAreaFullNameError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Email Error: {string} on Become Our Partner Page")
    public void shouldSeeLetsGrabACoffeeAreaEmailErrorOnBecomeOurPartnerPage(String text) {
        String expText = BecomeOurPartner.shouldSeeLetsGrabACoffeeAreaEmailError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Contact Number Error: {string} on Become Our Partner Page")
    public void shouldSeeLetsGrabACoffeeAreaContactNumberErrorOnBecomeOurPartnerPage(String text) {
        String expText = BecomeOurPartner.shouldSeeLetsGrabACoffeeAreaContactNumberError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Business Name Error: {string} on Become Our Partner Page")
    public void shouldSeeLetsGrabACoffeeAreaBusinessNameErrorOnBecomeOurPartnerPage(String text) {
        String expText = BecomeOurPartner.shouldSeeLetsGrabACoffeeAreaBusinessNameError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Type of Business Error: {string} on Become Our Partner Page")
    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessErrorOnBecomeOurPartnerPage(String text) {
        String expText = BecomeOurPartner.shouldSeeLetsGrabACoffeeAreaTypeOfBusinessError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Tell us Error: {string} on Become Our Partner Page")
    public void shouldSeeLetsGrabACoffeeAreaTellUsErrorOnBecomeOurPartnerPage(String text) {
        String expText = BecomeOurPartner.shouldSeeLetsGrabACoffeeAreaTellUsError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see the Become Our Partner Page")
    public void shouldSeeTheBecomeOurPartnerPage() {
        BecomeOurPartner.checkUrl();
    }
}
