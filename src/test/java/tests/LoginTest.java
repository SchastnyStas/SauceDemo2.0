package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest {

    @Test
    public void loginAndAddToCardTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        SoftAssert softAssert = new SoftAssert();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("submit-button")).click();
        driver.findElement(By.xpath("//*[@data-test='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        WebElement productName = driver.findElement(By.xpath("//*[@class='inventory_item_name']"));
        softAssert.assertEquals(productName.getText(), "Sauce Labs Backpack");
        WebElement productPrice = driver.findElement(By.className("inventory_item_price"));
        softAssert.assertEquals(productPrice.getText(), "29.99");
        softAssert.assertAll();
        driver.close();
    }
}