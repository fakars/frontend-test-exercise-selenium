package pages.elements.page;

import org.openqa.selenium.By;
import pages.elements.generic.Link;
import utilities.SiteUtils;
import java.util.HashMap;

public enum LandingPageLink {

    COUNTRY(By.id(SiteUtils.instance().getCurrentSite()));

    private By by;
    private static HashMap<String, String> selectedLinkText = new HashMap<>();

    private LandingPageLink(By by) {
        this.by = by;
    }

    private Link getLink() {
        return new Link(this.by);
    }

    public LandingPageLink click() {
        this.getLink().click();
        return this;
    }

    public LandingPageLink hover() {
        this.getLink().hover();
        return this;
    }

    public String getLinkText() {
        return this.getLink().getLinkText();
    }

    public LandingPageLink assertLinkAttributes(HashMap<String, String> expectedAttr) {
        this.getLink().assertLinkAttributes(expectedAttr);
        return this;
    }

    public LandingPageLink setSelectedLinkText() {
        selectedLinkText.put(this.toString(), this.getLinkText());
        return this;
    }

    private static String getSelectedLinkText(String link) {
        return selectedLinkText.get(link);
    }

    public By value() {
        return this.by;
    }
}
