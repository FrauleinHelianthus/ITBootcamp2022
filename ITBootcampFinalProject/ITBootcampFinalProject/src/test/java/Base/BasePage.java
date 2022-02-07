package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public Login login;
    public Products products;
    public ProductsPrice productsPrice;
    public ProductsNames productsNames;
    public AddToCartButtons addToCartButton;
    public RemoveButtons removeButtons;
    public CheckOutStepOne checkOutStepOne;
    public CheckoutStepTwo checkoutStepTwo;
    public CheckoutComplete checkoutComplete;
    public Cart cart;


    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        login = new Login(driver, wdwait);
        products = new Products(driver, wdwait);
        productsPrice = new ProductsPrice(driver, wdwait);
        productsNames = new ProductsNames(driver, wdwait);
        addToCartButton = new AddToCartButtons(driver, wdwait);
        removeButtons = new RemoveButtons(driver, wdwait);
        cart = new Cart(driver, wdwait);
        checkOutStepOne = new CheckOutStepOne(driver,wdwait);
        checkoutStepTwo = new CheckoutStepTwo(driver,wdwait);
        checkoutComplete = new CheckoutComplete(driver, wdwait);

    }


    @AfterClass
    public void tearDown() throws IOException {
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
 //       Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }
}
