package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BecomeOurPartnerPage;
import pages.CoffeeAtWorkPage;
import pages.NavigationBar;
import utils.DriverFactory;

public class NavigationBarDefinitions {
    NavigationBar NavigationBar = new NavigationBar(DriverFactory.getDriver());

    //GİVEN's

    //WHEN's
    @When("click NavBar Area Traum Image on Navigation Bar")
    public void clickNavBarAreaTraumImageOnNavigationBar() {
        NavigationBar.clickNavBarAreaTraumImage();
    }

    @When("click NavBar Area Shop on Navigation Bar")
    public void clickNavBarAreaShopOnNavigationBar() {
        NavigationBar.clickNavBarAreaShop();
    }

    @When("click NavBar Area About on Navigation Bar")
    public void clickNavBarAreaAboutOnNavigationBar() {
        NavigationBar.clickNavBarAreaAbout();
    }

    @When("hover NavBar Area About on Navigation Bar")
    public void hoverNavBarAreaAboutOnNavigationBar() {
        NavigationBar.hoverAbout();
    }

    @When("click NavBar Area Option About on Navigation Bar")
    public void clickNavBarAreaOptionAboutOnNavigationBar() {
        NavigationBar.clickNavBarAreaOptionAbout();
    }

    @When("click NavBar Area Sustainability on Navigation Bar")
    public void clickNavBarAreaSustainabilityOnNavigationBar() {
        NavigationBar.clickNavBarAreaSustainability();
    }

    @When("click NavBar Area Contact on Navigation Bar")
    public void clickNavBarAreaContactOnNavigationBar() {
        NavigationBar.clickNavBarAreaContact();
    }

    @When("click NavBar Area Learn on Navigation Bar")
    public void clickNavBarAreaLearnOnNavigationBar() {
        NavigationBar.clickNavBarAreaLearn();
    }


    @When("hover NavBar Area Learn on Navigation Bar")
    public void hoverNavBarAreaLearnOnNavigationBar() {
        NavigationBar.hoverLearn();
    }

    @When("click NavBar Area Brew Guides on Navigation Bar")
    public void clickNavBarAreaBrewGuidesOnNavigationBar() {
        NavigationBar.clickNavBarAreaBrewGuides();
    }

    @When("click NavBar Area Blog on Navigation Bar")
    public void clickNavBarAreaBlogOnNavigationBar() {
        NavigationBar.clickNavBarAreaBlog();
    }

    @When("click NavBar Area Whosale on Navigation Bar")
    public void clickNavBarAreaWhosaleOnNavigationBar() {
        NavigationBar.clickNavBarAreaWhosale();
    }


    @When("hover NavBar Area Whosale on Navigation Bar")
    public void hoverNavBarAreaWhosaleOnNavigationBar() {
        NavigationBar.hoverWhosale();
    }

    @When("click NavBar Area Whosale Option on Navigation Bar")
    public void clickNavBarAreaWhosaleOptionOnNavigationBar() {
        NavigationBar.clickNavBarAreaWhosaleOption();
    }

    @When("click NavBar Area Coffee for Restaurant on Navigation Bar")
    public void clickNavBarAreaCoffeeForRestaurantOnNavigationBar() {
        NavigationBar.clickNavBarAreaCoffeeForRestaurant();
    }

    @When("click NavBar Area Coffee For Hotels on Navigation Bar")
    public void clickNavBarAreaCoffeeForHotelsOnNavigationBar() {
        NavigationBar.clickNavBarAreaCoffeeForHotels();
    }

    @When("click NavBar Area Cafes And Coffee Shops on Navigation Bar")
    public void clickNavBarAreaCafesAndCoffeeShopsOnNavigationBar() {
        NavigationBar.clickNavBarAreaCafesAndCoffeeShops();
    }

    @When("click NavBar Area Coffee At Work on Navigation Bar")
    public void clickNavBarAreaCoffeeAtWorkOnNavigationBar() {
        NavigationBar.clickNavBarAreaCoffeeAtWork();
    }

    @When("click NavBar Area Equipments on Navigation Bar")
    public void clickNavBarAreaEquipmentsOnNavigationBar() {
        NavigationBar.clickNavBarAreaEquipments();
    }

    @When("click NavBar Area Training on Navigation Bar")
    public void clickNavBarAreaTrainingOnNavigationBar() {
        NavigationBar.clickNavBarAreaTraining();
    }

    @When("click NavBar Area Become Our Partner on Navigation Bar")
    public void clickNavBarAreaBecomeOurPartnerOnNavigationBar() {
        NavigationBar.clickNavBarAreaBecomeOurPartner();
    }

