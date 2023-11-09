package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BrewGuidesPage;
import utils.DriverFactory;

public class BrewGuidesPageDefinitions {
    BrewGuidesPage BrewGuidesPage = new BrewGuidesPage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the Brew Guides Page")
    public void userOnTheBrewGuidesPage() {
        BrewGuidesPage.userOnTheBrewGuidesPage();
    }

    //WHEN's
    @When("click Chemax on Brew Guides Page")
    public void clickChemaxOnBrewGuidesPage() {
        BrewGuidesPage.clickChemax();
    }

    @When("click French on Brew Guides Page")
    public void clickFrenchOnBrewGuidesPage() {
        BrewGuidesPage.clickFrench();
    }

    @When("click Espresso on Brew Guides Page")
    public void clickEspressoOnBrewGuidesPage() {
        BrewGuidesPage.clickEspresso();
    }

    @When("click Siphon on Brew Guides Page")
    public void clickSiphonOnBrewGuidesPage() {
        BrewGuidesPage.clickSiphon();
    }

    @When("click Aeropress on Brew Guides Page")
    public void clickAeropressOnBrewGuidesPage() {
        BrewGuidesPage.clickAeropress();
    }

    @When("click Hario V60 on Brew Guides Page")
    public void clickHarioVOnBrewGuidesPage() {
        BrewGuidesPage.clickHarioV();
    }

    //THEN's
    @Then("should see the Brew Guides Page")
    public void shouldSeeTheBrewGuidesPage() {
        BrewGuidesPage.shouldSeeTheBrewGuidesPage();
    }

    @Then("should see Title: {string} on Brew Guides Page")
    public void shouldSeeTitleOnBrewGuidesPage(String title) {
        String text = BrewGuidesPage.shouldSeeTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Chemax Title: {string} on Brew Guides Page")
    public void shouldSeeChemaxTitleOnBrewGuidesPage(String title) {
        String text = BrewGuidesPage.shouldSeeChemaxTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Chemax Start Guide: {string} on Brew Guides Page")
    public void shouldSeeChemaxStartGuideOnBrewGuidesPage(String guide) {
        String text = BrewGuidesPage.shouldSeeChemaxStartGuide();
        Assert.assertEquals(text,guide);
    }

    @Then("should see Chemax Image on Brew Guides Page")
    public void shouldSeeChemaxImageOnBrewGuidesPage() {
        BrewGuidesPage.shouldSeeChemaxImage();
    }

    @Then("should see French Press Title: {string} on Brew Guides Page")
    public void shouldSeeFrenchPressTitleOnBrewGuidesPage(String title) {
        String text = BrewGuidesPage.shouldSeeFrenchPressTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see French Press Start Guide: {string} on Brew Guides Page")
    public void shouldSeeFrenchPressStartGuideOnBrewGuidesPage(String guide) {
        String text = BrewGuidesPage.shouldSeeFrenchPressStartGuide();
        Assert.assertEquals(text,guide);
    }

    @Then("should see French Press Image on Brew Guides Page")
    public void shouldSeeFrenchPressImageOnBrewGuidesPage() {
        BrewGuidesPage.shouldSeeFrenchPressImage();
    }

    @Then("should see Espresso Title: {string} on Brew Guides Page")
    public void shouldSeeEspressoTitleOnBrewGuidesPage(String title) {
        String text = BrewGuidesPage.shouldSeeEspressoTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Espresso Start Guide: {string} on Brew Guides Page")
    public void shouldSeeEspressoStartGuideOnBrewGuidesPage(String guide) {
        String text = BrewGuidesPage.shouldSeeEspressoStartGuide();
        Assert.assertEquals(text,guide);
    }

    @Then("should see Espresso Image on Brew Guides Page")
    public void shouldSeeEspressoImageOnBrewGuidesPage() {
        BrewGuidesPage.shouldSeeEspressoImage();

    }

    @Then("should see Siphon Title: {string} on Brew Guides Page")
    public void shouldSeeSiphonTitleOnBrewGuidesPage(String title) {
        String text = BrewGuidesPage.shouldSeeSiphonTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Siphon Start Guide: {string} on Brew Guides Page")
    public void shouldSeeSiphonStartGuideOnBrewGuidesPage(String guide) {
        String text = BrewGuidesPage.shouldSeeSiphonStartGuide();
        Assert.assertEquals(text,guide);
    }

    @Then("should see Siphon Image on Brew Guides Page")
    public void shouldSeeSiphonImageOnBrewGuidesPage() {
        BrewGuidesPage.shouldSeeSiphonImage();
    }

    @Then("should see Aeropress Title: {string} on Brew Guides Page")
    public void shouldSeeAeropressTitleOnBrewGuidesPage(String title) {
        String text = BrewGuidesPage.shouldSeeAeropressTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Aeropress Start Guide: {string} on Brew Guides Page")
    public void shouldSeeAeropressStartGuideOnBrewGuidesPage(String guide) {
        String text = BrewGuidesPage.shouldSeeAeropressStartGuide();
        Assert.assertEquals(text,guide);

    }

    @Then("should see Aeropress Image on Brew Guides Page")
    public void shouldSeeAeropressImageOnBrewGuidesPage() {
        BrewGuidesPage.shouldSeeAeropressImage();
    }

    @Then("should see Hario V60 Title: {string} on Brew Guides Page")
    public void shouldSeeHarioVTitleOnBrewGuidesPage(String title) {
        String text = BrewGuidesPage.shouldSeeHarioVTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Hario V60 Start Guide: {string} on Brew Guides Page")
    public void shouldSeeHarioVStartGuideOnBrewGuidesPage(String guide) {
        String text = BrewGuidesPage.shouldSeeHarioVStartGuide();
        Assert.assertEquals(text,guide);
    }

    @Then("should see Hario V60 Image on Brew Guides Page")
    public void shouldSeeHarioVImageOnBrewGuidesPage() {
        BrewGuidesPage.shouldSeeHarioVImage();
    }
}
