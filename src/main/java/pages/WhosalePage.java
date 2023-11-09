package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

import java.security.Key;
import java.security.PublicKey;

public class WhosalePage {
    private ElementHelper elementHelper;

    private By LetsGrabACoffeeAreaFullName = By.cssSelector(".space-y-6>input:nth-child(1)");
    private By LetsGrabACoffeeAreaTypeOfBusiness = By.cssSelector(".space-y-6>select");
    private By LetsGrabACoffeeAreaTypeOfBusinessOptions = By.cssSelector(".space-y-6>select>option");

    private By LetsGrabACoffeeAreaMail = By.cssSelector(".space-y-6>input:nth-child(2)");
    private By LetsGrabACoffeeAreaContactNumber = By.cssSelector(".space-y-6>div>input");
    private By LetsGrabACoffeeAreaBusinessName = By.cssSelector("input:nth-child(4)");
    private By LetsGrabACoffeeAreaTellUs = By.cssSelector(".flex.flex-col.h-full>textarea");
    private By LetsGrabACoffeeAreaSendButton = By.cssSelector(".flex.flex-col.h-full>button");
    private By DiscoverAreaCafesAndCoffeeShopsDiscoverButton = By.cssSelector("#wholesale-discover>div>div:nth-child(1)>div");
    private By DiscoverAreaHotelsDiscoverButton = By.cssSelector(".gap-2>div:nth-of-type(2)>.absolute");
    private By DiscoverAreaRestaurantsDiscoverButton = By.cssSelector(".gap-2>div:nth-of-type(3)>.absolute");
    private By DiscoverAreaOfficesDiscoverButton = By.cssSelector(".gap-2>div:nth-of-type(4)>.absolute");
    private By DiscoverAreaTrainingDiscoverButton = By.cssSelector(".gap-2>div:nth-of-type(5)>.absolute");
    private By DiscoverAreaEquipmentDiscoverButton = By.cssSelector(".gap-2>div:nth-of-type(6)>.absolute");
    private By PartnershipPerksAreaEquipmentButton = By.cssSelector(".py-12 [alt='arrow-right']");
    private By PartnershipPerksAreaTrainingButton = By.cssSelector(".px-6.relative [alt='arrow-right']");
    private By WhosaleAreaTitle = By.cssSelector(".text-2xl");
    private By WhosaleAreaDescription = By.cssSelector(".max-w-xl");
    private By WhosaleAreaImage = By.cssSelector(".bg-wholesale-mobile-bg");
    private By LetsGrabACoffeeAreaTitle = By.cssSelector("#wholesale-contact .font-butler");
    private By LetsGrabACoffeeAreaDescription = By.cssSelector(".mb-6");
    private By LetsGrabACoffeeAreaTypeOfBusinessOption = By.cssSelector("select>option");
    private By LetsGrabACoffeeAreaFalseEmailMessage = By.cssSelector(".space-y-6>h2");
    private By DescriptionAreaTitle = By.cssSelector(".mt-4.mb-12>p:nth-child(1)");
    private By DescriptionAreaDescription = By.cssSelector(".mt-4.mb-12>p:nth-child(2)");
    private By DescriptionAreaDescription2 = By.cssSelector(".mt-4.mb-12>p:nth-child(3)");
    private By DescriptionAreaDescription3 = By.cssSelector(".mt-4.mb-12>p:nth-child(4)");
    private By DiscoverAreaCafesAndCoffeeShopsName = By.cssSelector("#wholesale-discover>div>div:nth-child(1)>h3");
    private By DiscoverAreaCafesAndCoffeeShopsImage = By.cssSelector("#wholesale-discover>div>div:nth-child(1)>img");
    private By DiscoverAreaHotelName = By.cssSelector("#wholesale-discover>div>div:nth-child(2)>h3");
    private By DiscoverAreaHotelImage = By.cssSelector("#wholesale-discover>div>div:nth-child(2)>img");
    private By DiscoverAreaRestaurantName = By.cssSelector("#wholesale-discover>div>div:nth-child(3)>h3");
    private By DiscoverAreaRestaurantImage = By.cssSelector("#wholesale-discover>div>div:nth-child(3)>img");
    private By DiscoverAreaOfficesName = By.cssSelector("#wholesale-discover>div>div:nth-child(4)>h3");
    private By DiscoverAreaOfficesImage = By.cssSelector("#wholesale-discover>div>div:nth-child(4)>img");
    private By DiscoverAreaTrainingName = By.cssSelector("#wholesale-discover>div>div:nth-child(5)>h3");
    private By DiscoverAreaTrainingImage = By.cssSelector("#wholesale-discover>div>div:nth-child(5)>img");
    private By DiscoverAreaEquipmentName = By.cssSelector("#wholesale-discover>div>div:nth-child(6)>h3");
    private By DiscoverAreaEquipmentImage = By.cssSelector("#wholesale-discover>div>div:nth-child(6)>img");
    private By WhyPartnerAreaTitle = By.cssSelector("#wholesale-banner>div>h2");
    private By WhyPartnerAreaDescription = By.cssSelector("#wholesale-banner>div>p");
    private By WhyPartnerAreaImage = By.cssSelector("#wholesale-banner");
    private By PartnershipPerksAreaTitle = By.cssSelector(".py-8>div>h3");
    private By PartnershipPerksAreaDescription = By.cssSelector(".py-8>div>p");
    private By PartnershipPerksAreaEquipmentTitle = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(1)>div:nth-child(2)>h3");
    private By PartnershipPerksAreaEquipmentDescription = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(1)>div:nth-child(2)>p");
    private By PartnershipPerksAreaEquipmentImage = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(1)>div:nth-child(1)");
    private By PartnershipPerksAreaTrainingTitle = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(2)>div:nth-child(2)>h3");
    private By PartnershipPerksAreaTrainingDescription = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(2)>div:nth-child(2)>p");
    private By PartnershipPerksAreaTrainingImage = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(2)>div:nth-child(1)");
    private By PartnershipPerksAreaRoastingTitle = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(3)>div:nth-child(1)>h3");
    private By PartnershipPerksAreaRoastingDescription = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(3)>div:nth-child(1)>p");
    private By PartnershipPerksAreaRoastingImage = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(3)>div:nth-child(2)");
    private By PartnershipPerksAreaQualityTitle = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(4)>div:nth-child(1)>h3");
    private By PartnershipPerksAreaQualityDescription = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(4)>div:nth-child(1)>p");
    private By PartnershipPerksAreaQualityImage = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(4)>div:nth-child(2)");
    private By PartnershipPerksAreaEthicalSourcingTitle = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(5)>div:nth-child(2)>h3");
    private By PartnershipPerksAreaEthicalSourcingDescription = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(5)>div:nth-child(2)>p");
    private By PartnershipPerksAreaEthicalSourcingImage = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(5)>div:nth-child(1)");
    private By PartnershipPerksAreaPartnershipsTitle = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(6)>div:nth-child(2)>h3");
    private By PartnershipPerksAreaPartnershipsDescription = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(6)>div:nth-child(2)>p");
    private By PartnershipPerksAreaPartnershipsImage = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(6)>div:nth-child(1)");
    private By PartnershipPerksAreaReliableFastTitle = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(7)>div:nth-child(1)>h3");
    private By PartnershipPerksAreaReliableFastDescription = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(7)>div:nth-child(1)>p");
    private By PartnershipPerksAreaReliableFastImage = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(7)>div:nth-child(2)");
    private By PartnershipPerksAreaConsultingTitle = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(8)>div:nth-child(1)>h3");
    private By PartnershipPerksAreaConsultingDescription = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(8)>div:nth-child(1)>p");
    private By PartnershipPerksAreaConsultingImage = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(8)>div:nth-child(2)");
    private By PartnershipPerksAreaCoffeeCommunityTitle = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(9)>div:nth-child(2)>h3");
    private By PartnershipPerksAreaCoffeeCommunityDescription = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(9)>div:nth-child(2)>p");
    private By PartnershipPerksAreaCoffeeCommunityImage = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(9)>div:nth-child(1)");
    private By PartnershipPerksAreaProfessionalismTitle = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(10)>div:nth-child(2)>h3");
    private By PartnershipPerksAreaProfessionalismDescription = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(10)>div:nth-child(2)>p");
    private By PartnershipPerksAreaProfessionalismImage = By.cssSelector(".py-8>div:nth-child(2)>div:nth-child(10)>div:nth-child(1)");
    private By LetsGrabACoffeeAreaFullNameError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(2)");
    private By LetsGrabACoffeeAreaEmailError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(4)");
    private By LetsGrabACoffeeAreaContactNumberError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(6)");
    private By LetsGrabACoffeeAreaBusinessNameError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(8)");
    private By LetsGrabACoffeeAreaTypeOfBusinessError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(10)");
    private By LetsGrabACoffeeAreaTellUsError = By.cssSelector(".mx-4 .flex.flex-col.h-full  p");
    private By LetsGrabACoffeeAreaEmail = By.cssSelector(".space-y-6>input:nth-child(2)");

