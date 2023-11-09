package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ShoppingCartPage;
import utils.DriverFactory;

import javax.swing.*;

public class ShoppingCartPageDefinitions {
    ShoppingCartPage ShoppingCartPage = new ShoppingCartPage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the Shopping Cart Page")
    public void userOnTheShoppingCartPage() {
        ShoppingCartPage.userOnTheShoppingCartPage();
    }

    //WHEN's
    @When("click Featured Items Area First Product Image on Shopping Cart Page")
    public void clickFeaturedItemsAreaFirstProductImageOnShoppingCartPage() {
        ShoppingCartPage.clickFeaturedItemsAreaFirstProductImage();
    }

    @When("click Featured Items Area Second Product Image on Shopping Cart Page")
    public void clickFeaturedItemsAreaSecondProductImageOnShoppingCartPage() {
        ShoppingCartPage.clickFeaturedItemsAreaSecondProductImage();
    }

    @When("click Featured Items Area Third Product Image on Shopping Cart Page")
    public void clickFeaturedItemsAreaThirdProductImageOnShoppingCartPage() {
        ShoppingCartPage.clickFeaturedItemsAreaThirdProductImage();
    }

    @When("click Featured Items Area Fourth Product Image on Shopping Cart Page")
    public void clickFeaturedItemsAreaFourthProductImageOnShoppingCartPage() {
        ShoppingCartPage.clickFeaturedItemsAreaFourthProductImage();
    }

    @When("click Featured Items Area First Product Add Button on Shopping Cart Page")
    public void clickFeaturedItemsAreaFirstProductAddButtonOnShoppingCartPage() {
        ShoppingCartPage.clickFeaturedItemsAreaFirstProductAddButton();
    }

    @When("click Featured Items Area Second Product Add Button on Shopping Cart Page")
    public void clickFeaturedItemsAreaSecondProductAddButtonOnShoppingCartPage() {
        ShoppingCartPage.clickFeaturedItemsAreaSecondProductAddButton();
    }

    @When("click Featured Items Area Third Product Add Button on Shopping Cart Page")
    public void clickFeaturedItemsAreaThirdProductAddButtonOnShoppingCartPage() {
        ShoppingCartPage.clickFeaturedItemsAreaThirdProductAddButton();
    }

    @When("click Featured Items Area Fourth Product Add Button on Shopping Cart Page")
    public void clickFeaturedItemsAreaFourthProductAddButtonOnShoppingCartPage() {
        ShoppingCartPage.clickFeaturedItemsAreaFourthProductAddButton();
    }

    @When("click Total Area Continue Shopping on Shopping Cart Page")
    public void clickTotalAreaContinueShoppingOnShoppingCartPage() {
        ShoppingCartPage.clickTotalAreaContinueShopping();
    }

    @When("click Shopping Cart Area Our Guides Text On Shopping Cart Page")
    public void clickShoppingCartAreaOurGuidesTextOnShoppingCartPage() {
        ShoppingCartPage.clickShoppingCartAreaOurGuidesText();
    }

    //THEN's
    @Then("should see the Shopping Cart Page")
    public void shouldSeeTheShoppingCartPage() {
        ShoppingCartPage.shouldSeeTheShoppingCartPage();
    }

