package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.WhosalePage;
import utils.DriverFactory;

public class WhosalePageDefinitions {

    WhosalePage WhosalePage = new WhosalePage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the Whosale Page")
    public void userOnTheWhosalePage() {
        WhosalePage.userOnTheWhosalePage();

    }

    //WHEN's
    @When("sendkeys Lets Grab a Coffee Area Full Name: {string} on Whosale Page")
    public void sendkeysLetsGrabACoffeeAreaFullNameOnWhosalePage(String name) {
        WhosalePage.sendKeystoLetsGrabACoffeeAreaFullName(name);
    }

    @When("click Lets Grab a Coffee Area Type of Busines on Whosale Page")
    public void clickLetsGrabACoffeeAreaTypeOfBusinesOnWhosalePage() {
        WhosalePage.clickLetsGrabACoffeeAreaTypeOfBusines();
    }

    @When("sendkeys Lets Grab a Coffee Area Mail: {string} on Whosale Page")
    public void sendkeysLetsGrabACoffeeAreaMailOnWhosalePage(String mail) {
        WhosalePage.sendkeysLetsGrabACoffeeAreaMail(mail);
    }

    @When("sendkeys Lets Grab a Coffee Area Contact Number: {string} on Whosale Page")
    public void sendkeysLetsGrabACoffeeAreaContactNumberOnWhosalePage(String contact) {
        WhosalePage.sendkeysLetsGrabACoffeeAreaContactNumber(contact);

    }

    @When("sendkeys Lets Grab a Coffee Area Business Name: {string} on Whosale Page")
    public void sendkeysLetsGrabACoffeeAreaBusinessNameOnWhosalePage(String business) {
        WhosalePage.sendkeysLetsGrabACoffeeAreaBusinessName(business);

    }

    @When("select Lets Grab a Coffee Area Type of Business: {string} on Whosale Page")
    public void selectLetsGrabACoffeeAreaTypeOfBusinessOnWhosalePage(String type) {
        WhosalePage.selectLetsGrabACoffeeAreaTypeOfBusiness(type);
    }

    @When("sendkeys Lets Grab a Coffee Area Tell us: {string} on Whosale Page")
    public void sendkeysLetsGrabACoffeeAreaTellUsOnWhosalePage(String tellUs) {
        WhosalePage.sendkeysLetsGrabACoffeeAreaTellUs(tellUs);
    }

    @When("click Lets Grab a Coffee Area Send Button on Whosale Page")
    public void clickLetsGrabACoffeeAreaSendButtonOnWhosalePage() {
        WhosalePage.clickLetsGrabACoffeeAreaSendButton();

    }

    @When("click Discover Area Cafes and Coffee Shops Discover Button on Whosale Page")
    public void clickDiscoverAreaCafesAndCoffeeShopsDiscoverButtonOnWhosalePage() {
        WhosalePage.clickDiscoverAreaCafesAndCoffeeShopsDiscoverButton();

    }

    @When("click Discover Area Hotels Discover Button on Whosale Page")
    public void clickDiscoverAreaHotelsDiscoverButtonOnWhosalePage() {

        WhosalePage.clickDiscoverAreaHotelsDiscoverButton();
    }

    @When("click Discover Area Restaurants Discover Button on Whosale Page")
    public void clickDiscoverAreaRestaurantsDiscoverButtonOnWhosalePage() {
        WhosalePage.clickDiscoverAreaRestaurantsDiscoverButton();

    }

    @When("click Discover Area Offices Discover Button on Whosale Page")
    public void clickDiscoverAreaOfficesDiscoverButtonOnWhosalePage() {
        WhosalePage.clickDiscoverAreaOfficesDiscoverButton();

    }

    @When("click Discover Area Training Discover Button on Whosale Page")
    public void clickDiscoverAreaTrainingDiscoverButtonOnWhosalePage() {
        WhosalePage.clickDiscoverAreaTrainingDiscoverButton();
    }

    @When("click Discover Area Equipment Discover Button on Whosale Page")
    public void clickDiscoverAreaEquipmentDiscoverButtonOnWhosalePage() {
        WhosalePage.clickDiscoverAreaEquipmentDiscoverButton();
    }

    @When("click Partnership Perks Area Equipment Button on Whosale Page")
    public void clickPartnershipPerksAreaEquipmentButtonOnWhosalePage() {
        WhosalePage.clickPartnershipPerksAreaEquipmentButton();
    }

