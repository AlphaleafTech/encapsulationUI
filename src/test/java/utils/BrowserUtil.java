package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

    private static WebDriver driver;

    /**
     * Use this method to create [code-->driver-->browser] connection.
     * After invoking this method, the driver refers to the driver executable.
     *
     * @param browserType [chrome, edge, firefox, headless ]
     */
    public static void openBrowser(String browserType) {
        // determine the chosen browser
        boolean isChrome = browserType.equalsIgnoreCase("chrome");
        boolean isEdge = browserType.equalsIgnoreCase("edge");
        boolean isFirefox = browserType.equalsIgnoreCase("firefox");
        boolean isHeadlessChrome = browserType.equalsIgnoreCase("headless");

        if (isChrome) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (isEdge) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (isFirefox) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (isHeadlessChrome) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("--window-size=1920,1200");
            options.addArguments("--disable-extensions");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
        }

        driver.manage().window().maximize();
    }

    /**
     * Use this method to open the Google Chrome browser
     */
    public static void openChrome() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    /**
     * Use this method to access the driver instance
     *
     * @return
     */
    public static WebDriver getDriver() {
        return driver;
    }


    /**
     * Use this method to terminate the driver --> browser
     * connection and quit the browser.
     */
    public static void closeBrowser() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }

    /**
     * Use this method to close the current window
     * that the driver is focused on.
     */
    public static void closeWindow() {
        driver.close();
    }

    /**
     * Use this method to refresh the current window
     */
    public static void refresh() {
        driver.navigate().refresh();
    }
}
