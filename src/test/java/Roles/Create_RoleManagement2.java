package Roles;

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

public class Create_RoleManagement2 {

	public static void main(String[] args) throws IOException {
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
		
		// click on Roles section
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/aside/nav/div[10]/button"))).click();
		
		// click on Create Role button
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app-scroll-container\"]/div/div/header/div[2]/button"))).click();
				
				// click on management 
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/button[2]"))).click();
				
				// enter role name
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[1]/input"))).sendKeys("Head Nurse");
				
				// select members permissions
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div[1]/div/button/div"))).click();
				
				// select  companies permissions
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div[3]/div/button/div"))).click();
				
				// select device permissions
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div[4]/div/button/div"))).click();
				
				//select course permissions
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div[5]/div/button/div"))).click();
				
				// select module permissions
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div[6]/div/button/div"))).click();
				
				// select quiz permissions
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div[7]/div/button/div"))).click();
				
				// click on the  groups permissions
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div[8]/div/button/div"))).click();
				
				// click on the marketing permission 
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div[9]/div/button/div"))).click();
				
				// click on the pricing permission
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div[10]/div/button/div"))).click();
				
				// click on the assignment permission
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div[11]/div/button/div"))).click();
				
				// click on the create role button
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/button[2]"))).click();
				
				// Create screenshots folder if it doesn't exist
		        File screenshotsFolder = new File("screenshots");
		        if (!screenshotsFolder.exists()) {
		            screenshotsFolder.mkdirs();
		        }
		        
		        // Take screenshot with the file name
		        TakesScreenshot screenshot = (TakesScreenshot) driver;
		        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		        String screenshotPath = "screenshots/Create_RoleManagement2.png";
		        Files.copy(srcFile, new File(screenshotPath));
		        
		        System.out.println("Screenshot saved at: " + screenshotPath);

	}

}
