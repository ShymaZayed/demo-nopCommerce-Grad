package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P01_register
{
    public WebElement registerLink()
    {
        WebElement element = new WebDriverWait(Hooks.driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("ico-register")));


        return Hooks.driver.findElement(By.className("ico-register"));
    }

    public WebElement gender()
    {
       return Hooks.driver.findElement(By.id("gender-female"));
    }

    public WebElement firstname()
    {
        return Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement lastname()
    {
        return Hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement day(String day1)
    {
        Select day = new Select(Hooks.driver.findElement(By.name("DateOfBirthDay")));
        day.selectByValue(day1);
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement month(String month1)
    {
        Select month = new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
        month.selectByValue(month1);
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement year(String year1)
    {
        Select year = new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        year.selectByValue(year1);
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }

    public WebElement email()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement password()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement rePassword()
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement clickRegister()
    {
        return Hooks.driver.findElement(By.id("register-button"));
    }

    public WebElement verification()
    {
        return Hooks.driver.findElement(By.className("result"));
    }



}
