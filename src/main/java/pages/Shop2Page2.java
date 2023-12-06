package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class Shop2Page2 {

    private ElementHelper elementHelper;
    public Shop2Page2(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private String url = "https://dev.traumkaffee.com/product";
    private final By secondStoresOrderNowButton = By.cssSelector(".mt-0.mb-4>div:nth-child(2) button");














    public void userOnTheShopTwoPageTwo(){
        elementHelper.openUrl(url);
        elementHelper.click(secondStoresOrderNowButton);
    }

}
