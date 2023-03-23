package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

// page_url = about:blank
public class PageDetialPage {

    public PageDetialPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}