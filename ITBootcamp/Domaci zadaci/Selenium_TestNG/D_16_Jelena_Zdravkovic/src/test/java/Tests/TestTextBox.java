package Tests;

import Pages.TextBox;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.time.Duration;

public class TestTextBox {
    WebDriver driver;
    WebDriverWait wdwait;
    Faker faker;
    JavascriptExecutor js = (JavascriptExecutor) driver;



    @DataProvider(name = "textBoxData")
    public Object[][] textBoxDataFill() {
        faker = new Faker();
        Object[][] textBoxDataFill = new Object[][] {
                {faker.name().fullName() + faker.name().lastName(), faker.internet().emailAddress(), faker.address(). fullAddress(), faker.address().fullAddress()},
                {faker.name().fullName() + faker.name().lastName(), faker.internet().emailAddress(), faker.address(). fullAddress(), faker.address().fullAddress()},
                {faker.name().fullName() + faker.name().lastName(), faker.internet().emailAddress(), faker.address(). fullAddress(), faker.address().fullAddress()},
                {faker.name().fullName() + faker.name().lastName(), faker.internet().emailAddress(), faker.address(). fullAddress(), faker.address().fullAddress()},

       };
        return textBoxDataFill;
    }



    @BeforeClass
        public void setUp() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
            driver.get("https://demoqa.com/text-box");
            driver.manage().window().maximize();
            WebElement ad = driver.findElement(By.id("close-fixedban"));
            ad.click();


        }

  
    @Test(dataProvider = "textBoxData")
        public void testTextBox(String fullName, String email, String currentAddress, String permanentAddress) throws InterruptedException {

        TextBox textBox = new TextBox(driver, wdwait);
        textBox.enterFullName(fullName);
        textBox.enterEmail(email);
        textBox.enterCurrentAddress(currentAddress);
        textBox.enterPermanentAddress(permanentAddress);

        wdwait.until(ExpectedConditions.visibilityOf(textBox.getSubmitButton()));
        textBox.clickOnSubmit();
        Thread.sleep(3000);

        Assert.assertTrue(textBox.getOutput().isDisplayed());

    }



    @AfterClass
    public void finish() throws IOException {
//        driver.manage().deleteAllCookies();
//        driver.close();
//        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");

    }
}

