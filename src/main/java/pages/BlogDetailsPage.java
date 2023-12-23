package pages;

import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

import java.security.PublicKey;

public class BlogDetailsPage {
    private ElementHelper elementHelper;

    public BlogDetailsPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private String url = "https://dev.traumkaffee.com/blog/what-is-drip-coffee";


    public void userOnTheBlogDetailPage(){
        elementHelper.openUrl(url);
    }
    public void shouldSeeTheBlogDetailPage(){
         elementHelper.checkUrl(url);
    }
}
