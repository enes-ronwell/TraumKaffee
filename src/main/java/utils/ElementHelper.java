package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class ElementHelper {

    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    public ElementHelper(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.action = new Actions(driver);

    }


    public void click(By by) {
        findElement(by).click();
    }

    public String getText(By by) {
        return findElement(by).getText();
    }

    public String getCount(By by) {
        return String.valueOf(findElements(by).size());
    }

    public String getAttribute(By by, String attr) {
        return findElement(by).getAttribute(attr);
    }

    public String getTextWithWait(By by) {
        return findElement(by).getText();
    }

    public void sendKeys(By by, String text) {
        WebElement element = findElement(by);
        element.clear();
        element.sendKeys(text);
    }

    public void clear(By by) {
        WebElement element = findElement(by);
        element.clear();
    }


    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public void checkUrl(String url) {
        wait.until(ExpectedConditions.urlContains(url));
    }

    public WebElement findElement(By by) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        scrollToElement(element);
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }


    public List<WebElement> findElements(By element) {
        List<WebElement> elem = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
        scrollToElement(elem.get(0));
        return elem;
    }

    public void scrollToElement(WebElement element) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String scrollElementIntoMiddle = "arguments[0].scrollIntoView({behavior: 'auto', block: 'center', inline: 'center'});";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, element);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void overElement(By by) {
        WebElement element = findElement(by);
        action.moveToElement(element).perform();
    }

    public void openUrl(String url) {
        driver.get(url);
        checkUrl(url);
    }

    public void checkElement(By by) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        scrollToElement(element);
        element.isDisplayed();
    }

    public void checkElementWithText(By by, String text) {
        boolean check = false;
        List<WebElement> element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        for (WebElement elem : element) {
            if (elem.getText().equals(text)) {
                check = true;
                break;
            }
        }
        Assert.assertTrue(check);
    }

    public void clickElementWithText(By by, String text) {
        boolean check = false;
        List<WebElement> element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        for (WebElement elem : element) {
            if (elem.getText().equals(text)) {
                elem.click();
                check = true;
                break;
            }
        }
        Assert.assertTrue(check);
    }

}
