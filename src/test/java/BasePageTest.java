import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.time.Duration.ofSeconds;

public class BasePageTest {

    WebDriver driver;

    @BeforeEach
    void createLoad(){
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(ofSeconds(5));
    }

    @AfterEach
    void tearDown(){
        driver.quit();
    }

    public void palaukti() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }

}
