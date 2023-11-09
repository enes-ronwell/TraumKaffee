package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.TrainingPage;
import utils.DriverFactory;

public class TrainingPageDefinitions {
    TrainingPage TrainingPage = new TrainingPage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the Training Page")
    public void userOnTheTrainingPage() {
        TrainingPage.userOnTheTrainingPage();
    }

    //WHEN's
    @When("click Lets Grab a Coffee Area Type of Busines on Training Page")
    public void clickLetsGrabACoffeeAreaTypeOfBusinesOnTrainingPage() {
        TrainingPage.clickLetsGrabACoffeeAreaTypeOfBusines();
    }

    @When("sendkeys Lets Grab a Coffee Area Full Name: {string} on Training Page")
    public void sendkeysLetsGrabACoffeeAreaFullNameOnTrainingPage(String name) {
        TrainingPage.sendkeysLetsGrabACoffeeAreaFullName(name);
    }

    @When("sendkeys Lets Grab a Coffee Area Mail: {string} on Training Page")
    public void sendkeysLetsGrabACoffeeAreaMailOnTrainingPage(String mail) {
        TrainingPage.sendkeysLetsGrabACoffeeAreaMail(mail);
    }

    @When("sendkeys Lets Grab a Coffee Area Contact Number: {string} on Training Page")
    public void sendkeysLetsGrabACoffeeAreaContactNumberOnTrainingPage(String number) {
        TrainingPage.sendkeysLetsGrabACoffeeAreaContactNumber(number);
    }

    @When("sendkeys Lets Grab a Coffee Area Business Name: {string} on Training Page")
    public void sendkeysLetsGrabACoffeeAreaBusinessNameOnTrainingPage(String name) {
        TrainingPage.sendkeysLetsGrabACoffeeAreaBusinessName(name);
    }

    @When("select Lets Grab a Coffee Area Type of Business: {string} on Training Page")
    public void selectLetsGrabACoffeeAreaTypeOfBusinessOnTrainingPage(String type) {
        TrainingPage.selectLetsGrabACoffeeAreaTypeOfBusiness(type);
    }

    @When("sendkeys Lets Grab a Coffee Area Tell us: {string} on Training Page")
    public void sendkeysLetsGrabACoffeeAreaTellUsOnTrainingPage(String tellUs) {
        TrainingPage.sendkeysLetsGrabACoffeeAreaTellUs(tellUs);
    }

    @When("click Lets Grab a Coffee Area Send Button on Training Page")
    public void clickLetsGrabACoffeeAreaSendButtonOnTrainingPage() {
        TrainingPage.clickLetsGrabACoffeeAreaSendButton();
    }


    //THEN's
    @Then("should see the Training Page")
    public void shouldSeeTheTrainingPage() {
        TrainingPage.shouldSeeTheTrainingPage();
    }

