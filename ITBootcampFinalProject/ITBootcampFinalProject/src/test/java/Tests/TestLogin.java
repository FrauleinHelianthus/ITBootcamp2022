package Tests;

import Base.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestLogin extends BasePage {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
    }

/**
 • Test Case Standard User

 This test case verifies login functionality by entering registered username and password.

 1. Go to saucedemo.com
 2. Enter registered username
 3. Enter registered password
 4. Click on Login button
 5. Assert that the login was successful

 Test parameters:
 username : "standard_username"
 password : "secret_sauce"

 **/

    @Test(priority = 10)
    public void testStandardUser() {
        String username = "standard_user";
        String password = "secret_sauce";
        login.Login(username, password);
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        login.getBurgerMenuButton().click();

        Assert.assertEquals(actualUrl,expectedUrl);
        Assert.assertTrue(login.getLogout().isDisplayed());
    }

/**
 • Test Case Locked Out User

 This test case verifies login functionality by entering registered but locked out username and password.

 1. Go to saucedemo.com
 2. Enter registered but locked out username
 3. Enter registered password
 4. Click on Login button
 5. Assert that the message "Sorry, this user has been locked out." is displayed.

 Test parameters:
 username : "locked_out_user"
 password : "secret_sauce"

 **/

    @Test (priority = 20)
    public void testLockedOutUser() {
        String username = "locked_out_user";
        String password = "secret_sauce";
        login.Login(username, password);
        String actualErrorMessageLockedOut = login.getErrorLockedOut().getText();
        String expectedErrorMessageLockedOut= "Epic sadface: Sorry, this user has been locked out.";

        Assert.assertEquals(actualErrorMessageLockedOut,expectedErrorMessageLockedOut);
    }

/**
 • Test Case Problem User

 This test case verifies login functionality by entering registered username and password.

 1. Go to saucedemo.com
 2. Enter the registered username
 3. Enter registered password
 4. Click on the Login button
 5. Assert that pictures of products have not been displayed properly after login and that all are the same.

 Test parameters:
 username : "problem_user"
 password : "secret_sauce"
**/

 @Test(priority = 30)
    public void testProblemUser() throws IOException {
        String username = "problem_user";
        String password = "secret_sauce";
        login.Login(username, password);
        wdwait.until(ExpectedConditions.visibilityOf(login.getWrongPicture()));

        //formiranje liste od src elemenata svake slike
         List<String> listOfPicturesSrc = new ArrayList<>();
         for (int i = 0; i < products.getProductPictures().size(); i++) {
             String src = products.getProductPictures().get(i).getAttribute("src");
             System.out.println("String izvucen iz src atributa " + src);
             listOfPicturesSrc.add(src);
             System.out.println("Lista na iteraciji " + i + " je " + listOfPicturesSrc);

         }
         listOfPicturesSrc.get(0) ;
         //izbacivanje null elemenata iz liste
         while(listOfPicturesSrc.remove(null)){
             System.out.println("Modified list: " +listOfPicturesSrc);
         }

         //assertovanje da ukoliko su dve slike jednake, u pitanju je bug

        for (int i = 0; i < listOfPicturesSrc.size() - 1; i++) {
            if (i == listOfPicturesSrc.size()){
                break;
            }
            Assert.assertTrue(listOfPicturesSrc.get(i).equals(listOfPicturesSrc.get(i + 1)),"Pictures are the same. Bug");
            System.out.println("(" + listOfPicturesSrc.get(i) + ") src na poziciji " + i + " je isti kao i (" + listOfPicturesSrc.get(i + 1) + ")" + " na poziciji " + (i+1) + ".");
        }
        }

/**
• Test Case Performance Glitch User

This test case verifies login functionality by entering registered username and password.

1. Go to saucedemo.com
2. Enter registered username
3. Enter registered password
4. Click on Login button
5. Assert that the login was successful

Test parameters:
username : "performance_glitch_user"
password : "secret_sauce"
**/

    @Test (priority = 40)
    public void testPerformanceGlitchUser() {
        String username = "performance_glitch_user";//nisam sigurna sta je ovo?
        String password = "secret_sauce";
        login.Login(username, password);
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        login.getBurgerMenuButton().click();

        Assert.assertEquals(actualUrl,expectedUrl);
        wdwait.until(ExpectedConditions.visibilityOf(login.getLogout()));
        Assert.assertTrue(login.getLogout().isDisplayed());

    }

/**
 • Test Case WrongUser

 This test case verifies login functionality by entering an invalid username or password.

 1. Go to saucedemo.com
 2. Enter an invalid username
 3. Enter a valid password
 4. Click on the Login button
 5. Assert that the login was not successful.

 Test parameters:
 username : "wrong_username"
 password : "wrong_password"
**/

 @Test(priority = 50)
    public void testWrongUser() {
        String username = "wrong_username";
        String password = "wrong_password";
        login.Login(username, password);
        String actualErrorMessageInvalidData = login.getErrorNotValidData().getText();
        String expectedErrorMessageInvalidData= "Epic sadface: Username and password do not match any user in this service";

        Assert.assertEquals(actualErrorMessageInvalidData,expectedErrorMessageInvalidData);
        Assert.assertTrue(login.getLoginButton().isDisplayed());
    }







}
