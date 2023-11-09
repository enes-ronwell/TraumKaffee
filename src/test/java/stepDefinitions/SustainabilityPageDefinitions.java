package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.SustainabilityPage;
import utils.DriverFactory;

public class SustainabilityPageDefinitions {
    SustainabilityPage SustainabilityPage = new SustainabilityPage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the Sustainability Page")
    public void userOnTheSustainabilityPage() {
        SustainabilityPage.userOnTheSustainabilityPage();
    }
    //WHEN's

    //THEN's
    @Then("should see the Sustainability Page")
    public void shouldSeeTheSustainabilityPage() {
        SustainabilityPage.shouldSeeTheSustainabilityPage();
    }

    @Then("should see Sustainability Area Title: {string} on Sustainability Page")
    public void shouldSeeSustainabilityAreaTitleOnSustainabilityPage(String title) {
        String text = SustainabilityPage.shouldSeeSustainabilityAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Sustainability Area Comment: {string} on Sustainability Page")
    public void shouldSeeSustainabilityAreaCommentOnSustainabilityPage(String comment) {
        String text = SustainabilityPage.shouldSeeSustainabilityAreaComment();
        Assert.assertEquals(text.replaceAll("\\s+", ""), comment.replaceAll("\\s+", ""));
    }

    @Then("should see Sustainability Area Commentor: {string} on Sustainability Page")
    public void shouldSeeSustainabilityAreaCommentorOnSustainabilityPage(String commentor) {
        String text = SustainabilityPage.shouldSeeSustainabilityAreaCommentor();
        Assert.assertEquals(text, commentor);
    }

    @Then("should see Sustainability Area Image on Sustainability Page")
    public void shouldSeeSustainabilityAreaImageOnSustainabilityPage() {
        SustainabilityPage.shouldSeeSustainabilityAreaImage();
    }

    @Then("should see Description Area Description: {string} on Sustainability Page")
    public void shouldSeeDescriptionAreaDescriptionOnSustainabilityPage(String desc) {
        String text = SustainabilityPage.shouldSeeDescriptionAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", "").replaceAll("\"",""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Description Area Left Image on Sustainability Page")
    public void shouldSeeDescriptionAreaLeftImageOnSustainabilityPage() {
        SustainabilityPage.shouldSeeDescriptionAreaLeftImage();
    }

    @Then("should see Description Area Right Image on Sustainability Page")
    public void shouldSeeDescriptionAreaRightImageImageOnSustainabilityPage() {
        SustainabilityPage.shouldSeeDescriptionAreaRightImageImage();
    }

    @Then("should see What We Do Area Title: {string} on Sustainability Page")
    public void shouldSeeWhatWeDoAreaTitleOnSustainabilityPage(String title) {
        String text = SustainabilityPage.shouldSeeWhatWeDoAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see What We Do Area Sub Title: {string} on Sustainability Page")
    public void shouldSeeWhatWeDoAreaSubTitleOnSustainabilityPage(String title) {
        String text = SustainabilityPage.shouldSeeWhatWeDoAreaSubTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see What We Do Area Description: {string} on Sustainability Page")
    public void shouldSeeWhatWeDoAreaDescriptionOnSustainabilityPage(String desc) {
        String text = SustainabilityPage.shouldSeeWhatWeDoAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see What We Do Area Slider on Sustainability Page")
    public void shouldSeeWhatWeDoAreaSliderOnSustainabilityPage() {
        SustainabilityPage.shouldSeeWhatWeDoAreaSlider();

    }

    @Then("should see Our Traum Area Title: {string} on Sustainability Page")
    public void shouldSeeOurTraumAreaTitleOnSustainabilityPage(String title) {
        String text = SustainabilityPage.shouldSeeOurTraumAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Our Traum Area Left Up Image on Sustainability Page")
    public void shouldSeeOurTraumAreaLeftUpImageOnSustainabilityPage() {
        SustainabilityPage.shouldSeeOurTraumAreaLeftUpImage();
    }

    @Then("should see Our Traum Area Left Up Title: {string} on Sustainability Page")
    public void shouldSeeOurTraumAreaLeftUpTitleOnSustainabilityPage(String title) {
        String text = SustainabilityPage.shouldSeeOurTraumAreaLeftUpTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Our Traum Area Left Up Description: {string} on Sustainability Page")
    public void shouldSeeOurTraumAreaLeftUpDescriptionOnSustainabilityPage(String desc) {
        String text = SustainabilityPage.shouldSeeOurTraumAreaLeftUpDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Our Traum Area Left Down Image on Sustainability Page")
    public void shouldSeeOurTraumAreaLeftDownImageOnSustainabilityPage() {
        SustainabilityPage.shouldSeeOurTraumAreaLeftDownImage();
    }

    @Then("should see Our Traum Area Left Down Title: {string} on Sustainability Page")
    public void shouldSeeOurTraumAreaLeftDownTitleOnSustainabilityPage(String title) {
        String text = SustainabilityPage.shouldSeeOurTraumAreaLeftDownTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Our Traum Area Left Down Description: {string} on Sustainability Page")
    public void shouldSeeOurTraumAreaLeftDownDescriptionOnSustainabilityPage(String desc) {
        String text = SustainabilityPage.shouldSeeOurTraumAreaLeftDownDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Our Traum Area Center Up Image on Sustainability Page")
    public void shouldSeeOurTraumAreaCenterUpImageOnSustainabilityPage() {
        SustainabilityPage.shouldSeeOurTraumAreaCenterUpImage();
    }

    @Then("should see Our Traum Area Center Up Title: {string} on Sustainability Page")
    public void shouldSeeOurTraumAreaCenterUpTitleOnSustainabilityPage(String title) {
        String text = SustainabilityPage.shouldSeeOurTraumAreaCenterUpTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Our Traum Area Center Up Description: {string} on Sustainability Page")
    public void shouldSeeOurTraumAreaCenterUpDescriptionOnSustainabilityPage(String desc) {
        String text = SustainabilityPage.shouldSeeOurTraumAreaCenterUpDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Our Traum Area Right Up Image on Sustainability Page")
    public void shouldSeeOurTraumAreaRightUpImageOnSustainabilityPage() {
        SustainabilityPage.shouldSeeOurTraumAreaRightUpImageOnSustainabilityPage();
    }

    @Then("should see Our Traum Area Right Up Title: {string} on Sustainability Page")
    public void shouldSeeOurTraumAreaRightUpTitleOnSustainabilityPage(String title) {
        String text = SustainabilityPage.shouldSeeOurTraumAreaRightUpTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Our Traum Area Right Up Description: {string} on Sustainability Page")
    public void shouldSeeOurTraumAreaRightUpDescriptionOnSustainabilityPage(String desc) {
        String text = SustainabilityPage.shouldSeeOurTraumAreaRightUpDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Our Traum Area Right Down Image on Sustainability Page")
    public void shouldSeeOurTraumAreaRightDownImageOnSustainabilityPage() {
        SustainabilityPage.shouldSeeOurTraumAreaRightDownImage();

    }

    @Then("should see Our Traum Area Right Down Title: {string} on Sustainability Page")
    public void shouldSeeOurTraumAreaRightDownTitleOnSustainabilityPage(String title) {
        String text = SustainabilityPage.shouldSeeOurTraumAreaRightDownTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Our Traum Area Right Down Description: {string} on Sustainability Page")
    public void shouldSeeOurTraumAreaRightDownDescriptionOnSustainabilityPage(String desc) {
        String text = SustainabilityPage.shouldSeeOurTraumAreaRightDownDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Traum Sustainability Value Area Title: {string} on Sustainability Page")
    public void shouldSeeTraumSustainabilityValueAreaTitleOnSustainabilityPage(String title) {
        String text = SustainabilityPage.shouldSeeTraumSustainabilityValueAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Traum Sustainability Value Area Description: {string} on Sustainability Page")
    public void shouldSeeTraumSustainabilityValueAreaDescriptionOnSustainabilityPage(String desc) {
        String text = SustainabilityPage.shouldSeeTraumSustainabilityValueAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Traum Sustainability Value Area Image on Sustainability Page")
    public void shouldSeeTraumSustainabilityValueAreaImageOnSustainabilityPage() {
        SustainabilityPage.shouldSeeTraumSustainabilityValueAreaImage();

    }
}
