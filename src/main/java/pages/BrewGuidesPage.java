package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class BrewGuidesPage {
    private ElementHelper elementHelper;

    public BrewGuidesPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private By Title = By.cssSelector(".flex.justify-center.items-center.mb-4 >h2");
    private By ChemaxTitle = By.cssSelector(".grid-cols-1>div:nth-child(1)>div>h4>button");
    private By ChemaxStartGuide = By.cssSelector(".grid-cols-1>div:nth-child(1)>div>button");
    private By ChemaxImage = By.cssSelector(".grid-cols-1>div:nth-child(1)");
    private By FrenchPressTitle = By.cssSelector(".grid-cols-1>div:nth-child(2)>div>h4>button");
    private By FrenchPressStartGuide = By.cssSelector(".grid-cols-1>div:nth-child(2)>div>button");
    private By FrenchPressImage = By.cssSelector(".grid-cols-1>div:nth-child(2)");
    private By EspressoTitle = By.cssSelector(".grid-cols-1>div:nth-child(3)>div>h4>button");
    private By EspressoStartGuide = By.cssSelector(".grid-cols-1>div:nth-child(3)>div>button");
    private By EspressoImage = By.cssSelector(".grid-cols-1>div:nth-child(3)");
    private By SeeSiphonTitle = By.cssSelector(".grid-cols-1>div:nth-child(4)>div>h4>button");
    private By SiphonStartGuide = By.cssSelector(".grid-cols-1>div:nth-child(4)>div>button");
    private By SiphonImage = By.cssSelector(".grid-cols-1>div:nth-child(4)");
    private By AeropressTitle = By.cssSelector(".grid-cols-1>div:nth-child(5)>div>h4>button");
    private By AeropressStartGuide = By.cssSelector(".grid-cols-1>div:nth-child(5)>div>button");
    private By AeropressImage = By.cssSelector(".grid-cols-1>div:nth-child(5)");
    private By HarioVTitle = By.cssSelector(".grid-cols-1>div:nth-child(6)>div>h4>button");
    private By HarioVStartGuide = By.cssSelector(".grid-cols-1>div:nth-child(6)>div>button");
    private By HarioVImage = By.cssSelector(".grid-cols-1>div:nth-child(6)");
    private String url = "https://dev.traumkaffee.com/brew-guides";

    public void userOnTheBrewGuidesPage() {
        elementHelper.openUrl(url);
    }

    public void clickChemax() {
        elementHelper.click(ChemaxStartGuide);
    }

    public void clickFrench() {
        elementHelper.click(FrenchPressStartGuide);
    }

    public void clickEspresso() {
        elementHelper.click(EspressoStartGuide);
    }

    public void clickSiphon() {
        elementHelper.click(SiphonStartGuide);
    }

    public void clickAeropress() {
        elementHelper.click(AeropressStartGuide);
    }

    public void clickHarioV() {
        elementHelper.click(HarioVStartGuide);
    }

    public void shouldSeeTheBrewGuidesPage() {
        elementHelper.checkUrl("https://dev.traumkaffee.com/brew-guides");
    }

    public String shouldSeeTitle() {
        return elementHelper.getText(Title);
    }

    public String shouldSeeChemaxTitle() {
        return elementHelper.getText(ChemaxTitle);
    }

    public String shouldSeeChemaxStartGuide() {
        return elementHelper.getText(ChemaxStartGuide);
    }

    public void shouldSeeChemaxImage() {
        elementHelper.findElement(ChemaxImage).isDisplayed();
    }

    public String shouldSeeFrenchPressTitle() {
        return elementHelper.getText(FrenchPressTitle);
    }

    public String shouldSeeFrenchPressStartGuide() {
        return elementHelper.getText(FrenchPressStartGuide);
    }

    public void shouldSeeFrenchPressImage() {
        elementHelper.findElement(FrenchPressImage).isDisplayed();
    }

    public String shouldSeeEspressoTitle() {
        return elementHelper.getText(EspressoTitle);
    }

    public String shouldSeeEspressoStartGuide() {
        return elementHelper.getText(EspressoStartGuide);
    }

    public void shouldSeeEspressoImage() {
        elementHelper.findElement(EspressoImage).isDisplayed();
    }

    public String shouldSeeSiphonTitle() {
        return elementHelper.getText(SeeSiphonTitle);
    }

    public String shouldSeeSiphonStartGuide() {
        return elementHelper.getText(SiphonStartGuide);
    }

    public void shouldSeeSiphonImage() {
        elementHelper.findElement(SiphonImage).isDisplayed();
    }

    public String shouldSeeAeropressTitle() {
        return elementHelper.getText(AeropressTitle);
    }

    public String shouldSeeAeropressStartGuide() {
        return elementHelper.getText(AeropressStartGuide);
    }

    public void shouldSeeAeropressImage() {
        elementHelper.findElement(AeropressImage).isDisplayed();
    }

    public String shouldSeeHarioVTitle() {
        return elementHelper.getText(HarioVTitle);
    }

    public String shouldSeeHarioVStartGuide() {
        return elementHelper.getText(HarioVStartGuide);
    }

    public void shouldSeeHarioVImage() {
        elementHelper.findElement(HarioVImage).isDisplayed();
    }
}

