package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
        WebDriver driver;
        WebDriverWait wdwait;
        WebElement  username;
        WebElement password;
        WebElement loginButton;
        WebElement logout;
        WebElement errorLockedOut;
        WebElement errorNotValidData;
        WebElement wrongPicture;
        WebElement burgerMenuButton;



    public Login(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getUsername() {
        return driver.findElement(By.id("user-name"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.id("login-button"));
    }

    public WebElement getErrorLockedOut() {
        return driver.findElement(By.cssSelector("div.login_wrapper div.login_wrapper-inner div.form_column div.login-box form:nth-child(1) > div.error-message-container.error:nth-child(3)"));
    }

    public WebElement getWrongPicture() {
        return driver.findElement(By.id("item_4_img_link"));
    }

    public WebElement getBurgerMenuButton() {
        return driver.findElement(By.id("react-burger-menu-btn"));
    }

    public WebElement getLogout() {
        return driver.findElement(By.id("logout_sidebar_link"));
    }

    public WebElement getErrorNotValidData() {
        return driver.findElement(By.cssSelector("div.login_wrapper div.login_wrapper-inner div.form_column div.login-box form:nth-child(1) > div.error-message-container.error:nth-child(3)"));
    }

    //----------------------------------------------------

    public void Login(String username, String password) {
        getUsername().clear();
        getUsername().sendKeys(username);
        getPassword().clear();
        getPassword().sendKeys(password);
        getLoginButton().click();
    }
}
