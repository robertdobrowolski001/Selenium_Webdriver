package taskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://pl.wikipedia.org/");
        Thread.sleep(2000); //wrzucamy sleep, aby obejsc wyjatek zwiazany ze zmianami na stronie po wywolaniu
        WebElement search = driver.findElement(By.name("search"));
        if(search.isEnabled()) {
            search.sendKeys("Selenium");
            search.submit();
        }else {
            System.out.println("Element is disabled");
        }
    }
}
