package config;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import utilities.YamlReader;

import java.awt.*;
import java.util.HashMap;

public class DriverSettings {

    private static DriverSettings instance;
    private static HashMap<String, String> chrome;
    private static HashMap<String, String> firefox;
    private final String BROWSER = StringUtils.defaultIfBlank(System.getProperty("browser"), "chrome");
    private final String OS = System.getProperty("os.name").toLowerCase();

    static {
        YamlReader.setProperties(DriverSettings.class, "driver-settings.yml");
    }

    public static DriverSettings instance() {
        if(instance == null) {
            instance = new DriverSettings();
        }
        return instance;
    }

    public HashMap<String, String> getChrome() {
        return chrome;
    }

    public void setChrome(HashMap<String, String> chrome) {
        DriverSettings.chrome = chrome;
    }

    public HashMap<String, String> getFirefox() {
        return firefox;
    }

    public void setFirefox(HashMap<String, String> firefox) {
        DriverSettings.firefox = firefox;
    }

    public String getDriverProp() {
        String driverProp = "";
        if(BROWSER.equals("chrome")) {
            driverProp = getChrome().get("property");
        }
        if(BROWSER.equals("firefox")) {
            driverProp = getFirefox().get("property");
        }
        return driverProp;
    }

    public String getDriverPath() {
        String path = "src/main/resources/drivers/";
        if(OS.equals("linux")) {
            if(BROWSER.equals("firefox"))
                path = path.concat(OS.concat("/" + getFirefox().get("name")));
            if(BROWSER.equals("chrome"))
                path = path.concat(OS.concat("/" + getChrome().get("name")));
        }
        if(OS.contains("windows")) {
            if(BROWSER.equals("firefox"))
                path = path.concat("windows/" + getFirefox().get("name").concat(".exe"));
            if(BROWSER.equals("chrome"))
                path = path.concat("windows/" + getChrome().get("name").concat(".exe"));
        }
        if(OS.contains("mac os")) {
            if(BROWSER.equals("firefox"))
                path = path.concat("osx/" + getFirefox().get("name"));
            if(BROWSER.equals("chrome"))
                path = path.concat(OS.concat("osx/" + getChrome().get("name")));
        }
        return path;
    }

    public WebDriver getDriverType() {
        WebDriver driverType = null;
        if(BROWSER.equals("chrome")) {
            driverType = new ChromeDriver(getChromeOptions());
        }
        if(BROWSER.equals("firefox")){
            driverType = new FirefoxDriver(getFirefoxOptions());
        }
        return driverType;
    }

    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions()
                .addArguments("start-maximized");
        if(System.getProperty("mode").equals("headless")) {
            options
                .addArguments("--headless", "--window-size=1920,1080");
        }
        return options;
    }

    private FirefoxOptions getFirefoxOptions() {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        FirefoxOptions options = new FirefoxOptions()
                .addArguments("--width=" + gd.getDisplayMode().getWidth())
                .addArguments("--height=" + gd.getDisplayMode().getHeight());
        if(System.getProperty("mode").equals("headless")) {
            options
                .addArguments("-headless", "--window-size=1920,1080");
        }
        return options;
    }
}
