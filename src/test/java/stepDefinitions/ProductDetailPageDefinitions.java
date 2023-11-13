package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ProductDetailPage;
import utils.DriverFactory;

public class ProductDetailPageDefinitions {
    ProductDetailPage productDetailPage = new ProductDetailPage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the Product Detail Page")
    public void userOnTheProductDetailPage() {
        productDetailPage.userOnTheProductDetailPage();
    }

    //WHEN's
    @When("click Continue Shopping Button on Product Detail Page")
    public void clickContinueShoppingButtonOnProductDetailPage() {
        productDetailPage.clickContinueShoppingButton();
    }

    @When("click Add To Cart Button on Product Detail Page")
    public void clickAddToCartButtonOnProductDetailPage() {
        productDetailPage.clickAddToCartButton();
    }

    @When("click Quantity Up Icon on Product Detail Page")
    public void clickQuantityUpIconOnProductDetailPage() {
        productDetailPage.clickQuantityUpIcon();
    }

    //THEN's
    @Then("should see the Product Detail Page")
    public void shouldSeeTheProductDetailPage() {
        productDetailPage.shouldSeeTheProductDetailPage("https://dev.traumkaffee.com/product");
    }

    @Then("should see Name: {string} on Product Detail Page")
    public void shouldSeeNameOnProductDetailPage(String name) {
        String text = productDetailPage.shouldSeeName();
        Assert.assertEquals(text,name);
    }

    @Then("should see Product Path: {string} on Product Detail Page")
    public void shouldSeeProductPathOnProductDetailPage(String path) {
        String text = productDetailPage.shouldSeeProductPath();
        Assert.assertEquals(text.replaceAll("\\s+",""),path.replaceAll("\\s+",""));
    }

    @Then("should see Product Name: {string} on Product Detail Page")
    public void shouldSeeProductNameOnProductDetailPage(String name) {
        String text = productDetailPage.shouldSeeProductName();
        Assert.assertEquals(text,name);
    }

    @Then("should see Product Description: {string} on Product Detail Page")
    public void shouldSeeProductDescriptionOnProductDetailPage(String desc) {
        String text = productDetailPage.shouldSeeProductDescription();
        Assert.assertEquals(text,desc);
    }

    @Then("should see Product Image on Product Detail Page")
    public void shouldSeeProductImageOnProductDetailPage() {
        productDetailPage.shouldSeeProductImage();
    }

    @Then("should see Product Image Option on Product Detail Page")
    public void shouldSeeProductImageOptionOnProductDetailPage() {
        productDetailPage.shouldSeeProductImageOption();
    }

    @Then("should see Product Coffee Type: {string} on Product Detail Page")
    public void shouldSeeProductCoffeeTypeOnProductDetailPage(String type) {
        String text = productDetailPage.shouldSeeProductCoffeeType();
        Assert.assertEquals(text,type);

    }

    @Then("should see Product Coffee Type Option: {string} on Product Detail Page")
    public void shouldSeeProductCoffeeTypeOptionOnProductDetailPage(String type) {
       String text = productDetailPage.shouldSeeProductCoffeeTypeOption();
        Assert.assertEquals(text,type);
    }

    @Then("should see Product Piece: {string} on Product Detail Page")
    public void shouldSeeProductPieceOnProductDetailPage(String piece) {
        String text = productDetailPage.shouldSeeProductPiece();
        Assert.assertEquals(text,piece);
    }

    @Then("should see Product Piece Option: {string} on Product Detail Page")
    public void shouldSeeProductPieceOptionOnProductDetailPage(String piece) {
        String text = productDetailPage.shouldSeeProductPieceOption();
        Assert.assertEquals(text,piece);
    }

    @Then("should see Product Quantity Header: {string} on Product Detail Page")
    public void shouldSeeProductQuantityHeaderOnProductDetailPage(String quantity) {
        String text = productDetailPage.shouldSeeProductQuantityHeader();
        Assert.assertEquals(text,quantity);
    }

    @Then("should see Product Quantity: {string} on Product Detail Page")
    public void shouldSeeProductQuantityOnProductDetailPage(String quantity) {
        String text = productDetailPage.shouldSeeProductQuantity();
        Assert.assertEquals(text,quantity);
    }

    @Then("should see Product Quantity Down Icon on Product Detail Page")
    public void shouldSeeProductQuantityDownIconOnProductDetailPage() {
        productDetailPage.shouldSeeProductQuantityDownIcon();
    }

    @Then("should see Product Quantity Up Icon on Product Detail Page")
    public void shouldSeeProductQuantityUpIconOnProductDetailPage() {
        productDetailPage.shouldSeeProductQuantityUpIcon();
    }

    @Then("should see Product Price: {string} on Product Detail Page")
    public void shouldSeeProductPriceOnProductDetailPage(String price) {
        String text = productDetailPage.shouldSeeProductPrice();
        Assert.assertEquals(text,price);
    }

    @Then("should see Product Add To Cart Button: {string} on Product Detail Page")
    public void shouldSeeProductAddToCartButtonOnProductDetailPage(String button) {
        String text = productDetailPage.shouldSeeProductAddToCartButton();
        Assert.assertEquals(text,button);
    }

    @Then("should see Product Continue Shopping Button: {string} on Product Detail Page")
    public void shouldSeeProductContinueShoppingButtonOnProductDetailPage(String button) {
        String text = productDetailPage.shouldSeeProductContinueShoppingButton();
        Assert.assertEquals(text,button);
    }

    @Then("should see Product Free Shipping: {string} on Product Detail Page")
    public void shouldSeeProductFreeShippingOnProductDetailPage(String shiping) {
        String text = productDetailPage.shouldSeeProductFreeShipping();
        Assert.assertEquals(text,shiping);
    }

    @Then("should see Product Cancel Anytime: {string} on Product Detail Page")
    public void shouldSeeProductCancelAnytimeOnProductDetailPage(String cancel) {
        String text = productDetailPage.shouldSeeProductCancelAnytime();
        Assert.assertEquals(text,cancel);
    }

    @Then("should see Please Select Quantity Message: {string} on Product Detail Page")
    public void shouldSeePleaseSelectQuantityMessageOnProductDetailPage(String quantity) {
        String text = productDetailPage.shouldSeePleaseSelectQuantityMessage();
        Assert.assertEquals(text,quantity);
    }


}
