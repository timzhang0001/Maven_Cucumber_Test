package Pages.Manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverFactory{
    private static WebDriver driver;
    private static WebDriverWait wait;

    private DriverFactory() {}

    public static WebDriver getDriver() {
        if (driver == null) {
            synchronized (WebDriverManager.class) {
                if (driver == null) {
                    String browserType = ConfigManager.getBrowserType().toLowerCase();
                    switch (browserType) {
                        case "chrome":
                            WebDriverManager.chromedriver().forceDownload().setup();
                            ChromeOptions options = new ChromeOptions();
                            options.addArguments("--disable-websocket");
                            options.addArguments("--disable-extensions");
                            options.addArguments("--headless");
                            options.addArguments("--no-sandbox");
                            driver = new ChromeDriver(options);
                            break;
                        case "firefox":
                            WebDriverManager.firefoxdriver().setup();
                            FirefoxOptions firefoxOptions= new FirefoxOptions();
                            firefoxOptions.addArguments("--no-sandbox");
                            firefoxOptions.addArguments("--headless");

                            driver = new FirefoxDriver();


                            break;
                        case "edge":
                            WebDriverManager.edgedriver().setup();
                            driver = new EdgeDriver();
                            break;
                        case "safari":
                            WebDriverManager.safaridriver().setup();
                            driver = new SafariDriver();
                            break;
                        default:
                            throw new RuntimeException("Invalid browser type specified in the config.properties file.");
                    }
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Integer.parseInt(ConfigManager.getImplicitlyWait()),TimeUnit.SECONDS);
                   
                }
            }
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
