package steps;

import cucumber.api.java8.En;

import pages.PostingPage;

public class PostingPageSteps implements En {

    public PostingPageSteps(PostingPage posting) {
        Then("^the product details should match those found in the listing$", posting::assertPostingData);
    }
}
