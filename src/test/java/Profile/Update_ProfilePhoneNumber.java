package Profile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Update_ProfilePhoneNumber {

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
		
		// click on profile icon
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/aside/nav/div[10]/button"))).click();
		
		
		
		// click on edit button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/header/div[2]/button"))).click();
		
		//remove name
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div[2]/div/div/div[2]/div[3]/div/div/div/div/div[2]/input"))).clear();
		
		// enter new name
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div[2]/div/div/div[2]/div[3]/div/div/div/div/div[2]/input"))).sendKeys("7068071256");
		
		// click on save button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/header/div[2]/div/button[2]"))).click();

	}

}
