package Courses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ChromeDriver driver = new ChromeDriver();
        
        // maximize the window
        driver.manage().window().maximize();
        
        // open the website 
        driver.get("https://mwstraining.com/");
        
        // enter mail
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@placeholder='Enter Email']"))).sendKeys("ashishappnox1@gmail.com");
        
        // enter password
        wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//input[@placeholder='••••••••']"))).sendKeys("Ashish@567");
		
				// click on login button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[1]/div/div/form/div[2]/button"))).click();
		
		// click on Course section
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/aside/nav/div[8]/button"))).click();
		
		// click on course
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div/div[1]/div/div/div/table/tbody/tr[1]/td[6]/div"))).click();
		
		// click on the assessment section
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/div/aside/div[5]/button[2]"))).click();
		
		// click on auto generate quiz button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[1]/div[2]/button[1]"))).click();
		
		// select the module for the quiz
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[1]/div/label[1]"))).click();
		
		// click on generate quiz button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[3]/button[2]"))).click();
		
		// click on the publish quiz 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[2]/div/button[2]"))).click();

	}

}
