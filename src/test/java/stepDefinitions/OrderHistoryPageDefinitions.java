package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.OrderHistoryPage;
import utils.DriverFactory;

import javax.swing.*;

public class OrderHistoryPageDefinitions {
    OrderHistoryPage OrderHistoryPage = new OrderHistoryPage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the Order History Page")
    public void userOnTheOrderHistoryPage() {
        OrderHistoryPage.userOnTheOrderHistoryPage();
    }
    //WHEN's
    @When("click Reorder Button on Order History Page")
    public void clickReorderButtonOnOrderHistoryPage() {
        OrderHistoryPage.clickReorderButton();
    }
    //THEN's
    @Then("should see Order History Page")
    public void shouldSeeOrderHistoryPage() {
        OrderHistoryPage.shouldSeeOrderHistoryPage();
    }

    @Then("should see Order History Area Title: {string} on Order History Page")
    public void shouldSeeOrderHistoryAreaTitleOnOrderHistoryPage(String title) {
        String text = OrderHistoryPage.shouldSeeOrderHistoryAreaTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Title: {string} on Order History Page")
    public void shouldSeeTitleOnOrderHistoryPage(String title) {

    }

    @Then("should see Order Placed Header: {string} on Order History Page")
    public void shouldSeeOrderPlacedHeaderOnOrderHistoryPage(String order) {
        String text = OrderHistoryPage.shouldSeeOrderPlacedHeader();
        Assert.assertEquals(text,order);
    }

    @Then("should see Order Placed: {string} on Order History Page")
    public void shouldSeeOrderPlacedOnOrderHistoryPage(String order) {
        String text = OrderHistoryPage.shouldSeeOrderPlaced();
        Assert.assertEquals(text,order);
    }

    @Then("should see Total Header: {string} on Order History Page")
    public void shouldSeeTotalHeaderOnOrderHistoryPage(String total) {
        String text = OrderHistoryPage.shouldSeeTotalHeader();
        Assert.assertEquals(text,total);
    }

    @Then("should see Total: {string} on Order History Page")
    public void shouldSeeTotalOnOrderHistoryPage(String total) {
        String text = OrderHistoryPage.shouldSeeTotal();
        Assert.assertEquals(text,total);
    }

    @Then("should see Ship To Header: {string} on Order History Page")
    public void shouldSeeShipToHeaderOnOrderHistoryPage(String shipToHeader) {
        String text = OrderHistoryPage.shouldSeeShipToHeader();
        Assert.assertEquals(text,shipToHeader);
    }

    @Then("should see Ship To: {string} on Order History Page")
    public void shouldSeeShipToOnOrderHistoryPage(String shipTo) {
        String text = OrderHistoryPage.shouldSeeShipTo();
        Assert.assertEquals(text,shipTo);
    }

    @Then("should see Order Details Header: {string} on Order History Page")
    public void shouldSeeOrderDetailsHeaderOnOrderHistoryPage(String details) {

    }

    @Then("should see Order Image on Order History Page")
    public void shouldSeeOrderImageOnOrderHistoryPage() {
        OrderHistoryPage.shouldSeeOrderImage();

    }

    @Then("should see Order Name: {string} on Order History Page")
    public void shouldSeeOrderNameOnOrderHistoryPage(String name) {
        String text = OrderHistoryPage.shouldSeeOrderName();
        Assert.assertEquals(text,name);
    }

    @Then("should see Order Type: {string} on Order History Page")
    public void shouldSeeOrderTypeOnOrderHistoryPage(String type) {
        String text = OrderHistoryPage.shouldSeeOrderType();
        Assert.assertEquals(text,type);
    }

    @Then("should see Order Count: {string} on Order History Page")
    public void shouldSeeOrderCountOnOrderHistoryPage(String count) {
        String text = OrderHistoryPage.shouldSeeOrderCount();
        Assert.assertEquals(text,count);
    }

    @Then("should see Order Price: {string} on Order History Page")
    public void shouldSeeOrderPriceOnOrderHistoryPage(String price) {
        String text = OrderHistoryPage.shouldSeeOrderPrice();
        Assert.assertEquals(text,price);
    }

    @Then("should see Estimated Delivery Header: {string} on Order History Page")
    public void shouldSeeEstimatedDeliveryHeaderOnOrderHistoryPage(String estimated) {

    }

    @Then("should see Reorder Button: {string} on Order History Page")
    public void shouldSeeReorderButtonOnOrderHistoryPage(String reorder) {
        String text =OrderHistoryPage.shouldSeeReorderButton();
        Assert.assertEquals(text,reorder);
    }
}
