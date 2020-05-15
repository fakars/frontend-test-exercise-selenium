package pages.elements.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import config.DriverManager;

import java.util.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Link implements GenericElement {

    private By by;
    private final DriverManager driverInstance = DriverManager.getInstance();

    public Link(By by) {
        this.by = by;
    }

    private HashMap<String, String> setLinkAttributes(List<String> attributes) {
        return getElementAttributes(this.by, attributes);
    }

    public void assertLinkAttributes(HashMap<String, String> expectedAttr) {
        HashMap<String, String> linkAttr =  this.setLinkAttributes(new ArrayList<>(expectedAttr.keySet()));
        for(Map.Entry<String, String> attr : expectedAttr.entrySet()) {
            if(linkAttr.containsKey(attr.getKey())){
                assertEquals(attr.getValue(), linkAttr.get(attr.getKey()),
                        () -> "Expected attribute '" + attr.getKey() + "' to be '"
                                + attr.getValue() + "' but was '" + linkAttr.get(attr.getKey())
                                + "' on <a> element selected by " + this.by);
            }
        }
    }

    public Link click() {
        getElement(this.by).click();
        return this;
    }

    public Link hover() {
        new Actions(driverInstance.getDriver())
                .moveToElement(getElement(this.by)).build().perform();
        return this;
    }

    public String getLinkText() {
        return getElement(this.by).getText();
    }
}

