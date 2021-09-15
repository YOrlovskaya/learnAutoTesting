package page;

import org.openqa.selenium.*;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CreditNal extends BasePage {

    public CreditNal(WebDriver driver) {super(driver);}

    public CreditNal fillName(String name) {
        fillInput(By.xpath("//input[@name='fullName']"), name);
        return this;
    }

    public CreditNal fillPhone(String phone) {
        fillInput(By.xpath(("//input[@name='phone']")), phone);
        return this;
    }

    public CreditNal fillEmail(String email) {
        fillInput(By.xpath(("//input[@name='email']")), email);
        return this;
    }

    public CreditNal chooseSex(String sex) throws InterruptedException {
        Thread.sleep(1000);
        click(By.xpath("//button/p[text()='" + sex + "']"));
        return this;
    }

    public CreditNal fillCheckBox() {
        checkBox(By.xpath(("//input[@type='checkbox'][@name='sopdConfirmed']/../div[1]")));
        return this;
    }

    public CreditNal clickButton(String name) {
        click(By.xpath(("//button[text()='" + name + "']")));
        return this;
    }

    public CreditNal isFormFillCorrect() {
        isElementDisplayed(By.xpath("//h3[text()=\"Заявка на кредит наличными или рефинансирование\"]"));
        return this;
    }

    public CreditNal isFormFillIncorrect() {
        isElementNotDisplayed(By.xpath("//h3[text()=\"Заявка на кредит наличными или рефинансирование\"]"));
        return this;
    }

}
