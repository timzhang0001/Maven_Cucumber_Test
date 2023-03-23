package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".gilmours-logo")
    public WebElement gilmours_Logo;


    public String getTitle() {
        System.out.printf(driver.getTitle());
        return driver.getTitle();


    }

    public void verifyloginSuccessfully() {
        waitForElementVisibility(gilmours_Logo,driver);
        Assert.assertTrue("gilmours Logo is showed",gilmours_Logo.isDisplayed());






    }
}
