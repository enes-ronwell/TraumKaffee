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
    private final By secondStoresOrderNowButton = By.cssSelector(".mt-0 > div:nth-of-type(2) > .uppercase");

    private final By ChangeButton = By.cssSelector(".text-shop-text");
    private final By WholeBeanCoffeesButton = By.cssSelector("[aria-label='1 / 3'] > .space-x-2");
    private final By CapsulesCoffeesButton = By.cssSelector(".swiper-slide-next > .space-x-2");
    private final By DripCoffeesButton = By.cssSelector("[aria-label='3 / 3'] p");
    private final By WholeBeanCoffees = By.cssSelector(".mb-16 > div > div:nth-of-type(1) > .flex > .font-sans");
    private final By WholeBeanCoffeesLogo = By.cssSelector(".w-8[src='https://traum-medusa-production.fra1.cdn.digitaloceanspaces.com/whole-bean-coffees-1700123043251.svg']");
    private final By CapsulesCoffees = By.cssSelector(".mb-16 div:nth-of-type(2) > .flex > .font-sans");
    private final By CapsulesCoffeesLogo = By.cssSelector(".w-8[src='https://traum-medusa-production.fra1.cdn.digitaloceanspaces.com/capsules-coffee-1697618615142.svg']");
    private final By DripCoffees = By.cssSelector(".mb-16 div:nth-of-type(3) > .flex > .font-sans");
    private final By DripCoffeesLogo = By.cssSelector(".w-8[src='https://traum-medusa-production.fra1.cdn.digitaloceanspaces.com/drip-coffees-1697618611118.svg']");
    private final By ChocolateColombiaCoffeeTitle = By.cssSelector(".my-4>div>div>div:nth-child(4) h3");
    private final By ChocolateColombiaCoffeePrice = By.cssSelector(".my-4>div>div>div:nth-child(4) span");
    private final By AlmondColombiaCoffeeTitle = By.cssSelector(".my-4>div>div>div:nth-child(5) h3");
    private final By AlmondColombiaCoffeePrice = By.cssSelector(".my-4>div>div>div:nth-child(5) span");
    private final By TraumBlendCoffeeTitle = By.cssSelector(".my-4>div>div>div:nth-child(6) h3");
    private final By TraumBlendCoffeePrice = By.cssSelector(".my-4>div>div>div:nth-child(6) span");
    private final By TraumKickstartCoffeeTitle = By.cssSelector(".my-4>div>div>div:nth-child(7) h3");
    private final By TraumKickstartCoffeePrice = By.cssSelector(".my-4>div>div>div:nth-child(7) span");
    private final By ElSalvadorApanecaCoffeeTitle = By.cssSelector(".my-4>div>div>div:nth-child(8) h3");
    private final By ElSalvadorApanecaCoffeePrice = By.cssSelector(".my-4>div>div>div:nth-child(8) span");
    private final By HondurasOpalcaCoffeeTitle = By.cssSelector(".my-4>div>div>div:nth-child(9) h3");
    private final By HondurasOpalcaCoffeePrice = By.cssSelector(".my-4>div>div>div:nth-child(9) span");
    private final By TraumKickStartCapsuleCoffeeTitle = By.cssSelector(".mb-16 div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1) > div:nth-of-type(1) h3:nth-of-type(1)");
    private final By TraumKickStartCapsuleCoffeePrice = By.cssSelector(".mb-16 div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1) > div:nth-of-type(1) span:nth-of-type(1)");
    private final By KenyaCapsuleCoffeeTitle = By.cssSelector(".mb-16 div:nth-of-type(2) > div:nth-of-type(2) div:nth-of-type(3) h3:nth-of-type(1)");
    private final By KenyaCapsuleCoffeePrice = By.cssSelector(".mb-16 div:nth-of-type(2) > div:nth-of-type(2) div:nth-of-type(3) span:nth-of-type(1)");
    private final By GituroKenyaCapsuleCoffeeTitle = By.cssSelector(".mb-16 div:nth-of-type(11) h3:nth-of-type(1)");
    private final By GituroKenyaCapsuleCoffeePrice = By.cssSelector(".mb-16 div:nth-of-type(11) span:nth-of-type(1) p:nth-of-type(1)");
    private final By ChocolateColombiaCapsuleCoffeeTitle = By.cssSelector(".mb-16 div:nth-of-type(12) h3:nth-of-type(1)");
    private final By ChocolateColombiaCapsuleCoffeePrice = By.cssSelector(".mb-16 div:nth-of-type(12) span:nth-of-type(1) p:nth-of-type(1)");
    private final By TraumBlendCapsuleCoffeeTitle = By.cssSelector(".mb-16 div:nth-of-type(13) h3:nth-of-type(1)");
    private final By TraumBlendCapsuleCoffeePrice = By.cssSelector(".mb-16 div:nth-of-type(13) span:nth-of-type(1) p:nth-of-type(1)");
    private final By BurundiDripCoffeeTitle = By.cssSelector(".my-4>div>div>div:nth-child(10) h3");
    private final By BurundiDripCoffeePrice = By.cssSelector(".my-4>div>div>div:nth-child(10) span");
    private final By ElSalvadorApanecaDripCoffeeTitle = By.cssSelector(".my-4>div>div>div:nth-child(11) h3");
    private final By ElSalvadorApanecaDripCoffeePrice = By.cssSelector(".my-4>div>div>div:nth-child(11) span");
    private final By ChocolateColombiaCoffeeImage = By.cssSelector("[src='https://traum-medusa-production.fra1.cdn.digitaloceanspaces.com/colombia-ground-coffee-1691133113221.jpg']");
    private final By AlmondColombiaCoffeeImage = By.cssSelector("[src='https://traum-medusa-production.fra1.cdn.digitaloceanspaces.com/almond-colombia-ground-coffee-1691133091433.jpg']");
    private final By TraumBlendCoffeeImage = By.cssSelector("[src='https://traum-medusa-production.fra1.cdn.digitaloceanspaces.com/traum-blend-ground-coffee-1691133075998.jpg']");
    private final By TraumKickstartCoffeeImage = By.cssSelector("[src='https://traum-medusa-production.fra1.cdn.digitaloceanspaces.com/traum-kickstart-ground-coffee-1691133056736.jpg']");
    private final By ElSalvadorApanecaCoffeeImage = By.cssSelector("[src='https://traum-medusa-production.fra1.cdn.digitaloceanspaces.com/el-salvador-apaneca-ground-coffee-1691133036910.jpg']");
    private final By HondurasOpalcaCoffeeImage = By.cssSelector("[src='https://traum-medusa-production.fra1.cdn.digitaloceanspaces.com/honduras-opalca-ground-coffee-1691133015386.jpg']");
    private final By TraumKickstartCapsuleCoffeeImage = By.cssSelector("[src='https://traum-medusa-production.fra1.cdn.digitaloceanspaces.com/traum-kickstart-capsule-1689757440377.jpg']");
    private final By KenyaCapsuleCoffeeImage = By.cssSelector("[src='https://traum-medusa-production.fra1.cdn.digitaloceanspaces.com/kenya-capsule-1689757084704.jpg']");
    private final By GituroKenyaCapsuleCoffeeImage = By.cssSelector("[src='https://traum-medusa-production.fra1.cdn.digitaloceanspaces.com/gituro-caps-new-1686579799553.jpg']");
    private final By ChocolateColombiaCapsuleCoffeeImage = By.cssSelector("[src='https://traum-medusa-production.fra1.cdn.digitaloceanspaces.com/choco-colomb-caps-new-1686579626484.jpg']");
    private final By TraumBlendCapsuleCoffeeImage = By.cssSelector("[src='https://traum-medusa-production.fra1.cdn.digitaloceanspaces.com/traum-blend-caps-new-1686579371610.jpg']");
    private final By BurundiDripCoffeeImage = By.cssSelector("[src='https://traum-medusa-production.fra1.cdn.digitaloceanspaces.com/5DRIP-1686580994271.jpg']");
    private final By ElSalvadorApanecaDripCoffeeImage = By.cssSelector("[src='https://traum-medusa-production.fra1.cdn.digitaloceanspaces.com/el-salvador-drip-new-1686580727903.jpg']");
    private final By WholeBeanCoffeesArea = By.cssSelector(".mb-16 > div > div:nth-child(1) > .flex");
    private final By CapsulesCoffeesArea = By.cssSelector(".mb-16 > div > div:nth-child(2) > .flex");
    private final By DripCoffeesArea = By.cssSelector(".mb-16 > div > div:nth-child(3) > .flex");
    private final By Basket = By.cssSelector(".max-w-5xl>div>p");
    private final By NoItems = By.cssSelector(".h-64>div");
    private final By CompleteYourOrder = By.cssSelector(".h-28.mx-0>div>div>div:nth-child(2)");
    private final By AED = By.cssSelector(".h-28.mx-0>div>div>div:nth-child(3)");


    public void userOnTheShopTwoPageTwo() {
        elementHelper.openUrl(url);
        elementHelper.click(secondStoresOrderNowButton);
    }

    public void userShouldSeeChangeButton() {
        elementHelper.checkElement(ChangeButton);
    }

    public String userShouldSeeWholeBeanCoffeesButtonTitle() {
        return elementHelper.getText(WholeBeanCoffeesButton);
    }

    public String userShouldSeeCapsulesCoffeesButtonTitle() {
        return elementHelper.getText(CapsulesCoffeesButton);
    }

    public String userShouldSeeDripCoffeesButtonTitle() {
        return elementHelper.getText(DripCoffeesButton);
    }

    public String userShouldSeeWholeBeanCoffeesTitle() {
        return elementHelper.getText(WholeBeanCoffees);
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

    public String userShouldSeeChocolateColombiaCoffeeTitle() {
        return elementHelper.getText(ChocolateColombiaCoffeeTitle);
    }

    public String userShouldSeeChocolateColombiaCoffeePrice() {
        return elementHelper.getText(ChocolateColombiaCoffeePrice);
    }

    public String userShouldSeeAlmondColombiaCoffeeTitle() {
        return elementHelper.getText(AlmondColombiaCoffeeTitle);
    }

    public String userShouldSeeAlmondColombiaCoffeePrice() {
        return elementHelper.getText(AlmondColombiaCoffeePrice);
    }

    public String userShouldSeeTraumBlendCoffeeTitle() {
        return elementHelper.getText(TraumBlendCoffeeTitle);
    }

    public String userShouldSeeTraumBlendCoffeePrice() {
        return elementHelper.getText(TraumBlendCoffeePrice);
    }

    public String userShouldSeeTraumKickstartCoffeeTitle() {
        return elementHelper.getText(TraumKickstartCoffeeTitle);
    }

    public String userShouldSeeTraumKickstartCoffeePrice() {
        return elementHelper.getText(TraumKickstartCoffeePrice);
    }

    public String userShouldSeeElSalvadorApanecaCoffeeTitle() {
        return elementHelper.getText(ElSalvadorApanecaCoffeeTitle);
    }

    public String userShouldSeeElSalvadorApanecaCoffeePrice() {
        return elementHelper.getText(ElSalvadorApanecaCoffeePrice);
    }

    public String userShouldSeeHondurasOpalcaCoffeeTitle() {
        return elementHelper.getText(HondurasOpalcaCoffeeTitle);
    }

    public String userShouldSeeHondurasOpalcaCoffeePrice() {
        return elementHelper.getText(HondurasOpalcaCoffeePrice);
    }

    public String userShouldSeeTraumKickStartCapsuleCoffeeTitle() {
        return elementHelper.getText(TraumKickStartCapsuleCoffeeTitle);
    }

    public String userShouldSeeTraumKickStartCapsuleCoffeePrice() {
        return elementHelper.getText(TraumKickStartCapsuleCoffeePrice);
    }

    public String userShouldSeeKenyaCapsuleCoffeeTitle() {
        return elementHelper.getText(KenyaCapsuleCoffeeTitle);
    }

    public String userShouldSeeKenyaCapsuleCoffeePrice() {
        return elementHelper.getText(KenyaCapsuleCoffeePrice);
    }

    public String userShouldSeeGituroKenyaCapsuleCoffeeTitle() {
        return elementHelper.getText(GituroKenyaCapsuleCoffeeTitle);
    }

    public String userShouldSeeGituroKenyaCapsuleCoffeePrice() {
        return elementHelper.getText(GituroKenyaCapsuleCoffeePrice);
    }

    public String userShouldSeeChocolateColombiaCapsuleCoffeeTitle() {
        return elementHelper.getText(ChocolateColombiaCapsuleCoffeeTitle);
    }

    public String userShouldSeeChocolateColombiaCapsuleCoffeePrice() {
        return elementHelper.getText(ChocolateColombiaCapsuleCoffeePrice);
    }

    public String userShouldSeeTraumBlendCapsuleCoffeeTitle() {
        return elementHelper.getText(TraumBlendCapsuleCoffeeTitle);
    }

    public String userShouldSeeTraumBlendCapsuleCoffeePrice() {
        return elementHelper.getText(TraumBlendCapsuleCoffeePrice);
    }

    public String userShouldSeeBurundiDripCoffeeTitle() {
        return elementHelper.getText(BurundiDripCoffeeTitle);
    }

    public String userShouldSeeBurundiDripCoffeePrice() {
        return elementHelper.getText(BurundiDripCoffeePrice);
    }

    public String userShouldSeeElSalvadorApanecaDripCoffeeTitle() {
        return elementHelper.getText(ElSalvadorApanecaDripCoffeeTitle);
    }

    public String userShouldSeeElSalvadorApanecaDripCoffeePrice() {
        return elementHelper.getText(ElSalvadorApanecaDripCoffeePrice);
    }

    public void userShouldSeeChocolateColombiaCoffeeImage() {
        elementHelper.checkElement(ChocolateColombiaCoffeeImage);
    }

    public void userShouldSeeAlmondColombiaCoffeeImage() {
        elementHelper.checkElement(AlmondColombiaCoffeeImage);
    }

    public void userShouldSeeTraumBlendCoffeeImage() {
        elementHelper.checkElement(TraumBlendCoffeeImage);
    }

    public void userShouldSeeTraumKickstartCoffeeImage() {
        elementHelper.checkElement(TraumKickstartCoffeeImage);
    }

    public void userShouldSeeElSalvadorApanecaCoffeeImage() {
        elementHelper.checkElement(ElSalvadorApanecaCoffeeImage);
    }

    public void userShouldSeeHondurasOpalcaCoffeeImage() {
        elementHelper.checkElement(HondurasOpalcaCoffeeImage);
    }

    public void userShouldSeeTraumKickstartCapsuleCoffeeImage() {
        elementHelper.checkElement(TraumKickstartCapsuleCoffeeImage);
    }

    public void userShouldSeeKenyaCapsuleCoffeeImage() {
        elementHelper.checkElement(KenyaCapsuleCoffeeImage);
    }

    public void userShouldSeeGituroKenyaCapsuleCoffeeImage() {
        elementHelper.checkElement(GituroKenyaCapsuleCoffeeImage);
    }

    public void userShouldSeeChocolateColombiaCapsuleCoffeeImage() {
        elementHelper.checkElement(ChocolateColombiaCapsuleCoffeeImage);
    }

    public void userShouldSeeTraumBlendCapsuleCoffeeImage() {
        elementHelper.checkElement(TraumBlendCapsuleCoffeeImage);
    }

    public void userShouldSeeBurundiDripCoffeeImage() {
        elementHelper.checkElement(BurundiDripCoffeeImage);
    }

    public void userShouldSeeElSalvadorApanecaDripCoffeeImage() {
        elementHelper.checkElement(ElSalvadorApanecaDripCoffeeImage);
    }

    public void userClickWholeBeanCoffees() {
        elementHelper.click(WholeBeanCoffees);
    }

    public void userShouldSeeWholeBeanCoffeesArea() {
        elementHelper.checkElement(WholeBeanCoffeesArea);
    }

    public void userClickCapsulesCoffeesButton() {
        elementHelper.click(CapsulesCoffeesButton);
    }

    public void userShouldSeeCapsulesCoffeesArea() {
        elementHelper.checkElement(CapsulesCoffeesArea);
    }

    public void userClickDripCoffeesButton() {
        elementHelper.click(DripCoffeesButton);
    }

    public void userShouldSeeDripCoffeesArea() {
        elementHelper.checkElement(DripCoffeesArea);
    }

    public String userShouldSeeBasket() {
        return elementHelper.getText(Basket);
    }

    public void userShouldSeeNoItems() {
         elementHelper.checkElement(NoItems);
    }

    public String userShouldSeeCompleteYourOrder() {
        return elementHelper.getText(CompleteYourOrder);
    }

    public String userShouldSeeAED() {
        return elementHelper.getText(AED);
    }
}
