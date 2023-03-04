package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v85.dom.model.RGBA;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef
{
    P01_register register = new P01_register();
    @Given("click on the Register")
    public void goRegisterPage()
    {
        register.registerLink().click();
    }

    @When("select female Gender")
    public void femaleGender()
    {
        register.gender().click();
    }

    @And("enter Firstname")
    public void enterFirstname()
    {
        register.firstname().sendKeys("automation");
    }

    @And("enter Lastname")
    public void EnterLastname()
    {
        register.lastname().sendKeys("tester");
    }

    @And("choose Day")
    public void birthDay()
    {
        register.day("15");
    }

    @And("choose Month")
    public void birthMonth()
    {
        register.month("8");
    }

    @And("choose year")
    public void birthYear()
    {
        register.year("1997");
    }

    @And("enter Email")
    public void enterEmail()
    {
        register.email().sendKeys("test4@example.com");
    }

    @And("enter password")
    public void enterPassword()
    {
        register.password().sendKeys("P@ssw0rd");
    }

    @And("enter confirm password")
    public void confirmPassword()
    {
        register.rePassword().sendKeys("P@ssw0rd");
    }

    @And("click register")
    public void clickRegisterButton()
    {
        register.clickRegister().click();
    }

    @Then("verify that Your registration completed")
    public void registerVerification()
    {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(register.verification().getText().contains("Your registration completed"));
        softAssert.assertTrue(register.verification().getCssValue("color").equals("76, 177, 124, 1"));
    }




}
