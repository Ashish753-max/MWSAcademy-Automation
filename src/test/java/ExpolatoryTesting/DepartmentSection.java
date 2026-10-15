package ExpolatoryTesting;

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

public class DepartmentSection {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
ChromeDriver driver = new ChromeDriver();
        
        // maximize the window
        driver.manage().window().maximize();
        
        // open the website 
        driver.get("https://mwstraining.com/");
        
        // enter mail
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@placeholder='Enter Email']"))).sendKeys("ashishappnox1@gmail.com");
        
        // enter password
        wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//input[@placeholder='••••••••']"))).sendKeys("Ashish@567");
		
     // click on login button
     		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']"))).click();
     		
     		// click on Department section
     		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Department']"))).click();
     		
     	// Take screenshot with the file name
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
            String screenshotPath = "screenshots/Department Section.png";
            Files.copy(srcFile, new File(screenshotPath));
            
            System.out.println("Screenshot saved at: " + screenshotPath);

	}

}
