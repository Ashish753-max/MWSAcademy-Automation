package Super_Admin;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Logout {

    public static void main(String[] args) throws IOException {

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
    				By.xpath("//input[@placeholder='Enter your password']"))).sendKeys("Appnox@2026");

            // Click Login
     		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Sign in']"))).click();


            // Click on profile
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//*[@id=\"root\"]/div[2]/div/header/div[2]/div[3]/div")))
                    .click();

            // Click Logout
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[normalize-space()='Sign Out']")))
                    .click();

          System.out.println("Test Run " + i + " completed successfully.");
        }

        // Close browser after all 5 runs
        driver.quit();
        
     // Take screenshot with the file name
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        String screenshotPath = "screenshots/Super admin logout.png";
        Files.copy(srcFile, new File(screenshotPath));
        
        System.out.println("Screenshot saved at: " + screenshotPath);

        
    }
}