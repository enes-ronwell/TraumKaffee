package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.EquipmentPage;
import pages.Shop2DetailPage;
import utils.DriverFactory;

public class Shop2DetailPageDefinitions {
    Shop2DetailPage shop2DetailPage = new Shop2DetailPage(DriverFactory.getDriver());

    @When("user click on the first item ShopTwo Page")
    public void userClickOnTheFirstItemShopTwoPage() {
        shop2DetailPage.userClickOnTheFirstItem();
    }

    @Then("user should see section Honduras Opalca Coffee Title : {string} on ShopTwo Page")
    public void userShouldSeeSectionHondurasOpalcaCoffeeTitleOnShopTwoPage(String title) {
        String text = shop2DetailPage.userShouldSeeSectionHondurasOpalcaCoffeeTitle();
        Assert.assertEquals(text, title);
    }

    @Then("user should see gr : {string} on ShopTwo Page")
    public void userShouldSeeGrOnShopTwoPage(String title) {
        String text = shop2DetailPage.userShouldSeeGr();
        Assert.assertEquals(text, title);
    }

    @Then("user should see Coffee Type title : {string} on ShopTwo Page")
    public void userShouldSeeCoffeeTypeTitleOnShopTwoPage(String title) {
        String text = shop2DetailPage.userShouldSeeCoffeeTypeTitle();
        Assert.assertEquals(text, title);
    }

    @Then("user should see Add to Basket : {string} on ShopTwo Page")
    public void userShouldSeeAddToBasketOnShopTwoPage(String title) {
        String text = shop2DetailPage.userShouldSeeAddToBasket();
                Assert.assertEquals(text, title);
    }

    @When("user click on the second item on ShopTwo Page")
    public void userClickOnTheSecondItemOnShopTwoPage() {
        shop2DetailPage.userClickOnTheSecondItem();
    }

    @Then("user should see section Chocolate Colombia Capsule Coffee Title : {string} on ShopTwo Page")
    public void userShouldSeeSectionChocolateColombiaCapsuleCoffeeTitleOnShopTwoPage(String title) {
        String text = shop2DetailPage.userShouldSeeSectionChocolateColombiaCapsuleCoffeeTitle();
                Assert.assertEquals(text, title);
    }

    @When("user click on the Chocolate Colombia Coffee on ShopTwo Page")
    public void userClickOnTheChocolateColombiaCoffeeOnShopTwoPage() {
        shop2DetailPage.userClickOnTheChocolateColombiaCoffee();
    }

    @Then("user should see section Chocolate Colombia Coffee Title : {string} on ShopTwo PageTwo")
    public void userShouldSeeSectionChocolateColombiaCoffeeTitleOnShopTwoPageTwo(String title) {
        String text = shop2DetailPage.userShouldSeeSectionChocolateColombiaCoffeeTitle();
                Assert.assertEquals(text, title);
    }

    @When("user click on the Burundi Drip Coffee on ShopTwo PageTwo")
    public void userClickOnTheBurundiDripCoffeeOnShopTwoPageTwo() {
        shop2DetailPage.userClickOnTheBurundiDripCoffee();
    }

    @Then("user should see section Burundi Drip Coffee Title : {string} on ShopTwo PageTwo")
    public void userShouldSeeSectionBurundiDripCoffeeTitleOnShopTwoPageTwo(String title) {
        String text = shop2DetailPage.userShouldSeeSectionBurundiDripCoffeeTitle();
                Assert.assertEquals(text, title);
    }

    @Then("user should click Add to Basket Button on shopTwo Page")
    public void userShouldClickAddToBasketButtonOnShopTwoPage() throws InterruptedException {
        shop2DetailPage.userShouldClickAddToBasketButton();
        Thread.sleep(5000);
    }



    @Then("user should see Honduras Opalca Coffee Title in basket : {string} on ShopTwo Page")
    public void userShouldSeeHondurasOpalcaCoffeeTitleInBasketOnShopTwoPage(String title) {
       String text =  shop2DetailPage.userShouldSeeHondurasOpalcaCoffeeTitleInBasket();
    Assert.assertEquals(text,title);
    }

    @Then("user should see Chocolate Colombia Capsule Coffee Title in basket : {string} on ShopTwo Page")
    public void userShouldSeeChocolateColombiaCapsuleCoffeeTitleInBasketOnShopTwoPage(String title) {
        String text = shop2DetailPage.userShouldSeeChocolateColombiaCapsuleCoffeeTitleInBasket();
        Assert.assertEquals(text,title);
    }

    @When("user click on the Chocolate Colombia Coffee on ShopTwo PageTwo")
    public void userClickOnTheChocolateColombiaCoffeeOnShopTwoPageTwo() {
        shop2DetailPage.userClickOnTheChocolateColombiaCoffeePageTwo();
    }

    @Then("user should see gr : {string} on ShopTwo PageTwo")
    public void userShouldSeeGrOnShopTwoPageTwo(String title) {
        shop2DetailPage.userShouldSeeGrOnPageTwo();
    }

    @Then("user should see Coffee Type title : {string} on ShopTwo PageTwo")
    public void userShouldSeeCoffeeTypeTitleOnShopTwoPageTwo(String title) {
        String text = shop2DetailPage.userShouldSeeCoffeeTypeTitlePageTwo();
        Assert.assertEquals(text,title);
    }

    @Then("user should see Add to Basket : {string} on ShopTwo PageTwo")
    public void userShouldSeeAddToBasketOnShopTwoPageTwo(String title) {
        String text = shop2DetailPage.userShouldSeeAddToBasketPageTwo();
        Assert.assertEquals(text,title);
    }

    @Then("user should click Add to Basket Button on shopTwo PageTwo")
    public void userShouldClickAddToBasketButtonOnShopTwoPageTwo() {
        shop2DetailPage.userShouldClickAddToBasketButtonPageTwo();
    }

    @Then("user should see Chocolate Colombia Coffee Title in basket : {string} on ShopTwo PageTwo")
    public void userShouldSeeChocolateColombiaCoffeeTitleInBasketOnShopTwoPageTwo(String title) {
        String text = shop2DetailPage.userShouldSeeChocolateColombiaCoffeeTitleInBasketPageTwo();
        Assert.assertEquals(text,title);
    }

    @Then("user should see Burundi Drip Coffee Title in basket : {string} on ShopTwo PageTwo")
    public void userShouldSeeBurundiDripCoffeeTitleInBasketOnShopTwoPageTwo(String title) {
        String text = shop2DetailPage.userShouldSeeBurundiDripCoffeeTitleInBasketPageTwo();
        Assert.assertEquals(text,title);
    }

    @Then("user should press Add Button in Detail page on ShopTwo Page")
    public void userShouldPressAddButtonInDetailPageOnShopTwoPage() {
        shop2DetailPage.userShouldPressAddButtonInDetailPage();
    }
}
