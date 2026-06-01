package AuthSection;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

    ChromeDriver driver;

    @BeforeMethod
    public void setup() {

    //    WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void validLoginTest() {

        driver.get("https://mwstraining.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Enter Email
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@placeholder='Enter Email']")))
                .sendKeys("ashishappnox1@gmail.com");

        // Enter Password
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@placeholder='••••••••']")))
                .sendKeys("Ashish@567");

        // Click Login Button
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id='root']/div[1]/div/div/div[1]/div/div/form/div[3]/button")))
                .click();

        System.out.println("Login Successful");
    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {

            driver.quit();
        }   
    }  
}