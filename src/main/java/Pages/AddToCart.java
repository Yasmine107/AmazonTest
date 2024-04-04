package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {
    private WebDriver driver;
    public AddToCart (WebDriver driver)

    {
        this.driver = driver;
    }

    private By AddtoCartButton = By.id("addToCart_feature_div");
    private By CartButton = By.partialLinkText("Go to Cart");
    public By AddToCartConfirm = By.cssSelector("h1[class=\"a-size-medium-plus a-color-base sw-atc-text a-text-bold\"]");

    public void AddToCartClick ()
    {
        driver.findElement(AddtoCartButton).click();
    }
    public void CartButtonClick ()
    {
        driver.findElement(CartButton).click();
    }

}
