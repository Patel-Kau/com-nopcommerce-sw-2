package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test

    public void userShouldNavigateToComputerPageSuccessfully() {

        driver.findElement(By.linkText("Computers")).click();
        String expectedComputerPageMessage = "Computers";
        WebElement actualComputerPageElement = driver.findElement(By.xpath("//h1[text()='Computers']"));
        String actualComputerPAgeMessage = actualComputerPageElement.getText();
        Assert.assertEquals("Error Message", expectedComputerPageMessage, actualComputerPAgeMessage);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        driver.findElement(By.linkText("Electronics")).click();
        String expectedElectronicsPageMessage = "Electronics";
        WebElement actualElectronicsPageElement = driver.findElement(By.xpath("//h1[text()='Electronics']"));
        String actualElectronicsPageMessage = actualElectronicsPageElement.getText();
        Assert.assertEquals("Error Message", expectedElectronicsPageMessage, actualElectronicsPageMessage);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        driver.findElement(By.linkText("Apparel")).click();
        String expectedApparelPageMessage = "Apparel";
        WebElement actualApparelPageElement = driver.findElement(By.xpath("//h1[text()='Apparel']"));
        String actualApparelPageMessage = actualApparelPageElement.getText();
        Assert.assertEquals("Error Message", expectedApparelPageMessage, actualApparelPageMessage);

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        driver.findElement(By.linkText("Digital downloads")).click();
        String expectedDigitalDownloadsPageMessage = "Digital downloads";
        WebElement actualElectronicsPageElement = driver.findElement(By.xpath("//h1[text()='Digital downloads']"));
        String actualDigitalDownloadsPageMessage = actualElectronicsPageElement.getText();
        Assert.assertEquals("Error Message", expectedDigitalDownloadsPageMessage, actualDigitalDownloadsPageMessage);

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        driver.findElement(By.linkText("Books")).click();
        String expectedBooksPageMessage = "Books";
        WebElement actualBooksPageElement = driver.findElement(By.xpath("//h1[text()='Books']"));
        String actualBooksPageMessage = actualBooksPageElement.getText();
        Assert.assertEquals("Error Message", expectedBooksPageMessage, actualBooksPageMessage);

    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        driver.findElement(By.linkText("Jewelry")).click();
        String expectedJewelryPageMessage = "Jewelry";
        WebElement actualJewelryPageElement = driver.findElement(By.xpath("//h1[text()='Jewelry']"));
        String actualJewelryPageMessage = actualJewelryPageElement.getText();
        Assert.assertEquals("Error Message", expectedJewelryPageMessage, actualJewelryPageMessage);

    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        driver.findElement(By.linkText("Gift Cards")).click();
        String expectedGiftCardsPageMessage = "Gift Cards";
        WebElement actualGiftCardsPageElement = driver.findElement(By.xpath("//h1[text()='Gift Cards']"));
        String actualGiftCardsPageMessage = actualGiftCardsPageElement.getText();
        Assert.assertEquals("Error Message", expectedGiftCardsPageMessage, actualGiftCardsPageMessage);

    }

    @After
    public void closeBrowser() {
        System.out.println(" Close Browser");
        driver.close();
    }
}



