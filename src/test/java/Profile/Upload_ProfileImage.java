package Profile;

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

public class Upload_ProfileImage {

	public static void main(String[] args) throws InterruptedException, IOException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[1]/div/div/form/div[2]/button"))).click();
		
		// click on profile icon
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/aside/nav/div[10]/button"))).click();
		
		
		// click on edit button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/header/div[2]/button"))).click();
		
		//click on upload image button
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div[1]/div/div[2]/div[1]/div/div[2]/button"))).click();    
				
				// click on upload  
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/button"))).click();
		
		// 2. Wait for the file input element to be present
		
		WebElement fileInput = wait.until(
	            ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='file']"))
	        );

	        // 3. Provide the absolute path to your image
	        File file = new File("C:\\Users\\user\\Downloads\\ashish rai.png");
	        fileInput.sendKeys(file.getAbsolutePath());
	        
	        Thread.sleep(5000);
	        // click on save button
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/header/div[2]/div/button[2]"))).click();
	        
	        // Wait for the save operation to complete
	        Thread.sleep(3000);
	        
	        // Create screenshots folder if it doesn't exist
	        File screenshotsFolder = new File("screenshots");
	        if (!screenshotsFolder.exists()) {
	            screenshotsFolder.mkdirs();
	        }
	        
	        // Take screenshot with the file name
	        TakesScreenshot screenshot = (TakesScreenshot) driver;
	        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
	        String screenshotPath = "screenshots/Upload_ProfileImage.png";
	        Files.copy(srcFile, new File(screenshotPath));
	        
	        System.out.println("Screenshot saved at: " + screenshotPath);

	}

}
