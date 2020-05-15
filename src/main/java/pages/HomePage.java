package pages;

import pages.elements.page.HomePageLink;
import utilities.SiteUtils;
import java.util.HashMap;

public class HomePage {

    private final String URL = SiteUtils.instance().getCurrentSiteUrl();

    public Page getPage() {
        return new Page(this.URL);
    }

    public HomePage goToHomePage() {
        this.getPage().goTo();
        return this;
    }

    public HomePage selectFromHeader(HomePageLink headerLink) {
        headerLink.setSelectedLinkText()
                .assertLinkAttributes(new HashMap<String, String>(){{
                    put("href", SiteUtils.instance().getCurrentSiteUrl().concat("categorias#nav-header"));
                    put("class", "nav-menu-categories-link");
                    put("data-js", "nav-menu-categories-trigger");
                    put("rel", "nofollow");
                    put("tabindex", "7");
                }});
        headerLink.hover();
        return this;
    }

    public HomePage selectCategory(HomePageLink category) {
        category.setSelectedLinkText()
                .hover()
                .assertLinkAttributes(new HashMap<String, String>(){{
                    put("class", "nav-categs-departments__selected");
                    put("href", SiteUtils.instance().getCurrentSiteUrl().concat("#"));
                }});
        return this;
    }

    public HomePage selectSubCategory(HomePageLink subCategory) {
        subCategory.setSelectedLinkText().click();
        return this;
    }

}
