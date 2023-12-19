package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Shop2Page2;
import utils.DriverFactory;

public class Shop2Page2Definitions {

    Shop2Page2 shop2Page2 = new Shop2Page2(DriverFactory.getDriver());

    @Given("user on the ShopTwo PageTwo")
    public void userOnTheShopTwoPageTwo() {
        shop2Page2.userOnTheShopTwoPageTwo();
    }

    @Then("user should see Change Button on ShopTwo PageTwo")
    public void userShouldSeeChangeButtonOnShopTwoPageTwo() {
        shop2Page2.userShouldSeeChangeButton();
    }

    @Then("user should see Whole Bean Coffees Button Title : {string} on ShopTwo PageTwo")
    public void userShouldSeeWholeBeanCoffeesButtonTitleOnShopTwoPageTwo(String title) {
        String text = shop2Page2.userShouldSeeWholeBeanCoffeesButtonTitle();
        Assert.assertEquals(text, title);
    }

    @Then("user should see Capsules Coffees Button Title : {string} on ShopTwo PageTwo")
    public void userShouldSeeCapsulesCoffeesButtonTitleOnShopTwoPageTwo(String title) {
        String text = shop2Page2.userShouldSeeCapsulesCoffeesButtonTitle();
        Assert.assertEquals(text, title);
    }

    @Then("user should see Drip Coffees Button Title : {string} on ShopTwo PageTwo")
    public void userShouldSeeDripCoffeesButtonTitleOnShopTwoPageTwo(String title) {
        String text = shop2Page2.userShouldSeeDripCoffeesButtonTitle();
        Assert.assertEquals(text, title);
    }

    @Then("user should see Whole Bean Coffees Title : {string} on ShopTwo PageTwo")
    public void userShouldSeeWholeBeanCoffeesTitleOnShopTwoPageTwo(String title) {
        String text = shop2Page2.userShouldSeeWholeBeanCoffeesTitle();
        Assert.assertEquals(text, title);
    }

    @Then("user should see Whole Bean Coffees Logo on ShopTwo PageTwo")
    public void userShouldSeeWholeBeanCoffeesLogoOnShopTwoPageTwo() {
        shop2Page2.userShouldSeeWholeBeanCoffeesLogo();
    }

    @Then("user should see Capsules Coffees Title : {string} on ShopTwo PageTwo")
    public void userShouldSeeCapsulesCoffeesTitleOnShopTwoPageTwo(String title) {
        String text = shop2Page2.userShouldSeeCapsulesCoffeesTitle();
        Assert.assertEquals(text, title);
    }

    @Then("user should see Capsules Coffees Logo on ShopTwo PageTwo")
    public void userShouldSeeCapsulesCoffeesLogoOnShopTwoPageTwo() {
        shop2Page2.userShouldSeeCapsulesCoffeesLogo();
    }

    @Then("user should see Drip Coffees Title : {string} on ShopTwo PageTwo")
    public void userShouldSeeDripCoffeesTitleOnShopTwoPageTwo(String title) {
        String text = shop2Page2.userShouldSeeDripCoffeesTitle();
        Assert.assertEquals(text, title);
    }

    @Then("user should see Drip Coffees Logo on ShopTwo PageTwo")
    public void userShouldSeeDripCoffeesLogoOnShopTwoPageTwo() {
        shop2Page2.userShouldSeeDripCoffeesLogo();
    }

    @Then("user should see Chocolate Colombia Coffee Title : {string} on ShopTwo PageTwo")
    public void userShouldSeeChocolateColombiaCoffeeTitleOnShopTwoPageTwo(String title) {
        String text = shop2Page2.userShouldSeeChocolateColombiaCoffeeTitle();
        Assert.assertEquals(text, title);
    }

    @Then("user should see Chocolate Colombia coffee Price : {string} on ShopTwo PageTwo")
    public void userShouldSeeChocolateColombiaCoffeePriceOnShopTwoPageTwo(String price) {
        String text = shop2Page2.userShouldSeeChocolateColombiaCoffeePrice();
        Assert.assertEquals(text, price);
    }

    @Then("user should see Almond Colombia Coffee Title : {string} on ShopTwo PageTwo")
    public void userShouldSeeAlmondColombiaCoffeeTitleOnShopTwoPageTwo(String title) {
        String text = shop2Page2.userShouldSeeAlmondColombiaCoffeeTitle();
        Assert.assertEquals(text, title);
    }

    @Then("user should see Almond Colombia Coffee Price : {string} on ShopTwo PageTwo")
    public void userShouldSeeAlmondColombiaCoffeePriceOnShopTwoPageTwo(String price) {
        String text = shop2Page2.userShouldSeeAlmondColombiaCoffeePrice();
        Assert.assertEquals(text, price);
    }

