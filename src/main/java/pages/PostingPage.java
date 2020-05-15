package pages;

import static org.junit.jupiter.api.Assertions.*;

import pages.elements.page.*;

public class PostingPage {

    public PostingPage assertPostingData() {
        assertAll(
            () ->
                assertEquals(
                    ListingsPageLink.getSelectedLinkText(ListingsPageLink.PRODUCT_CARD_TITLE.toString()),
                    PostingPageHeading.PRODUCT_TITLE.getHeadingText()),
            () ->
                assertEquals(
                        ListingsPageSpan.getselectedProductSpanText(ListingsPageSpan.PRODUCT_PRICE.toString()),
                        PostingPageSpan.PRODUCT_PRICE.getSpanText()
                )
        );
        return this;
    }
}
