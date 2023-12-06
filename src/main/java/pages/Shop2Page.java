package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;


public class Shop2Page {


    private ElementHelper elementHelper;

    public Shop2Page(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }


    private By ChangeButton = By.cssSelector(".text-shop-text");
    private By WholeBeanCoffeesButton = By.cssSelector(".bg-shop-text");
    private By CapsulesCoffees = By.cssSelector(".swiper-slide-next > .space-x-2");
    private By DripCoffees = By.cssSelector("[aria-label='3 / 3'] > .space-x-2");
    private By WholeBean = By.cssSelector(".mb-16 > div > div:nth-of-type(1) > .flex > .font-sans");
    private By WholeBeanCoffeesLogo = By.cssSelector(".w-8[src='https://traum-medusa-production.fra1.cdn.digitaloceanspaces.com/whole-bean-coffees-1700123043251.svg']");
    private By CapsulesCoffeesLogo = By.cssSelector(".w-8[src='https://traum-medusa-production.fra1.cdn.digitaloceanspaces.com/capsules-coffee-1697618615142.svg']");
    private By DripCoffeesLogo = By.cssSelector(".w-8[src='https://traum-medusa-production.fra1.cdn.digitaloceanspaces.com/drip-coffees-1697618611118.svg']");
    private By HondurasOpalcaCoffeeTitle = By.cssSelector(".mb-16 > div:nth-of-type(1) > div:nth-of-type(1) h3:nth-of-type(1)");
    private By HondurasOpalcaCoffeePrice = By.cssSelector(".mb-16 > div:nth-of-type(1) > div:nth-of-type(1) span:nth-of-type(1) p:nth-of-type(1)");
    private By HondurasOpalcaCoffeeImage = By.cssSelector("[src='https://traum-medusa-production.fra1.cdn.digitaloceanspaces.com/honduras-opalca-ground-coffee-1691133015386.jpg']");
    private By ChocolateColombiaCapsuleCoffeeTitle = By.cssSelector(".mb-16 div:nth-of-type(2) div:nth-of-type(3) h3:nth-of-type(1)");
    private By ColombiaCapsuleCoffeeCoffeePrice = By.cssSelector(".mb-16 div:nth-of-type(2) div:nth-of-type(3) span:nth-of-type(1) p:nth-of-type(1)");
    private By ColombiaCapsuleCoffeeImage = By.cssSelector("[src='https://traum-medusa-production.fra1.cdn.digitaloceanspaces.com/choco-colomb-caps-new-1686579626484.jpg']");
    private By TraumBlendCapsuleCoffeeTitle = By.cssSelector(".mb-16 div:nth-of-type(4) h3:nth-of-type(1)");
    private By TraumBlendCapsuleCoffeePrice = By.cssSelector(".mb-16 div:nth-of-type(4) span:nth-of-type(1) p:nth-of-type(1)");
    private By TraumBlendCapsuleCoffeeImage=By.cssSelector("[src='https://traum-medusa-production.fra1.cdn.digitaloceanspaces.com/traum-blend-caps-new-1686579371610.jpg']");
    private By BurundiDripCoffeeTitle=By.cssSelector(".mb-16 > div:nth-of-type(1) > div:nth-of-type(3) h3:nth-of-type(1)");
    private By BurundiDripCoffeePrice=By.cssSelector(".mb-16 > div:nth-of-type(1) > div:nth-of-type(3) span:nth-of-type(1) p:nth-of-type(1)");
    private By BurundiDripCoffeeImage=By.cssSelector("[src='https://traum-medusa-production.fra1.cdn.digitaloceanspaces.com/5DRIP-1686580994271.jpg']");
    private By BasketTitle=By.cssSelector(".uppercase.text-white");
    private By CompleteYourOrderTitle=By.cssSelector(".w-full.flex-row > div:nth-of-type(2)");
    private By ClickWholeBeanCoffees=By.cssSelector(".bg-shop-text");
    private By WholeBeanCoffeesArea=By.cssSelector(".mb-16 > div > div:nth-of-type(1) > .flex > .font-sans");
    private By CapsulesCoffeesButton=By.cssSelector(".swiper-slide-next > .space-x-2");
    private By CapsulesCoffeesArea=By.cssSelector(".mb-16 div:nth-of-type(2) > .flex > .font-sans");
    private By DripCoffeesArea=By.cssSelector(".mb-16 div:nth-of-type(3) > .flex > .font-sans");
    private By NoItems=By.cssSelector("[width='100']");
    private By CompleteYourOrder=By.cssSelector(".w-full.flex-row > div:nth-of-type(2)");
    private By AED=By.cssSelector(".w-full.flex-row > div:nth-of-type(3)");
    private final By firstStoreOrderNowButton = By.cssSelector(".mt-0.mb-4>div:nth-child(1) button");


