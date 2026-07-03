package Courses;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_Module1 {

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
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[1]/div/div/form/div[2]/button"))).click();
		
		// click on Course section
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/aside/nav/div[10]/button"))).click();
		
		// click on course
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div/div[1]/div/div/div/table/tbody/tr[1]/td[6]/div"))).click();
		
		//click on add lession button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/div/aside/div[5]/button[1]"))).click();
		
		// enter Lession title	
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div[2]/div[1]/div[1]/input"))).sendKeys("Machine learning from first principles");
		
		// enter Lession description
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div[2]/div[1]/div[2]/div[2]/div/div[2]/div[1]"))).sendKeys("Machine learning from first principles is a comprehensive course that covers the fundamental concepts and techniques of machine learning. This course is designed for beginners who want to learn machine learning from scratch, as well as for experienced practitioners who want to deepen their understanding of the field.");
		
		// click on text block 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div[2]/div[2]/div/div/button[1]"))).click();
		
		// enter text block title
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div[1]"))).sendKeys("The three primary types of Machine Learning (ML) are Supervised Learning, Unsupervised Learning, and Reinforcement Learning, alongside hybrid approaches like Semi-Supervised and Self-Supervised Learning");
		
		// click on image block
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div[2]/div[2]/div[2]/div/button[2]"))).click();
		
		// enter image block title
		WebElement fileInput = wait.until(
	            ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='file']"))
	        );

	        // Provide the absolute path to your image
	        File file = new File("C:\\Users\\user\\Downloads\\images (3).jpg");
	        fileInput.sendKeys(file.getAbsolutePath());
	        
	        // click on save button
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div[1]/div/button[2]"))).click();

	}

}