    private String url = "https://dev.traumkaffee.com/wholesale";

    public WhosalePage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    public void userOnTheWhosalePage() {
        elementHelper.openUrl(url);
    }

    public void sendKeystoLetsGrabACoffeeAreaFullName(String name) {
        elementHelper.sendKeys(LetsGrabACoffeeAreaFullName, name);
    }

    public void clickLetsGrabACoffeeAreaTypeOfBusines() {
        elementHelper.click(LetsGrabACoffeeAreaTypeOfBusiness);

    }

    public void sendkeysLetsGrabACoffeeAreaMail(String mail) {
        elementHelper.sendKeys(LetsGrabACoffeeAreaMail, mail);
    }

    public void sendkeysLetsGrabACoffeeAreaContactNumber(String contact) {
        elementHelper.sendKeys(LetsGrabACoffeeAreaContactNumber, contact);
    }

    public void sendkeysLetsGrabACoffeeAreaBusinessName(String business) {
        elementHelper.sendKeys(LetsGrabACoffeeAreaBusinessName, business);
    }

    public void selectLetsGrabACoffeeAreaTypeOfBusiness(String type) {
        elementHelper.clickElementWithText(LetsGrabACoffeeAreaTypeOfBusinessOptions, type);
    }

    public void sendkeysLetsGrabACoffeeAreaTellUs(String tellUs) {
        elementHelper.sendKeys(LetsGrabACoffeeAreaTellUs, tellUs);
    }

