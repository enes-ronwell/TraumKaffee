package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class AddressesPage {
    private ElementHelper elementHelper;

    public AddressesPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private String url = "https://dev.traumkaffee.com/addresses";

    private By DeleteButton = By.cssSelector(".py-6.px-0>div:nth-child(2)>button:nth-child(2)");
    private By AddressesAreaCityDropdown = By.cssSelector("#state");
    private By AddressesAreaCountryDropdown = By.cssSelector("#country");
    private By AddressTitle = By.id("add");
    private By Phone = By.id("phone");
    private By FirstName = By.id("firstName");
    private By LastName = By.id("lastName");
    private By CompanyName = By.id("companyName");
    private By VatNumber = By.id("vatNumber");
    private By FullStreetAddress = By.id("fullStreet");
    private By AptFloorUnit = By.id("apt");
    private By Country = By.cssSelector("#country>option");
    private By City = By.cssSelector("#state>option");
    private By PostalCodes = By.id("postalCode");
    private By StateProvince = By.cssSelector("input#state");
    private By SaveAddressButton = By.cssSelector("button.capitalize.transform.ease-in-out.duration-300");
    private By AddNewAddressButton = By.cssSelector("#addresses>div>div>div>button");
    private By Title = By.cssSelector("#addresses>div>div>h3");
    private By AddressesAreaTitle = By.cssSelector("#add-address>h3");
    private By AddressesAreaDescription = By.cssSelector("#add-address>form>p");
    private By AddressesAreaAddressTitle = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div:nth-child(1)>form>div:nth-child(2)>div:nth-child(1)>label");
    private By AddressesAreaAddressTitleTextbox = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div:nth-child(1)>form>div:nth-child(2)>div:nth-child(1)>input");
    private By AddressesAreaPhone = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div:nth-child(1)>form>div:nth-child(2)>div:nth-child(2) label");
    private By AddressesAreaPhoneTextbox = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div:nth-child(1)>form>div:nth-child(2)>div:nth-child(2)>div");
    private By AddressesAreaFirstName = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div:nth-child(1)>form>div:nth-child(3)>div:nth-child(1) label");
    private By AddressesAreaFirstNameTextbox = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div:nth-child(1)>form>div:nth-child(3)>div:nth-child(1) input");
    private By AddressesAreaLastName = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div:nth-child(1)>form>div:nth-child(3)>div:nth-child(2) label");
    private By AddressesAreaLastNameTextbox = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div:nth-child(1)>form>div:nth-child(3)>div:nth-child(2) input");
    private By AddressesAreaCompanyName = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div>form>div:nth-child(4)>div:nth-child(1)>label");
    private By AddressesAreaCompanyNameTextbox = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div>form>div:nth-child(4)>div:nth-child(1)>input");
    private By AddressesAreaVatNumber = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div>form>div:nth-child(4)>div:nth-child(2)>label");
    private By AddressesAreaVatNumberTextbox = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div>form>div:nth-child(4)>div:nth-child(2)>input");
    private By AddressesAreaFullStreetAddress = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div>form>div:nth-child(5)>div:nth-child(1)>label");
    private By AddressesAreaFullStreetAddressTextbox = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div>form>div:nth-child(5)>div:nth-child(1)>input");
    private By AddressesAreaAptFloorUnit = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div>form>div:nth-child(5)>div:nth-child(2)>label");
    private By AddressesAreaAptFloorUnitTextbox = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div>form>div:nth-child(5)>div:nth-child(2)>input");
    private By AddressesAreaCountry = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div>form>div:nth-child(6)>div:nth-child(1)>label");
    private By AddressesAreaCountryDropdownOption = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div>form>div:nth-child(6)>div:nth-child(1)>select>option");
    private By AddressesAreaCity = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div>form>div:nth-child(6)>div:nth-child(2)>label");
    private By AddressesAreaCityDropdownOption = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div>form>div:nth-child(6)>div:nth-child(2)>select>option");
    private By AddressesAreaPostalCodes = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div>form>div:nth-child(7)>div:nth-child(1)>label");
    private By AddressesAreaPostalCodesTextbox = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div>form>div:nth-child(7)>div:nth-child(1)>input");
    private By AddressesAreaStateProvince = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div>form>div:nth-child(7)>div:nth-child(2)>label");
    private By AddressesAreaStateProvinceTextbox = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div>form>div:nth-child(7)>div:nth-child(2)>input");
    private By AddressesAreaAddressSaveAddressButton = By.cssSelector(".mx-0.w-full>div:nth-child(1)>div>form>button");
    private By SetPrimaryAddresses = By.cssSelector(".mt-16.mb-2.mx-4>label");
    private By SetPrimaryAddressCheckbox = By.cssSelector(".mt-16.mb-2.mx-4>input");
    private By CompanyNameHeader = By.cssSelector(".py-6.px-0>div>div>label:nth-child(3)");
    private By AddressTitleHeader = By.cssSelector(".py-6.px-0>div>div>label:nth-child(1)");
    private By EditButton = By.cssSelector(".py-6.px-0>div:nth-child(2)>button:nth-child(1)");
    private By AddressTitleOnAddress = By.cssSelector(".flex.flex-col.justify-center.items-center.mb-4>p");
    private By CompanyNameOnAddress = By.cssSelector(".flex.flex-col.justify-center.items-center.mb-4>span");
    private By NameLastNameOnAddresses = By.cssSelector("div.flex.flex-col>span.text-center.font-semibold");
    private By FullStreetAddressOnAddress = By.cssSelector("div.flex.flex-col>span.w-full:nth-child(3)");
    private By CountryCityAddress = By.cssSelector("div.flex.flex-col>span.w-full:nth-child(4)");




    public void userOnTheAddressesPage() {
        elementHelper.checkUrl(url);
    }

    public void clickDeleteButton() {
        elementHelper.click(DeleteButton);
    }

    public void clickAddressesAreaCityDropdown() {
        elementHelper.click(AddressesAreaCityDropdown);
    }

    public void clickAddressesAreaCountryDropdown() {
        elementHelper.click(AddressesAreaCountryDropdown);
    }

    public void sendkeysAddressTitle(String title) {
        elementHelper.sendKeys(AddressTitle, title);
    }

    public void sendkeysPhone(String phone) {
        elementHelper.sendKeys(Phone, phone);
    }

    public void sendkeysFirstName(String name) {
        elementHelper.sendKeys(FirstName, name);
    }

    public void sendkeysLastName(String lastName) {
        elementHelper.sendKeys(LastName, lastName);
    }

    public void sendkeysCompanyName(String name) {
        elementHelper.sendKeys(CompanyName, name);
    }

    public void sendkeysVatNumber(String number) {
        elementHelper.sendKeys(VatNumber, number);
    }

    public void sendkeysFullStreetAddress(String address) {
        elementHelper.sendKeys(FullStreetAddress, address);
    }

    public void sendkeysAptFloorUnit(String floor) {
        elementHelper.sendKeys(AptFloorUnit, floor);
    }

    public void selectCountry(String country) {
        elementHelper.clickElementWithText(Country, country);
    }

    public void selectCity(String city) {
        elementHelper.clickElementWithText(City, city);
    }

    public void sendkeysPostalCodes(String codes) {
        elementHelper.sendKeys(PostalCodes, codes);
    }

    public void sendkeysStateProvince(String state) {
        elementHelper.sendKeys(StateProvince, state);
    }

    public void clickSaveAddressButton() {
        elementHelper.click(SaveAddressButton);
    }

    public void clickAddNewAddressButton() {
        elementHelper.click(AddNewAddressButton);
    }

    public void shouldSeeAddressesPage() {
        elementHelper.checkUrl("https://dev.traumkaffee.com/addresses");
    }

    public String shouldSeeTitle() {
        return elementHelper.getText(Title);
    }

    public String shouldSeeAddNewAddressButton() {
        return elementHelper.getText(AddNewAddressButton);
    }

    public String shouldSeeAddressesAreaTitle() {
        return elementHelper.getText(AddressesAreaTitle);
    }

    public String shouldSeeAddressesAreaDescription() {
        return elementHelper.getText(AddressesAreaDescription);
    }

    public String shouldSeeAddressesAreaAddressTitle() {
        return elementHelper.getText(AddressesAreaAddressTitle);
    }

    public void shouldSeeAddressesAreaAddressTitleTextbox() {
        elementHelper.checkElement(AddressesAreaAddressTitleTextbox);
    }

    public String shouldSeeAddressesAreaPhone() {
        return elementHelper.getText(AddressesAreaPhone);
    }

    public void shouldSeeAddressesAreaPhoneTextbox() {
        elementHelper.checkElement(AddressesAreaPhoneTextbox);
    }

    public String shouldSeeAddressesAreaFirstName() {
        return elementHelper.getText(AddressesAreaFirstName);
    }

    public void shouldSeeAddressesAreaFirstNameTextbox() {
        elementHelper.checkElement(AddressesAreaFirstNameTextbox);
    }

    public String shouldSeeAddressesAreaLastName() {
        return elementHelper.getText(AddressesAreaLastName);
    }

    public void shouldSeeAddressesAreaLastNameTextbox() {
        elementHelper.checkElement(AddressesAreaLastNameTextbox);
    }

    public String shouldSeeAddressesAreaCompanyName() {
        return elementHelper.getText(AddressesAreaCompanyName);
    }

    public void shouldSeeAddressesAreaCompanyNameTextbox() {
        elementHelper.checkElement(AddressesAreaCompanyNameTextbox);
    }

    public String shouldSeeAddressesAreaVatNumber() {
        return elementHelper.getText(AddressesAreaVatNumber);
    }

    public void shouldSeeAddressesAreaVatNumberTextbox() {
        elementHelper.checkElement(AddressesAreaVatNumberTextbox);
    }

    public String shouldSeeAddressesAreaFullStreetAddress() {
        return elementHelper.getText(AddressesAreaFullStreetAddress);
    }

    public void shouldSeeAddressesAreaFullStreetAddressTextbox() {
        elementHelper.checkElement(AddressesAreaFullStreetAddressTextbox);
    }

    public String shouldSeeAddressesAreaAptFloorUnit() {
        return elementHelper.getText(AddressesAreaAptFloorUnit);
    }

    public void shouldSeeAddressesAreaAptFloorUnitTextbox() {
        elementHelper.checkElement(AddressesAreaAptFloorUnitTextbox);
    }

    public String shouldSeeAddressesAreaCountry() {
        return elementHelper.getText(AddressesAreaCountry);
    }

    public void shouldSeeAddressesAreaCountryDropdown() {
        elementHelper.checkElement(AddressesAreaCountryDropdown);
    }

    public void shouldSeeAddressesAreaCountryDropdownOption(String text) {
        elementHelper.checkElementWithText(AddressesAreaCountryDropdownOption, text);
    }

    public String shouldSeeAddressesAreaCity() {
        return elementHelper.getText(AddressesAreaCity);
    }

    public void shouldSeeAddressesAreaCityDropdown() {
        elementHelper.checkElement(AddressesAreaCityDropdown);
    }

    public void shouldSeeAddressesAreaCityDropdownOption(String text) {
        elementHelper.checkElementWithText(AddressesAreaCityDropdownOption, text);
    }

    public String shouldSeeAddressesAreaPostalCodes() {
        return elementHelper.getText(AddressesAreaPostalCodes);
    }

    public void shouldSeeAddressesAreaPostalCodesTextbox() {
        elementHelper.checkElement(AddressesAreaPostalCodesTextbox);
    }

    public String shouldSeeAddressesAreaStateProvince() {
        return elementHelper.getText(AddressesAreaStateProvince);
    }

    public void shouldSeeAddressesAreaStateProvinceTextbox() {
        elementHelper.checkElement(AddressesAreaStateProvinceTextbox);
    }

    public String shouldSeeAddressesAreaAddressSaveAddressButton() {
        return elementHelper.getText(AddressesAreaAddressSaveAddressButton);
    }

    public String shouldSeeSetPrimaryAddresses() {
        return elementHelper.getText(SetPrimaryAddresses);
    }

    public void shouldSeeSetPrimaryAddressCheckbox() {
        elementHelper.checkElement(SetPrimaryAddressCheckbox);
    }

    public String shouldSeeAddressTitleHeader() {
        return elementHelper.getText(AddressTitleHeader);
    }

    public String shouldSeeAddressTitle() {
        return elementHelper.getText(AddressTitleOnAddress);
    }

    public String shouldSeeCompanyNameHeader() {
        return elementHelper.getText(CompanyNameHeader);
    }

    public String shouldSeeCompanyName() {
        return elementHelper.getText(CompanyNameOnAddress);
    }

    public String shouldSeeFirstName() {
        return elementHelper.getText(NameLastNameOnAddresses);
    }

    public String shouldSeeLastName() {
        return elementHelper.getText(NameLastNameOnAddresses);
    }

    public String shouldSeeFullStreetAddress() {
        return elementHelper.getText(FullStreetAddressOnAddress);
    }

    public String shouldSeeAptFloorUnit() {
        return elementHelper.getText(FullStreetAddressOnAddress);
    }

    public String shouldSeeCountry() {
        return elementHelper.getText(CountryCityAddress);
    }

    public String shouldSeeCity() {
        return elementHelper.getText(CountryCityAddress);
    }

    public String shouldSeeEditButton() {
        return elementHelper.getText(EditButton);
    }

    public String shouldSeeDeleteButton() {
        return elementHelper.getText(DeleteButton);
    }


}
