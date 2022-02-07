package Tests;

import Base.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCheckoutSelectedProducts extends BasePage {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com");
        login.Login("standard_user", "secret_sauce");
        addToCartButton.addToCart1();
        products.getCart().click();

    }

/**
 • Test Case CheckOut Selected Products

 This test case verifies if the checkout of selected items was successful. The condition is that user is logged in.

 1. Go to saucedemo.com
 2. Enter valid username
 3. Enter a valid password
 4. Click on the Login button
 5. Add products to the cart by clicking button "add to cart"
 6. Click on cart item
 7. Click on button "checkout"
 8. Fill in the form by entering first name, last name and postal code
 9. Click on button "continue"
 10. Click on button "finish"
 11. Assert that the message "Thank you for your order" has been displayed


 Test parameters:
 username : "standard_username"
 password : "secret_sauce"
 **/

    @Test
    public void checkOutSelectedProducts() {
        cart.getCheckoutButton().click();
        checkOutStepOne.fillInCheckOutData("Persa", "Persic","1000");
        checkoutStepTwo.getFinishButton().click();

        String actualThankYouMsg = checkoutComplete.getThankYouMsg().getText();
        String expectedThankYouMsg = "THANK YOU FOR YOUR ORDER";

        Assert.assertEquals(actualThankYouMsg,expectedThankYouMsg);

    }

/**
     • Test Case Change Order List before Final Checkout

     This test case verifies if the checkout of selected items was successful after changing the order list.

     1. Go to saucedemo.com
     2. Enter valid username
     3. Enter a valid password
     4. Click on the Login button
     5. Add products to the cart by clicking button "add to cart"
     6. Click on cart item
     7. Click on button "remove", but do not delete all items from order list
     8. Click on button "continue shopping"
     9. Choose an item by clicking button "add to cart"
    10. Click on cart item
    11. Click on button "checkout"
    12. Fill in the form by entering first name, last name and postal code
    13. Click on button "continue"
    14. Click on button "finish"
    15. Assert that the message "Thank you for your order" has been displayed


     Test parameters:
     username : "standard_username"
     password : "secret_sauce"
     **/

    @Test
    public void changeOrderListBeforeFinalCheckout() {
        wdwait.until(ExpectedConditions.elementToBeClickable(removeButtons.getRemoveSauceLabsBackpackButton()));
        removeButtons.remove(removeButtons.getRemoveSauceLabsBackpackButton());
        cart.getContinueShoppingButton().click();
        wdwait.until(ExpectedConditions.elementToBeClickable(addToCartButton.getAddToCartSauceLabsBikeLightButton()));
        addToCartButton.addToCart(addToCartButton.getAddToCartSauceLabsBikeLightButton());
        products.getCart().click();
        cart.getCheckoutButton().click();
        checkOutStepOne.fillInCheckOutData("Persa", "Persic","1000");
        checkoutStepTwo.getFinishButton().click();

        String actualThankYouMsg = checkoutComplete.getThankYouMsg().getText();
        String expectedThankYouMsg = "THANK YOU FOR YOUR ORDER";

        Assert.assertEquals(actualThankYouMsg,expectedThankYouMsg);
    }
}