    public void clickLetsGrabACoffeeAreaSendButton() {
        elementHelper.click(LetsGrabACoffeeAreaSendButton);
    }

    public void clickDiscoverAreaCafesAndCoffeeShopsDiscoverButton() {
        elementHelper.click(DiscoverAreaCafesAndCoffeeShopsDiscoverButton);

    }

    public void clickDiscoverAreaHotelsDiscoverButton() {
        elementHelper.click(DiscoverAreaHotelsDiscoverButton);
    }

    public void clickDiscoverAreaRestaurantsDiscoverButton() {
        elementHelper.click(DiscoverAreaRestaurantsDiscoverButton);
    }

    public void clickDiscoverAreaOfficesDiscoverButton() {

        elementHelper.click(DiscoverAreaOfficesDiscoverButton);
    }

    public void clickDiscoverAreaTrainingDiscoverButton() {
        elementHelper.click(DiscoverAreaTrainingDiscoverButton);
    }

    public void clickDiscoverAreaEquipmentDiscoverButton() {
        elementHelper.click(DiscoverAreaEquipmentDiscoverButton);
    }

    public void clickPartnershipPerksAreaEquipmentButton() {
        elementHelper.click(PartnershipPerksAreaEquipmentButton);
    }

    public void clickPartnershipPerksAreaTrainingButton() {
        elementHelper.click(PartnershipPerksAreaTrainingButton);
    }

    public void shouldSeeTheWhosalePage() {
         elementHelper.checkUrl("https://dev.traumkaffee.com/wholesale");
    }

    public String shouldSeeWhosaleAreaTitle() {
        return elementHelper.getText(WhosaleAreaTitle);
    }

    public String shouldSeeWhosaleAreaDescription() {
        return elementHelper.getText(WhosaleAreaDescription);
    }

    public void shouldSeeWhosaleAreaImage() {
        elementHelper.findElement(WhosaleAreaImage).isDisplayed();
    }

