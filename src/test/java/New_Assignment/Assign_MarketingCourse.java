package New_Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign_MarketingCourse {

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
		
		// click on New Assignment section
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/aside/nav/div[2]/button"))).click();
		
		// click on select recipient
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/form/div[1]/div[1]/div/div"))).click();
		
		Thread.sleep(2000);
		// Click somewhere outside the dropdown
		Actions actions = new Actions(driver);
		actions.moveByOffset(10, 10).click().perform();
		
		// select recipient
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/form/div[1]/div[1]/div/div[2]/div[2]/div/button[1]"))).click();
		
		// click on choose a company
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/form/div[1]/div[2]/div/button"))).click();
		
		// select company
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/form/div[1]/div[2]/div/div/div[2]/div/button[1]"))).click();
		
		// click on choose a product
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/form/div[2]/div[1]/div/div/button"))).click();
		
		// select product
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/form/div[2]/div[1]/div/div/div/div[2]/div/button"))).click();
		
		// click on choose a training course
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/form/div[2]/div[2]/div/div[1]/div/button[2]"))).click();
		
		//click on specific course
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/form/div[2]/div[2]/div/div[2]/div/div"))).click();
		
		//select specific course
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/form/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div/button[2]"))).click();
		
		// click on assign button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/form/div[3]/button"))).click();

	}

}
