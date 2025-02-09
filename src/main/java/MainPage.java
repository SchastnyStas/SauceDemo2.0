import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class MainPage {
    WebDriver driver = new ChromeDriver();
    private final WebElement userName = driver.findElement(By.id("user-name"));
    private final WebElement password = driver.findElement(By.name("password"));
    private final WebElement loginButton = driver.findElement(By.className("submit-button"));
    private final WebElement listOfUserNames = driver.findElement(By.tagName("h4"));
    private final WebElement linkText = driver.findElement(By.linkText("All Items"));
    private final WebElement partLinkText = driver.findElement(By.partialLinkText("All"));
    private final WebElement addToCartButton = driver.findElement(By.xpath("//*[@data-test='add-to-cart-sauce-labs-backpack']"));
    private final WebElement productName = driver.findElement(By.xpath("//*[text() = 'Sauce Labs Backpack']"));
    private final WebElement productNamePartial = driver.findElement(By.xpath("//*[contains(text() = 'Light')]"));
    private final List<WebElement> priceList = driver.findElements(By.xpath("//*[contains(@data-test, 'price')]"));
    private final WebElement cssByTag = driver.findElement(By.cssSelector("input"));
    private final WebElement cssByTagAndClass = driver.findElement(By.cssSelector("input.class"));


}