    public String shouldSeeLetsGrabACoffeeAreaTitle() {
        return elementHelper.getText(LetsGrabACoffeeAreaTitle);
    }

    public String shouldSeeLetsGrabACoffeeAreaDescription() {
        return elementHelper.getText(LetsGrabACoffeeAreaDescription);

    }

    public String shouldSeeLetsGrabACoffeeAreaFullName() {
        return elementHelper.getAttribute(LetsGrabACoffeeAreaFullName, "placeholder");
    }

    public String shouldSeeLetsGrabACoffeeAreaEmail() {
        return elementHelper.getAttribute(LetsGrabACoffeeAreaEmail, "placeholder");
    }

    public String shouldSeeLetsGrabACoffeeAreaContactNumber() {
        return elementHelper.getAttribute(LetsGrabACoffeeAreaContactNumber, "placeholder");
    }

    public String shouldSeeLetsGrabACoffeeAreaBusinessName() {
        return elementHelper.getAttribute(LetsGrabACoffeeAreaBusinessName, "placeholder");
    }

    public String shouldSeeLetsGrabACoffeeAreaTypeOfBusiness() {
        elementHelper.click(LetsGrabACoffeeAreaTypeOfBusiness);
        return elementHelper.getText(LetsGrabACoffeeAreaTypeOfBusinessOption);
    }

    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOption(String text) {
        elementHelper.checkElementWithText(LetsGrabACoffeeAreaTypeOfBusinessOption, text);
    }

    public String shouldSeeLetsGrabACoffeeAreaTellUs() {
        return elementHelper.getAttribute(LetsGrabACoffeeAreaTellUs, "placeholder");
    }

    public String shouldSeeLetsGrabACoffeeAreaSendButton() {
        return elementHelper.getText(LetsGrabACoffeeAreaSendButton);
    }

    public String shouldSeeLetsGrabACoffeeAreaFalseEmailMessage() {
        return elementHelper.getText(LetsGrabACoffeeAreaFalseEmailMessage);
    }

    public String shouldSeeDescriptionAreaTitle() {
        return elementHelper.getText(DescriptionAreaTitle);
    }

    public String shouldSeeDescriptionAreaDescription() {
        return elementHelper.getText(DescriptionAreaDescription) + elementHelper.getText(DescriptionAreaDescription2) + elementHelper.getText(DescriptionAreaDescription3);
    }

    public String shouldSeeDiscoverAreaCafesAndCoffeeShopsName() {
        return elementHelper.getText(DiscoverAreaCafesAndCoffeeShopsName);

    }

    public void shouldSeeDiscoverAreaCafesAndCoffeeShopsImage() {
        elementHelper.findElement(DiscoverAreaCafesAndCoffeeShopsImage).isDisplayed();
    }

    public String shouldSeeDiscoverAreaCafesAndCoffeeShopsDiscoverButton() {
        return elementHelper.getText(DiscoverAreaCafesAndCoffeeShopsDiscoverButton);
    }

    public String shouldSeeDiscoverAreaHotelName() {
        return elementHelper.getText(DiscoverAreaHotelName);
    }

    public void shouldSeeDiscoverAreaHotelImage() {
        elementHelper.findElement(DiscoverAreaHotelImage).isDisplayed();
    }

    public String shouldSeeDiscoverAreaHotelDiscoverButton() {
        return elementHelper.getText(DiscoverAreaHotelsDiscoverButton);
    }

    public String shouldSeeDiscoverAreaRestaurantName() {
        return elementHelper.getText(DiscoverAreaRestaurantName);
    }

    public void shouldSeeDiscoverAreaRestaurantImage() {
        elementHelper.findElement(DiscoverAreaRestaurantImage).isDisplayed();
    }

    public String shouldSeeDiscoverAreaRestaurantDiscoverButton() {
        return elementHelper.getText(DiscoverAreaRestaurantsDiscoverButton);

    }

    public String shouldSeeDiscoverAreaOfficesName() {
        return elementHelper.getText(DiscoverAreaOfficesName);
    }

