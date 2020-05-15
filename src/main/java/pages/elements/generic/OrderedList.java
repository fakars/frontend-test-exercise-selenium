package pages.elements.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import config.DriverManager;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderedList implements GenericElement {

    private By by;
    private final DriverManager driverInstance = DriverManager.getInstance();

    public OrderedList(By by) {
        this.by = by;
    }

    private HashMap<String, String> setListAttributes(java.util.List<String> attributes) {
        return getElementAttributes(this.by, attributes);
    }

    public void assertListAttributes(HashMap<String, String> expectedAttr) {
        HashMap<String, String> listAttr =  this.setListAttributes(new ArrayList<>(expectedAttr.keySet()));
        for(Map.Entry<String, String> attr : expectedAttr.entrySet()) {
            if(listAttr.containsKey(attr.getKey())){
                assertEquals(attr.getValue(), listAttr.get(attr.getKey()),
                    () -> "Expected attribute '" + attr.getKey() + "' to be '"
                            + attr.getValue() + "' but was '" + listAttr.get(attr.getKey())
                            + "' on <ol> element selected by " + this.by);
            }
        }
    }

    public WebElement getRandomListItem() {
        List<WebElement> items = getElement(this.by).findElements(By.tagName("li"));
        return items.get(new Random().nextInt(items.size()));
    }

    public OrderedList click() {
        getElement(this.by).click();
        return this;
    }

    public OrderedList hover() {
        new Actions(driverInstance.getDriver())
                .moveToElement(getElement(this.by)).build().perform();
        return this;
    }
}
