package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.BrewDetailsPage;
import utils.DriverFactory;

public class BrewDetailsPageDefinitions {
    BrewDetailsPage BrewDetailsPage = new BrewDetailsPage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the Brew Details Page")
    public void userOnTheBrewDetailsPage() {
        BrewDetailsPage.userOnTheBrewDetailsPage();
    }

    //WHEN's
    @When("click Share Area Facebook Icon on Brew Details Page")
    public void clickShareAreaFacebookIconOnBrewDetailsPage() {
        BrewDetailsPage.clickShareAreaFacebookIcon();
    }

    @When("click Share Area Twitter Icon on Brew Details Page")
    public void clickShareAreaTwitterIconOnBrewDetailsPage() {
        BrewDetailsPage.clickShareAreaTwitterIcon();
    }

    @When("click Share Area Instagram Icon on Brew Details Page")
    public void clickShareAreaInstagramIconOnBrewDetailsPage() {
        BrewDetailsPage.clickShareAreaInstagramkIcon();
    }

    @When("click Share Area Tiktok Icon on Brew Details Page")
    public void clickShareAreaTiktokIconOnBrewDetailsPage() {
        BrewDetailsPage.clickShareAreaTiktokIcon();
    }

    @When("click Brew Your Dream Area Shop Our Coffee Button on Brew Details Page")
    public void clickBrewYourDreamAreaShopOurCoffeeButtonOnBrewDetailsPage() {
        BrewDetailsPage.clickBrewYourDreamShopOurCoffeeButton();
    }

    //THEN's
    @Then("should see the Brew Details Page")
    public void shouldSeeTheBrewDetailsPage() {
        BrewDetailsPage.shouldSeeTheBrewDetailsPage();
    }

    @Then("should see Brew Details Area Title: {string} on Brew Details Page")
    public void shouldSeeBrewDetailsAreaTitleOnBrewDetailsPage(String text) {
        String expected = BrewDetailsPage.shouldSeeBrewDetailsAreaTitle();
        Assert.assertEquals(expected, text);
    }

    @Then("should see Brew Details Area Description: {string} on Brew Details Page")
    public void shouldSeeBrewDetailsAreaDescriptionOnBrewDetailsPage(String text) {
        String expected = BrewDetailsPage.shouldSeeBrewDetailsAreaDescription();
        Assert.assertEquals(expected, text);
    }

    @Then("should see Brew Details Area Image on Brew Details Page")
    public void shouldSeeBrewDetailsAreaImageOnBrewDetailsPage() {
        BrewDetailsPage.shouldSeeBrewDetailsAreaImage();
    }

    @Then("should see Makings Area Minute Image on Brew Details Page")
    public void shouldSeeMakingsAreaMinuteImageOnBrewDetailsPage() {
        BrewDetailsPage.shouldSeeMakingsAreaMinuteImage();
    }

    @Then("should see Makings Area Minute: {string} on Brew Details Page")
    public void shouldSeeMakingsAreaMinuteOnBrewDetailsPage(String text) {
        String expected = BrewDetailsPage.shouldSeeMakingsAreaMinute();
        Assert.assertEquals(expected, text);
    }

    @Then("should see Makings Area Sea Salt Image on Brew Details Page")
    public void shouldSeeMakingsAreaSeaSaltImageOnBrewDetailsPage() {
        BrewDetailsPage.shouldSeeMakingsAreaSeaSaltImage();
    }

    @Then("should see Makings Area Sea Salt: {string} on Brew Details Page")
    public void shouldSeeMakingsAreaSeaSaltOnBrewDetailsPage(String text) {
        String expected = BrewDetailsPage.shouldSeeMakingsAreaSeaSalt();
        Assert.assertEquals(expected, text);
    }

    @Then("should see Makings Area Coffee Image on Brew Details Page")
    public void shouldSeeMakingsAreaCoffeeImageOnBrewDetailsPage() {
        BrewDetailsPage.shouldSeeMakingsAreaCoffeeImage();
    }

    @Then("should see Makings Area Coffee: {string} on Brew Details Page")
    public void shouldSeeMakingsAreaCoffeeOnBrewDetailsPage(String text) {
        String expected = BrewDetailsPage.shouldSeeMakingsAreaCoffee();
        Assert.assertEquals(expected, text);
    }

    @Then("should see Makings Area Tempreture Image on Brew Details Page")
    public void shouldSeeMakingsAreaTempretureImageOnBrewDetailsPage() {
        BrewDetailsPage.shouldSeeMakingsAreaTempretureImage();
    }

    @Then("should see Makings Area Tempreture: {string} on Brew Details Page")
    public void shouldSeeMakingsAreaTempretureOnBrewDetailsPage(String text) {
        String expected = BrewDetailsPage.shouldSeeMakingsAreaTempreture();
        Assert.assertEquals(expected, text);
    }

    @Then("should see What You Will Need Area Title: {string} on Brew Details Page")
    public void shouldSeeWhatYouWillNeedAreaTitleOnBrewDetailsPage(String text) {
        String expected = BrewDetailsPage.shouldSeeWhatYouWillNeedAreaTitle();
        Assert.assertEquals(expected, text);
    }