    @Then("should see Featured Items Area Title: {string} on Shopping Cart Page")
    public void shouldSeeFeaturedItemsAreaTitleOnShoppingCartPage(String title) {
        String text = ShoppingCartPage.shouldSeeFeaturedItemsAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Featured Items Area First Product Image on Shopping Cart Page")
    public void shouldSeeFeaturedItemsAreaFirstProductImageOnShoppingCartPage() {
        ShoppingCartPage.shouldSeeFeaturedItemsAreaFirstProductImage();
    }

    @Then("should see Featured Items Area First Product Name: {string} on Shopping Cart Page")
    public void shouldSeeFeaturedItemsAreaFirstProductNameOnShoppingCartPage(String name) {
        String text = ShoppingCartPage.shouldSeeFeaturedItemsAreaFirstProductName();
        Assert.assertEquals(text, name);
    }

    @Then("should see Featured Items Area First Product Price: {string} on Shopping Cart Page")
    public void shouldSeeFeaturedItemsAreaFirstProductPriceOnShoppingCartPage(String price) {
        String text = ShoppingCartPage.shouldSeeFeaturedItemsAreaFirstProductPrice();
        Assert.assertEquals(text, price);
    }

    @Then("should see Featured Items Area First Product Add Button on Shopping Cart Page")
    public void shouldSeeFeaturedItemsAreaFirstProductAddButtonOnShoppingCartPage() {
        ShoppingCartPage.shouldSeeFeaturedItemsAreaFirstProductAddButton();
    }

    @Then("should see Featured Items Area Second Product Image on Shopping Cart Page")
    public void shouldSeeFeaturedItemsAreaSecondProductImageOnShoppingCartPage() {
        ShoppingCartPage.shouldSeeFeaturedItemsAreaSecondProductImage();
    }

    @Then("should see Featured Items Area Second Product Name: {string} on Shopping Cart Page")
    public void shouldSeeFeaturedItemsAreaSecondProductNameOnShoppingCartPage(String name) {
        String text = ShoppingCartPage.shouldSeeFeaturedItemsAreaSecondProductName();
        Assert.assertEquals(text, name);
    }

    @Then("should see Featured Items Area Second Product Price: {string} on Shopping Cart Page")
    public void shouldSeeFeaturedItemsAreaSecondProductPriceOnShoppingCartPage(String price) {
        String text = ShoppingCartPage.shouldSeeFeaturedItemsAreaSecondProductPrice();
        Assert.assertEquals(text, price);
    }

    @Then("should see Featured Items Area Second Product Add Button on Shopping Cart Page")
    public void shouldSeeFeaturedItemsAreaSecondProductAddButtonOnShoppingCartPage() {
        ShoppingCartPage.shouldSeeFeaturedItemsAreaSecondProductAddButton();
    }

    @Then("should see Featured Items Area Third Product Image on Shopping Cart Page")
    public void shouldSeeFeaturedItemsAreaThirdProductImageOnShoppingCartPage() {
        ShoppingCartPage.shouldSeeFeaturedItemsAreaThirdProductImage();
    }

    @Then("should see Featured Items Area Third Product Name: {string} on Shopping Cart Page")
    public void shouldSeeFeaturedItemsAreaThirdProductNameOnShoppingCartPage(String name) {
        String text = ShoppingCartPage.shouldSeeFeaturedItemsAreaThirdProductName();
        Assert.assertEquals(text, name);
    }

    @Then("should see Featured Items Area Third Product Price: {string} on Shopping Cart Page")
    public void shouldSeeFeaturedItemsAreaThirdProductPriceOnShoppingCartPage(String price) {
        String text = ShoppingCartPage.shouldSeeFeaturedItemsAreaThirdProductPrice();
        Assert.assertEquals(text, price);
    }

    @Then("should see Featured Items Area Third Product Add Button on Shopping Cart Page")
    public void shouldSeeFeaturedItemsAreaThirdProductAddButtonOnShoppingCartPage() {
        ShoppingCartPage.shouldSeeFeaturedItemsAreaThirdProductAddButton();
    }

    @Then("should see Featured Items Area Fourth Product Image on Shopping Cart Page")
    public void shouldSeeFeaturedItemsAreaFourthProductImageOnShoppingCartPage() {
        ShoppingCartPage.shouldSeeFeaturedItemsAreaFourthProductImage();
    }

    @Then("should see Featured Items Area Fourth Product Name: {string} on Shopping Cart Page")
    public void shouldSeeFeaturedItemsAreaFourthProductNameOnShoppingCartPage(String name) {
        String text = ShoppingCartPage.shouldSeeFeaturedItemsAreaFourthProductName();
        Assert.assertEquals(text, name);
    }


    @Then("should see Featured Items Area Fourth Product Price: {string} on Shopping Cart Page")
    public void shouldSeeFeaturedItemsAreaFourthProductPriceOnShoppingCartPage(String price) {
        String text = ShoppingCartPage.shouldSeeFeaturedItemsAreaFourthProductPrice();
        Assert.assertEquals(text, price);
    }

    @Then("should see Featured Items Area Fourth Product Add Button on Shopping Cart Page")
    public void shouldSeeFeaturedItemsAreaFourthProductAddButtonOnShoppingCartPage() {
        ShoppingCartPage.shouldSeeFeaturedItemsAreaFourthProductAddButton();
    }


    @Then("should see Total Area Sub Total Header: {string} on Shopping Cart Page")
    public void shouldSeeTotalAreaSubTotalHeaderOnShoppingCartPage(String total) {
        String text = ShoppingCartPage.shouldSeeTotalAreaSubTotalHeader();
        Assert.assertEquals(text, total);
    }

    @Then("should see Total Area Sub Total: {string} on Shopping Cart Page")
    public void shouldSeeTotalAreaSubTotalOnShoppingCartPage(String total) {
        String text = ShoppingCartPage.shouldSeeTotalAreaSubTotal();
        Assert.assertEquals(text, total);
    }

    @Then("should see Total Area Discount Header: {string} on Shopping Cart Page")
    public void shouldSeeTotalAreaDiscountHeaderOnShoppingCartPage(String discount) {
        String text = ShoppingCartPage.shouldSeeTotalAreaDiscountHeader();
        Assert.assertEquals(text, discount);
    }

    @Then("should see Total Area Discount: {string} on Shopping Cart Page")
    public void shouldSeeTotalAreaDiscountOnShoppingCartPage(String discount) {
        String text = ShoppingCartPage.shouldSeeTotalAreaDiscount();
        Assert.assertEquals(text, discount);
    }

    @Then("should see Total Area Delivery Header: {string} on Shopping Cart Page")
    public void shouldSeeTotalAreaDeliveryHeaderOnShoppingCartPage(String header) {
        String text = ShoppingCartPage.shouldSeeTotalAreaDeliveryHeader();
        Assert.assertEquals(text, header);
    }

    @Then("should see Total Area Delivery: {string} on Shopping Cart Page")
    public void shouldSeeTotalAreaDeliveryOnShoppingCartPage(String delivery) {
        String text = ShoppingCartPage.shouldSeeTotalAreaDelivery();
        Assert.assertEquals(text, delivery);
    }

    @Then("should see Total Area Tax Header: {string} on Shopping Cart Page")
    public void shouldSeeTotalAreaTaxHeaderOnShoppingCartPage(String taxHeader) {
        String text = ShoppingCartPage.shouldSeeTotalAreaTaxHeader();
        Assert.assertEquals(text, taxHeader);
    }

    @Then("should see Total Area Tax: {string} on Shopping Cart Page")
    public void shouldSeeTotalAreaTaxOnShoppingCartPage(String tax) {
        String text = ShoppingCartPage.shouldSeeTotalAreaTax();
        Assert.assertEquals(text, tax);
    }

    @Then("should see Total Area Estimated Total Header: {string} on Shopping Cart Page")
    public void shouldSeeTotalAreaEstimatedTotalHeaderOnShoppingCartPage(String total) {
        String text = ShoppingCartPage.shouldSeeTotalAreaEstimatedTotalHeader();
        Assert.assertEquals(text, total);
    }

    @Then("should see Total Area Estimated Total: {string} on Shopping Cart Page")
    public void shouldSeeTotalAreaEstimatedTotalOnShoppingCartPage(String total) {
        String text = ShoppingCartPage.shouldSeeTotalAreaEstimatedTotal();
        Assert.assertEquals(text, total);
    }

    @Then("should see Total Area Continue Shopping: {string} on Shopping Cart Page")
    public void shouldSeeTotalAreaContinueShoppingOnShoppingCartPage(String continueShopping) {
        String text = ShoppingCartPage.shouldSeeTotalAreaContinueShopping();
        Assert.assertEquals(text, continueShopping);
    }

    @Then("should see Total Area Go To Payment: {string} on Shopping Cart Page")
    public void shouldSeeTotalAreaGoToPaymentOnShoppingCartPage(String payment) {
        String text = ShoppingCartPage.shouldSeeTotalAreaGoToPayment();
        Assert.assertEquals(text, payment);
    }

    @Then("should see Shopping Cart Area Title: {string} on Shopping Cart Page")
    public void shouldSeeShoppingCartAreaTitleOnShoppingCartPage(String title) {
        String text = ShoppingCartPage.shouldSeeShoppingCartAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Shopping Cart Area Image on Shopping Cart Page")
    public void shouldSeeShoppingCartAreaImageOnShoppingCartPage() {
        ShoppingCartPage.shouldSeeShoppingCartAreaImage();
    }

    @Then("should see Shopping Cart Area Description: {string} on Shopping Cart Page")
    public void shouldSeeShoppingCartAreaDescriptionOnShoppingCartPage(String desc) {
        String text = ShoppingCartPage.shouldSeeShoppingCartAreaDescription();
        Assert.assertEquals(text, desc);
    }

    @When("click Shopping Cart Area Shopping Text On Shopping Cart Page")
    public void clickShoppingCartAreaShoppingTextOnShoppingCartPage() {
        ShoppingCartPage.clickShoppingCartAreaShoppingText();
    }


    @When("click First Product Quantity Up Icon on Shopping Cart Page")
    public void clickFirstProductQuantityUpIconOnShoppingCartPage() {
        ShoppingCartPage.clickFirstProductQuantityUpIcon();
    }

    @Then("should see First Product Quantity: {string} on Shopping Cart Page")
    public void shouldSeeFirstProductQuantityOnShoppingCartPage(String quantity) {
        String text = ShoppingCartPage.shouldSeeFirstProductQuantity();
        Assert.assertEquals(text, quantity);
    }

    @Then("should see First Product Name: {string} on Shopping Cart Page")
    public void shouldSeeFirstProductNameOnShoppingCartPage(String name) {
        String text = ShoppingCartPage.shouldSeeFirstProductName();
        Assert.assertEquals(text, name);
    }

    @Then("should see Second Product Name: {string} on Shopping Cart Page")
    public void shouldSeeSecondProductNameOnShoppingCartPage(String name) {
        String text = ShoppingCartPage.shouldSeeSecondProductName();
        Assert.assertEquals(text, name);
    }

    @When("click First Product Quantity Down Button On Shopping Cart Page")
    public void clickFirstProductQuantityDownButtonOnShoppingCartPage() {
        ShoppingCartPage.clickFirstProductQuantityDownButton();
    }

    @When("click Go To Payment Button on Shopping Cart Page")
    public void clickGoToPaymentButtonOnShoppingCartPage() {
        ShoppingCartPage.clickGoToPaymentButton();
    }
}