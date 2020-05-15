package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverManager {

    private static DriverManager instance;
    private final WebDriver driver;
    private final WebDriverWait driverWait;
    private final DriverSettings settings = DriverSettings.instance();

    private DriverManager() {
        System.setProperty(settings.getDriverProp(), settings.getDriverPath());
        driver = settings.getDriverType();
        driverWait = new WebDriverWait(driver, 20);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }

    private static void setInstance() {
        if(instance == null) {
            instance = new DriverManager();
        }
    }

    public static DriverManager getInstance() {
        setInstance();
        return instance;
    }

    public void quitBrowser() {
        if (instance != null) {
            driver.quit();
            instance = null;
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return driverWait;
    }
}
