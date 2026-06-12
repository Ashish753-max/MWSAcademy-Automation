package Forms;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdateImage_FormsModule {

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
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[1]/div/div/div[2]/div/button[1]"))).click();
				
				// click on associated product
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[2]/div/button"))).click();
				
				// select associated product
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[2]/div/div/div[2]/div/button[2]"))).click();
				
				//Resource title
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[2]/input"))).sendKeys("Antigravity");
				
				// Enter description
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[2]/div/div/div[2]/div[1]"))).sendKeys("Google Antigravity is an AI-powered, agent-driven integrated development environment (IDE) designed to let users build software, UI, and workflows by instructing autonomous AI agents rather than writing code manually");
				
				 // 2. Explicitly wait until the file input element is present in the DOM
		        WebElement fileInput = wait.until(
		            ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='file']"))
		        );

		        // 3. Provide the absolute path to your image
		        File file = new File("C:\\Users\\user\\Downloads\\download (2).png");
		        fileInput.sendKeys(file.getAbsolutePath());
		        
		        // click on save button
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[4]/button[2]"))).click();
		        Thread.sleep(5000);
		        
		        // click on edit button
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[5]/div/button[2]"))).click();
		        
		     // create Actions object
		        Actions actions = new Actions(driver);

		        // locate the element where hover is required
		        WebElement hoverElement = wait.until(
		            ExpectedConditions.visibilityOfElementLocated(
		                By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/div[2]/div/aside/div[2]/div[1]/div/button[1]")
		            )
		        );

		        // hover on the element
		        actions.moveToElement(hoverElement).perform();
		        
		        // click on edit to see the page 
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/div[2]/div/aside/div[2]/div[1]/div/button/div[2]/div/div/div[1]"))).click();
		        
		        //remove image
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[3]/div[1]/div/button"))).click();
		        Thread.sleep(2000);
		        //upload new image
		        WebElement fileInput1 = wait.until(
			            ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='file']"))
			        );

			        // Provide the absolute path to your new image
			        File file1 = new File("C:\\Users\\user\\Downloads\\download (4).jpg");
			        fileInput1.sendKeys(file1.getAbsolutePath());
			        Thread.sleep(1000);
			        // click on save button
			        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[4]/button[2]"))).click();
		        
       
	}

}
