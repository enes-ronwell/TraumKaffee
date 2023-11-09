package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class FAQPage {
    private ElementHelper elementHelper;

    public FAQPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private String url = "https://dev.traumkaffee.com/help";

    private By FAQAreaQuestionThree = By.cssSelector(".px-8.py-8>div:nth-child(4) h3");
    private By FAQAreaQuestionOne = By.cssSelector(".px-8.py-8>div:nth-child(2) h3");
    private By FAQAreaQuestionTwo = By.cssSelector(".px-8.py-8>div:nth-child(3) h3");
    private By FAQAreaQuestionFour = By.cssSelector(".px-8.py-8>div:nth-child(5) h3");
    private By FAQAreaQuestionFive = By.cssSelector(".px-8.py-8>div:nth-child(6) h3");
    private By FAQAreaQuestionSix = By.cssSelector(".px-8.py-8>div:nth-child(7) h3");
    private By SecondPageOnPagionation = By.cssSelector(".px-8.py-8>ul>li:nth-child(3) a");
    private By HelpWithAreaShop = By.cssSelector("#helpMenu ul>li:nth-child(1)>button");
    private By HelpWithAreaMyOrders = By.cssSelector("#helpMenu ul>li:nth-child(2)>button");
    private By HelpWithAreaBrewGuides = By.cssSelector("#helpMenu ul>li:nth-child(3)>button");
    private By HelpWithAreaContactUs = By.cssSelector("#helpMenu ul>li:nth-child(4)>button");
    private By FAQAreaTitle = By.cssSelector(".px-8.py-8 h2");
    private By FAQAreaAnswerOne = By.cssSelector(".px-8.py-8>div:nth-child(2) p");
    private By FAQAreaAnswerTwo = By.cssSelector(".px-8.py-8>div:nth-child(3) p");
    private By FAQAreaAnswerThree = By.cssSelector(".px-8.py-8>div:nth-child(4) p");
    private By FAQAreaAnswerFour = By.cssSelector(".px-8.py-8>div:nth-child(5) p");
    private By FAQAreaAnswerFive = By.cssSelector(".px-8.py-8>div:nth-child(6) p");
    private By FAQAreaAnswerSix = By.cssSelector(".px-8.py-8>div:nth-child(7) p");
    private By FAQAreaPaginationLeftIcon = By.cssSelector(".px-8.py-8>ul>li:nth-child(1)");
    private By FAQAreaPaginationRightIcon = By.cssSelector(".px-8.py-8>ul>li:nth-child(4)");
    private By FAQAreaPaginationText = By.cssSelector(".px-8.py-8>ul>li:nth-child(2)>a , .px-8.py-8>ul>li:nth-child(3)>a");
    private By HelpWithAreaTitle = By.cssSelector("#helpMenu h2");


    public void userOnTheFAQPage() {
        elementHelper.openUrl(url);
    }

    public void shouldSeeTheFAQPage() {
        elementHelper.checkUrl("https://dev.traumkaffee.com/help");
    }

    public void clickFAQAreaQuestionThree() {
        elementHelper.click(FAQAreaQuestionThree);

    }

    public void clickFAQAreaQuestionOne() {
        elementHelper.click(FAQAreaQuestionOne);

    }

    public void clickFAQAreaQuestionTwo() {
        elementHelper.click(FAQAreaQuestionTwo);
    }

    public void clickFAQAreaQuestionFour() {
        elementHelper.click(FAQAreaQuestionFour);
    }

    public void clickFAQAreaQuestionFive() {
        elementHelper.click(FAQAreaQuestionFive);
    }

    public void clickFAQAreaQuestionSix() {
        elementHelper.click(FAQAreaQuestionSix);
    }

    public void clickSecondPageOnPagionation() {
        elementHelper.click(SecondPageOnPagionation);
    }

    public void clickHelpWithAreaShop() {
        elementHelper.click(HelpWithAreaShop);
    }

    public void clickHelpWithAreaMyOrders() {
        elementHelper.click(HelpWithAreaMyOrders);
    }

    public void clickHelpWithAreaBrewGuides() {
        elementHelper.click(HelpWithAreaBrewGuides);
    }

    public void clickHelpWithAreaContactUs() {
        elementHelper.click(HelpWithAreaContactUs);
    }

    public String shouldSeeHelpWithAreaTitle() {
        return elementHelper.getText(HelpWithAreaTitle);
    }

    public String shouldSeeHelpWithAreaShop() {
        return elementHelper.getText(HelpWithAreaShop);

    }

    public String shouldSeeHelpWithAreaMyOrders() {
        return elementHelper.getText(HelpWithAreaMyOrders);

    }

    public String shouldSeeHelpWithAreaBrewGuides() {
        return elementHelper.getText(HelpWithAreaBrewGuides);
    }

    public String shouldSeeHelpWithAreaContactUs() {
        return elementHelper.getText(HelpWithAreaContactUs);
    }

    public String shouldSeeFAQAreaTitle() {
        return elementHelper.getText(FAQAreaTitle);
    }

    public String shouldSeeFAQAreaQuestionOne() {
        return elementHelper.getText(FAQAreaQuestionOne);
    }

    public String shouldSeeFAQAreaAnswerOne() {
        return elementHelper.getText(FAQAreaAnswerOne);
    }

    public String shouldSeeFAQAreaQuestionTwo() {
        return elementHelper.getText(FAQAreaQuestionTwo);
    }

    public String shouldSeeFAQAreaAnswerTwo() {
        return elementHelper.getText(FAQAreaAnswerTwo);
    }

    public String shouldSeeFAQAreaQuestionThree() {
        return elementHelper.getText(FAQAreaQuestionThree);
    }

    public String shouldSeeFAQAreaAnswerThree() {
        return elementHelper.getText(FAQAreaAnswerThree);
    }

    public String shouldSeeFAQAreaQuestionFour() {
        return elementHelper.getText(FAQAreaQuestionFour);
    }

    public String shouldSeeFAQAreaAnswerFour() {
        return elementHelper.getText(FAQAreaAnswerFour);
    }

    public String shouldSeeFAQAreaQuestionFive() {
        return elementHelper.getText(FAQAreaQuestionFive);
    }

    public String shouldSeeFAQAreaAnswerFive() {
        return elementHelper.getText(FAQAreaAnswerFive);
    }

    public String shouldSeeFAQAreaQuestionSix() {
        return elementHelper.getText(FAQAreaQuestionSix);
    }

    public String shouldSeeFAQAreaAnswerSix() {
        return elementHelper.getText(FAQAreaAnswerSix);
    }

    public void shouldSeeFAQAreaPaginationLeftIcon() {
        elementHelper.findElement(FAQAreaPaginationLeftIcon).isDisplayed();
    }

    public void shouldSeeFAQAreaPaginationRightIcon() {
        elementHelper.findElement(FAQAreaPaginationRightIcon).isDisplayed();
    }

    public void shouldSeeFAQAreaPaginationText(String text) {
        elementHelper.checkElementWithText(FAQAreaPaginationText, text);
    }
}
