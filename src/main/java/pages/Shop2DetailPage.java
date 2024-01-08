package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class Shop2DetailPage {
    private ElementHelper elementHelper;

    public Shop2DetailPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private By FirstItem = By.cssSelector(".mb-16 .my-4 > div > .flex > div:nth-of-type(1) > .flex");
    private By HondurasOpalcaCoffeeTitle = By.cssSelector(".mb-16 > div:nth-child(1) > div:nth-child(1) h3:nth-child(1)");
    private By Gr = By.cssSelector(".my-2.font-bold .flex > .text-white");
    private By CoffeeTypeTitle = By.cssSelector(".pb-10 > div:nth-child(1)");
    private By AddToBasket = By.cssSelector(".pb-0>div>div:nth-child(2)>div:nth-child(1)");
    private By SecondItem = By.cssSelector(".mb-16 .my-4 div:nth-of-type(3) > .flex");
    private By ChocolateColombiaCapsuleCoffeeTitle = By.cssSelector(".mb-16 div:nth-child(2) div:nth-child(3) h3:nth-child(1)");
    private By ChocolateColombiaCoffee = By.cssSelector(".mb-16 .my-4 div:nth-of-type(3) > .flex");
    private By ChocolateColombiaCoffeePageTwo = By.cssSelector(".my-4>div>div>div:nth-child(4) h3");
    private By ChocolateColombiaCoffeeTitle = By.cssSelector(".my-4>div>div>div:nth-child(4) h3");
    private By BurundiDripCoffee = By.cssSelector(".my-4>div>div>div:nth-child(10) h3");
    private By BurundiDripCoffeeTitle = By.cssSelector(".my-4>div>div>div:nth-child(10) h3");
    private By HondurasOpalcaCoffeeTitleInBasket = By.cssSelector(".font-extrabold");
    private By ChocolateColombiaCapsuleCoffeeTitleInBasket = By.cssSelector(".font-extrabold");
    private By userClickOnTheChocolateColombiaCoffeePageTwo = By.cssSelector(".mb-16 .my-4 div:nth-of-type(3) > .flex");
    private By SeeGrOnPageTwo = By.cssSelector(".my-2.flex>div:nth-child(1)>div:nth-child(2)>div:nth-child(1)");
    private By CoffeeTypeTitlePageTwo = By.cssSelector(".pb-10 > div:nth-child(1)");
    private By AddToBasketPageTwo = By.cssSelector(".pb-0>div>div:nth-child(2)>div:nth-child(1)");
    private By AddToBasketButtonPageTwo = By.cssSelector(".justify-between.h-full");
    private By ColombiaCoffeeTitleInBasketPageTwo = By.cssSelector(".max-w-48>div:nth-child(1)");
    private By BurundiDripCoffeeTitleInBasketPageTwo= By.cssSelector(".max-w-48>div:nth-child(1)");
    private By AddButtonInDetailPage = By.cssSelector(".justify-center.w-14 > svg:nth-of-type(2)");

    public void userClickOnTheFirstItem() {
        elementHelper.click(FirstItem);
    }

    public String userShouldSeeSectionHondurasOpalcaCoffeeTitle() {
        return elementHelper.getText(HondurasOpalcaCoffeeTitle);
    }

    public String userShouldSeeGr() {
        return elementHelper.getText(Gr);
    }

    public String userShouldSeeCoffeeTypeTitle() {
        return elementHelper.getText(CoffeeTypeTitle);
    }

    public String userShouldSeeAddToBasket() {
        return elementHelper.getText(AddToBasket);
    }

    public void userClickOnTheSecondItem() {
        elementHelper.click(SecondItem);
    }

    public String userShouldSeeSectionChocolateColombiaCapsuleCoffeeTitle() {
        return elementHelper.getText(ChocolateColombiaCapsuleCoffeeTitle);
    }

    public void userClickOnTheChocolateColombiaCoffee() {
        elementHelper.click(ChocolateColombiaCoffee);
    }

    public String userShouldSeeSectionChocolateColombiaCoffeeTitle() {
        return elementHelper.getText(ChocolateColombiaCoffeeTitle);
    }

    public void userClickOnTheBurundiDripCoffee() {
        elementHelper.click(BurundiDripCoffee);
    }

    public String userShouldSeeSectionBurundiDripCoffeeTitle() {
        return elementHelper.getText(BurundiDripCoffeeTitle);
    }

    public void userShouldClickAddToBasketButton() {
        elementHelper.click(AddToBasket);
    }

    public String userShouldSeeHondurasOpalcaCoffeeTitleInBasket() {
        return elementHelper.getText(HondurasOpalcaCoffeeTitleInBasket);
    }

    public String userShouldSeeChocolateColombiaCapsuleCoffeeTitleInBasket() {
        return elementHelper.getText(ChocolateColombiaCapsuleCoffeeTitleInBasket);
    }

    public void userClickOnTheChocolateColombiaCoffeePageTwo() {
        elementHelper.click(ChocolateColombiaCoffeePageTwo);
    }

    public String userShouldSeeGrOnPageTwo() {
        return elementHelper.getText(SeeGrOnPageTwo);
    }

    public String userShouldSeeCoffeeTypeTitlePageTwo() {
        return elementHelper.getText(CoffeeTypeTitlePageTwo);
    }
    public String userShouldSeeAddToBasketPageTwo(){
        return elementHelper.getText(AddToBasketPageTwo);
    }
    public void userShouldClickAddToBasketButtonPageTwo(){
        elementHelper.click(AddToBasketButtonPageTwo);
    }
    public String userShouldSeeChocolateColombiaCoffeeTitleInBasketPageTwo(){
        return elementHelper.getText(ColombiaCoffeeTitleInBasketPageTwo);
    }
    public String userShouldSeeBurundiDripCoffeeTitleInBasketPageTwo(){
        return elementHelper.getText(BurundiDripCoffeeTitleInBasketPageTwo);
    }
    public void userShouldPressAddButtonInDetailPage(){
        elementHelper.click(AddButtonInDetailPage);
    }
}
