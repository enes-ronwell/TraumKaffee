package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class StoreSelectionPage {
    private ElementHelper elementHelper;

    private final By pageTitle = By.cssSelector(".px-4.pt-16 h2");
    private final By firstStoreOrderNowButton = By.cssSelector(".mt-0.mb-4>div:nth-child(1) button");
    private final By secondStoresOrderNowButton = By.cssSelector(".mt-0.mb-4>div:nth-child(2) button");
    private final By map = By.cssSelector(".w-full:nth-child(2)>div:nth-child(2)>div");
    private final By firstStoresAddress = By.cssSelector(".mx-4.z-10>div:nth-child(2) h3");
    private final By secondStoresAddress = By.cssSelector(".mx-4.z-10>div:nth-child(2) h3");

    public StoreSelectionPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    public void userOnTheStoreSelectionPage(String url) {
        elementHelper.openUrl(url);
    }

    public String checkTitle() {
        return elementHelper.getText(pageTitle);
    }

    public String checkFirstStoresOrderNowButtonOnStoreSelectionPage() {
        return elementHelper.getText(firstStoreOrderNowButton);
    }

    public String checkSecondStoresOrderNowButtonOnStoreSelectionPage() {
        return elementHelper.getText(secondStoresOrderNowButton);
    }

    public void shouldSeeMapOnStoreSelectionPage() {
        elementHelper.checkElement(map);
    }

    public void clickTheFirstStoresOrderNowButtonOnStoreSelectionPage() {
        elementHelper.click(firstStoreOrderNowButton);
    }

    public String shouldSeeTheFirstStoresAddressOnTheShopPage() {
        return elementHelper.getText(firstStoresAddress);
    }

    public void clickTheSecondStoresOrderNowButtonOnStoreSelectionPage() {
        elementHelper.click(secondStoresOrderNowButton);
    }

    public String shouldSeeTheSecondStoresAddressOnTheShopPage() {
        return elementHelper.getText(secondStoresAddress);
    }
}
