package pages.elements.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import config.DriverManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Span implements GenericElement {

    private By by;
    private final DriverManager driverInstance = DriverManager.getInstance();

    public Span(By by) {
        this.by = by;
    }

    private HashMap<String, String> setSpanAttributes(List<String> attributes) {
        return getElementAttributes(this.by, attributes);
    }

    public void assertSpanAttributes(HashMap<String, String> expectedAttr) {
        HashMap<String, String> spanAttr =  this.setSpanAttributes(new ArrayList<>(expectedAttr.keySet()));
        for(Map.Entry<String, String> attr : expectedAttr.entrySet()) {
            if(spanAttr.containsKey(attr.getKey())){
                assertEquals(attr.getValue(), spanAttr.get(attr.getKey()),
                        () -> "Expected attribute '" + attr.getKey() + "' to be '"
                                + attr.getValue() + "' but was '" + spanAttr.get(attr.getKey())
                                + "' on <span> element selected by " + this.by);
            }
        }
    }

    public Span click() {
        getElement(this.by).click();
        return this;
    }

    public Span hover() {
        new Actions(driverInstance.getDriver())
                .moveToElement(getElement(this.by)).build().perform();
        return this;
    }

    public String getSpanText() {
        return getElement(this.by).getText();
    }

}
