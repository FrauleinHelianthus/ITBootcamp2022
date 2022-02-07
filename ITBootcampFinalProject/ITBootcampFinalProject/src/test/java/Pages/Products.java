package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;


public class Products {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement cart;
    WebElement cartNumber;
    WebElement productSort;
    List<WebElement> productPictures;
    List<WebElement> inventoryItemName;
    List<WebElement> inventoryItemPrice;
    public ProductsPrice productsPrice;
    public ProductsNames productsNames;
    public AddToCartButtons addToCartButton;
    public RemoveButtons removeButtons;



    public Products(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
        productsPrice = new ProductsPrice(driver, wdwait);
        productsNames = new ProductsNames(driver, wdwait);
        addToCartButton = new AddToCartButtons(driver, wdwait);
        removeButtons = new RemoveButtons(driver, wdwait);
    }

    public WebElement getCart() {
        return driver.findElement(By.id("shopping_cart_container"));
    }

    public WebElement getCartNumber() {
        return driver.findElement(By.className("shopping_cart_badge"));
    }

    public WebElement getProductSort() {
        return driver.findElement(By.cssSelector("div.page_wrapper div.header_container:nth-child(1) div.header_secondary_container div.right_component span.select_container > select.product_sort_container"));

    }

    public List<WebElement> getInventoryItemName() {
        return driver.findElements(By.className("inventory_item_name"));
    }

    public List<WebElement> getInventoryItemPrice() {
        return driver.findElements(By.className("inventory_item_price"));
    }

    public List<WebElement> getProductPictures() {
        return driver.findElements(By.className("inventory_item_img"));
    }

    //-----------------------------------------------------

    public void sortProduct(String value) {
        getProductSort().click();
        Select select = new Select(getProductSort());
        select.selectByValue(value);
    }



}








