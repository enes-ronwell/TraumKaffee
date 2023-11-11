package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.*;
import utils.DriverFactory;

public class AddressesPageDefinitions {
    AddressesPage addressesPage = new AddressesPage(DriverFactory.getDriver());
    pages.SignInPage SignInPage = new SignInPage(DriverFactory.getDriver());
    pages.NavigationBar NavigationBar = new NavigationBar(DriverFactory.getDriver());
    General general = new General(DriverFactory.getDriver());
    HomePage homePage = new HomePage(DriverFactory.getDriver());
    MyAccountPage myAccountPage = new MyAccountPage(DriverFactory.getDriver());

    //GİVEN's

    //WHEN's
    @When("click Delete Button on Addresses Page")
    public void clickDeleteButtonOnAddressesPage() {
        addressesPage.clickDeleteButton();
    }

    @When("click Addresses Area City Dropdown on Addresses Page")
    public void clickAddressesAreaCityDropdownOnAddressesPage() {
        addressesPage.clickAddressesAreaCityDropdown();
    }

    @When("click Addresses Area Country Dropdown on Addresses Page")
    public void clickAddressesAreaCountryDropdownOnAddressesPage() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        addressesPage.clickAddressesAreaCountryDropdown();
    }

    @When("sendkeys Address Title: {string} on Addresses Page")
    public void sendkeysAddressTitleOnAddressesPage(String title) {
        addressesPage.sendkeysAddressTitle(title);
    }

    @When("sendkeys Phone: {string} on Addresses Page")
    public void sendkeysPhoneOnAddressesPage(String phone) {
        addressesPage.sendkeysPhone(phone);
    }

    @When("sendkeys First Name: {string} on Addresses Page")
    public void sendkeysFirstNameOnAddressesPage(String name) {
        addressesPage.sendkeysFirstName(name);
    }

    @When("sendkeys Last Name: {string} on Addresses Page")
    public void sendkeysLastNameOnAddressesPage(String lastName) {
        addressesPage.sendkeysLastName(lastName);
    }

    @When("sendkeys Company Name: {string} on Addresses Page")
    public void sendkeysCompanyNameOnAddressesPage(String name) {
        addressesPage.sendkeysCompanyName(name);
    }

    @When("sendkeys Vat Number: {string} on Addresses Page")
    public void sendkeysVatNumberOnAddressesPage(String number) {
        addressesPage.sendkeysVatNumber(number);
    }

    @When("sendkeys Full Street Address: {string} on Addresses Page")
    public void sendkeysFullStreetAddressOnAddressesPage(String address) {
        addressesPage.sendkeysFullStreetAddress(address);
    }

    @When("sendkeys Apt, Floor, Unit: {string} on Addresses Page")
    public void sendkeysAptFloorUnitOnAddressesPage(String floor) {
        addressesPage.sendkeysAptFloorUnit(floor);
    }

    @When("select Country: {string} on Addresses Page")
    public void selectCountryOnAddressesPage(String country) {
        addressesPage.clickAddressesAreaCountryDropdown();
        addressesPage.selectCountry(country);
    }

    @When("select City: {string} on Addresses Page")
    public void selectCityOnAddressesPage(String city) {
        addressesPage.clickAddressesAreaCityDropdown();
        addressesPage.selectCity(city);
    }

    @When("sendkeys Postal Codes: {string} on Addresses Page")
    public void sendkeysPostalCodesOnAddressesPage(String codes) {
        addressesPage.sendkeysPostalCodes(codes);
    }

    @When("sendkeys State Province: {string} on Addresses Page")
    public void sendkeysStateProvinceOnAddressesPage(String state) {
        addressesPage.sendkeysStateProvince(state);
    }

    @When("click Save Address Button on Addresses Page")
    public void clickSaveAddressButtonOnAddressesPage() {
        addressesPage.clickSaveAddressButton();
    }

    @When("click Add New Address Button on Addresses Page")
    public void clickAddNewAddressButtonOnAddressesPage() {
        addressesPage.clickAddNewAddressButton();
    }

    //THEN's
    @Then("should see Addresses Page")
    public void shouldSeeAddressesPage() {
        addressesPage.shouldSeeAddressesPage();
    }

    @Then("should see Title: {string} on Addresses Page")
    public void shouldSeeTitleOnAddressesPage(String title) {
        String text = addressesPage.shouldSeeTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Add New Address Button: {string} on Addresses Page")
    public void shouldSeeAddNewAddressButtonOnAddressesPage(String button) {
        String text = addressesPage.shouldSeeAddNewAddressButton();
        Assert.assertEquals(text, button);
    }

    @Then("should see Addresses Area Title: {string} on Addresses Page")
    public void shouldSeeAddressesAreaTitleOnAddressesPage(String title) {
        String text = addressesPage.shouldSeeAddressesAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Addresses Area Description: {string} on Addresses Page")
    public void shouldSeeAddressesAreaDescriptionOnAddressesPage(String desc) {
        String text = addressesPage.shouldSeeAddressesAreaDescription();
        Assert.assertEquals(text, desc);
    }

    @Then("should see Addresses Area Address Title: {string} on Addresses Page")
    public void shouldSeeAddressesAreaAddressTitleOnAddressesPage(String title) {
        String text = addressesPage.shouldSeeAddressesAreaAddressTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Addresses Area Address Title Textbox on Addresses Page")
    public void shouldSeeAddressesAreaAddressTitleTextboxOnAddressesPage() {
        addressesPage.shouldSeeAddressesAreaAddressTitleTextbox();

    }

    @Then("should see Addresses Area Phone: {string} on Addresses Page")
    public void shouldSeeAddressesAreaPhoneOnAddressesPage(String address) {
        String text = addressesPage.shouldSeeAddressesAreaPhone();
        Assert.assertEquals(text, address);
    }

    @Then("should see Addresses Area Phone Textbox on Addresses Page")
    public void shouldSeeAddressesAreaPhoneTextboxOnAddressesPage() {
        addressesPage.shouldSeeAddressesAreaPhoneTextbox();
    }

    @Then("should see Addresses Area First Name: {string} on Addresses Page")
    public void shouldSeeAddressesAreaFirstNameOnAddressesPage(String address) {
        String text = addressesPage.shouldSeeAddressesAreaFirstName();
        Assert.assertEquals(text, address);
    }

    @Then("should see Addresses Area First Name Textbox on Addresses Page")
    public void shouldSeeAddressesAreaFirstNameTextboxOnAddressesPage() {
        addressesPage.shouldSeeAddressesAreaFirstNameTextbox();
    }

    @Then("should see Addresses Area Last Name: {string} on Addresses Page")
    public void shouldSeeAddressesAreaLastNameOnAddressesPage(String lastName) {
        String text = addressesPage.shouldSeeAddressesAreaLastName();
        Assert.assertEquals(text, lastName);
    }

    @Then("should see Addresses Area Last Name Textbox on Addresses Page")
    public void shouldSeeAddressesAreaLastNameTextboxOnAddressesPage() {
        addressesPage.shouldSeeAddressesAreaLastNameTextbox();
    }

    @Then("should see Addresses Area Company Name: {string} on Addresses Page")
    public void shouldSeeAddressesAreaCompanyNameOnAddressesPage(String name) {
        String text = addressesPage.shouldSeeAddressesAreaCompanyName();
        Assert.assertEquals(text, name);
    }

    @Then("should see Addresses Area Company Name Textbox on Addresses Page")
    public void shouldSeeAddressesAreaCompanyNameTextboxOnAddressesPage() {
        addressesPage.shouldSeeAddressesAreaCompanyNameTextbox();
    }

    @Then("should see Addresses Area Vat Number: {string} on Addresses Page")
    public void shouldSeeAddressesAreaVatNumberOnAddressesPage(String vat) {
        String text = addressesPage.shouldSeeAddressesAreaVatNumber();
        Assert.assertEquals(text, vat);
    }

    @Then("should see Addresses Area Vat Number Textbox on Addresses Page")
    public void shouldSeeAddressesAreaVatNumberTextboxOnAddressesPage() {
        addressesPage.shouldSeeAddressesAreaVatNumberTextbox();
    }

    @Then("should see Addresses Area Full Street Address: {string} on Addresses Page")
    public void shouldSeeAddressesAreaFullStreetAddressOnAddressesPage(String street) {
        String text = addressesPage.shouldSeeAddressesAreaFullStreetAddress();
        Assert.assertEquals(text, street);
    }

    @Then("should see Addresses Area Full Street Address Textbox on Addresses Page")
    public void shouldSeeAddressesAreaFullStreetAddressTextboxOnAddressesPage() {
        addressesPage.shouldSeeAddressesAreaFullStreetAddressTextbox();
    }

    @Then("should see Addresses Area Apt, Floor, Unit: {string} on Addresses Page")
    public void shouldSeeAddressesAreaAptFloorUnitOnAddressesPage(String apt) {
        String text = addressesPage.shouldSeeAddressesAreaAptFloorUnit();
        Assert.assertEquals(text, apt);
    }

    @Then("should see Addresses Area Apt, Floor, Unit Textbox on Addresses Page")
    public void shouldSeeAddressesAreaAptFloorUnitTextboxOnAddressesPage() {
        addressesPage.shouldSeeAddressesAreaAptFloorUnitTextbox();
    }

    @Then("should see Addresses Area Country: {string} on Addresses Page")
    public void shouldSeeAddressesAreaCountryOnAddressesPage(String country) {
        String text = addressesPage.shouldSeeAddressesAreaCountry();
        Assert.assertEquals(text, country);
    }

    @Then("should see Addresses Area Country Dropdown on Addresses Page")
    public void shouldSeeAddressesAreaCountryDropdownOnAddressesPage() {
        addressesPage.shouldSeeAddressesAreaCountryDropdown();
    }

    @Then("should see Addresses Area Country Dropdown Option: {string} on Addresses Page")
    public void shouldSeeAddressesAreaCountryDropdownOptionOnAddressesPage(String country) {
        addressesPage.shouldSeeAddressesAreaCountryDropdownOption(country);
    }

    @Then("should see Addresses Area City: {string} on Addresses Page")
    public void shouldSeeAddressesAreaCityOnAddressesPage(String city) {
        String text = addressesPage.shouldSeeAddressesAreaCity();
        Assert.assertEquals(text, city);
    }

    @Then("should see Addresses Area City Dropdown on Addresses Page")
    public void shouldSeeAddressesAreaCityDropdownOnAddressesPage() {
        addressesPage.shouldSeeAddressesAreaCityDropdown();
    }

    @Then("should see Addresses Area City Dropdown Option: {string} on Addresses Page")
    public void shouldSeeAddressesAreaCityDropdownOptionOnAddressesPage(String city) {
        addressesPage.shouldSeeAddressesAreaCityDropdownOption(city);
    }

    @Then("should see Addresses Area Postal Codes: {string} on Addresses Page")
    public void shouldSeeAddressesAreaPostalCodesOnAddressesPage(String postal) {
        String text = addressesPage.shouldSeeAddressesAreaPostalCodes();
        Assert.assertEquals(text, postal);
    }

    @Then("should see Addresses Area Postal Codes Textbox on Addresses Page")
    public void shouldSeeAddressesAreaPostalCodesTextboxOnAddressesPage() {
        addressesPage.shouldSeeAddressesAreaPostalCodesTextbox();
    }

    @Then("should see Addresses Area State Province: {string} on Addresses Page")
    public void shouldSeeAddressesAreaStateProvinceOnAddressesPage(String state) {
        String text = addressesPage.shouldSeeAddressesAreaStateProvince();
        Assert.assertEquals(text, state);
    }

    @Then("should see Addresses Area State Province Textbox on Addresses Page")
    public void shouldSeeAddressesAreaStateProvinceTextboxOnAddressesPage() {
        addressesPage.shouldSeeAddressesAreaStateProvinceTextbox();
    }

    @Then("should see Addresses Area Address Save Address Button: {string} on Addresses Page")
    public void shouldSeeAddressesAreaAddressSaveAddressButtonOnAddressesPage(String address) {
        String text = addressesPage.shouldSeeAddressesAreaAddressSaveAddressButton();
        Assert.assertEquals(text, address);
    }

    @Then("should see Set Primary Address: {string} on Addresses Page")
    public void shouldSeeSetPrimaryAddressOnAddressesPage(String address) {
        String text = addressesPage.shouldSeeSetPrimaryAddresses();
        Assert.assertEquals(text, address);
    }

    @Then("should see Set Primary Address Checkbox on Addresses Page")
    public void shouldSeeSetPrimaryAddressCheckboxOnAddressesPage() {
        addressesPage.shouldSeeSetPrimaryAddressCheckbox();
    }

    @Then("should see Address Title Header: {string} on Addresses Page")
    public void shouldSeeAddressTitleHeaderOnAddressesPage(String title) {
        String text = addressesPage.shouldSeeAddressTitleHeader();
    }

    @Then("should see Address Title: {string} on Addresses Page")
    public void shouldSeeAddressTitleOnAddressesPage(String title) {
        String text = addressesPage.shouldSeeAddressTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Company Name Header: {string} on Addresses Page")
    public void shouldSeeCompanyNameHeaderOnAddressesPage(String name) {
        String text = addressesPage.shouldSeeCompanyNameHeader();
        Assert.assertEquals(text, name);
    }

    @Then("should see Company Name: {string} on Addresses Page")
    public void shouldSeeCompanyNameOnAddressesPage(String name) {
        String text = addressesPage.shouldSeeCompanyName();
        Assert.assertEquals(text, name);
    }

    @Then("should see First Name: {string} on Addresses Page")
    public void shouldSeeFirstNameOnAddressesPage(String name) {
        String text = addressesPage.shouldSeeFirstName();
        Assert.assertTrue(text.contains(name));
    }

    @Then("should see Last Name: {string} on Addresses Page")
    public void shouldSeeLastNameOnAddressesPage(String name) {
        String text = addressesPage.shouldSeeLastName();
        Assert.assertTrue(text.contains(name));
    }

    @Then("should see Full Street Address: {string} on Addresses Page")
    public void shouldSeeFullStreetAddressOnAddressesPage(String street) {
        String text = addressesPage.shouldSeeFullStreetAddress();
        Assert.assertTrue(text.contains(street));
    }

    @Then("should see Apt, Floor, Unit: {string} on Addresses Page")
    public void shouldSeeAptFloorUnitOnAddressesPage(String floor) {
        String text = addressesPage.shouldSeeAptFloorUnit();
        Assert.assertTrue(text.contains(floor));
    }

    @Then("should see Country: {string} on Addresses Page")
    public void shouldSeeCountryOnAddressesPage(String country) {
        String text = addressesPage.shouldSeeCountry();
        Assert.assertTrue(text.contains(country));
    }

    @Then("should see City: {string} on Addresses Page")
    public void shouldSeeCityOnAddressesPage(String city) {
        String text = addressesPage.shouldSeeCity();
        Assert.assertTrue(text.contains(city));
    }

    @Then("should see Edit Button: {string} on Addresses Page")
    public void shouldSeeEditButtonOnAddressesPage(String button) {
        String text = addressesPage.shouldSeeEditButton();
        Assert.assertEquals(text, button);
    }

    @Then("should see Delete Button: {string} on Addresses Page")
    public void shouldSeeDeleteButtonOnAddressesPage(String button) {
        String text = addressesPage.shouldSeeDeleteButton();
        Assert.assertEquals(text, button);
    }

    @Given("user on the Addresses Page with Mail:{string} and Password:{string}")
    public void userOnTheAddressesPageWithMailAndPassword(String mail, String pass) {
        homePage.goToHomePage("https://dev.traumkaffee.com/");
        NavigationBar.clickNavBarAreaSignIn();
        SignInPage.successfullySignInWithMailAndPassword(mail, pass);
        NavigationBar.clickNavBarAreaMyAccount();
        myAccountPage.clickMyAccountAreaAddresses();
        addressesPage.shouldSeeAddressesPage();
    }
}
