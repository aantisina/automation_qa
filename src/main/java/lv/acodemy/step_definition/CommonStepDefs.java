package lv.acodemy.step_definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import lv.acodemy.utils.DriverManager;

public class CommonStepDefs {

    private WebDriver driver = DriverManager.getInstance();

    @Given("user opens {string}")
    public void userOpenUrl(String url) {
        driver.get(url);
    }


}
