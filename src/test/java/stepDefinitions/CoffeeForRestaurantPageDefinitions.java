package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CoffeeForRestaurantPage;
import utils.DriverFactory;

public class CoffeeForRestaurantPageDefinitions {
    CoffeeForRestaurantPage coffeeForRestaurantPage = new CoffeeForRestaurantPage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the Coffee for Restaurant Page")
    public void userOnTheCoffeeForRestaurantPage() {
        coffeeForRestaurantPage.userOnTheCoffeeForRestaurantPage();
    }

    //WHEN's
    @When("sendkeys Lets Grab a Coffee Area Full Name: {string} on Coffee for Restaurant Page")
    public void sendkeysLetsGrabACoffeeAreaFullNameOnCoffeeForRestaurantPage(String name) {
        coffeeForRestaurantPage.sendkeysLetsGrabACoffeeAreaFullName(name);
    }

    @When("click Lets Grab a Coffee Area Type of Busines on Coffee for Restaurant Page")
    public void clickLetsGrabACoffeeAreaTypeOfBusinesOnCoffeeForRestaurantPage() {
        coffeeForRestaurantPage.clickLetsGrabACoffeeAreaTypeOfBusines();
    }

    @When("click Our Commitment Area Training Button on Coffee for Restaurant Page")
    public void clickOurCommitmentAreaTrainingButtonOnCoffeeForRestaurantPage() {
        coffeeForRestaurantPage.clickOurCommitmentAreaTrainingButton();
    }

    @When("sendkeys Lets Grab a Coffee Area Mail: {string} on Coffee for Restaurant Page")
    public void sendkeysLetsGrabACoffeeAreaMailOnCoffeeForRestaurantPage(String mail) {
        coffeeForRestaurantPage.sendkeysLetsGrabACoffeeAreaMail(mail);
    }

    @When("sendkeys Lets Grab a Coffee Area Contact Number: {string} on Coffee for Restaurant Page")
    public void sendkeysLetsGrabACoffeeAreaContactNumberOnCoffeeForRestaurantPage(String number) {
        coffeeForRestaurantPage.sendkeysLetsGrabACoffeeAreaContactNumber(number);
    }

    @When("sendkeys Lets Grab a Coffee Area Business Name: {string} on Coffee for Restaurant Page")
    public void sendkeysLetsGrabACoffeeAreaBusinessNameOnCoffeeForRestaurantPage(String name) {
        coffeeForRestaurantPage.sendkeysLetsGrabACoffeeAreaBusinessName(name);
    }

    @When("select Lets Grab a Coffee Area Type of Business: {string} on Coffee for Restaurant Page")
    public void selectLetsGrabACoffeeAreaTypeOfBusinessOnCoffeeForRestaurantPage(String type) {
        coffeeForRestaurantPage.selectLetsGrabACoffeeAreaTypeOfBusiness(type);
    }

    @When("sendkeys Lets Grab a Coffee Area Tell us: {string} on Coffee for Restaurant Page")
    public void sendkeysLetsGrabACoffeeAreaTellUsOnCoffeeForRestaurantPage(String tellUs) {
        coffeeForRestaurantPage.sendkeysLetsGrabACoffeeAreaTellUs(tellUs);
    }

    @When("click Lets Grab a Coffee Area Send Button on Coffee for Restaurant Page")
    public void clickLetsGrabACoffeeAreaSendButtonOnCoffeeForRestaurantPage() {
        coffeeForRestaurantPage.clickLetsGrabACoffeeAreaSendButton();
    }

    //THEN's
    @Then("should see the Coffee for Restaurant Page")
    public void shouldSeeTheCoffeeForRestaurantPage() {
        coffeeForRestaurantPage.shouldSeeTheCoffeeForRestaurantPage();
    }

