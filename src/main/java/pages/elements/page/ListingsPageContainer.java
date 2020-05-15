package pages.elements.page;

import org.openqa.selenium.By;
import pages.elements.generic.Container;

import java.util.HashMap;

public enum ListingsPageContainer {

    RESULT_QTY(By.className("quantity-results"));

    private By by;

    private ListingsPageContainer(By by) {
        this.by = by;
    }

    private Container getContainer() {
        return new Container(this.by);
    }

    public ListingsPageContainer click() {
        this.getContainer().click();
        return this;
    }

    public ListingsPageContainer assertContainerAttributes(HashMap<String, String> expectedAttr) {
        this.getContainer().assertDivAttributes(expectedAttr);
        return this;
    }

    public ListingsPageContainer assertContainerCssValues(HashMap<String, String> expectedCss){
        this.getContainer().assertDivCssValues(expectedCss);
        return this;
    };

    public ListingsPageContainer hover() {
        this.getContainer().hover();
        return this;
    }

    private String getContainerText() {
        return this.getContainer().getContainerText();
    }

    public By value() {
        return this.by;
    }
}
