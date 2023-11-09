package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AboutPage;
import pages.General;
import utils.DriverFactory;

public class AboutPageDefinitions {
    AboutPage AboutPage = new AboutPage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the About Page")
    public void userOnTheAboutPage() {
        AboutPage.userOnTheAboutPage();

    }

    //WHEN's
    @When("click Lets Grab A Coffee Area Contact Button on About Page")
    public void clickLetsGrabACoffeeAreaContactButtonOnAboutPage() {
        AboutPage.clickLetsGrabACoffeeAreaContactButton();
    }

    //THEN's
    @Then("should see the About Page")
    public void shouldSeeTheAboutPage() {
        AboutPage.shouldSeeTheAboutPage();
    }

    @Then("should see About Area Title: {string} on About Page")
    public void shouldSeeAboutAreaTitleOnAboutPage(String title) {
        String text = AboutPage.shouldSeeAboutAreaTitle();
        Assert.assertEquals(text.replaceAll("\\s+",""), title.replaceAll("\\s+",""));
    }

    @Then("should see About Area Description: {string} on About Page")
    public void shouldSeeAboutAreaDescriptionOnAboutPage(String desc) {
        String text = AboutPage.shouldSeeAboutAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""), desc.replaceAll("\\s+",""));
    }

    @Then("should see About Area Image on About Page")
    public void shouldSeeAboutAreaImageOnAboutPage() {
        AboutPage.shouldSeeAboutAreaImage();
    }

    @Then("should see How It All Began Area Title: {string} on About Page")
    public void shouldSeeHowItAllBeganAreaTitleOnAboutPage(String title) {
        String text = AboutPage.shouldSeeHowItAllBeganAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see How It All Began Area Description: {string} on About Page")
    public void shouldSeeHowItAllBeganAreaDescriptionOnAboutPage(String desc) {
        String text = AboutPage.shouldSeeHowItAllBeganAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""), desc.replaceAll("\\s+",""));
    }

    @Then("should see How It All Began Area Image on About Page")
    public void shouldSeeHowItAllBeganAreaImageOnAboutPage() {
        AboutPage.shouldSeeHowItAllBeganAreaImage();
    }

    @Then("should see Our Dream Area Title: {string} on About Page")
    public void shouldSeeOurDreamAreaTitleOnAboutPage(String title) {
        String text = AboutPage.shouldSeeOurDreamAreaTitle();
        Assert.assertEquals(text.replaceAll("\\s+",""), title.replaceAll("\\s+",""));
    }

    @Then("should see Our Dream Area Left Image on About Page")
    public void shouldSeeOurDreamAreaLeftImageOnAboutPage() {
        AboutPage.shouldSeeOurDreamAreaLeftImage();
    }

    @Then("should see Our Dream Area Right Image on About Page")
    public void shouldSeeOurDreamAreaRightImageOnAboutPage() {
        AboutPage.shouldSeeOurDreamAreaRightImage();
    }

    @Then("should see From Mountaintop Area Title: {string} on About Page")
    public void shouldSeeFromMountaintopAreaTitleOnAboutPage(String title) {
        String text = AboutPage.shouldSeeFromMountaintopAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see From Mountaintop Area Description: {string} on About Page")
    public void shouldSeeFromMountaintopAreaDescriptionOnAboutPage(String desc) {
        String text = AboutPage.shouldSeeFromMountaintopAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""), desc.replaceAll("\\s+",""));
    }

    @Then("should see From Mountaintop Area Image on About Page")
    public void shouldSeeFromMountaintopAreaImageOnAboutPage() {
        AboutPage.shouldSeeFromMountaintopAreaImage();
    }

    @Then("should see Lets Grab A Coffee Area Title: {string} on About Page")
    public void shouldSeeLetsGrabACoffeeAreaTitleOnAboutPage(String title) {
        String text = AboutPage.shouldSeeLetsGrabACoffeeAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Lets Grab A Coffee Area Contact Button: {string} on About Page")
    public void shouldSeeLetsGrabACoffeeAreaContactButtonOnAboutPage(String button) {
        String text = AboutPage.shouldSeeLetsGrabACoffeeAreaContactButton();
        Assert.assertEquals(text, button);
    }

    @Then("should see Lets Grab A Coffee Area Image on About Page")
    public void shouldSeeLetsGrabACoffeeAreaImageOnAboutPage() {
        AboutPage.shouldSeeLetsGrabACoffeeAreaImage();
    }
}
