package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.FAQPage;
import utils.DriverFactory;

public class FAQPageDefinitions {
    FAQPage faqPage = new FAQPage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the FAQ Page")
    public void userOnTheFAQPage() {
        faqPage.userOnTheFAQPage();
    }

    //WHEN's
    @When("click FAQ Area Question Three on FAQ Page")
    public void clickFAQAreaQuestionThreeOnFAQPage() {
        faqPage.clickFAQAreaQuestionThree();
    }

    @When("click FAQ Area Question One on FAQ Page")
    public void clickFAQAreaQuestionOneOnFAQPage() {
        faqPage.clickFAQAreaQuestionOne();
    }

    @When("click FAQ Area Question Two on FAQ Page")
    public void clickFAQAreaQuestionTwoOnFAQPage() {
        faqPage.clickFAQAreaQuestionTwo();
    }

    @When("click FAQ Area Question Four on FAQ Page")
    public void clickFAQAreaQuestionFourOnFAQPage() {
        faqPage.clickFAQAreaQuestionFour();
    }

    @When("click FAQ Area Question Five on FAQ Page")
    public void clickFAQAreaQuestionFiveOnFAQPage() {
        faqPage.clickFAQAreaQuestionFive();
    }

    @When("click FAQ Area Question Six on FAQ Page")
    public void clickFAQAreaQuestionSixOnFAQPage() {
        faqPage.clickFAQAreaQuestionSix();
    }

    @When("click Second Page on Pagionation on FAQ Page")
    public void clickSecondPageOnPagionationOnFAQPage() {
        faqPage.clickSecondPageOnPagionation();
    }

    @When("click Help With Area Shop on FAQ Page")
    public void clickHelpWithAreaAllOnFAQPage() {
        faqPage.clickHelpWithAreaShop();
    }

    @When("click Help With Area My Orders on FAQ Page")
    public void clickHelpWithAreaMyOrdersOnFAQPage() {
        faqPage.clickHelpWithAreaMyOrders();
    }

    @When("click Help With Area Coffee on FAQ Page")
    public void clickHelpWithAreaCoffeeOnFAQPage() {
        faqPage.clickHelpWithAreaBrewGuides();
    }

    @When("click Help With Area ContactUs on FAQ Page")
    public void clickHelpWithAreaContactUsOnFAQPage() {
        faqPage.clickHelpWithAreaContactUs();
    }

    //THEN's
    @Then("should see the FAQ Page")
    public void shouldSeeTheFAQPage() {
        faqPage.shouldSeeTheFAQPage();
    }

