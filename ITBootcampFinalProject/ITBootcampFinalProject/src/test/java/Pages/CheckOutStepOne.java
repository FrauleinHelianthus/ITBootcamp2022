package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutStepOne {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement firstName;
    WebElement lastName;
    WebElement zipCode;
    WebElement continueButton;
    WebElement cancelButton;
    WebElement errorMessage;

    public CheckOutStepOne(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getFirstName() {
        return driver.findElement(By.id("first-name"));
    }

    public WebElement getLastName() {
        return driver.findElement(By.id("last-name"));
    }

    public WebElement getZipCode() {
        return driver.findElement(By.id("postal-code"));
    }

    public WebElement getContinueButton() {
        return driver.findElement(By.id("continue"));
    }

    public WebElement getCancelButton() {
        return driver.findElement(By.id("cancel"));
    }

    public WebElement getErrorMessage() {
        return driver.findElement(By.className("error-message-container error"));
    }

    //----------------------------------------------

    public void fillInCheckOutData(String firstName, String lastName, String zipCode) {
        getFirstName().clear();
        getFirstName().sendKeys(firstName);
        getLastName().clear();
        getLastName().sendKeys(lastName);
        getZipCode().clear();
        getZipCode().sendKeys(zipCode);
        getContinueButton().click();
    }
}
