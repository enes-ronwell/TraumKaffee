package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class AccountDetailsPage {
    private ElementHelper elementHelper;

    public AccountDetailsPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private String url = "https://dev.traumkaffee.com/accountdetails";
    private By AccountDetailsAreaFirstName = By.cssSelector("#accountDetails>form>div:nth-child(1)>div:nth-child(1)>label");
    private By AccountDetailsAreaFirstNameTextBox = By.cssSelector("#accountDetails>form>div:nth-child(1)>div:nth-child(1)>input");
    private By AccountDetailsAreaLastName = By.cssSelector("#accountDetails>form>div:nth-child(1)>div:nth-child(2)>label");
    private By AccountDetailsAreaLastNameTextBox = By.cssSelector("#accountDetails>form>div:nth-child(1)>div:nth-child(2)>input");
    private By AccountDetailsAreaEmail = By.cssSelector("#accountDetails>form>div:nth-child(2)>div:nth-child(1)>label");
    private By AccountDetailsAreaEmailTextBox = By.cssSelector("#accountDetails>form>div:nth-child(2)>div:nth-child(1)>input");
    private By AccountDetailsAreaPassword = By.cssSelector("#accountDetails>form>div:nth-child(2)>div:nth-child(2)>div>label");
    private By AccountDetailsAreaPasswordTextBox = By.cssSelector("#accountDetails>form>div:nth-child(2)>div:nth-child(2)>div>input");
    private By AccountDetailsAreaUpdate = By.cssSelector("#accountDetails>form>div:nth-child(4)>button");
    private By AccountDetailsAreaPasswordEye = By.cssSelector("#accountDetails>form>div:nth-child(2)>div:nth-child(2)>div>div>button");
    private By AccountDetailsAreaCheckbox = By.cssSelector(".my-4 label");

    public void sendkeysAccountDetailsAreaFirstName(String firstName) {
        elementHelper.sendKeys(AccountDetailsAreaFirstNameTextBox, firstName);
    }

    public void sendkeysAccountDetailsAreaLastName(String lastName) {
        elementHelper.sendKeys(AccountDetailsAreaLastNameTextBox, lastName);
    }

    public void sendkeysAccountDetailsAreaEmail(String email) {
        elementHelper.sendKeys(AccountDetailsAreaEmailTextBox, email);
    }


    public void clickAccountDetailsAreaUpdate() {
        elementHelper.click(AccountDetailsAreaUpdate);
    }

    public void sendkeysAccountDetailsAreaPassword(String password) {
        elementHelper.sendKeys(AccountDetailsAreaPasswordTextBox, password);
    }

    public void clearAccountDetailsAreaFirstName() {
        elementHelper.clear(AccountDetailsAreaFirstNameTextBox);
    }

    public void clearAccountDetailsAreaLastName() {
        elementHelper.clear(AccountDetailsAreaLastNameTextBox);
    }

    public void shouldSeeAccountDetailsPage() {
        elementHelper.checkUrl("https://dev.traumkaffee.com/accountdetails");
    }

    public String shouldSeeAccountDetailsAreaFirstName() {
        return elementHelper.getText(AccountDetailsAreaFirstName);
    }

    public String shouldSeeAccountDetailsAreaLastName() {
        return elementHelper.getText(AccountDetailsAreaLastName);
    }

    public String shouldSeeAccountDetailsAreaEmail() {
        return elementHelper.getText(AccountDetailsAreaEmail);
    }

    public String shouldSeeAccountDetailsAreaPassword() {
        return elementHelper.getText(AccountDetailsAreaPassword);
    }

    public void shouldSeeAccountDetailsAreaPasswordEye() {
        elementHelper.checkElement(AccountDetailsAreaPasswordEye);
    }

    public String shouldSeeAccountDetailsAreaCheckbox() {
        return elementHelper.getText(AccountDetailsAreaCheckbox);
    }

    public void shouldSeeAccountDetailsAreaCheckboxCheck() {
        elementHelper.checkElement(AccountDetailsAreaCheckbox);

    }

    public String shouldSeeAccountDetailsAreaUpdate() {
        return elementHelper.getText(AccountDetailsAreaUpdate);
    }


}
