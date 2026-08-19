package Courses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_Course1 {

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
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/aside/nav/div[7]/button"))).click();
		
		// click on create course button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app-scroll-container\"]/div/div/header/div[2]/button"))).click();
		
		// click on select company dropdown
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[1]/div/button"))).click();
		
		//  select company from dropdown
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[1]/div/div/div[2]/div/button[1]"))).click();
		
		// click on  device from dropdown
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[2]/div/button"))).click();
		
		// click on select device from dropdown
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[2]/div/div/div[2]/div/button"))).click();
		
		// enter the course title
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/div/input"))).sendKeys("Artificial Intelligence");
		
		// enter the course description
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div[2]/div[1]"))).sendKeys("Artificial Intelligence is the simulation of human intelligence processes by machines, especially computer systems. These processes include learning, reasoning, and self-correction. AI can be applied to various fields, including natural language processing, computer vision, robotics, and expert systems.");
		
		// click on create button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[3]/button[2]"))).click();
		

	}

}
