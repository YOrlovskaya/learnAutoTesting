package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetMoney extends BasePage{

    String SITE_URL = "https://alfabank.ru/get-money/";

    public GetMoney(WebDriver driver) {
        super(driver);
    }

    public GetMoney goTo() {
        driver.get(SITE_URL);
        return this;
    }

    public GetMoney choosePage(String linkText) {
        click(By.xpath("//a[contains(text(), '" + linkText + "')]"));
        return this;
    }
}
