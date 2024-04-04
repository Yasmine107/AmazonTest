package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ContinueShopping {
    private WebDriver driver;
    public ContinueShopping (WebDriver driver)

    {
        this.driver = driver;
    }


    private By ContinueButton = By.cssSelector("button[class=\"a-button-text\"]");

    public void ContinueButtonEnter ()

    {
        driver.findElement(ContinueButton).sendKeys(Keys.ENTER);
    }

}