    @Then("should see Help With Area Title: {string} on FAQ Page")
    public void shouldSeeHelpWithAreaTitleOnFAQPage(String title) {
        String text = faqPage.shouldSeeHelpWithAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Help With Area Shop: {string} on FAQ Page")
    public void shouldSeeHelpWithAreaAllOnFAQPage(String shop) {
        String text = faqPage.shouldSeeHelpWithAreaShop();
        Assert.assertEquals(text, shop);

    }

    @Then("should see Help With Area My Orders: {string} on FAQ Page")
    public void shouldSeeHelpWithAreaMyOrdersOnFAQPage(String title) {
        String text = faqPage.shouldSeeHelpWithAreaMyOrders();
        Assert.assertEquals(text, title);
    }

    @Then("should see Help With Area Brew Guides: {string} on FAQ Page")
    public void shouldSeeHelpWithAreaCoffeeOnFAQPage(String title) {
        String text = faqPage.shouldSeeHelpWithAreaBrewGuides();
        Assert.assertEquals(text, title);
    }

    @Then("should see Help With Area ContactUs: {string} on FAQ Page")
    public void shouldSeeHelpWithAreaContactUsOnFAQPage(String title) {
        String text = faqPage.shouldSeeHelpWithAreaContactUs();
        Assert.assertEquals(text, title);
    }

    @Then("should see FAQ Area Title: {string} on FAQ Page")
    public void shouldSeeFAQAreaTitleOnFAQPage(String title) {
        String text = faqPage.shouldSeeFAQAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see FAQ Area Question One: {string} on FAQ Page")
    public void shouldSeeFAQAreaQuestionOneOnFAQPage(String question) {
        String text = faqPage.shouldSeeFAQAreaQuestionOne();
        Assert.assertEquals(text, question);
    }

    @Then("should see FAQ Area Answer One: {string} on FAQ Page")
    public void shouldSeeFAQAreaAnswerOneOnFAQPage(String answer) {
        String text = faqPage.shouldSeeFAQAreaAnswerOne();
        Assert.assertEquals(text, answer);
    }

    @Then("should see FAQ Area Question Two: {string} on FAQ Page")
    public void shouldSeeFAQAreaQuestionTwoOnFAQPage(String question) {
        String text = faqPage.shouldSeeFAQAreaQuestionTwo();
        Assert.assertEquals(text, question);
    }

    @Then("should see FAQ Area Answer Two: {string} on FAQ Page")
    public void shouldSeeFAQAreaAnswerTwoOnFAQPage(String answer) {
        String text = faqPage.shouldSeeFAQAreaAnswerTwo();
        Assert.assertEquals(text, answer);
    }

    @Then("should see FAQ Area Question Three: {string} on FAQ Page")
    public void shouldSeeFAQAreaQuestionThreeOnFAQPage(String question) {
        String text = faqPage.shouldSeeFAQAreaQuestionThree();
        Assert.assertEquals(text, question);
    }

    @Then("should see FAQ Area Answer Three: {string} on FAQ Page")
    public void shouldSeeFAQAreaAnswerThreeOnFAQPage(String answer) {
        String text = faqPage.shouldSeeFAQAreaAnswerThree();
        Assert.assertEquals(text, answer);
    }

    @Then("should see FAQ Area Question Four: {string} on FAQ Page")
    public void shouldSeeFAQAreaQuestionFourOnFAQPage(String question) {
        String text = faqPage.shouldSeeFAQAreaQuestionFour();
        Assert.assertEquals(text, question);

    }

    @Then("should see FAQ Area Answer Four: {string} on FAQ Page")
    public void shouldSeeFAQAreaAnswerFourOnFAQPage(String answer) {
        String text = faqPage.shouldSeeFAQAreaAnswerFour();
        Assert.assertEquals(text, answer);
    }

    @Then("should see FAQ Area Question Five: {string} on FAQ Page")
    public void shouldSeeFAQAreaQuestionFiveOnFAQPage(String question) {
        String text = faqPage.shouldSeeFAQAreaQuestionFive();
        Assert.assertEquals(text, question);
    }

    @Then("should see FAQ Area Answer Five: {string} on FAQ Page")
    public void shouldSeeFAQAreaAnswerFiveOnFAQPage(String answer) {
        String text = faqPage.shouldSeeFAQAreaAnswerFive();
        Assert.assertEquals(text, answer);
    }

    @Then("should see FAQ Area Question Six: {string} on FAQ Page")
    public void shouldSeeFAQAreaQuestionSixOnFAQPage(String question) {
        String text = faqPage.shouldSeeFAQAreaQuestionSix();
        Assert.assertEquals(text, question);
    }

    @Then("should see FAQ Area Answer Six: {string} on FAQ Page")
    public void shouldSeeFAQAreaAnswerSixOnFAQPage(String answer) {
        String text = faqPage.shouldSeeFAQAreaAnswerSix();
        Assert.assertEquals(text, answer);
    }

    @Then("should see FAQ Area Pagination Left Icon on FAQ Page")
    public void shouldSeeFAQAreaPaginationLeftIconOnFAQPage() {
        faqPage.shouldSeeFAQAreaPaginationLeftIcon();
    }

    @Then("should see FAQ Area Pagination Right Icon on FAQ Page")
    public void shouldSeeFAQAreaPaginationRightIconOnFAQPage() {
        faqPage.shouldSeeFAQAreaPaginationRightIcon();
    }

    @Then("should see FAQ Area Pagination Text: {string} on FAQ Page")
    public void shouldSeeFAQAreaPaginationTextOnFAQPage(String title) {
        faqPage.shouldSeeFAQAreaPaginationText(title);
    }
}