    @Then("user should see Traum Blend Coffee Title : {string} on ShopTwo PageTwo")
    public void userShouldSeeTraumBlendCoffeeTitleOnShopTwoPageTwo(String title) {
        String text = shop2Page2.userShouldSeeTraumBlendCoffeeTitle();
        Assert.assertEquals(text, title);
    }

    @Then("user should see Traum Blend Coffee Price : {string} on ShopTwo PageTwo")
    public void userShouldSeeTraumBlendCoffeePriceOnShopTwoPageTwo(String price) {
        String text = shop2Page2.userShouldSeeTraumBlendCoffeePrice();
        Assert.assertEquals(text, price);
    }

    @Then("user should see Traum Kickstart Coffee Title : {string} on ShopTwo PageTwo")
    public void userShouldSeeTraumKickstartCoffeeTitleOnShopTwoPageTwo(String title) {
        String text = shop2Page2.userShouldSeeTraumKickstartCoffeeTitle();
        Assert.assertEquals(text, title);
    }

    @Then("user should see Traum Kickstart Coffee Price : {string} on ShopTwo PageTwo")
    public void userShouldSeeTraumKickstartCoffeePriceOnShopTwoPageTwo(String price) {
        String text = shop2Page2.userShouldSeeTraumKickstartCoffeePrice();
        Assert.assertEquals(text, price);
    }

    @Then("user should see El Salvador Apaneca Coffee Title : {string} on ShopTwo PageTwo")
    public void userShouldSeeElSalvadorApanecaCoffeeTitleOnShopTwoPageTwo(String title) {
        String text = shop2Page2.userShouldSeeElSalvadorApanecaCoffeeTitle();
        Assert.assertEquals(text, title);
    }

    @Then("user should see El Salvador Apaneca Coffee Price : {string} on ShopTwo PageTwo")
    public void userShouldSeeElSalvadorApanecaCoffeePriceOnShopTwoPageTwo(String price) {
        String text = shop2Page2.userShouldSeeElSalvadorApanecaCoffeePrice();
        Assert.assertEquals(text, price);
    }

    @Then("user should see Honduras Opalca Coffee Title : {string} on ShopTwo PageTwo")
    public void userShouldSeeHondurasOpalcaCoffeeTitleOnShopTwoPageTwo(String title) {
        String text = shop2Page2.userShouldSeeHondurasOpalcaCoffeeTitle();
        Assert.assertEquals(text, title);
    }

    @Then("user should see Honduras Opalca Coffee Price : {string} on ShopTwo PageTwo")
    public void userShouldSeeHondurasOpalcaCoffeePriceOnShopTwoPageTwo(String price) {
        String text = shop2Page2.userShouldSeeHondurasOpalcaCoffeePrice();
        Assert.assertEquals(text, price);

    }

    @Then("user should see Traum Kick Start Capsule Coffee Title : {string} on ShopTwo PageTwo")
    public void userShouldSeeTraumKickStartCapsuleCoffeeTitleOnShopTwoPageTwo(String title) {
        String text = shop2Page2.userShouldSeeTraumKickStartCapsuleCoffeeTitle();
        Assert.assertEquals(text, title);
    }

    @Then("user should see Traum Kick Start Capsule Coffee Price : {string} on ShopTwo PageTwo")
    public void userShouldSeeTraumKickStartCapsuleCoffeePriceOnShopTwoPageTwo(String price) {
        String text = shop2Page2.userShouldSeeTraumKickStartCapsuleCoffeePrice();
        Assert.assertEquals(text, price);
    }

    @Then("user should see Kenya Capsule Coffee Title :{string} on ShopTwo PageTwo")
    public void userShouldSeeKenyaCapsuleCoffeeTitleOnShopTwoPageTwo(String title) {
        String text = shop2Page2.userShouldSeeKenyaCapsuleCoffeeTitle();
        Assert.assertEquals(text, title);
    }

    @Then("user should see Kenya Capsule Coffee Price : {string} on ShopTwo PageTwo")
    public void userShouldSeeKenyaCapsuleCoffeePriceOnShopTwoPageTwo(String price) {
        String text = shop2Page2.userShouldSeeKenyaCapsuleCoffeePrice();
        Assert.assertEquals(text, price);
    }

    @Then("user should see Gituro Kenya Capsule Coffee Title : {string} on ShopTwo PageTwo")
    public void userShouldSeeGituroKenyaCapsuleCoffeeTitleOnShopTwoPageTwo(String title) {
        String text = shop2Page2.userShouldSeeGituroKenyaCapsuleCoffeeTitle();
        Assert.assertEquals(text, title);
    }

