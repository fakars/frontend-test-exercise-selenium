package pages;

import static org.junit.jupiter.api.Assertions.*;

import pages.elements.page.*;

import java.util.HashMap;

public class ListingsPage {

    public ListingsPage assertSelectedSubCategory(ListingsPageHeading category, String selectedSubCategory) {
        category
            .assertHeadingAttributes(new HashMap<String, String>(){{
                put("class", "breadcrumb__title");
            }})
            .assertHeadingCssValues(new HashMap<String, String>(){{
                put("display", "block");
                put("font-size", "26px");
                put("font-weight", "600");
                put("line-height", "30px");
                put("position", "relative");
                put("word-wrap", "break-word");
                put("z-index", "1");
            }});
        assertEquals(HomePageLink.getSelectedLinkText(selectedSubCategory), category.getHeadingText());
        return this;
    }

    public ListingsPage assertResultsCounter() {
        ListingsPageContainer.RESULT_QTY
            .assertContainerAttributes(new HashMap<String, String>(){{
                put("class", "quantity-results");
            }})
            .assertContainerCssValues(new HashMap<String, String>(){{
                put("display", "inline-flex");
                put("flex-grow", "1");
                put("margin-bottom", "14px");
                put("font-size", "14px");
                put("font-weight", "300");
            }});
        return this;
    }

    public ListingsPage selectLocation(String location) {
        ListingsPageLink.valueOf(location).click();
        return this;
    }

    public ListingsPage selectRandomProductFromList(ListingsPageList productList) {
        ListingsPageLink.PRODUCT_CARD_TITLE.clickRandomProductLink(productList);
        return this;
    }
}
