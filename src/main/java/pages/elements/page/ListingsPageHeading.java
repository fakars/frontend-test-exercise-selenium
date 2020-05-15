package pages.elements.page;

import org.openqa.selenium.By;
import pages.elements.generic.Heading;
import java.util.HashMap;

public enum ListingsPageHeading {

    SUB_CATEGORY_TITLE(By.className("breadcrumb__title"));

    private By by;

    private ListingsPageHeading(By by) {
        this.by = by;
    }

    private Heading getHeading() {
        return new Heading(this.by);
    }

    public ListingsPageHeading click() {
        this.getHeading().click();
        return this;
    }

    public ListingsPageHeading assertHeadingAttributes(HashMap<String, String> expectedAttr) {
        this.getHeading().assertHeadingAttributes(expectedAttr);
        return this;
    }

    public ListingsPageHeading assertHeadingCssValues(HashMap<String, String> expectedCss){
        this.getHeading().assertHeadingCssValues(expectedCss);
        return this;
    };

    public ListingsPageHeading hover() {
        this.getHeading().hover();
        return this;
    }

    public String getHeadingText() {
        return this.getHeading().getHeadingText();
    }

    public By value() {
        return this.by;
    }
}