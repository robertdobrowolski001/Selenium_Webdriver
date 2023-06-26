package taskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ById {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement hotelLocationInput = driver.findElement(By.id("hotel_location"));
        WebElement searchRoomSubmit = driver.findElement(By.id("search_room_submit"));
        WebElement enterEmail = driver.findElement(By.id("newsletter-input"));

        hotelLocationInput.sendKeys("Warsaw");
        enterEmail.sendKeys("test@test.com");

        driver.quit();
    }
}
