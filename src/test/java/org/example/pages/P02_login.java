package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class P02_login {

    public WebElement loginLink()
    {
        WebElement element = new WebDriverWait(Hooks.driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("ico-login")));


        return Hooks.driver.findElement(By.className("ico-login"));
    }

    public WebElement email()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement password()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement loginButton()
    {
        return Hooks.driver.findElement(By.xpath("//*[@class ='button-1 login-button']"));
    }

    public WebElement invalidVerification()
    {
        return Hooks.driver.findElement(By.xpath("//*[@class ='message-error validation-summary-errors']"));
    }
   /*
    public WebElement validVerification()
    {
        return Hooks.driver.findElement(By.className("topic-block-title"));
    }
    */

}
