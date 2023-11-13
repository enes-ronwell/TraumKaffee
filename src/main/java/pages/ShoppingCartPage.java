package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ShoppingCartPage {
    private ElementHelper elementHelper;

    public ShoppingCartPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }


    private String url = "https://dev.traumkaffee.com/shoppingCart";
    private By FeaturedItemsAreaFirstProductImage = By.cssSelector(".mb-16>div:nth-child(1)>img");
    private By FeaturedItemsAreaSecondProductImage = By.cssSelector(".mb-16>div:nth-child(2)>img");
    private By FeaturedItemsAreaThirdProductImage = By.cssSelector(".mb-16>div:nth-child(3)>img");
    private By FeaturedItemsAreaFourthProductImage = By.cssSelector(".mb-16>div:nth-child(4)>img");
    private By FeaturedItemsAreaFirstProductAddButton = By.cssSelector(".mb-16>div:nth-child(1)>div>div>div>button");
    private By FeaturedItemsAreaSecondProductAddButton = By.cssSelector(".mb-16>div:nth-child(2)>div>div>div>button");
    private By FeaturedItemsAreaThirdProductAddButton = By.cssSelector(".mb-16>div:nth-child(3)>div>div>div>button");
    private By FeaturedItemsAreaFourthProductAddButton = By.cssSelector(".mb-16>div:nth-child(4)>div>div>div>button");
    private By TotalAreaContinueShopping = By.cssSelector(".pr-2 .mt-6>button:nth-child(1)");
    private By ShoppingCartAreaOurGuidesText = By.cssSelector(".mr-8 span:nth-child(1)");
    private By ShoppingCartAreaShoppingText = By.cssSelector(".mr-8 span:nth-child(2)");
    private By FeaturedItemsAreaTitle = By.cssSelector(".mt-10>div>div>h3");
    private By FeaturedItemsAreaFirstProductName = By.cssSelector("#cardShopping>div>div>div:nth-child(1) span:nth-child(1)");
    private By FeaturedItemsAreaFirstProductPrice = By.cssSelector("#cardShopping>div>div>div:nth-child(1) p");
    private By FeaturedItemsAreaSecondProductName = By.cssSelector("#cardShopping>div>div>div:nth-child(2) span");
    private By FeaturedItemsAreaSecondProductPrice = By.cssSelector("#cardShopping>div>div>div:nth-child(2) p");
    private By FeaturedItemsAreaThirdProductName = By.cssSelector("#cardShopping>div>div>div:nth-child(3) span");
    private By FeaturedItemsAreaThirdProductPrice = By.cssSelector("#cardShopping>div>div>div:nth-child(3) p");
    private By FeaturedItemsAreaFourthProductName = By.cssSelector("#cardShopping>div>div>div:nth-child(4) span:nth-child(1)");
    private By FeaturedItemsAreaFourthProductPrice = By.cssSelector("#cardShopping>div>div>div:nth-child(4) p");
    private By TotalAreaSubTotalHeader = By.cssSelector(".py-6>div:nth-child(1)>div:nth-child(1)");
    private By TotalAreaSubTotal = By.cssSelector(".py-6>div:nth-child(1)>div:nth-child(2)");
    private By TotalAreaDiscountHeader = By.cssSelector(".py-6>div:nth-child(2)>div:nth-child(1)");
    private By TotalAreaDiscount = By.cssSelector(".py-6>div:nth-child(2)>div:nth-child(2)");
    private By TotalAreaDeliveryHeader = By.cssSelector(".py-6>div:nth-child(3)>div:nth-child(1)");
    private By TotalAreaDelivery = By.cssSelector(".py-6>div:nth-child(3)>div:nth-child(2)");
    private By TotalAreaTaxHeader = By.cssSelector(".py-6>div:nth-child(4)>div:nth-child(1)");
    private By TotalAreaTax = By.cssSelector(".py-6>div:nth-child(4)>div:nth-child(2)");
    private By TotalAreaEstimatedTotalHeader = By.cssSelector(".mx-6>div:nth-child(2)>div:nth-child(1)");
    private By TotalAreaEstimatedTotal = By.cssSelector(".mx-6>div:nth-child(2)>div:nth-child(2)");
    private By TotalAreaGoToPayment = By.cssSelector(".pr-2 .mt-6>button:nth-child(2)");
    private By ShoppingCartAreaTitle = By.cssSelector(".mr-8>p");
    private By ShoppingCartAreaImage = By.cssSelector("#emptyCard img");
    private By ShoppingCartAreaDescription = By.cssSelector("#emptyCard p");
    private By QuantityUpButton = By.cssSelector(".h-8 button:nth-child(1)");
    private By QuantityDownButton = By.cssSelector(".h-8 button:nth-child(2)");
    private By QuantityText = By.cssSelector(".h-8 label");
    private By ItemName = By.cssSelector(".mx-4.py-4>div:nth-child(3)>div:nth-child(1)");
    private By FirstProductName = By.cssSelector(".py-4.mx-4>div:nth-child(3)>div:nth-child(1)");
    private By SecondProductName = By.cssSelector(".py-4.mx-4:nth-child(2)>div:nth-child(3)>div:nth-child(1)");
    private By GoToPaymentButton = By.cssSelector(".gap-4.mt-6>button:nth-child(2)");

    public void userOnTheShoppingCartPage() {
        elementHelper.openUrl(url);
    }

    public void clickFeaturedItemsAreaFirstProductImage() {
        elementHelper.click(FeaturedItemsAreaFirstProductImage);
    }

    public void clickFeaturedItemsAreaSecondProductImage() {
        elementHelper.click(FeaturedItemsAreaSecondProductImage);
    }

    public void clickFeaturedItemsAreaThirdProductImage() {
        elementHelper.click(FeaturedItemsAreaThirdProductImage);
    }

    public void clickFeaturedItemsAreaFourthProductImage() {
        elementHelper.click(FeaturedItemsAreaFourthProductImage);
    }

    public void clickFeaturedItemsAreaFirstProductAddButton() {
        elementHelper.click(FeaturedItemsAreaFirstProductAddButton);
    }

    public void clickFeaturedItemsAreaSecondProductAddButton() {
        elementHelper.click(FeaturedItemsAreaSecondProductAddButton);
    }

    public void clickFeaturedItemsAreaThirdProductAddButton() {
        elementHelper.click(FeaturedItemsAreaThirdProductAddButton);
    }

    public void clickFeaturedItemsAreaFourthProductAddButton() {
        elementHelper.click(FeaturedItemsAreaFourthProductAddButton);
    }

    public void clickTotalAreaContinueShopping() {
        elementHelper.click(TotalAreaContinueShopping);
    }

    public void clickShoppingCartAreaOurGuidesText() {
        elementHelper.click(ShoppingCartAreaOurGuidesText);
    }

    public void shouldSeeTheShoppingCartPage() {
        elementHelper.checkUrl("https://dev.traumkaffee.com/product");
    }

    public String shouldSeeFeaturedItemsAreaTitle() {
        return elementHelper.getText(FeaturedItemsAreaTitle);
    }

    public void shouldSeeFeaturedItemsAreaFirstProductImage() {
        elementHelper.checkElement(FeaturedItemsAreaFirstProductImage);
    }

    public String shouldSeeFeaturedItemsAreaFirstProductName() {
        return elementHelper.getText(FeaturedItemsAreaFirstProductName);
    }

    public String shouldSeeFeaturedItemsAreaFirstProductPrice() {
        return elementHelper.getText(FeaturedItemsAreaFirstProductPrice);
    }

    public void shouldSeeFeaturedItemsAreaFirstProductAddButton() {
        elementHelper.checkElement(FeaturedItemsAreaFirstProductAddButton);
    }

    public void shouldSeeFeaturedItemsAreaSecondProductImage() {
        elementHelper.checkElement(FeaturedItemsAreaSecondProductImage);
    }

    public String shouldSeeFeaturedItemsAreaSecondProductName() {
        return elementHelper.getText(FeaturedItemsAreaSecondProductName);
    }

    public String shouldSeeFeaturedItemsAreaSecondProductPrice() {
        return elementHelper.getText(FeaturedItemsAreaSecondProductPrice);
    }

    public void shouldSeeFeaturedItemsAreaSecondProductAddButton() {
        elementHelper.checkElement(FeaturedItemsAreaSecondProductAddButton);
    }

    public void shouldSeeFeaturedItemsAreaThirdProductImage() {
        elementHelper.checkElement(FeaturedItemsAreaThirdProductImage);
    }

    public String shouldSeeFeaturedItemsAreaThirdProductName() {
        return elementHelper.getText(FeaturedItemsAreaThirdProductName);
    }

    public String shouldSeeFeaturedItemsAreaThirdProductPrice() {
        return elementHelper.getText(FeaturedItemsAreaThirdProductPrice);
    }

    public void shouldSeeFeaturedItemsAreaThirdProductAddButton() {
        elementHelper.checkElement(FeaturedItemsAreaThirdProductAddButton);
    }

    public void shouldSeeFeaturedItemsAreaFourthProductImage() {
        elementHelper.checkElement(FeaturedItemsAreaFourthProductImage);
    }

    public String shouldSeeFeaturedItemsAreaFourthProductName() {
        return elementHelper.getText(FeaturedItemsAreaFourthProductName);
    }

    public String shouldSeeFeaturedItemsAreaFourthProductPrice() {
        return elementHelper.getText(FeaturedItemsAreaFourthProductPrice);
    }

    public void shouldSeeFeaturedItemsAreaFourthProductAddButton() {
        elementHelper.checkElement(FeaturedItemsAreaFourthProductAddButton);
    }

    public void clickShoppingCartAreaShoppingText() {
        elementHelper.click(ShoppingCartAreaShoppingText);
    }

    public String shouldSeeTotalAreaSubTotalHeader() {
        return elementHelper.getText(TotalAreaSubTotalHeader);
    }

    public String shouldSeeTotalAreaSubTotal() {
        return elementHelper.getText(TotalAreaSubTotal);
    }

    public String shouldSeeTotalAreaDiscountHeader() {
        return elementHelper.getText(TotalAreaDiscountHeader);
    }

    public String shouldSeeTotalAreaDiscount() {
        return elementHelper.getText(TotalAreaDiscount);
    }

    public String shouldSeeTotalAreaDeliveryHeader() {
        return elementHelper.getText(TotalAreaDeliveryHeader);
    }

    public String shouldSeeTotalAreaDelivery() {
        return elementHelper.getText(TotalAreaDelivery);
    }

    public String shouldSeeTotalAreaTaxHeader() {
        return elementHelper.getText(TotalAreaTaxHeader);
    }

    public String shouldSeeTotalAreaTax() {
        return elementHelper.getText(TotalAreaTax);
    }

    public String shouldSeeTotalAreaEstimatedTotalHeader() {
        return elementHelper.getText(TotalAreaEstimatedTotalHeader);
    }

    public String shouldSeeTotalAreaEstimatedTotal() {
        return elementHelper.getText(TotalAreaEstimatedTotal);
    }

    public String shouldSeeTotalAreaContinueShopping() {
        return elementHelper.getText(TotalAreaContinueShopping);
    }

    public String shouldSeeTotalAreaGoToPayment() {
        return elementHelper.getText(TotalAreaGoToPayment);
    }

    public String shouldSeeShoppingCartAreaTitle() {
        return elementHelper.getText(ShoppingCartAreaTitle);
    }

    public void shouldSeeShoppingCartAreaImage() {
        elementHelper.checkElement(ShoppingCartAreaImage);
    }

    public String shouldSeeShoppingCartAreaDescription() {
        return elementHelper.getText(ShoppingCartAreaDescription);
    }

    public String shouldSeeFirstProductName() {
        return elementHelper.getText(FirstProductName);
    }

    public void clickFirstProductQuantityUpIcon() {
        elementHelper.click(QuantityUpButton);
    }

    public void clickFirstProductQuantityDownButton() {
        elementHelper.click(QuantityDownButton);
    }

    public String shouldSeeFirstProductQuantity() {
        return elementHelper.getText(QuantityText);
    }

    public String shouldSeeSecondProductName() {
        return elementHelper.getText(SecondProductName);
    }

    public void clickGoToPaymentButton() {
        elementHelper.click(GoToPaymentButton);
    }
}
