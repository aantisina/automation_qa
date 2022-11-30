package lv.acodemy.step_definition;

import io.cucumber.java.en.Given;
import lv.acodemy.page_object.ProductsPage;

public class ProductsPageSteps {

    private final ProductsPage productPage = new ProductsPage();

    @Given("user selects {string} product from a list")
    public void userSelectsProductFromList(String productName) {
        productPage.clickOnProductByName(productName);

    }
}