    public void shouldSeeDiscoverAreaOfficesImage() {
        elementHelper.findElement(DiscoverAreaOfficesImage).isDisplayed();
    }

    public String shouldSeeDiscoverAreaOfficesDiscoverButton() {
        return elementHelper.getText(DiscoverAreaOfficesDiscoverButton);
    }

    public String shouldSeeDiscoverAreaTrainingName() {
        return elementHelper.getText(DiscoverAreaTrainingName);
    }

    public void shouldSeeDiscoverAreaTrainingImage() {
        elementHelper.findElement(DiscoverAreaTrainingImage).isDisplayed();
    }

    public String shouldSeeDiscoverAreaTrainingDiscoverButton() {
        return elementHelper.getText(DiscoverAreaTrainingDiscoverButton);
    }

    public String shouldSeeDiscoverAreaEquipmentName() {
        return elementHelper.getText(DiscoverAreaEquipmentName);
    }

    public void shouldSeeDiscoverAreaEquipmentImage() {
        elementHelper.findElement(DiscoverAreaEquipmentImage).isDisplayed();
    }

    public String shouldSeeDiscoverAreaEquipmentDiscoverButton() {
        return elementHelper.getText(DiscoverAreaEquipmentDiscoverButton);
    }

    public String shouldSeeWhyPartnerAreaTitle() {
        return elementHelper.getText(WhyPartnerAreaTitle);
    }

    public String shouldSeeWhyPartnerAreaDescription() {
        return elementHelper.getText(WhyPartnerAreaDescription);
    }

    public void shouldSeeWhyPartnerAreaImage() {
        elementHelper.findElement(WhyPartnerAreaImage).isDisplayed();
    }

    public String shouldSeePartnershipPerksAreaTitle() {
        return elementHelper.getText(PartnershipPerksAreaTitle);
    }

    public String shouldSeePartnershipPerksAreaDescription() {
        return elementHelper.getText(PartnershipPerksAreaDescription);
    }

    public String shouldSeePartnershipPerksAreaEquipmentTitle() {
        return elementHelper.getText(PartnershipPerksAreaEquipmentTitle);
    }

    public String shouldSeePartnershipPerksAreaEquipmentDescription() {
        return elementHelper.getText(PartnershipPerksAreaEquipmentDescription);
    }

    public void shouldSeePartnershipPerksAreaEquipmentImage() {
        elementHelper.findElement(PartnershipPerksAreaEquipmentImage);
    }

    public void shouldSeePartnershipPerksAreaEquipmentButton() {
        elementHelper.findElement(PartnershipPerksAreaEquipmentButton);
    }

    public String shouldSeePartnershipPerksAreaTrainingTitle() {
        return elementHelper.getText(PartnershipPerksAreaTrainingTitle);
    }

    public String shouldSeePartnershipPerksAreaTrainingDescription() {
        return elementHelper.getText(PartnershipPerksAreaTrainingDescription);
    }

    public void shouldSeePartnershipPerksAreaTrainingImage() {
        elementHelper.findElement(PartnershipPerksAreaTrainingImage).isDisplayed();
    }

    public void shouldSeePartnershipPerksAreaTrainingButton() {
        elementHelper.findElement(PartnershipPerksAreaTrainingButton).isDisplayed();
    }

    public String shouldSeePartnershipPerksAreaRoastingTitle() {
        return elementHelper.getText(PartnershipPerksAreaRoastingTitle);
    }

    public String shouldSeePartnershipPerksAreaRoastingDescription() {
        return elementHelper.getText(PartnershipPerksAreaRoastingDescription);
    }

    public void shouldSeePartnershipPerksAreaRoastingImage() {
        elementHelper.findElement(PartnershipPerksAreaRoastingImage).isDisplayed();
    }

    public String shouldSeePartnershipPerksAreaQualityTitle() {
        return elementHelper.getText(PartnershipPerksAreaQualityTitle);
    }

    public String shouldSeePartnershipPerksAreaQualityDescription() {
        return elementHelper.getText(PartnershipPerksAreaQualityDescription);
    }

    public void shouldSeePartnershipPerksAreaQualityImage() {
        elementHelper.findElement(PartnershipPerksAreaQualityImage).isDisplayed();
    }

