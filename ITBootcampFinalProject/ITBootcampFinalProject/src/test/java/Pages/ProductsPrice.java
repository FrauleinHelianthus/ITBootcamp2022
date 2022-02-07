package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPrice {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement priceSauceLabsBackpack;
    WebElement priceSauceLabsBoltTShirt;
    WebElement priceSauceLabsOnesie;
    WebElement priceSauceLabsBikeLight;
    WebElement priceSauceLabsFleeceJacket;
    WebElement priceTestAllTheThingsTShirtRed;

    public ProductsPrice(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getPriceSauceLabsBackpack() {
        return driver.findElement(By.cssSelector("div.page_wrapper div.inventory_container div.inventory_list div.inventory_item:nth-child(1) div.inventory_item_description div.pricebar > div.inventory_item_price"));
    }

    public WebElement getPriceSauceLabsBoltTShirt() {
        return driver.findElement(By.cssSelector("div.page_wrapper div.inventory_container div.inventory_list div.inventory_item:nth-child(3) div.inventory_item_description div.pricebar > div.inventory_item_price"));
    }

    public WebElement getPriceSauceLabsOnesie() {
        return driver.findElement(By.cssSelector("div.page_wrapper div.inventory_container div.inventory_list div.inventory_item:nth-child(5) div.inventory_item_description div.pricebar > div.inventory_item_price"));
    }

    public WebElement getPriceSauceLabsBikeLight() {
        return driver.findElement(By.cssSelector("div.page_wrapper div.inventory_container div.inventory_list div.inventory_item:nth-child(2) div.inventory_item_description div.pricebar > div.inventory_item_price"));
    }

    public WebElement getPriceSauceLabsFleeceJacket() {
        return driver.findElement(By.cssSelector("div.page_wrapper div.inventory_container div.inventory_list div.inventory_item:nth-child(4) div.inventory_item_description div.pricebar > div.inventory_item_price"));
    }

    public WebElement getPriceTestAllTheThingsTShirtRed() {
        return driver.findElement(By.cssSelector("div.page_wrapper div.inventory_container div.inventory_list div.inventory_item:nth-child(6) div.inventory_item_description div.pricebar > div.inventory_item_price"));
    }

    //-------------------------------------------------------------
}
