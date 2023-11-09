package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ContactPage;
import utils.DriverFactory;

public class ContactPageDefinitions {
    ContactPage contactPage = new ContactPage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the Contact Page")
    public void userOnTheContactPage() {
        contactPage.userOnTheContactPage();
    }

    //WHEN's
    @When("click Get In Touch Area Subject Dropdown on Contact Page")
    public void clickGetInTouchAreaSubjectDropdownOnContactPage() {
        contactPage.clickGetInTouchAreaSubjectDropdown();
    }

    @When("click Follow Us Area Facebook Icon on Contact Page")
    public void clickFollowUsAreaFacebookIconOnContactPage() {
        contactPage.clickFollowUsAreaFacebookIcon();
    }

    @When("click Follow Us Area Instagram Icon on Contact Page")
    public void clickFollowUsAreaInstagramIconOnContactPage() {
        contactPage.clickFollowUsAreaInstagramIcon();
    }

    @When("click Follow Us Area Twitter Icon on Contact Page")
    public void clickFollowUsAreaTwitterIconOnContactPage() {
        contactPage.clickFollowUsAreaTwitterIcon();
    }

    @When("click Follow Us Area Tiktok Icon on Contact Page")
    public void clickFollowUsAreaTiktokIconOnContactPage() {
        contactPage.clickFollowUsAreaTiktokIcon();
    }

    @When("click Get In Touch Area Send Button on Contact Page")
    public void clickGetInTouchAreaSendButtonOnContactPage() {
        contactPage.clickGetInTouchAreaSendButton();
    }

    @When("sendkeys Get In Touch Area Name: {string} on Contact Page")
    public void sendkeysGetInTouchAreaNameOnContactPage(String name) {
        contactPage.sendkeysGetInTouchAreaName(name);
    }

    @When("sendkeys Get In Touch Area Email: {string} on Contact Page")
    public void sendkeysGetInTouchAreaEmailOnContactPage(String mail) {
        contactPage.sendkeysGetInTouchAreaEmail(mail);
    }

    @When("select Get In Touch Area Subject: {string} on Contact Page")
    public void selectGetInTouchAreaSubjectOnContactPage(String subject) {
        contactPage.selectGetInTouchAreaSubject(subject);
    }

    @When("sendkeys Get In Touch Area Order Number: {string} on Contact Page")
    public void sendkeysGetInTouchAreaOrderNumberOnContactPage(String number) {
        contactPage.sendkeysGetInTouchAreaOrderNumber(number);
    }

    @When("sendkeys Get In Touch Area Message: {string} on Contact Page")
    public void sendkeysGetInTouchAreaMessageOnContactPage(String message) {
        contactPage.sendkeysGetInTouchAreaMessage(message);
    }

    //THEN's
    @Then("should see the Contact Page")
    public void shouldSeeTheContactPage() {
        contactPage.shouldSeeTheContactPage();
    }

    @Then("should see Contact Area Title: {string} on Contact Page")
    public void shouldSeeContactAreaTitleOnContactPage(String title) {
        String text = contactPage.shouldSeeContactAreaTitle();
        Assert.assertEquals(text.replaceAll("\\s+",""), title.replaceAll("\\s+",""));
    }

    @Then("should see Contact Area Image on Contact Page")
    public void shouldSeeContactAreaImageOnContactPage() {
        contactPage.shouldSeeContactAreaImage();
    }

