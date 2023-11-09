package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ContactPage {
    private ElementHelper elementHelper;

    public ContactPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private String url = "https://dev.traumkaffee.com/contact";
    private By GetInTouchAreaSubjectDropdown = By.id("subject");
    private By FollowUsAreaFacebookIcon = By.cssSelector(".flex.justify-start.items-center.space-x-10.mt-2>a:nth-child(1)");
    private By FollowUsAreaInstagramIcon = By.cssSelector(".flex.justify-start.items-center.space-x-10.mt-2>a:nth-child(2)");
    private By FollowUsAreaTwitterIcon = By.cssSelector(".flex.justify-start.items-center.space-x-10.mt-2>a:nth-child(3)");
    private By FollowUsAreaTiktokIcon = By.cssSelector(".flex.justify-start.items-center.space-x-10.mt-2>a:nth-child(4)");
    private By GetInTouchAreaSendButton = By.cssSelector(".w-36.h-10.text-white.mb-4.shadow-md");
    private By GetInTouchAreaName = By.cssSelector("#contact-form>div>div:nth-child(2)>label");
    private By GetInTouchAreaEmail = By.cssSelector("#contact-form>div>div:nth-child(3)>label");
    private By GetInTouchAreaSubject = By.cssSelector("#contact-form>div>div:nth-child(4)>label");
    private By GetInTouchAreaOrderNumber = By.cssSelector("#contact-form>div>div:nth-child(5)>label");
    private By GetInTouchAreaMessage = By.cssSelector("#contact-form>div>div:nth-child(6)>label");
    private By ContactAreaTitle = By.cssSelector(".flex.justify-center>h1");
    private By ContactAreaTitle2 = By.cssSelector(".flex.justify-center>h1:nth-child(2)");
    private By ContactAreaImage = By.id("contact-us");
    private By OurOfficeAreaTitle = By.cssSelector("#contact-info>h2:nth-child(1)");
    private By OurOfficeAreaOurOfficeAddressTitle = By.cssSelector("#contact-info>div>div:nth-child(1)>p");
    private By OurOfficeAreaOurOfficeAddressDescription = By.cssSelector("#contact-info>div>div:nth-child(2)>p");
    private By OurOfficeAreaOurOfficeAddressIcon = By.cssSelector("#contact-info>div:nth-child(2)>div:nth-child(1) svg");
    private By OurOfficeAreaOurOfficePhoneTitle = By.cssSelector("#contact-info>div:nth-child(3)>div:nth-child(1)>p");
    private By OurOfficeAreaOurOfficePhoneDescription = By.cssSelector("#contact-info>div:nth-child(3)>div:nth-child(2)>p");
    private By OurOfficeAreaOurOfficePhoneIcon = By.cssSelector("#contact-info>div:nth-child(3)>div:nth-child(1) svg");
    private By FollowUsAreaTitle = By.cssSelector("#contact-info>h2:nth-child(4)");
    private By WebSupportAreaTitle = By.cssSelector("#contact-support>h2");
    private By WebSupportAreaMail = By.id("contact-mail");
    private By GetInTouchAreaTitle = By.cssSelector("#contact-form h2");
    private By GetInTouchAreaNameTextbox = By.id("fullName");
    private By GetInTouchAreaEmailTextbox = By.id("email");
    private By GetInTouchAreaSubjectOption = By.cssSelector("#subject option");
    private By GetInTouchAreaOrderNumberTextbox = By.id("orderNumber");
    private By GetInTouchAreaMessageTextbox = By.id("message");
    private By NameRequiredMessage = By.cssSelector("#contact-form>div>div:nth-child(2)>p.mt-1");
    private By SubjectRequiredMessage = By.cssSelector("#contact-form>div>div:nth-child(4)>p.mt-1");
    private By OrderNumberRequiredMessage = By.cssSelector("#contact-form>div>div:nth-child(5)>p.mt-1");
    private By MessageRequiredMessage = By.cssSelector("#contact-form>div>div:nth-child(6)>p.mt-1");
    private By MailInvalidMessage = By.cssSelector("#contact-form>div>div:nth-child(3)>p.mt-1");


    public void userOnTheContactPage() {
        elementHelper.openUrl(url);
    }

    public void clickGetInTouchAreaSubjectDropdown() {
        elementHelper.click(GetInTouchAreaSubjectDropdown);
    }

    public void clickFollowUsAreaFacebookIcon() {
        elementHelper.click(FollowUsAreaFacebookIcon);
    }

    public void clickFollowUsAreaInstagramIcon() {
        elementHelper.click(FollowUsAreaInstagramIcon);
    }

    public void clickFollowUsAreaTwitterIcon() {
        elementHelper.click(FollowUsAreaTwitterIcon);
    }

    public void clickFollowUsAreaTiktokIcon() {
        elementHelper.click(FollowUsAreaTiktokIcon);
    }

    public void clickGetInTouchAreaSendButton() {
        elementHelper.click(GetInTouchAreaSendButton);
    }

    public String getNameRequiredMessage() {
      return elementHelper.getText(NameRequiredMessage);
    }

    public String getSubjectRequiredMessage() {
        return elementHelper.getText(SubjectRequiredMessage);
    }

    public String getMailInvaliddMessage() {
        return elementHelper.getText(MailInvalidMessage);
    }

    public String getOrderNumberRequiredMessage() {
        return elementHelper.getText(OrderNumberRequiredMessage);
    }

    public String getMessageRequiredMessage() {
        return elementHelper.getText(MessageRequiredMessage);
    }




    public void sendkeysGetInTouchAreaName(String name) {
        elementHelper.sendKeys(GetInTouchAreaNameTextbox, name);
    }

    public void sendkeysGetInTouchAreaEmail(String mail) {
        elementHelper.sendKeys(GetInTouchAreaEmailTextbox, mail);
    }

    public void selectGetInTouchAreaSubject(String subject) {
        elementHelper.clickElementWithText(GetInTouchAreaSubjectOption,subject);
    }

    public void sendkeysGetInTouchAreaOrderNumber(String number) {
        elementHelper.sendKeys(GetInTouchAreaOrderNumberTextbox, number);
    }

    public void sendkeysGetInTouchAreaMessage(String message) {
        elementHelper.sendKeys(GetInTouchAreaMessageTextbox, message);
    }

    public void shouldSeeTheContactPage() {
        elementHelper.checkUrl("contact");
    }

    public String shouldSeeContactAreaTitle() {
        return elementHelper.getText(ContactAreaTitle) + elementHelper.getText(ContactAreaTitle2);
    }

    public void shouldSeeContactAreaImage() {
        elementHelper.checkElement(ContactAreaImage);
    }

    public String shouldSeeOurOfficeAreaTitle() {
        return elementHelper.getText(OurOfficeAreaTitle);
    }

    public String shouldSeeOurOfficeAreaOurOfficeAddressTitle() {
        return elementHelper.getText(OurOfficeAreaOurOfficeAddressTitle);
    }

    public String shouldSeeOurOfficeAreaOurOfficeAddressDescription() {
        return elementHelper.getText(OurOfficeAreaOurOfficeAddressDescription);
    }

    public void shouldSeeOurOfficeAreaOurOfficeAddressIcon() {
        elementHelper.checkElement(OurOfficeAreaOurOfficeAddressIcon);
    }

    public String shouldSeeOurOfficeAreaOurOfficePhoneTitle() {
        return elementHelper.getText(OurOfficeAreaOurOfficePhoneTitle);
    }

    public String shouldSeeOurOfficeAreaOurOfficePhoneDescription() {
        return elementHelper.getText(OurOfficeAreaOurOfficePhoneDescription);
    }

    public void shouldSeeOurOfficeAreaOurOfficePhoneIcon() {
        elementHelper.checkElement(OurOfficeAreaOurOfficePhoneIcon);
    }

    public String shouldSeeFollowUsAreaTitle() {
        return elementHelper.getText(FollowUsAreaTitle);
    }

    public void shouldSeeFollowUsAreaFacebookIcon() {
        elementHelper.checkElement(FollowUsAreaFacebookIcon);
    }

    public void shouldSeeFollowUsAreaInstagramIcon() {
        elementHelper.checkElement(FollowUsAreaInstagramIcon);
    }

    public void shouldSeeFollowUsAreaTwitterIcon() {
        elementHelper.checkElement(FollowUsAreaTwitterIcon);
    }

    public void shouldSeeFollowUsAreaTiktokIcon() {
        elementHelper.checkElement(FollowUsAreaTiktokIcon);
    }

    public String shouldSeeWebSupportAreaTitle() {
        return elementHelper.getText(WebSupportAreaTitle);
    }

    public String shouldSeeWebSupportAreaMail() {
        return elementHelper.getText(WebSupportAreaMail);
    }

    public String shouldSeeGetInTouchAreaTitle() {
        return elementHelper.getText(GetInTouchAreaTitle);
    }

    public String shouldSeeGetInTouchAreaName() {
        return elementHelper.getText(GetInTouchAreaName);
    }

    public void shouldSeeGetInTouchAreaNameTextbox() {
        elementHelper.checkElement(GetInTouchAreaNameTextbox);
    }

    public String shouldSeeGetInTouchAreaEmail() {
        return elementHelper.getText(GetInTouchAreaEmail);
    }

    public void shouldSeeGetInTouchAreaEmailTextbox() {
        elementHelper.checkElement(GetInTouchAreaEmailTextbox);
    }

    public String shouldSeeGetInTouchAreaSubject() {
        return elementHelper.getText(GetInTouchAreaSubject);
    }

    public void shouldSeeGetInTouchAreaSubjectDropdown() {
        elementHelper.checkElement(GetInTouchAreaSubjectDropdown);
    }

    public void shouldSeeGetInTouchAreaSubjectOption(String text) {
        elementHelper.checkElementWithText(GetInTouchAreaSubjectOption, text);
    }

    public String shouldSeeGetInTouchAreaOrderNumber() {
        return elementHelper.getText(GetInTouchAreaOrderNumber);
    }

    public void shouldSeeGetInTouchAreaOrderNumberTextbox() {
        elementHelper.checkElement(GetInTouchAreaOrderNumberTextbox);
    }

    public String shouldSeeGetInTouchAreaMessage() {
        return elementHelper.getText(GetInTouchAreaMessage);
    }

    public void shouldSeeGetInTouchAreaMessageTextbox() {
        elementHelper.checkElement(GetInTouchAreaMessageTextbox);
    }

    public String shouldSeeGetInTouchAreaSendButton() {
        return elementHelper.getText(GetInTouchAreaSendButton);
    }


}
