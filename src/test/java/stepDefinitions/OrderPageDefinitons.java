package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AboutPage;
import pages.OrderPage;
import utils.DriverFactory;

public class OrderPageDefinitons {
    OrderPage orderPage = new OrderPage(DriverFactory.getDriver());


    @When("user should click to Honduras Opalca Coffee ShopTwo Page")
    public void userShouldClickToHondurasOpalcaCoffeeShopTwoPage() {
        orderPage.userShouldClickToHondurasOpalcaCoffee();
    }

    @When("user should close the Item Detail Popup on ShopTwo Page")
    public void userShouldCloseTheItemDetailPopupOnShopTwoPage() {
        orderPage.userShouldCloseTheItemDetailPopup();
    }

    @When("user should click Complete Your Order in Basket on ShopTwo Page")
    public void userShouldClickCompleteYourOrderInBasketOnShopTwoPage() throws InterruptedException {
        orderPage.userShouldClickCompleteYourOrderInBasket();
        Thread.sleep(10000);
    }

    @When("user should write e mail : {string} in email section on Order Page")
    public void userShouldWriteEMailInEmailSectionOnOrderPage(String email) {
        orderPage.userShouldWriteEMailInEmailSection(email);
    }

    @When("user should write name : {string} in name section on Order Page")
    public void userShouldWriteNameInNameSectionOnOrderPage(String name) {
        orderPage.userShouldWriteNameInNameSection(name);
    }

    @When("user should write : {string} in adress section on Order Page")
    public void userShouldWriteInAdressSectionOnOrderPage(String adress) {
        orderPage.userShouldWriteInAdressSection(adress);
    }

    @When("user should write phone number : {string} in phone number section on Order Page")
    public void userShouldWritePhoneNumberInPhoneNumberSectionOnOrderPage(String phone) {
        orderPage.userShouldWritePhoneNumberInPhoneNumberSection(phone);
    }

    @When("user should write card number : {string} in card number section  on Order Page")
    public void userShouldWriteCardNumberInCardNumberSectionOnOrderPage(String credit) {
        orderPage.userShouldWriteCardNumberInCardNumberSection(credit);
    }

    @When("user should write card validate date :{string} in card validate date section on Order Page")
    public void userShouldWriteCardValidateDateInCardValidateDateSectionOnOrderPage(String valid) {
        orderPage.userShouldWriteCardValidateDateInCardValidateDateSection(valid);
    }

    @When("user should write card security code :{string} in card security code section on Order Page")
    public void userShouldWriteCardSecurityCodeInCardSecurityCodeSectionOnOrderPage(String security) {
        orderPage.userShouldWriteCardSecurityCodeInCardSecurityCodeSection(security);
    }

    @When("user should click Ode Button on Order Page")
    public void userShouldClickOdeButtonOnOrderPage() {
        orderPage.userShouldClickOdeButton();
    }

    @Then("user should see Your Order Is Placed :{string} in Order Page")
    public void userShouldSeeYourOrderIsPlacedInOrderPage(String title) {
        String text = orderPage.userShouldSeeYourOrderIsPlaced();
        Assert.assertEquals(text, title);
    }

    @When("user should select Dubai : {string} in adress section on Order Page")
    public void userShouldSelectDubaiInAdressSectionOnOrderPage(String address) {
        orderPage.userShouldSelectDubaiInAdressSection(address);
    }

    @When("user should click Add more Button in HondurasOpalcaCoffee Detail on Shop Two Page")
    public void userShouldClickAddMoreButtonInHondurasOpalcaCoffeeDetailOnShopTwoPage() {
        orderPage.userShouldClickAddMoreButtonInHondurasOpalcaCoffeeDetail();

    }
}
