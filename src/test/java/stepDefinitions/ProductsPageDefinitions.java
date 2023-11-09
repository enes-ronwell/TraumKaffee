package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ProductsPage;
import utils.DriverFactory;

public class ProductsPageDefinitions {
    ProductsPage productsPage = new ProductsPage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the Products Page")
    public void userOnTheProductsPage() {
        productsPage.userOnTheProductsPage();
    }

    //WHEN's
    @When("click Product Area Product Image on Products Page")
    public void clickProductAreaProductImageOnProductsPage() {
        productsPage.clickProductAreaProductImage();
    }

    @When("click Product Area Brew Guides Image on Products Page")
    public void clickProductAreaBrewGuidesImageOnProductsPage() {
        productsPage.clickProductAreaBrewGuidesImage();
    }

    @When("click Product Area Blog Image on Products Page")
    public void clickProductAreaBlogImageOnProductsPage() {
        productsPage.clickProductAreaBlogImage();
    }

    //THEN's
    @Then("should see the Products Page")
    public void shouldSeeTheProductsPage() {
        productsPage.checkProductsPage("https://dev.traumkaffee.com/products");
    }

    @Then("should see Categories Area Title: {string} on Products Page")
    public void shouldSeeCategoriesAreaTitleOnProductsPage(String title) {
        String text = productsPage.shouldSeeCategoriesAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Categories Area Shop All: {string} on Products Page")
    public void shouldSeeCategoriesAreaShopAllOnProductsPage(String shop) {
        String text = productsPage.shouldSeeCategoriesAreaShopAll();
        Assert.assertEquals(text, shop);
    }

    @Then("should see Categories Area Shop All Checkbox on Products Page")
    public void shouldSeeCategoriesAreaShopAllCheckboxOnProductsPage() {
        productsPage.shouldSeeCategoriesAreaShopAllCheckbox();
    }

    @Then("should see Categories Area Ground Coffees: {string} on Products Page")
    public void shouldSeeCategoriesAreaGroundCoffeesOnProductsPage(String ground) {
        String text = productsPage.shouldSeeCategoriesAreaGroundCoffees();
        Assert.assertEquals(text, ground);
    }

    @Then("should see Categories Area Ground Coffees Checkbox on Products Page")
    public void shouldSeeCategoriesAreaGroundCoffeesCheckboxOnProductsPage() {
        productsPage.shouldSeeCategoriesAreaGroundCoffeesCheckbox();
    }

    @Then("should see Categories Area Capsules Coffees: {string} on Products Page")
    public void shouldSeeCategoriesAreaCapsulesCoffeesOnProductsPage(String capsules) {
        String text = productsPage.shouldSeeCategoriesAreaCapsulesCoffees();
        Assert.assertEquals(text, capsules);
    }

    @Then("should see Categories Area Capsules Coffees Checkbox on Products Page")
    public void shouldSeeCategoriesAreaCapsulesCoffeesCheckboxOnProductsPage() {
        productsPage.shouldSeeCategoriesAreaCapsulesCoffeesCheckbox();
    }

    @Then("should see Categories Area Drip Coffees: {string} on Products Page")
    public void shouldSeeCategoriesAreaDripCoffeesOnProductsPage(String drip) {
        String text = productsPage.shouldSeeCategoriesAreaDripCoffees();
        Assert.assertEquals(text, drip);
    }

    @Then("should see Categories Area Drip Coffees Checkbox on Products Page")
    public void shouldSeeCategoriesAreaDripCoffeesCheckboxOnProductsPage() {
        productsPage.shouldSeeCategoriesAreaDripCoffeesCheckbox();
    }

    @Then("should see Search Area Textbox: {string} on Products Page")
    public void shouldSeeSearchAreaTextboxOnProductsPage(String textbox) {
        String text = productsPage.shouldSeeSearchAreaTextbox();
        Assert.assertEquals(text, textbox);
    }

    @Then("should see Search Area Image on Products Page")
    public void shouldSeeSearchAreaImageOnProductsPage() {
        productsPage.shouldSeeSearchAreaImage();
    }

    @Then("should see Search Area Close Icon on Products Page")
    public void shouldSeeSearchAreaCloseIconOnProductsPage() {
        productsPage.shouldSeeSearchAreaCloseIcon();
    }

    @Then("should see Search Area Searching Results For Header: {string} on Products Page")
    public void shouldSeeSearchAreaSearchingResultsForHeaderOnProductsPage(String result) {
        String text = productsPage.shouldSeeSearchAreaSearchingResultsForHeader();
        Assert.assertEquals(text, result);
    }

    @Then("should see Search Area Searching Results For: {string} on Products Page")
    public void shouldSeeSearchAreaSearchingResultsForOnProductsPage(String result) {
        String text = productsPage.shouldSeeSearchAreaSearchingResultsFor();
        Assert.assertEquals(text, result);
    }

    @Then("should see Product Area Product Image on Products Page")
    public void shouldSeeProductAreaProductImageOnProductsPage() {
        productsPage.shouldSeeProductAreaProductImage();
    }

    @Then("should see Product Area Product Tag: {string} on Products Page")
    public void shouldSeeProductAreaProductTagOnProductsPage(String product) {
        String text = productsPage.shouldSeeProductAreaProductTag();
        Assert.assertEquals(text, product);
    }

    @Then("should see Product Area Product Name: {string} on Products Page")
    public void shouldSeeProductAreaProductNameOnProductsPage(String name) {
        String text = productsPage.shouldSeeProductAreaProductName();
        Assert.assertEquals(text, name);
    }

    @Then("should see Product Area Product Description: {string} on Products Page")
    public void shouldSeeProductAreaProductDescriptionOnProductsPage(String desc) {
        String text = productsPage.shouldSeeProductAreaProductDescription();
        Assert.assertEquals(text, desc);
    }

    @Then("should see Product Area Product Price: {string} on Products Page")
    public void shouldSeeProductAreaProductPriceOnProductsPage(String price) {
        String text = productsPage.shouldSeeProductAreaProductPrice();
        Assert.assertEquals(text, price);
    }

    @Then("should see Product Area Show More Button: {string} on Products Page")
    public void shouldSeeProductAreaShowMoreButtonOnProductsPage(String more) {
        String text = productsPage.shouldSeeProductAreaShowMoreButton();
        Assert.assertEquals(text, more);
    }

    @Then("should see Product Area Brew Guides Text: {string} on Products Page")
    public void shouldSeeProductAreaBrewGuidesTextOnProductsPage(String brewText) {
        String text = productsPage.shouldSeeProductAreaBrewGuidesText();
        Assert.assertEquals(text, brewText);
    }

    @Then("should see Product Area Brew Guides Image on Products Page")
    public void shouldSeeProductAreaBrewGuidesImageOnProductsPage() {
        productsPage.shouldSeeProductAreaBrewGuidesImage();
    }

    @Then("should see Product Area Brew Guides Title: {string} on Products Page")
    public void shouldSeeProductAreaBrewGuidesTitleOnProductsPage(String brewTitle) {
        String text = productsPage.shouldSeeProductAreaBrewGuidesTitle();
        Assert.assertEquals(text, brewTitle);
    }

    @Then("should see Product Area Brew Guides Visit: {string} on Products Page")
    public void shouldSeeProductAreaBrewGuidesVisitOnProductsPage(String visit) {
        String text = productsPage.shouldSeeProductAreaBrewGuidesVisit();
        Assert.assertEquals(text, visit);
    }

    @Then("should see Product Area Blog Text: {string} on Products Page")
    public void shouldSeeProductAreaBlogTextOnProductsPage(String blogText) {
        String text = productsPage.shouldSeeProductAreaBlogText();
        Assert.assertEquals(text, blogText);
    }

    @Then("should see Product Area Blog Image on Products Page")
    public void shouldSeeProductAreaBlogImageOnProductsPage() {
        productsPage.shouldSeeProductAreaBlogImage();
    }

    @Then("should see Product Area Blog Title: {string} on Products Page")
    public void shouldSeeProductAreaBlogTitleOnProductsPage(String title) {
        String text = productsPage.shouldSeeProductAreaBlogTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Product Area Blog Visit: {string} on Products Page")
    public void shouldSeeProductAreaBlogVisitOnProductsPage(String visit) {
        String text = productsPage.shouldSeeProductAreaBlogVisit();
        Assert.assertEquals(text, visit);
    }
}
