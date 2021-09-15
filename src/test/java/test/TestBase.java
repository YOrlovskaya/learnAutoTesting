package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.CreditNal;
import page.GetMoney;
import page.Refin;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;
    public GetMoney getMoney;
    public CreditNal creditNal;
    public Refin refin;

    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getMoney = PageFactory.initElements(driver, GetMoney.class);
        creditNal = PageFactory.initElements(driver, CreditNal.class);
        refin = PageFactory.initElements(driver, Refin.class);
    }

    public void finish() {
       driver.quit();
    }
}