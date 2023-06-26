package LocatingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClassName {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement signInButton = driver.findElement(By.className("user_login"));
        signInButton.click();
        WebElement enterEmail = driver.findElement(By.className("account_input"));

        enterEmail.sendKeys("bo0@wp.pl");

        WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
        createAccountButton.click();
    }
}
