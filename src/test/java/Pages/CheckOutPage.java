package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage{
    public  CheckOutPage(WebDriver driver){
        super(driver);
    }
    @FindBy(css = ".checkout-flow-header-text__review")
    private WebElement reviewOrder;




    public void verifyCheckPageLoaded() {
        waitForElementVisibility(reviewOrder,driver);
        Assert.assertTrue("checkOut page is loaded",reviewOrder.isDisplayed());
        Assert.assertTrue("review order message is dispaled",reviewOrder.getText().trim().equals("Review order"));

    }
}
