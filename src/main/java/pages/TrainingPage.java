package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class TrainingPage {
    private ElementHelper elementHelper;

    public TrainingPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private String url = "https://dev.traumkaffee.com/wholesale/training";
    private By LetsGrabACoffeeAreaTypeOfBusines = By.cssSelector(".space-y-6>select");
    private By LetsGrabACoffeeAreaFullName = By.cssSelector(".space-y-6>input:nth-child(1)");
    private By LetsGrabACoffeeAreaMail = By.cssSelector(".space-y-6>input:nth-child(2)");
    private By LetsGrabACoffeeAreaContactNumber = By.cssSelector(".space-y-6>div>input");
    private By LetsGrabACoffeeAreaBusinessName = By.cssSelector(".space-y-6>input:nth-child(4)");
    private By LetsGrabACoffeeAreaTypeOfBusiness = By.cssSelector(".space-y-6>select>option");
    private By LetsGrabACoffeeAreaTellUs = By.cssSelector(".flex.flex-col.h-full>textarea");
    private By LetsGrabACoffeeAreaSendButton = By.cssSelector(".flex.flex-col.h-full>button");
    private By TrainingAreaTitle = By.cssSelector("#wholesale-hero>div:nth-child(2) h2");
    private By TrainingAreaDescription = By.cssSelector("#wholesale-hero>div:nth-child(2) p");
    private By TrainingAreaImage = By.cssSelector("#wholesale-hero>div:nth-child(2)");
    private By DescriptionAreaDescription = By.cssSelector(".my-8 p");
    private By CoffeeTrainingAreaTitle = By.cssSelector(".mb-16>div>div:nth-child(1)>div span");
    private By CoffeeTrainingAreaDescription = By.cssSelector(".mb-16>div>div:nth-child(1)>div p");
    private By CoffeeTrainingAreaImage = By.cssSelector(".mb-16>div>div:nth-child(1) img");
    private By MachineTrainingAreaTitle = By.cssSelector(".mb-16>div>div:nth-child(2)>div span");
    private By MachineTrainingAreaDescription = By.cssSelector(".mb-16>div>div:nth-child(2)>div p");
    private By MachineTrainingAreaImage = By.cssSelector(".mb-16>div>div:nth-child(2) img");
    private By BaristaTrainingAreaTitle = By.cssSelector(".mb-16>div>div:nth-child(3) span");
    private By BaristaTrainingAreaDescription = By.cssSelector(".mb-16>div>div:nth-child(3) p");
    private By BaristaTrainingAreaImage = By.cssSelector(".mb-16>div>div:nth-child(3) img");
    private By WorkshopsAreaTitle = By.cssSelector(".mb-16>div>div:nth-child(4) span");
    private By WorkshopsAreaDescription = By.cssSelector(".mb-16>div>div:nth-child(4) p");
    private By WorkshopsAreaImage = By.cssSelector(".mb-16>div>div:nth-child(4) img");
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

    public void userOnTheTrainingPage() {
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

    public void shouldSeeTheTrainingPage() {
        elementHelper.checkUrl("https://dev.traumkaffee.com/wholesale/training");
    }

    public String shouldSeeTrainingAreaTitle() {
        return elementHelper.getText(TrainingAreaTitle);
    }

    public String shouldSeeTrainingAreaDescription() {
        return elementHelper.getText(TrainingAreaDescription);
    }

    public void shouldSeeTrainingAreaImage() {
        elementHelper.checkElement(TrainingAreaImage);
    }

    public String shouldSeeDescriptionAreaDescription() {
        return elementHelper.getText(DescriptionAreaDescription);
    }

    public String shouldSeeCoffeeTrainingAreaTitle() {
        return elementHelper.getText(CoffeeTrainingAreaTitle);
    }

    public String shouldSeeCoffeeTrainingAreaDescription() {
        return elementHelper.getText(CoffeeTrainingAreaDescription);
    }

    public void shouldSeeCoffeeTrainingAreaImage() {
        elementHelper.checkElement(CoffeeTrainingAreaImage);
    }

    public String shouldSeeMachineTrainingAreaTitle() {
        return elementHelper.getText(MachineTrainingAreaTitle);
    }

    public String shouldSeeMachineTrainingAreaDescription() {
        return elementHelper.getText(MachineTrainingAreaDescription);
    }

    public void shouldSeeMachineTrainingAreaImage() {
        elementHelper.checkElement(MachineTrainingAreaImage);
    }

    public String shouldSeeBaristaTrainingAreaTitle() {
        return elementHelper.getText(BaristaTrainingAreaTitle);
    }

    public String shouldSeeBaristaTrainingAreaDescription() {
        return elementHelper.getText(BaristaTrainingAreaDescription);
    }

    public void shouldSeeBaristaTrainingAreaImage() {
        elementHelper.checkElement(BaristaTrainingAreaImage);
    }

    public String shouldSeeWorkshopsAreaTitle() {
        return elementHelper.getText(WorkshopsAreaTitle);
    }

    public String shouldSeeWorkshopsAreaDescription() {
        return elementHelper.getText(WorkshopsAreaDescription);
    }

    public void shouldSeeWorkshopsAreaImage() {
        elementHelper.checkElement(WorkshopsAreaImage);
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
