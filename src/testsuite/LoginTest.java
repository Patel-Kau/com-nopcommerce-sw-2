package testsuite;

/**
 * This programme is to check the login functionality.
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        WebElement loginLink = driver.findElement(By.linkText("Log in"));       //Find login link by using link Text locator
        loginLink.click();                      // Click on login link
        String exceptedMessage = "Welcome, Please Sign In!";        // Expected message inside the login page.
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']"));     // Capture actual text element in side the login page.
        String actualTextMessage = actualTextElement.getText();         // Text element convert in to the text

        Assert.assertEquals("Error message not displayed", exceptedMessage, actualTextMessage);         // Verify the actual message is as per the excepted message
    }

    @Test
    // method to login with valid credentials
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        driver.findElement(By.id("Email")).sendKeys("kmpatel76@hotmail.com");
        driver.findElement(By.name("Password")).sendKeys("12345678");
        WebElement loginButton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
        loginButton.click();

    }

    @Test

    // Method to verify the error message
    public void verifyTheErrorMessage() {
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        driver.findElement(By.id("Email")).sendKeys("kmpatel76@hotmail.com");
        driver.findElement(By.name("Password")).sendKeys("12345678");
        WebElement loginButton = driver.findElement(By.xpath("(//button[@type='submit'])[2]")); // find the submit button
        loginButton.click();
        String exceptedTheErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        WebElement actualErrorTextElement = driver.findElement(By.xpath("//div[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        String actuclErrorTextMessage = actualErrorTextElement.getText();
        Assert.assertEquals("Error Message", exceptedTheErrorMessage, actuclErrorTextMessage);  // Verify the actual error message with excepted message.
    }

    @After
    public void tearDoem() {
       driver.close();
    }
}
