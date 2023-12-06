package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.DriverFactory;
import pages.Shop2Page;

public class Shop2PageDefinitions {

    Shop2Page shop2Page = new Shop2Page(DriverFactory.getDriver());


    @Given("user on the ShopTwo Page")
    public void userOnTheShopTwoPage() {
        shop2Page.userOnTheShopTwoPage();

    }

    @Then("user should see Change Button on ShopTwo Page")
    public void userShouldSeeChangeButtonOnShopTwoPage() {
        shop2Page.userShouldSeeChangeButton();
    }

    @Then("user should see Whole Bean Coffees Button Title : {string} on ShopTwo Page")
    public void userShouldSeeWholeBeanCoffeesButtonTitleOnShopTwoPage(String title) {
       String text = shop2Page.userShouldSeeWholeBeanCoffeesButtonTitle();
        Assert.assertEquals(text,title);
    }

    @Then("user should see Capsules Coffees Button Title : {string} on ShopTwo Page")
    public void userShouldSeeCapsulesCoffeesButtonTitleOnShopTwoPage(String title) {
        String text =shop2Page.userShouldSeeCapsulesCoffeesButtonTitle();
        Assert.assertEquals(text,title);
    }

    @Then("user should see Drip Coffees Button Title : {string} on ShopTwo Page")
    public void userShouldSeeDripCoffeesButtonTitleOnShopTwoPage(String title) {
        String text =shop2Page.userShouldSeeDripCoffeesButtonTitle();
        Assert.assertEquals(text,title);
    }

    @Then("user should see Whole Bean Coffees Title : {string} on ShopTwo Page")
    public void userShouldSeeWholeBeanCoffeesTitleOnShopTwoPage(String title) {
        String text = shop2Page.userShouldSeeWholeBeanCoffeesTitle();
        Assert.assertEquals(text,title);
    }

    @Then("user should see Whole Bean Coffees Logo on ShopTwo Page")
    public void userShouldSeeWholeBeanCoffeesLogoOnShopTwoPage() {
        shop2Page.userShouldSeeWholeBeanCoffeesLogo();
    }

    @Then("user should see Capsules Coffees Title : {string} on ShopTwo Page")
    public void userShouldSeeCapsulesCoffeesTitleOnShopTwoPage(String title) {
        String text =shop2Page.userShouldSeeCapsulesCoffeesTitle();
        Assert.assertEquals(text,title);
    }

    @Then("user should see Capsules Coffees Logo on ShopTwo Page")
    public void userShouldSeeCapsulesCoffeesLogoOnShopTwoPage() {
        shop2Page.userShouldSeeCapsulesCoffeesLogo();
    }

    @Then("user should see Drip Coffees Title : {string} on ShopTwo Page")
    public void userShouldSeeDripCoffeesTitleOnShopTwoPage(String title) {
        String text = shop2Page.userShouldSeeDripCoffeesTitle();
        Assert.assertEquals(text,title);
    }

    @Then("user should see Drip Coffees Logo on ShopTwo Page")
    public void userShouldSeeDripCoffeesLogoOnShopTwoPage() {
        shop2Page.userShouldSeeDripCoffeesLogo();
    }

    @Then("user should see Honduras Opalca Coffee Title {string} on ShopTwo Page")
    public void userShouldSeeHondurasOpalcaCoffeeTitleOnShopTwoPage(String title) {
        String text = shop2Page.userShouldSeeHondurasOpalcaCoffeeTitle();
        Assert.assertEquals(text,title);
    }

    @Then("user should see Honduras Opalca Coffee price : {string} on ShopTwo Page")
    public void userShouldSeeHondurasOpalcaCoffeePriceOnShopTwoPage(String price) {
        String text = shop2Page.userShouldSeeHondurasOpalcaCoffeePrice();
        Assert.assertEquals(text,price);
    }

    @Then("user should see Honduras Opalca Coffee Image on ShopTwo Page")
    public void userShouldSeeHondurasOpalcaCoffeeImageOnShopTwoPage() {
        shop2Page.userShouldSeeHondurasOpalcaCoffeeImage();
    }

    @Then("user should see Chocolate Colombia Capsule Coffee Title : {string} on ShopTwo Page")
    public void userShouldSeeChocolateColombiaCapsuleCoffeeTitleOnShopTwoPage(String title) {
        String text = shop2Page.userShouldSeeChocolateColombiaCapsuleCoffeeTitle();
        Assert.assertEquals(text,title);
    }

    @Then("user should see Colombia Capsule Coffee Coffee price : {string} on ShopTwo Page")
    public void userShouldSeeColombiaCapsuleCoffeeCoffeePriceOnShopTwoPage(String price) {
        String text = shop2Page.userShouldSeeColombiaCapsuleCoffeeCoffeePrice();
        Assert.assertEquals(text,price);
    }

