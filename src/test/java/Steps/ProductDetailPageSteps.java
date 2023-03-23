package Steps;

import Pages.CartPage;
import Pages.HeaderPage;
import Pages.ProductDetailPage;
import Pages.ProductListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductDetailPageSteps {

    ProductDetailPage productDetailPage;
    HeaderPage headerPage;
    ProductListPage productListPage;
    CartPage cartPage;


    @And("^user select(.*)numbers of product$")
    public void userSelectNumbersOfProduct(String quality) {
        this.productDetailPage=new ProductDetailPage(Hooks.driver);
        productDetailPage.selectQuality(quality);
        productDetailPage.verifyQualityOfItems(quality);

    }

    @And("^user select different uom(.*)$")
    public void userSelectDifferentUom(String uomValue) {
        this.productDetailPage=new ProductDetailPage(Hooks.driver);
        productDetailPage.clickUomDropDownBox();
        productDetailPage.selectDifferentUom(uomValue);
    }

    @And("user add the product to cart")
    public void userAddTheProductToCart() throws InterruptedException {
        productDetailPage.clickAddToCartButton();

    }

    @Then("^the cart should show the added items(.*)$")
    public void theCartShouldShowTheAddedItems() {
          this.cartPage=new CartPage(Hooks.driver);
          cartPage.verifyChatPageInformation();


    }

    @When("^user search for(.*) and navigated to product detail page$")
    public void userNavigatedToProductDetailPage(String product) throws InterruptedException {
        this.headerPage=new HeaderPage(Hooks.driver);
        headerPage.inputFieldSearch(product);
        headerPage.clickSearchButton();
        this.productListPage=new ProductListPage(Hooks.driver);
        productListPage.selectProduct(product);




    }


}
