package Company;

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

public class Create_Company1 {

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
		
		// click on Companies section
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/aside/nav/div[6]/button"))).click();
		
		// click on create company button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/header/div[2]/button"))).click();
		
		// enter company name
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[1]/input"))).sendKeys("Anthropic");
		
		// upload company image
    		WebElement companyImage = wait.until(
			    ExpectedConditions.presenceOfElementLocated(
			        By.xpath("(//input[@type='file'])[1]")
			    )
			);

			companyImage.sendKeys("C:\\Users\\user\\Downloads\\download (7).jpg"); 
		
		// enter company description
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[2]/div/div/div[2]/div[1]"))).sendKeys("Anthropic was founded in 2021 by former OpenAI researchers (including siblings Dario and Daniela Amodei) who left OpenAI due to differences in direction. While Anthropic is completely independent, its major backers include tech giants like Google and Amazon.");
		
		//enter product name
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div/div[2]/div/input"))).sendKeys("Claude");
		
		// Enter product image
		WebElement productImage = wait.until(
			    ExpectedConditions.presenceOfElementLocated(
			        By.xpath("(//input[@type='file'])[2]")
			    )
			);

			productImage.sendKeys("C:\\Users\\user\\Downloads\\download (3).png");
		
		// enter product description
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]/div[1]"))).sendKeys("Claude is an AI assistant developed by Anthropic, designed to be helpful, harmless, and honest. It is built using Anthropic's research in AI safety and is intended to assist users with a wide range of tasks while adhering to ethical guidelines.");
		
		// click on save button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[3]/div/button[2]"))).click();
		
		Thread.sleep(3000);  // Wait for 2 seconds to ensure the page has loaded before taking the screenshot
		
		// // Create screenshots folder if it doesn't exist
        File screenshotsFolder = new File("screenshots");
        if (!screenshotsFolder.exists()) {
            screenshotsFolder.mkdirs();
        }
        
        // Take screenshot with the file name
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        String screenshotPath = "screenshots/Create_Company1.png";
        Files.copy(srcFile, new File(screenshotPath));
        
        System.out.println("Screenshot saved at: " + screenshotPath);
	}

}
