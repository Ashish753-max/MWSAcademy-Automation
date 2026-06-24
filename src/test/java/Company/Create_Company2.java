package Company;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_Company2 {

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
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[1]/div/div/form/div[2]/button"))).click();
		
		// click on Companies section
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/aside/nav/div[6]/button"))).click();
		
		// click on create company button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/header/div[2]/button"))).click();
		
		// enter company name
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[1]/input"))).sendKeys("Palentir");
		
		// upload company image
    		WebElement companyImage = wait.until(
			    ExpectedConditions.presenceOfElementLocated(
			        By.xpath("(//input[@type='file'])[1]")
			    )
			);

			companyImage.sendKeys("C:\\Users\\user\\Downloads\\0e7e7c06e1cdb9d84ecb0787f0f1efdf.png"); 
		
		// enter company description
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[2]/div/div/div[2]/div[1]"))).sendKeys("Palantir Technologies is a publicly traded American software company that develops advanced data integration, analytics, and AI platforms for government and commercial enterprises. Headquartered in Miami, Florida, it is best known for being a core software provider for Western defense, intelligence agencies, and large-scale data operations");
		
		//enter product name
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div/div[2]/div/input"))).sendKeys("Palantir AIP");
		
		// Enter product image
		WebElement productImage = wait.until(
			    ExpectedConditions.presenceOfElementLocated(
			        By.xpath("(//input[@type='file'])[2]")
			    )
			);

			productImage.sendKeys("C:\\Users\\user\\Downloads\\download (4).png");
		
		// enter product description
			// Corrected Code
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div/div[2]/div[2]/textarea"))).sendKeys("Palantir AIP is an AI-powered platform that enables organizations to integrate, analyze, and visualize large-scale data for informed decision-making. It provides advanced analytics, machine learning capabilities, and customizable workflows to help users extract insights from complex datasets. Palantir AIP is designed for both government and commercial applications, supporting a wide range of industries in leveraging data-driven strategies.");

		
		// click on save button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[3]/button[2]"))).click();

	}

}
