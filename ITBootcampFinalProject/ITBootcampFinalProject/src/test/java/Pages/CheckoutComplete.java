package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutComplete {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement backHomeButton;
    WebElement thankYouMsg;

    public CheckoutComplete(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getBackHomeButton() {
        return driver.findElement(By.id("back-to-products"));
    }

    public WebElement getThankYouMsg() {
        return driver.findElement(By.className("complete-header"));
    }

    //----------------------------------------


}
