package Marketing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_Quiz {

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
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[1]/div/div/form/div[3]/button"))).click();
		
		// click on marketing section
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/aside/nav/div[7]/button"))).click();
		
		// click on the edit section of the created module
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[5]/div/button[2]"))).click();
		
		// click on add quiz 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/div[2]/div/aside/div[2]/div[3]/div[1]/button"))).click();
		
		//enter the title 
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[1]/input"))).sendKeys("Machine Learning");
		
		//Enter the description
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[2]/textarea"))).sendKeys("This quiz is designed to test your knowledge of machine learning concepts, algorithms, and applications. It covers a range of topics including supervised and unsupervised learning, neural networks, and more. Good luck!");
		
		// Enter the question
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/input"))).sendKeys("What is the primary goal of machine learning?");
		
		// Enter the first options
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/input"))).sendKeys("To enable computers to learn from data and make predictions or decisions without being explicitly programmed.");
		
		// Enter the second options
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/input"))).sendKeys("To create complex algorithms that can solve any problem.");
		
		// Enter the third options
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/input"))).sendKeys("To replace human intelligence with artificial intelligence.");
		
		// Enter the fourth options
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/input"))).sendKeys("To develop software that can perform any task without human intervention.");
		
		
		//click on publish button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[2]/div/button[2]"))).click();

	}

}
