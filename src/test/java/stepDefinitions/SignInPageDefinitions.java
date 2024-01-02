package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.General;
import pages.NavigationBar;
import pages.SignInPage;
import utils.DriverFactory;

public class SignInPageDefinitions {
    SignInPage SignInPage = new SignInPage(DriverFactory.getDriver());
    NavigationBar NavigationBar = new NavigationBar(DriverFactory.getDriver());
    General general = new General(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the Sign In Page")
    public void userOnTheSignInPage() {
        SignInPage.userOnTheSignInPage();
    }

    //WHEN's
    @When("sendkeys Email: {string} on Sign In Page")
    public void sendkeysEmailOnSignInPage(String mail) {
        SignInPage.sendkeysEmail(mail);
    }

    @When("click Sign In button on Sign In Page")
    public void clickSignInButtonOnSignInPage() {
        SignInPage.clickSignInButton();

    }

    @When("sendkeys Password: {string} on Sign In Page")
    public void sendkeysPasswordOnSignInPage(String pass) {
        SignInPage.sendkeysPassword(pass);
    }


    //THEN's
    @Then("should see Email: {string} on Sign In Page")
    public void shouldSeeEmailOnSignInPage(String mail) {
        String text = SignInPage.shouldSeeEmail();
        Assert.assertEquals(text, mail);
    }

    @Then("should see Email Textbox: {string} on Sign In Page")
    public void shouldSeeEmailTextboxOnSignInPage(String mail) {
        String text = SignInPage.shouldSeeEmailTextbox();
        Assert.assertEquals(text, mail);
    }

    @Then("should see Password: {string} on Sign In Page")
    public void shouldSeePasswordOnSignInPage(String pass) {
        String text = SignInPage.shouldSeePassword();
        Assert.assertEquals(text, pass);
    }

    @Then("should see Password Textbox: {string} on Sign In Page")
    public void shouldSeePasswordTextboxOnSignInPage(String pass) {
        String text = SignInPage.shouldSeePasswordTextbox();
        Assert.assertEquals(text, pass);
    }

    @Then("should see Password Hidden Button on Sign In Page")
    public void shouldSeePasswordHiddenButtonOnSignInPage() {
        SignInPage.shouldSeePasswordHiddenButton();
    }

    @Then("should see Remember Me: {string} on Sign In Page")
    public void shouldSeeRememberMeOnSignInPage(String remember) {
        String text = SignInPage.shouldSeeRememberMe();
        Assert.assertEquals(text, remember);
    }

    @Then("should see Remember Me Checkbox on Sign In Page")
    public void shouldSeeRememberMeCheckboxOnSignInPage() {
        SignInPage.shouldSeeRememberMeCheckbox();
    }

    @Then("should see I have forgotten my password: {string} on Sign In Page")
    public void shouldSeeIHaveForgottenMyPasswordOnSignInPage(String forgot) {
        String text = SignInPage.shouldSeeIHaveForgottenMyPassword();
        Assert.assertEquals(text, forgot);
    }

    @Then("should see SignIn Button: {string} on Sign In Page")
    public void shouldSeeSignInButtonOnSignInPage(String button) {
        String text = SignInPage.shouldSeeSignInButton();
        Assert.assertEquals(text, button);
    }

    @Then("should see Or Sign Up: {string} on Sign In Page")
    public void shouldSeeOrSignUpOnSignInPage(String orSignUp) {
        String text = SignInPage.shouldSeeOrSignUp();
        Assert.assertEquals(text, orSignUp);
    }

    @Then("should see Create an account: {string} on Sign In Page")
    public void shouldSeeCreateAnAccountOnSignInPage(String create) {
        String text = SignInPage.shouldSeeCreateAnAccount();
        Assert.assertEquals(text, create);
    }

    @Then("should see Sign Up: {string} on Sign In Page")
    public void shouldSeeSignUpOnSignInPage(String signUp) {
        String text = SignInPage.shouldSeeSignUp();
        Assert.assertEquals(text, signUp);

    }

    @Given("successfully Sign In with Mail:{string} and Password:{string} on Sign In Page")
    public void successfullySignInWithMailAndPasswordOnSignInPage(String mail, String pass) {
        NavigationBar.clickNavBarAreaSignIn();
        SignInPage.successfullySignInWithMailAndPassword(mail, pass);
        //general.clickPopupCloseIcon();
    }

    @Then("should see Password Empty Message: {string} on Sign In Page")
    public void shouldSeePasswordEmptyMessageOnSignInPage(String message) {
        String text = SignInPage.shouldSeePasswordEmptyMessage();
        Assert.assertEquals(message, text);
    }

    @Then("should see Email Invalid Message: {string} on Sign In Page")
    public void shouldSeeEmailInvalidMessageOnSignInPage(String message) {
        SignInPage.shouldSeeEmailInvalidMessage();
    }

    @Then("should see Password Invalid Message: {string} on Sign In Page")
    public void shouldSeePasswordInvalidMessageOnSignInPage(String message) {
        String text = SignInPage.shouldSeePasswordInvalidMessage();
        Assert.assertEquals(message, text);
    }

    @Then("should see the Sign In Page")
    public void shouldSeeTheSignInPage() {
        SignInPage.checkUrl();
    }

    @When("click Sign In Business Account Button on Sign In Page")
    public void clickSignInBusinessAccountButtonOnSignInPage() {
        SignInPage.clickSignInBusinessAccountButton();
    }

    @Then("should see the Business Email Title: {string} on Sign In Business Account Page")
    public void shouldSeeTheBusinessEmailTitleOnSignInBusinessAccountPage(String email) {
        String text = SignInPage.shouldSeeBusinessEmailTitle();
        Assert.assertEquals(email, text);
    }

    @Then("should see the Password Title: {string} on Sign In Business Account Page")
    public void shouldSeeThePasswordTitleOnSignInBusinessAccountPage(String password) {
        String text = SignInPage.shouldSeeBusinessPasswordTitle();
        Assert.assertEquals(password, text);
    }

    @Then("should see the Business Email Textbox: {string} on Sign In Business Account Page")
    public void shouldSeeTheBusinessEmailTextboxOnSignInBusinessAccountPage(String email) {
        String text = SignInPage.shouldSeeBusinessEmailTextbox();
        Assert.assertEquals(text, email);
    }

    @Then("should see the Password Textbox: {string} on Sign In Business Account Page")
    public void shouldSeeThePasswordTextboxOnSignInBusinessAccountPage(String password) {
        String text = SignInPage.shouldSeeBusinessPasswordTextbox();
        Assert.assertEquals(text, password);
    }

    @Then("should see the Sign In Button: {string} on Sign In Business Account Page")
    public void shouldSeeTheSignInButtonOnSignInBusinessAccountPage(String button) {
        String text = SignInPage.shouldSeeSignInButton();
        Assert.assertEquals(text, button);
    }

    @Then("should see the Sign Up Business Account Button: {string} on Sign In Business Account Page")
    public void shouldSeeTheSignUpBusinessAccountButtonOnSignInBusinessAccountPage(String button) {
        String text = SignInPage.shouldSeeSignUpBusinessAccountButton();
        Assert.assertEquals(button, text);
    }
}
