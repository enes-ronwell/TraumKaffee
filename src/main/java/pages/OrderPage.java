package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class OrderPage {

    private ElementHelper elementHelper;

    public OrderPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private By HondurasOpalcaCoffee = By.cssSelector(".mb-16 .my-4>div:nth-child(2)>div>div:nth-child(1) h3:nth-child(1)");
    private By CloseTheItemDetailPopup = By.cssSelector(".p-1>svg>line:nth-child(2)");
    private By CompleteYourOrder = By.cssSelector(".mb-0.mx-0>div>div>div:nth-child(2)");
    private By EmailSection = By.cssSelector("#email");
    private By NameSection = By.cssSelector("#shippingName");
    private By AdressSection = By.cssSelector("#shippingAddressLine1");
    private By PhoneNumberSection = By.cssSelector("#shipping-address-fieldset #phoneNumber");
    private By CardNumberSection = By.cssSelector("#cardNumber");
    private By CardValidateDate = By.cssSelector("#cardExpiry");
    private By CardSecurityCode = By.cssSelector("#cardCvc");
    private By OdeButton = By.cssSelector(".mt4:nth-child(2)>div>div>button");
    private By YourOrderIsPlaced = By.cssSelector(".flex.flex-col.gap-4 >p:nth-child(2)");
    private By DubaiInAdressSection = By.cssSelector("#shippingAdministrativeArea>option:nth-child(6)");
    private By AddMoreButton = By.cssSelector(".w-14:nth-child(1)> svg:nth-child(3)");


    public void userShouldClickToHondurasOpalcaCoffee() {
        elementHelper.click(HondurasOpalcaCoffee);
    }

    public void userShouldCloseTheItemDetailPopup() {
        elementHelper.click(CloseTheItemDetailPopup);
    }

    public void userShouldClickCompleteYourOrderInBasket() {
        elementHelper.click(CompleteYourOrder);
    }

    public void userShouldWriteEMailInEmailSection(String email) {
        elementHelper.sendKeys(EmailSection, email);
    }

    public void userShouldWriteNameInNameSection(String name) {
        elementHelper.sendKeys(NameSection, name);
    }

    public void userShouldWriteInAdressSection(String adress) {
        elementHelper.sendKeys(AdressSection, adress);
    }

    public void userShouldWritePhoneNumberInPhoneNumberSection(String phone) {
        elementHelper.sendKeys(PhoneNumberSection, phone);
    }

    public void userShouldWriteCardNumberInCardNumberSection(String credit) {
        elementHelper.sendKeys(CardNumberSection, credit);
    }

    public void userShouldWriteCardValidateDateInCardValidateDateSection(String valid) {
        elementHelper.sendKeys(CardValidateDate, valid);
    }

    public void userShouldWriteCardSecurityCodeInCardSecurityCodeSection(String security) {
        elementHelper.sendKeys(CardSecurityCode, security);
    }

    public void userShouldClickOdeButton() {
        elementHelper.click(OdeButton);
    }

    public String userShouldSeeYourOrderIsPlaced() {
        return elementHelper.getText(YourOrderIsPlaced);
    }

    public void userShouldSelectDubaiInAdressSection(String address) {
        elementHelper.clickElementWithText(DubaiInAdressSection, address);
    }
    public void userShouldClickAddMoreButtonInHondurasOpalcaCoffeeDetail(){
        elementHelper.click(AddMoreButton);
    }


}
