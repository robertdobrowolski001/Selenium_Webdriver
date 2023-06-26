package LocatingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXpath {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement signInButton = driver.findElement(By.className("hide_xs"));
        WebElement enterEmail = driver.findElement(By.className("account_input"));

        signInButton.click();
        enterEmail.sendKeys("bo0@wp.pl");

        WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
        createAccountButton.click();
    }
}
