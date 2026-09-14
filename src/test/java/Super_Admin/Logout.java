package Super_Admin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        // Run the complete flow 5 times
        for (int i = 1; i <= 5; i++) {

            System.out.println("========== Test Run " + i + " ==========");

            // Open the website
            driver.get("https://mydentaltouch.mwstraining.com/platform/login");

            // Enter email
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//input[@placeholder='you@company.com']")))
                    .sendKeys("superadmin@wellness.com");

            // Enter password
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//input[@placeholder='••••••••']")))
                    .sendKeys("Appnox@2026");

            // Click Login
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//*[@id='root']/div[2]/div/form/button")))
                    .click();

            // Click Profile icon
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//*[@id='root']/div[2]/div/header/div[2]/div[2]/div/div[1]")))
                    .click();

            // Click Logout
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//*[@id='root']/div[2]/div/header/div[2]/div[2]/div[2]/div[2]/button")))
                    .click();

       //     System.out.println("Test Run " + i + " completed successfully.");
        }

        // Close browser after all 5 runs
        driver.quit();

        
    }
}