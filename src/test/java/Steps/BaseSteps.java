package Steps;

import Pages.BasePage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;

public class BaseSteps {


    @Given("user logged in")
    public void userLoggedIn() {
        BasePage basePage= new BasePage(Hooks.driver);
        basePage.navigateTo();
        LoginPage loginPage= new LoginPage(Hooks.driver);
        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.clickLoginButton();
    }
}