    public String shouldSeePartnershipPerksAreaEthicalSourcingTitle() {
        return elementHelper.getText(PartnershipPerksAreaEthicalSourcingTitle);
    }

    public String shouldSeePartnershipPerksAreaEthicalSourcingDescription() {
        return elementHelper.getText(PartnershipPerksAreaEthicalSourcingDescription);
    }

    public void shouldSeePartnershipPerksAreaEthicalSourcingImage() {
        elementHelper.findElement(PartnershipPerksAreaEthicalSourcingImage).isDisplayed();
    }

    public String shouldSeePartnershipPerksAreaPartnershipsTitle() {
        return elementHelper.getText(PartnershipPerksAreaPartnershipsTitle);
    }

    public String shouldSeePartnershipPerksAreaPartnershipsDescription() {
        return elementHelper.getText(PartnershipPerksAreaPartnershipsDescription);
    }

    public void shouldSeePartnershipPerksAreaPartnershipsImage() {
        elementHelper.findElement(PartnershipPerksAreaPartnershipsImage).isDisplayed();
    }

    public String shouldSeePartnershipPerksAreaReliableFastTitle() {
        return elementHelper.getText(PartnershipPerksAreaReliableFastTitle);
    }

    public String shouldSeePartnershipPerksAreaReliableFastDescription() {
        return elementHelper.getText(PartnershipPerksAreaReliableFastDescription);
    }

    public void shouldSeePartnershipPerksAreaReliableFastImage() {
        elementHelper.findElement(PartnershipPerksAreaReliableFastImage).isDisplayed();
    }

    public String shouldSeePartnershipPerksAreaConsultingTitle() {
        return elementHelper.getText(PartnershipPerksAreaConsultingTitle);
    }

    public String shouldSeePartnershipPerksAreaConsultingDescription() {
        return elementHelper.getText(PartnershipPerksAreaConsultingDescription);
    }

    public void shouldSeePartnershipPerksAreaConsultingImage() {
        elementHelper.findElement(PartnershipPerksAreaConsultingImage).isDisplayed();
    }

    public String shouldSeePartnershipPerksAreaCoffeeCommunityTitle() {
        return elementHelper.getText(PartnershipPerksAreaCoffeeCommunityTitle);
    }

    public String shouldSeePartnershipPerksAreaCoffeeCommunityDescription() {
        return elementHelper.getText(PartnershipPerksAreaCoffeeCommunityDescription);
    }

    public void shouldSeePartnershipPerksAreaCoffeeCommunityImage() {
        elementHelper.findElement(PartnershipPerksAreaCoffeeCommunityImage).isDisplayed();

    }

    public String shouldSeePartnershipPerksAreaProfessionalismTitle() {
        return elementHelper.getText(PartnershipPerksAreaProfessionalismTitle);
    }

    public String shouldSeePartnershipPerksAreaProfessionalismDescription() {
        return elementHelper.getText(PartnershipPerksAreaProfessionalismDescription);
    }

    public void shouldSeePartnershipPerksAreaProfessionalismImage() {
        elementHelper.findElement(PartnershipPerksAreaProfessionalismImage).isDisplayed();
    }

    public String shouldSeeLetsGrabACoffeeAreaFullNameError() {
        return elementHelper.getText(LetsGrabACoffeeAreaFullNameError);
    }

    public String shouldSeeLetsGrabACoffeeAreaEmailError() {
        return elementHelper.getText(LetsGrabACoffeeAreaEmailError);
    }

    public String shouldSeeLetsGrabACoffeeAreaContactNumberError() {
        return elementHelper.getText(LetsGrabACoffeeAreaContactNumberError);
    }

    public String shouldSeeLetsGrabACoffeeAreaBusinessNameError() {
        return elementHelper.getText(LetsGrabACoffeeAreaBusinessNameError);
    }

    public String shouldSeeLetsGrabACoffeeAreaTypeOfBusinessError() {
        return elementHelper.getText(LetsGrabACoffeeAreaTypeOfBusinessError);
    }

    public String shouldSeeLetsGrabACoffeeAreaTellUsError() {
        return elementHelper.getText(LetsGrabACoffeeAreaTellUsError);
    }

}




