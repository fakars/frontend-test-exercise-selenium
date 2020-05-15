package pages.elements.page;

import org.openqa.selenium.By;
import pages.elements.generic.Link;
import java.util.HashMap;

public enum HomePageLink {

    CATEGORIES(By.cssSelector("a[data-js='nav-menu-categories-trigger']")),

    HOME_APPLIANCES(By.xpath("//section[@data-js='nav-categs-departments']//ul[2]//li[2]//a")),
    TECHNOLOGY(By.xpath("//section[@data-js='nav-categs-departments']//ul[2]//li[1]//a")),
    BEAUTY_CARE(By.xpath("//section[@data-js='nav-categs-departments']//ul[3]//li[5]//a")),
    TOOLS_INDUSTRIAL(By.xpath("//section[@data-js='nav-categs-departments']//ul[2]//li[3]//a")),
    TOYS_BABIES(By.xpath("//section[@data-js='nav-categs-departments']//ul[2]//li[4]//a")),

    AIR_CONDITIONING(By.xpath("//ul[@class='nav-categs-detail__categ-list']//li[1]//a")),
    CELLPHONES(By.xpath("//ul[@class='nav-categs-detail__categ-list']//li[1]//a")),
    TEXTILE(By.xpath("//ul[@class='nav-categs-detail__categ-list']//li[4]//a")),
    BABY_ROOM(By.xpath("//div[@class='nav-categs-detail__body-content']//article[3]//h2/a"));


    private By by;
    private static HashMap<String, String> selectedLinkText = new HashMap<>();

    private HomePageLink(By by) {
        this.by = by;
    }

    private Link getLink() {
        return new Link(this.by);
    }

    public HomePageLink click() {
        this.getLink().click();
        return this;
    }

    public HomePageLink assertLinkAttributes(HashMap<String, String> expectedAttr) {
        this.getLink().assertLinkAttributes(expectedAttr);
        return this;
    }

    public HomePageLink hover() {
        this.getLink().hover();
        return this;
    }

    private String getLinkText() {
        return this.getLink().getLinkText();
    }

    public HomePageLink setSelectedLinkText() {
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
