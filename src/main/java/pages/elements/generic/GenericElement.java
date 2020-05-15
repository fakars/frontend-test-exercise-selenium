package pages.elements.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import config.DriverManager;
import java.util.List;
import java.util.HashMap;
import java.util.logging.Logger;

public interface GenericElement {

    DriverManager driverInstance = DriverManager.getInstance();
    Logger LOG = Logger.getLogger(Link.class.getName());

    default WebElement getElement(By by) {
        WebElement element = null;
        try {
            element = driverInstance
                    .getWait()
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (WebDriverException e) {
            LOG.warning("Could not find element with selector" + by.toString());
        }
        return element;
    }

    default List<WebElement> getMultipleElements(By by) {
        java.util.List<WebElement> elements = null;
        try {
            driverInstance
                    .getWait()
                    .until(ExpectedConditions.presenceOfElementLocated(by));
            elements = driverInstance.getDriver().findElements(by);
        } catch (WebDriverException e) {
            LOG.warning("Could not find element with selector" + by.toString());
        }
        return elements;
    }

    default HashMap<String, String> getElementAttributes(By by, List<String> attributes) {
        HashMap<String, String> attrMap = new HashMap<>();
        WebElement element = getElement(by);
        if(element != null)
            for(String attr : attributes) {
                attrMap.put(attr, element.getAttribute(attr));
            }
        return attrMap;
    }

    default HashMap<String, String> getElementCssValues(By by, List<String> cssProps) {
        HashMap<String, String> cssMap = new HashMap<>();
        WebElement element = getElement(by);
        if(element != null)
            cssProps.forEach(prop -> {
                cssMap.put(prop, element.getCssValue(prop));
            });
        return cssMap;
    }
}
