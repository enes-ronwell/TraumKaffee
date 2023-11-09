package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class BlogPage {
    private ElementHelper elementHelper;

    public BlogPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }


    private String url = "https://dev.traumkaffee.com/blog";
    private By OurBlogAreaFirstBlog = By.cssSelector(".grid-cols-1>div:nth-child(1)");
    private By OurBlogAreaShowMoreButton = By.cssSelector(".my-8>button");
    private By FreshlyBrewedAreaTitle = By.cssSelector(".flex-col-reverse>div:nth-child(2)>div>p:nth-child(1)");
    private By FreshlyBrewedAreaSubTitle = By.cssSelector(".flex-col-reverse>div:nth-child(2)>div>p:nth-child(2)");
    private By FreshlyBrewedAreaDescription = By.cssSelector(".flex-col-reverse>div:nth-child(2)>div>p:nth-child(3)");
    private By FreshlyBrewedAreaImage = By.cssSelector(".flex-col-reverse>div:nth-child(1)");
    private By OurBlogAreaTitle = By.cssSelector(".mb-8>h2");
    private By OurBlogAreaFirstBlogDate = By.cssSelector(".grid-cols-1.w-full>div:nth-child(1) .px-6>p:nth-child(1)");
    private By OurBlogAreaFirstBlogTitle = By.cssSelector(".grid-cols-1.w-full>div:nth-child(1) .px-6>p:nth-child(2)");
    private By OurBlogAreaFirstBlogDescription = By.cssSelector(".grid-cols-1.w-full>div:nth-child(1) .px-6>p:nth-child(3)");
    private By OurBlogAreaSecondBlogDate = By.cssSelector(".grid-cols-1.w-full>div:nth-child(2) .px-6>p:nth-child(1)");
    private By OurBlogAreaSecondBlogTitle = By.cssSelector(".grid-cols-1.w-full>div:nth-child(2) .px-6>p:nth-child(2)");
    private By OurBlogAreaSecondBlogDescription = By.cssSelector(".grid-cols-1.w-full>div:nth-child(2) .px-6>p:nth-child(3)");
    private By OurBlogAreaThirdBlogDate = By.cssSelector(".grid-cols-1.w-full>div:nth-child(3) .px-6>p:nth-child(1)");
    private By OurBlogAreaThirdBlogTitle = By.cssSelector(".grid-cols-1.w-full>div:nth-child(3) .px-6>p:nth-child(2)");
    private By OurBlogAreaThirdBlogDescription = By.cssSelector(".grid-cols-1.w-full>div:nth-child(3) .px-6>p:nth-child(3)");
    private By OurBlogAreaFirstBlogReadMore = By.cssSelector(".mb-8>div>p:nth-child(4)");
    private By BlogCount = By.cssSelector(".grid-cols-1>div");

    public void userOnTheBlogsPage() {
        elementHelper.openUrl(url);
    }

    public void clickOurBlogAreaFirstBlog() {
        elementHelper.click(OurBlogAreaFirstBlog);
    }

    public void hoverOurBlogAreaFirstBlog() {
        elementHelper.click(OurBlogAreaFirstBlog);
    }

    public void clickOurBlogAreaShowMoreButton() {
        elementHelper.click(OurBlogAreaShowMoreButton);
    }

    public void shouldSeeTheBlogPage() {
        elementHelper.checkUrl("https://dev.traumkaffee.com/blog");
    }

    public String shouldSeeFreshlyBrewedAreaTitle() {
        return elementHelper.getText(FreshlyBrewedAreaTitle);
    }

    public String shouldSeeFreshlyBrewedAreaSubTitle() {
        return elementHelper.getText(FreshlyBrewedAreaSubTitle);
    }

    public String shouldSeeFreshlyBrewedAreaDescription() {
        return elementHelper.getText(FreshlyBrewedAreaDescription);
    }

    public void shouldSeeFreshlyBrewedAreaImage() {
        elementHelper.checkElement(FreshlyBrewedAreaImage);
    }

    public String shouldSeeOurBlogAreaTitle() {
        return elementHelper.getText(OurBlogAreaTitle);
    }

    public String shouldSeeOurBlogAreaFirstBlogDate() {
        return elementHelper.getText(OurBlogAreaFirstBlogDate);
    }

    public String shouldSeeOurBlogAreaFirstBlogTitle() {
        return elementHelper.getText(OurBlogAreaFirstBlogTitle);
    }

    public String shouldSeeOurBlogAreaFirstBlogDescription() {
        return elementHelper.getText(OurBlogAreaFirstBlogDescription);
    }

    public String shouldSeeOurBlogAreaSecondBlogDate() {
        return elementHelper.getText(OurBlogAreaSecondBlogDate);
    }

    public String shouldSeeOurBlogAreaSecondBlogTitle() {
        return elementHelper.getText(OurBlogAreaSecondBlogTitle);
    }

    public String shouldSeeOurBlogAreaSecondBlogDescription() {
        return elementHelper.getText(OurBlogAreaSecondBlogDescription);
    }

    public String shouldSeeOurBlogAreaThirdBlogDate() {
        return elementHelper.getText(OurBlogAreaThirdBlogDate);
    }

    public String shouldSeeOurBlogAreaThirdBlogTitle() {
        return elementHelper.getText(OurBlogAreaThirdBlogTitle);
    }

    public String shouldSeeOurBlogAreaThirdBlogDescription() {
        return elementHelper.getText(OurBlogAreaThirdBlogDescription);
    }

    public String shouldSeeOurBlogAreaShowMoreButton() {
        return elementHelper.getText(OurBlogAreaShowMoreButton);
    }

    public String shouldSeeOurBlogAreaFirstBlogReadMore() {
        return elementHelper.getText(OurBlogAreaFirstBlogReadMore);
    }

    public String shouldSeeBlogCount() {
        return elementHelper.getCount(BlogCount);
    }

    public void shouldNotSeeOurBlogAreaShowMoreButton() {
        elementHelper.checkElement(OurBlogAreaShowMoreButton);
    }


}
