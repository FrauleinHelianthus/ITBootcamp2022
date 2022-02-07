package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPictures {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement pictureLabsBackpack;
    WebElement pictureLabsBoltTShirt;
    WebElement pictureLabsOnesie;
    WebElement pictureLabsBikeLight;
    WebElement pictureLabsFleeceJacket;
    WebElement pictureAllTheThingsTShirtRed;

    public ProductPictures(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getPictureLabsBackpack() {
        return driver.findElement(By.id("item_4_img_link"));
    }

    public WebElement getPictureLabsBoltTShirt() {
        return driver.findElement(By.id("item_1_img_link"));
    }

    public WebElement getPictureLabsOnesie() {
        return driver.findElement(By.id("item_2_img_link"));
    }

    public WebElement getPictureLabsBikeLight() {
        return driver.findElement(By.id("item_0_img_link"));
    }

    public WebElement getPictureLabsFleeceJacket() {
        return driver.findElement(By.id("item_5_img_link"));
    }

    public WebElement getPictureAllTheThingsTShirtRed() {
        return driver.findElement(By.id("item_3_img_link"));
    }

    //--------------------------------------------------------

    public void getSrc(WebElement picture) {
        String src = picture.getAttribute("src");
    }
}
