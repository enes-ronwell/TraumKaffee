package pages;

import io.netty.channel.EventLoopException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class NavigationBar {

    private ElementHelper elementHelper;

    public NavigationBar(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private By BasketNumber = By.cssSelector(".rounded-full.w-6.h-6.text-center.font-semibold.font-sans");
    private By NavBarAreaTraumImage = By.cssSelector("#navbar>div>div:nth-child(1)>div:nth-child(1)");
    private By NavBarAreaShop = By.cssSelector("#navbar>div>div:nth-child(1) ul>div:nth-child(1)");
    private By NavBarAreaAbout = By.cssSelector("#navbar>div>div:nth-child(1) ul>div:nth-child(2) button");
    private By NavBarAreaOptionAbout = By.cssSelector(".hidden.ml-8.gap-8>div:nth-child(2)>div>div:nth-child(2) li:nth-child(1) a");
    private By NavBarAreaAboutOption = By.cssSelector(".hidden.ml-8.gap-8>div:nth-child(2)>div>div:nth-child(2) li a");
    private By NavBarAreaSustainability = By.cssSelector(".hidden.ml-8.gap-8>div:nth-child(2)>div>div:nth-child(2) li:nth-child(2) a");
    private By NavBarAreaContact = By.cssSelector(".hidden.ml-8.gap-8>div:nth-child(2)>div>div:nth-child(2) li:nth-child(3) a");
    private By NavBarAreaLearn = By.cssSelector("#navbar>div>div:nth-child(1) ul>div:nth-child(3)>div>button");
    private By NavBarAreaLearnOption = By.cssSelector(".hidden.ml-8.gap-8>div:nth-child(3)>div>div:nth-child(2) li a");
    private By NavBarAreaBrewGuides = By.cssSelector(".hidden.ml-8.gap-8>div:nth-child(3)>div>div:nth-child(2) li:nth-child(1) a");
    private By NavBarAreaBlog = By.cssSelector(".hidden.ml-8.gap-8>div:nth-child(3)>div>div:nth-child(2) li:nth-child(2) a");
    private By NavBarAreaWhosale = By.cssSelector("#navbar>div>div:nth-child(1) ul>div:nth-child(4)>div>button");
    private By NavBarAreaWhosaleOption = By.cssSelector(".hidden.ml-8.gap-8>div:nth-child(4)>div>div:nth-child(2) li a");
    private By NavBarAreaCoffeeForRestaurant = By.cssSelector(".hidden.ml-8.gap-8>div:nth-child(4)>div>div:nth-child(2) li:nth-child(2) a");
    private By NavBarAreaCoffeeForHotels = By.cssSelector(".hidden.ml-8.gap-8>div:nth-child(4)>div>div:nth-child(2) li:nth-child(3) a");
    private By NavBarAreaCafesAndCoffeeShops = By.cssSelector(".hidden.ml-8.gap-8>div:nth-child(4)>div>div:nth-child(2) li:nth-child(4) a");
    private By NavBarAreaCoffeeAtWork = By.cssSelector(".hidden.ml-8.gap-8>div:nth-child(4)>div>div:nth-child(2) li:nth-child(5) a");
    private By NavBarAreaEquipments = By.cssSelector(".hidden.ml-8.gap-8>div:nth-child(4)>div>div:nth-child(2) li:nth-child(6) a");
    private By NavBarAreaTraining = By.cssSelector(".hidden.ml-8.gap-8>div:nth-child(4)>div>div:nth-child(2) li:nth-child(7) a");
    private By NavBarAreaBecomeOurPartner = By.cssSelector("#navbar>div>div:nth-child(1) ul>div:nth-child(5)");
    private By NavBarAreaSignIn = By.cssSelector(".mr-0>div:nth-child(1) button span");
    private By NavBarAreaShoppingCart = By.cssSelector(".mr-0>div:nth-child(2) svg");
    private By NavBarAreaMyAccount = By.cssSelector(".mr-0>div:nth-child(1) button");
    private By NavBarAreaShoppingCartCount = By.cssSelector(".mr-0>div:nth-child(2)>span span");
    private By NavBarCoffeeAcademyButton = By.cssSelector(".ml-8.gap-8>div:nth-child(6) button");

    public String shouldSeeBasketNumber() {
        return elementHelper.getText(BasketNumber);
    }

    public void clickNavBarAreaTraumImage() {
        elementHelper.click(NavBarAreaTraumImage);
    }

    public void clickNavBarAreaShop() {
        elementHelper.click(NavBarAreaShop);
    }

    public void clickNavBarAreaAbout() {
        elementHelper.click(NavBarAreaAbout);
    }

    public void clickNavBarAreaOptionAbout() {
        elementHelper.click(NavBarAreaOptionAbout);
    }

    public void clickNavBarAreaSustainability() {
        elementHelper.click(NavBarAreaSustainability);
    }

    public void clickNavBarAreaContact() {
        elementHelper.click(NavBarAreaContact);
    }

    public void clickNavBarAreaLearn() {
        elementHelper.click(NavBarAreaLearn);
    }

    public void clickNavBarAreaBrewGuides() {
        elementHelper.click(NavBarAreaBrewGuides);
    }

    public void clickNavBarAreaBlog() {
        elementHelper.click(NavBarAreaBlog);
    }

    public void clickNavBarAreaWhosale() {
        elementHelper.click(NavBarAreaWhosale);
    }

    public void clickNavBarAreaWhosaleOption() {
        elementHelper.click(NavBarAreaWhosaleOption);
    }

    public void clickNavBarAreaCoffeeForRestaurant() {
        elementHelper.click(NavBarAreaCoffeeForRestaurant);
    }

    public void clickNavBarAreaCoffeeForHotels() {
        elementHelper.click(NavBarAreaCoffeeForHotels);
    }

    public void clickNavBarAreaCafesAndCoffeeShops() {
        elementHelper.click(NavBarAreaCafesAndCoffeeShops);
    }

    public void clickNavBarAreaCoffeeAtWork() {
        elementHelper.click(NavBarAreaCoffeeAtWork);
    }

    public void clickNavBarAreaEquipments() {
        elementHelper.click(NavBarAreaEquipments);
    }

    public void clickNavBarAreaTraining() {
        elementHelper.click(NavBarAreaTraining);
    }

    public void clickNavBarAreaBecomeOurPartner() {
        elementHelper.click(NavBarAreaBecomeOurPartner);
    }

    public void clickNavBarAreaSignIn() {
        elementHelper.click(NavBarAreaSignIn);
    }

    public void clickNavBarAreaShoppingCart() {
        elementHelper.click(NavBarAreaShoppingCart);
    }

    public void clickNavBarAreaMyAccount() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        elementHelper.click(NavBarAreaMyAccount);
    }

    public void shouldSeeNavBarAreaTraumImage() {
        elementHelper.checkElement(NavBarAreaTraumImage);
    }

    public String shouldSeeNavBarAreaShop() {
        return elementHelper.getText(NavBarAreaShop);
    }

    public String shouldSeeNavBarAreaAbout() {
        return elementHelper.getText(NavBarAreaAbout);
    }

    public void shouldSeeNavBarAreaAboutOption(String op) {
        elementHelper.checkElementWithText(NavBarAreaAboutOption, op);
    }

    public String shouldSeeNavBarAreaLearn() {
        return elementHelper.getText(NavBarAreaLearn);
    }

    public void shouldSeeNavBarAreaLearnOption(String option) {
        elementHelper.checkElementWithText(NavBarAreaLearnOption, option);
    }

    public String shouldSeeNavBarAreaWhosale() {
        return elementHelper.getText(NavBarAreaWhosale);
    }

    public void shouldSeeNavBarAreaWhosaleOption(String option) {
        elementHelper.checkElementWithText(NavBarAreaWhosaleOption, option);
    }

    public String shouldSeeNavBarAreaBecomeOurPartner() {
        return elementHelper.getText(NavBarAreaBecomeOurPartner);
    }

    public String shouldSeeNavBarAreaSignInButton() {
        return elementHelper.getText(NavBarAreaSignIn);
    }

    public void shouldSeeNavBarAreaShoppingCartIcon() {
        elementHelper.checkElement(NavBarAreaShoppingCart);
    }

    public String shouldSeeNavBarAreaShoppingCartCount() {
        return elementHelper.getText(NavBarAreaShoppingCartCount);
    }

    public void hoverLearn() {
        elementHelper.overElement(NavBarAreaLearn);
    }

    public void hoverWhosale() {
        elementHelper.overElement(NavBarAreaWhosale);
    }

    public void hoverAbout() {
        elementHelper.overElement(NavBarAreaAbout);
    }

    public void clickCoffeeAcademyButton(){
        elementHelper.click(NavBarCoffeeAcademyButton);
    }
}
