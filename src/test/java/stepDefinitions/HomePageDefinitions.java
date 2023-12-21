package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.HomePage;
import utils.DriverFactory;


public class HomePageDefinitions {
    HomePage homePage = new HomePage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the Home Page")
    public void userOnTheHomePage() {
        homePage.goToHomePage("https://dev.traumkaffee.com/");
    }

    //WHEN's
    @When("click Home Page Area Shop Now Button on Home Page")
    public void clickHomePageAreaShopNowButtonOnHomePage() {
        homePage.clickHomePageAreaShopNowButton();
    }

    @When("click Home Page Area Facebook Button on Home Page")
    public void clickHomePageAreaFacebookButtonOnHomePage() {
        homePage.clickHomePageAreaFacebookButton();
    }

    @When("click Home Page Area Instagram Button on Home Page")
    public void clickHomePageAreaInstagramButtonOnHomePage() {
        homePage.clickHomePageAreaInstagramButton();
    }

    @When("click Home Page Area Twitter Button on Home Page")
    public void clickHomePageAreaTwitterButtonOnHomePage() {
        homePage.clickHomePageAreaTwitterButton();
    }

    @When("click Products Area Show All Products Button on Home Page")
    public void clickProductsAreaShowAllProductsButtonOnHomePage() {
        homePage.clickProductsAreaShowAllProductsButton();

    }

    @When("click Sustainability Area Read More Button on Home Page")
    public void clickSustainabilityAreaReadMoreButtonOnHomePage() {
        homePage.clickSustainabilityAreaReadMoreButton();
    }

    @When("click Whosale Area Whosale Button on Home Page")
    public void clickWhosaleAreaWhosaleButtonOnHomePage() {
        homePage.clickWhosaleAreaWhosaleButton();
    }

    @When("click Blog Area Button on Home Page")
    public void clickBlogAreaButtonOnHomePage() {
        homePage.clickBlogAreaButton();
    }

    @When("click Brew Guides Area Button on Home Page")
    public void clickBrewGuidesAreaButtonOnHomePage() {
        homePage.clickBrewGuidesAreaButton();
    }

    @When("click Twits Area First Twit Instagram Icon on Home Page")
    public void clickTwitsAreaFirstTwitInstagramIconOnHomePage() {
        homePage.clickTwitsAreaFirstTwitInstagramIcon();
    }

    @When("click Twits Area Second Twit Twitter Icon on Home Page")
    public void clickTwitsAreaSecondTwitTwitterIconOnHomePage() {
        homePage.clickTwitsAreaSecondTwitTwitterIcon();
    }

    @When("click Twits Area Third Twit Twitter Icon on Home Page")
    public void clickTwitsAreaThirdTwitTwitterIconOnHomePage() {
        homePage.clickTwitsAreaThirdTwitTwitterIcon();
    }

    @When("click Twits Area Fourth Twit Instagram Icon on Home Page")
    public void clickTwitsAreaFourthTwitInstagramIconOnHomePage() {
        homePage.clickTwitsAreaFourthTwitInstagramIcon(); }

    @When("click Twits Area Fifth Twit Instagram Icon on Home Page")
    public void clickTwitsAreaFifthTwitInstagramIconOnHomePage() {
        homePage.clickTwitsAreaFifthTwitInstagramIcon();
    }

    @When("click Twits Area Sixth Twit Twitter Icon on Home Page")
    public void clickTwitsAreaSixthTwitTwitterIconOnHomePage() {
        homePage.clickTwitsAreaSixthTwitTwitterIcon();
    }

    @When("click Favorites Area Fourth Product Image on Home Page")
    public void clickFavoritesAreaFourthProductImageOnHomePage() {
        homePage.clickFavoritesAreaFourthProductImage();
    }

    @When("click Favorites Area Third Product Image on Home Page")
    public void clickFavoritesAreaThirdProductImageOnHomePage() {
        homePage.clickFavoritesAreaThirdProductImage();

    }

    @When("click Favorites Area Second Product Image on Home Page")
    public void clickFavoritesAreaSecondProductImageOnHomePage() {
        homePage.clickFavoritesAreaSecondProductImage();
    }

    @When("click Favorites Area First Product Image on Home Page")
    public void clickFavoritesAreaFirstProductImageOnHomePage() {
        homePage.clickFavoritesAreaFirstProductImage();
    }

    @When("click Favorites Area Second Product Name on Home Page")
    public void clickFavoritesAreaSecondProductNameOnHomePage() {
        homePage.clickFavoritesAreaSecondProductName();
    }

    @When("click Favorites Area First Product Name on Home Page")
    public void clickFavoritesAreaFirstProductNameOnHomePage() {
        homePage.clickFavoritesAreaFirstProductName();
    }

    @When("click Favorites Area Third Product Name on Home Page")
    public void clickFavoritesAreaThirdProductNameOnHomePage() {
        homePage.clickFavoritesAreaThirdProductName();
    }