    @Then("should see Training Area Title: {string} on Training Page")
    public void shouldSeeTrainingAreaTitleOnTrainingPage(String title) {
        String text = TrainingPage.shouldSeeTrainingAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Training Area Description: {string} on Training Page")
    public void shouldSeeTrainingAreaDescriptionOnTrainingPage(String desc) {
        String text = TrainingPage.shouldSeeTrainingAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Training Area Image on Training Page")
    public void shouldSeeTrainingAreaImageOnTrainingPage() {
        TrainingPage.shouldSeeTrainingAreaImage();
    }

    @Then("should see Description Area Description: {string} on Training Page")
    public void shouldSeeDescriptionAreaDescriptionOnTrainingPage(String desc) {
        String text = TrainingPage.shouldSeeDescriptionAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Coffee Training Area Title: {string} on Training Page")
    public void shouldSeeCoffeeTrainingAreaTitleOnTrainingPage(String title) {
        String text = TrainingPage.shouldSeeCoffeeTrainingAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Coffee Training Area Description: {string} on Training Page")
    public void shouldSeeCoffeeTrainingAreaDescriptionOnTrainingPage(String desc) {
        String text = TrainingPage.shouldSeeCoffeeTrainingAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Coffee Training Area Image on Training Page")
    public void shouldSeeCoffeeTrainingAreaImageOnTrainingPage() {
        TrainingPage.shouldSeeCoffeeTrainingAreaImage();
    }

    @Then("should see Machine Training Area Title: {string} on Training Page")
    public void shouldSeeMachineTrainingAreaTitleOnTrainingPage(String title) {
        String text = TrainingPage.shouldSeeMachineTrainingAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Machine Training Area Description: {string} on Training Page")
    public void shouldSeeMachineTrainingAreaDescriptionOnTrainingPage(String desc) {
        String text = TrainingPage.shouldSeeMachineTrainingAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Machine Training Area Image on Training Page")
    public void shouldSeeMachineTrainingAreaImageOnTrainingPage() {
        TrainingPage.shouldSeeMachineTrainingAreaImage();
    }

    @Then("should see Barista Training Area Title: {string} on Training Page")
    public void shouldSeeBaristaTrainingAreaTitleOnTrainingPage(String title) {
        String text = TrainingPage.shouldSeeBaristaTrainingAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Barista Training Area Description: {string} on Training Page")
    public void shouldSeeBaristaTrainingAreaDescriptionOnTrainingPage(String desc) {
        String text = TrainingPage.shouldSeeBaristaTrainingAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Barista Training Area Image on Training Page")
    public void shouldSeeBaristaTrainingAreaImageOnTrainingPage() {
        TrainingPage.shouldSeeBaristaTrainingAreaImage();
    }

    @Then("should see Workshops Area Title: {string} on Training Page")
    public void shouldSeeWorkshopsAreaTitleOnTrainingPage(String title) {
        String text = TrainingPage.shouldSeeWorkshopsAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Workshops Area Description: {string} on Training Page")
    public void shouldSeeWorkshopsAreaDescriptionOnTrainingPage(String desc) {
        String text = TrainingPage.shouldSeeWorkshopsAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Workshops Area Image on Training Page")
    public void shouldSeeWorkshopsAreaImageOnTrainingPage() {
        TrainingPage.shouldSeeWorkshopsAreaImage();
    }

    @Then("should see Lets Grab a Coffee Area Title: {string} on Training Page")
    public void shouldSeeLetsGrabACoffeeAreaTitleOnTrainingPage(String title) {
        String text = TrainingPage.shouldSeeLetsGrabACoffeeAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Lets Grab a Coffee Area Description: {string} on Training Page")
    public void shouldSeeLetsGrabACoffeeAreaDescriptionOnTrainingPage(String desc) {
        String text = TrainingPage.shouldSeeLetsGrabACoffeeAreaDescription();
        Assert.assertEquals(text, desc);
    }

    @Then("should see Lets Grab a Coffee Area Full Name: {string} on Training Page")
    public void shouldSeeLetsGrabACoffeeAreaFullNameOnTrainingPage(String name) {
        String text = TrainingPage.shouldSeeLetsGrabACoffeeAreaFullName();
        Assert.assertEquals(text, name);
    }

    @Then("should see Lets Grab a Coffee Area Email: {string} on Training Page")
    public void shouldSeeLetsGrabACoffeeAreaEmailOnTrainingPage(String mail) {
        String text = TrainingPage.shouldSeeLetsGrabACoffeeAreaEmail();
        Assert.assertEquals(text, mail);
    }

    @Then("should see Lets Grab a Coffee Area Contact Number: {string} on Training Page")
    public void shouldSeeLetsGrabACoffeeAreaContactNumberOnTrainingPage(String number) {
        String text = TrainingPage.shouldSeeLetsGrabACoffeeAreaContactNumber();
        Assert.assertEquals(text, number);
    }

    @Then("should see Lets Grab a Coffee Area Business Name: {string} on Training Page")
    public void shouldSeeLetsGrabACoffeeAreaBusinessNameOnTrainingPage(String name) {
        String text = TrainingPage.shouldSeeLetsGrabACoffeeAreaBusinessName();
        Assert.assertEquals(text, name);
    }

    @Then("should see Lets Grab a Coffee Area Type of Business: {string} on Training Page")
    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOnTrainingPage(String type) {
        String text = TrainingPage.shouldSeeLetsGrabACoffeeAreaTypeOfBusiness();
        Assert.assertEquals(text, type);
    }

    @Then("should see Lets Grab a Coffee Area Type of Business Option: {string} on Training Page")
    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOptionOnTrainingPage(String option) {
        TrainingPage.shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOption(option);
    }

    @Then("should see Lets Grab a Coffee Area Tell us: {string} on Training Page")
    public void shouldSeeLetsGrabACoffeeAreaTellUsOnTrainingPage(String tellUs) {
        String text = TrainingPage.shouldSeeLetsGrabACoffeeAreaTellUs();
        Assert.assertEquals(text.replaceAll("\\s+", ""), tellUs.replaceAll("\\s+", ""));
    }

    @Then("should see Lets Grab a Coffee Area Send Button: {string} on Training Page")
    public void shouldSeeLetsGrabACoffeeAreaSendButtonOnTrainingPage(String button) {
        String text = TrainingPage.shouldSeeLetsGrabACoffeeAreaSendButton();
        Assert.assertEquals(text, button);
    }

    @Then("should see Lets Grab a Coffee Area False Email Message: {string} on Training Page")
    public void shouldSeeLetsGrabACoffeeAreaFalseEmailMessageOnTrainingPage(String message) {
        String text = TrainingPage.shouldSeeLetsGrabACoffeeAreaFalseEmailMessage();
        Assert.assertEquals(text, message);
    }

    @Then("should see Lets Grab a Coffee Area Full Name Error: {string} on Training Page")
    public void shouldSeeLetsGrabACoffeeAreaFullNameErrorOnBecomeOurPartnerPage(String text) {
        String expText = TrainingPage.shouldSeeLetsGrabACoffeeAreaFullNameError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Email Error: {string} on Training Page")
    public void shouldSeeLetsGrabACoffeeAreaEmailErrorOnBecomeOurPartnerPage(String text) {
        String expText = TrainingPage.shouldSeeLetsGrabACoffeeAreaEmailError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Contact Number Error: {string} on Training Page")
    public void shouldSeeLetsGrabACoffeeAreaContactNumberErrorOnBecomeOurPartnerPage(String text) {
        String expText = TrainingPage.shouldSeeLetsGrabACoffeeAreaContactNumberError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Business Name Error: {string} on Training Page")
    public void shouldSeeLetsGrabACoffeeAreaBusinessNameErrorOnBecomeOurPartnerPage(String text) {
        String expText = TrainingPage.shouldSeeLetsGrabACoffeeAreaBusinessNameError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Type of Business Error: {string} on Training Page")
    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessErrorOnBecomeOurPartnerPage(String text) {
        String expText = TrainingPage.shouldSeeLetsGrabACoffeeAreaTypeOfBusinessError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Tell us Error: {string} on Training Page")
    public void shouldSeeLetsGrabACoffeeAreaTellUsErrorOnBecomeOurPartnerPage(String text) {
        String expText = TrainingPage.shouldSeeLetsGrabACoffeeAreaTellUsError();
        Assert.assertEquals(expText, text);
    }
}
