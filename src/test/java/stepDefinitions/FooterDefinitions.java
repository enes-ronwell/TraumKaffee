package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Footer;
import utils.DriverFactory;

public class FooterDefinitions {
    Footer footer = new Footer(DriverFactory.getDriver());

    //GİVEN's

    //WHEN's
    @When("click Traum Kaffee Area Image on Footer")
    public void clickTraumKaffeeAreaImageOnFooter() {
        footer.clickTraumKaffeeAreaImage();
    }

    @When("click Quick Links Area My Account on Footer")
    public void clickQuickLinksAreaMyAccountOnFooter() {
        footer.clickQuickLinksAreaMyAccount();
    }

    @When("click Quick Links Area FAQ on Footer")
    public void clickQuickLinksAreaFAQOnFooter() {
        footer.clickQuickLinksAreaFAQ();
    }

    @When("click Quick Links Area Become Our Partner on Footer")
    public void clickQuickLinksAreaBecomeOurPartnerOnFooter() {
        footer.clickQuickLinksAreaBecomeOurPartner();
    }

    @When("click Quick Links Area Contact on Footer")
    public void clickQuickLinksAreaContactOnFooter() {
        footer.clickQuickLinksAreaContact();
    }

    @When("click Quick Links Area Products on Footer")
    public void clickQuickLinksAreaProductsOnFooter() {
        footer.clickQuickLinksAreaProducts();
    }

    @When("click Quick Links Area Blog on Footer")
    public void clickQuickLinksAreaBlogOnFooter() {
        footer.clickQuickLinksAreaBlog();
    }

    @When("click Legals Area Privacy Policy on Footer")
    public void clickLegalsAreaPrivacyPolicyOnFooter() {
        footer.clickLegalsAreaPrivacyPolicy();
    }

    @When("click Legals Area Terms Conditions on Footer")
    public void clickLegalsAreaTermsConditionsOnFooter() {
        footer.clickLegalsAreaTermsConditions();
    }

    @When("click Legals Area Refund Policy on Footer")
    public void clickLegalsAreaRefundPolicyOnFooter() {
        footer.clickLegalsAreaRefundPolicy();
    }

    @When("click Lets Stay In Touch Area Facebook Icon on Footer")
    public void clickLetsStayInTouchAreaFacebookIconOnFooter() {
        footer.clickLetsStayInTouchAreaFacebookIcon();
    }

    @When("click Lets Stay In Touch Area Instagram Icon on Footer")
    public void clickLetsStayInTouchAreaInstagramIconOnFooter() {
        footer.clickLetsStayInTouchAreaInstagramIcon();
    }

    @When("click Lets Stay In Touch Area Twitter Icon on Footer")
    public void clickLetsStayInTouchAreaTwitterIconOnFooter() {
        footer.clickLetsStayInTouchAreaTwitterIcon();
    }

    @When("click Lets Stay In Touch Area Email Box Icon on Footer")
    public void clickLetsStayInTouchAreaEmailBoxIconOnFooter() {
        footer.clickLetsStayInTouchAreaEmailBoxIcon();
    }

    @When("sendkeys Lets Stay In Touch Area Email Box: {string} on Footer")
    public void sendkeysLetsStayInTouchAreaEmailBoxOnFooter(String email) {
        footer.sendkeysLetsStayInTouchAreaEmailBox(email);
    }

