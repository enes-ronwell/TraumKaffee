package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CoffeeAtWorkPage;
import pages.CoffeeForHotelsPage;
import utils.DriverFactory;

public class CoffeeForHotelsPageDefinitions {
    CoffeeForHotelsPage CoffeeForHotelsPage = new CoffeeForHotelsPage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the Coffee for Hotels Page")
    public void userOnTheCoffeeForHotelsPage() {
        CoffeeForHotelsPage.userOnTheCoffeeForHotelsPage();
    }

    //WHEN's
    @When("click Lets Grab a Coffee Area Type of Busines on Coffee for Hotels Page")
    public void clickLetsGrabACoffeeAreaTypeOfBusinesOnCoffeeForHotelsPage() {
        CoffeeForHotelsPage.clickLetsGrabACoffeeAreaTypeOfBusines();
    }

    @When("click From Barista Area Training Button on Coffee for Hotels Page")
    public void clickFromBaristaAreaTrainingButtonOnCoffeeForHotelsPage() {
        CoffeeForHotelsPage.clickFromBaristaAreaTrainingButton();
    }

    @When("sendkeys Lets Grab a Coffee Area Full Name: {string} on Coffee for Hotels Page")
    public void sendkeysLetsGrabACoffeeAreaFullNameOnCoffeeForHotelsPage(String name) {
        CoffeeForHotelsPage.sendkeysLetsGrabACoffeeAreaFullName(name);
    }

    @When("sendkeys Lets Grab a Coffee Area Mail: {string} on Coffee for Hotels Page")
    public void sendkeysLetsGrabACoffeeAreaMailOnCoffeeForHotelsPage(String mail) {
        CoffeeForHotelsPage.sendkeysLetsGrabACoffeeAreaMail(mail);
    }

    @When("sendkeys Lets Grab a Coffee Area Contact Number: {string} on Coffee for Hotels Page")
    public void sendkeysLetsGrabACoffeeAreaContactNumberOnCoffeeForHotelsPage(String number) {
        CoffeeForHotelsPage.sendkeysLetsGrabACoffeeAreaContactNumber(number);
    }

    @When("sendkeys Lets Grab a Coffee Area Business Name: {string} on Coffee for Hotels Page")
    public void sendkeysLetsGrabACoffeeAreaBusinessNameOnCoffeeForHotelsPage(String business) {
        CoffeeForHotelsPage.sendkeysLetsGrabACoffeeAreaBusinessName(business);
    }

    @When("select Lets Grab a Coffee Area Type of Business: {string} on Coffee for Hotels Page")
    public void selectLetsGrabACoffeeAreaTypeOfBusinessOnCoffeeForHotelsPage(String type) {
        CoffeeForHotelsPage.selectLetsGrabACoffeeAreaTypeOfBusiness(type);
    }

    @When("sendkeys Lets Grab a Coffee Area Tell us: {string} on Coffee for Hotels Page")
    public void sendkeysLetsGrabACoffeeAreaTellUsOnCoffeeForHotelsPage(String tellUs) {
        CoffeeForHotelsPage.sendkeysLetsGrabACoffeeAreaTellUs(tellUs);
    }

    @When("click Lets Grab a Coffee Area Send Button on Coffee for Hotels Page")
    public void clickLetsGrabACoffeeAreaSendButtonOnCoffeeForHotelsPage() {
        CoffeeForHotelsPage.clickLetsGrabACoffeeAreaSendButton();
    }

    //THEN's
    @Then("should see the Coffee for Hotels Page")
    public void shouldSeeTheCoffeeForHotelsPage() {
        CoffeeForHotelsPage.shouldSeeTheCoffeeForHotelsPage();
    }

