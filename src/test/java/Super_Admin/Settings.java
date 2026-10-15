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

public class Settings {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
ChromeDriver driver = new ChromeDriver();
        
        // maximize the window
        driver.manage().window().maximize();
        
        // open the website 
        driver.get("https://mydentaltouch.mwstraining.com/platform/login");
        
        // enter mail
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@placeholder='you@company.com']"))).sendKeys("superadmin@wellness.com");
        
        // enter password
        wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//input[@placeholder='Enter your password']"))).sendKeys("Appnox@2026");
		
				// click on login button
 		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Sign in']"))).click();
 		
 		// click on Settings  section 		
 		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Settings"))).click();
 		
 	// Take screenshot with the file name
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        String screenshotPath = "screenshots/Super admin settings.png";
        Files.copy(srcFile, new File(screenshotPath));
        
        System.out.println("Screenshot saved at: " + screenshotPath);

	}

}
