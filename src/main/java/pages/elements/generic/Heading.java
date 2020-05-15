package pages.elements.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import config.DriverManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Heading implements GenericElement {

    private By by;
    private final DriverManager driverInstance = DriverManager.getInstance();

    public Heading(By by) {
        this.by = by;
    }

    private HashMap<String, String> setHeadingAttributes(List<String> attributes) {
        return getElementAttributes(this.by, attributes);
    }

    public void assertHeadingAttributes(HashMap<String, String> expectedAttr) {
        HashMap<String, String> hAttr =  this.setHeadingAttributes(new ArrayList<>(expectedAttr.keySet()));
        for(Map.Entry<String, String> attr : expectedAttr.entrySet()) {
            if(hAttr.containsKey(attr.getKey())){
                assertEquals(attr.getValue(), hAttr.get(attr.getKey()),
                    () -> "Expected attribute '" + attr.getKey() + "' to be '"
                            + attr.getValue() + "' but was '" + hAttr.get(attr.getKey())
                            + "' on <ol> element selected by " + this.by);
            }
        }
    }

    private HashMap<String, String> setHeadingCssValues(List<String> cssProps) {
        return getElementCssValues(this.by, cssProps);
    }

    public void assertHeadingCssValues(HashMap<String, String> expectedCssValues) {
        HashMap<String, String> actualHCss =  this.setHeadingCssValues(
                new ArrayList<>(expectedCssValues.keySet()));
        for(Map.Entry<String, String> expectedCssValue : expectedCssValues.entrySet()) {
            if(actualHCss.containsKey(expectedCssValue.getKey())){
                assertEquals(expectedCssValue.getValue(), actualHCss.get(expectedCssValue.getKey()),
                        () -> "Expected css property " + expectedCssValue.getKey() + " to be "
                                + expectedCssValue.getValue() + " but was " + actualHCss.get(expectedCssValue.getKey())
                                + " on h2 element selected by " + this.by);
            }
        }
    }

    public Heading click() {
        getElement(this.by).click();
        return this;
    }

    public Heading hover() {
        new Actions(driverInstance.getDriver())
                .moveToElement(getElement(this.by)).build().perform();
        return this;
    }

    public String getHeadingText() {
        return getElement(this.by).getText();
    }
}
