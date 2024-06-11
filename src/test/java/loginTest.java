import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class loginTest {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/");


        WebElement inputEmail = driver.findElement(By.id("email"));
        inputEmail.sendKeys("danial123@yahoo.com");

        WebElement inputPassword = driver.findElement(By.id("pass"));
        inputPassword.sendKeys("12345");
        WebElement loginBtn = driver.findElement(By.name("login"));
        loginBtn.click();

        Thread.sleep(5000);

        driver.quit();
    }

}