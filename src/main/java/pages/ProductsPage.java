package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ProductsPage {
    private ElementHelper elementHelper;

    private By title = By.id("");

    public ProductsPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }
    private String url = "https://dev.traumkaffee.com/products";
    private By ProductAreaProductImage=By.cssSelector("#products-cards>div:nth-child(1)>div:nth-child(1)");
    private By ProductAreaBrewGuidesImage=By.cssSelector(".my-16>div:nth-child(1)>div:nth-child(1)");
    private By ProductAreaBlogImage=By.cssSelector(".my-16>div:nth-child(2)>div:nth-child(1)");
    private By CategoriesAreaTitle=By.cssSelector("#wrapper>div>h3");
    private By CategoriesAreaShopAll =By.cssSelector("#wrapper>div>ul span label");
    private By CategoriesAreaShopAllCheckbox=By.cssSelector("#wrapper>div>ul span input");
    private By CategoriesAreaGroundCoffees=By.cssSelector("#wrapper>div>ul>li:nth-child(2) label");
    private By CategoriesAreaGroundCoffeesCheckbox=By.cssSelector("#wrapper>div>ul>li:nth-child(2) input");
    private By CategoriesAreaCapsulesCoffees=By.cssSelector("#wrapper>div>ul>li:nth-child(3) label");
    private By CategoriesAreaCapsulesCoffeesCheckbox=By.cssSelector("#wrapper>div>ul>li:nth-child(3) input");
    private By CategoriesAreaDripCoffees=By.cssSelector("#wrapper>div>ul>li:nth-child(4) label");
    private By CategoriesAreaDripCoffeesCheckbox=By.cssSelector("#wrapper>div>ul>li:nth-child(4) input");
    private By SearchAreaTextbox=By.cssSelector("#default-search");
    private By SearchAreaImage=By.cssSelector("#search-bar>div>div>div");
    private By SearchAreaCloseIcon=By.cssSelector(".mr-0.px-5");
    private By SearchAreaSearchingResultsForHeader=By.cssSelector(".ml-4.mt-4>span:nth-child(2)");
    private By SearchAreaSearchingResultsFor=By.cssSelector(".ml-4.mt-4>span:nth-child(1)");
    private By ProductAreaProductTag=By.cssSelector("#products-cards>div:nth-child(1)>div:nth-child(2)>div:nth-child(1)>div");
    private By ProductAreaProductName=By.cssSelector("#products-cards>div:nth-child(1)>div:nth-child(2)>div:nth-child(2)>p:nth-child(1)");
    private By ProductAreaProductDescription=By.cssSelector("#products-cards>div:nth-child(1)>div:nth-child(2)>div:nth-child(2)>p:nth-child(2)");
    private By ProductAreaProductPrice=By.cssSelector("#products-cards>div:nth-child(1)>div:nth-child(2)>div:nth-child(3)>p");
    private By ProductAreaShowMoreButton=By.cssSelector(".flex.justify-center.items-center:nth-child(3) button");
    private By ProductAreaBrewGuidesText=By.cssSelector(".my-16.px-0>div:nth-child(1)>div:nth-child(1)>h2");
    private By ProductAreaBlogTitle=By.cssSelector(".my-16.px-0>div:nth-child(2)>div:nth-child(2)>h2");
    private By ProductAreaBrewGuidesVisit=By.cssSelector(".my-16.px-0>div:nth-child(1)>div:nth-child(2)>button");
    private By ProductAreaBlogText = By.cssSelector(".my-16.px-0>div:nth-child(2)>div:nth-child(1)>h2");
    private By ProductAreaBlogVisit =By.cssSelector(".my-16>div:nth-child(2)>div:nth-child(2) button");
    private By ProductAreaBrewGuidesTitle= By.cssSelector(".my-16.px-0>div:nth-child(1)>div:nth-child(2)>h2");

    public void userOnTheProductsPage(){
        elementHelper.openUrl(url);
    }
    public void clickProductAreaProductImage(){
        elementHelper.click(ProductAreaProductImage);
    }
    public void clickProductAreaBrewGuidesImage(){
        elementHelper.click(ProductAreaBrewGuidesImage);
    }
    public void clickProductAreaBlogImage(){
        elementHelper.click(ProductAreaBlogImage);
    }
    public void checkProductsPage(String url){
         elementHelper.checkUrl(url);
    }
    public String shouldSeeCategoriesAreaTitle(){
        return elementHelper.getText(CategoriesAreaTitle);
    }
    public String shouldSeeCategoriesAreaShopAll(){
        return elementHelper.getText(CategoriesAreaShopAll);
    }
    public void shouldSeeCategoriesAreaShopAllCheckbox(){
         elementHelper.findElements(CategoriesAreaShopAllCheckbox);
    }
    public String shouldSeeCategoriesAreaGroundCoffees(){
        return elementHelper.getText(CategoriesAreaGroundCoffees);
    }
    public void shouldSeeCategoriesAreaGroundCoffeesCheckbox(){
        elementHelper.findElements(CategoriesAreaGroundCoffeesCheckbox);
    }
    public String shouldSeeCategoriesAreaCapsulesCoffees(){
        return elementHelper.getText(CategoriesAreaCapsulesCoffees);
    }
    public void shouldSeeCategoriesAreaCapsulesCoffeesCheckbox(){
        elementHelper.findElements(CategoriesAreaCapsulesCoffeesCheckbox);
    }
    public String shouldSeeCategoriesAreaDripCoffees(){
        return elementHelper.getText(CategoriesAreaDripCoffees);
    }
    public void shouldSeeCategoriesAreaDripCoffeesCheckbox(){
        elementHelper.findElements(CategoriesAreaDripCoffeesCheckbox);
    }
    public String shouldSeeSearchAreaTextbox(){
        return elementHelper.getAttribute(SearchAreaTextbox,"placeholder");
    }
    public void shouldSeeSearchAreaImage(){
        elementHelper.checkElement(SearchAreaImage);
    }
    public void shouldSeeSearchAreaCloseIcon(){
        elementHelper.checkElement(SearchAreaCloseIcon);
    }
    public String shouldSeeSearchAreaSearchingResultsForHeader(){
        return elementHelper.getText(SearchAreaSearchingResultsForHeader);
    }
    public String shouldSeeSearchAreaSearchingResultsFor(){
        return elementHelper.getText(SearchAreaSearchingResultsFor);
    }
    public void shouldSeeProductAreaProductImage(){
        elementHelper.checkElement(ProductAreaProductImage);
    }
    public String shouldSeeProductAreaProductTag(){
        return elementHelper.getText(ProductAreaProductTag);
    }
    public String shouldSeeProductAreaProductName(){
        return elementHelper.getText(ProductAreaProductName);
    }
    public String shouldSeeProductAreaProductDescription(){
        return elementHelper.getText(ProductAreaProductDescription);
    }
    public String shouldSeeProductAreaProductPrice(){
        return elementHelper.getText(ProductAreaProductPrice);
    }
    public String shouldSeeProductAreaShowMoreButton(){
        return elementHelper.getText(ProductAreaShowMoreButton);
    }
    public String shouldSeeProductAreaBrewGuidesText(){
        return elementHelper.getText(ProductAreaBrewGuidesText);
    }
    public void shouldSeeProductAreaBrewGuidesImage(){
        elementHelper.checkElement(ProductAreaBrewGuidesImage);
    }
    public String shouldSeeProductAreaBrewGuidesVisit(){
        return elementHelper.getText(ProductAreaBrewGuidesVisit);
    }
    public String shouldSeeProductAreaBlogText(){
        return elementHelper.getText(ProductAreaBlogText);
    }
    public void shouldSeeProductAreaBlogImage(){
        elementHelper.checkElement(ProductAreaBlogImage);
    }
    public String shouldSeeProductAreaBlogTitle(){
        return elementHelper.getText(ProductAreaBlogTitle);
    }
    public String shouldSeeProductAreaBlogVisit(){
        return elementHelper.getText(ProductAreaBlogVisit);
    }
    public String shouldSeeProductAreaBrewGuidesTitle(){
        return elementHelper.getText(ProductAreaBrewGuidesTitle);
    }

}
