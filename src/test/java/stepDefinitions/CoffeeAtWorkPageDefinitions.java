package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CoffeeAtWorkPage;
import utils.DriverFactory;

public class CoffeeAtWorkPageDefinitions {
    CoffeeAtWorkPage CoffeeAtWorkPage = new CoffeeAtWorkPage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the Coffee At Work Page")
    public void userOnTheCoffeeAtWorkPage() {
        CoffeeAtWorkPage.userOnTheCoffeeAtWorkPage();
    }

    //WHEN's
    @When("click Lets Grab a Coffee Area Type of Busines on Coffee At Work Page")
    public void clickLetsGrabACoffeeAreaTypeOfBusinesOnCoffeeAtWorkPage() {
        CoffeeAtWorkPage.clickLetsGrabACoffeeAreaTypeOfBusines();
    }

    @When("click Engaging Coffee Area Equipment Button on Coffee At Work Page")
    public void clickEngagingCoffeeAreaEquipmentButtonOnCoffeeAtWorkPage() {
        CoffeeAtWorkPage.clickEngagingCoffeeAreaEquipmentButton();
    }

    @When("click Brewing Great Area Equipment Button on Coffee At Work Page")
    public void clickBrewingGreatAreaEquipmentButtonOnCoffeeAtWorkPage() {
        CoffeeAtWorkPage.clickBrewingGreatAreaEquipmentButton();
    }

    @When("sendkeys Lets Grab a Coffee Area Full Name: {string} on Coffee At Work Page")
    public void sendkeysLetsGrabACoffeeAreaFullNameOnCoffeeAtWorkPage(String name) {
        CoffeeAtWorkPage.sendkeysLetsGrabACoffeeAreaFullName(name);
    }

    @When("sendkeys Lets Grab a Coffee Area Mail: {string} on Coffee At Work Page")
    public void sendkeysLetsGrabACoffeeAreaMailOnCoffeeAtWorkPage(String mail) {
        CoffeeAtWorkPage.sendkeysLetsGrabACoffeeAreaMail(mail);
    }

    @When("sendkeys Lets Grab a Coffee Area Contact Number: {string} on Coffee At Work Page")
    public void sendkeysLetsGrabACoffeeAreaContactNumberOnCoffeeAtWorkPage(String number) {
        CoffeeAtWorkPage.sendkeysLetsGrabACoffeeAreaContactNumber(number);
    }

    @When("sendkeys Lets Grab a Coffee Area Business Name: {string} on Coffee At Work Page")
    public void sendkeysLetsGrabACoffeeAreaBusinessNameOnCoffeeAtWorkPage(String name) {
        CoffeeAtWorkPage.sendkeysLetsGrabACoffeeAreaBusinessName(name);
    }

    @When("select Lets Grab a Coffee Area Type of Business: {string} on Coffee At Work Page")
    public void selectLetsGrabACoffeeAreaTypeOfBusinessOnCoffeeAtWorkPage(String type) {
        CoffeeAtWorkPage.selectLetsGrabACoffeeAreaTypeOfBusiness(type);
    }

    @When("sendkeys Lets Grab a Coffee Area Tell us: {string} on Coffee At Work Page")
    public void sendkeysLetsGrabACoffeeAreaTellUsOnCoffeeAtWorkPage(String tellUs) {
        CoffeeAtWorkPage.sendkeysLetsGrabACoffeeAreaTellUs(tellUs);
    }

    @When("click Lets Grab a Coffee Area Send Button on Coffee At Work Page")
    public void clickLetsGrabACoffeeAreaSendButtonOnCoffeeAtWorkPage() {
        CoffeeAtWorkPage.clickLetsGrabACoffeeAreaSendButton();
    }

    //THEN's
    @Then("should see the Coffee At Work Page")
    public void shouldSeeTheCoffeeAtWorkPage() {
         CoffeeAtWorkPage.shouldSeeTheCoffeeAtWork();
    }

    @Then("should see Coffee At Work Area Title: {string} on Coffee At Work Page")
    public void shouldSeeCoffeeAtWorkAreaTitleOnCoffeeAtWorkPage(String title) {
        String text = CoffeeAtWorkPage.shouldSeeCoffeeAtWorkAreaTitle();
        Assert.assertEquals(text , title);
    }

    @Then("should see Coffee At Work Area Description: {string} on Coffee At Work Page")
    public void shouldSeeCoffeeAtWorkAreaDescriptionOnCoffeeAtWorkPage(String desc) {
        String text = CoffeeAtWorkPage.shouldSeeCoffeeAtWorkAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+","") , desc.replaceAll("\\s+",""));
    }

    @Then("should see Coffee At Work Area Image on Coffee At Work Page")
    public void shouldSeeCoffeeAtWorkAreaImageOnCoffeeAtWorkPage() {
        CoffeeAtWorkPage.shouldSeeCoffeeAtWorkAreaImage();
    }

    @Then("should see Description Area Description: {string} on Coffee At Work Page")
    public void shouldSeeDescriptionAreaDescriptionOnCoffeeAtWorkPage(String desc) {
        String text = CoffeeAtWorkPage.shouldSeeDescriptionAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+","") , desc.replaceAll("\\s+",""));
    }

