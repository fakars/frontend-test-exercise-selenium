package pages;

import org.openqa.selenium.JavascriptExecutor;
import config.DriverManager;

public class Page {

    private String url;
    private DriverManager driverInstance = DriverManager.getInstance();

    public Page(String url) {
        this.url = url;
    }

    public Page goTo() {
        driverInstance.getDriver().get(url);
        driverInstance
            .getWait()
            .until(jsExecutor -> (
                    (JavascriptExecutor) driverInstance.getDriver())
                    .executeScript("return document.readyState")
                    .equals("complete"));
        return this;
    }

}
