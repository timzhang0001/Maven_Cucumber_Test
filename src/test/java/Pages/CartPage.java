package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".item_title")
    public WebElement itemTitle;

    @FindBy(css = ".ion-plus")
    public WebElement numberAddIon;

    @FindBy(id = "Gilmours")
    public WebElement dropDownBox;

    @FindBy(css = "#Gilmours > option")
    public List<WebElement> selectDateOptions;

    @FindBy(id = "proceeddisable")
    private WebElement proceedBtn;





    public void clickNumberAddIcon(){
        waitForElementVisibility(numberAddIon,driver);
        numberAddIon.click();
    }

    public void clickDropDownBox(){
        waitForElementVisibility(dropDownBox,driver);
        dropDownBox.click();
    }

    public void selectDeliverDate(){
        waitForAllElementsVisibility(selectDateOptions,driver);
        selectDateOptions.get(2).click();

    }

    public void clickProceedBtn(){
        waitForElementVisibility(proceedBtn,driver);
        proceedBtn.click();

    }


    public void verifyChatPageInformation() {
        waitForElementVisibility(itemTitle,driver);
        Assert.assertTrue("selected item is showed ",itemTitle.isDisplayed());
        Assert.assertTrue("selected item is showed",itemTitle.getText().trim().contains("Anchor Blue milk"));
    }

}

