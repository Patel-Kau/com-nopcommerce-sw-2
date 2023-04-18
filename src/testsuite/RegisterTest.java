package testsuite;
/**
 * This programme is for User Registration.
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
        // following method is for User registration with all details, find the field with X path and enter the details.
    public void userShouldNavigateToRegisterPageSuccessfully() {

        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
        String expectedRegisterMessage = "Register";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Register']"));
        String actualRegisterTextMessage = actualTextElement.getText();
        Assert.assertEquals("Error", expectedRegisterMessage, actualRegisterTextMessage);  // compare the Actual and Excepted result
        driver.findElement(By.id("gender-male")).click();    // Select the Male Radio Button in Gender
        driver.findElement(By.id("FirstName")).sendKeys("Kaushik");     // Find First name field and enter First name
        driver.findElement(By.name("LastName")).sendKeys("Patel");      // Find Last name field and enter Last name
        Select day = new Select(driver.findElement(By.xpath(" //select[@name='DateOfBirthDay']")));
        day.selectByIndex(1);               // Date of the Birthday selection
        new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"))).selectByIndex(1);    // Month of the birthday selection
        new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"))).selectByValue("1981");    //Yea of the birthday selection
        driver.findElement(By.id("Email")).sendKeys("kmpatel576@hotmail.com");      // Find email address field and enter the email address
        driver.findElement(By.name("Password")).sendKeys("12345678");               // Enter the password in password field
        driver.findElement(By.id("ConfirmPassword")).sendKeys("12345678");          // Enter the password confirmation
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        String exceptedRegistrationCompletedMessage = "Your registration completed";
        WebElement actualRegistrationCompletedElement = driver.findElement(By.xpath("//div[text()='Your registration completed']"));
        String actualRegistrationCompletedMessage = actualRegistrationCompletedElement.getText();
        Assert.assertEquals("Error", exceptedRegistrationCompletedMessage, actualRegistrationCompletedMessage);       // Verify the actual message with the excepted message

    }
    @After
    public void tearDoem() {
        driver.close();
    }

}
