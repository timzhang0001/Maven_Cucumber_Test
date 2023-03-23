package Steps;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
    LoginPage loginPage = new LoginPage(Hooks.driver);
    HomePage homePage = new HomePage(Hooks.driver);


    @When("user can on the login page")
    public void userCanOnTheLoginPage() {
        if (Hooks.basePage != null) {
            Hooks.basePage.navigateTo();
        }
    }

    @When("user can fill the username and password")
    public void userCanFillTheUsernameAndPassword() {
        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.clickLoginButton();


    }

    @Then("user can login into the homepage")
    public void userCanLoginIntoTheHomepage(){
        homePage.verifyloginSuccessfully();

    }
}

