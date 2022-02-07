package Tests;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSortProducts extends BasePage {
    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com");
        login.Login("standard_user", "secret_sauce");


    }

    /**
     • Test Case Sort Products from Lowest to Highest

      This test verifies that when clicking button sort and choose sorting option "from low to high", sorting funtionality works correctly.
      The condition is that user is logged in.

      1. Go to https://www.saucedemo.com/inventory.html
      2. Click on sort button
      3. Choose "price(low to high)"
      4. Assert that items have been sorted by price from lowest to highest price

     Test parameters:
     username : "standard_user"
     password : "secret_sauce"
     **/

    @Test(priority = 10)
    public void testSortProductLoHi() {
        products.sortProduct("lohi");
        List<Double> originalListOfItemPrices = new ArrayList<Double>();
        List<WebElement> listOfInventoryPrices = products.getInventoryItemPrice();
        for (int i = 0; i < listOfInventoryPrices.size(); i++) {
            //za svaki element u konzoli stampati sta se trazi na websajtu-stampati cene svakog proizvoda
            //replace all string metoda za skidanje dolara
            String inventoryPriceString = listOfInventoryPrices.get(i).getText().replace("$","");
            System.out.println("Cene u stringovima: " + inventoryPriceString);

            double inventoryPriceDouble = Double.parseDouble(inventoryPriceString);
            System.out.println("Cene pretvorene u double: " + inventoryPriceDouble);
            System.out.println();

            // cene gurnuti u listu za svaku iteraciju
            originalListOfItemPrices.add(inventoryPriceDouble);
            System.out.println("Lista na iteraciji " +  i + " je " + originalListOfItemPrices);
            System.out.println();
        }
        //napravi kopiju liste originalna lista
        List<Double>  sortedListOfItems = new ArrayList<>();
        sortedListOfItems.addAll(originalListOfItemPrices);
        System.out.println("Kopija originalne liste " + sortedListOfItems);
        System.out.println();

        // sortiraj kopiju liste putem metode list.sort
        Collections.sort(sortedListOfItems);
        System.out.println(sortedListOfItems);
        System.out.println();

        //proveri da li original i kopija jednake, koristi equals
        Assert.assertTrue(originalListOfItemPrices.equals(sortedListOfItems));
        }

    /**
     • Test Case Sort Products from Highest to Lowest

     This test verifies that when clicking button sort and choose sorting option "from high to low", sorting funtionality works correctly.
     The condition is that user is logged in.

     1. Go to https://www.saucedemo.com/inventory.html
     2. Click on sort button
     3. Choose "price(high to low)"
     4. Assert that items have been sorted by price from highest to lowest price

     Test parameters:
     username : "standard_user"
     password : "secret_sauce"
     **/

    @Test(priority = 20)
    public void testSortProductHiLo() {
        products.sortProduct("hilo");
        List<Double> originalListOfItemPrices = new ArrayList<Double>();
        List<WebElement> listOfInventoryPrices = products.getInventoryItemPrice();
        for (int i = 0; i < listOfInventoryPrices.size(); i++) {
            //za svaki element u konzoli stampati sta se trazi na websajtu-stampati cene svakog proizvoda
            //replace all string metoda za skidanje dolara
            String inventoryPriceString = listOfInventoryPrices.get(i).getText().replace("$","");
            System.out.println("Cene u stringovima: " + inventoryPriceString);

            double inventoryPriceDouble = Double.parseDouble(inventoryPriceString);
            System.out.println("Cene pretvorene u double: " + inventoryPriceDouble);
            System.out.println();

            // cene gurnuti u listu za svaku iteraciju
            originalListOfItemPrices.add(inventoryPriceDouble);
            System.out.println("Lista na iteraciji " +  i + " je " + originalListOfItemPrices);
            System.out.println();
        }
        //napravi kopiju liste originalna lista
        List<Double>  sortedListOfItems = new ArrayList<>();
        sortedListOfItems.addAll(originalListOfItemPrices);
        System.out.println("Kopija originalne liste " + sortedListOfItems);
        System.out.println();

        // sortiraj kopiju liste putem metode list.sort
        Collections.sort(sortedListOfItems, Collections.reverseOrder());
        System.out.println(sortedListOfItems);
        System.out.println();

        //proveri da li original i kopija jednake, koristi equals
        Assert.assertTrue(originalListOfItemPrices.equals(sortedListOfItems));

    }

    /**
     • Test Case Sort Products from A to Z

     This test verifies that when clicking button sort and choose sorting option "from A to Z", sorting funtionality works correctly.
     The condition is that user is logged in.

     1. Go to https://www.saucedemo.com/inventory.html
     2. Click on sort button
     3. Choose "Name(A to Z)"
     4. Assert that items have been sorted by name from A to Z

     Test parameters:
     username : "standard_user"
     password : "secret_sauce"
     **/

        @Test(priority = 30)
        public void testSortProductAZ () throws InterruptedException {
            products.sortProduct("az");
            List<String> originalListOfItems = new ArrayList<>();
            List<WebElement> listOfInventoryItemNames = products.getInventoryItemName();
            for (int i = 0; i < listOfInventoryItemNames.size(); i++) {
                //za svaki element u konzoli stampati sta se trazi na websajtu-stampati naslove svakog proizvoda
                String inventoryItemNameString = listOfInventoryItemNames.get(i).getText();
                System.out.println(inventoryItemNameString);
                System.out.println();
                // naslove gurnuti u listu za svaku iteraciju
                originalListOfItems.add(inventoryItemNameString);
                System.out.println("Lista na iteraciji " + i + " je " + originalListOfItems);
                System.out.println();
            }
            //napravi kopiju liste originalna lista
            List<String> sortedListOfItems = new ArrayList<>();
            sortedListOfItems.addAll(originalListOfItems);
            System.out.println("Kopija originalne liste " + sortedListOfItems);
            System.out.println();

            // sortiraj kopiju liste putem metode list.sort
            Collections.sort(sortedListOfItems);
            System.out.println(sortedListOfItems);
            System.out.println();

            //proveri da li original i kopija jednake, koristi equals
            Assert.assertTrue(originalListOfItems.equals(sortedListOfItems));


        }

    /**
     • Test Case Sort Products from Z to A

     This test verifies that when clicking button sort and choose sorting option from Z to A, sorting funtionality works correctly.
     The condition is that user is logged in.

     1. Go to https://www.saucedemo.com/inventory.html
     2. Click on sort button
     3. Choose "Name(Z to A)"
     4. Assert that items have been sorted by name from Z to A

     Test parameters:
     username : "standard_user"
     password : "secret_sauce"
     **/

    @Test(priority = 40)
    public void testSortProductZA () throws InterruptedException {
        products.sortProduct("za");
        List<String> originalListOfItems = new ArrayList<>();
        List<WebElement> listOfInventoryItemNames = products.getInventoryItemName();
        for (int i = 0; i < listOfInventoryItemNames.size(); i++) {
            //za svaki element u konzoli stampati sta se trazi na websajtu-stampati naslove svakog proizvoda
            String inventoryItemNameString = listOfInventoryItemNames.get(i).getText();
            System.out.println(inventoryItemNameString);
            System.out.println();
            // naslove gurnuti u listu za svaku iteraciju
            originalListOfItems.add(inventoryItemNameString);
            System.out.println("Lista na iteraciji " + i + " je " + originalListOfItems);
            System.out.println();
        }
        //napravi kopiju liste originalna lista
        List<String> sortedListOfItems = new ArrayList<>();
        sortedListOfItems.addAll(originalListOfItems);
        System.out.println("Kopija originalne liste " + sortedListOfItems);
        System.out.println();

        // sortiraj kopiju liste putem metode list.sort
        Collections.sort(sortedListOfItems,Collections.reverseOrder());
        System.out.println(sortedListOfItems);
        System.out.println();

        //proveri da li original i kopija jednake, koristi equals
        Assert.assertTrue(originalListOfItems.equals(sortedListOfItems));


    }
    }

