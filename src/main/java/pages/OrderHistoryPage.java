package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class OrderHistoryPage {

    private ElementHelper elementHelper;

    public OrderHistoryPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private String url = "https://dev.traumkaffee.com/order-history";
    private By ReorderButton = By.cssSelector("#orderBox>div>div:nth-child(3)>div>button");
    private By OrderHistoryAreaTitle = By.cssSelector("#orderHistory>div>h3");
    private By OrderPlacedHeader = By.cssSelector("#orderBox>div>div:nth-child(1)>div:nth-child(1) label");
    private By OrderPlaced = By.cssSelector("#orderBox>div>div:nth-child(1)>div:nth-child(1) span");
    private By TotalHeader = By.cssSelector("#orderBox>div>div:nth-child(1)>div:nth-child(2) label");
    private By Total = By.cssSelector("#orderBox>div>div:nth-child(1)>div:nth-child(2) span");
    private By ShipToHeader = By.cssSelector("#orderBox>div>div:nth-child(1)>div:nth-child(3) label");
    private By ShipTo = By.cssSelector("#orderBox>div>div:nth-child(1)>div:nth-child(3) span");
    private By OrderImage = By.cssSelector("#orderBox>div>div:nth-child(2)>div:nth-child(1) img");
    private By OrderName = By.cssSelector("#orderBox>div>div:nth-child(2)>div:nth-child(2) h4");
    private By OrderType = By.cssSelector("#orderBox>div>div:nth-child(2)>div:nth-child(2) span");
    private By OrderCount = By.cssSelector("#orderBox>div>div:nth-child(2)>div:nth-child(3)>div:nth-child(1)");
    private By OrderPrice = By.cssSelector("#orderBox>div>div:nth-child(2)>div:nth-child(3)>div:nth-child(2)");


    public void userOnTheOrderHistoryPage() {
        elementHelper.openUrl(url);
    }

    public void clickReorderButton() {
        elementHelper.click(ReorderButton);
    }

    public void shouldSeeOrderHistoryPage() {
        elementHelper.checkUrl("https://dev.traumkaffee.com/order-history");
    }

    public String shouldSeeOrderHistoryAreaTitle() {
        return elementHelper.getText(OrderHistoryAreaTitle);
    }

    public String shouldSeeOrderPlacedHeader() {
        return elementHelper.getText(OrderPlacedHeader);
    }

    public String shouldSeeOrderPlaced() {
        return elementHelper.getText(OrderPlaced);
    }

    public String shouldSeeTotalHeader() {
        return elementHelper.getText(TotalHeader);
    }

    public String shouldSeeTotal() {
        return elementHelper.getText(Total);
    }

    public String shouldSeeShipToHeader() {
        return elementHelper.getText(ShipToHeader);
    }

    public String shouldSeeShipTo() {
        return elementHelper.getText(ShipTo);
    }

    public void shouldSeeOrderImage() {
        elementHelper.checkElement(OrderImage);
    }

    public String shouldSeeOrderName() {
        return elementHelper.getText(OrderName);
    }

    public String shouldSeeOrderType() {
        return elementHelper.getText(OrderType);
    }

    public String shouldSeeOrderCount() {
        return elementHelper.getText(OrderCount);
    }

    public String shouldSeeOrderPrice() {
        return elementHelper.getText(OrderPrice);
    }

    public String shouldSeeReorderButton() {
        return elementHelper.getText(ReorderButton);
    }
}
