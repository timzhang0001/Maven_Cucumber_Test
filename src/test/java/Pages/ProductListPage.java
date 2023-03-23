package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductListPage extends BasePage {
    public ProductListPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(className = "gilmours-breadcrumb-search-term")
    public WebElement searchResult;

    @FindBy(css = ".product-list-image")
    public List<WebElement> productList;

    @FindBy(css ="span.cc_product_container:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div")
    private WebElement addToCartBtn;



    public String verifyPlpPageSearchResult(String searchFor) {
        String afterStrippedSearchedForOnPage = "empty";
        waitForElementVisibility(searchResult, driver);
        String searchedForOnPage = searchResult.getText();
        int StringArray = searchedForOnPage.length();
        afterStrippedSearchedForOnPage = searchedForOnPage.substring(0, StringArray);
        return afterStrippedSearchedForOnPage;
    }


    public void selectProduct(String product) {
        waitForAllElementsVisibility(productList,driver);
        WebElement targetProductElement = null;
        for (WebElement productElement : productList) {
            String name = productElement.findElement(By.tagName("img")).getAttribute("alt");
            if (name.equals(product)) {
                targetProductElement = productElement;
                break;
            }
        }
        if (targetProductElement != null) {
            targetProductElement.click();
        } else {
            System.out.println("Product not found......");
        }
    }
}


