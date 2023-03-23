package Steps;

import Pages.ProductDetailPage;
import Pages.ProductListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ProductListPageSteps {
    ProductListPage productListPage = new ProductListPage(Hooks.driver);
    ProductDetailPage productDetailPage=new ProductDetailPage(Hooks.driver);


    @And("^user select a product(.*)$")
    public void userSelectAProduct(String product) {
        productListPage.selectProduct(product);


    }

    @Then("^user can navigate to product detail page(.*)$")
    public void userCanNavigateToProductDetailPage(String product) {
        productDetailPage.verifyPdpPage(product);
    }


}