    @Then("should see What You Will Need Area Option: {string} on Brew Details Page")
    public void shouldSeeWhatYouWillNeedAreaOptionOnBrewDetailsPage(String text) {
        BrewDetailsPage.shouldSeeWhatYouWillNeedAreaOption(text);
    }

    @Then("should see Share Area Title: {string} on Brew Details Page")
    public void shouldSeeShareAreaTitleOnBrewDetailsPage(String text) {
        String expected = BrewDetailsPage.shouldSeeShareAreaTitle();
        Assert.assertEquals(expected, text);
    }

    @Then("should see Share Area Facebook Icon on Brew Details Page")
    public void shouldSeeShareAreaFacebookIconOnBrewDetailsPage() {
        BrewDetailsPage.shouldSeeShareAreaFacebookIcon();
    }

    @Then("should see Share Area Twitter Icon on Brew Details Page")
    public void shouldSeeShareAreaTwitterIconOnBrewDetailsPage() {
        BrewDetailsPage.shouldSeeShareAreaTwitterIcon();
    }

    @Then("should see Share Area Instagram Icon on Brew Details Page")
    public void shouldSeeShareAreaInstagramIconOnBrewDetailsPage() {
        BrewDetailsPage.shouldSeeShareAreaInstagramIcon();
    }

    @Then("should see Share Area Tiktok Icon on Brew Details Page")
    public void shouldSeeShareAreaTiktokIconOnBrewDetailsPage() {
        BrewDetailsPage.shouldSeeShareAreaTiktokIcon();
    }

    @Then("should see Background Area Title: {string} on Brew Details Page")
    public void shouldSeeBackgroundAreaTitleOnBrewDetailsPage(String text) {
        String expected = BrewDetailsPage.shouldSeeBackgroundAreaTitle();
        Assert.assertEquals(expected, text);
    }

    @Then("should see Background Area Description: {string} on Brew Details Page")
    public void shouldSeeBackgroundAreaDescriptionOnBrewDetailsPage(String text) {
        String expected = BrewDetailsPage.shouldSeeBackgroundAreaDescription();
        Assert.assertEquals(expected, text);
    }

    @Then("should see Background Area Left Image on Brew Details Page")
    public void shouldSeeBackgroundAreaLeftImageOnBrewDetailsPage() {
        BrewDetailsPage.shouldSeeBackgroundAreaLeftImage();
    }

    @Then("should see Background Area Right Image on Brew Details Page")
    public void shouldSeeBackgroundAreaRightImageOnBrewDetailsPage() {
        BrewDetailsPage.shouldSeeBackgroundAreaRightImage();
    }

    @Then("should see Brew Your Dream Area Title: {string} on Brew Details Page")
    public void shouldSeeBrewYourDreamAreaTitleOnBrewDetailsPage(String text) {
        String expected = BrewDetailsPage.shouldSeeBrewYourDreamAreaTitle();
        Assert.assertEquals(expected, text);
    }

    @Then("should see Brew Your Dream Area Shop Our Coffee Button: {string} on Brew Details Page")
    public void shouldSeeBrewYourDreamAreaShopOurCoffeeButtonOnBrewDetailsPage(String text) {
        String expected = BrewDetailsPage.shouldSeeBrewYourDreamAreaShopOurCoffeeButton();
        Assert.assertEquals(expected, text);
    }

    @Then("should see Brew Your Dream Area Image on Brew Details Page")
    public void shouldSeeBrewYourDreamAreaImageOnBrewDetailsPage() {
        BrewDetailsPage.shouldSeeBrewYourDreamAreaImage();
    }

    @Then("should see Chemax the Brew Details Page")
    public void shouldSeeChemaxTheBrewDetailsPage() {
        BrewDetailsPage.shouldSeeChemaxTheBrewDetailsPage();
    }

    @Then("should see French the Brew Details Page")
    public void shouldSeeFrenchTheBrewDetailsPage() {
        BrewDetailsPage.shouldSeeFrenchTheBrewDetailsPage();
    }

    @Then("should see Espresso the Brew Details Page")
    public void shouldSeeEspressoTheBrewDetailsPage() {
        BrewDetailsPage.shouldSeeEspressoTheBrewDetailsPage();
    }

    @Then("should see Siphon the Brew Details Page")
    public void shouldSeeSiphonTheBrewDetailsPage() {
        BrewDetailsPage.shouldSeeSiphonTheBrewDetailsPage();
    }

    @Then("should see Aeropress the Brew Details Page")
    public void shouldSeeAeropressTheBrewDetailsPage() {
        BrewDetailsPage.shouldSeeAeropressTheBrewDetailsPage();
    }

    @Then("should see Hario V60 the Brew Details Page")
    public void shouldSeeHarioVTheBrewDetailsPage() {
        BrewDetailsPage.shouldSeeHarioVTheBrewDetailsPage();
    }

}
