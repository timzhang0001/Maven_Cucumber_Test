package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductDetailPage extends BasePage {


    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "cc_product_title")
    public WebElement productTitle;

    @FindBy(css = ".input-text.qty.entry.plus_minus.form-control.cc_entry")
    public WebElement qualityInput;

    @FindBy(id = "aggSelection")
    public WebElement dropDownBox;

    @FindBy(css = "#aggSelection > option")
    public List<WebElement> uomOption;

    @FindBy(css = "button.addSection")
    private WebElement addToCartBtn;

    @FindBy(css = ".shopping-cart-info__count")
    public WebElement cartInformationCount;

    @FindBy(css = ".shopping-cart-info__icon")
    private WebElement cartIcon;


    public void verifyPdpPage(String prodcut) {
        waitForElementVisibility(productTitle, driver);
        Assert.assertTrue("product detail shows", productTitle.isDisplayed());
        Assert.assertTrue("product detail shows", productTitle.getText().contains(prodcut));
    }

    public void selectQuality(String quality) {
        waitForElementVisibility(qualityInput, driver);
        qualityInput.clear();
        qualityInput.sendKeys(quality);
    }

    public void verifyQualityOfItems(String quality) {
        waitForElementVisibility(qualityInput, driver);
        Assert.assertTrue("quality of items added", qualityInput.isDisplayed());
        String trimmedQuality = quality.trim();
        String actualValue = qualityInput.getAttribute("value");
        Assert.assertEquals("quality of items added", trimmedQuality, actualValue);
    }

    public void selectDifferentUom(String uomValue) {
        waitForAllElementsVisibility(uomOption, driver);
        for (WebElement uom : uomOption) {

            if (uom.getAttribute("value").equals(uomValue)) {
                uom.click();
                break;
            }

        }
    }

    public void clickUomDropDownBox() {
        waitForElementVisibility(dropDownBox, driver);
        dropDownBox.click();


    }

    public void clickAddToCartButton() throws InterruptedException {
        waitForElementUntilClickable(addToCartBtn, driver);
        addToCartBtn.click();
        Thread.sleep(2000);

    }

    public void clickCartButton() {
        waitForElementVisibility(cartIcon,driver);
        cartIcon.click();
    }
}