    @When("click Partnership Perks Area Training Button on Whosale Page")
    public void clickPartnershipPerksAreaTrainingButtonOnWhosalePage() {
        WhosalePage.clickPartnershipPerksAreaTrainingButton();
    }

    //THEN's
    @Then("should see the Whosale Page")
    public void shouldSeeTheWhosalePageOnWhosalePage() {
         WhosalePage.shouldSeeTheWhosalePage();
    }

    @Then("should see Whosale Area Title: {string} on Whosale Page")
    public void shouldSeeWhosaleAreaTitleOnWhosalePage(String title) {
        String text = WhosalePage.shouldSeeWhosaleAreaTitle();
        Assert.assertEquals(text, title);

    }

    @Then("should see Whosale Area Description: {string} on Whosale Page")
    public void shouldSeeWhosaleAreaDescriptionOnWhosalePage(String desc) {
        String text = WhosalePage.shouldSeeWhosaleAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Whosale Area Image on Whosale Page")
    public void shouldSeeWhosaleAreaImageOnWhosalePage() {

        WhosalePage.shouldSeeWhosaleAreaImage();
    }

    @Then("should see Lets Grab a Coffee Area Title: {string} on Whosale Page")
    public void shouldSeeLetsGrabACoffeeAreaTitleOnWhosalePage(String title) {
        String text = WhosalePage.shouldSeeLetsGrabACoffeeAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Lets Grab a Coffee Area Description: {string} on Whosale Page")
    public void shouldSeeLetsGrabACoffeeAreaDescriptionOnWhosalePage(String desc) {
        String text = WhosalePage.shouldSeeLetsGrabACoffeeAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Lets Grab a Coffee Area Full Name: {string} on Whosale Page")
    public void shouldSeeLetsGrabACoffeeAreaFullNameOnWhosalePage(String name) {
        String text = WhosalePage.shouldSeeLetsGrabACoffeeAreaFullName();
        Assert.assertEquals(text, name);

    }

    @Then("should see Lets Grab a Coffee Area Email: {string} on Whosale Page")
    public void shouldSeeLetsGrabACoffeeAreaEmailOnWhosalePage(String name) {
        String text = WhosalePage.shouldSeeLetsGrabACoffeeAreaEmail();
        Assert.assertEquals(text, name);
    }

    @Then("should see Lets Grab a Coffee Area Contact Number: {string} on Whosale Page")
    public void shouldSeeLetsGrabACoffeeAreaContactNumberOnWhosalePage(String number) {
        String text = WhosalePage.shouldSeeLetsGrabACoffeeAreaContactNumber();
        Assert.assertEquals(text, number);
    }

    @Then("should see Lets Grab a Coffee Area Business Name: {string} on Whosale Page")
    public void shouldSeeLetsGrabACoffeeAreaBusinessNameOnWhosalePage(String business) {
        String text = WhosalePage.shouldSeeLetsGrabACoffeeAreaBusinessName();
        Assert.assertEquals(text, business);
    }

    @Then("should see Lets Grab a Coffee Area Type of Business: {string} on Whosale Page")
    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOnWhosalePage(String type) {
        String text = WhosalePage.shouldSeeLetsGrabACoffeeAreaTypeOfBusiness();
        Assert.assertEquals(text, type);
    }

    @Then("should see Lets Grab a Coffee Area Type of Business Option: {string} on Whosale Page")
    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOptionOnWhosalePage(String option) {
         WhosalePage.shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOption(option);
    }

    @Then("should see Lets Grab a Coffee Area Tell us: {string} on Whosale Page")
    public void shouldSeeLetsGrabACoffeeAreaTellUsOnWhosalePage(String tellUs) {
        String text = WhosalePage.shouldSeeLetsGrabACoffeeAreaTellUs();
        Assert.assertEquals(text, tellUs);
    }

    @Then("should see Lets Grab a Coffee Area Send Button: {string} on Whosale Page")
    public void shouldSeeLetsGrabACoffeeAreaSendButtonOnWhosalePage(String button) {
        String text = WhosalePage.shouldSeeLetsGrabACoffeeAreaSendButton();
        Assert.assertEquals(text, button);
    }

    @Then("should see Lets Grab a Coffee Area False Email Message: {string} on Whosale Page")
    public void shouldSeeLetsGrabACoffeeAreaFalseEmailMessageOnWhosalePage(String message) {
        String text = WhosalePage.shouldSeeLetsGrabACoffeeAreaFalseEmailMessage();
        Assert.assertEquals(text, message);
    }

    @Then("should see Description Area Title: {string} on Whosale Page")
    public void shouldSeeDescriptionAreaTitleOnWhosalePage(String title) {
        String text = WhosalePage.shouldSeeDescriptionAreaTitle();
        Assert.assertEquals(text.replaceAll("\\s+", ""), title.replaceAll("\\s+", ""));

    }

    @Then("should see Description Area Description: {string} on Whosale Page")
    public void shouldSeeDescriptionAreaDescriptionOnWhosalePage(String desc) {
        String text = WhosalePage.shouldSeeDescriptionAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Discover Area Cafes and Coffee Shops Name: {string} on Whosale Page")
    public void shouldSeeDiscoverAreaCafesAndCoffeeShopsNameOnWhosalePage(String name) {
        String text = WhosalePage.shouldSeeDiscoverAreaCafesAndCoffeeShopsName();
        Assert.assertEquals(text, name);
    }

    @Then("should see Discover Area Cafes and Coffee Shops Image on Whosale Page")
    public void shouldSeeDiscoverAreaCafesAndCoffeeShopsImageOnWhosalePage() {
        WhosalePage.shouldSeeDiscoverAreaCafesAndCoffeeShopsImage();

    }

    @Then("should see Discover Area Cafes and Coffee Shops Discover Button: {string} on Whosale Page")
    public void shouldSeeDiscoverAreaCafesAndCoffeeShopsDiscoverButtonOnWhosalePage(String button) {
        String text = WhosalePage.shouldSeeDiscoverAreaCafesAndCoffeeShopsDiscoverButton();
        Assert.assertEquals(text, button);
    }

    @Then("should see Discover Area Hotel Name: {string} on Whosale Page")
    public void shouldSeeDiscoverAreaHotelNameOnWhosalePage(String name) {
        String text = WhosalePage.shouldSeeDiscoverAreaHotelName();
        Assert.assertEquals(text, name);
    }

    @Then("should see Discover Area Hotel Image on Whosale Page")
    public void shouldSeeDiscoverAreaHotelImageOnWhosalePage() {
        WhosalePage.shouldSeeDiscoverAreaHotelImage();
    }

    @Then("should see Discover Area Hotel Discover Button: {string} on Whosale Page")
    public void shouldSeeDiscoverAreaHotelDiscoverButtonOnWhosalePage(String button) {
        String text = WhosalePage.shouldSeeDiscoverAreaHotelDiscoverButton();
        Assert.assertEquals(text, button);

    }

    @Then("should see Discover Area Restaurant Name: {string} on Whosale Page")
    public void shouldSeeDiscoverAreaRestaurantNameOnWhosalePage(String name) {
        String text = WhosalePage.shouldSeeDiscoverAreaRestaurantName();
        Assert.assertEquals(text, name);
    }

    @Then("should see Discover Area Restaurant Image on Whosale Page")
    public void shouldSeeDiscoverAreaRestaurantImageOnWhosalePage() {
        WhosalePage.shouldSeeDiscoverAreaRestaurantImage();
    }

    @Then("should see Discover Area Restaurant Discover Button: {string} on Whosale Page")
    public void shouldSeeDiscoverAreaRestaurantDiscoverButtonOnWhosalePage(String button) {
        String text = WhosalePage.shouldSeeDiscoverAreaRestaurantDiscoverButton();
        Assert.assertEquals(text, button);
    }

    @Then("should see Discover Area Offices Name: {string} on Whosale Page")
    public void shouldSeeDiscoverAreaOfficesNameOnWhosalePage(String name) {
        String text = WhosalePage.shouldSeeDiscoverAreaOfficesName();
        Assert.assertEquals(text, name);
    }

    @Then("should see Discover Area Offices Image on Whosale Page")
    public void shouldSeeDiscoverAreaOfficesImageOnWhosalePage() {
        WhosalePage.shouldSeeDiscoverAreaOfficesImage();
    }

    @Then("should see Discover Area Offices Discover Button: {string} on Whosale Page")
    public void shouldSeeDiscoverAreaOfficesDiscoverButtonOnWhosalePage(String button) {
        String text = WhosalePage.shouldSeeDiscoverAreaOfficesDiscoverButton();
        Assert.assertEquals(text, button);
    }

    @Then("should see Discover Area Training Name: {string} on Whosale Page")
    public void shouldSeeDiscoverAreaTrainingNameOnWhosalePage(String name) {
        String text = WhosalePage.shouldSeeDiscoverAreaTrainingName();
        Assert.assertEquals(text, name);
    }

    @Then("should see Discover Area Training Image on Whosale Page")
    public void shouldSeeDiscoverAreaTrainingImageOnWhosalePage() {
        WhosalePage.shouldSeeDiscoverAreaTrainingImage();
    }

    @Then("should see Discover Area Training Discover Button: {string} on Whosale Page")
    public void shouldSeeDiscoverAreaTrainingDiscoverButtonOnWhosalePage(String button) {
        String text = WhosalePage.shouldSeeDiscoverAreaTrainingDiscoverButton();
        Assert.assertEquals(text, button);
    }

    @Then("should see Discover Area Equipment Name: {string} on Whosale Page")
    public void shouldSeeDiscoverAreaEquipmentNameOnWhosalePage(String name) {
        String text = WhosalePage.shouldSeeDiscoverAreaEquipmentName();
        Assert.assertEquals(text, name);
    }

    @Then("should see Discover Area Equipment Image on Whosale Page")
    public void shouldSeeDiscoverAreaEquipmentImageOnWhosalePage() {
        WhosalePage.shouldSeeDiscoverAreaEquipmentImage();
    }

    @Then("should see Discover Area Equipment Discover Button: {string} on Whosale Page")
    public void shouldSeeDiscoverAreaEquipmentDiscoverButtonOnWhosalePage(String button) {
        String text = WhosalePage.shouldSeeDiscoverAreaEquipmentDiscoverButton();
        Assert.assertEquals(text, button);
    }

    @Then("should see Why Partner Area Title: {string} on Whosale Page")
    public void shouldSeeWhyPartnerAreaTitleOnWhosalePage(String title) {
        String text = WhosalePage.shouldSeeWhyPartnerAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Why Partner Area Description: {string} on Whosale Page")
    public void shouldSeeWhyPartnerAreaDescriptionOnWhosalePage(String desc) {
        String text = WhosalePage.shouldSeeWhyPartnerAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Why Partner Area Image on Whosale Page")
    public void shouldSeeWhyPartnerAreaImageOnWhosalePage() {
        WhosalePage.shouldSeeWhyPartnerAreaImage();
    }

    @Then("should see Partnership Perks Area Title: {string} on Whosale Page")
    public void shouldSeePartnershipPerksAreaTitleOnWhosalePage(String title) {
        String text = WhosalePage.shouldSeePartnershipPerksAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Partnership Perks Area Description: {string} on Whosale Page")
    public void shouldSeePartnershipPerksAreaDescriptionOnWhosalePage(String desc) {
        String text = WhosalePage.shouldSeePartnershipPerksAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Partnership Perks Area Equipment Title: {string} on Whosale Page")
    public void shouldSeePartnershipPerksAreaEquipmentTitleOnWhosalePage(String title) {
        String text = WhosalePage.shouldSeePartnershipPerksAreaEquipmentTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Partnership Perks Area Equipment Description: {string} on Whosale Page")
    public void shouldSeePartnershipPerksAreaEquipmentDescriptionOnWhosalePage(String desc) {
        String text = WhosalePage.shouldSeePartnershipPerksAreaEquipmentDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Partnership Perks Area Equipment Image on Whosale Page")
    public void shouldSeePartnershipPerksAreaEquipmentImageOnWhosalePage() {
        WhosalePage.shouldSeePartnershipPerksAreaEquipmentImage();
    }

    @Then("should see Partnership Perks Area Equipment Button on Whosale Page")
    public void shouldSeePartnershipPerksAreaEquipmentButtonOnWhosalePage() {
        WhosalePage.shouldSeePartnershipPerksAreaEquipmentButton();
    }

    @Then("should see Partnership Perks Area Training Title: {string} on Whosale Page")
    public void shouldSeePartnershipPerksAreaTrainingTitleOnWhosalePage(String title) {
        String text = WhosalePage.shouldSeePartnershipPerksAreaTrainingTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Partnership Perks Area Training Description: {string} on Whosale Page")
    public void shouldSeePartnershipPerksAreaTrainingDescriptionOnWhosalePage(String desc) {
        String text = WhosalePage.shouldSeePartnershipPerksAreaTrainingDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Partnership Perks Area Training Image on Whosale Page")
    public void shouldSeePartnershipPerksAreaTrainingImageOnWhosalePage() {
        WhosalePage.shouldSeePartnershipPerksAreaTrainingImage();
    }

    @Then("should see Partnership Perks Area Training Button on Whosale Page")
    public void shouldSeePartnershipPerksAreaTrainingButtonOnWhosalePage() {
        WhosalePage.shouldSeePartnershipPerksAreaTrainingButton();
    }

    @Then("should see Partnership Perks Area Roasting Title: {string} on Whosale Page")
    public void shouldSeePartnershipPerksAreaRoastingTitleOnWhosalePage(String title) {
        String text = WhosalePage.shouldSeePartnershipPerksAreaRoastingTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Partnership Perks Area Roasting Description: {string} on Whosale Page")
    public void shouldSeePartnershipPerksAreaRoastingDescriptionOnWhosalePage(String desc) {
        String text = WhosalePage.shouldSeePartnershipPerksAreaRoastingDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Partnership Perks Area Roasting Image on Whosale Page")
    public void shouldSeePartnershipPerksAreaRoastingImageOnWhosalePage() {
        WhosalePage.shouldSeePartnershipPerksAreaRoastingImage();

    }

    @Then("should see Partnership Perks Area Quality Title: {string} on Whosale Page")
    public void shouldSeePartnershipPerksAreaQualityTitleOnWhosalePage(String title) {
        String text = WhosalePage.shouldSeePartnershipPerksAreaQualityTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Partnership Perks Area Quality Description: {string} on Whosale Page")
    public void shouldSeePartnershipPerksAreaQualityDescriptionOnWhosalePage(String desc) {
        String text = WhosalePage.shouldSeePartnershipPerksAreaQualityDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Partnership Perks Area Quality Image on Whosale Page")
    public void shouldSeePartnershipPerksAreaQualityImageOnWhosalePage() {
        WhosalePage.shouldSeePartnershipPerksAreaQualityImage();
    }

    @Then("should see Partnership Perks Area Ethical Sourcing Title: {string} on Whosale Page")
    public void shouldSeePartnershipPerksAreaEthicalSourcingTitleOnWhosalePage(String title) {
        String text = WhosalePage.shouldSeePartnershipPerksAreaEthicalSourcingTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Partnership Perks Area Ethical Sourcing Description: {string} on Whosale Page")
    public void shouldSeePartnershipPerksAreaEthicalSourcingDescriptionOnWhosalePage(String desc) {
        String text = WhosalePage.shouldSeePartnershipPerksAreaEthicalSourcingDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Partnership Perks Area Ethical Sourcing Image on Whosale Page")
    public void shouldSeePartnershipPerksAreaEthicalSourcingImageOnWhosalePage() {
        WhosalePage.shouldSeePartnershipPerksAreaEthicalSourcingImage();

    }

    @Then("should see Partnership Perks Area Partnerships Title: {string} on Whosale Page")
    public void shouldSeePartnershipPerksAreaPartnershipsTitleOnWhosalePage(String title) {
        String text = WhosalePage.shouldSeePartnershipPerksAreaPartnershipsTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Partnership Perks Area Partnerships Description: {string} on Whosale Page")
    public void shouldSeePartnershipPerksAreaPartnershipsDescriptionOnWhosalePage(String desc) {
        String text = WhosalePage.shouldSeePartnershipPerksAreaPartnershipsDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Partnership Perks Area Partnerships Image on Whosale Page")
    public void shouldSeePartnershipPerksAreaPartnershipsImageOnWhosalePage() {
        WhosalePage.shouldSeePartnershipPerksAreaPartnershipsImage();
    }

    @Then("should see Partnership Perks Area Reliable & Fast Title: {string} on Whosale Page")
    public void shouldSeePartnershipPerksAreaReliableFastTitleOnWhosalePage(String title) {
        String text = WhosalePage.shouldSeePartnershipPerksAreaReliableFastTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Partnership Perks Area Reliable & Fast Description: {string} on Whosale Page")
    public void shouldSeePartnershipPerksAreaReliableFastDescriptionOnWhosalePage(String desc) {
        String text = WhosalePage.shouldSeePartnershipPerksAreaReliableFastDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Partnership Perks Area Reliable & Fast Image on Whosale Page")
    public void shouldSeePartnershipPerksAreaReliableFastImageOnWhosalePage() {
        WhosalePage.shouldSeePartnershipPerksAreaReliableFastImage();
    }

    @Then("should see Partnership Perks Area Consulting Title: {string} on Whosale Page")
    public void shouldSeePartnershipPerksAreaConsultingTitleOnWhosalePage(String title) {
        WhosalePage.shouldSeePartnershipPerksAreaConsultingTitle();

    }

    @Then("should see Partnership Perks Area Consulting Description: {string} on Whosale Page")
    public void shouldSeePartnershipPerksAreaConsultingDescription(String desc) {
        String text = WhosalePage.shouldSeePartnershipPerksAreaConsultingDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Partnership Perks Area Consulting Image on Whosale Page")
    public void shouldSeePartnershipPerksAreaConsultingImage() {
        WhosalePage.shouldSeePartnershipPerksAreaConsultingImage();
    }

    @Then("should see Partnership Perks Area Coffee Community Title: {string} on Whosale Page")
    public void shouldSeePartnershipPerksAreaCoffeeCommunityTitle(String title) {
        String text = WhosalePage.shouldSeePartnershipPerksAreaCoffeeCommunityTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Partnership Perks Area Coffee Community Description: {string} on Whosale Page")
    public void shouldSeePartnershipPerksAreaCoffeeCommunityDescription(String desc) {
        String text = WhosalePage.shouldSeePartnershipPerksAreaCoffeeCommunityDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Partnership Perks Area Coffee Community Image on Whosale Page")
    public void shouldSeePartnershipPerksAreaCoffeeCommunityImage() {
        WhosalePage.shouldSeePartnershipPerksAreaCoffeeCommunityImage();
    }

    @Then("should see Partnership Perks Area Professionalism Title: {string} on Whosale Page")
    public void shouldSeePartnershipPerksAreaProfessionalismTitle(String title) {
        String text = WhosalePage.shouldSeePartnershipPerksAreaProfessionalismTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Partnership Perks Area Professionalism Description: {string} on Whosale Page")
    public void shouldSeePartnershipPerksAreaProfessionalismDescription(String desc) {
        String text = WhosalePage.shouldSeePartnershipPerksAreaProfessionalismDescription();
        Assert.assertEquals(text.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Partnership Perks Area Professionalism Image on Whosale Page")
    public void shouldSeePartnershipPerksAreaProfessionalismImage() {
        WhosalePage.shouldSeePartnershipPerksAreaProfessionalismImage();
    }

    @Then("should see Lets Grab a Coffee Area Full Name Error: {string} on Whosale Page")
    public void shouldSeeLetsGrabACoffeeAreaFullNameErrorOnBecomeOurPartnerPage(String text) {
        String expText = WhosalePage.shouldSeeLetsGrabACoffeeAreaFullNameError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Email Error: {string} on Whosale Page")
    public void shouldSeeLetsGrabACoffeeAreaEmailErrorOnBecomeOurPartnerPage(String text) {
        String expText = WhosalePage.shouldSeeLetsGrabACoffeeAreaEmailError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Contact Number Error: {string} on Whosale Page")
    public void shouldSeeLetsGrabACoffeeAreaContactNumberErrorOnBecomeOurPartnerPage(String text) {
        String expText = WhosalePage.shouldSeeLetsGrabACoffeeAreaContactNumberError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Business Name Error: {string} on Whosale Page")
    public void shouldSeeLetsGrabACoffeeAreaBusinessNameErrorOnBecomeOurPartnerPage(String text) {
        String expText = WhosalePage.shouldSeeLetsGrabACoffeeAreaBusinessNameError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Type of Business Error: {string} on Whosale Page")
    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessErrorOnBecomeOurPartnerPage(String text) {
        String expText = WhosalePage.shouldSeeLetsGrabACoffeeAreaTypeOfBusinessError();
        Assert.assertEquals(expText, text);
    }

    @Then("should see Lets Grab a Coffee Area Tell us Error: {string} on Whosale Page")
    public void shouldSeeLetsGrabACoffeeAreaTellUsErrorOnBecomeOurPartnerPage(String text) {
        String expText = WhosalePage.shouldSeeLetsGrabACoffeeAreaTellUsError();
        Assert.assertEquals(expText, text);
    }
}
