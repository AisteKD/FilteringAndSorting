package lt.techin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "#page-menu > option:nth-child(3)")
    WebElement pageSizeClick;

    @FindBy(css = "th:nth-of-type(1) > .sort-icon")
    WebElement vegFruitNameSortingClick;

    @FindBy(id = "search-field")
    WebElement inputSearch;

    public void clickPageSize() {
        pageSizeClick.click();
    }

    public void clickFruitNameSorting(){
        vegFruitNameSortingClick.click();
    }

    public List <String> getProductNames() {
        List<WebElement> elements = driver.findElements(By.cssSelector("td:nth-of-type(1)"));

        ArrayList<String> productsNames = new ArrayList<>();
        for (WebElement element : elements) {
            productsNames.add(element.getText());
        }
        return productsNames;
    }

    public void enterSearch(String searchText){
        inputSearch.sendKeys(searchText);
    }
}
