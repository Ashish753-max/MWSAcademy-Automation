package Forms;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_FormsModule2 {

	public static void main(String[] args) throws InterruptedException {
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
		
		// click on Forms section
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/aside/nav/div[9]/button"))).click();
		
		// click on create form button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/header/div[2]/button"))).click();
		
		//click on target company	
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[1]/div/button"))).click();
				
				// select target company
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[1]/div/div/div[2]/div/button[2]"))).click();
				
				// click on associated product
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[2]/div/button"))).click();
				
				// select associated product
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[2]/div/div/div[2]/div/button"))).click();
				
				//Resource title
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[2]/input"))).sendKeys("Antigravity");
				
				// Enter description
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[2]/div/div/div[2]/div[1]"))).sendKeys("Google Antigravity is an AI-powered, agent-driven integrated development environment (IDE) designed to let users build software, UI, and workflows by instructing autonomous AI agents rather than writing code manually");
				
				 // Upload image - Get all file input elements
		        List<WebElement> fileInputs = wait.until(
		            ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("input[type='file']"))
		        );

		        // Upload image using the first file input
		        if (fileInputs.size() > 0) {
		            File imageFile = new File("C:\\Users\\user\\Downloads\\download (2).png");
		            fileInputs.get(0).sendKeys(imageFile.getAbsolutePath());
		            
		            // Wait for image upload to complete
		            Thread.sleep(3000);
		        }
		        
		        // Upload video using the second file input
		        fileInputs = wait.until(
		                ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("input[type='file']"))
		        );
		        
		        if (fileInputs.size() > 1) {
		            File videoFile = new File("C:\\Users\\user\\Downloads\\test.mp4");
		            fileInputs.get(1).sendKeys(videoFile.getAbsolutePath());
		            
		            // Wait for video upload to complete
		            Thread.sleep(3000);
		        }
		        
		        // click on save button
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[3]/button[2]"))).click();

	}

}