    @Then("should see Coffee For Hotels Area Title: {string} on Coffee for Hotels Page")
    public void shouldSeeCoffeeForHotelsAreaTitleOnCoffeeForHotelsPage(String title) {
        String text = CoffeeForHotelsPage.shouldSeeCoffeeForHotelsAreaTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Coffee For Hotels Area Description: {string} on Coffee for Hotels Page")
    public void shouldSeeCoffeeForHotelsAreaDescriptionOnCoffeeForHotelsPage(String desc) {
        String text = CoffeeForHotelsPage.shouldSeeCoffeeForHotelsAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""),desc.replaceAll("\\s+",""));
    }

    @Then("should see Coffee For Hotels Area Image on Coffee for Hotels Page")
    public void shouldSeeCoffeeForHotelsAreaImageOnCoffeeForHotelsPage() {
        CoffeeForHotelsPage.shouldSeeCoffeeForHotelsAreaImage();
    }

    @Then("should see Description Area Description: {string} on Coffee for Hotels Page")
    public void shouldSeeDescriptionAreaDescriptionOnCoffeeForHotelsPage(String desc) {
        String text = CoffeeForHotelsPage.shouldSeeDescriptionAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""),desc.replaceAll("\\s+",""));
    }

    @Then("should see Taste Difference Area Title: {string} on Coffee for Hotels Page")
    public void shouldSeeTasteDifferenceAreaTitleOnCoffeeForHotelsPage(String title) {
        String text = CoffeeForHotelsPage.shouldSeeTasteDifferenceAreaTitle();
        Assert.assertEquals(text.replaceAll("\\s+",""),title.replaceAll("\\s+",""));
    }

    @Then("should see Taste Difference Area Description: {string} on Coffee for Hotels Page")
    public void shouldSeeTasteDifferenceAreaDescriptionOnCoffeeForHotelsPage(String desc) {
        String text = CoffeeForHotelsPage.shouldSeeTasteDifferenceAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""),desc.replaceAll("\\s+",""));
    }

    @Then("should see Taste Difference Area Image on Coffee for Hotels Page")
    public void shouldSeeTasteDifferenceAreaImageOnCoffeeForHotelsPage() {
        CoffeeForHotelsPage.shouldSeeTasteDifferenceAreaImage();
    }

    @Then("should see Coffee Revolation Area Title: {string} on Coffee for Hotels Page")
    public void shouldSeeCoffeeRevolationAreaTitleOnCoffeeForHotelsPage(String title) {
        String text = CoffeeForHotelsPage.shouldSeeCoffeeRevolationAreaTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Coffee Revolation Area Description: {string} on Coffee for Hotels Page")
    public void shouldSeeCoffeeRevolationAreaDescriptionOnCoffeeForHotelsPage(String desc) {
        String text = CoffeeForHotelsPage.shouldSeeCoffeeRevolationAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""),desc.replaceAll("\\s+",""));
    }

    @Then("should see Coffee Revolation Area Image on Coffee for Hotels Page")
    public void shouldSeeCoffeeRevolationAreaImageOnCoffeeForHotelsPage() {
        CoffeeForHotelsPage.shouldSeeCoffeeRevolationAreaImage();
    }

    @Then("should see Brewing With Hospitally Area Title: {string} on Coffee for Hotels Page")
    public void shouldSeeBrewingWithHospitallyAreaTitleOnCoffeeForHotelsPage(String title) {
        String text = CoffeeForHotelsPage.shouldSeeBrewingWithHospitallyAreaTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Brewing With Hospitally Area Description: {string} on Coffee for Hotels Page")
    public void shouldSeeBrewingWithHospitallyAreaDescriptionOnCoffeeForHotelsPage(String desc) {
        String text = CoffeeForHotelsPage.shouldSeeBrewingWithHospitallyAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""),desc.replaceAll("\\s+",""));
    }

    @Then("should see Brewing With Hospitally Area Image on Coffee for Hotels Page")
    public void shouldSeeBrewingWithHospitallyAreaImageOnCoffeeForHotelsPage() {
        CoffeeForHotelsPage.shouldSeeBrewingWithHospitallyAreaImage();
    }

    @Then("should see Sustainably Delicious Area Title: {string} on Coffee for Hotels Page")
    public void shouldSeeSustainablyDeliciousAreaTitleOnCoffeeForHotelsPage(String title) {
        String text = CoffeeForHotelsPage.shouldSeeSustainablyDeliciousAreaTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Sustainably Delicious Area Description: {string} on Coffee for Hotels Page")
    public void shouldSeeSustainablyDeliciousAreaDescriptionOnCoffeeForHotelsPage(String desc) {
        String text = CoffeeForHotelsPage.shouldSeeSustainablyDeliciousAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""),desc.replaceAll("\\s+",""));
    }

    @Then("should see Sustainably Delicious Area Image on Coffee for Hotels Page")
    public void shouldSeeSustainablyDeliciousAreaImageOnCoffeeForHotelsPage() {
        CoffeeForHotelsPage.shouldSeeSustainablyDeliciousAreaImage();
    }

    @Then("should see From Barista Area Title: {string} on Coffee for Hotels Page")
    public void shouldSeeFromBaristaAreaTitleOnCoffeeForHotelsPage(String title) {
        String text = CoffeeForHotelsPage.shouldSeeFromBaristaAreaTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see From Barista Area Description: {string} on Coffee for Hotels Page")
    public void shouldSeeFromBaristaAreaDescriptionOnCoffeeForHotelsPage(String desc) {
        String text = CoffeeForHotelsPage.shouldSeeFromBaristaAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""),desc.replaceAll("\\s+",""));
    }

    @Then("should see From Barista Area Image on Coffee for Hotels Page")
    public void shouldSeeFromBaristaAreaImageOnCoffeeForHotelsPage() {
        CoffeeForHotelsPage.shouldSeeFromBaristaAreaImage();
    }

    @Then("should see From Barista Area Training Button: {string} on Coffee for Hotels Page")
    public void shouldSeeFromBaristaAreaTrainingButtonOnCoffeeForHotelsPage(String button) {
        String text = CoffeeForHotelsPage.shouldSeeFromBaristaAreaTrainingButton();
        Assert.assertEquals(text,button);
    }

    @Then("should see What Makes Us Area Title: {string} on Coffee for Hotels Page")
    public void shouldSeeWhatMakesUsAreaTitleOnCoffeeForHotelsPage(String title) {
        String text = CoffeeForHotelsPage.shouldSeeWhatMakesUsAreaTitle();
        Assert.assertEquals(text , title);
    }

    @Then("should see What Makes Us Area Description: {string} on Coffee for Hotels Page")
    public void shouldSeeWhatMakesUsAreaDescriptionOnCoffeeForHotelsPage(String desc) {
        String text = CoffeeForHotelsPage.shouldSeeWhatMakesUsAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""),desc.replaceAll("\\s+",""));
    }

    @Then("should see What Makes Us Area Image on Coffee for Hotels Page")
    public void shouldSeeWhatMakesUsAreaImageOnCoffeeForHotelsPage() {
        CoffeeForHotelsPage.shouldSeeWhatMakesUsAreaImage();
    }

    @Then("should see Lets Grab a Coffee Area Title: {string} on Coffee for Hotels Page")
    public void shouldSeeLetsGrabACoffeeAreaTitleOnCoffeeForHotelsPage(String title) {
        String text = CoffeeForHotelsPage.shouldSeeLetsGrabACoffeeAreaTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Lets Grab a Coffee Area Description: {string} on Coffee for Hotels Page")
    public void shouldSeeLetsGrabACoffeeAreaDescriptionOnCoffeeForHotelsPage(String desc) {
        String text = CoffeeForHotelsPage.shouldSeeLetsGrabACoffeeAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""), desc.replaceAll("\\s+",""));
    }

    @Then("should see Lets Grab a Coffee Area Full Name: {string} on Coffee for Hotels Page")
    public void shouldSeeLetsGrabACoffeeAreaFullNameOnCoffeeForHotelsPage(String name) {
        String text = CoffeeForHotelsPage.shouldSeeLetsGrabACoffeeAreaFullName();
        Assert.assertEquals(text,name);
    }

    @Then("should see Lets Grab a Coffee Area Email: {string} on Coffee for Hotels Page")
    public void shouldSeeLetsGrabACoffeeAreaEmailOnCoffeeForHotelsPage(String mail) {
        String text = CoffeeForHotelsPage.shouldSeeLetsGrabACoffeeAreaEmail();
        Assert.assertEquals(text,mail);
    }

    @Then("should see Lets Grab a Coffee Area Contact Number: {string} on Coffee for Hotels Page")
    public void shouldSeeLetsGrabACoffeeAreaContactNumberOnCoffeeForHotelsPage(String number) {
        String text = CoffeeForHotelsPage.shouldSeeLetsGrabACoffeeAreaContactNumber();
        Assert.assertEquals(text,number);
    }

    @Then("should see Lets Grab a Coffee Area Business Name: {string} on Coffee for Hotels Page")
    public void shouldSeeLetsGrabACoffeeAreaBusinessNameOnCoffeeForHotelsPage(String name) {
        String text = CoffeeForHotelsPage.shouldSeeLetsGrabACoffeeAreaBusinessName();
        Assert.assertEquals(text,name);
    }

    @Then("should see Lets Grab a Coffee Area Type of Business: {string} on Coffee for Hotels Page")
    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOnCoffeeForHotelsPage(String type) {
        String text = CoffeeForHotelsPage.shouldSeeLetsGrabACoffeeAreaTypeOfBusiness();
        Assert.assertEquals(text,type);
    }

    @Then("should see Lets Grab a Coffee Area Type of Business Option: {string} on Coffee for Hotels Page")
    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOptionOnCoffeeForHotelsPage(String option) {
        CoffeeForHotelsPage.shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOption(option);
    }

    @Then("should see Lets Grab a Coffee Area Tell us: {string} on Coffee for Hotels Page")
    public void shouldSeeLetsGrabACoffeeAreaTellUsOnCoffeeForHotelsPage(String tellUs) {
        String text = CoffeeForHotelsPage.shouldSeeLetsGrabACoffeeAreaTellUs();
        Assert.assertEquals(text.replaceAll("\\s+",""),tellUs.replaceAll("\\s+",""));
    }

    @Then("should see Lets Grab a Coffee Area Send Button: {string} on Coffee for Hotels Page")
    public void shouldSeeLetsGrabACoffeeAreaSendButtonOnCoffeeForHotelsPage(String button) {
        String text = CoffeeForHotelsPage.shouldSeeLetsGrabACoffeeAreaSendButton();
        Assert.assertEquals(text,button);
    }

    @Then("should see Lets Grab a Coffee Area False Email Message: {string} on Coffee for Hotels Page")
    public void shouldSeeLetsGrabACoffeeAreaFalseEmailMessageOnCoffeeForHotelsPage(String message) {
        String text = CoffeeForHotelsPage.shouldSeeLetsGrabACoffeeAreaFalseEmailMessage();
        Assert.assertEquals(text,message);
    }

    @Then("should see Lets Grab a Coffee Area Full Name Error: {string} on Coffee for Hotels Page")
    public void shouldSeeLetsGrabACoffeeAreaFullNameErrorOnBecomeOurPartnerPage(String text) {
        String expText = CoffeeForHotelsPage.shouldSeeLetsGrabACoffeeAreaFullNameError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Email Error: {string} on Coffee for Hotels Page")
    public void shouldSeeLetsGrabACoffeeAreaEmailErrorOnBecomeOurPartnerPage(String text) {
        String expText = CoffeeForHotelsPage.shouldSeeLetsGrabACoffeeAreaEmailError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Contact Number Error: {string} on Coffee for Hotels Page")
    public void shouldSeeLetsGrabACoffeeAreaContactNumberErrorOnBecomeOurPartnerPage(String text) {
        String expText = CoffeeForHotelsPage.shouldSeeLetsGrabACoffeeAreaContactNumberError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Business Name Error: {string} on Coffee for Hotels Page")
    public void shouldSeeLetsGrabACoffeeAreaBusinessNameErrorOnBecomeOurPartnerPage(String text) {
        String expText = CoffeeForHotelsPage.shouldSeeLetsGrabACoffeeAreaBusinessNameError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Type of Business Error: {string} on Coffee for Hotels Page")
    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessErrorOnBecomeOurPartnerPage(String text) {
        String expText = CoffeeForHotelsPage.shouldSeeLetsGrabACoffeeAreaTypeOfBusinessError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Tell us Error: {string} on Coffee for Hotels Page")
    public void shouldSeeLetsGrabACoffeeAreaTellUsErrorOnBecomeOurPartnerPage(String text) {
        String expText = CoffeeForHotelsPage.shouldSeeLetsGrabACoffeeAreaTellUsError();
        Assert.assertEquals(expText, text);
    }
}
