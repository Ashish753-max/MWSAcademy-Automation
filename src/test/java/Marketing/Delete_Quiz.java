package Marketing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Delete_Quiz {

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
		
		// click on the edit section of the created module
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[5]/div/button[2]"))).click();
		
		// create Actions object
        Actions actions = new Actions(driver);

        // locate the element where hover is required
        WebElement hoverElement = wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/div[2]/div/aside/div[2]/div[3]/button")
            )
        );

        // hover on the element
        actions.moveToElement(hoverElement).perform();
        Thread.sleep(2000);
        
        // click on delete button
        wait.until(ExpectedConditions.elementToBeClickable(
			By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/div[2]/div/aside/div[2]/div[3]/button/div/div[2]/div[2]")
		)).click();
        
        // click on confirm delete button
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/button[2]"))).click();
        

		
		
		
	}

}
