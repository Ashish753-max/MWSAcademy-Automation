package Marketing;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_MarketingModule {

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
		
		// click on marketing section
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/aside/nav/div[7]/button"))).click();
		
		// click on create button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/header/div[2]/button"))).click();
		Thread.sleep(2000);
		
		//click on target company	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[1]/div/button"))).click();
		
		// select target company
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[1]/div/div/div[2]/div/button[1]"))).click();
		
		// click on associated product
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[2]/div/button"))).click();
		
		// select associated product
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[2]/div/div/div[2]/div/button[1]"))).click();
		
		//Resource title
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[2]/input"))).sendKeys("Open AI");
		
		// Enter description
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[2]/div/div/div[2]/div[1]"))).sendKeys("OpenAI was founded in December 2015 by a group of prominent tech leaders, most notably Sam Altman, Elon Musk, Greg Brockman, and Ilya SutskeveOpenAI is an AI research and deployment company. Our mission is to ensure that artificial general intelligence benefits all of humanity.");
		
		 // 2. Explicitly wait until the file input element is present in the DOM
        WebElement fileInput = wait.until(
            ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='file']"))
        );

        // 3. Provide the absolute path to your image
        File file = new File("C:\\Users\\user\\Downloads\\download (3).jpg");
        fileInput.sendKeys(file.getAbsolutePath());
        
        // click on save button
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[4]/button[2]"))).click();

	}

}
