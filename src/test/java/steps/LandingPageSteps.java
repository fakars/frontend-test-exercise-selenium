package steps;

import cucumber.api.java8.En;
import pages.LandingPage;
import pages.elements.page.LandingPageLink;

public class LandingPageSteps implements En {

    public LandingPageSteps(LandingPage landing) {

        Given("^I'm on the landing page and I select a country$", () -> {
            landing
                .goToLanding()
                .selectCountry(LandingPageLink.COUNTRY);
        });
    }
}
