package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.awt.*;

public class D02_loginStepDef {


    P02_login login = new P02_login();

    //login with invalid credentials
    @Given("user go to login page")
    public void goLoginPage()
    {
        login.loginLink().click();
    }

    @When("user login with invalid email and password")
    public void enterEmailAndPassword()
    {
        login.email().sendKeys("wrong@example.com");
        login.password().sendKeys("P@ssw0rd");
    }

    @And("user press on login button")
    public void clickLoginButton()
    {
        login.loginButton().click();
    }

    @Then("user could not login to the system")
    public void invalidAssert()
    {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertAll();
        softAssert.assertTrue(login.invalidVerification().getText().contains("Login was unsuccessful."));
        softAssert.assertTrue(login.invalidVerification().getCssValue("color").equals("#e4434b"));
    }


    //login with valid credentials

    /*
    @Given("user go to login page")
    public void goLoginPage1()
    {
        login.loginLink().click();
    }

    @When("user login with valid email and password")
    public void enterEmailAndPassword1()
    {
        login.email().sendKeys("test@example.com");
        login.password().sendKeys("P@ssw0rd");
    }

    @And("user press on login button")
    public void clickLoginButton1()
    {
        login.loginButton().click();
    }

    @Then("user login to the system successfully")
    public void validAssert()
    {
        Assert.assertTrue(login.validVerification().getText().contains("Welcome to our store"));

    }
*/

}
