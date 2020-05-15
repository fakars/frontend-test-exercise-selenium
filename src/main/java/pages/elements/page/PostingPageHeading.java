package pages.elements.page;

import org.openqa.selenium.By;
import pages.elements.generic.Heading;

import java.util.HashMap;

public enum PostingPageHeading {

    PRODUCT_TITLE(By.cssSelector("h1[class='ui-pdp-title']"));

    private By by;

    private PostingPageHeading(By by) {
        this.by = by;
    }

    private Heading getHeading() {
        return new Heading(this.by);
    }

    public PostingPageHeading click() {
        this.getHeading().click();
        return this;
    }

    public PostingPageHeading assertHeadingAttributes(HashMap<String, String> expectedAttr) {
        this.getHeading().assertHeadingAttributes(expectedAttr);
        return this;
    }

    public PostingPageHeading assertHeadingCssValues(HashMap<String, String> expectedCss){
        this.getHeading().assertHeadingCssValues(expectedCss);
        return this;
    };

    public PostingPageHeading hover() {
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