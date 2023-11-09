package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.EquipmentPage;
import utils.DriverFactory;

public class EquipmentPageDefinitions {
    EquipmentPage equipmentPage = new EquipmentPage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the Equipment Page")
    public void userOnTheEquipmentPage() {
        equipmentPage.userOnTheEquipmentPage();
    }

    //WHEN's
    @When("click Lets Grab a Coffee Area Type of Busines on Equipment Page")
    public void clickLetsGrabACoffeeAreaTypeOfBusinesOnEquipmentPage() {
        equipmentPage.clickLetsGrabACoffeeAreaTypeOfBusines();
    }

    @When("sendkeys Lets Grab a Coffee Area Full Name: {string} on Equipment Page")
    public void sendkeysLetsGrabACoffeeAreaFullNameOnEquipmentPage(String name) {
        equipmentPage.sendkeysLetsGrabACoffeeAreaFullName(name);
    }

    @When("sendkeys Lets Grab a Coffee Area Mail: {string} on Equipment Page")
    public void sendkeysLetsGrabACoffeeAreaMailOnEquipmentPage(String mail) {
        equipmentPage.sendkeysLetsGrabACoffeeAreaMail(mail);
    }

    @When("sendkeys Lets Grab a Coffee Area Contact Number: {string} on Equipment Page")
    public void sendkeysLetsGrabACoffeeAreaContactNumberOnEquipmentPage(String number) {
        equipmentPage.sendkeysLetsGrabACoffeeAreaContactNumber(number);
    }

    @When("sendkeys Lets Grab a Coffee Area Business Name: {string} on Equipment Page")
    public void sendkeysLetsGrabACoffeeAreaBusinessNameOnEquipmentPage(String name) {
        equipmentPage.sendkeysLetsGrabACoffeeAreaBusinessName(name);
    }

    @When("select Lets Grab a Coffee Area Type of Business: {string} on Equipment Page")
    public void selectLetsGrabACoffeeAreaTypeOfBusinessOnEquipmentPage(String type) {
        equipmentPage.selectLetsGrabACoffeeAreaTypeOfBusiness(type);
    }

    @When("sendkeys Lets Grab a Coffee Area Tell us: {string} on Equipment Page")
    public void sendkeysLetsGrabACoffeeAreaTellUsOnEquipmentPage(String tellUs) {
        equipmentPage.sendkeysLetsGrabACoffeeAreaTellUs(tellUs);
    }

    @When("click Lets Grab a Coffee Area Send Button on Equipment Page")
    public void clickLetsGrabACoffeeAreaSendButtonOnEquipmentPage() {
        equipmentPage.clickLetsGrabACoffeeAreaSendButton();
    }

    //THEN's
    @Then("should see the Equipment Page")
    public void shouldSeeTheEquipmentPage() {
        equipmentPage.shouldSeeTheEquipmentPage();
    }

