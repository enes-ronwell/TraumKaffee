package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.General;
import pages.MyAccountPage;
import pages.NavigationBar;
import pages.SignInPage;
import utils.DriverFactory;

public class MyAccountPageDefinitions {
    MyAccountPage myAccountPage = new MyAccountPage(DriverFactory.getDriver());
    NavigationBar NavigationBar = new NavigationBar(DriverFactory.getDriver());
    SignInPage SignInPage = new SignInPage(DriverFactory.getDriver());
    General general = new General(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the My Account Page with Mail: {string} and Password: {string}")
    public void userOnTheMyAccountPageWithMailAndPassword(String mail, String pass) {
        SignInPage.userOnTheSignInPage();
        myAccountPage.userOnTheMyAccountPageWithMailAndPassword(mail, pass);
        general.clickPopupCloseIcon();
        NavigationBar.clickNavBarAreaMyAccount();
    }

    //WHEN's
    @When("click My Account Area Account on My Account Page")
    public void clickMyAccountAreaAccountOnMyAccountPage() {
        myAccountPage.clickMyAccountAreaAccount();
    }

    @When("click My Account Area Addresses on My Account Page")
    public void clickMyAccountAreaAddressesOnMyAccountPage() {
        myAccountPage.clickMyAccountAreaAddresses();
    }

    @When("click My Account Area Order History on My Account Page")
    public void clickMyAccountAreaOrderHistoryOnMyAccountPage() {
        myAccountPage.clickMyAccountAreaOrderHistory();
    }

    @When("click My Account Area Sign Out on My Account Page")
    public void clickMyAccountAreaSignOutOnMyAccountPage() {
        myAccountPage.clickMyAccountAreaSignOut();
    }

    //THEN's
    @Then("should see the My Account Page")
    public void shouldSeeTheMyAccountPage() {
        myAccountPage.shouldSeeTheMyAccountPage();
    }

    @Then("should see My Account Area Title: {string} on My Account Page")
    public void shouldSeeMyAccountAreaTitleOnMyAccountPage(String title) {
        String text = myAccountPage.shouldSeeMyAccountAreaTitle();
    }

    @Then("should see My Account Area Account: {string} on My Account Page")
    public void shouldSeeMyAccountAreaAccountOnMyAccountPage(String account) {
        String text = myAccountPage.shouldSeeMyAccountAreaAccount();
        Assert.assertEquals(text, account);
    }

    @Then("should see My Account Area Account Image on My Account Page")
    public void shouldSeeMyAccountAreaAccountImageOnMyAccountPage() {
        myAccountPage.shouldSeeMyAccountAreaAccountImage();
    }

    @Then("should see My Account Area Addresses: {string} on My Account Page")
    public void shouldSeeMyAccountAreaAddressesOnMyAccountPage(String addresses) {
        String text = myAccountPage.shouldSeeMyAccountAreaAddresses();
        Assert.assertEquals(text, addresses);
    }

    @Then("should see My Account Area Addresses Image on My Account Page")
    public void shouldSeeMyAccountAreaAddressesImageOnMyAccountPage() {
        myAccountPage.shouldSeeMyAccountAreaAddressesImage();
    }

    @Then("should see My Account Area Order History: {string} on My Account Page")
    public void shouldSeeMyAccountAreaOrderHistoryOnMyAccountPage(String history) {
        String text = myAccountPage.shouldSeeMyAccountAreaOrderHistory();
        Assert.assertEquals(text, history);
    }

    @Then("should see My Account Area Order History Image on My Account Page")
    public void shouldSeeMyAccountAreaOrderHistoryImageOnMyAccountPage() {
        myAccountPage.shouldSeeMyAccountAreaOrderHistoryImage();
    }

    @Then("should see My Account Area Sign Out: {string} on My Account Page")
    public void shouldSeeMyAccountAreaSignOutOnMyAccountPage(String signOut) {
        String text = myAccountPage.shouldSeeMyAccountAreaSignOut();
        Assert.assertEquals(text, signOut);
    }

    @Then("should see My Account Area Sign Out Image on My Account Page")
    public void shouldSeeMyAccountAreaSignOutImageOnMyAccountPage() {
        myAccountPage.shouldSeeMyAccountAreaSignOutImage();
    }


}
