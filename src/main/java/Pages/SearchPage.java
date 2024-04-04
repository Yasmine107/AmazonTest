package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;
    public SearchPage (WebDriver driver)

    {
        this.driver = driver;
    }

    private By SearchField = By.id("twotabsearchtextbox");
    private By Item = By.cssSelector("span[class=\"a-size-base-plus a-color-base a-text-normal\"]");

    public void SearchButtonClick ()

    {
        driver.findElement(SearchField).click();
    }

    public void FillSearchField(String product)
    {
     driver.findElement(SearchField).sendKeys(product);
    }
    public void SearchFieldEnter ()
    {
        driver.findElement(SearchField).sendKeys(Keys.ENTER);
    }
    public void SelectItem ()

    {
        driver.findElement(Item).click();
    }





}
