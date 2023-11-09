package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.BlogDetailsPage;
import utils.DriverFactory;

public class BlogDetailsPageDefinitions {
    BlogDetailsPage blogDetailsPage = new BlogDetailsPage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the Blog Detail Page")
    public void userOnTheBlogDetailPage() {
        blogDetailsPage.userOnTheBlogDetailPage();
    }
    //WHEN's

    //THEN's
    @Then("should see the Blog Detail Page")
    public void shouldSeeTheBlogDetailPage() {
        blogDetailsPage.shouldSeeTheBlogDetailPage();

    }
}
