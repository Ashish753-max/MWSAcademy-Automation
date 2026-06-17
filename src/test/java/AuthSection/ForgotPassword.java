package AuthSection;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgotPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ChromeDriver driver = new ChromeDriver();
        
        // maximize the window
        driver.manage().window().maximize();
        
        // open the website 
        driver.get("https://mwstraining.com/");
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Click on the forgot password   
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[1]/div/div/form/div[1]/div[3]/button"))).click();
        
        // Enter email for password reset
        wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[1]/div/div/form/div[1]/div[1]/input"))).sendKeys("ashishappnox1@gmail.com");
        
        // Click on the reset link button
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[1]/div/div/form/div[2]/button"))).click();

	}

}
