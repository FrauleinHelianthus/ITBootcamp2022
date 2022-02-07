package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBox {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement fullName;
    WebElement email;
    WebElement currentAddress;
    WebElement permanentAddress;
    WebElement submitButton;
    WebElement ad;
    WebElement output;



    public TextBox(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getFullName() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getAd() {
        return driver.findElement(By.id("close-fixedban"));
    }

    public WebElement getOutput() {
        return driver.findElement(By.id("output"));
    }

    //----------------------------------------

    public void enterFullName(String fullName) {
        getFullName().clear();
        getFullName().sendKeys(fullName);
    }

    public void enterEmail(String email) {
        getEmail().clear();
        getEmail().sendKeys(email);
    }
    public void enterCurrentAddress(String currentAddress) {
        getCurrentAddress().clear();
        getCurrentAddress().sendKeys(currentAddress);
    }

    public void enterPermanentAddress(String permanentAddress) {
        getPermanentAddress().clear();
        getPermanentAddress().sendKeys(permanentAddress);
    }

    public void clickOnSubmit() {
        getSubmitButton().click();
    }


}
