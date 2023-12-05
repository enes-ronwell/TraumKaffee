package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.StoreSelectionPage;
import utils.DriverFactory;

public class StoreSelectionPageDefinitions {

    StoreSelectionPage storeSelectionPage = new StoreSelectionPage(DriverFactory.getDriver());

    @Given("user on the Store Selection Page")
    public void userOnTheStoreSelectionPage() {
        storeSelectionPage.userOnTheStoreSelectionPage("https://dev.traumkaffee.com/product");
    }

    @Then("should see Title: {string} on Store Selection Page")
    public void shouldSeeTitleOnStoreSelectionPage(String title) {
        String storeSelectionPageTitle = storeSelectionPage.checkTitle();
        Assert.assertEquals(storeSelectionPageTitle, title);
    }

    @Then("should see First Stores Order Now Button: {string} on Store Selection Page")
    public void shouldSeeFirstStoresOrderNowButtonOnStoreSelectionPage(String button) {
        String firstStoreOrderNowButton = storeSelectionPage.checkFirstStoresOrderNowButtonOnStoreSelectionPage();
        Assert.assertEquals(firstStoreOrderNowButton, button);
    }

    @Then("should see Second Stores Order Now Button: {string} on Store Selection Page")
    public void shouldSeeSecondStoresOrderNowButtonOnStoreSelectionPage(String button) {
        String secondStoreOrderNowButton = storeSelectionPage.checkSecondStoresOrderNowButtonOnStoreSelectionPage();
        Assert.assertEquals(secondStoreOrderNowButton, button);
    }

    @Then("should see Map on Store Selection Page")
    public void shouldSeeMapOnStoreSelectionPage() {
        storeSelectionPage.shouldSeeMapOnStoreSelectionPage();
    }

    @When("click the First Stores Order Now Button on Store Selection Page")
    public void clickTheFirstStoresOrderNowButtonOnStoreSelectionPage() {
        storeSelectionPage.clickTheFirstStoresOrderNowButtonOnStoreSelectionPage();
    }

    @When("click the Second Stores Order Now Button on Store Selection Page")
    public void clickTheSecondStoresOrderNowButtonOnStoreSelectionPage() {
        storeSelectionPage.clickTheSecondStoresOrderNowButtonOnStoreSelectionPage();
    }

    @Then("should see the First Stores Address: {string} on the Shop Page")
    public void shouldSeeTheFirstStoresAddressOnTheShopPage(String address) {
        String firstStoresAddress = storeSelectionPage.shouldSeeTheFirstStoresAddressOnTheShopPage();
        Assert.assertEquals(firstStoresAddress, address);
    }

    @Then("should see the Second Stores Address: {string} on the Shop Page")
    public void shouldSeeTheSecondStoresAddressOnTheShopPage(String address) {
        String secondStoresAddress = storeSelectionPage.shouldSeeTheSecondStoresAddressOnTheShopPage();
        Assert.assertEquals(secondStoresAddress, address);
    }
}
