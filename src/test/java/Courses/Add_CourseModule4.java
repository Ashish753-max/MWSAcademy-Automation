package Courses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_CourseModule4 {

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
		
		// click on Course section
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Courses']"))).click();
				
				// select the course from the list
						wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app-scroll-container\"]/div/div/main/div/div/div/div[1]/div/div/div/table/tbody/tr[1]"))).click();
						
						
						// click on add lession button
						wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Add Lesson']"))).click();
						
						// enter the lession title
						wait.until(ExpectedConditions.visibilityOfElementLocated(
						                By.xpath("//input[@placeholder='e.g. Introduction to Safety']"))).sendKeys("AI in Healthcare");
						
						// enter the lession description
						wait.until(ExpectedConditions.visibilityOfElementLocated(
								By.xpath("//*[@id=\"app-scroll-container\"]/div/div/main/div/div/div[2]/div[1]/div[2]/div[2]/div/div[2]/div[1]"))).sendKeys("This lesson will cover the basics of AI in Healthcare.");
						
						// click on sop
						wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='SOP']"))).click();
						
						// select the sop from the list
						wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/button[1]"))).click();
						
						// click on the text button
						wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Text']"))).click();
						
						// enter the text in the text editor
						wait.until(ExpectedConditions.visibilityOfElementLocated(
								By.xpath("//*[@id=\"app-scroll-container\"]/div/div/main/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]"))).sendKeys("This is the content of the lesson.");
						
						// click on sop
						wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='SOP']"))).click();
						
						// select the sop from the list
						wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/button[2]"))).click();
						
						// click on save button
						wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Save Lesson']"))).click();

	}

}
