package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.managers.SeleniumServerStandaloneManager;
import org.openqa.selenium.By;
import test.TestBase;

public class StepsDefinition extends TestBase {

    @Before
    public void init() {
        start();
    }

//    @After
//    public void teardown() {
//        finish();
//    }

    @Given("I go to main page")
    public void iGoToMainPage() {
        getMoney.goTo();
    }

    @When("I choose link {string}")
    public void iChooseLink(String linkText) {
        getMoney.choosePage(linkText);
    }

    @And("I fill name field with text {string}")
    public void iFillNameFieldWithText(String name) {
        creditNal.fillName(name);
    }

    @And("I fill phone field with text {string}")
    public void iFillPhoneFieldWithText(String phone) {
        creditNal.fillPhone(phone);
    }

    @And("I fill email field with text {string}")
    public void iFillEmailFieldWithText(String email) {
        creditNal.fillEmail(email);
    }

    @And("I choose sex {string}")
    public void iChooseSex(String sex) throws InterruptedException {
        creditNal.chooseSex(sex);
    }

    @And("I check the box")
    public void iCheckTheBox() {
        creditNal.fillCheckBox();
    }

    @And("I click button {string}")
    public void iClickButton(String name) {
        creditNal.clickButton(name);
    }

    @Then("I (see|not see) page step2$")
    public void iSeePageStep2(String page) {
        if (page.equals("see")) {
            creditNal.isFormFillCorrect();
        } else {
            creditNal.isFormFillIncorrect();
        }
    }
}