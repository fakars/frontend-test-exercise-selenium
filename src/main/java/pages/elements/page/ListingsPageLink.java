package pages.elements.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.elements.generic.Link;
import config.DriverManager;

import java.util.HashMap;

public enum ListingsPageLink {

    CAPITAL_FEDERAL(By.xpath("//a[@class='qcat-truncate ' and @title='Capital Federal']")),
    BS_AS_SUR(By.xpath("//a[@class='qcat-truncate ' and @title='Bs.As. G.B.A. Sur']")),
    CORDOBA(By.xpath("//a[@class='qcat-truncate ' and @title='Córdoba']")),
    MENDOZA(By.xpath("//a[@class='qcat-truncate ' and @title='Mendoza']")),

    PRODUCT_CARD_TITLE(By.className("item__info-title"));

    private By by;
    private static HashMap<String, String> selectedLinkText = new HashMap<>();

    private ListingsPageLink(By by) {
        this.by = by;
    }

    private Link getLink() {
        return new Link(this.by);
    }

    public ListingsPageLink click() {
        this.getLink().click();
        return this;
    }

    public ListingsPageLink hover() {
        this.getLink().hover();
        return this;
    }

    public String getLinkText() {
        return this.getLink().getLinkText();
    }

    public ListingsPageLink assertLinkAttributes(HashMap<String, String> expectedAttr) {
        this.getLink().assertLinkAttributes(expectedAttr);
        return this;
    }

    private WebElement getLinkFromRandomProduct(ListingsPageList list) {
        WebElement listItem = list.getRandomListItem();
        String href = listItem.findElement(By.tagName("a")).getAttribute("href");
        ListingsPageSpan.setSpanTextFromRandomProduct(listItem);
        return DriverManager.getInstance().getDriver()
                .findElement(By.xpath("//a[@class='item__info-title' and @href='"+href+"']"));
    }

    public ListingsPageLink clickRandomProductLink(ListingsPageList list) {
        WebElement link = getLinkFromRandomProduct(list);
        selectedLinkText.put(this.toString(), link.findElement(By.className("main-title")).getText());
        link.click();
        return this;
    }

    public ListingsPageLink setSelectedLinkText() {
        selectedLinkText.put(this.toString(), this.getLinkText());
        return this;
    }

    public static String getSelectedLinkText(String link) {
        return selectedLinkText.get(link);
    }

    public By value() {
        return this.by;
    }
}
