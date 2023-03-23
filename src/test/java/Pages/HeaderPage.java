package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage  extends BasePage {

    public HeaderPage (WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@id=\"searchText\"]")
    public WebElement inputFieldSearch;

    @FindBy(id = "doSearch")
    public WebElement searchButton;





    public void inputFieldSearch(String input){
        waitForElementVisibility(inputFieldSearch,driver);
        inputFieldSearch.sendKeys(input);
    }

    public void clickSearchButton() throws InterruptedException {
        waitForElementUntilClickable(searchButton,driver);
        Thread.sleep(3000);
        searchButton.click();

    }
}