    private String url = "https://dev.traumkaffee.com/product";


    public void userOnTheShopTwoPage() {
        elementHelper.openUrl(url);
        elementHelper.click(firstStoreOrderNowButton);
    }

    public void userShouldSeeChangeButton() {
        elementHelper.checkElement(ChangeButton);
    }

    public String userShouldSeeWholeBeanCoffeesButtonTitle() {
        return elementHelper.getText(WholeBeanCoffeesButton);
    }

    public String userShouldSeeCapsulesCoffeesButtonTitle() {
        return elementHelper.getText(CapsulesCoffees);
    }

    public String userShouldSeeDripCoffeesButtonTitle() {
        return elementHelper.getText(DripCoffees);
    }

    public String userShouldSeeWholeBeanCoffeesTitle() {
        return elementHelper.getText(WholeBean);
    }

    public void userShouldSeeWholeBeanCoffeesLogo() {
        elementHelper.checkElement(WholeBeanCoffeesLogo);
    }

    public String userShouldSeeCapsulesCoffeesTitle() {
        return elementHelper.getText(CapsulesCoffees);
    }

    public void userShouldSeeCapsulesCoffeesLogo() {
        elementHelper.checkElement(CapsulesCoffeesLogo);
    }

    public String userShouldSeeDripCoffeesTitle() {
        return elementHelper.getText(DripCoffees);
    }

    public void userShouldSeeDripCoffeesLogo() {
        elementHelper.checkElement(DripCoffeesLogo);
    }

    public String userShouldSeeHondurasOpalcaCoffeeTitle() {
        return elementHelper.getText(HondurasOpalcaCoffeeTitle);
    }

    public String userShouldSeeHondurasOpalcaCoffeePrice() {
        return elementHelper.getText(HondurasOpalcaCoffeePrice);
    }

    public void userShouldSeeHondurasOpalcaCoffeeImage() {
        elementHelper.checkElement(HondurasOpalcaCoffeeImage);
    }

    public String userShouldSeeChocolateColombiaCapsuleCoffeeTitle() {
        return elementHelper.getText(ChocolateColombiaCapsuleCoffeeTitle);
    }

    public String userShouldSeeColombiaCapsuleCoffeeCoffeePrice() {
        return elementHelper.getText(ColombiaCapsuleCoffeeCoffeePrice);
    }

    public void userShouldSeeColombiaCapsuleCoffeeImage() {
        elementHelper.checkElement(ColombiaCapsuleCoffeeImage);
    }

    public String userShouldSeeTraumBlendCapsuleCoffeeTitle() {
        return elementHelper.getText(TraumBlendCapsuleCoffeeTitle);
    }

    public String userShouldSeeTraumBlendCapsuleCoffeePrice() {
        return elementHelper.getText(TraumBlendCapsuleCoffeePrice);
    }

    public void userShouldSeeTraumBlendCapsuleCoffeeImage(){
        elementHelper.checkElement(TraumBlendCapsuleCoffeeImage);
    }
    public String userShouldSeeBurundiDripCoffeeTitle(){
        return elementHelper.getText(BurundiDripCoffeeTitle);
    }
    public String userShouldSeeBurundiDripCoffeePrice(){
        return elementHelper.getText(BurundiDripCoffeePrice);
    }
    public void userShouldSeeBurundiDripCoffeeImage(){
        elementHelper.checkElement(BurundiDripCoffeeImage);
    }
    public String userShouldSeeBasket(){
        return elementHelper.getText(BasketTitle);
    }
    public String userShouldSeeCompleteYourOrderTitle(){
        return elementHelper.getText(CompleteYourOrderTitle);
    }
    public void userClickWholeBeanCoffees(){
        elementHelper.click(ClickWholeBeanCoffees);
    }
    public void userShouldSeeWholeBeanCoffeesArea(){
        elementHelper.checkElement(WholeBeanCoffeesArea);
    }
    public void userClickCapsulesCoffeesButton(){
        elementHelper.click(CapsulesCoffeesButton);
    }
    public void userShouldSeeCapsulesCoffeesArea(){
        elementHelper.checkElement(CapsulesCoffeesArea);
    }
    public void userClickDripCoffeesButton(){
        elementHelper.click(DripCoffees);
    }
    public void userShouldSeeDripCoffeesArea(){
        elementHelper.checkElement(DripCoffeesArea);
    }
    public void userShouldSeeNoItems(){
         elementHelper.checkElement(NoItems);
    }
    public String userShouldSeeCompleteYourOrder(){
        return elementHelper.getText(CompleteYourOrder);
    }
    public String userShouldSeeAED(){
        return elementHelper.getText(AED);
    }
}
