package taskCheckConfig;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class AmberSearch {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver(); //tworzymy obiekt drivera - wybieramy przeglądarkę Chrome
        driver.manage().window().maximize(); //Maksymalizacja okna przeglądarki
        driver.get("http://www.google.com"); //wpisujemy adres przeglądarki
        WebElement acceptCookiesButton = driver.findElement(By.id("L2AGLb")); //wyszukanie elementu "Zaakceptuj wszystkie
        acceptCookiesButton.click(); //klikamy w przycisk "zaakceptuj wszystko"
        WebElement element = driver.findElement(By.name("q")); //wyszukujemy element searchbar na stronie
        element.clear(); // usuwamy napisy z pola searchbar
        element.sendKeys("Roger Zelazny Amber"); //przesyłamy ciąg znaków Coderslab do searchbara
        element.submit(); // akceptujemy formularz, wyszukujemy hasło w Google - równoznaczne w wciśnięciem enter

    }
}
