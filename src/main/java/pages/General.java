package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class General {
    private ElementHelper elementHelper;
    WebDriver driver;

    public General(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    private By NavigateBack = By.id("");
    private By PopupMessage = By.cssSelector(".Toastify .Toastify__toast-body div:nth-child(2)");
    private By PopupCloseIcon = By.cssSelector(".Toastify button");
    private By PopupIcon = By.cssSelector(".Toastify .Toastify__toast-icon");

    public void tapsNavigateBack() {
        driver.navigate().back();
    }

    public void shouldSeeTheTraumKaffeeFacebookPage(String url) {
        elementHelper.checkUrl(url);
    }

    public void shouldSeeTheTraumKaffeeInstagramPage(String url) {
        elementHelper.checkUrl(url);
    }

    public void shouldSeeTheTraumKaffeeTwitterPage(String url) {
        elementHelper.checkUrl(url);
    }

    public void shouldSeeTheTraumKaffeeTiktokPage() {
        elementHelper.checkUrl("traumkaffee");
    }

    public String shouldSeePopupMessage() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return elementHelper.getText(PopupMessage);
    }

    public void shouldSeePopupCloseIcon() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        elementHelper.checkElement(PopupCloseIcon);
    }

    public void shouldSeePopupIcon() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        elementHelper.checkElement(PopupIcon);
    }

    /*public void clickPopupCloseIcon(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        elementHelper.click(PopupCloseIcon);
    }*/
}
