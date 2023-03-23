package Pages;

import Manager.ConfigManager;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }


    public WebElement waitForElementVisibility(WebElement webElement, WebDriver webDriver) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        try{
            return wait.until(ExpectedConditions.visibilityOf(webElement));
        }catch (TimeoutException e){
            System.out.println("the webElement is not found-----");
        }return null;
    }

    public WebElement waitForElementUntilClickable(WebElement webElement, WebDriver webDriver) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        try {
            return wait.until(ExpectedConditions.elementToBeClickable(webElement));
        } catch (TimeoutException e) {
            throw new NoSuchElementException("Element is not clickable within 10 seconds");
        }
    }

    public List<WebElement> waitForAllElementsVisibility(List<WebElement> webElements, WebDriver webDriver) {
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        return webElements;
    }

    public void navigateTo() {
        driver.navigate().to(ConfigManager.getUrl());
    }
}

















