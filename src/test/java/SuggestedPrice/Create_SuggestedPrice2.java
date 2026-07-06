package SuggestedPrice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_SuggestedPrice2 {

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
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[1]/div/div/form/div[2]/button"))).click();
		
		// click on suggested price section
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/aside/nav/div[8]/button"))).click();
		
		// click on add price button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/header/div[2]/button"))).click();
		
		// click on the select company dropdown
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div/button"))).click();
		
		// select the company from the dropdown
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div/div/div[2]/div/button[1]"))).click();
		
		// enter title
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/input"))).sendKeys("Automation");
				
				// enter description
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[3]/div/div/div[2]/div[1]"))).sendKeys("Automation is the use of technology, software, and control systems to perform tasks with minimal human intervention. It optimizes workflows, reduces operational costs, and minimizes errors in repetitive processes. Common types range from industrial robotics to digital business process automation.");
				
				// click on video section
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[4]/div[1]/button[2]"))).click();
				
				// upload video
				WebElement fileInput = wait.until(
			            ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='file']"))
			        );

			        // 3. Provide the absolute path to your video
			        File file = new File("C:\\Users\\user\\Downloads\\test.mp4");
			        fileInput.sendKeys(file.getAbsolutePath());
			        
			        // click on save button
			        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[2]/button[2]"))).click();

	}

}