    @Then("user should see Gituro Kenya Capsule Coffee Price : {string} on ShopTwo PageTwo")
    public void userShouldSeeGituroKenyaCapsuleCoffeePriceOnShopTwoPageTwo(String price) {
        String text = shop2Page2.userShouldSeeGituroKenyaCapsuleCoffeePrice();
        Assert.assertEquals(text, price);
    }

    @Then("user should see Chocolate Colombia Capsule Coffee Title : {string} on ShopTwo PageTwo")
    public void userShouldSeeChocolateColombiaCapsuleCoffeeTitleOnShopTwoPageTwo(String title) {
        String text = shop2Page2.userShouldSeeChocolateColombiaCapsuleCoffeeTitle();
        Assert.assertEquals(text, title);
    }

    @Then("user should see Chocolate Colombia Capsule Coffee Price : {string} on ShopTwo PageTwo")
    public void userShouldSeeChocolateColombiaCapsuleCoffeePriceOnShopTwoPageTwo(String price) {
        String text = shop2Page2.userShouldSeeChocolateColombiaCapsuleCoffeePrice();
        Assert.assertEquals(text, price);
    }

    @Then("user should see Traum Blend Capsule Coffee Title : {string} on ShopTwo PageTwo")
    public void userShouldSeeTraumBlendCapsuleCoffeeTitleOnShopTwoPageTwo(String title) {
        String text = shop2Page2.userShouldSeeTraumBlendCapsuleCoffeeTitle();
        Assert.assertEquals(text, title);
    }

    @Then("user should see Traum Blend Capsule Coffee Price : {string} on ShopTwo PageTwo")
    public void userShouldSeeTraumBlendCapsuleCoffeePriceOnShopTwoPageTwo(String price) {
        String text = shop2Page2.userShouldSeeTraumBlendCapsuleCoffeePrice();
        Assert.assertEquals(text, price);
    }

    @Then("user should see Burundi Drip Coffee Title : {string} on ShopTwo PageTwo")
    public void userShouldSeeBurundiDripCoffeeTitleOnShopTwoPageTwo(String title) {
        String text = shop2Page2.userShouldSeeBurundiDripCoffeeTitle();
        Assert.assertEquals(text, title);
    }

    @Then("user should see Burundi Drip Coffee Price : {string} on ShopTwo PageTwo")
    public void userShouldSeeBurundiDripCoffeePriceOnShopTwoPageTwo(String price) {
        String text = shop2Page2.userShouldSeeBurundiDripCoffeePrice();
        Assert.assertEquals(text, price);
    }

    @Then("user should see El Salvador Apaneca Drip Coffee Title :{string} on ShopTwo PageTwo")
    public void userShouldSeeElSalvadorApanecaDripCoffeeTitleOnShopTwoPageTwo(String title) {
        String text = shop2Page2.userShouldSeeElSalvadorApanecaDripCoffeeTitle();
        Assert.assertEquals(text, title);
    }

    @Then("user should see El Salvador Apaneca Drip Coffee Price :{string} on ShopTwo PageTwo")
    public void userShouldSeeElSalvadorApanecaDripCoffeePriceOnShopTwoPageTwo(String price) {
        String text = shop2Page2.userShouldSeeElSalvadorApanecaDripCoffeePrice();
        Assert.assertEquals(text, price);
    }

    @Then("user should see Chocolate Colombia Coffee Image on ShopTwo PageTwo")
    public void userShouldSeeChocolateColombiaCoffeeImageOnShopTwoPageTwo() {
        shop2Page2.userShouldSeeChocolateColombiaCoffeeImage();
    }

    @Then("user should see Almond Colombia Coffee Image on ShopTwo PageTwo")
    public void userShouldSeeAlmondColombiaCoffeeImageOnShopTwoPageTwo() {
        shop2Page2.userShouldSeeAlmondColombiaCoffeeImage();
    }

    @Then("user should see Traum Blend Coffee Image on ShopTwo PageTwo")
    public void userShouldSeeTraumBlendCoffeeImageOnShopTwoPageTwo() {
        shop2Page2.userShouldSeeTraumBlendCoffeeImage();
    }

    @Then("user should see Traum Kickstart Coffee Image on ShopTwo PageTwo")
    public void userShouldSeeTraumKickstartCoffeeImageOnShopTwoPageTwo() {
        shop2Page2.userShouldSeeTraumKickstartCoffeeImage();
    }

    @Then("user should see El Salvador Apaneca Coffee Image on ShopTwo PageTwo")
    public void userShouldSeeElSalvadorApanecaCoffeeImageOnShopTwoPageTwo() {
        shop2Page2.userShouldSeeElSalvadorApanecaCoffeeImage();
    }

