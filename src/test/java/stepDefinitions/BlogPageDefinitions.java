package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BlogPage;
import utils.DriverFactory;

public class BlogPageDefinitions {
    BlogPage blogPage = new BlogPage(DriverFactory.getDriver());

    //GİVEN's
    @Given("user on the Blogs Page")
    public void userOnTheBlogsPage() {
        blogPage.userOnTheBlogsPage();
    }

    //WHEN's
    @When("click Our Blog Area First Blog on Blogs Page")
    public void clickOurBlogAreaFirstBlogOnBlogsPage() {
        blogPage.clickOurBlogAreaFirstBlog();
    }

    @When("hover Our Blog Area First Blog on Blogs Page")
    public void hoverOurBlogAreaFirstBlogOnBlogsPage() {
        blogPage.hoverOurBlogAreaFirstBlog();
    }

    @When("click Our Blog Area Show More Button on Blogs Page")
    public void clickOurBlogAreaShowMoreButtonOnBlogsPage() {
        blogPage.clickOurBlogAreaShowMoreButton();
    }

    //THEN's
    @Then("should see the Blogs Page")
    public void shouldSeeTheBlogPage() {
         blogPage.shouldSeeTheBlogPage();
    }

    @Then("should see Freshly Brewed Area Title: {string} on Blogs Page")
    public void shouldSeeFreshlyBrewedAreaTitleOnBlogsPage(String title) {
        String text = blogPage.shouldSeeFreshlyBrewedAreaTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Freshly Brewed Area Sub Title: {string} on Blogs Page")
    public void shouldSeeFreshlyBrewedAreaSubTitleOnBlogsPage(String title) {
        String text = blogPage.shouldSeeFreshlyBrewedAreaSubTitle();
        Assert.assertEquals(text.replaceAll("\\s+",""),title.replaceAll("\\s+",""));
    }

    @Then("should see Freshly Brewed Area Description: {string} on Blogs Page")
    public void shouldSeeFreshlyBrewedAreaDescriptionOnBlogsPage(String desc) {
        String text = blogPage.shouldSeeFreshlyBrewedAreaDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""),desc.replaceAll("\\s+",""));
    }

    @Then("should see Freshly Brewed Area Image on Blogs Page")
    public void shouldSeeFreshlyBrewedAreaImageOnBlogsPage() {
        blogPage.shouldSeeFreshlyBrewedAreaImage();
    }

    @Then("should see Our Blog Area Title: {string} on Blogs Page")
    public void shouldSeeOurBlogAreaTitleOnBlogsPage(String title) {
        String text = blogPage.shouldSeeOurBlogAreaTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Our Blog Area First Blog Date: {string} on Blogs Page")
    public void shouldSeeOurBlogAreaFirstBlogDateOnBlogsPage(String date) {
        String text = blogPage.shouldSeeOurBlogAreaFirstBlogDate();
        Assert.assertEquals(text,date);
    }

    @Then("should see Our Blog Area First Blog Title: {string} on Blogs Page")
    public void shouldSeeOurBlogAreaFirstBlogTitleOnBlogsPage(String title) {
        String text = blogPage.shouldSeeOurBlogAreaFirstBlogTitle();
        Assert.assertEquals(text.replaceAll("\\s+",""),title.replaceAll("\\s+",""));
    }

    @Then("should see Our Blog Area First Blog Description: {string} on Blogs Page")
    public void shouldSeeOurBlogAreaFirstBlogDescriptionOnBlogsPage(String desc) {
        String text = blogPage.shouldSeeOurBlogAreaFirstBlogDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""),desc.replaceAll("\\s+",""));
    }

    @Then("should see Our Blog Area Second Blog Date: {string} on Blogs Page")
    public void shouldSeeOurBlogAreaSecondBlogDateOnBlogsPage(String date) {
        String text = blogPage.shouldSeeOurBlogAreaSecondBlogDate();
        Assert.assertEquals(text,date);
    }

    @Then("should see Our Blog Area Second Blog Title: {string} on Blogs Page")
    public void shouldSeeOurBlogAreaSecondBlogTitleOnBlogsPage(String title) {
        String text = blogPage.shouldSeeOurBlogAreaSecondBlogTitle();
        Assert.assertEquals(text,title);
    }

    @Then("should see Our Blog Area Second Blog Description: {string} on Blogs Page")
    public void shouldSeeOurBlogAreaSecondBlogDescriptionOnBlogsPage(String desc) {
        String text = blogPage.shouldSeeOurBlogAreaSecondBlogDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""),desc.replaceAll("\\s+",""));
    }

    @Then("should see Our Blog Area Third Blog Date: {string} on Blogs Page")
    public void shouldSeeOurBlogAreaThirdBlogDateOnBlogsPage(String date) {
        String text = blogPage.shouldSeeOurBlogAreaThirdBlogDate();
        Assert.assertEquals(text,date);
    }

    @Then("should see Our Blog Area Third Blog Title: {string} on Blogs Page")
    public void shouldSeeOurBlogAreaThirdBlogTitleOnBlogsPage(String title) {
        String text = blogPage.shouldSeeOurBlogAreaThirdBlogTitle();
        Assert.assertEquals(text.replaceAll("\\s+",""),title.replaceAll("\\s+",""));
    }

    @Then("should see Our Blog Area Third Blog Description: {string} on Blogs Page")
    public void shouldSeeOurBlogAreaThirdBlogDescriptionOnBlogsPage(String desc) {
        String text = blogPage.shouldSeeOurBlogAreaThirdBlogDescription();
        Assert.assertEquals(text.replaceAll("\\s+",""),desc.replaceAll("\\s+",""));
    }

    @Then("should see Our Blog Area Show More Button: {string} on Blogs Page")
    public void shouldSeeOurBlogAreaShowMoreButtonOnBlogsPage(String button) {
        String text = blogPage.shouldSeeOurBlogAreaShowMoreButton();
        Assert.assertEquals(text,button);
    }

    @Then("should see Our Blog Area First Blog Read More: {string} on Blogs Page")
    public void shouldSeeOurBlogAreaFirstBlogReadMoreOnBlogsPage(String readMore) {
        String text = blogPage.shouldSeeOurBlogAreaFirstBlogReadMore();
        Assert.assertEquals(text,readMore);
    }

    @Then("should see Blog Count: {string} on Blogs Page")
    public void shouldSeeBlogCountOnBlogsPage(String count) {
        String text = blogPage.shouldSeeBlogCount();
        Assert.assertEquals(text,count);
    }

    @Then("should not see Our Blog Area Show More Button on Blogs Page")
    public void shouldNotSeeOurBlogAreaShowMoreButtonOnBlogsPage() {
        blogPage.shouldNotSeeOurBlogAreaShowMoreButton();
    }
}
