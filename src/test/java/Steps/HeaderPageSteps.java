package Steps;

import Pages.HeaderPage;
import Pages.ProductListPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HeaderPageSteps {
    HeaderPage headerPage= new HeaderPage(Hooks.driver);
    ProductListPage productListPage;
    String searchFor;

    @When("^user uses the search input field to search for products(.*)$")
    public void userUsesTheSearchInputFieldToSearchForProducts(String searchFor) throws InterruptedException {
        this.headerPage.inputFieldSearch(searchFor);
        this.headerPage.clickSearchButton();
    }


    @Then("user should be navigated to the result page")
    public void userShouldBeNavigatedToTheResultPage() {
        this.productListPage =new ProductListPage(Hooks.driver);
        productListPage.verifyPlpPageSearchResult(searchFor);

    }

}