    @Then("user should see Honduras Opalca Coffee Image on ShopTwo PageTwo")
    public void userShouldSeeHondurasOpalcaCoffeeImageOnShopTwoPageTwo() {
        shop2Page2.userShouldSeeHondurasOpalcaCoffeeImage();
    }

    @Then("user should see Traum Kickstart Capsule Coffee Image on ShopTwo PageTwo")
    public void userShouldSeeTraumKickstartCapsuleCoffeeImageOnShopTwoPageTwo() {
        shop2Page2.userShouldSeeTraumKickstartCapsuleCoffeeImage();
    }

    @Then("user should see Kenya Capsule Coffee Image on ShopTwo PageTwo")
    public void userShouldSeeKenyaCapsuleCoffeeImageOnShopTwoPageTwo() {
        shop2Page2.userShouldSeeKenyaCapsuleCoffeeImage();
    }

    @Then("user should see Gituro Kenya Capsule Coffee Image on ShopTwo PageTwo")
    public void userShouldSeeGituroKenyaCapsuleCoffeeImageOnShopTwoPageTwo() {
        shop2Page2.userShouldSeeGituroKenyaCapsuleCoffeeImage();
    }

    @Then("user should see Chocolate Colombia Capsule Coffee Image on ShopTwo PageTwo")
    public void userShouldSeeChocolateColombiaCapsuleCoffeeImageOnShopTwoPageTwo() {
        shop2Page2.userShouldSeeChocolateColombiaCapsuleCoffeeImage();
    }

    @Then("user should see Traum Blend Capsule Coffee Image on ShopTwo PageTwo")
    public void userShouldSeeTraumBlendCapsuleCoffeeImageOnShopTwoPageTwo() {
        shop2Page2.userShouldSeeTraumBlendCapsuleCoffeeImage();
    }

    @Then("user should see Burundi Drip Coffee Image on ShopTwo PageTwo")
    public void userShouldSeeBurundiDripCoffeeImageOnShopTwoPageTwo() {
        shop2Page2.userShouldSeeBurundiDripCoffeeImage();
    }

    @Then("user should see El Salvador Apaneca Drip Coffee Image on ShopTwo PageTwo")
    public void userShouldSeeElSalvadorApanecaDripCoffeeImageOnShopTwoPageTwo() {
        shop2Page2.userShouldSeeElSalvadorApanecaDripCoffeeImage();
    }

    @When("user click Whole Bean Coffees on ShopTwo PageTwo")
    public void userClickWholeBeanCoffeesOnShopTwoPageTwo() {
        shop2Page2.userClickWholeBeanCoffees();
    }

    @Then("user should see Whole Bean Coffees Area on Shop Two PageTwo")
    public void userShouldSeeWholeBeanCoffeesAreaOnShopTwoPageTwo() {
        shop2Page2.userShouldSeeWholeBeanCoffeesArea();
    }

    @When("user click Capsules Coffees Button on ShopTwo PageTwo")
    public void userClickCapsulesCoffeesButtonOnShopTwoPageTwo() {
        shop2Page2.userClickCapsulesCoffeesButton();
    }

    @Then("user should see Capsules Coffees Area on ShopTwo PageTwo")
    public void userShouldSeeCapsulesCoffeesAreaOnShopTwoPageTwo() {
        shop2Page2.userShouldSeeCapsulesCoffeesArea();
    }

    @When("user click Drip Coffees Button on ShopTwo PageTwo")
    public void userClickDripCoffeesButtonOnShopTwoPageTwo() {
        shop2Page2.userClickDripCoffeesButton();
    }

    @Then("user should see Drip Coffees Area on ShopTwo PageTwo")
    public void userShouldSeeDripCoffeesAreaOnShopTwoPageTwo() {
        shop2Page2.userShouldSeeDripCoffeesArea();
    }

    @Then("user should see Basket : {string} on ShopTwo PageTwo")
    public void userShouldSeeBasketOnShopTwoPageTwo(String title) {
        String text = shop2Page2.userShouldSeeBasket();
        Assert.assertEquals(text, title);
    }

    @Then("user should see No Items : {string} on ShopTwo PageTwo")
    public void userShouldSeeNoItemsOnShopTwoPageTwo(String title) {
       shop2Page2.userShouldSeeNoItems();

    }

    @Then("user should see Complete Your Order : {string} on ShopTwo PageTwo")
    public void userShouldSeeCompleteYourOrderOnShopTwoPageTwo(String title) {
        String text = shop2Page2.userShouldSeeCompleteYourOrder();
        Assert.assertEquals(text, title);
    }

    @Then("user should see AED : {string} on ShopTwo PageTwo")
    public void userShouldSeeAEDOnShopTwoPageTwo(String price) {
        String text = shop2Page2.userShouldSeeAED();
        Assert.assertEquals(text, price);
    }
}
