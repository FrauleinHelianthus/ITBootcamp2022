package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsNames {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement sauceLabsBackpack;
    WebElement sauceLabsBoltTShirt;
    WebElement sauceLabsOnesie;
    WebElement sauceLabsBikeLight;
    WebElement sauceLabsFleeceJacket;
    WebElement testAllTheThingsTShirtRed;

    public ProductsNames(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getSauceLabsBackpack() {
        return driver.findElement(By.id("item_4_title_link"));
    }

    public WebElement getSauceLabsBoltTShirt() {
        return driver.findElement(By.id("item_1_title_link"));
    }

    public WebElement getSauceLabsOnesie() {
        return driver.findElement(By.id("item_2_title_link"));
    }

    public WebElement getSauceLabsBikeLight() {
        return driver.findElement(By.id("item_0_title_link"));
    }

    public WebElement getSauceLabsFleeceJacket() {
        return driver.findElement(By.id("item_5_title_link"));
    }

    public WebElement getTestAllTheThingsTShirtRed() {
        return driver.findElement(By.id("item_3_title_link"));
    }

    //--------------------------------------------------------------
}
