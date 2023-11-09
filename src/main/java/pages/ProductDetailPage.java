package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ProductDetailPage {

    private ElementHelper elementHelper;

    public ProductDetailPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private String url = "https://dev.traumkaffee.com/products/traum-kickstart-capsule";
    private By ContinueShoppingButton=By.cssSelector(".pb-8>div:nth-child(2)>button");
    private By AddToCartButton=By.cssSelector(".pb-8>div:nth-child(2) span");
    private By QuantityUpIcon=By.cssSelector(".cursor-pointer.text-xl.px-3.py-1");
    private By Name=By.cssSelector("#product-details .font-extrabold");
    private By ProductPath=By.cssSelector(".mb-8 .px-4>div:nth-child(1)");
    private By ProductName=By.cssSelector("#product-details .font-extrabold");
    private By ProductDescription=By.cssSelector(".mb-8 .px-4>div:nth-child(2) p");
    private By ProductImage=By.cssSelector("#product-details>div>div>img");
    private By ProductImageOption=By.cssSelector("#product-details>div>div>div img");
    private By ProductCoffeeType=By.cssSelector(".my-2>div:nth-child(1)>div:nth-child(1)");
    private By ProductCoffeeTypeOption=By.cssSelector(".my-2>div:nth-child(1)>div:nth-child(2)");
    private By ProductPiece=By.cssSelector(".my-2>div:nth-child(2)>div:nth-child(1)");
    private By ProductPieceOption=By.cssSelector(".my-2>div:nth-child(2)>div:nth-child(2)");
    private By ProductQuantityHeader=By.cssSelector(".px-4>div:nth-child(3)>div:nth-child(2) h3");
    private By ProductQuantity=By.cssSelector(".px-4>div:nth-child(3)>div:nth-child(2)>div>div>div:nth-child(2)");
    private By ProductQuantityDownIcon=By.cssSelector(".px-4>div:nth-child(3)>div:nth-child(2)>div>div>div:nth-child(1)");
    private By ProductQuantityUpIcon=By.cssSelector(".px-4>div:nth-child(3)>div:nth-child(2)>div>div>div:nth-child(3)");
    private By ProductPrice=By.cssSelector(".mb-10>p");
    private By ProductAddToCartButton=By.cssSelector(".py-4.pb-8>div:nth-child(2)>span>button");
    private By ProductContinueShoppingButton=By.cssSelector(".py-4.pb-8>div:nth-child(2)>button");
    private By ProductFreeShipping=By.cssSelector(".space-x-8>span:nth-child(1)");
    private By ProductCancelAnytime= By.cssSelector(".space-x-8>span:nth-child(2)");
    private By PleaseSelectQuantityMessage = By.cssSelector(".flex.flex-row.gap-2>div:nth-child(2)");


    public void userOnTheProductDetailPage(){
        elementHelper.openUrl(url);
    }
    public void clickContinueShoppingButton(){
        elementHelper.click(ContinueShoppingButton);
    }
    public void clickAddToCartButton(){
        elementHelper.click(AddToCartButton);
    }
    public void clickQuantityUpIcon(){
        elementHelper.click(QuantityUpIcon);
    }
    public void shouldSeeTheProductDetailPage(String url){
       elementHelper.checkUrl(url);
    }
    public String shouldSeeName(){
        return elementHelper.getText(Name);
    }
    public String shouldSeeProductPath(){
        return elementHelper.getText(ProductPath);
    }
    public String shouldSeeProductName(){
        return elementHelper.getText(ProductName);
    }
    public String shouldSeeProductDescription(){
        return elementHelper.getText(ProductDescription);
    }
    public void shouldSeeProductImage(){
        elementHelper.checkElement(ProductImage);
    }
    public void shouldSeeProductImageOption(){
        elementHelper.checkElement(ProductImageOption);
    }
    public String  shouldSeeProductCoffeeType(){
         return elementHelper.getText(ProductCoffeeType);
    }
    public String shouldSeeProductCoffeeTypeOption(){
        return elementHelper.getText(ProductCoffeeTypeOption);
    }
    public String shouldSeeProductPiece(){
        return elementHelper.getText(ProductPiece);
    }
    public String shouldSeeProductPieceOption(){
        return elementHelper.getText(ProductPieceOption);
    }
    public String shouldSeeProductQuantityHeader(){
        return elementHelper.getText(ProductQuantityHeader);
    }
    public String shouldSeeProductQuantity(){
        return elementHelper.getText(ProductQuantity);
    }
    public void shouldSeeProductQuantityDownIcon(){
        elementHelper.checkElement(ProductQuantityDownIcon);
    }
    public void shouldSeeProductQuantityUpIcon(){
        elementHelper.checkElement(ProductQuantityUpIcon);
    }
    public String shouldSeeProductPrice(){
        return elementHelper.getText(ProductPrice);
    }
    public String shouldSeeProductAddToCartButton(){
        return elementHelper.getText(ProductAddToCartButton);
    }
    public String shouldSeeProductContinueShoppingButton(){
        return elementHelper.getText(ProductContinueShoppingButton);
    }
    public String shouldSeeProductFreeShipping(){
        return elementHelper.getText(ProductFreeShipping);
    }
    public String shouldSeeProductCancelAnytime(){
        return elementHelper.getText(ProductCancelAnytime);
    }
    public String shouldSeePleaseSelectQuantityMessage(){
        return elementHelper.getText(PleaseSelectQuantityMessage);
    }










}
