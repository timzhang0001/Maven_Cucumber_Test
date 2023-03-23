package Steps;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartPageSteps {
    HeaderPage headerPage;
    ProductListPage productListPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;
    CheckOutPage checkOutPage;

    @And("^user select a item (.*) to chat$")
    public void userSelectAItemToChat(String product) throws InterruptedException {
        headerPage= new HeaderPage(Hooks.driver);
        this.headerPage.inputFieldSearch(product);
        this.headerPage.clickSearchButton();
        productListPage= new ProductListPage(Hooks.driver);
        productListPage.selectProduct(product);
        productDetailPage=new ProductDetailPage(Hooks.driver);
        this.productDetailPage.clickAddToCartButton();
        this.productDetailPage.clickCartButton();


    }

    @When("user increase the number which is of selected product")
    public void userIncreaseTheNumberWhichIsOfSelectedProduct() {
        cartPage = new CartPage(Hooks.driver);
        cartPage.clickNumberAddIcon();

    }

    @And("user select the deliver date")
    public void userSelectTheDeliverDate() {
        cartPage.clickDropDownBox();
        cartPage.selectDeliverDate();
    }

    @And("user click the proceed button")
    public void userClickTheProceedButton() {
        cartPage.clickProceedBtn();

    }

    @Then("the checkout page is display")
    public void theCheckoutPageIsDisplay() {
        checkOutPage= new CheckOutPage(Hooks.driver);
        checkOutPage.verifyCheckPageLoaded();


    }
}
