package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class SignInPage {
    private ElementHelper elementHelper;

    public SignInPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }


    private By Email = By.cssSelector(".mb-4>label");
    private By EmailTextbox = By.cssSelector(".mb-4>div:nth-child(2)>input");
    private By Password = By.cssSelector(".mb-6>label");
    private By SeePasswordTextbox = By.cssSelector(".mb-6>div>input.shadow");
    private By PasswordHiddenButton = By.cssSelector(".mb-6 .relative>button");
    private By RememberMe = By.cssSelector(".flex.mb-2>div>label");
    private By RememberMeCheckbox = By.cssSelector(".flex.mb-2>div>input");
    private By IHaveForgottenMyPassword = By.cssSelector(".flex.mb-2>button>a");
    private By SignInButton = By.cssSelector(".mb-10>button");
    private By OrSignUp = By.cssSelector(".mx-auto>span:nth-child(2)");
    private By CreateAnAccount = By.cssSelector(".mb-8>button:nth-child(1)");
    private By SignUp = By.cssSelector(".mb-8>button:nth-child(2)>a");
    private By PasswordEmptyMessage = By.cssSelector(".mt-2.font-sans.font-medium");
    private By EmailInvalidMessage = By.cssSelector("div.mb-4 h2.mt-2");
    private By PasswordInvalidMessage = By.cssSelector("div.mb-6 h2.mt-2");
    private By SignInBusinessAccountButton = By.cssSelector(".mt-4.mb-4>button:nth-child(3)");
    private By BusinessEmailTitle = By.cssSelector(".pb-4.mb-0>div:nth-child(2)>label");
    private By BusinessPasswordTitle = By.cssSelector(".pb-4.mb-0>div:nth-child(3)>label");
    private By BusinessEmailTextbox = By.cssSelector(".pb-4.mb-0>div:nth-child(2)>div>input");
    private By BusinessPasswordTextbox= By.cssSelector(".pb-4.mb-0>div:nth-child(3)>div>input");
    private By SignUpBusinessAccountButton = By.cssSelector(".space-y-4.mb-8>button:nth-child(2)");

    private String url = "https://dev.traumkaffee.com/signin";

    public void checkUrl(){
        elementHelper.checkUrl(url);
    }


    public void userOnTheSignInPage() {
         elementHelper.openUrl(url);
    }

    public String shouldSeeEmail() {
        return elementHelper.getText(Email);
    }

    public String shouldSeeEmailTextbox() {
        return elementHelper.getAttribute(EmailTextbox,"placeholder");

    }

    public String shouldSeePassword() {
        return elementHelper.getText(Password);
    }

    public String shouldSeePasswordTextbox() {
        return elementHelper.getAttribute(SeePasswordTextbox,"placeholder");
    }

    public void shouldSeePasswordHiddenButton() {
        elementHelper.findElement(PasswordHiddenButton).isDisplayed();
    }

    public String shouldSeeRememberMe() {
        return elementHelper.getText(RememberMe);
    }

    public void shouldSeeRememberMeCheckbox() {
        elementHelper.findElement(RememberMeCheckbox).isDisplayed();
    }

    public String shouldSeeIHaveForgottenMyPassword() {
        return elementHelper.getText(IHaveForgottenMyPassword);
    }

    public String shouldSeeSignInButton() {
        return elementHelper.getText(SignInButton);
    }

    public String shouldSeeOrSignUp() {
        return elementHelper.getText(OrSignUp);
    }

    public String shouldSeeCreateAnAccount() {
        return elementHelper.getText(CreateAnAccount);
    }

    public String shouldSeeSignUp() {
        return elementHelper.getText(SignUp);
    }


    public void sendkeysEmail(String mail) {
        elementHelper.sendKeys(EmailTextbox, mail);
    }

    public void clickSignInButton() {
        elementHelper.click(SignInButton);
    }

    public void sendkeysPassword(String pass) {
        elementHelper.sendKeys(SeePasswordTextbox, pass);
    }

    public void successfullySignInWithMailAndPassword(String email, String pass) {
        elementHelper.sendKeys(EmailTextbox, email);
        elementHelper.sendKeys(SeePasswordTextbox, pass);
        elementHelper.click(SignInButton);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String shouldSeePasswordEmptyMessage() {
        return elementHelper.getText(PasswordEmptyMessage);
    }

    public String shouldSeeEmailInvalidMessage() {
        return elementHelper.getText(EmailInvalidMessage);
    }

    public String shouldSeePasswordInvalidMessage() {
        return elementHelper.getText(PasswordInvalidMessage);
    }

    public void clickSignInBusinessAccountButton(){
        elementHelper.click(SignInBusinessAccountButton);
    }

    public String shouldSeeBusinessEmailTitle(){
        return elementHelper.getText(BusinessEmailTitle);
    }

    public String shouldSeeBusinessPasswordTitle(){
        return elementHelper.getText(BusinessPasswordTitle);
    }

    public String shouldSeeBusinessEmailTextbox(){
        return elementHelper.getAttribute(BusinessEmailTextbox, "placeholder");
    }

    public String shouldSeeBusinessPasswordTextbox(){
        return elementHelper.getAttribute(BusinessPasswordTextbox, "placeholder");
    }

    public String shouldSeeSignUpBusinessAccountButton(){
        return elementHelper.getText(SignUpBusinessAccountButton);
    }
}
