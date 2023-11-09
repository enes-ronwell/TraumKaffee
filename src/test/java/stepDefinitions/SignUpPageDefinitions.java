package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.SignInPage;
import pages.SignUpPage;
import utils.DriverFactory;

import java.util.Random;

public class SignUpPageDefinitions {

    SignUpPage SignUpPage = new SignUpPage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the Sign Up Page")
    public void userOnTheSignUpPage() {
        SignUpPage.userOnTheSignUpPage();
    }

    //WHEN's
    @When("sendkeys Last Name: {string} on Sign Up Page")
    public void sendkeysLastNameOnSignUpPage(String lastName) {
        SignUpPage.sendkeysLastName(lastName);
    }

    @When("sendkeys Email: {string} on Sign Up Page")
    public void sendkeysEmailOnSignUpPage(String email) {
        SignUpPage.sendkeysEmail(email);
    }

    @When("sendkeys Password: {string} on Sign Up Page")
    public void sendkeysPasswordOnSignUpPage(String password) {
        SignUpPage.sendkeysPassword(password);
    }

    @When("sendkeys Confirm Password: {string} on Sign Up Page")
    public void sendkeysConfirmPasswordOnSignUpPage(String confirmPass) {
        SignUpPage.sendkeysConfirmPassword(confirmPass);
    }

    @When("click Sign Up Button on Sign Up Page")
    public void clickSignUpButtonOnSignUpPage() {
        SignUpPage.clickSignUpButton();
    }

    @When("sendkeys First Name: {string} on Sign Up Page")
    public void sendkeysFirstNameOnSignUpPage(String firstName) {
        SignUpPage.sendkeysFirstName(firstName);
    }

