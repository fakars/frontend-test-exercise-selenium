package steps;

import cucumber.api.java8.En;
import pages.HomePage;
import pages.elements.page.HomePageLink;

public class HomePageSteps implements En {

    public HomePageSteps(HomePage home) {

        When("^I hover over the categories menu and select a ([^\"]*) and a ([^\"]*)$",
                (String category, String subCategory) -> {
                    home
                        .selectFromHeader(HomePageLink.CATEGORIES)
                        .selectCategory(HomePageLink.valueOf(category))
                        .selectSubCategory(HomePageLink.valueOf(subCategory));
        });
    }
}
