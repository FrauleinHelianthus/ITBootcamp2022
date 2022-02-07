package Tests;

import Base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestSelectProduct extends BasePage {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com");
        login.Login("standard_user", "secret_sauce");
    }

    /**
     * • Test Case Successfully Registered User Selects Products
     *
     * This test verifies that standard_user select chosen products and that chosen product are placed into cart.
     * The condition is that user is logged in.
     *
     * 1. Go to https://www.saucedemo.com/inventory.html
     * 2. Click on Sauce Labs Backpack's "add to cart" button
     * 3. Click on Sauce Labs Onesie's "add to cart" button
     * 4. Click on Test.allTheThings() T-Shirt (Red)'s "add to cart" button
     * 5. Click on Sauce Labs Fleece Jacket's "add to cart" button
     * 6. Assert that there are 4 items places in the cart
     * 7. Assert that "remove" buttons have been displayed
     */

    @Test
    public void testSelectProduct() throws InterruptedException {

        wdwait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));

        addToCartButton.addToCart(addToCartButton.getAddToCartSauceLabsBackpackButton());
        addToCartButton.addToCart(addToCartButton.getAddToCartSauceLabsOnesieButton());
        addToCartButton.addToCart(addToCartButton.getAddToCartTestAllTheThingsTShirtRedButton());
        addToCartButton.addToCart(addToCartButton.getAddToCartSauceLabsFleeceJacketButton());
        Thread.sleep(3000);

        String actualRemoveButton = removeButtons.getRemoveSauceLabsBackpackButton().getText();
        String expectedRemoveButton = "REMOVE";
        String actualShoppingCartBadge = products.getCartNumber().getText();
        String expectedShoppingCartBadge = "4";


        Assert.assertEquals(actualShoppingCartBadge,expectedShoppingCartBadge);
        Assert.assertEquals(actualRemoveButton,expectedRemoveButton);
    }

}
