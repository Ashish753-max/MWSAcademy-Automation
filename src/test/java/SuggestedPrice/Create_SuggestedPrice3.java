package SuggestedPrice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Create_SuggestedPrice3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
ChromeDriver driver = new ChromeDriver();
        
        // maximize the window
        driver.manage().window().maximize();
        
        // open the website 
        driver.get("https://mwstraining.com/");
        
        // enter mail
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@placeholder='Enter Email']"))).sendKeys("ashishappnox1@gmail.com");
        
        // enter password
        wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//input[@placeholder='••••••••']"))).sendKeys("Ashish@567");
		
				// click on login button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[1]/div/div/form/div[2]/button"))).click();
		
		// click on suggested price section
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/aside/nav/div[8]/button"))).click();
		
		// click on add price button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/header/div[2]/button"))).click();
		
		// click on the select company dropdown
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[1]/div/button"))).click();
		
		// select the company from the dropdown
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[1]/div/div/div[2]/div/button[3]"))).click();
		
		// click on device dropdown
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[2]/div/button"))).click();
		
		// select the device from the dropdown
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[2]/div/div/div[2]/div/button"))).click();
		
		// enter title
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/input"))).sendKeys("Java and OOP Concepts");
				
				// enter description
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[3]/div/div/div[2]/div[1]"))).sendKeys("Object-Oriented Programming (OOP) in Java is a development paradigm that organizes software design around data, or objects, rather than functions and logic. Java is a class-based language, meaning that every piece of running code must be bundled within a class template");
				
				// click on Document section
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[4]/div[1]/button[3]"))).click();
				
				// upload Document
				WebElement fileInput = wait.until(
			            ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='file']"))
			        );

			        // 3. Provide the absolute path to your image
			        File file = new File("C:\\Users\\user\\Downloads\\Java_and_OOP_Concepts_First_Principles.pdf");
			        fileInput.sendKeys(file.getAbsolutePath());
			        
			        // click on save button
			        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[2]/button[2]"))).click();
			        Thread.sleep(4000); // Wait for 2 seconds to ensure the screenshot captures the final state
			     // Create screenshots folder if it doesn't exist
			        File screenshotsFolder = new File("screenshots");
			        if (!screenshotsFolder.exists()) {
			            screenshotsFolder.mkdirs();
			        }
			        
			        // Take screenshot with the file name
			        TakesScreenshot screenshot = (TakesScreenshot) driver;
			        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
			        String screenshotPath = "screenshots/Create_SuggestedPrice3.png";
			        Files.copy(srcFile, new File(screenshotPath));
			        
			        System.out.println("Screenshot saved at: " + screenshotPath);

	}

}
