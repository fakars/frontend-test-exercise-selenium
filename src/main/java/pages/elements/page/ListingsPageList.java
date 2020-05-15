package pages.elements.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.elements.generic.OrderedList;


public enum ListingsPageList {

    PRODUCTS_LIST(By.xpath("//ol[@id='searchResults']"));

    private By by;
    private WebElement randomListItem;

    private ListingsPageList(By by) {
        this.by = by;
    }

    private OrderedList getList() {
        return new OrderedList(this.by);
    }

    public By value() {
        return this.by;
    }

    public WebElement getRandomListItem() {
        return this.getList().getRandomListItem();
    }
}
