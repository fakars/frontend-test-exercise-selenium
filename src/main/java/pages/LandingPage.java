package pages;

import pages.elements.page.LandingPageLink;
import utilities.SiteUtils;
import java.util.HashMap;
import java.util.logging.Logger;

public class LandingPage {

    private final String URL = SiteUtils.instance().getBaseUrl();

    public Page getPage() {
        return new Page(this.URL);
    }

    public LandingPage goToLanding() {
        this.getPage().goTo();
        return this;
    }

    public LandingPage selectCountry(LandingPageLink link) {
        link.setSelectedLinkText()
            .assertLinkAttributes(new HashMap<String, String>(){{
                put("class", "ml-site-link");
                put("id", SiteUtils.instance().getCurrentSite());
                put("href", SiteUtils.instance().getCurrentSiteUrl());
            }})
                .click();
        return this;
    }
}