    @Then("should see Our Office Area Title: {string} on Contact Page")
    public void shouldSeeOurOfficeAreaTitleOnContactPage(String title) {
        String text = contactPage.shouldSeeOurOfficeAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Our Office Area Our Office Address Title: {string} on Contact Page")
    public void shouldSeeOurOfficeAreaOurOfficeAddressTitleOnContactPage(String title) {
        String text = contactPage.shouldSeeOurOfficeAreaOurOfficeAddressTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Our Office Area Our Office Address Description: {string} on Contact Page")
    public void shouldSeeOurOfficeAreaOurOfficeAddressDescriptionOnContactPage(String desc) {
        String text = contactPage.shouldSeeOurOfficeAreaOurOfficeAddressDescription();
        Assert.assertEquals(text, desc);
    }

    @Then("should see Our Office Area Our Office Address Icon on Contact Page")
    public void shouldSeeOurOfficeAreaOurOfficeAddressIconOnContactPage() {
        contactPage.shouldSeeOurOfficeAreaOurOfficeAddressIcon();
    }

    @Then("should see Our Office Area Our Office Phone Title: {string} on Contact Page")
    public void shouldSeeOurOfficeAreaOurOfficePhoneTitleOnContactPage(String title) {
        String text = contactPage.shouldSeeOurOfficeAreaOurOfficePhoneTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Our Office Area Our Office Phone Description: {string} on Contact Page")
    public void shouldSeeOurOfficeAreaOurOfficePhoneDescriptionOnContactPage(String desc) {
        String text = contactPage.shouldSeeOurOfficeAreaOurOfficePhoneDescription();
        Assert.assertEquals(text, desc);
    }

    @Then("should see Our Office Area Our Office Phone Icon on Contact Page")
    public void shouldSeeOurOfficeAreaOurOfficePhoneIconOnContactPage() {
        contactPage.shouldSeeOurOfficeAreaOurOfficePhoneIcon();
    }

    @Then("should see Follow Us Area Title: {string} on Contact Page")
    public void shouldSeeFollowUsAreaTitleOnContactPage(String title) {
        String text = contactPage.shouldSeeFollowUsAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Follow Us Area Facebook Icon on Contact Page")
    public void shouldSeeFollowUsAreaFacebookIconOnContactPage() {
        contactPage.shouldSeeFollowUsAreaFacebookIcon();
    }

    @Then("should see Follow Us Area Instagram Icon on Contact Page")
    public void shouldSeeFollowUsAreaInstagramIconOnContactPage() {
        contactPage.shouldSeeFollowUsAreaInstagramIcon();
    }

    @Then("should see Follow Us Area Twitter Icon on Contact Page")
    public void shouldSeeFollowUsAreaTwitterIconOnContactPage() {
        contactPage.shouldSeeFollowUsAreaTwitterIcon();
    }

    @Then("should see Follow Us Area Tiktok Icon on Contact Page")
    public void shouldSeeFollowUsAreaTiktokIconOnContactPage() {
        contactPage.shouldSeeFollowUsAreaTiktokIcon();
    }

    @Then("should see Web Support Area Title: {string} on Contact Page")
    public void shouldSeeWebSupportAreaTitleOnContactPage(String title) {
        String text = contactPage.shouldSeeWebSupportAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Web Support Area Mail: {string} on Contact Page")
    public void shouldSeeWebSupportAreaMailOnContactPage(String mail) {
        String text = contactPage.shouldSeeWebSupportAreaMail();
        Assert.assertEquals(text, mail);
    }

    @Then("should see Get In Touch Area Title: {string} on Contact Page")
    public void shouldSeeGetInTouchAreaTitleOnContactPage(String title) {
        String text = contactPage.shouldSeeGetInTouchAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Get In Touch Area Name: {string} on Contact Page")
    public void shouldSeeGetInTouchAreaNameOnContactPage(String name) {
        String text = contactPage.shouldSeeGetInTouchAreaName();
        Assert.assertEquals(text, name);
    }

    @Then("should see Get In Touch Area Name Textbox on Contact Page")
    public void shouldSeeGetInTouchAreaNameTextboxOnContactPage() {
        contactPage.shouldSeeGetInTouchAreaNameTextbox();
    }

    @Then("should see Get In Touch Area Email: {string} on Contact Page")
    public void shouldSeeGetInTouchAreaEmailOnContactPage(String mail) {
        String text = contactPage.shouldSeeGetInTouchAreaEmail();
        Assert.assertEquals(text, mail);
    }

    @Then("should see Get In Touch Area Email Textbox on Contact Page")
    public void shouldSeeGetInTouchAreaEmailTextboxOnContactPage() {
        contactPage.shouldSeeGetInTouchAreaEmailTextbox();
    }

    @Then("should see Get In Touch Area Subject: {string} on Contact Page")
    public void shouldSeeGetInTouchAreaSubjectOnContactPage(String subject) {
        String text = contactPage.shouldSeeGetInTouchAreaSubject();
        Assert.assertEquals(text, subject);
    }

    @Then("should see Get In Touch Area Subject Dropdown on Contact Page")
    public void shouldSeeGetInTouchAreaSubjectDropdownOnContactPage() {
        contactPage.shouldSeeGetInTouchAreaSubjectDropdown();
    }

    @Then("should see Get In Touch Area Subject Option: {string} on Contact Page")
    public void shouldSeeGetInTouchAreaSubjectOptionOnContactPage(String option) {
        contactPage.shouldSeeGetInTouchAreaSubjectOption(option);
    }

    @Then("should see Get In Touch Area Order Number: {string} on Contact Page")
    public void shouldSeeGetInTouchAreaOrderNumberOnContactPage(String number) {
        String text = contactPage.shouldSeeGetInTouchAreaOrderNumber();
        Assert.assertEquals(text, number);
    }

    @Then("should see Get In Touch Area Order Number Textbox on Contact Page")
    public void shouldSeeGetInTouchAreaOrderNumberTextboxOnContactPage() {
        contactPage.shouldSeeGetInTouchAreaOrderNumberTextbox();
    }

    @Then("should see Get In Touch Area Message: {string} on Contact Page")
    public void shouldSeeGetInTouchAreaMessageOnContactPage(String message) {
        String text = contactPage.shouldSeeGetInTouchAreaMessage();
        Assert.assertEquals(text, message);
    }

    @Then("should see Get In Touch Area Message Textbox on Contact Page")
    public void shouldSeeGetInTouchAreaMessageTextboxOnContactPage() {
        contactPage.shouldSeeGetInTouchAreaMessageTextbox();
    }

    @Then("should see Get In Touch Area Send Button: {string} on Contact Page")
    public void shouldSeeGetInTouchAreaSendButtonOnContactPage(String button) {
        String text = contactPage.shouldSeeGetInTouchAreaSendButton();
        Assert.assertEquals(text, button);
    }

    @Then("should see Get In Touch Area Name Required Message: {string} on Contact Page")
    public void shouldSeeGetInTouchAreaNameRequiredMessageOnContactPage(String message) {
        String text = contactPage.getNameRequiredMessage();
        Assert.assertEquals(text, message);
    }

    @Then("should see Get In Touch Area Mail Invalid Message: {string} on Contact Page")
    public void shouldSeeGetInTouchAreaMailInvalidMessageOnContactPage(String arg0) {
    }

    @Then("should see Get In Touch Area Subject Required Message: {string} on Contact Page")
    public void shouldSeeGetInTouchAreaSubjectRequiredMessageOnContactPage(String arg0) {
    }

    @Then("should see Get In Touch Area Order Number Required Message: {string} on Contact Page")
    public void shouldSeeGetInTouchAreaOrderNumberRequiredMessageOnContactPage(String arg0) {
    }

    @Then("should see Get In Touch Area Message Required Message: {string} on Contact Page")
    public void shouldSeeGetInTouchAreaMessageRequiredMessageOnContactPage(String arg0) {
    }
}