    @Then("should see Equipment Area Title: {string} on Equipment Page")
    public void shouldSeeEquipmentAreaTitleOnEquipmentPage(String title) {
        String text = equipmentPage.shouldSeeEquipmentAreaTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Equipment Area Description: {string} on Equipment Page")
    public void shouldSeeEquipmentAreaDescriptionOnEquipmentPage(String desc) {
        String text = equipmentPage.shouldSeeEquipmentAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""),desc.replaceAll("\\s+", ""));
    }

    @Then("should see Equipment Area Image on Equipment Page")
    public void shouldSeeEquipmentAreaImageOnEquipmentPage() {
        equipmentPage.shouldSeeEquipmentAreaImage();
    }

    @Then("should see Description Area Description: {string} on Equipment Page")
    public void shouldSeeDescriptionAreaDescriptionOnEquipmentPage(String desc) {
       String text = equipmentPage.shouldSeeDescriptionAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""),desc.replaceAll("\\s+", ""));
    }

    @Then("should see High Quality Coffee Area Title: {string} on Equipment Page")
    public void shouldSeeHighQualityCoffeeAreaTitleOnEquipmentPage(String title) {
        String text = equipmentPage.shouldSeeHighQualityCoffeeAreaTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see High Quality Coffee Area Description: {string} on Equipment Page")
    public void shouldSeeHighQualityCoffeeAreaDescriptionOnEquipmentPage(String desc) {
        String text = equipmentPage.shouldSeeHighQualityCoffeeAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""),desc.replaceAll("\\s+", ""));
    }

    @Then("should see High Quality Coffee Area Image on Equipment Page")
    public void shouldSeeHighQualityCoffeeAreaImageOnEquipmentPage() {
        equipmentPage.shouldSeeHighQualityCoffeeAreaImage();
    }

    @Then("should see Installation Area Title: {string} on Equipment Page")
    public void shouldSeeInstallationAreaTitleOnEquipmentPage(String title) {
        String text = equipmentPage.shouldSeeInstallationAreaTitle();
        Assert.assertEquals(text,title);

    }

    @Then("should see Installation Area Description: {string} on Equipment Page")
    public void shouldSeeInstallationAreaDescriptionOnEquipmentPage(String desc) {
        String text = equipmentPage.shouldSeeInstallationAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""),desc.replaceAll("\\s+", ""));
    }

    @Then("should see Installation Area Image on Equipment Page")
    public void shouldSeeInstallationAreaImageOnEquipmentPage() {
        equipmentPage.shouldSeeInstallationAreaImage();
    }

    @Then("should see Comprehensive Training Area Title: {string} on Equipment Page")
    public void shouldSeeComprehensiveTrainingAreaTitleOnEquipmentPage(String title) {
        String text = equipmentPage.shouldSeeComprehensiveTrainingAreaTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Comprehensive Training Area Description: {string} on Equipment Page")
    public void shouldSeeComprehensiveTrainingAreaDescriptionOnEquipmentPage(String desc) {
        String text = equipmentPage.shouldSeeComprehensiveTrainingAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""),desc.replaceAll("\\s+", ""));

    }

    @Then("should see Comprehensive Training Area Image on Equipment Page")
    public void shouldSeeComprehensiveTrainingAreaImageOnEquipmentPage() {
        equipmentPage.shouldSeeComprehensiveTrainingAreaImage();
    }

    @Then("should see Ongoing Technical Area Title: {string} on Equipment Page")
    public void shouldSeeOngoingTechnicalAreaTitleOnEquipmentPage(String title) {
        String text = equipmentPage.shouldSeeOngoingTechnicalAreaTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Ongoing Technical Area Description: {string} on Equipment Page")
    public void shouldSeeOngoingTechnicalAreaDescriptionOnEquipmentPage(String desc) {
        String text = equipmentPage.shouldSeeOngoingTechnicalAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""),desc.replaceAll("\\s+", ""));
    }

    @Then("should see Ongoing Technical Area Image on Equipment Page")
    public void shouldSeeOngoingTechnicalAreaImageOnEquipmentPage() {
        equipmentPage.shouldSeeOngoingTechnicalAreaImage();
    }

    @Then("should see Lets Grab a Coffee Area Title: {string} on Equipment Page")
    public void shouldSeeLetsGrabACoffeeAreaTitleOnEquipmentPage(String title) {
        String text = equipmentPage.shouldSeeLetsGrabACoffeeAreaTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Lets Grab a Coffee Area Description: {string} on Equipment Page")
    public void shouldSeeLetsGrabACoffeeAreaDescriptionOnEquipmentPage(String desc) {
        String text = equipmentPage.shouldSeeLetsGrabACoffeeAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""),desc.replaceAll("\\s+", ""));
    }

    @Then("should see Lets Grab a Coffee Area Full Name: {string} on Equipment Page")
    public void shouldSeeLetsGrabACoffeeAreaFullNameOnEquipmentPage(String name) {
        String text = equipmentPage.shouldSeeLetsGrabACoffeeAreaFullName();
        Assert.assertEquals(text,name);
    }

    @Then("should see Lets Grab a Coffee Area Email: {string} on Equipment Page")
    public void shouldSeeLetsGrabACoffeeAreaEmailOnEquipmentPage(String mail) {
        String text = equipmentPage.shouldSeeLetsGrabACoffeeAreaEmail();
        Assert.assertEquals(text,mail);
    }

    @Then("should see Lets Grab a Coffee Area Contact Number: {string} on Equipment Page")
    public void shouldSeeLetsGrabACoffeeAreaContactNumberOnEquipmentPage(String number) {
        String text = equipmentPage.shouldSeeLetsGrabACoffeeAreaContactNumber();
        Assert.assertEquals(text,number);
    }

    @Then("should see Lets Grab a Coffee Area Business Name: {string} on Equipment Page")
    public void shouldSeeLetsGrabACoffeeAreaBusinessNameOnEquipmentPage(String name) {
        String text = equipmentPage.shouldSeeLetsGrabACoffeeAreaBusinessName();
        Assert.assertEquals(text,name);
    }

    @Then("should see Lets Grab a Coffee Area Type of Business: {string} on Equipment Page")
    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOnEquipmentPage(String type) {
        String text = equipmentPage.shouldSeeLetsGrabACoffeeAreaTypeOfBusiness();
        Assert.assertEquals(text,type);
    }

    @Then("should see Lets Grab a Coffee Area Type of Business Option: {string} on Equipment Page")
    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOptionOnEquipmentPage(String option) {
        equipmentPage.shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOption(option);
    }

    @Then("should see Lets Grab a Coffee Area Tell us: {string} on Equipment Page")
    public void shouldSeeLetsGrabACoffeeAreaTellUsOnEquipmentPage(String tellUs) {
        String text = equipmentPage.shouldSeeLetsGrabACoffeeAreaTellUs();
        Assert.assertEquals(text.replaceAll("\\s+", ""),tellUs.replaceAll("\\s+", ""));
    }

    @Then("should see Lets Grab a Coffee Area Send Button: {string} on Equipment Page")
    public void shouldSeeLetsGrabACoffeeAreaSendButtonOnEquipmentPage(String button) {
        String text = equipmentPage.shouldSeeLetsGrabACoffeeAreaSendButton();
        Assert.assertEquals(text,button);
    }

    @Then("should see Lets Grab a Coffee Area False Email Message: {string} on Equipment Page")
    public void shouldSeeLetsGrabACoffeeAreaFalseEmailMessageOnEquipmentPage(String message) {
        String text = equipmentPage.shouldSeeLetsGrabACoffeeAreaFalseEmailMessage();
        Assert.assertEquals(text,message);
    }

    @Then("should see Lets Grab a Coffee Area Full Name Error: {string} on Equipment Page")
    public void shouldSeeLetsGrabACoffeeAreaFullNameErrorOnBecomeOurPartnerPage(String text) {
        String expText = equipmentPage.shouldSeeLetsGrabACoffeeAreaFullNameError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Email Error: {string} on Equipment Page")
    public void shouldSeeLetsGrabACoffeeAreaEmailErrorOnBecomeOurPartnerPage(String text) {
        String expText = equipmentPage.shouldSeeLetsGrabACoffeeAreaEmailError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Contact Number Error: {string} on Equipment Page")
    public void shouldSeeLetsGrabACoffeeAreaContactNumberErrorOnBecomeOurPartnerPage(String text) {
        String expText = equipmentPage.shouldSeeLetsGrabACoffeeAreaContactNumberError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Business Name Error: {string} on Equipment Page")
    public void shouldSeeLetsGrabACoffeeAreaBusinessNameErrorOnBecomeOurPartnerPage(String text) {
        String expText = equipmentPage.shouldSeeLetsGrabACoffeeAreaBusinessNameError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Type of Business Error: {string} on Equipment Page")
    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessErrorOnBecomeOurPartnerPage(String text) {
        String expText = equipmentPage.shouldSeeLetsGrabACoffeeAreaTypeOfBusinessError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Tell us Error: {string} on Equipment Page")
    public void shouldSeeLetsGrabACoffeeAreaTellUsErrorOnBecomeOurPartnerPage(String text) {
        String expText = equipmentPage.shouldSeeLetsGrabACoffeeAreaTellUsError();
        Assert.assertEquals(expText, text);
    }
}
