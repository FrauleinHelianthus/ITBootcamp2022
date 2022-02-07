package Tests;

import Base.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRemoveAllItemsFromCart extends BasePage{


        @BeforeMethod
        public void pageSetUp() {
            driver.manage().window().maximize();
            driver.navigate().to("https://www.saucedemo.com");
            login.Login("standard_user", "secret_sauce");
            addToCartButton.addToCart1();
            products.getCart().click();

        }

    /**
     • Test Remove All Items From The Cart

     This test case verifies if teha cart is empty when all the items has been removed. The condition is that the user is logged in.

     1. Go to saucedemo.com
     2. Enter registered username
     3. Enter registered password
     4. Choose several product by clicking "add to cart"
     5. Click on the cart
     6. Remove all products by clicking on buttons "remove"
     7. If no products have been diplayed in cart, assert that the cart is empty

     Test parameters:
     username : "performance_glitch_user"
     password : "secret_sauce"
     **/

        @Test
        public void removeAllItemsFromCart() throws InterruptedException {
            wdwait.until(ExpectedConditions.elementToBeClickable(removeButtons.getRemoveSauceLabsBackpackButton()));
            removeButtons.remove(removeButtons.getRemoveSauceLabsBackpackButton());
            removeButtons.remove(removeButtons.getRemoveSauceLabsOnesieButton());
            removeButtons.remove(removeButtons.getRemoveTestAllTheThingsTShirtRedButton());
            removeButtons.remove(removeButtons.getRemoveSauceLabsFleeceJacketButton());
            Thread.sleep(2000);
            boolean cartIsEmpty = true;
            if(cart.getListItem().size() == 0) {
                Assert.assertTrue(cartIsEmpty,"The cart is empty");
                System.out.println("The cart is empty");
            } else {
                Assert.assertTrue(!cartIsEmpty,"The cart is not empty");
                System.out.println("The cart is not empty");
            }


        }


}

