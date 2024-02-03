import lt.techin.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePageTest extends BasePageTest {

    @Test
    void testPageSizeClick() {

        HomePage homePage = new HomePage(driver);
        homePage.clickPageSize();
        palaukti();
        homePage.clickFruitNameSorting();
        palaukti();

        List<String> names = homePage.getProductNames();
        System.out.println(names);
        ArrayList<String> sortedList = new ArrayList<>(names);
        Collections.sort(sortedList);
        System.out.println(sortedList);

        assertEquals(sortedList, names);
    }

    @Test
    void verifySearchFunctionality() {
        String searchText = "BA";
        HomePage homePage = new HomePage(driver);
        homePage.enterSearch(searchText);
        List<String> names = homePage.getProductNames();
        names.forEach(System.out::println);
        for(String name: names){
            Assertions.assertTrue(name.toLowerCase().contains(searchText.toLowerCase()));
        }
    }
}
