package SOP_Library;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_SOP1 {

	public static void main(String[] args) {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']"))).click();
		
		// click on SOP Library section
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='SOP Library']"))).click();
		
		// click on create SOP button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='New SOP']"))).click();
		
		// enter sop number 
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//input[@placeholder='e.g. FD-014']"))).sendKeys("SOP-001");
		
		// click on select category dropdown
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/button"))).click();
		
		// select the category from the dropdown
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[2]/div/button[1]"))).click();
		
		// enter the SOP title
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//input[@placeholder='e.g. Late Patient Protocol']"))).sendKeys("How to replace the screen");
		
		// enter the content of the SOP
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/div[2]/div[1]"))).sendKeys("Step 1: Remove the back cover\nStep 2: Disconnect the battery\nStep 3: Remove the screws\nStep 4: Replace the screen\nStep 5: Reassemble the device");
		
		// click on the checkbox of clinical review
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[6]/input"))).click();
		
		// click on the checkbox of medical director approval
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[7]/input"))).click();
		
		// click on create SOP button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Create SOP']"))).click();

	}

}
