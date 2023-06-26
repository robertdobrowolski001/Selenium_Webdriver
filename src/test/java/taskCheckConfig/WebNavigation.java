package taskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebNavigation {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver(); //tworzymy obiekt drivera - wybieramy przeglądarkę Chrome
        driver.manage().window().maximize(); //Maksymalizacja okna przeglądarki
        driver.get("https://coderslab.pl/pl"); //wpisujemy adres przeglądarki
        Thread.sleep(2000);
        driver.get("https://mystore-testlab.coderslab.pl/index.php"); //wpisujemy adres przeglądarki
        Thread.sleep(2000);
        driver.get("https://hotel-testlab.coderslab.pl/en/"); //wpisujemy adres przeglądarki
        driver.quit();
         }
}
