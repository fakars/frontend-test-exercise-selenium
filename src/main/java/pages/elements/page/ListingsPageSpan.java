package pages.elements.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.elements.generic.Span;


import java.util.HashMap;

public enum ListingsPageSpan {

    PRODUCT_PRICE(By.xpath("//span[@class='price__fraction']"));

    private By by;
    private static HashMap<String, String> selectedProductSpanText = new HashMap<>();

    private ListingsPageSpan(By by) {
        this.by = by;
    }

    private Span getSpan() {
        return new Span(this.by);
    }

    public ListingsPageSpan click() {
        this.getSpan().click();
        return this;
    }

    public ListingsPageSpan hover() {
        this.getSpan().hover();
        return this;
    }

    public String getSpanText() {
        return this.getSpan().getSpanText();
    }

    public ListingsPageSpan assertSpanAttributes(HashMap<String, String> expectedAttr) {
        this.getSpan().assertSpanAttributes(expectedAttr);
        return this;
    }

    public static void setSpanTextFromRandomProduct(WebElement element) {
        WebElement span = element.findElement(By.xpath(".//span[@class='price__fraction']"));
        selectedProductSpanText.put(PRODUCT_PRICE.toString(), span.getText());
    }


    public ListingsPageSpan setselectedProductSpanText() {
        selectedProductSpanText.put(this.toString(), this.getSpanText());
        return this;
    }

    public static String getselectedProductSpanText(String span) {
        return selectedProductSpanText.get(span);
    }

    public By value() {
        return this.by;
    }
}
