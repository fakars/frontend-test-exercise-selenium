package steps;

import cucumber.api.java8.En;
import pages.ListingsPage;
import pages.elements.page.ListingsPageHeading;
import pages.elements.page.ListingsPageList;

public class ListingsPageSteps implements En {

    public ListingsPageSteps(ListingsPage listings) {

        Then("^the subcategory title should match the selected ([^\"]*)$", (String subCategory) -> {
            listings.assertSelectedSubCategory(ListingsPageHeading.SUB_CATEGORY_TITLE, subCategory);
        });

        And("^the results counter should be visible$", listings::assertResultsCounter);

        And("^select ([^\"]*) as location from the list and click on a random posting$", (String location) -> {
            listings
                    .selectLocation(location)
                    .selectRandomProductFromList(ListingsPageList.PRODUCTS_LIST);
        });

    }
}
