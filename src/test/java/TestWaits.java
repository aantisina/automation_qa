import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import lv.acodemy.constants.Generic;

public class TestWaits {

    ChromeDriver driver;

    @BeforeMethod
    public void before() {
        driver = new ChromeDriver();
    }

    @Test
    public void testWaiter() {
        driver.get(Generic.GOOGLE_URL);
        driver.findElement(By.xpath("element_that_is_not_in_place"));
    }

    @AfterMethod
    public void after() {
        driver.close();
        driver.quit();
    }
}
