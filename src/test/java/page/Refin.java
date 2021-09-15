package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Refin extends BasePage{

    public Refin(WebDriver driver) {
        super(driver);
    }

    public Refin fillName() {
        fillInput(By.xpath("//input[@name='fullName']"), "Тестов Клиент Анкетович");
        return this;
    }

    public Refin fillPhone() {
        fillInput(By.xpath(("//input[@name='phone']")), "9816994934");
        return this;
    }

    public Refin fillEmail() {
        fillInput(By.xpath(("//input[@name='email']")), "test@test.ru");
        return this;
    }

    public Refin chooseSex() throws InterruptedException {
        Thread.sleep(1000);
        click(By.xpath("//button/p[text()='Мужской']"));
        return this;
    }
}
