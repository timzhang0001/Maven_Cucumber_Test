package Steps;


import Manager.ConfigManager;
import Manager.DriverFactory;
import Pages.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public static WebDriver driver;
    public static BasePage basePage;


    @Before
    public void initializeDriver() {

        String url =ConfigManager.getUrl();
        driver = DriverFactory.getDriver();
        driver.get(url);
        basePage= new BasePage(driver);




    }

    @After
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()) {
        }
        driver.quit();

    }
}
