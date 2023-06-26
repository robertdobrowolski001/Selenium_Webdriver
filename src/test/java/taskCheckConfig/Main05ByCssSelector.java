package taskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main05ByCssSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.findElement(By.className("user_login")).click();
        driver.findElement(By.className("account_input")).sendKeys("b9o0o94@wp.pl");
        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("John");
        driver.findElement(By.xpath("//input[@name='customer_lastname']")).sendKeys("Doe");
        driver.findElement(By.xpath("//input[@data-validate='isPasswd']")).sendKeys("secretpass");
        driver.findElement(By.xpath("//button[@id='submitAccount']")).click();

        driver.findElement(By.cssSelector("a[title='Addresses']")); // MY ADDRESSES
        driver.findElement(By.cssSelector("a[href$='identity']")); // MY PERSONAL INFORMATION
    }
}
