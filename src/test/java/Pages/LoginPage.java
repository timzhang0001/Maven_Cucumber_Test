package Pages;

import Manager.ConfigManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);



    }


    @FindBy(id = "gcc_sitelogin:loginForm:username")
    public WebElement usernameField;

    @FindBy(id = "gcc_sitelogin:loginForm:password")
    public WebElement passwordField;

    @FindBy(id = "login")
    public WebElement loginButton;

    @FindBy(css = "a[href='/DefaultStore/GCC_ForgotPassword']")
    public WebElement ResetPassword;

    @FindBy(css = ".btn.btn-block.reg-btn")
    public WebElement registerButton;


    public void enterUserName() {
        usernameField.clear();
        usernameField.sendKeys(ConfigManager.getUsername());
    }

    public void enterPassword(){
        passwordField.clear();
        passwordField.sendKeys(ConfigManager.getPassword());
    }

    public void clickLoginButton(){
        waitForElementVisibility(loginButton,driver);
        loginButton.click();
    }


    public void clickResetPassword(){

        ResetPassword.click();
    }
    public void clickRegisterButton(){
        waitForElementVisibility(registerButton,driver);
        registerButton.click();

    }
}


