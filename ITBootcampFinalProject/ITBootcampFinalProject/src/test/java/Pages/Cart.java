package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Cart {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement checkoutButton;
    WebElement continueShoppingButton;
    WebElement cartItemLabel;
    WebElement quantityBox;
    List<WebElement> listItem;

    public Cart(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getCheckoutButton() {
        return driver.findElement(By.id("checkout"));
    }

    public WebElement getContinueShoppingButton() {
        return driver.findElement(By.id("continue-shopping"));
    }

    public WebElement getCartItem() {
        return driver.findElement(By.cssSelector("div.page_wrapper div:nth-child(1) div.cart_contents_container div:nth-child(1) div.cart_list > div.cart_item:nth-child(3)"));
    }

    public WebElement getQuantityBox() {
        return driver.findElement(By.className("cart_quantity"));
    }

    public List<WebElement> getListItem() {
        return driver.findElements(By.className("cart_item"));
    }



    //-------------------------------------------------------


}