    //THEN's
    @Then("should see Title: {string} on Sign Up Page")
    public void shouldSeeTitleOnSignUpPage(String title) {
        String text = SignUpPage.shouldSeeTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see First Name: {string} on Sign Up Page")
    public void shouldSeeFirstNameOnSignUpPage(String name) {
        String text = SignUpPage.shouldSeeFirstName();
        Assert.assertEquals(text, name);
    }

    @Then("should see First Name Textbox: {string} on Sign Up Page")
    public void shouldSeeFirstNameTextboxOnSignUpPage(String name) {
        String text = SignUpPage.shouldSeeFirstNameTextbox();
        Assert.assertEquals(text, name);
    }

    @Then("should see Last Name: {string} on Sign Up Page")
    public void shouldSeeLastNameOnSignUpPage(String name) {
        String text = SignUpPage.shouldSeeLastName();
        Assert.assertEquals(text, name);
    }

    @Then("should see Last Name Textbox: {string} on Sign Up Page")
    public void shouldSeeLastNameTextboxOnSignUpPage(String name) {
        String text = SignUpPage.shouldSeeLastNameTextbox();
        Assert.assertEquals(text, name);
    }

    @Then("should see Email Address: {string} on Sign Up Page")
    public void shouldSeeEmailAddressOnSignUpPage(String email) {
        String text = SignUpPage.shouldSeeEmailAddress();
        Assert.assertEquals(text, email);
    }

    @Then("should see Email Address Textbox: {string} on Sign Up Page")
    public void shouldSeeEmailAddressTextboxOnSignUpPage(String email) {
        String text = SignUpPage.shouldSeeEmailAddressTextbox();
        Assert.assertEquals(text, email);
    }

    @Then("should see Password: {string} on Sign Up Page")
    public void shouldSeePasswordOnSignUpPage(String password) {
        String pass = SignUpPage.shouldSeePassword();
        Assert.assertEquals(pass, password);
    }

    @Then("should see Password Textbox: {string} on Sign Up Page")
    public void shouldSeePasswordTextboxOnSignUpPage(String password) {
        String pass = SignUpPage.shouldSeePasswordTextbox();
        Assert.assertEquals(pass, password);
    }

    @Then("should see Password Hidden Button on Sign Up Page")
    public void shouldSeePasswordHiddenButtonOnSignUpPage() {
        SignUpPage.shouldSeePasswordHiddenButton();
    }

    @Then("should see Confirm Password: {string} on Sign Up Page")
    public void shouldSeeConfirmPasswordOnSignUpPage(String password) {
        String text = SignUpPage.shouldSeeConfirmPassword();
        Assert.assertEquals(text, password);
    }

    @Then("should see Confirm Password Textbox: {string} on Sign Up Page")
    public void shouldSeeConfirmPasswordTextboxOnSignUpPage(String password) {
        String pass = SignUpPage.shouldSeeConfirmPasswordTextbox();
        Assert.assertEquals(pass, password);
    }

    @Then("should see Confirm Password Hidden Button on Sign Up Page")
    public void shouldSeeConfirmPasswordHiddenButtonOnSignUpPage() {
        SignUpPage.shouldSeeConfirmPasswordHiddenButton();
    }

    @Then("should see Sign Up Button: {string} on Sign Up Page")
    public void shouldSeeSignUpButtonOnSignUpPage(String button) {
        String buttonText = SignUpPage.shouldSeeSignUpButton();
        Assert.assertEquals(buttonText, button);
    }

    @Then("should see Have an account: {string} on Sign Up Page")
    public void shouldSeeHaveAnAccountOnSignUpPage(String account) {
        String text = SignUpPage.shouldSeeHaveAnAccount();
        Assert.assertEquals(text, account);
    }

    @Then("should see Sign In: {string} on Sign Up Page")
    public void shouldSeeSignInOnSignUpPage(String button) {
        String text = SignUpPage.shouldSeeSignIn();
        Assert.assertEquals(text, button);
    }

    @Then("should see Popup Message: {string} on Sign Up Page")
    public void shouldSeePopupMessageOnSignUpPage(String message) {
        String text = SignUpPage.shouldSeePopupMessage();
        Assert.assertEquals(text, message);
    }

    @Then("should see Popup Icon on Sign Up Page")
    public void shouldSeePopupIconOnSignUpPage() {
        SignUpPage.shouldSeePopupIcon();
    }

    @Then("should see Empty Email Message: {string} on Sign Up Page")
    public void shouldSeeEmptyEmailMessageOnSignUpPage(String message) {
        String text = SignUpPage.shouldSeeEmptyEmailMessage();
        Assert.assertEquals(text, message);
    }

    @Then("should see Empty Password Message: {string} on Sign Up Page")
    public void shouldSeeEmptyPasswordMessageOnSignUpPage(String message) {
        String text = SignUpPage.shouldSeeEmptyPasswordMessage();
        Assert.assertEquals(text, message);
    }

    @Then("should see Empty Confirm Password Message: {string} on Sign Up Page")
    public void shouldSeeEmptyConfirmPasswordMessageOnSignUpPage(String message) {
        String text = SignUpPage.shouldSeeEmptyConfirmPasswordMessage();
        Assert.assertEquals(text, message);
    }

    @Then("should see Invalid Email Message: {string} on Sign Up Page")
    public void shouldSeeInvalidEmailMessageOnSignUpPage(String message) {
        String text = SignUpPage.shouldSeeInvalidEmailMessage();
        Assert.assertEquals(text, message);
    }

    @Then("should see Invalid Password Message: {string} on Sign Up Page")
    public void shouldSeeInvalidPasswordMessageOnSignUpPage(String message) {
        String text = SignUpPage.shouldSeeInvalidPasswordMessage();
        Assert.assertEquals(text, message);
    }

    @Then("should see Passwords Do Not Match Message: {string} on Sign Up Page")
    public void shouldSeePasswordsDoNotMatchMessageOnSignUpPage(String message) {
        String text = SignUpPage.shouldSeePasswordsDoNotMatchMessage();
        Assert.assertEquals(text, message);
    }

    @When("sendkeys Email: Random Mail on Sign Up Page")
    public void sendkeysEmailRandomMailOnSignUpPage() {
        Random r = new Random(); //random sınıfı
        String random = String.valueOf(r.nextInt(99999999));
        String email = "testAutomation" + random + "@ronwell.net";
        SignUpPage.sendkeysEmail(email);

    }
}
