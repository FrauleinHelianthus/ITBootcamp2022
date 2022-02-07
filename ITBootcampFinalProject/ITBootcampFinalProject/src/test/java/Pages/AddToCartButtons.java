package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartButtons{
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement addToCartSauceLabsBackpackButton;
    WebElement addToCartSauceLabsBoltTShirtButton;
    WebElement addToCartSauceLabsOnesieButton;
    WebElement addToCartSauceLabsBikeLightButton;
    WebElement addToCartSauceLabsFleeceJacketButton;
    WebElement addToCartTestAllTheThingsTShirtRedButton;

    public AddToCartButtons(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }


    public WebElement getAddToCartSauceLabsBackpackButton() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }

    public WebElement getAddToCartSauceLabsBoltTShirtButton() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
    }

    public WebElement getAddToCartSauceLabsOnesieButton() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
    }

    public WebElement getAddToCartSauceLabsBikeLightButton() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
    }

    public WebElement getAddToCartSauceLabsFleeceJacketButton() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
    }

    public WebElement getAddToCartTestAllTheThingsTShirtRedButton() {
        return driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
    }
    //-----------------------------------------------------------------

    public void addToCart(WebElement productAddToCartButton) {
        productAddToCartButton.click();
    }

    public void addToCart1() {
        addToCart(getAddToCartSauceLabsBackpackButton());
        addToCart(getAddToCartSauceLabsOnesieButton());
        addToCart(getAddToCartTestAllTheThingsTShirtRedButton());
        addToCart(getAddToCartSauceLabsFleeceJacketButton());
    }

}
