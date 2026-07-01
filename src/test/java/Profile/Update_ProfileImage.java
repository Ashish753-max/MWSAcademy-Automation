package Profile;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Update_ProfileImage {

	public static void main(String[] args) throws InterruptedException {
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
		
		// click on profile icon
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/aside/nav/div[10]/button"))).click();
		
		
		
		// click on edit button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/header/div[2]/button"))).click();
		
		//click on profile image
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div[1]/div/div[2]/div[1]/div/div[2]/button"))).click();
		
		// click on Update image button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/button[1]"))).click();
		Thread.sleep(2000);
		
		WebElement fileInput = wait.until(
	            ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='file']"))
	        );

	        // 3. Provide the absolute path to your image
	        File file = new File("C:\\Users\\user\\Downloads\\0e7e7c06e1cdb9d84ecb0787f0f1efdf.png");
	        fileInput.sendKeys(file.getAbsolutePath());
	        Thread.sleep(3000);
	        
	        
	        // click on save button
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/header/div[2]/div/button[2]"))).click();
		
		
		

	}

}
