package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class EquipmentPage {

    private ElementHelper elementHelper;

    public EquipmentPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private String url = "https://dev.traumkaffee.com/wholesale/equipments";
    private By LetsGrabACoffeeAreaTypeOfBusines = By.cssSelector(".space-y-6>select");
    private By LetsGrabACoffeeAreaFullName = By.cssSelector(".space-y-6>input:nth-child(1)");
    private By LetsGrabACoffeeAreaMail = By.cssSelector(".space-y-6>input:nth-child(2)");
    private By LetsGrabACoffeeAreaContactNumber = By.cssSelector(".space-y-6>div>input");
    private By LetsGrabACoffeeAreaBusinessName = By.cssSelector(".space-y-6>input:nth-child(4)");
    private By LetsGrabACoffeeAreaTypeOfBusiness = By.cssSelector(".space-y-6>select>option");
    private By LetsGrabACoffeeAreaTellUs = By.cssSelector(".flex.flex-col.h-full>textarea");
    private By LetsGrabACoffeeAreaSendButton = By.cssSelector(".flex.flex-col.h-full>button");
    private By EquipmentAreaTitle = By.cssSelector("#wholesale-hero>div:nth-child(2) h2");
    private By EquipmentAreaDescription = By.cssSelector("#wholesale-hero>div:nth-child(2) p");
    private By EquipmentAreaImage = By.cssSelector("#wholesale-hero>div:nth-child(2)");
    private By DescriptionAreaDescription = By.cssSelector(".mt-8.mb-4 p");
    private By HighQualityCoffeeAreaTitle = By.cssSelector(".mb-16>div>div:nth-child(1) span");
    private By HighQualityCoffeeAreaDescription = By.cssSelector(".mb-16>div>div:nth-child(1) p");
    private By HighQualityCoffeeAreaImage = By.cssSelector(".mb-16>div>div:nth-child(1)>img");
    private By InstallationAreaTitle = By.cssSelector(".mb-16>div>div:nth-child(2) span");
    private By InstallationAreaDescription = By.cssSelector(".mb-16>div>div:nth-child(2) p");
    private By InstallationAreaImage = By.cssSelector(".mb-16>div>div:nth-child(2) img");
    private By ComprehensiveTrainingAreaTitle = By.cssSelector(".mb-16>div>div:nth-child(3) span");
    private By ComprehensiveTrainingAreaDescription = By.cssSelector(".mb-16>div>div:nth-child(3) p");
    private By ComprehensiveTrainingAreaImage = By.cssSelector(".mb-16>div>div:nth-child(3) img");
    private By OngoingTechnicalAreaTitle = By.cssSelector(".mb-16>div>div:nth-child(4) span");
    private By OngoingTechnicalAreaDescription = By.cssSelector(".mb-16>div>div:nth-child(4) p");
    private By OngoingTechnicalAreaImage = By.cssSelector(".mb-16>div>div:nth-child(4) img");
    private By LetsGrabACoffeeAreaTitle = By.cssSelector("#wholesale-contact>div>h3");
    private By LetsGrabACoffeeAreaDescription = By.cssSelector("#wholesale-contact>div>p");
    private By LetsGrabACoffeeAreaEmail = By.cssSelector(".space-y-6>input:nth-child(2)");
    private By LetsGrabACoffeeAreaTypeOfBusinessOption = By.cssSelector("select>option");
    private By LetsGrabACoffeeAreaFalseEmailMessage = By.cssSelector(".space-y-6>h2");
    private By LetsGrabACoffeeAreaFullNameError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(2)");
    private By LetsGrabACoffeeAreaEmailError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(4)");
    private By LetsGrabACoffeeAreaContactNumberError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(6)");
    private By LetsGrabACoffeeAreaBusinessNameError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(8)");
    private By LetsGrabACoffeeAreaTypeOfBusinessError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(10)");
    private By LetsGrabACoffeeAreaTellUsError = By.cssSelector(".mx-4 .flex.flex-col.h-full  p");


    public void userOnTheEquipmentPage() {
        elementHelper.openUrl(url);
    }

    public void clickLetsGrabACoffeeAreaTypeOfBusines() {
        elementHelper.click(LetsGrabACoffeeAreaTypeOfBusines);
    }

    public void sendkeysLetsGrabACoffeeAreaFullName(String name) {
        elementHelper.sendKeys(LetsGrabACoffeeAreaFullName, name);
    }

    public void sendkeysLetsGrabACoffeeAreaMail(String mail) {
        elementHelper.sendKeys(LetsGrabACoffeeAreaMail, mail);
    }

    public void sendkeysLetsGrabACoffeeAreaContactNumber(String number) {
        elementHelper.sendKeys(LetsGrabACoffeeAreaContactNumber, number);
    }

    public void sendkeysLetsGrabACoffeeAreaBusinessName(String name) {
        elementHelper.sendKeys(LetsGrabACoffeeAreaBusinessName, name);
    }

    public void selectLetsGrabACoffeeAreaTypeOfBusiness(String type) {
        elementHelper.clickElementWithText(LetsGrabACoffeeAreaTypeOfBusiness, type);
    }

    public void sendkeysLetsGrabACoffeeAreaTellUs(String tellUs) {
        elementHelper.sendKeys(LetsGrabACoffeeAreaTellUs, tellUs);
    }

    public void clickLetsGrabACoffeeAreaSendButton() {
        elementHelper.click(LetsGrabACoffeeAreaSendButton);
    }

    public void shouldSeeTheEquipmentPage() {
        elementHelper.checkUrl("https://dev.traumkaffee.com/wholesale/equipments");
    }

    public String shouldSeeEquipmentAreaTitle() {
        return elementHelper.getText(EquipmentAreaTitle);
    }

    public String shouldSeeEquipmentAreaDescription() {
        return elementHelper.getText(EquipmentAreaDescription);
    }

    public void shouldSeeEquipmentAreaImage() {
        elementHelper.checkElement(EquipmentAreaImage);
    }

    public String shouldSeeDescriptionAreaDescription() {
        return elementHelper.getText(DescriptionAreaDescription);
    }

    public String shouldSeeHighQualityCoffeeAreaTitle() {
        return elementHelper.getText(HighQualityCoffeeAreaTitle);
    }

    public String shouldSeeHighQualityCoffeeAreaDescription() {
        return elementHelper.getText(HighQualityCoffeeAreaDescription);
    }

    public void shouldSeeHighQualityCoffeeAreaImage() {
        elementHelper.checkElement(HighQualityCoffeeAreaImage);
    }

    public String shouldSeeInstallationAreaTitle() {
        return elementHelper.getText(InstallationAreaTitle);
    }

    public String shouldSeeInstallationAreaDescription() {
        return elementHelper.getText(InstallationAreaDescription);
    }

    public void shouldSeeInstallationAreaImage() {
        elementHelper.checkElement(InstallationAreaImage);
    }

    public String shouldSeeComprehensiveTrainingAreaTitle() {
        return elementHelper.getText(ComprehensiveTrainingAreaTitle);
    }

    public String shouldSeeComprehensiveTrainingAreaDescription() {
        return elementHelper.getText(ComprehensiveTrainingAreaDescription);
    }

    public void shouldSeeComprehensiveTrainingAreaImage() {
        elementHelper.checkElement(ComprehensiveTrainingAreaImage);
    }

    public String shouldSeeOngoingTechnicalAreaTitle() {
        return elementHelper.getText(OngoingTechnicalAreaTitle);
    }

    public String shouldSeeOngoingTechnicalAreaDescription() {
        return elementHelper.getText(OngoingTechnicalAreaDescription);
    }

    public void shouldSeeOngoingTechnicalAreaImage() {
        elementHelper.checkElement(OngoingTechnicalAreaImage);
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
        return elementHelper.getText(LetsGrabACoffeeAreaTypeOfBusiness);
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
