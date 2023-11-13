package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class HomePage {
    private ElementHelper elementHelper;

    private final By HomePageAreaTitle = By.cssSelector("p.tracking-wide.font-butler");
    private final By HomePageAreaDesc = By.cssSelector(".animate-pulse.font-normal");
    private final By HomePageAreaShopNowButton = By.cssSelector(".bg-transparent");
    private final By HomePageAreaFacebookButton = By.cssSelector(".space-x-4.pl-4>a:nth-child(1)");
    private final By HomePageAreaInstagramButton = By.cssSelector(".space-x-4.pl-4>a:nth-child(2)");
    private final By HomePageAreaTwitterButton = By.cssSelector(".space-x-4.pl-4>a:nth-child(3)");
    private final By CoffeeAreaTitle = By.cssSelector("#offer-cards h2");
    private final By CoffeeAreaImage = By.cssSelector("[src='/offer-bg.webp']");
    private final By CoffeeAreaLeftUpImage = By.cssSelector("[src='/aromas.webp']");
    private final By CoffeeAreaLeftUpText = By.cssSelector("div>div.flex.flex-col.justify-around:nth-child(1)>div:nth-child(1)>span.uppercase.font-sans.font-extrabold");
    private final By CoffeeAreaLeftDownImage = By.cssSelector("[src='/finest.webp']");
    private final By CoffeeAreaLeftDownText = By.cssSelector("div>div.flex.flex-col.justify-around:nth-child(1)>div:nth-child(2)>span.uppercase.font-sans.font-extrabold");
    private final By CoffeeAreaRightUpImage = By.cssSelector("[src='/grade.webp']");
    private final By CoffeeAreaRightUpText = By.cssSelector("div>div.flex.flex-col.justify-around:nth-child(3)>div:nth-child(1)>span.uppercase.font-sans.font-extrabold");
    private final By CoffeeAreaRightDownImage = By.cssSelector("[src='/various.webp']");
    private final By CoffeeAreaRightDownText = By.cssSelector("div>div.flex.flex-col.justify-around:nth-child(3)>div:nth-child(2)>span.uppercase.font-sans.font-extrabold");


    private final By FirstProductAddButton = By.cssSelector(".bg-white.w-full>div>div:nth-child(1) .absolute.-top-7.z-10  path");
    private final By SecondProductAddButton = By.cssSelector(".bg-white.w-full>div>div:nth-child(2) .absolute.-top-7.z-10  path");
    private final By ThirdProductAddButton = By.cssSelector(".bg-white.w-full>div>div:nth-child(3) .absolute.-top-7.z-10  path");
    private final By FourthProductAddButton = By.cssSelector(".bg-white.w-full>div>div:nth-child(4) .absolute.-top-7.z-10  path");
    private final By ProductsAreaShowAllProductsButton = By.cssSelector(".w-64");
    private final By SustainabilityAreaReadMoreButton = By.cssSelector(".w-40.uppercase");
    private final By WhosaleAreaWhosaleButton = By.cssSelector(".flex.items-center.rounded-sm.uppercase.text-white.px-4.mt-8");
    private final By BlogAreaButton = By.cssSelector("#testimonialsSlide > div:nth-of-type(1) #arrow-btn");
    private final By BrewGuidesAreaButton = By.cssSelector("#testimonialsSlide > div:nth-of-type(2) #arrow-btn");
    private final By TwitsAreaFirstTwitInstagramIcon = By.cssSelector("#social-section > .flex > div:nth-of-type(1) #instagram-icon > [width='25']");
    private final By TwitsAreaSecondTwitTwitterIcon = By.cssSelector("#social-section > .flex > div:nth-of-type(1) #twitter-icon > [width='25']");
    private final By TwitsAreaThirdTwitTwitterIcon = By.cssSelector("#social-section div:nth-of-type(1) > #twitter-icon");
    private final By TwitsAreaFourthTwitInstagramIcon = By.cssSelector("#social-section div:nth-of-type(2) > #instagram-icon");
    private final By TwitsAreaFifthTwitInstagramIcon = By.cssSelector("#social-section div:nth-of-type(3) #instagram-icon");
    private final By TwitsAreaSixthTwitTwitterIcon = By.cssSelector("#social-section div:nth-of-type(3) #twitter-icon > [width='25']");
    private final By FavoritesAreaTitle = By.cssSelector("div>div#customer-favorites>div>h3.uppercase");
    private final By FavoritesAreaFirstProductImage = By.cssSelector("#customer-favorites .grid.grid-cols-2.gap-4.px-4.pt-8.mb-16>div:nth-child(1) img");
    private final By FavoritesAreaFourthProductImage = By.cssSelector("#customer-favorites .grid.grid-cols-2.gap-4.px-4.pt-8.mb-16>div:nth-child(4) img");
    private final By FavoritesAreaThirdProductImage = By.cssSelector("#customer-favorites .grid.grid-cols-2.gap-4.px-4.pt-8.mb-16>div:nth-child(3) img");
    private final By FavoritesAreaSecondProductImage = By.cssSelector("#customer-favorites .grid.grid-cols-2.gap-4.px-4.pt-8.mb-16>div:nth-child(2) img");
    private final By FavoritesAreaFirstProductName = By.cssSelector("#customer-favorites .grid.grid-cols-2.gap-4.px-4.pt-8.mb-16>div:nth-child(1) span.text-center");
    private final By FavoritesAreaSecondProductName = By.cssSelector("#customer-favorites .grid.grid-cols-2.gap-4.px-4.pt-8.mb-16>div:nth-child(2) span.text-center");
    private final By FavoritesAreaThirdProductName = By.cssSelector("#customer-favorites .grid.grid-cols-2.gap-4.px-4.pt-8.mb-16>div:nth-child(3) span.text-center");
    private final By FavoritesAreaFourthProductName = By.cssSelector("#customer-favorites .grid.grid-cols-2.gap-4.px-4.pt-8.mb-16>div:nth-child(4) span.text-center");
    private final By FavoritesAreaFirstProductPrice = By.cssSelector("#customer-favorites .grid.grid-cols-2.gap-4.px-4.pt-8.mb-16>div:nth-child(1) p");
    private final By FavoritesAreaSecondProductPrice = By.cssSelector("#customer-favorites .grid.grid-cols-2.gap-4.px-4.pt-8.mb-16>div:nth-child(2) p");
    private final By FavoritesAreaThirdProductPrice = By.cssSelector("#customer-favorites .grid.grid-cols-2.gap-4.px-4.pt-8.mb-16>div:nth-child(3) p");
    private final By FavoritesAreaFourthProductPrice = By.cssSelector("#customer-favorites .grid.grid-cols-2.gap-4.px-4.pt-8.mb-16>div:nth-child(4) p");
    private final By FavoritesAreaFirstProductAddButton = By.cssSelector("#customer-favorites .grid.grid-cols-2.gap-4.px-4.pt-8.mb-16>div:nth-child(1) button");
    private final By FavoritesAreaSecondProductAddButton = By.cssSelector("#customer-favorites .grid.grid-cols-2.gap-4.px-4.pt-8.mb-16>div:nth-child(2) button");
    private final By FavoritesAreaThirdProductAddButton = By.cssSelector("#customer-favorites .grid.grid-cols-2.gap-4.px-4.pt-8.mb-16>div:nth-child(3) button");
    private final By FavoritesAreaFourthProductAddButton = By.cssSelector("#customer-favorites .grid.grid-cols-2.gap-4.px-4.pt-8.mb-16>div:nth-child(4) button");
    private final By FavoritesAreaFirstProductDiscountPrice = By.cssSelector("#customer-favorites .grid.grid-cols-2.gap-4.px-4.pt-8.mb-16>div:nth-child(1) p.font-black");
    private final By FavoritesAreaSecondProductDiscountPrice = By.cssSelector("#customer-favorites .grid.grid-cols-2.gap-4.px-4.pt-8.mb-16>div:nth-child(2) p.font-black");
    private final By FavoritesAreaThirdProductDiscountPrice = By.cssSelector("#customer-favorites .grid.grid-cols-2.gap-4.px-4.pt-8.mb-16>div:nth-child(3) p.font-black");
    private final By FavoritesAreaFourthProductDiscountPrice = By.cssSelector("#customer-favorites .grid.grid-cols-2.gap-4.px-4.pt-8.mb-16>div:nth-child(4) p.font-black");
    private final By HomePageAreaImage = By.cssSelector(".relative.grid.h-full.w-screen.object-cover.bg-center.shadow-lg.shadow-navbar-bg");
    private final By ProductsAreaFourthProductName = By.cssSelector(".grid.grid-cols-2.gap-8>div:nth-child(4)>div>div>p");
    private final By HomePageAreaFacebookIcon = By.cssSelector("[viewBox='0 0 24 39']");
    private final By HomePageAreaTwitterIcon = By.cssSelector("[viewBox='0 0 48 38']");
    private final By DreamAreaImage = By.cssSelector("[alt='about']");
    private final By DreamAreaText = By.cssSelector(".text-white.text-xl.font-extrabold.font-butler");
    private final By DreamAreaDescription = By.cssSelector(".text-white.italic.font-medium.mb-4");
    private final By DreamAreaExplanation = By.cssSelector("div p.text-white.font-poppins:nth-child(3)");
    private final By ProductsAreaTitle = By.cssSelector("#__next .w-full > .font-bold");
    private final By ProductsAreaFirstProductImage = By.cssSelector(".w-full[alt='Traum Kickstart Capsule Coffee x 10']");
    private final By ProductsAreaFirstProductAddButton = By.cssSelector(".gap-8.grid > div:nth-of-type(1) circle:nth-of-type(1)");
    private final By ProductsAreaFirstProductName = By.cssSelector(".grid.grid-cols-2.gap-8>div:nth-child(1)>div>div>p");
    private final By ProductsAreaFirstProductPrice = By.cssSelector(".grid.grid-cols-2.gap-8>div:nth-child(1)>div>div div.flex.flex-row.gap-1>p");
    private final By ProductsAreaFirstProductDiscountPrice = By.cssSelector(".gap-8.grid > div:nth-of-type(1) p:nth-of-type(2)");
    private final By ProductsAreaSecondProductImage = By.cssSelector(".w-full[alt='Kenya Capsule Coffee x10']");
    private final By ProductsAreaSecondProductAddButton = By.cssSelector(".gap-8.grid > div:nth-of-type(2) circle:nth-of-type(1)");
    private final By ProductsAreaSecondProductName = By.cssSelector(".grid.grid-cols-2.gap-8>div:nth-child(2)>div>div>p");
    private final By ProductsAreaSecondProductPrice = By.cssSelector(".grid.grid-cols-2.gap-8>div:nth-child(2)>div>div div.flex.flex-row.gap-1>p");
    private final By ProductsAreaSecondProductDiscountPrice = By.cssSelector(".gap-8.grid > div:nth-of-type(2) p:nth-of-type(2)");
    private final By ProductsAreaThirdProductImage = By.cssSelector(".w-full[alt='Chocolate Colombia Coffee']");
    private final By ProductsAreaThirdProductAddButton = By.cssSelector(".gap-8.grid > div:nth-of-type(3) circle:nth-of-type(1)");
    private final By ProductsAreaThirdProductName = By.cssSelector(".grid.grid-cols-2.gap-8>div:nth-child(3)>div>div>p");
    private final By ProductsAreaThirdProductPrice = By.cssSelector(".grid.grid-cols-2.gap-8>div:nth-child(3)>div>div div.flex.flex-row.gap-1>p");
    private final By ProductsAreaThirdProductDiscountPrice = By.cssSelector(".gap-8.grid > div:nth-of-type(3) p:nth-of-type(2)");
    private final By ProductsAreaFourthProductImage = By.cssSelector(".w-full[alt='Almond Colombia Coffee']");
    private final By ProductsAreaFourthProductAddButton = By.cssSelector(".gap-8.grid > div:nth-of-type(4) circle:nth-of-type(1)");
    private final By ProductsAreaFourthProductPrice = By.cssSelector(".grid.grid-cols-2.gap-8>div:nth-child(4)>div>div div.flex.flex-row.gap-1>p");
    private final By ProductsAreaFourthProductDiscountPrice = By.cssSelector(".gap-8.grid > div:nth-of-type(4) p:nth-of-type(2)");
    private final By ProductsAreaShowAllProducts = By.cssSelector("#readMoreBtn button");
    private final By SustainabilityAreaTitle = By.cssSelector("#about-banner div h3");
    private final By SustainabilityAreaDescription = By.cssSelector("#about-banner div p");
    private final By SustainabilityAreaImage = By.cssSelector("#about-banner div");
    private final By WhosaleAreaTitle = By.cssSelector(".flex.flex-col.justify-center.items-center>h3");
    private final By WhosaleAreaImage = By.cssSelector(".flex.flex-col.justify-center.items-center");
    private final By WhosaleAreaDescription = By.cssSelector(".flex.flex-col.justify-center.items-center>p");
    private final By WhosaleAreaWhosaleButtonImage = By.cssSelector(".flex.flex-col.justify-center.items-center>button");
    private final By BlogAreaTitle = By.cssSelector("#testimonialsSlide>div:nth-child(1) span.font-semibold");
    private final By BlogAreaImage = By.cssSelector("#testimonialsSlide>div:nth-child(1) img");
    private final By BrewGuidesAreaTitle = By.cssSelector("#testimonialsSlide>div:nth-child(2) span.font-semibold");
    private final By BrewGuidesAreaImage = By.cssSelector("#testimonialsSlide>div:nth-child(2) img");
    private final By TwitsAreaSecondTwitDescription = By.cssSelector("#social-section>div>div:nth-child(1) .text-center.max-w-sm.font-sans.italic.font-semibold");
    private final By TwitsAreaFirstTwitImage = By.cssSelector("#social-section>div>div:nth-child(1) span");
    private final By TwitsAreaSecondTwitTags = By.cssSelector("#social-section>div>div:nth-child(1) span.block");
    private final By TwitsAreaThirdTwitDescription = By.cssSelector("#social-section>div>div:nth-child(2) .text-center.max-w-sm.font-sans.italic.font-semibold");
    private final By TwitsAreaThirdTwitTags = By.cssSelector("#social-section>div>div:nth-child(2) span.block");
    private final By TwitsAreaFifthTwitImage = By.cssSelector("#social-section>div>div:nth-child(3)>div");
    private final By TwitsAreaSixthTwitDescription = By.cssSelector("#social-section>div>div:nth-child(3) .text-center.max-w-sm.font-sans.italic.font-semibold");
    private final By TwitsAreaSixthTwitTags = By.cssSelector("#social-section>div>div:nth-child(3) span.block");
    private final By TestimonalsAreaFirstTestimonalStarIcon = By.cssSelector(".swiper-wrapper>div:nth-child(1) #fiveStar");
    private final By TestimonalsAreaTitle = By.cssSelector("#testimonials>p");
    private final By TestimonalsAreaFirstTestimonalText = By.cssSelector(".swiper-wrapper>div:nth-child(1) span.text-center");
    private final By TestimonalsAreaFirstTestimonalPerson = By.cssSelector(".swiper-wrapper>div:nth-child(1) span.text-base");
    private final By TestimonalsAreaSecondTestimonalStarIcon = By.cssSelector(".swiper-wrapper>div:nth-child(2) #fiveStar");
    private final By TestimonalsAreaSecondTestimonalText = By.cssSelector(".swiper-wrapper>div:nth-child(2) span.text-center");
    private final By TestimonalsAreaSecondTestimonalPerson = By.cssSelector(".swiper-wrapper>div:nth-child(2) span.text-base");
    private final By TestimonalsAreaThirdTestimonalStarIcon = By.cssSelector(".swiper-wrapper>div:nth-child(3) #fiveStar");
    private final By TestimonalsAreaThirdTestimonalText = By.cssSelector(".swiper-wrapper>div:nth-child(3) span.text-center");
    private final By TestimonalsAreaThirdTestimonalPerson = By.cssSelector(".swiper-wrapper>div:nth-child(3) span.text-base");
    private final By TestimonalsAreaLeftIcon = By.cssSelector("#mySwiper>button:nth-child(2)>svg");
    private final By TestimonalsAreaRightIcon = By.cssSelector("#mySwiper>button:nth-child(3)>svg");


    public HomePage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    public void checkHomePage() {
        elementHelper.checkUrl("https://dev.traumkaffee.com/");
    }

    public String getHomePageAreaTitle() {
        return elementHelper.getText(HomePageAreaTitle);
    }

    public String getHomePageAreaDesc() {
        return elementHelper.getText(HomePageAreaDesc);
    }


    public void goToHomePage(String url) {
        elementHelper.openUrl(url);
    }

    public void clickHomePageAreaShopNowButton() {
        elementHelper.click(HomePageAreaShopNowButton);
    }

    public void clickHomePageAreaFacebookButton() {
        elementHelper.click(HomePageAreaFacebookButton);
    }

    public void clickHomePageAreaInstagramButton() {
        elementHelper.click(HomePageAreaInstagramButton);
    }

    public void clickHomePageAreaTwitterButton() {
        elementHelper.click(HomePageAreaTwitterButton);
    }

    public void clickFirstProductAddButton() {
        elementHelper.click(FirstProductAddButton);
    }

    public void clickSecondProductAddButton() {
        elementHelper.click(SecondProductAddButton);
    }

    public void clickThirdProductAddButton() {
        elementHelper.click(ThirdProductAddButton);
    }

    public void clickFourthProductAddButton() {
        elementHelper.click(FourthProductAddButton);
    }

    public void clickProductsAreaShowAllProductsButton() {
        elementHelper.click(ProductsAreaShowAllProductsButton);
    }

    public void clickSustainabilityAreaReadMoreButton() {
        elementHelper.click(SustainabilityAreaReadMoreButton);
    }

    public void clickWhosaleAreaWhosaleButton() {
        elementHelper.click(WhosaleAreaWhosaleButton);
    }

    public void clickBlogAreaButton() {
        elementHelper.click(BlogAreaButton);
    }

    public void clickBrewGuidesAreaButton() {
        elementHelper.click(BrewGuidesAreaButton);
    }

    public void clickTwitsAreaFirstTwitInstagramIcon() {
        elementHelper.click(TwitsAreaFirstTwitInstagramIcon);
    }

    public void clickTwitsAreaSecondTwitTwitterIcon() {
        elementHelper.click(TwitsAreaSecondTwitTwitterIcon);
    }

    public void clickTwitsAreaThirdTwitTwitterIcon() {
        elementHelper.click(TwitsAreaThirdTwitTwitterIcon);
    }

    public void clickTwitsAreaFourthTwitInstagramIcon() {
        elementHelper.click(TwitsAreaFourthTwitInstagramIcon);
    }

    public void clickTwitsAreaFifthTwitInstagramIcon() {
        elementHelper.click(TwitsAreaFifthTwitInstagramIcon);
    }

    public void clickTwitsAreaSixthTwitTwitterIcon() {
        elementHelper.click(TwitsAreaSixthTwitTwitterIcon);
    }

    public void clickFavoritesAreaFourthProductImage() {
        elementHelper.click(FavoritesAreaFourthProductImage);
    }

    public void clickFavoritesAreaThirdProductImage() {
        elementHelper.click(FavoritesAreaThirdProductImage);
    }

    public void clickFavoritesAreaSecondProductImage() {
        elementHelper.click(FavoritesAreaSecondProductImage);
    }

    public void clickFavoritesAreaFirstProductImage() {
        elementHelper.click(FavoritesAreaFirstProductImage);
    }

    public void clickFavoritesAreaSecondProductName() {
        elementHelper.click(FavoritesAreaSecondProductName);
    }

    public void clickFavoritesAreaFirstProductName() {
        elementHelper.click(FavoritesAreaFirstProductName);
    }

    public void clickFavoritesAreaThirdProductName() {
        elementHelper.click(FavoritesAreaThirdProductName);
    }

    public void clickFavoritesAreaFourthProductName() {
        elementHelper.click(FavoritesAreaFourthProductName);
    }

    public void clickFavoritesAreaFirstProductAddButton() {
        elementHelper.click(FavoritesAreaFirstProductAddButton);
    }

    public void clickFavoritesAreaSecondProductAddButton() {
        elementHelper.click(FavoritesAreaSecondProductAddButton);
    }

    public void clickFavoritesAreaThirdProductAddButton() {
        elementHelper.click(FavoritesAreaThirdProductAddButton);
    }

    public void clickFavoritesAreaFourthProductAddButton() {
        elementHelper.click(FavoritesAreaFourthProductAddButton);
    }

    public void checkHomePageAreaImage() {
        elementHelper.checkElement(HomePageAreaImage);
    }

    public void checkHomePageAreaFacebookIcon() {
        elementHelper.checkElement(HomePageAreaFacebookIcon);
    }

    public void checkHomePageAreaInstagramIcon() {
        elementHelper.checkElement(HomePageAreaInstagramButton);
    }

    public void checkHomePageAreaTwitterIcon() {
        elementHelper.checkElement(HomePageAreaTwitterIcon);
    }

    public String checkCoffeeAreaTitle() {
        return elementHelper.getText(CoffeeAreaTitle);
    }

    public void checkCoffeeAreaImage() {
        elementHelper.checkElement(CoffeeAreaImage);
    }

    public String checkCoffeeAreaLeftUpText() {
        return elementHelper.getText(CoffeeAreaLeftUpText);
    }

    public void checkCoffeeAreaLeftUpImage() {
        elementHelper.checkElement(CoffeeAreaLeftUpImage);
    }

    public String checkCoffeeAreaLeftDownText() {
        return elementHelper.getText(CoffeeAreaLeftDownText);
    }

    public void checkCoffeeAreaLeftDownImage() {
        elementHelper.checkElement(CoffeeAreaLeftDownImage);
    }

    public String checkCoffeeAreaRightUpText() {
        return elementHelper.getText(CoffeeAreaRightUpText);
    }

    public void checkCoffeeAreaRightUpImage() {
        elementHelper.checkElement(CoffeeAreaRightUpImage);
    }

    public String checkCoffeeAreaRightDownText() {
        return elementHelper.getText(CoffeeAreaRightDownText);
    }

    public void checkCoffeeAreaRightDownImage() {
        elementHelper.checkElement(CoffeeAreaRightDownImage);
    }

    public void checkDreamAreaImage() {
        elementHelper.checkElement(DreamAreaImage);
    }

    public String checkDreamAreaTitle() {
        return elementHelper.getText(DreamAreaText);
    }

    public String checkDreamAreaDescription() {
        return elementHelper.getText(DreamAreaDescription);
    }

    public String checkDreamAreaExplanation() {
        return elementHelper.getText(DreamAreaExplanation);
    }

    public String checkProductsAreaTitle() {
        return elementHelper.getText(ProductsAreaTitle);
    }

    public void checkProductsAreaFirstProductImage() {
        elementHelper.checkElement(ProductsAreaFirstProductImage);
    }

    public void checkProductsAreaFirstProductAddButton() {
        elementHelper.checkElement(ProductsAreaFirstProductAddButton);
    }

    public String checkProductsAreaFirstProductName() {
        return elementHelper.getText(ProductsAreaFirstProductName);
    }

    public String checkProductsAreaFirstProductPrice() {
        return elementHelper.getText(ProductsAreaFirstProductPrice);
    }

    public String checkProductsAreaFirstProductDiscountPrice() {
        return elementHelper.getText(ProductsAreaFirstProductDiscountPrice);
    }

    public void checkProductsAreaSecondProductImage() {
        elementHelper.checkElement(ProductsAreaSecondProductImage);
    }

    public void checkProductsAreaSecondProductAddButton() {
        elementHelper.checkElement(ProductsAreaSecondProductAddButton);
    }

    public String checkProductsAreaSecondProductName() {
        return elementHelper.getText(ProductsAreaSecondProductName);
    }

    public String checkProductsAreaSecondProductPrice() {
        return elementHelper.getText(ProductsAreaSecondProductPrice);
    }

    public String checkProductsAreaSecondProductDiscountPrice() {
        return elementHelper.getText(ProductsAreaSecondProductDiscountPrice);
    }

    public void checkProductsAreaThirdProductImage() {
        elementHelper.checkElement(ProductsAreaThirdProductImage);
    }

    public void checkProductsAreaThirdProductAddButton() {
        elementHelper.checkElement(ProductsAreaThirdProductAddButton);
    }

    public String checkProductsAreaThirdProductName() {
        return elementHelper.getText(ProductsAreaThirdProductName);
    }

    public String checkProductsAreaThirdProductPrice() {
        return elementHelper.getText(ProductsAreaThirdProductPrice);
    }

    public String checkProductsAreaThirdProductDiscountPrice() {
        return elementHelper.getText(ProductsAreaThirdProductDiscountPrice);
    }

    public void checkProductsAreaFourthProductImage() {
        elementHelper.checkElement(ProductsAreaFourthProductImage);
    }

    public void checkProductsAreaFourthProductAddButton() {
        elementHelper.checkElement(ProductsAreaFourthProductAddButton);
    }

    public String checkProductsAreaFourthProductName() {
        return elementHelper.getText(ProductsAreaFourthProductName);
    }

    public String checkProductsAreaFourthProductPrice() {
        return elementHelper.getText(ProductsAreaFourthProductPrice);
    }

    public String checkProductsAreaFourthProductDiscountPrice() {
        return elementHelper.getText(ProductsAreaFourthProductDiscountPrice);
    }

    public String checkProductsAreaShowAllProducts() {
        return elementHelper.getText(ProductsAreaShowAllProducts);
    }

    public String checkSustainabilityAreaTitle() {
        return elementHelper.getText(SustainabilityAreaTitle);
    }

    public String checkSustainabilityAreaDescription() {
        return elementHelper.getText(SustainabilityAreaDescription);
    }

    public String checkSustainabilityAreaReadMoreButton() {
        return elementHelper.getText(SustainabilityAreaReadMoreButton);
    }

    public void checkSustainabilityAreaImage() {
        elementHelper.checkElement(SustainabilityAreaImage);
    }

    public String checkWhosaleAreaTitle() {
        return elementHelper.getText(WhosaleAreaTitle);
    }

    public String checkWhosaleAreaDescription() {
        return elementHelper.getText(WhosaleAreaDescription);
    }

    public void checkWhosaleAreaImage() {
        elementHelper.checkElement(WhosaleAreaImage);
    }

    public String checkWhosaleAreaWhosaleButton() {
        return elementHelper.getText(WhosaleAreaWhosaleButton);
    }

    public void checkWhosaleAreaWhosaleButtonImage() {
        elementHelper.checkElement(WhosaleAreaWhosaleButtonImage);
    }

    public String checkBlogAreaTitle() {
        return elementHelper.getText(BlogAreaTitle);
    }

    public void checkBlogAreaImage() {
        elementHelper.checkElement(BlogAreaImage);
    }

    public void checkBlogAreaButton() {
        elementHelper.checkElement(BlogAreaButton);
    }

    public String checkBrewGuidesAreaTitle() {
        return elementHelper.getText(BrewGuidesAreaTitle);
    }

    public void checkBrewGuidesAreaImage() {
        elementHelper.checkElement(BrewGuidesAreaImage);
    }

    public void checkBrewGuidesAreaButton() {
        elementHelper.checkElement(BrewGuidesAreaButton);

    }

    public void checkTwitsAreaFirstTwitImage() {
        elementHelper.checkElement(TwitsAreaFirstTwitImage);
    }

    public void checkTwitsAreaFirstTwitInstagramIcon() {
        elementHelper.checkElement(TwitsAreaFirstTwitInstagramIcon);
    }

    public void checkTwitsAreaSecondTwitTwitterIcon() {
        elementHelper.checkElement(TwitsAreaSecondTwitTwitterIcon);
    }

    public String checkTwitsAreaSecondTwitDescription() {
        return elementHelper.getText(TwitsAreaSecondTwitDescription);
    }

    public String checkTwitsAreaSecondTwitTags() {
        return elementHelper.getText(TwitsAreaSecondTwitTags);
    }

    public void checkTwitsAreaThirdTwitTwitterIcon() {
        elementHelper.checkElement(TwitsAreaThirdTwitTwitterIcon);
    }

    public String checkTwitsAreaThirdTwitDescription() {
        return elementHelper.getText(TwitsAreaThirdTwitDescription);
    }

    public String checkTwitsAreaThirdTwitTags() {
        return elementHelper.getText(TwitsAreaThirdTwitTags);
    }

    public void checkTwitsAreaFourthTwitImage() {
        elementHelper.checkElement(TwitsAreaFirstTwitImage);
    }

    public void checkTwitsAreaFourthTwitInstagramIcon() {
        elementHelper.checkElement(TwitsAreaFourthTwitInstagramIcon);
    }

    public void checkTwitsAreaFifthTwitImage() {
        elementHelper.checkElement(TwitsAreaFifthTwitImage);
    }

    public void checkTwitsAreaFifthTwitInstagramIcon() {
        elementHelper.checkElement(TwitsAreaFifthTwitInstagramIcon);
    }

    public void checkTwitsAreaSixthTwitTwitterIcon() {
        elementHelper.checkElement(TwitsAreaSixthTwitTwitterIcon);
    }

    public String checkTwitsAreaSixthTwitDescription() {
        return elementHelper.getText(TwitsAreaSixthTwitDescription);
    }

    public String checkTwitsAreaSixthTwitTags() {
        return elementHelper.getText(TwitsAreaSixthTwitTags);
    }

    public String checkFavoritesAreaTitle() {
        return elementHelper.getText(FavoritesAreaTitle);
    }

    public String checkFavoritesAreaFirstProductName() {
        return elementHelper.getText(FavoritesAreaFirstProductName);
    }

    public String checkFavoritesAreaFirstProductPrice() {
        return elementHelper.getText(FavoritesAreaFirstProductPrice);
    }

    public void checkFavoritesAreaFirstProductAddButton() {
        elementHelper.checkElement(FavoritesAreaFirstProductAddButton);
    }

    public void checkFavoritesAreaSecondProductImage() {
        elementHelper.checkElement(FavoritesAreaSecondProductImage);
    }

    public String checkFavoritesAreaSecondProductName() {
        return elementHelper.getText(FavoritesAreaSecondProductName);
    }

    public String checkFavoritesAreaSecondProductPrice() {
        return elementHelper.getText(FavoritesAreaSecondProductPrice);
    }

    public void checkFavoritesAreaSecondProductAddButton() {
        elementHelper.checkElement(FavoritesAreaSecondProductAddButton);
    }

    public void checkFavoritesAreaThirdProductImage() {
        elementHelper.checkElement(FavoritesAreaSecondProductImage);
    }

    public String checkFavoritesAreaThirdProductName() {
        return elementHelper.getText(FavoritesAreaThirdProductName);
    }

    public String checkFavoritesAreaThirdProductPrice() {
        return elementHelper.getText(FavoritesAreaThirdProductPrice);
    }

    public void checkFavoritesAreaThirdProductAddButton() {
        elementHelper.checkElement(FavoritesAreaThirdProductAddButton);
    }

    public void checkFavoritesAreaFourthProductImage() {
        elementHelper.checkElement(FavoritesAreaFourthProductImage);
    }

    public String checkFavoritesAreaFourthProductName() {
        return elementHelper.getText(FavoritesAreaFourthProductName);
    }

    public String checkFavoritesAreaFourthProductPrice() {
        return elementHelper.getText(FavoritesAreaFourthProductPrice);
    }

    public void checkFavoritesAreaFourthProductAddButton() {
        elementHelper.checkElement(FavoritesAreaFourthProductAddButton);
    }

    public String checkTestimonalsAreaTitle() {
        return elementHelper.getText(TestimonalsAreaTitle);
    }

    public void checkTestimonalsAreaFirstTestimonalStarIcon() {
        elementHelper.checkElement(TestimonalsAreaFirstTestimonalStarIcon);
    }

    public String checkTestimonalsAreaFirstTestimonalText() {
        return elementHelper.getText(TestimonalsAreaFirstTestimonalText);
    }

    public String checkTestimonalsAreaFirstTestimonalPerson() {
        return elementHelper.getText(TestimonalsAreaFirstTestimonalPerson);
    }

    public void checkTestimonalsAreaSecondTestimonalStarIcon() {
        elementHelper.checkElement(TestimonalsAreaSecondTestimonalStarIcon);
    }

    public String checkTestimonalsAreaSecondTestimonalText() {
        return elementHelper.getText(TestimonalsAreaSecondTestimonalText);
    }

    public String checkTestimonalsAreaSecondTestimonalPerson() {
        return elementHelper.getText(TestimonalsAreaSecondTestimonalPerson);
    }

    public void checkTestimonalsAreaThirdTestimonalStarIcon() {
        elementHelper.checkElement(TestimonalsAreaThirdTestimonalStarIcon);
    }

    public String checkTestimonalsAreaThirdTestimonalText() {
        return elementHelper.getText(TestimonalsAreaThirdTestimonalText);
    }

    public String checkTestimonalsAreaThirdTestimonalPerson() {
        return elementHelper.getText(TestimonalsAreaThirdTestimonalPerson);
    }

    public void checkTestimonalsAreaLeftIcon() {
        elementHelper.checkElement(TestimonalsAreaLeftIcon);
    }

    public void TestimonalsAreaRightIcon() {
        elementHelper.checkElement(TestimonalsAreaRightIcon);
    }

    public String checkFavoritesAreaFirstProductDiscountPrice() {
        return elementHelper.getText(FavoritesAreaFirstProductDiscountPrice);
    }

    public String checkFavoritesAreaSecondProductDiscountPrice() {
        return elementHelper.getText(FavoritesAreaSecondProductDiscountPrice);
    }

    public String checkFavoritesAreaThirdProductDiscountPrice() {
        return elementHelper.getText(FavoritesAreaThirdProductDiscountPrice);
    }

    public String checkFavoritesAreaFourthProductDiscountPrice() {
        return elementHelper.getText(FavoritesAreaFourthProductDiscountPrice);
    }

    public void clickFirstProductsNameInTheProductsArea() {
        elementHelper.click(ProductsAreaFirstProductName);
    }

    public void clickFirstProductsImageInTheProductsArea() {
        elementHelper.click(ProductsAreaFirstProductImage);
    }

    public void clickFirstProductsPriceInTheProductsArea() {
        elementHelper.click(ProductsAreaFirstProductPrice);
    }

    public void clickSecondProductsImageInTheProductsArea() {
        elementHelper.click(ProductsAreaSecondProductImage);
    }

    public void clickSecondProductsNameInTheProductsArea() {
        elementHelper.click(ProductsAreaSecondProductName);
    }

    public void clickSecondProductsPriceInTheProductsArea() {
        elementHelper.click(ProductsAreaSecondProductPrice);
    }

    public void clickThirdProductsImageInTheProductsArea() {
        elementHelper.click(ProductsAreaThirdProductImage);
    }

    public void clickThirdProductsNameInTheProductsArea() {
        elementHelper.click(ProductsAreaThirdProductName);
    }

    public void clickThirdProductsPriceInTheProductsArea() {
        elementHelper.click(ProductsAreaThirdProductPrice);
    }

    public void clickFourthProductsImageInTheProductsArea() {
        elementHelper.click(ProductsAreaFourthProductImage);
    }

    public void clickFourthProductsNameInTheProductsArea() {
        elementHelper.click(ProductsAreaFourthProductName);
    }

    public void clickFourthProductsPriceInTheProductsArea() {
        elementHelper.click(ProductsAreaFourthProductPrice);
    }

    public void clickFourthProductsPriceInTheFavoritesArea() {
        elementHelper.click(FavoritesAreaFourthProductPrice);
    }

    public void clickThirdProductsPriceInTheFavoritesArea() {
        elementHelper.click(FavoritesAreaThirdProductPrice);
    }

    public void clickSecondProductsPriceInTheFavoritesArea() {
        elementHelper.click(FavoritesAreaSecondProductPrice);
    }

    public void clickFirstProductsPriceInTheFavoritesArea() {
        elementHelper.click(FavoritesAreaFirstProductPrice);
    }

}