    @When("click Favorites Area Fourth Product Name on Home Page")
    public void clickFavoritesAreaFourthProductNameOnHomePage() {
        homePage.clickFavoritesAreaFourthProductName();
    }

    @When("click Favorites Area First Product Add Button on Home Page")
    public void clickFavoritesAreaFirstProductAddButtonOnHomePage() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        homePage.clickFavoritesAreaFirstProductAddButton();
    }

    @When("click Favorites Area Second Product Add Button on Home Page")
    public void clickFavoritesAreaSecondProductAddButtonOnHomePage() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        homePage.clickFavoritesAreaSecondProductAddButton();
    }

    @When("click Favorites Area Third Product Add Button on Home Page")
    public void clickFavoritesAreaThirdProductAddButtonOnHomePage() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        homePage.clickFavoritesAreaThirdProductAddButton();
    }

    @When("click Favorites Area Fourth Product Add Button on Home Page")
    public void clickFavoritesAreaFourthProductAddButtonOnHomePage() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        homePage.clickFavoritesAreaFourthProductAddButton();
    }

    @When("click First Product's Name in the Products Area")
    public void clickFirstProductSNameInTheProductsArea() {
        homePage.clickFirstProductsNameInTheProductsArea();
    }

    @When("click First Product's Image in the Products Area")
    public void clickFirstProductSImageInTheProductsArea() {
        homePage.clickFirstProductsImageInTheProductsArea();
    }


    @When("click First Product's Price in the Products Area")
    public void clickFirstProductSPriceInTheProductsArea() {
        homePage.clickFirstProductsPriceInTheProductsArea();
    }

    @When("click Second Product's Image in the Products Area")
    public void clickSecondProductSImageInTheProductsArea() {
        homePage.clickSecondProductsImageInTheProductsArea();
    }

    @When("click Second Product's Name in the Products Area")
    public void clickSecondProductSNameInTheProductsArea() {
        homePage.clickSecondProductsNameInTheProductsArea();
    }

    @When("click Second Product's Price in the Products Area")
    public void clickSecondProductSPriceInTheProductsArea() {
        homePage.clickSecondProductsPriceInTheProductsArea();
    }

    @When("click Third Product's Image in the Products Area")
    public void clickThirdProductSImageInTheProductsArea() {
        homePage.clickThirdProductsImageInTheProductsArea();
    }

    @When("click Third Product's Name in the Products Area")
    public void clickThirdProductSNameInTheProductsArea() {
        homePage.clickThirdProductsNameInTheProductsArea();
    }

    @When("click Third Product's Price in the Products Area")
    public void clickThirdProductSPriceInTheProductsArea() {
        homePage.clickThirdProductsPriceInTheProductsArea();
    }

    @When("click Fourth Product's Image in the Products Area")
    public void clickFourthProductSImageInTheProductsArea() {
        homePage.clickFourthProductsImageInTheProductsArea();
    }

    @When("click Fourth Product's Name in the Products Area")
    public void clickFourthProductSNameInTheProductsArea() {
        homePage.clickFourthProductsNameInTheProductsArea();
    }

    @When("click Fourth Product's Price in the Products Area")
    public void clickFourthProductSPriceInTheProductsArea() {
        homePage.clickFourthProductsPriceInTheProductsArea();
    }

    @When("click Fourth Product's Price in the Favorites Area")
    public void clickFourthProductSPriceInTheFavoritesArea() {
        homePage.clickFourthProductsPriceInTheFavoritesArea();
    }

    @When("click Third Product's Price in the Favorites Area")
    public void clickThirdProductSPriceInTheFavoritesArea() {
        homePage.clickThirdProductsPriceInTheFavoritesArea();
    }

    @When("click Second Product's Price in the Favorites Area")
    public void clickSecondProductSPriceInTheFavoritesArea() {
        homePage.clickSecondProductsPriceInTheFavoritesArea();
    }

    @When("click First Product's Price in the Favorites Area")
    public void clickFirstProductSPriceInTheFavoritesArea() {
        homePage.clickFirstProductsPriceInTheFavoritesArea();
    }

    //THEN's
    @Then("should see the Home Page")
    public void shouldSeeTheHomePage() {
        homePage.checkHomePage();
    }

    @Then("should see Home Page Area Title: {string} on Home Page")
    public void shouldSeeHomePageAreaTitleOnHomePage(String title) {
        String expTitle = homePage.getHomePageAreaTitle();
        Assert.assertEquals(expTitle.trim(), title.trim());
    }

    @Then("should see Home Page Area Description: {string} on Home Page")
    public void shouldSeeHomePageAreaDescriptionOnHomePage(String desc) {
        String expdesc = homePage.getHomePageAreaDesc();
        Assert.assertEquals(expdesc.trim(), desc.trim());
    }

    @Then("should see Home Page Area Shop Now Button: {string} on Home Page")
    public void shouldSeeHomePageAreaShopNowButtonOnHomePage(String button) {

    }

    @Then("should see Home Page Area Image on Home Page")
    public void shouldSeeHomePageAreaImageOnHomePage() {
        homePage.checkHomePageAreaImage();
    }

    @Then("should see Home Page Area Facebook Icon on Home Page")
    public void shouldSeeHomePageAreaFacebookIconOnHomePage() {
        homePage.checkHomePageAreaFacebookIcon();
    }

    @Then("should see Home Page Area Instagram Icon on Home Page")
    public void shouldSeeHomePageAreaInstagramIconOnHomePage() {
        homePage.checkHomePageAreaInstagramIcon();
    }

    @Then("should see Home Page Area Twitter Icon on Home Page")
    public void shouldSeeHomePageAreaTwitterIconOnHomePage() {
        homePage.checkHomePageAreaTwitterIcon();
    }

    @Then("should see Coffee Area Title: {string} on Home Page")
    public void shouldSeeCoffeeAreaTitleOnHomePage(String title) {
        String CoffeeAreaTitle = homePage.checkCoffeeAreaTitle();
        Assert.assertEquals(CoffeeAreaTitle, title);
    }

    @Then("should see Coffee Area Image on Home Page")
    public void shouldSeeCoffeeAreaImageOnHomePage() {
        homePage.checkCoffeeAreaImage();
    }

    @Then("should see Coffee Area Left Up Text: {string} on Home Page")
    public void shouldSeeCoffeeAreaLeftUpTextOnHomePage(String text) {
        String CoffeeAreaLeftUpText = homePage.checkCoffeeAreaLeftUpText();
        Assert.assertEquals(CoffeeAreaLeftUpText, text);
    }

    @Then("should see Coffee Area Left Up Image on Home Page")
    public void shouldSeeCoffeeAreaLeftUpImageOnHomePage() {
        homePage.checkCoffeeAreaLeftUpImage();
    }

    @Then("should see Coffee Area Left Down Text: {string} on Home Page")
    public void shouldSeeCoffeeAreaLeftDownTextOnHomePage(String text) {
        String CoffeeAreaLeftDownText = homePage.checkCoffeeAreaLeftDownText();
        Assert.assertEquals(CoffeeAreaLeftDownText, text);
    }

    @Then("should see Coffee Area Left Down Image on Home Page")
    public void shouldSeeCoffeeAreaLeftDownImageOnHomePage() {
        homePage.checkCoffeeAreaLeftDownImage();
    }

    @Then("should see Coffee Area Right Up Text: {string} on Home Page")
    public void shouldSeeCoffeeAreaRightUpTextOnHomePage(String text) {
        String CoffeeAreaRightUpText = homePage.checkCoffeeAreaRightUpText();
        Assert.assertEquals(CoffeeAreaRightUpText, text);
    }

    @Then("should see Coffee Area Right Up Image on Home Page")
    public void shouldSeeCoffeeAreaRightUpImageOnHomePage() {
        homePage.checkCoffeeAreaRightUpImage();
    }

    @Then("should see Coffee Area Right Down Text: {string} on Home Page")
    public void shouldSeeCoffeeAreaRightDownTextOnHomePage(String text) {
        String CoffeeAreaRightDownText = homePage.checkCoffeeAreaRightDownText();
        Assert.assertEquals(CoffeeAreaRightDownText, text);
    }

    @Then("should see Coffee Area Right Down Image on Home Page")
    public void shouldSeeCoffeeAreaRightDownImageOnHomePage() {
        homePage.checkCoffeeAreaRightDownImage();
    }

    @Then("should see Dream Area Image on Home Page")
    public void shouldSeeDreamAreaImageOnHomePage() {
        homePage.checkDreamAreaImage();
    }

    @Then("should see Dream Area Title: {string} on Home Page")
    public void shouldSeeDreamAreaTitleOnHomePage(String title) {
        String DreamAreaTitle = homePage.checkDreamAreaTitle();
        Assert.assertEquals(DreamAreaTitle.trim(), title.trim());
    }

    @Then("should see Dream Area Description: {string} on Home Page")
    public void shouldSeeDreamAreaDescriptionOnHomePage(String desc) {
        String DreamAreaDescription = homePage.checkDreamAreaDescription();
        Assert.assertEquals(DreamAreaDescription.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Dream Area Explanation: {string} on Home Page")
    public void shouldSeeDreamAreaExplanationOnHomePage(String explanation) {
        String DreamAreaExplanation = homePage.checkDreamAreaExplanation();
        Assert.assertEquals(DreamAreaExplanation.replaceAll("\\s+", ""), explanation.replaceAll("\\s+", ""));
    }

    @Then("should see Products Area Title: {string} on Home Page")
    public void shouldSeeProductsAreaTitleOnHomePage(String title) {
        String ProductsAreaTitle = homePage.checkProductsAreaTitle();
        Assert.assertEquals(ProductsAreaTitle, title);
    }

    @Then("should see Products Area First Product Image on Home Page")
    public void shouldSeeProductsAreaFirstProductImageOnHomePage() {
        homePage.checkProductsAreaFirstProductImage();
    }

    @Then("should see Products Area First Product Add Button on Home Page")
    public void shouldSeeProductsAreaFirstProductAddButtonOnHomePage() {
        homePage.checkProductsAreaFirstProductAddButton();
    }

    @Then("should see Products Area First Product Name: {string} on Home Page")
    public void shouldSeeProductsAreaFirstProductNameOnHomePage(String name) {
        String ProductsAreaFirstProductName = homePage.checkProductsAreaFirstProductName();
        Assert.assertEquals(ProductsAreaFirstProductName, name);
    }

    @Then("should see Products Area First Product Price: {string} on Home Page")
    public void shouldSeeProductsAreaFirstProductPriceOnHomePage(String price) {
        String ProductsAreaFirstProductPrice = homePage.checkProductsAreaFirstProductPrice();
        Assert.assertEquals(ProductsAreaFirstProductPrice, price);
    }

    @Then("should see Products Area First Product Discount Price: {string} on Home Page")
    public void shouldSeeProductsAreaFirstProductDiscountPriceOnHomePage(String discount) {
        String ProductsAreaFirstProductDiscountPrice = homePage.checkProductsAreaFirstProductDiscountPrice();
        Assert.assertEquals(ProductsAreaFirstProductDiscountPrice, discount);
    }

    @Then("should see Products Area Second Product Image on Home Page")
    public void shouldSeeProductsAreaSecondProductImageOnHomePage() {
        homePage.checkProductsAreaSecondProductImage();
    }

    @Then("should see Products Area Second Product Add Button on Home Page")
    public void shouldSeeProductsAreaSecondProductAddButtonOnHomePage() {
        homePage.checkProductsAreaSecondProductAddButton();
    }

    @Then("should see Products Area Second Product Name: {string} on Home Page")
    public void shouldSeeProductsAreaSecondProductNameOnHomePage(String name) {
        String ProductsAreaSecondProductName = homePage.checkProductsAreaSecondProductName();
        Assert.assertEquals(ProductsAreaSecondProductName, name);
    }

    @Then("should see Products Area Second Product Price: {string} on Home Page")
    public void shouldSeeProductsAreaSecondProductPriceOnHomePage(String price) {
        String ProductsAreaSecondProductPrice = homePage.checkProductsAreaSecondProductPrice();
        Assert.assertEquals(ProductsAreaSecondProductPrice, price);
    }

    @Then("should see Products Area Second Product Discount Price: {string} on Home Page")
    public void shouldSeeProductsAreaSecondProductDiscountPriceOnHomePage(String discount) {
        String ProductsAreaSecondProductDiscountPrice = homePage.checkProductsAreaSecondProductDiscountPrice();
        Assert.assertEquals(ProductsAreaSecondProductDiscountPrice, discount);
    }

    @Then("should see Products Area Third Product Image on Home Page")
    public void shouldSeeProductsAreaThirdProductImageOnHomePage() {
        homePage.checkProductsAreaThirdProductImage();
    }

    @Then("should see Products Area Third Product Add Button on Home Page")
    public void shouldSeeProductsAreaThirdProductAddButtonOnHomePage() {
        homePage.checkProductsAreaThirdProductAddButton();
    }

    @Then("should see Products Area Third Product Name: {string} on Home Page")
    public void shouldSeeProductsAreaThirdProductNameOnHomePage(String name) {
        String ProductsAreaThirdProductName = homePage.checkProductsAreaThirdProductName();
        Assert.assertEquals(ProductsAreaThirdProductName, name);
    }

    @Then("should see Products Area Third Product Price: {string} on Home Page")
    public void shouldSeeProductsAreaThirdProductPriceOnHomePage(String price) {
        String ProductsAreaThirdProductPrice = homePage.checkProductsAreaThirdProductPrice();
        Assert.assertEquals(ProductsAreaThirdProductPrice, price);
    }

    @Then("should see Products Area Third Product Discount Price: {string} on Home Page")
    public void shouldSeeProductsAreaThirdProductDiscountPriceOnHomePage(String discount) {
        String ProductsAreaThirdProductDiscountPrice = homePage.checkProductsAreaThirdProductDiscountPrice();
        Assert.assertEquals(ProductsAreaThirdProductDiscountPrice, discount);
    }

    @Then("should see Products Area Fourth Product Image on Home Page")
    public void shouldSeeProductsAreaFourthProductImageOnHomePage() {
        homePage.checkProductsAreaFourthProductImage();
    }

    @Then("should see Products Area Fourth Product Add Button on Home Page")
    public void shouldSeeProductsAreaFourthProductAddButtonOnHomePage() {
        homePage.checkProductsAreaFourthProductAddButton();
    }

    @Then("should see Products Area Fourth Product Name: {string} on Home Page")
    public void shouldSeeProductsAreaFourthProductNameOnHomePage(String name) {
        String ProductsAreaFourthProductName = homePage.checkProductsAreaFourthProductName();
        Assert.assertEquals(ProductsAreaFourthProductName, name);
    }

    @Then("should see Products Area Fourth Product Price: {string} on Home Page")
    public void shouldSeeProductsAreaFourthProductPriceOnHomePage(String price) {
        String ProductsAreaFourthProductPrice = homePage.checkProductsAreaFourthProductPrice();
        Assert.assertEquals(ProductsAreaFourthProductPrice, price);
    }

    @Then("should see Products Area Fourth Product Discount Price: {string} on Home Page")
    public void shouldSeeProductsAreaFourthProductDiscountPriceOnHomePage(String discount) {
        String ProductsAreaFourthProductDiscountPrice = homePage.checkProductsAreaFourthProductDiscountPrice();
        Assert.assertEquals(ProductsAreaFourthProductDiscountPrice, discount);
    }

    @Then("should see Products Area Show All Products: {string} on Home Page")
    public void shouldSeeProductsAreaShowAllProductsOnHomePage(String button) {
        String ProductsAreaShowAllProducts = homePage.checkProductsAreaShowAllProducts();
        Assert.assertEquals(ProductsAreaShowAllProducts, button);
    }

    @Then("should see Sustainability Area Title: {string} on Home Page")
    public void shouldSeeSustainabilityAreaTitleOnHomePage(String title) {
        String SustainabilityAreaTitle = homePage.checkSustainabilityAreaTitle();
        Assert.assertEquals(SustainabilityAreaTitle, title);
    }

    @Then("should see Sustainability Area Description: {string} on Home Page")
    public void shouldSeeSustainabilityAreaDescriptionOnHomePage(String desc) {
        String SustainabilityAreaDescription = homePage.checkSustainabilityAreaDescription();
        Assert.assertEquals(SustainabilityAreaDescription, desc);
    }

    @Then("should see Sustainability Area Read More Button: {string} on Home Page")
    public void shouldSeeSustainabilityAreaReadMoreButtonOnHomePage(String button) {
        String SustainabilityAreaReadMoreButton = homePage.checkSustainabilityAreaReadMoreButton();
        Assert.assertEquals(SustainabilityAreaReadMoreButton, button);
    }

    @Then("should see Sustainability Area Image on Home Page")
    public void shouldSeeSustainabilityAreaImageOnHomePage() {
        homePage.checkSustainabilityAreaImage();
    }

    @Then("should see Whosale Area Title: {string} on Home Page")
    public void shouldSeeWhosaleAreaTitleOnHomePage(String title) {
        String WhosaleAreaTitle = homePage.checkWhosaleAreaTitle();
        Assert.assertEquals(WhosaleAreaTitle, title);

    }

    @Then("should see Whosale Area Description: {string} on Home Page")
    public void shouldSeeWhosaleAreaDescriptionOnHomePage(String desc) {
        String WhosaleAreaDescription = homePage.checkWhosaleAreaDescription();
        Assert.assertEquals(WhosaleAreaDescription.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Whosale Area Whosale Button: {string} on Home Page")
    public void shouldSeeWhosaleAreaWhosaleButtonOnHomePage(String button) {
        String WhosaleAreaWhosaleButton = homePage.checkWhosaleAreaWhosaleButton();
        Assert.assertEquals(WhosaleAreaWhosaleButton, button);
    }

    @Then("should see Whosale Area Image on Home Page")
    public void shouldSeeWhosaleAreaImageOnHomePage() {
        homePage.checkWhosaleAreaImage();
    }

    @Then("should see Whosale Area Whosale Button Image on Home Page")
    public void shouldSeeWhosaleAreaWhosaleButtonImageOnHomePage() {
        homePage.checkWhosaleAreaWhosaleButtonImage();
    }

    @Then("should see Blog Area Title: {string} on Home Page")
    public void shouldSeeBlogAreaTitleOnHomePage(String title) {
        String BlogAreaTitle = homePage.checkBlogAreaTitle();
        Assert.assertEquals(BlogAreaTitle, title);
    }

    @Then("should see Blog Area Image on Home Page")
    public void shouldSeeBlogAreaImageOnHomePage() {
        homePage.checkBlogAreaImage();
    }

    @Then("should see Blog Area Button on Home Page")
    public void shouldSeeBlogAreaButtonOnHomePage() {
        homePage.checkBlogAreaButton();
    }

    @Then("should see Brew Guides Area Title: {string} on Home Page")
    public void shouldSeeBrewGuidesAreaTitleOnHomePage(String title) {
        String BrewGuidesAreaTitle = homePage.checkBrewGuidesAreaTitle();
        Assert.assertEquals(BrewGuidesAreaTitle, title);
    }

    @Then("should see Brew Guides Area Image on Home Page")
    public void shouldSeeBrewGuidesAreaImageOnHomePage() {
        homePage.checkBrewGuidesAreaImage();
    }

    @Then("should see Brew Guides Area Button on Home Page")
    public void shouldSeeBrewGuidesAreaButtonOnHomePage() {
        homePage.checkBrewGuidesAreaButton();
    }

    @Then("should see Twits Area First Twit Image on Home Page")
    public void shouldSeeTwitsAreaFirstTwitImageOnHomePage() {
        homePage.checkTwitsAreaFirstTwitImage();
    }

    @Then("should see Twits Area First Twit Instagram Icon on Home Page")
    public void shouldSeeTwitsAreaFirstTwitInstagramIconOnHomePage() {
        homePage.checkTwitsAreaFirstTwitInstagramIcon();
    }

    @Then("should see Twits Area Second Twit Twitter Icon on Home Page")
    public void shouldSeeTwitsAreaSecondTwitTwitterIconOnHomePage() {
        homePage.checkTwitsAreaSecondTwitTwitterIcon();
    }

    @Then("should see Twits Area Second Twit Description: {string} on Home Page")
    public void shouldSeeTwitsAreaSecondTwitDescriptionOnHomePage(String desc) {
        String TwitsAreaSecondTwitDescription = homePage.checkTwitsAreaSecondTwitDescription();
        Assert.assertEquals(TwitsAreaSecondTwitDescription.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Twits Area Second Twit Tags: {string} on Home Page")
    public void shouldSeeTwitsAreaSecondTwitTagsOnHomePage(String tag) {
        String TwitsAreaSecondTwitTags = homePage.checkTwitsAreaSecondTwitTags();
        Assert.assertEquals(TwitsAreaSecondTwitTags, tag);
    }

    @Then("should see Twits Area Third Twit Twitter Icon on Home Page")
    public void shouldSeeTwitsAreaThirdTwitTwitterIconOnHomePage() {
        homePage.checkTwitsAreaThirdTwitTwitterIcon();
    }

    @Then("should see Twits Area Third Twit Description: {string} on Home Page")
    public void shouldSeeTwitsAreaThirdTwitDescriptionOnHomePage(String desc) {
        String TwitsAreaThirdTwitDescription = homePage.checkTwitsAreaThirdTwitDescription();
        Assert.assertEquals(TwitsAreaThirdTwitDescription.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Twits Area Third Twit Tags: {string} on Home Page")
    public void shouldSeeTwitsAreaThirdTwitTagsOnHomePage(String tag) {
        String TwitsAreaThirdTwitTags = homePage.checkTwitsAreaThirdTwitTags();
        Assert.assertEquals(TwitsAreaThirdTwitTags, tag);
    }

    @Then("should see Twits Area Fourth Twit Image on Home Page")
    public void shouldSeeTwitsAreaFourthTwitImageOnHomePage() {
        homePage.checkTwitsAreaFourthTwitImage();
    }

    @Then("should see Twits Area Fourth Twit Instagram Icon on Home Page")
    public void shouldSeeTwitsAreaFourthTwitInstagramIconOnHomePage() {
        homePage.checkTwitsAreaFourthTwitInstagramIcon();
    }

    @Then("should see Twits Area Fifth Twit Image on Home Page")
    public void shouldSeeTwitsAreaFifthTwitImageOnHomePage() {
        homePage.checkTwitsAreaFifthTwitImage();
    }

    @Then("should see Twits Area Fifth Twit Instagram Icon on Home Page")
    public void shouldSeeTwitsAreaFifthTwitInstagramIconOnHomePage() {
        homePage.checkTwitsAreaFifthTwitInstagramIcon();
    }

    @Then("should see Twits Area Sixth Twit Twitter Icon on Home Page")
    public void shouldSeeTwitsAreaSixthTwitTwitterIconOnHomePage() {
        homePage.checkTwitsAreaSixthTwitTwitterIcon();
    }

    @Then("should see Twits Area Sixth Twit Description: {string} on Home Page")
    public void shouldSeeTwitsAreaSixthTwitDescriptionOnHomePage(String desc) {
        String TwitsAreaSixthTwitDescription = homePage.checkTwitsAreaSixthTwitDescription();
        Assert.assertEquals(TwitsAreaSixthTwitDescription.replaceAll("\\s+", ""), desc.replaceAll("\\s+", ""));
    }

    @Then("should see Twits Area Sixth Twit Tags: {string} on Home Page")
    public void shouldSeeTwitsAreaSixthTwitTagsOnHomePage(String tag) {
        String TwitsAreaSixthTwitTags = homePage.checkTwitsAreaSixthTwitTags();
        Assert.assertEquals(TwitsAreaSixthTwitTags, tag);
    }

    @Then("should see Favorites Area Title: {string} on Home Page")
    public void shouldSeeFavoritesAreaTitleOnHomePage(String title) {
        String FavoritesAreaTitle = homePage.checkFavoritesAreaTitle();
        Assert.assertEquals(FavoritesAreaTitle, title);
    }

    @Then("should see Favorites Area First Product Image on Home Page")
    public void shouldSeeFavoritesAreaFirstProductImageOnHomePage() {
        homePage.checkFavoritesAreaFirstProductName();
    }

    @Then("should see Favorites Area First Product Name: {string} on Home Page")
    public void shouldSeeFavoritesAreaFirstProductNameOnHomePage(String name) {
        String FavoritesAreaFirstProductName = homePage.checkFavoritesAreaFirstProductName();
        Assert.assertEquals(FavoritesAreaFirstProductName, name);
    }

    @Then("should see Favorites Area First Product Price: {string} on Home Page")
    public void shouldSeeFavoritesAreaFirstProductPriceOnHomePage(String price) {
        String FavoritesAreaFirstProductPrice = homePage.checkFavoritesAreaFirstProductPrice();
        Assert.assertEquals(FavoritesAreaFirstProductPrice, price);
    }

    @Then("should see Favorites Area Second Product Image on Home Page")
    public void shouldSeeFavoritesAreaSecondProductImageOnHomePage() {
        homePage.checkFavoritesAreaSecondProductImage();
    }

    @Then("should see Favorites Area Second Product Name: {string} on Home Page")
    public void shouldSeeFavoritesAreaSecondProductNameOnHomePage(String name) {
        String FavoritesAreaSecondProductName = homePage.checkFavoritesAreaSecondProductName();
        Assert.assertEquals(FavoritesAreaSecondProductName, name);
    }

    @Then("should see Favorites Area Second Product Price: {string} on Home Page")
    public void shouldSeeFavoritesAreaSecondProductPriceOnHomePage(String price) {
        String FavoritesAreaSecondProductPrice = homePage.checkFavoritesAreaSecondProductPrice();
        Assert.assertEquals(FavoritesAreaSecondProductPrice, price);
    }

    @Then("should see Favorites Area Third Product Image on Home Page")
    public void shouldSeeFavoritesAreaThirdProductImageOnHomePage() {
        homePage.checkFavoritesAreaThirdProductImage();
    }

    @Then("should see Favorites Area Third Product Name: {string} on Home Page")
    public void shouldSeeFavoritesAreaThirdProductNameOnHomePage(String name) {
        String FavoritesAreaThirdProductName = homePage.checkFavoritesAreaThirdProductName();
        Assert.assertEquals(FavoritesAreaThirdProductName, name);
    }

    @Then("should see Favorites Area Third Product Price: {string} on Home Page")
    public void shouldSeeFavoritesAreaThirdProductPriceOnHomePage(String price) {
        String FavoritesAreaThirdProductPrice = homePage.checkFavoritesAreaThirdProductPrice();
        Assert.assertEquals(FavoritesAreaThirdProductPrice, price);
    }

    @Then("should see Favorites Area Fourth Product Image on Home Page")
    public void shouldSeeFavoritesAreaFourthProductImageOnHomePage() {
        homePage.checkFavoritesAreaFourthProductImage();
    }

    @Then("should see Favorites Area Fourth Product Name: {string} on Home Page")
    public void shouldSeeFavoritesAreaFourthProductNameOnHomePage(String name) {
        String FavoritesAreaFourthProductName = homePage.checkFavoritesAreaFourthProductName();
        Assert.assertEquals(FavoritesAreaFourthProductName, name);

    }

    @Then("should see Favorites Area Fourth Product Price: {string} on Home Page")
    public void shouldSeeFavoritesAreaFourthProductPriceOnHomePage(String price) {
        String FavoritesAreaFourthProductPrice = homePage.checkFavoritesAreaFourthProductPrice();
        Assert.assertEquals(FavoritesAreaFourthProductPrice, price);

    }

    @Then("should see Testimonals Area Title: {string} on Home Page")
    public void shouldSeeTestimonalsAreaTitleOnHomePage(String title) {
        String TestimonalsAreaTitle = homePage.checkTestimonalsAreaTitle();
        Assert.assertEquals(TestimonalsAreaTitle, title);
    }

    @Then("should see Testimonals Area First Testimonal Star Icon on Home Page")
    public void shouldSeeTestimonalsAreaFirstTestimonalStarIconOnHomePage() {
        homePage.checkTestimonalsAreaFirstTestimonalStarIcon();
    }

    @Then("should see Testimonals Area First Testimonal Text: {string} on Home Page")
    public void shouldSeeTestimonalsAreaFirstTestimonalTextOnHomePage(String text) {
        String TestimonalsAreaFirstTestimonalText = homePage.checkTestimonalsAreaFirstTestimonalText();
        Assert.assertEquals(TestimonalsAreaFirstTestimonalText, text);
    }

    @Then("should see Testimonals Area First Testimonal Person: {string} on Home Page")
    public void shouldSeeTestimonalsAreaFirstTestimonalPersonOnHomePage(String person) {
        String TestimonalsAreaFirstTestimonalPerson = homePage.checkTestimonalsAreaFirstTestimonalPerson();
        Assert.assertEquals(TestimonalsAreaFirstTestimonalPerson, person);
    }

    @Then("should see Testimonals Area Second Testimonal Star Icon on Home Page")
    public void shouldSeeTestimonalsAreaSecondTestimonalStarIconOnHomePage() {
        homePage.checkTestimonalsAreaSecondTestimonalStarIcon();
    }

    @Then("should see Testimonals Area Second Testimonal Text: {string} on Home Page")
    public void shouldSeeTestimonalsAreaSecondTestimonalTextOnHomePage(String text) {
        String TestimonalsAreaSecondTestimonalText = homePage.checkTestimonalsAreaSecondTestimonalText();
        Assert.assertEquals(TestimonalsAreaSecondTestimonalText, text);
    }

    @Then("should see Testimonals Area Second Testimonal Person: {string} on Home Page")
    public void shouldSeeTestimonalsAreaSecondTestimonalPersonOnHomePage(String person) {
        String TestimonalsAreaSecondTestimonalPerson = homePage.checkTestimonalsAreaSecondTestimonalPerson();
        Assert.assertEquals(TestimonalsAreaSecondTestimonalPerson, person);
    }

    @Then("should see Testimonals Area Third Testimonal Star Icon on Home Page")
    public void shouldSeeTestimonalsAreaThirdTestimonalStarIconOnHomePage() {
        homePage.checkTestimonalsAreaThirdTestimonalText();
    }

    @Then("should see Testimonals Area Third Testimonal Text: {string} on Home Page")
    public void shouldSeeTestimonalsAreaThirdTestimonalTextOnHomePage(String text) {
        String TestimonalsAreaThirdTestimonalText = homePage.checkTestimonalsAreaThirdTestimonalText();
        Assert.assertEquals(TestimonalsAreaThirdTestimonalText, text);
    }

    @Then("should see Testimonals Area Third Testimonal Person: {string} on Home Page")
    public void shouldSeeTestimonalsAreaThirdTestimonalPersonOnHomePage(String person) {
        String TestimonalsAreaThirdTestimonalPerson = homePage.checkTestimonalsAreaThirdTestimonalPerson();
        Assert.assertEquals(TestimonalsAreaThirdTestimonalPerson, person);
    }

    @Then("should see Testimonals Area Left Icon on Home Page")
    public void shouldSeeTestimonalsAreaLeftIconOnHomePage() {
        homePage.checkTestimonalsAreaLeftIcon();
    }

    @Then("should see Testimonals Area Right Icon on Home Page")
    public void shouldSeeTestimonalsAreaRightIconOnHomePage() {
        homePage.TestimonalsAreaRightIcon();
    }

    @Then("should see Favorites Area First Product Discount Price: {string} on Home Page")
    public void shouldSeeFavoritesAreaFirstProductDiscountPriceOnHomePage(String price) {
        String FavoritesAreaFirstProductDiscountPrice = homePage.checkFavoritesAreaFirstProductDiscountPrice();
        Assert.assertEquals(FavoritesAreaFirstProductDiscountPrice, price);
    }

    @Then("should see Favorites Area Second Product Discount Price: {string} on Home Page")
    public void shouldSeeFavoritesAreaSecondProductDiscountPriceOnHomePage(String price) {
        String FavoritesAreaSecondProductDiscountPrice = homePage.checkFavoritesAreaSecondProductDiscountPrice();
        Assert.assertEquals(FavoritesAreaSecondProductDiscountPrice, price);
    }

    @Then("should see Favorites Area Third Product Discount Price: {string} on Home Page")
    public void shouldSeeFavoritesAreaThirdProductDiscountPriceOnHomePage(String price) {
        String FavoritesAreaThirdProductDiscountPrice = homePage.checkFavoritesAreaThirdProductDiscountPrice();
        Assert.assertEquals(FavoritesAreaThirdProductDiscountPrice, price);
    }

    @Then("should see Favorites Area Fourth Product Discount Price: {string} on Home Page")
    public void shouldSeeFavoritesAreaFourthProductDiscountPriceOnHomePage(String price) {
        String FavoritesAreaFourthProductDiscountPrice = homePage.checkFavoritesAreaFourthProductDiscountPrice();
        Assert.assertEquals(FavoritesAreaFourthProductDiscountPrice, price);
    }

    @Then("should see the Store Selection Page")
    public void shouldSeeTheStoreSelectionPage() {
        homePage.checkStoreSelectionPage();
    }
    @Then("should see Name: {string} on Store Selection Page")
    public void shouldSeeNameOnStoreSelectionPage(String title) {
        String pageTitle = homePage.checkTitleOnStoreSelectionPage();
        Assert.assertEquals(pageTitle, title);
    }

}
