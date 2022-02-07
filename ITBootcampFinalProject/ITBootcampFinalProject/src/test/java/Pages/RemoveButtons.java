package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RemoveButtons {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement RemoveSauceLabsBackpackButton;
    WebElement RemoveSauceLabsBoltTShirtButton;
    WebElement RemoveSauceLabsOnesieButton;
    WebElement RemoveSauceLabsBikeLightButton;
    WebElement RemoveSauceLabsFleeceJacketButton;
    WebElement RemoveTestAllTheThingsTShirtRedButton;

    public RemoveButtons(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getRemoveSauceLabsBackpackButton() {
        return driver.findElement(By.id("remove-sauce-labs-backpack"));
    }

    public WebElement getRemoveSauceLabsBoltTShirtButton() {
        return driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt"));
    }

    public WebElement getRemoveSauceLabsOnesieButton() {
        return driver.findElement(By.id("remove-sauce-labs-onesie"));
    }

    public WebElement getRemoveSauceLabsBikeLightButton() {
        return driver.findElement(By.id("remove-sauce-labs-bike-light"));
    }

    public WebElement getRemoveSauceLabsFleeceJacketButton() {
        return driver.findElement(By.id("remove-sauce-labs-fleece-jacket"));
    }

    public WebElement getRemoveTestAllTheThingsTShirtRedButton() {
        return driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)"));
    }
    //-----------------------------------------------------------------

    public void remove(WebElement productRemoveFromCart) {
        productRemoveFromCart.click();
    }

}
