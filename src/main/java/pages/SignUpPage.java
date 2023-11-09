package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class SignUpPage {

    private ElementHelper elementHelper;

    public SignUpPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private By lastName = By.cssSelector("#signUp>div:nth-child(2)>div>form>div:nth-child(2) label");
    private By email = By.cssSelector("#signUp>div:nth-child(2)>div>form>div:nth-child(3) label");
    private By password = By.cssSelector("#signUp>div:nth-child(2)>div>form>div:nth-child(4) label");
    private By confirmPassword = By.cssSelector("#signUp>div:nth-child(2)>div>form>div:nth-child(5) label");
    private By signUpButton = By.cssSelector(".mb-10 button");
    private By firstName = By.cssSelector("#signUp>div:nth-child(2)>div>form>div:nth-child(1) label");
    private By signUpTitle = By.cssSelector("#signUp>div:nth-child(1) h1");
    private By firstNameTextbox = By.cssSelector("#signUp>div:nth-child(2)>div>form>div:nth-child(1)>div input");
    private By lastNameTextbox = By.cssSelector("#signUp>div:nth-child(2)>div>form>div:nth-child(2)>div input");
    private By emailAddressTextbox = By.cssSelector("#signUp>div:nth-child(2)>div>form>div:nth-child(3)>div input");
    private By passwordTextbox = By.cssSelector("#signUp>div:nth-child(2)>div>form>div:nth-child(4)>div input");
    private By passwordHiddenButton = By.cssSelector("#signUp>div:nth-child(2)>div>form>div:nth-child(4)>div svg");
    private By confirmPasswordTextbox = By.cssSelector("#signUp>div:nth-child(2)>div>form>div:nth-child(5)>div input");
    private By confirmPasswordHiddenButton = By.cssSelector("#signUp>div:nth-child(2)>div>form>div:nth-child(5)>div svg");
    private By haveAnAccount = By.cssSelector("#signUp>div:nth-child(4)>button:nth-child(1)");
    private By signInButton = By.cssSelector("#signUp>div:nth-child(4)>button:nth-child(2)");
    private By popupMessage = By.cssSelector(".Toastify>div>div>div:nth-child(1)");
    private By popupIcon = By.cssSelector(".Toastify>div>div>div:nth-child(1) svg");
    private By emptyPasswordMessage = By.cssSelector("#signUp>div:nth-child(2)>div>form>div:nth-child(4) h2");
    private By emptyEmailMessage = By.cssSelector("#signUp>div:nth-child(2)>div>form>div:nth-child(3)>div h2");
    private By emptyConfirmPasswordMessage = By.cssSelector("#signUp>div:nth-child(2)>div>form>div:nth-child(5)> h2");
    private By invalidEmailMessage = By.cssSelector("#signUp>div:nth-child(2)>div>form>div:nth-child(3)>div h2");
    private By invalidPasswordMessage = By.cssSelector("#signUp>div:nth-child(2)>div>form>div:nth-child(4) h2");
    private By passwordsDoNotMatchMessage = By.cssSelector("#signUp>div:nth-child(2)>div>form>div:nth-child(5)> h2");

    private String url = "https://dev.traumkaffee.com/signup";

    public void checkUrl() {
        elementHelper.checkUrl(url);
    }

    public void userOnTheSignUpPage() {
        elementHelper.openUrl(url);
    }

    public void sendkeysLastName(String lastName) {
        elementHelper.sendKeys(lastNameTextbox,lastName);
    }

    public void sendkeysEmail(String email) {
        elementHelper.sendKeys(emailAddressTextbox, email);
    }

    public void sendkeysPassword(String password) {
        elementHelper.sendKeys(passwordTextbox, password);
    }

    public void sendkeysConfirmPassword(String confirmPass) {
        elementHelper.sendKeys(confirmPasswordTextbox, confirmPass);
    }

    public void clickSignUpButton() {
        elementHelper.click(signUpButton);
    }

    public void sendkeysFirstName(String firstName) {
        elementHelper.sendKeys(firstNameTextbox, firstName);
    }

    public String shouldSeeTitle() {
        return elementHelper.getText(signUpTitle);
    }

    public String shouldSeeFirstName() {
        return elementHelper.getText(firstName);
    }

    public String shouldSeeFirstNameTextbox() {
        return elementHelper.getAttribute(firstNameTextbox,"placeholder");
    }

    public String shouldSeeLastName() {
        return elementHelper.getText(lastName);
    }

    public String shouldSeeLastNameTextbox() {
        return elementHelper.getAttribute(lastNameTextbox,"placeholder");
    }

    public String shouldSeeEmailAddress() {
        return elementHelper.getText(email);
    }

    public String shouldSeeEmailAddressTextbox() {
        return elementHelper.getAttribute(emailAddressTextbox,"placeholder");
    }

    public String shouldSeePassword() {
        return elementHelper.getText(password);
    }

    public String shouldSeePasswordTextbox() {
        return elementHelper.getAttribute(passwordTextbox,"placeholder");
    }

    public void shouldSeePasswordHiddenButton() {
        elementHelper.click(passwordHiddenButton);
    }

    public String shouldSeeConfirmPassword() {
        return elementHelper.getText(confirmPassword);
    }

    public String shouldSeeConfirmPasswordTextbox() {
        return elementHelper.getAttribute(confirmPasswordTextbox,"placeholder");
    }

    public void shouldSeeConfirmPasswordHiddenButton() {
        elementHelper.click(confirmPasswordHiddenButton);
    }

    public String shouldSeeSignUpButton() {
        return elementHelper.getText(signUpButton);
    }

    public String shouldSeeHaveAnAccount() {
        return elementHelper.getText(haveAnAccount);
    }

    public String shouldSeeSignIn() {
        return elementHelper.getText(signInButton);
    }

    public String shouldSeePopupMessage() {
        return elementHelper.getText(popupMessage);
    }

    public void shouldSeePopupIcon() {
        elementHelper.checkElement(popupIcon);
    }

    public String shouldSeeEmptyEmailMessage(){
        return elementHelper.getText(emptyEmailMessage);
    }

    public String shouldSeeEmptyPasswordMessage() {
        return elementHelper.getText(emptyPasswordMessage);
    }

    public String shouldSeeEmptyConfirmPasswordMessage() {
        return elementHelper.getText(emptyConfirmPasswordMessage);
    }

    public String shouldSeeInvalidEmailMessage() {
        return elementHelper.getText(invalidEmailMessage);
    }

    public String shouldSeeInvalidPasswordMessage() {
        return elementHelper.getText(invalidPasswordMessage);
    }

    public String shouldSeePasswordsDoNotMatchMessage() {
        return elementHelper.getText(passwordsDoNotMatchMessage);
    }

    public void shouldSeeSignInPage() {

    }
}
