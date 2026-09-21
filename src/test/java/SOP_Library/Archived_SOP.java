package SOP_Library;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Archived_SOP {

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
		
		// click on SOP Library section
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='SOP Library']"))).click();
		
		// click on action button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app-scroll-container\"]/div/div/main/div/div/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/button"))).click();
		
		// click on archive button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app-scroll-container\"]/div/div/main/div/div/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/button[1]"))).click();

	}

}
