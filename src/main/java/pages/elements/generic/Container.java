package pages.elements.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import config.DriverManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Container implements GenericElement {

    private By by;
    private final DriverManager driverInstance = DriverManager.getInstance();

    public Container(By by) {
        this.by = by;
    }

    private HashMap<String, String> setDivAttributes(List<String> attributes) {
        return getElementAttributes(this.by, attributes);
    }

    public void assertDivAttributes(HashMap<String, String> expectedAttr) {
        HashMap<String, String> divAttr =  this.setDivAttributes(new ArrayList<>(expectedAttr.keySet()));
        for(Map.Entry<String, String> attr : expectedAttr.entrySet()) {
            if(divAttr.containsKey(attr.getKey())){
                assertEquals(attr.getValue(), divAttr.get(attr.getKey()));
            }
        }
    }

    private HashMap<String, String> setDivCssValues(List<String> cssProps) {
        return getElementCssValues(this.by, cssProps);
    }

    public void assertDivCssValues(HashMap<String, String> expectedCssValues) {
        HashMap<String, String> actualCss =  this.setDivCssValues(new ArrayList<>(expectedCssValues.keySet()));
        for(Map.Entry<String, String> expectedCssValue : expectedCssValues.entrySet()) {
            if(actualCss.containsKey(expectedCssValue.getKey())){
                assertEquals(expectedCssValue.getValue(), actualCss.get(expectedCssValue.getKey()),
                        () -> "Expected css property " + expectedCssValue.getKey() + " to be "
                                + expectedCssValue.getValue() + " but was " + actualCss.get(expectedCssValue.getKey())
                                + " on <div> element selected by " + this.by);
            }
        }
    }

    public Container click() {
        getElement(this.by).click();
        return this;
    }

    public Container hover() {
        new Actions(driverInstance.getDriver())
                .moveToElement(getElement(this.by)).build().perform();
        return this;
    }

    public String getContainerText() {
        return getElement(this.by).getText();
    }
}
