package taskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBackAndForward {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver(); //tworzymy obiekt drivera - wybieramy przeglądarkę Chrome
        driver.manage().window().maximize(); //Maksymalizacja okna przeglądarki
        driver.get("https://www.google.com");
        WebElement acceptCookiesButton = driver.findElement(By.id("L2AGLb"));
        acceptCookiesButton.click();
        Thread.sleep(1000);
        driver.get("https://coderslab.pl/pl");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.quit();
    }
}
