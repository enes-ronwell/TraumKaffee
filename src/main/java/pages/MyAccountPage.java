package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class MyAccountPage {
    private ElementHelper elementHelper;
    private String url = "https://dev.traumkaffee.com/accountdetails";
    private By EmailTextbox = By.cssSelector(".mb-4>div:nth-child(2)>input");
    private By SeePasswordTextbox = By.cssSelector(".mb-6>div>input.shadow");
    private By MyAccountAreaAccount = By.cssSelector(".pb-6.px-6.pt-4>ul>li:nth-child(1)>a");
    private By MyAccountAreaAddresses = By.cssSelector("#users-accordion a");
    private By MyAccountAreaOrderHistory = By.cssSelector("#account-accordion a");
    private By MyAccountAreaSignOut = By.cssSelector(".pb-6.px-6.pt-4>ul>li:nth-child(5)>a");
    private By SeeMyAccountAreaTitle = By.cssSelector("#docs-sidebar>div>a");
    private By MyAccountAreaAccountImage = By.cssSelector(".pb-6.px-6.pt-4>ul>li:nth-child(1) svg");
    private By MyAccountAreaAddressesImage = By.cssSelector(".pb-6.px-6.pt-4>ul>li:nth-child(2) svg");
    private By MyAccountAreaOrderHistoryImage = By.cssSelector(".pb-6.px-6.pt-4>ul>li:nth-child(3) svg");
    private By MyAccountAreaSignOutImage = By.cssSelector(".pb-6.px-6.pt-4>ul>li:nth-child(5)>a>svg");
    private By SignInButton = By.cssSelector(".mb-10>button");


    public MyAccountPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    public void userOnTheMyAccountPageWithMailAndPassword(String mail, String pass) {
        elementHelper.sendKeys(EmailTextbox, mail);
        elementHelper.sendKeys(SeePasswordTextbox, pass);
        elementHelper.click(SignInButton);
    }

    public void clickMyAccountAreaAccount() {
        elementHelper.click(MyAccountAreaAccount);
    }

    public void clickMyAccountAreaAddresses() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        elementHelper.click(MyAccountAreaAddresses);
    }

    public void clickMyAccountAreaOrderHistory() {
        elementHelper.click(MyAccountAreaOrderHistory);
    }

    public void clickMyAccountAreaSignOut() {
        elementHelper.click(MyAccountAreaSignOut);
    }

    public void shouldSeeTheMyAccountPage() {
        elementHelper.checkUrl("https://dev.traumkaffee.com/accountdetails");
    }

    public String shouldSeeMyAccountAreaTitle() {
        return elementHelper.getText(SeeMyAccountAreaTitle);
    }

    public String shouldSeeMyAccountAreaAccount() {
        return elementHelper.getText(MyAccountAreaAccount);
    }

    public void shouldSeeMyAccountAreaAccountImage() {
        elementHelper.checkElement(MyAccountAreaAccountImage);
    }

    public String shouldSeeMyAccountAreaAddresses() {
        return elementHelper.getText(MyAccountAreaAddresses);
    }

    public void shouldSeeMyAccountAreaAddressesImage() {
        elementHelper.checkElement(MyAccountAreaAddressesImage);
    }

    public String shouldSeeMyAccountAreaOrderHistory() {
        return elementHelper.getText(MyAccountAreaOrderHistory);
    }

    public void shouldSeeMyAccountAreaOrderHistoryImage() {
        elementHelper.checkElement(MyAccountAreaOrderHistoryImage);
    }

    public String shouldSeeMyAccountAreaSignOut() {
        return elementHelper.getText(MyAccountAreaSignOut);
    }

    public void shouldSeeMyAccountAreaSignOutImage() {
        elementHelper.checkElement(MyAccountAreaSignOutImage);
    }


}