    @Then("should see Coffee For Restaurant Area Title: {string} on Coffee for Restaurant Page")
    public void shouldSeeCoffeeForRestaurantAreaTitleOnCoffeeForRestaurantPage(String title) {
        String text = coffeeForRestaurantPage.shouldSeeCoffeeForRestaurantAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Coffee For Restaurant Area Description: {string} on Coffee for Restaurant Page")
    public void shouldSeeCoffeeForRestaurantAreaDescriptionOnCoffeeForRestaurantPage(String desc) {
        String text = coffeeForRestaurantPage.shouldSeeCoffeeForRestaurantAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Coffee For Restaurant Area Image on Coffee for Restaurant Page")
    public void shouldSeeCoffeeForRestaurantAreaImageOnCoffeeForRestaurantPage() {
        coffeeForRestaurantPage.shouldSeeCoffeeForRestaurantAreaImage();
    }

    @Then("should see Description Area Description: {string} on Coffee for Restaurant Page")
    public void shouldSeeDescriptionAreaDescriptionOnCoffeeForRestaurantPage(String desc) {
        String text = coffeeForRestaurantPage.shouldSeeDescriptionAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Why Partner Area Title: {string} on Coffee for Restaurant Page")
    public void shouldSeeWhyPartnerAreaTitleOnCoffeeForRestaurantPage(String title) {
        String text = coffeeForRestaurantPage.shouldSeeWhyPartnerAreaTitle();
        Assert.assertEquals(text.replaceAll("\\s+", ""), title.replaceAll("\\s+", ""));
    }

    @Then("should see Why Partner Area Description: {string} on Coffee for Restaurant Page")
    public void shouldSeeWhyPartnerAreaDescriptionOnCoffeeForRestaurantPage(String desc) {
        String text = coffeeForRestaurantPage.shouldSeeWhyPartnerAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Why Partner Area Image on Coffee for Restaurant Page")
    public void shouldSeeWhyPartnerAreaImageOnCoffeeForRestaurantPage() {
        coffeeForRestaurantPage.shouldSeeWhyPartnerAreaImage();
    }

    @Then("should see Our Commitment Area Title: {string} on Coffee for Restaurant Page")
    public void shouldSeeOurCommitmentAreaTitleOnCoffeeForRestaurantPage(String title) {
        String text = coffeeForRestaurantPage.shouldSeeOurCommitmentAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Our Commitment Area Description: {string} on Coffee for Restaurant Page")
    public void shouldSeeOurCommitmentAreaDescriptionOnCoffeeForRestaurantPage(String desc) {
        String text = coffeeForRestaurantPage.shouldSeeOurCommitmentAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));

    }

    @Then("should see Our Commitment Area Training Button: {string} on Coffee for Restaurant Page")
    public void shouldSeeOurCommitmentAreaTrainingButtonOnCoffeeForRestaurantPage(String training) {
        String text = coffeeForRestaurantPage.shouldSeeOurCommitmentAreaTrainingButton();
        Assert.assertEquals(text, training);
    }

    @Then("should see Our Commitment Area Image on Coffee for Restaurant Page")
    public void shouldSeeOurCommitmentAreaImageOnCoffeeForRestaurantPage() {
        coffeeForRestaurantPage.shouldSeeOurCommitmentAreaImage();
    }

    @Then("should see Why Settle Area Title: {string} on Coffee for Restaurant Page")
    public void shouldSeeWhySettleAreaTitleOnCoffeeForRestaurantPage(String title) {
        String text = coffeeForRestaurantPage.shouldSeeWhySettleAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Why Settle Area Description: {string} on Coffee for Restaurant Page")
    public void shouldSeeWhySettleAreaDescriptionOnCoffeeForRestaurantPage(String desc) {
        String text = coffeeForRestaurantPage.shouldSeeWhySettleAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Why Settle Area Training Button: {string} on Coffee for Restaurant Page")
    public void shouldSeeWhySettleAreaTrainingButtonOnCoffeeForRestaurantPage(String training) {
        String text = coffeeForRestaurantPage.shouldSeeWhySettleAreaTrainingButton();
        Assert.assertEquals(text, training);
    }

    @Then("should see Why Settle Area Image on Coffee for Restaurant Page")
    public void shouldSeeWhySettleAreaImageOnCoffeeForRestaurantPage() {
        coffeeForRestaurantPage.shouldSeeWhySettleAreaImage();
    }

    @Then("should see Lets Grab a Coffee Area Title: {string} on Coffee for Restaurant Page")
    public void shouldSeeLetsGrabACoffeeAreaTitleOnCoffeeForRestaurantPage(String title) {
        String text = coffeeForRestaurantPage.shouldSeeLetsGrabACoffeeAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Lets Grab a Coffee Area Description: {string} on Coffee for Restaurant Page")
    public void shouldSeeLetsGrabACoffeeAreaDescriptionOnCoffeeForRestaurantPage(String desc) {
        String text = coffeeForRestaurantPage.shouldSeeLetsGrabACoffeeAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Lets Grab a Coffee Area Full Name: {string} on Coffee for Restaurant Page")
    public void shouldSeeLetsGrabACoffeeAreaFullNameOnCoffeeForRestaurantPage(String name) {
        String text = coffeeForRestaurantPage.shouldSeeLetsGrabACoffeeAreaFullName();
        Assert.assertEquals(text, name);
    }

    @Then("should see Lets Grab a Coffee Area Email: {string} on Coffee for Restaurant Page")
    public void shouldSeeLetsGrabACoffeeAreaEmailOnCoffeeForRestaurantPage(String mail) {
        String text = coffeeForRestaurantPage.shouldSeeLetsGrabACoffeeAreaEmail();
        Assert.assertEquals(text, mail);
    }

    @Then("should see Lets Grab a Coffee Area Contact Number: {string} on Coffee for Restaurant Page")
    public void shouldSeeLetsGrabACoffeeAreaContactNumberOnCoffeeForRestaurantPage(String number) {
        String text = coffeeForRestaurantPage.shouldSeeLetsGrabACoffeeAreaContactNumber();
        Assert.assertEquals(text, number);
    }

    @Then("should see Lets Grab a Coffee Area Business Name: {string} on Coffee for Restaurant Page")
    public void shouldSeeLetsGrabACoffeeAreaBusinessNameOnCoffeeForRestaurantPage(String name) {
        String text = coffeeForRestaurantPage.shouldSeeLetsGrabACoffeeAreaBusinessName();
        Assert.assertEquals(text, name);
    }

    @Then("should see Lets Grab a Coffee Area Type of Business: {string} on Coffee for Restaurant Page")
    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOnCoffeeForRestaurantPage(String type) {
        String text = coffeeForRestaurantPage.shouldSeeLetsGrabACoffeeAreaTypeOfBusiness();
        Assert.assertEquals(text, type);
    }

    @Then("should see Lets Grab a Coffee Area Type of Business Option: {string} on Coffee for Restaurant Page")
    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOptionOnCoffeeForRestaurantPage(String type) {
        coffeeForRestaurantPage.shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOption(type);
    }

    @Then("should see Lets Grab a Coffee Area Tell us: {string} on Coffee for Restaurant Page")
    public void shouldSeeLetsGrabACoffeeAreaTellUsOnCoffeeForRestaurantPage(String tellUs) {
        String text = coffeeForRestaurantPage.shouldSeeLetsGrabACoffeeAreaTellUs();
        Assert.assertEquals(text.replaceAll("\\s+", ""), tellUs.replaceAll("\\s+", ""));
    }

    @Then("should see Lets Grab a Coffee Area Send Button: {string} on Coffee for Restaurant Page")
    public void shouldSeeLetsGrabACoffeeAreaSendButtonOnCoffeeForRestaurantPage(String button) {
        String text = coffeeForRestaurantPage.shouldSeeLetsGrabACoffeeAreaSendButton();
        Assert.assertEquals(text, button);
    }

    @Then("should see Lets Grab a Coffee Area False Email Message: {string} on Coffee for Restaurant Page")
    public void shouldSeeLetsGrabACoffeeAreaFalseEmailMessageOnCoffeeForRestaurantPage(String message) {
        String text = coffeeForRestaurantPage.shouldSeeLetsGrabACoffeeAreaFalseEmailMessage();
        Assert.assertEquals(text, message);
    }

    @Then("should see Lets Grab a Coffee Area Full Name Error: {string} on Coffee for Restaurant Page")
    public void shouldSeeLetsGrabACoffeeAreaFullNameErrorOnBecomeOurPartnerPage(String text) {
        String expText = coffeeForRestaurantPage.shouldSeeLetsGrabACoffeeAreaFullNameError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Email Error: {string} on Coffee for Restaurant Page")
    public void shouldSeeLetsGrabACoffeeAreaEmailErrorOnBecomeOurPartnerPage(String text) {
        String expText = coffeeForRestaurantPage.shouldSeeLetsGrabACoffeeAreaEmailError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Contact Number Error: {string} on Coffee for Restaurant Page")
    public void shouldSeeLetsGrabACoffeeAreaContactNumberErrorOnBecomeOurPartnerPage(String text) {
        String expText = coffeeForRestaurantPage.shouldSeeLetsGrabACoffeeAreaContactNumberError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Business Name Error: {string} on Coffee for Restaurant Page")
    public void shouldSeeLetsGrabACoffeeAreaBusinessNameErrorOnBecomeOurPartnerPage(String text) {
        String expText = coffeeForRestaurantPage.shouldSeeLetsGrabACoffeeAreaBusinessNameError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Type of Business Error: {string} on Coffee for Restaurant Page")
    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessErrorOnBecomeOurPartnerPage(String text) {
        String expText = coffeeForRestaurantPage.shouldSeeLetsGrabACoffeeAreaTypeOfBusinessError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Tell us Error: {string} on Coffee for Restaurant Page")
    public void shouldSeeLetsGrabACoffeeAreaTellUsErrorOnBecomeOurPartnerPage(String text) {
        String expText = coffeeForRestaurantPage.shouldSeeLetsGrabACoffeeAreaTellUsError();
        Assert.assertEquals(expText, text);
    }
}
