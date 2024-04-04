package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DealsPage {
    private WebDriver driver;
    public DealsPage (WebDriver driver)

    {
        this.driver = driver;
    }

    private By TodayDeals = By.partialLinkText("Today's Deals");
    private By HeadphonesChoice = By.cssSelector("input[data-csa-c-element-id=\"filter-department-172541\"]");
    private By GroceryChoice = By.cssSelector("input[data-csa-c-element-id=\"filter-department-16310101\"]");
    private By Discount = By.cssSelector("a[data-csa-c-element-id=\"filter-discount-10-\"]");
    private By NextButton = By.cssSelector("li[class=\"a-last\"]");
    private By DealItem = By.cssSelector("div[class=\"DealContent-module__truncate_sWbxETx42ZPStTc9jwySW\"]");

    public void TodayDealsClick()
    {
        driver.findElement(TodayDeals).click();
    }
    public void HeadphonesChoiceClick()
    {
        driver.findElement(HeadphonesChoice).click();
    }
    public void GroceryChoiceClick()
    {
        driver.findElement(GroceryChoice).click();
    }
    public void DiscountClick()
    {
        driver.findElement(Discount).click();
    }
    public void NextButtonClick()
    {
        driver.findElement(NextButton).click();
    }
    public void DealItemClick()
    {
        driver.findElement(DealItem).click();
    }
}
