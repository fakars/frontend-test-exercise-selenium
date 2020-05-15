package pages.elements.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.elements.generic.Span;

import java.util.HashMap;

public enum PostingPageSpan {

    PRODUCT_PRICE(By.xpath("//span[@class='price-tag-fraction']"));

    private By by;
    private static HashMap<String, String> selectedProductSpanText = new HashMap<>();

    private PostingPageSpan(By by) {
        this.by = by;
    }

    private Span getSpan() {
        return new Span(this.by);
    }

    public PostingPageSpan click() {
        this.getSpan().click();
        return this;
    }

    public PostingPageSpan hover() {
        this.getSpan().hover();
        return this;
    }

    public String getSpanText() {
        return this.getSpan().getSpanText();
    }

    public PostingPageSpan assertSpanAttributes(HashMap<String, String> expectedAttr) {
        this.getSpan().assertSpanAttributes(expectedAttr);
        return this;
    }

    public void getSpanFromRandomProduct(ListingsPageList list) {
        WebElement element = list.getRandomListItem().findElement(By.xpath("//span[@class='price__fraction']"));
        selectedProductSpanText.put(this.toString(), element.getText());
    }


    public PostingPageSpan setSelectedSpanText() {
        selectedProductSpanText.put(this.toString(), this.getSpanText());
        return this;
    }

    public static String getSelectedSpanText(String span) {
        return selectedProductSpanText.get(span);
    }

    public By value() {
        return this.by;
    }
}
