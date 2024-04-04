package FirstScenario;

import Pages.AddToCart;
import Pages.ContinueShopping;
import Pages.DealsPage;
import Pages.SearchPage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
    WebDriver driver = null;
    ContinueShopping contiue ;
    SearchPage search;
    AddToCart cart;
    DealsPage deals;

    @BeforeTest
    public void OpenWebsite() throws InterruptedException {

        //Step 1 Bridge between test Scripts and Browser
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);

        //Step 2 New Object of WebDriver
        driver = new ChromeDriver();

        //Step 3 Navigate to google website ,Maximize window and Sleep
        driver.navigate().to("https://www.amazon.com/");

//        driver.manage().window().maximize();

        Dimension dimension = new Dimension(1024,768);
        driver.manage().window().setSize(dimension);
        Thread.sleep(3000);

        contiue = new ContinueShopping(driver);
        search = new SearchPage(driver);
        cart = new AddToCart(driver);
        deals = new DealsPage(driver);

    }

    @Test
public void Search () throws InterruptedException {

//        Thread.sleep(6000);
//        contiue.ContinueButtonEnter();

        search.SearchButtonClick();
        Thread.sleep(2000);

        search.FillSearchField("car accessories");
        Thread.sleep(2000);

        search.SearchFieldEnter();
        Thread.sleep(2000);

        search.SelectItem();
        Thread.sleep(2000);

        cart.AddToCartClick();
        Thread.sleep(2000);

        String ExpectedResult = "Added to Cart";
        String ActualResult = driver.findElement(cart.AddToCartConfirm).getText();
        Assert.assertEquals(ActualResult.contains(ExpectedResult),true);
        System.out.println(ActualResult);
        Thread.sleep(2000);


        cart.CartButtonClick();
        Thread.sleep(5000);




    }

    @AfterTest
    public void CloseWebsite() throws InterruptedException {
        Thread.sleep(3000);

        //Final Step Close Driver
        driver.quit();   // for closing Browser
    }






















//    @Test
//    public void TodayDeals () throws InterruptedException {
//
//        deals.TodayDealsClick();
//        Thread.sleep(2000);
//
//        deals.HeadphonesChoiceClick();
//        Thread.sleep(2000);
//
//        deals.GroceryChoiceClick();
//        Thread.sleep(2000);
//
//        deals.DiscountClick();
//        Thread.sleep(5000);
//
//        deals.NextButtonClick();
//        Thread.sleep(5000);
//
//        Assert.assertTrue(driver.findElement( By.cssSelector("li[class=\"a-disabled a-last\"]")).isEnabled()
//                ,"Error Message : There are Two Pages Only");
//        Thread.sleep(3000);
//
//        deals.DealItemClick();
//        Thread.sleep(3000);
//
//        cart.AddToCartClick();
//        Thread.sleep(2000);
//
//        cart.CartButtonClick();
//        Thread.sleep(5000);
//    }



}
