package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class CoffeeAcademyPage {

    private ElementHelper elementHelper;
    public CoffeeAcademyPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private final By CoffeeAcademyPageTitle =  By.cssSelector(".flex.flex-col.justify-between .mx-4 h1");
    private final By CoursesAreaTitle = By.cssSelector(".pb-16>div:nth-child(1) h3");
    private final By CalendarAreaTitle = By.cssSelector(".mb-8 h1");
    private String url = "https://dev.traumkaffee.com/coffee-academy";

    public void userOnTheCoffeeAcademyPage() {
        elementHelper.openUrl(url);
    }
    public void checkUrl(){
        elementHelper.checkUrl(url);
    }

    public String checkCoffeeAcademyPageTitle () {
        return elementHelper.getText(CoffeeAcademyPageTitle);
    }

    public String userShouldSeeTheCoursesAreaTitle(){
        return elementHelper.getText(CoursesAreaTitle);
    }

    public String userShouldSeeTheCalendarAreaTitle(){
        return elementHelper.getText(CalendarAreaTitle);
    }
}
