package Manager;

import Pages.BasePage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    private WebDriver driver;
    private BasePage basePage;
    private HomePage homePage;
    private LoginPage loginPage;
    private RegisterPage registerPage;

   // public PageObjectManager(WebDriver driver){
   //     this.driver= driver;
    }



//    public HomePage getHomePage(){
//        return (homePage ==null)? homePage=new HomePage(driver):homePage;
//    }
//    public LoginPage getLoginPage() {
//        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
//    }
//    public RegisterPage getRegisterPage(){
//        return (registerPage ==null)? registerPage =new RegisterPage(driver):registerPage;
//    }


//}