    @Then("should see The Favorite Drink Area Title: {string} on Coffee At Work Page")
    public void shouldSeeTheFavoriteDrinkAreaTitleOnCoffeeAtWorkPage(String title) {
        String text = CoffeeAtWorkPage.shouldSeeTheFavoriteDrinkAreaTitle();
        Assert.assertEquals(text.replaceAll("\\s+","") , title.replaceAll("\\s+",""));
    }

    @Then("should see The Favorite Drink Area Description: {string} on Coffee At Work Page")
    public void shouldSeeTheFavoriteDrinkAreaDescriptionOnCoffeeAtWorkPage(String desc) {
        String text = CoffeeAtWorkPage.shouldSeeTheFavoriteDrinkAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""),desc.replaceAll("\\s+",""));
    }

    @Then("should see The Favorite Drink Area Image on Coffee At Work Page")
    public void shouldSeeTheFavoriteDrinkAreaImageOnCoffeeAtWorkPage() {
        CoffeeAtWorkPage.shouldSeeTheFavoriteDrinkAreaImage();
    }

    @Then("should see Brewing Great Area Title: {string} on Coffee At Work Page")
    public void shouldSeeBrewingGreatAreaTitleOnCoffeeAtWorkPage(String title) {
        String text = CoffeeAtWorkPage.shouldSeeBrewingGreatAreaTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Brewing Great Area Description: {string} on Coffee At Work Page")
    public void shouldSeeBrewingGreatAreaDescriptionOnCoffeeAtWorkPage(String desc) {
        String text = CoffeeAtWorkPage.shouldSeeBrewingGreatAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""),desc.replaceAll("\\s+",""));
    }

    @Then("should see Brewing Great Area Image on Coffee At Work Page")
    public void shouldSeeBrewingGreatAreaImageOnCoffeeAtWorkPage() {
        CoffeeAtWorkPage.shouldSeeBrewingGreatAreaImage();
    }

    @Then("should see Brewing Great Area Equipment Button: {string} on Coffee At Work Page")
    public void shouldSeeBrewingGreatAreaEquipmentButtonOnCoffeeAtWorkPage(String button) {
        String text = CoffeeAtWorkPage.shouldSeeBrewingGreatAreaEquipmentButton();
        Assert.assertEquals(text , button);
    }

    @Then("should see Engaging Coffee Area Title: {string} on Coffee At Work Page")
    public void shouldSeeEngagingCoffeeAreaTitleOnCoffeeAtWorkPage(String title) {
        String text = CoffeeAtWorkPage.shouldSeeEngagingCoffeeAreaTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Engaging Coffee Area Description: {string} on Coffee At Work Page")
    public void shouldSeeEngagingCoffeeAreaDescriptionOnCoffeeAtWorkPage(String desc) {
        String text = CoffeeAtWorkPage.shouldSeeEngagingCoffeeAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""),desc.replaceAll("\\s+",""));
    }

    @Then("should see Engaging Coffee Area Image on Coffee At Work Page")
    public void shouldSeeEngagingCoffeeAreaImageOnCoffeeAtWorkPage() {
        CoffeeAtWorkPage.shouldSeeEngagingCoffeeAreaImage();
    }

    @Then("should see Engaging Coffee Area Training Button: {string} on Coffee At Work Page")
    public void shouldSeeEngagingCoffeeAreaTrainingButtonOnCoffeeAtWorkPage(String button) {
        String text = CoffeeAtWorkPage.shouldSeeEngagingCoffeeAreaTrainingButton();
        Assert.assertEquals(text,button);
    }

    @Then("should see A Coffee Break Area Title: {string} on Coffee At Work Page")
    public void shouldSeeACoffeeBreakAreaTitleOnCoffeeAtWorkPage(String title) {
        String text = CoffeeAtWorkPage.shouldSeeACoffeeBreakAreaTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see A Coffee Break Area Description: {string} on Coffee At Work Page")
    public void shouldSeeACoffeeBreakAreaDescriptionOnCoffeeAtWorkPage(String desc) {
        String text = CoffeeAtWorkPage.shouldSeeACoffeeBreakAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""),desc.replaceAll("\\s+",""));
    }

    @Then("should see A Coffee Break Area Image on Coffee At Work Page")
    public void shouldSeeACoffeeBreakAreaImageOnCoffeeAtWorkPage() {
        CoffeeAtWorkPage.shouldSeeACoffeeBreakAreaImage();
    }

    @Then("should see Lets Grab a Coffee Area Title: {string} on Coffee At Work Page")
    public void shouldSeeLetsGrabACoffeeAreaTitleOnCoffeeAtWorkPage(String title) {
        String text =  CoffeeAtWorkPage.shouldSeeLetsGrabACoffeeAreaTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Lets Grab a Coffee Area Description: {string} on Coffee At Work Page")
    public void shouldSeeLetsGrabACoffeeAreaDescriptionOnCoffeeAtWorkPage(String desc) {
        String text = CoffeeAtWorkPage.shouldSeeLetsGrabACoffeeAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""),desc.replaceAll("\\s+",""));
    }

    @Then("should see Lets Grab a Coffee Area Full Name: {string} on Coffee At Work Page")
    public void shouldSeeLetsGrabACoffeeAreaFullNameOnCoffeeAtWorkPage(String name) {
        String text = CoffeeAtWorkPage.shouldSeeLetsGrabACoffeeAreaFullName();
        Assert.assertEquals(text,name);
    }

    @Then("should see Lets Grab a Coffee Area Email: {string} on Coffee At Work Page")
    public void shouldSeeLetsGrabACoffeeAreaEmailOnCoffeeAtWorkPage(String mail) {
        String text = CoffeeAtWorkPage.shouldSeeLetsGrabACoffeeAreaEmail();
        Assert.assertEquals(text,mail);
    }

    @Then("should see Lets Grab a Coffee Area Contact Number: {string} on Coffee At Work Page")
    public void shouldSeeLetsGrabACoffeeAreaContactNumberOnCoffeeAtWorkPage(String number) {
        String text = CoffeeAtWorkPage.shouldSeeLetsGrabACoffeeAreaContactNumber();
        Assert.assertEquals(text,number);
    }

    @Then("should see Lets Grab a Coffee Area Business Name: {string} on Coffee At Work Page")
    public void shouldSeeLetsGrabACoffeeAreaBusinessNameOnCoffeeAtWorkPage(String name) {
        String text = CoffeeAtWorkPage.shouldSeeLetsGrabACoffeeAreaBusinessName();
        Assert.assertEquals(text,name);
    }

    @Then("should see Lets Grab a Coffee Area Type of Business: {string} on Coffee At Work Page")
    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOnCoffeeAtWorkPage(String type) {
        String text = CoffeeAtWorkPage.shouldSeeLetsGrabACoffeeAreaTypeOfBusiness();
        Assert.assertEquals(text,type);
    }

    @Then("should see Lets Grab a Coffee Area Type of Business Option: {string} on Coffee At Work Page")
    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOptionOnCoffeeAtWorkPage(String option) {
        CoffeeAtWorkPage.shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOption(option);
    }

    @Then("should see Lets Grab a Coffee Area Tell us: {string} on Coffee At Work Page")
    public void shouldSeeLetsGrabACoffeeAreaTellUsOnCoffeeAtWorkPage(String tellUs) {
        String text = CoffeeAtWorkPage.shouldSeeLetsGrabACoffeeAreaTellUs();
        Assert.assertEquals(text.replaceAll("\\s+",""),tellUs.replaceAll("\\s+",""));
    }

    @Then("should see Lets Grab a Coffee Area Send Button: {string} on Coffee At Work Page")
    public void shouldSeeLetsGrabACoffeeAreaSendButtonOnCoffeeAtWorkPage(String button) {
        String text = CoffeeAtWorkPage.shouldSeeLetsGrabACoffeeAreaSendButton();
        Assert.assertEquals(text,button);
    }

    @Then("should see Lets Grab a Coffee Area False Email Message: {string} on Coffee At Work Page")
    public void shouldSeeLetsGrabACoffeeAreaFalseEmailMessageOnCoffeeAtWorkPage(String message) {
        String text = CoffeeAtWorkPage.shouldSeeLetsGrabACoffeeAreaFalseEmailMessage();
        Assert.assertEquals(text,message);
    }

    @Then("should see Lets Grab a Coffee Area Full Name Error: {string} on Coffee At Work Page")
    public void shouldSeeLetsGrabACoffeeAreaFullNameErrorOnBecomeOurPartnerPage(String text) {
        String expText = CoffeeAtWorkPage.shouldSeeLetsGrabACoffeeAreaFullNameError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Email Error: {string} on Coffee At Work Page")
    public void shouldSeeLetsGrabACoffeeAreaEmailErrorOnBecomeOurPartnerPage(String text) {
        String expText = CoffeeAtWorkPage.shouldSeeLetsGrabACoffeeAreaEmailError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Contact Number Error: {string} on Coffee At Work Page")
    public void shouldSeeLetsGrabACoffeeAreaContactNumberErrorOnBecomeOurPartnerPage(String text) {
        String expText = CoffeeAtWorkPage.shouldSeeLetsGrabACoffeeAreaContactNumberError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Business Name Error: {string} on Coffee At Work Page")
    public void shouldSeeLetsGrabACoffeeAreaBusinessNameErrorOnBecomeOurPartnerPage(String text) {
        String expText = CoffeeAtWorkPage.shouldSeeLetsGrabACoffeeAreaBusinessNameError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Type of Business Error: {string} on Coffee At Work Page")
    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessErrorOnBecomeOurPartnerPage(String text) {
        String expText = CoffeeAtWorkPage.shouldSeeLetsGrabACoffeeAreaTypeOfBusinessError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Tell us Error: {string} on Coffee At Work Page")
    public void shouldSeeLetsGrabACoffeeAreaTellUsErrorOnBecomeOurPartnerPage(String text) {
        String expText = CoffeeAtWorkPage.shouldSeeLetsGrabACoffeeAreaTellUsError();
        Assert.assertEquals(expText, text);
    }
}
