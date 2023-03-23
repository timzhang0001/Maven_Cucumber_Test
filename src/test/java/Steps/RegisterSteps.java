package Steps;

import Pages.LoginPage;
import Pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RegisterSteps {
    RegisterPage registerPage =new RegisterPage(Hooks.driver);
    LoginPage loginPage =new LoginPage(Hooks.driver);


    @When("user jump into register page")
    public void userJumpIntoRegisterPage(){
        loginPage.clickRegisterButton();


    }

    @And("user fill the sign up information")
    public void userFillTheSignUpInformation() throws InterruptedException {

        registerPage.fillUserInformation();

    }

    @Then("user finished the sign up successfully")
    public void userFinishedTheSignUpSuccessfully() {
        registerPage.verifySignSecessfully();
    }




}
