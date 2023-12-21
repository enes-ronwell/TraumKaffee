package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.*;
import utils.DriverFactory;

public class AccountDetailsPageDefinitions {
    AccountDetailsPage accountDetailsPage = new AccountDetailsPage(DriverFactory.getDriver());
    SignInPage SignInPage = new SignInPage(DriverFactory.getDriver());
    NavigationBar NavigationBar = new NavigationBar(DriverFactory.getDriver());
    General general = new General(DriverFactory.getDriver());
    HomePage homePage = new HomePage(DriverFactory.getDriver());


    //GİVEN's

    @Given("user on the Account Details Page with Mail:{string} and Password:{string}")
    public void userOnTheAccountDetailsPageWithMailAndPassword(String mail, String pass) {
        homePage.goToHomePage("https://dev.traumkaffee.com/");
        NavigationBar.clickNavBarAreaSignIn();
        SignInPage.successfullySignInWithMailAndPassword(mail, pass);
        NavigationBar.clickNavBarAreaMyAccount();
    }

    //WHEN's
    @When("sendkeys Account Details Area First Name: {string} on Account Details Page")
    public void sendkeysAccountDetailsAreaFirstNameOnAccountDetailsPage(String firstName) {
        accountDetailsPage.sendkeysAccountDetailsAreaFirstName(firstName);
    }

    @When("sendkeys Account Details Area Last Name: {string} on Account Details Page")
    public void sendkeysAccountDetailsAreaLastNameOnAccountDetailsPage(String lastName) {
        accountDetailsPage.sendkeysAccountDetailsAreaLastName(lastName);
    }

    @When("sendkeys Account Details Area Email: {string} on Account Details Page")
    public void sendkeysAccountDetailsAreaEmailOnAccountDetailsPage(String email) {
        accountDetailsPage.sendkeysAccountDetailsAreaEmail(email);
    }


    @When("click Account Details Area Update on Account Details Page")
    public void clickAccountDetailsAreaUpdateOnAccountDetailsPage() {
        accountDetailsPage.clickAccountDetailsAreaUpdate();
    }

    @When("sendkeys Account Details Area Password: {string} on Account Details Page")
    public void sendkeysAccountDetailsAreaPasswordOnAccountDetailsPage(String password) {
        accountDetailsPage.sendkeysAccountDetailsAreaPassword(password);
    }


    @When("clear Account Details Area First Name on Account Details Page")
    public void clearAccountDetailsAreaFirstNameOnAccountDetailsPage() {
        accountDetailsPage.clearAccountDetailsAreaFirstName();
    }

    @When("clear Account Details Area Last Name on Account Details Page")
    public void clearAccountDetailsAreaLastNameOnAccountDetailsPage() {
        accountDetailsPage.clearAccountDetailsAreaLastName();
    }

    //THEN's
    @Then("should see Account Details Page")
    public void shouldSeeAccountDetailsPage() {
        accountDetailsPage.shouldSeeAccountDetailsPage();
    }

    @Then("should see Account Details Area First Name: {string} on Account Details Page")
    public void shouldSeeAccountDetailsAreaFirstNameOnAccountDetailsPage(String firstName) {
        String text = accountDetailsPage.shouldSeeAccountDetailsAreaFirstName();
        Assert.assertEquals(text, firstName);
    }

    @Then("should see Account Details Area Last Name: {string} on Account Details Page")
    public void shouldSeeAccountDetailsAreaLastNameOnAccountDetailsPage(String lastName) {
        String text = accountDetailsPage.shouldSeeAccountDetailsAreaLastName();
        Assert.assertEquals(text, lastName);
    }

    @Then("should see Account Details Area Email: {string} on Account Details Page")
    public void shouldSeeAccountDetailsAreaEmailOnAccountDetailsPage(String email) {
        String text = accountDetailsPage.shouldSeeAccountDetailsAreaEmail();
        Assert.assertEquals(text, email);
    }

    @Then("should see Account Details Area Password: {string} on Account Details Page")
    public void shouldSeeAccountDetailsAreaPasswordOnAccountDetailsPage(String password) {
        String text = accountDetailsPage.shouldSeeAccountDetailsAreaPassword();
    }

    @Then("should see Account Details Area Password Eye on Account Details Page")
    public void shouldSeeAccountDetailsAreaPasswordEyeOnAccountDetailsPage() {
        accountDetailsPage.shouldSeeAccountDetailsAreaPasswordEye();
    }

    @Then("should see Account Details Area Checkbox: {string} on Account Details Page")
    public void shouldSeeAccountDetailsAreaCheckboxOnAccountDetailsPage(String checkbox) {
        String text = accountDetailsPage.shouldSeeAccountDetailsAreaCheckbox();
        Assert.assertEquals(text, checkbox);
    }

    @Then("should see Account Details Area Checkbox on Account Details Page")
    public void shouldSeeAccountDetailsAreaCheckboxOnAccountDetailsPage() {
        accountDetailsPage.shouldSeeAccountDetailsAreaCheckboxCheck();
    }

    @Then("should see Account Details Area Update: {string} on Account Details Page")
    public void shouldSeeAccountDetailsAreaUpdateOnAccountDetailsPage(String update) {
        String text = accountDetailsPage.shouldSeeAccountDetailsAreaUpdate();
        Assert.assertEquals(text, update);
    }


    @When("user click First Name Text Box on Account Details Page")
    public void userClickFirstNameTextBoxOnAccountDetailsPage() {
        accountDetailsPage.userClickFirstNameTextBoxOnAccountDetailsPage();
    }
}
