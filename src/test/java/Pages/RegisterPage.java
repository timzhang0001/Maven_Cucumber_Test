package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);


    }

    @FindBy(id ="UserForm_Form_49_EditableTextField_fa527")
    public WebElement accountNumber;

    @FindBy(id = "UserForm_Form_49_EditableTextField_a5576")
    public  WebElement bussinessTradingName;

    @FindBy(id = "UserForm_Form_49_EditableTextField_3a968")
    public  WebElement firstName;

    @FindBy(id = "UserForm_Form_49_EditableTextField_0bfd3")
    public WebElement lastName;

    @FindBy(id = "UserForm_Form_49_EditableTextField_da70c")
    public  WebElement email;

    @FindBy(id = "UserForm_Form_49_EditableTextField_83c8e")
    public  WebElement telephone;

    @FindBy(id = "UserForm_Form_49_EditableTextField_b8ab9")
    public  WebElement mobile;

    @FindBy(id = "UserForm_Form_49_EditableTextField_db8bd")
    public  WebElement businessAdress1;

    @FindBy(id = "UserForm_Form_49_EditableTextField_c2a06")
    public  WebElement businessAdress2;

    @FindBy(id = "UserForm_Form_49_EditableTextField_27e8b")
    public  WebElement city;

    @FindBy(id = "UserForm_Form_49_EditableTextField_58500")
    public  WebElement postCode;

    @FindBy(id = "UserForm_Form_49_EditableTextField_3586e")
    public  WebElement termAndConditionBox;

    @FindBy(id = "UserForm_Form_49_action_process")
    public WebElement submit;

    @FindBy(css = "#uff > p:nth-child(1)")
    public  WebElement signUpSucessfully;







    public void fillUserInformation() throws InterruptedException {

        accountNumber.sendKeys("11");
        bussinessTradingName.sendKeys("22");
        firstName.sendKeys("zz");
        lastName.sendKeys("zhang");
        email.sendKeys("123456@gmail.com");
        telephone.sendKeys("12345");
        mobile.sendKeys(("123456"));
        businessAdress1.sendKeys("12 travis dr");
        businessAdress2.sendKeys("12 travis");
        city.sendKeys("auckland");
        postCode.sendKeys("0632");
        termAndConditionBox.click();
        submit.click();



    }


    public void verifySignSecessfully() {
        waitForElementVisibility(signUpSucessfully,driver);
        Assert.assertTrue("Thank you for your enquiry",signUpSucessfully.isDisplayed());


    }
}