    @Then("user should see Colombia Capsule Coffee Image on ShopTwo Page")
    public void userShouldSeeColombiaCapsuleCoffeeImageOnShopTwoPage() {
        shop2Page.userShouldSeeColombiaCapsuleCoffeeImage();
    }

    @Then("user should see Traum Blend Capsule Coffee Title {string} on ShopTwo Page")
    public void userShouldSeeTraumBlendCapsuleCoffeeTitleOnShopTwoPage(String title) {
        String text = shop2Page.userShouldSeeTraumBlendCapsuleCoffeeTitle();
        Assert.assertEquals(text,title);
    }

    @Then("user should see Traum Blend Capsule Coffee price : {string} on ShopTwo Page")
    public void userShouldSeeTraumBlendCapsuleCoffeePriceOnShopTwoPage(String price) {
        String text = shop2Page.userShouldSeeTraumBlendCapsuleCoffeePrice();
        Assert.assertEquals(text,price);
    }

    @Then("user should see Traum Blend Capsule Coffee Image on ShopTwo Page")
    public void userShouldSeeTraumBlendCapsuleCoffeeImageOnShopTwoPage() {
        shop2Page.userShouldSeeTraumBlendCapsuleCoffeeImage();
    }

    @Then("user should see Burundi Drip Coffee Title {string} on ShopTwo Page")
    public void userShouldSeeBurundiDripCoffeeTitleOnShopTwoPage(String title) {
        String text = shop2Page.userShouldSeeBurundiDripCoffeeTitle();
        Assert.assertEquals(text,title);
    }

    @Then("user should see Burundi Drip Coffee price : {string} on ShopTwo Page")
    public void userShouldSeeBurundiDripCoffeePriceOnShopTwoPage(String price) {
        String text = shop2Page.userShouldSeeBurundiDripCoffeePrice();
        Assert.assertEquals(text,price);
    }

    @Then("user should see Burundi Drip Coffee Image on ShopTwo Page")
    public void userShouldSeeBurundiDripCoffeeImageOnShopTwoPage() {
        shop2Page.userShouldSeeBurundiDripCoffeeImage();
    }

    @Then("user should see Basket : {string} on ShopTwo Page")
    public void userShouldSeeBasketOnShopTwoPage(String title) {
        String text = shop2Page.userShouldSeeBasket();
        Assert.assertEquals(text,title);
    }

    @Then("user should see Complete Your Order Title : {string} on ShopTwo Page")
    public void userShouldSeeCompleteYourOrderTitleOnShopTwoPage(String title) {
        String text = shop2Page.userShouldSeeCompleteYourOrderTitle();
        Assert.assertEquals(text,title);
    }

    @When("user click Whole Bean Coffees on ShopTwo Page")
    public void userClickWholeBeanCoffeesOnShopTwoPage() {
        shop2Page.userClickWholeBeanCoffees();
    }

    @Then("user should see Whole Bean Coffees Area on Shop Two Page")
    public void userShouldSeeWholeBeanCoffeesAreaOnShopTwoPage() {
        shop2Page.userShouldSeeWholeBeanCoffeesArea();
    }

    @When("user click Capsules Coffees Button on ShopTwo Page")
    public void userClickCapsulesCoffeesButtonOnShopTwoPage() {
        shop2Page.userClickCapsulesCoffeesButton();
    }

    @Then("user should see Capsules Coffees Area on ShopTwo Page")
    public void userShouldSeeCapsulesCoffeesAreaOnShopTwoPage() {
        shop2Page.userShouldSeeCapsulesCoffeesArea();
    }

    @When("user click Drip Coffees Button on ShopTwo Page")
    public void userClickDripCoffeesButtonOnShopTwoPage() {
        shop2Page.userClickDripCoffeesButton();
    }

    @Then("user should see Drip Coffees Area on ShopTwo Page")
    public void userShouldSeeDripCoffeesAreaOnShopTwoPage() {
        shop2Page.userShouldSeeDripCoffeesArea();
    }

    @Then("user should see No Items : {string} on ShopTwo Page")
    public void userShouldSeeNoItemsOnShopTwoPage(String title) {
        shop2Page.userShouldSeeNoItems();

    }

    @Then("user should see Complete Your Order : {string} on ShopTwo Page")
    public void userShouldSeeCompleteYourOrderOnShopTwoPage(String title) {
        String text = shop2Page.userShouldSeeCompleteYourOrder();
        Assert.assertEquals(text,title);
    }

    @Then("user should see AED : {string} on ShopTwo Page")
    public void userShouldSeeAEDOnShopTwoPage(String price) {
        String text = shop2Page.userShouldSeeAED();
        Assert.assertEquals(text,price);
    }
}
