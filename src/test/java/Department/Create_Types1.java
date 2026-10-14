package Department;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_Types1 {

	public static void main(String[] args) {
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
		
		// click on the types
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Types']"))).click();
		
		// click on add type 	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Add Type']"))).click();
		
		// Enter type name 
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//input[@placeholder='Enter type name']"))).sendKeys("Multi agents");
		
		// enter the desciption
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//textarea[@placeholder='Enter description']"))).sendKeys("This is the type for multi agents");
		
		// click on save button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Save Type']"))).click();

	}

}