    @When("click NavBar Area Sign In on Navigation Bar")
    public void clickNavBarAreaSignInOnNavigationBar() {
        NavigationBar.clickNavBarAreaSignIn();
    }

    @When("click NavBar Area Shopping Cart on Navigation Bar")
    public void clickNavBarAreaShoppingCartOnNavigationBar() {
        NavigationBar.clickNavBarAreaShoppingCart();
    }

    @When("click NavBar Area My Account on Navigation Bar")
    public void clickNavBarAreaMyAccountOnNavigationBar() {
        NavigationBar.clickNavBarAreaMyAccount();
    }

    //THEN's
    @Then("should see Basket Number: {string} on Navigation Bar")
    public void shouldSeeBasketNumberOnNavigationBar(String number) {
        String text = NavigationBar.shouldSeeBasketNumber();
        Assert.assertEquals(number, text);
    }

    @Then("should see NavBar Area Traum Image on Navigation Bar")
    public void shouldSeeNavBarAreaTraumImageOnNavigationBar() {
        NavigationBar.shouldSeeNavBarAreaTraumImage();
    }

    @Then("should see NavBar Area Shop: {string} on Navigation Bar")
    public void shouldSeeNavBarAreaShopOnNavigationBar(String title) {
        String text = NavigationBar.shouldSeeNavBarAreaShop();
        Assert.assertEquals(text, title);
    }

    @Then("should see NavBar Area About: {string} on Navigation Bar")
    public void shouldSeeNavBarAreaAboutOnNavigationBar(String title) {
        String text = NavigationBar.shouldSeeNavBarAreaAbout();
        Assert.assertEquals(text, title);
    }

    @Then("should see NavBar Area About Option: {string} on Navigation Bar")
    public void shouldSeeNavBarAreaAboutOptionOnNavigationBar(String option) {
        NavigationBar.shouldSeeNavBarAreaAboutOption(option);
    }

    @Then("should see NavBar Area Learn: {string} on Navigation Bar")
    public void shouldSeeNavBarAreaLearnOnNavigationBar(String title) {
        String text = NavigationBar.shouldSeeNavBarAreaLearn();
        Assert.assertEquals(text, title);
    }

    @Then("should see NavBar Area Learn Option: {string} on Navigation Bar")
    public void shouldSeeNavBarAreaLearnOptionOnNavigationBar(String option) {
        NavigationBar.shouldSeeNavBarAreaLearnOption(option);
    }

    @Then("should see NavBar Area Whosale: {string} on Navigation Bar")
    public void shouldSeeNavBarAreaWhosaleOnNavigationBar(String title) {
        String text = NavigationBar.shouldSeeNavBarAreaWhosale();
        Assert.assertEquals(text, title);
    }

    @Then("should see NavBar Area Whosale Option: {string} on Navigation Bar")
    public void shouldSeeNavBarAreaWhosaleOptionOnNavigationBar(String option) {
        NavigationBar.shouldSeeNavBarAreaWhosaleOption(option);
    }

    @Then("should see NavBar Area Become Our Partner: {string} on Navigation Bar")
    public void shouldSeeNavBarAreaBecomeOurPartnerOnNavigationBar(String title) {
        String text = NavigationBar.shouldSeeNavBarAreaBecomeOurPartner();
        Assert.assertEquals(text, title);
    }

    @Then("should see NavBar Area Sign In Button: {string} on Navigation Bar")
    public void shouldSeeNavBarAreaSignInButtonOnNavigationBar(String button) {
        String text = NavigationBar.shouldSeeNavBarAreaSignInButton();
        Assert.assertEquals(text, button);
    }

    @Then("should see NavBar Area Shopping Cart Icon on Navigation Bar")
    public void shouldSeeNavBarAreaShoppingCartIconOnNavigationBar() {
        NavigationBar.shouldSeeNavBarAreaShoppingCartIcon();
    }

    @Then("should see NavBar Area Shopping Cart Count: {string} on Navigation Bar")
    public void shouldSeeNavBarAreaShoppingCartCountOnNavigationBar(String count) {
        String text = NavigationBar.shouldSeeNavBarAreaShoppingCartCount();
        Assert.assertEquals(text, count);
    }

    @When("click Navbar Area Coffee Academy on Navigation Bar")
    public void clickNavbarAreaCoffeeAcademyOnNavigationBar() {
        NavigationBar.clickCoffeeAcademyButton();
    }
}
