import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Automationexercise {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://automationexercise.com/");
        driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("satheeshsk4567@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345678");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
       //remove product from card
        driver.findElement(By.xpath("//a[normalize-space()='Cart']")).click();
        driver.findElement(By.xpath("//a[@class='cart_quantity_delete']")).click();
    }
}