    //THEN's
    @Then("should see Traum Kaffee Area Title: {string} on Footer")
    public void shouldSeeTraumKaffeeAreaTitleOnFooter(String title) {
        String text = footer.shouldSeeTraumKaffeeAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Traum Kaffee Area Image on Footer")
    public void shouldSeeTraumKaffeeAreaImageOnFooter() {
        footer.shouldSeeTraumKaffeeAreaImage();
    }

    @Then("should see Traum Kaffee Area All Rights Reserved: {string} on Footer")
    public void shouldSeeTraumKaffeeAreaAllRightsReservedOnFooter(String reserved) {
        String text = footer.shouldSeeTraumKaffeeAreaAllRightsReserved();
        Assert.assertEquals(text, reserved);
    }

    @Then("should see Quick Links Area Title: {string} on Footer")
    public void shouldSeeQuickLinksAreaTitleOnFooter(String title) {
        String text = footer.shouldSeeQuickLinksAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Quick Links Area My Account: {string} on Footer")
    public void shouldSeeQuickLinksAreaMyAccountOnFooter(String account) {
        String text = footer.shouldSeeQuickLinksAreaMyAccount();
        Assert.assertEquals(text, account);
    }

    @Then("should see Quick Links Area FAQ: {string} on Footer")
    public void shouldSeeQuickLinksAreaFAQOnFooter(String faq) {
        String text = footer.shouldSeeQuickLinksAreaFAQ();
        Assert.assertEquals(text, faq);
    }

    @Then("should see Quick Links Area Become Our Partner: {string} on Footer")
    public void shouldSeeQuickLinksAreaBecomeOurPartnerOnFooter(String become) {
        String text = footer.shouldSeeQuickLinksAreaBecomeOurPartner();
        Assert.assertEquals(text, become);
    }

    @Then("should see Quick Links Area Contact: {string} on Footer")
    public void shouldSeeQuickLinksAreaContactOnFooter(String contact) {
        String text = footer.shouldSeeQuickLinksAreaContact();
        Assert.assertEquals(text, contact);
    }

    @Then("should see Quick Links Area Products: {string} on Footer")
    public void shouldSeeQuickLinksAreaProductsOnFooter(String products) {
        String text = footer.shouldSeeQuickLinksAreaProducts();
        Assert.assertEquals(text, products);
    }

    @Then("should see Quick Links Area Blog: {string} on Footer")
    public void shouldSeeQuickLinksAreaBlogOnFooter(String blog) {
        String text = footer.shouldSeeQuickLinksAreaBlog();
        Assert.assertEquals(text, blog);
    }

    @Then("should see Legals Area Title: {string} on Footer")
    public void shouldSeeLegalsAreaTitleOnFooter(String title) {
        String text = footer.shouldSeeLegalsAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Legals Area Privacy Policy: {string} on Footer")
    public void shouldSeeLegalsAreaPrivacyPolicyOnFooter(String policy) {
        String text = footer.shouldSeeLegalsAreaPrivacyPolicy();
        Assert.assertEquals(text, policy);
    }

    @Then("should see Legals Area Terms Conditions: {string} on Footer")
    public void shouldSeeLegalsAreaTermsConditionsOnFooter(String conditions) {
        String text = footer.shouldSeeLegalsAreaTermsConditions();
        Assert.assertEquals(text, conditions);
    }

    @Then("should see Legals Area Refund Policy: {string} on Footer")
    public void shouldSeeLegalsAreaRefundPolicyOnFooter(String policy) {
        String text = footer.shouldSeeLegalsAreaRefundPolicy();
        Assert.assertEquals(text, policy);
    }

    @Then("should see Lets Stay In Touch Area Title: {string} on Footer")
    public void shouldSeeLetsStayInTouchAreaTitleOnFooter(String title) {
        String text = footer.shouldSeeLetsStayInTouchAreaTitle();
        Assert.assertEquals(text, title);
    }

    @Then("should see Lets Stay In Touch Area Email Box: {string} on Footer")
    public void shouldSeeLetsStayInTouchAreaEmailBoxOnFooter(String email) {
        String text = footer.shouldSeeLetsStayInTouchAreaEmailBox();
        Assert.assertEquals(text, email);
    }

    @Then("should see Lets Stay In Touch Area Email Box Icon on Footer")
    public void shouldSeeLetsStayInTouchAreaEmailBoxIconOnFooter() {
        footer.shouldSeeLetsStayInTouchAreaEmailBoxIcon();
    }

    @Then("should see Lets Stay In Touch Area Facebook Icon on Footer")
    public void shouldSeeLetsStayInTouchAreaFacebookIconOnFooter() {
        footer.shouldSeeLetsStayInTouchAreaFacebookIcon();
    }

    @Then("should see Lets Stay In Touch Area Twitter Icon on Footer")
    public void shouldSeeLetsStayInTouchAreaTwitterIconOnFooter() {
        footer.shouldSeeLetsStayInTouchAreaTwitterIcon();
    }

    @Then("should see Lets Stay In Touch Area Instagram Icon on Footer")
    public void shouldSeeLetsStayInTouchAreaInstagramIconOnFooter() {
        footer.shouldSeeLetsStayInTouchAreaInstagramIcon();
    }
}
