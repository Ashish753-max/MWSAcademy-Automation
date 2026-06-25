package Company;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_Company3 {

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
				By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[1]/input"))).sendKeys("BlackRock");
		
		// upload company image
    		WebElement companyImage = wait.until(
			    ExpectedConditions.presenceOfElementLocated(
			        By.xpath("(//input[@type='file'])[1]")
			    )
			);

			companyImage.sendKeys("C:\\Users\\user\\Downloads\\download (9).jpg"); 
		
		// enter company description
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[2]/div/div/div[2]/div[1]"))).sendKeys("BlackRock is the world's largest asset manager, meaning it invests and manages trillions of dollars on behalf of individuals, pension funds, corporations, and governments. It acts as a financial fiduciary, helping clients grow their money by pooling funds into investments like stocks, bonds, and ETF");
		
		//enter product name
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[2]/div[2]/div[1]/div/div[2]/div[1]/input"))).sendKeys("Aladdin Platform:");
		
		// Enter product image
		WebElement productImage = wait.until(
			    ExpectedConditions.presenceOfElementLocated(
			        By.xpath("(//input[@type='file'])[2]")
			    )
			);

			productImage.sendKeys("C:\\Users\\user\\Downloads\\download (6).png");
		
		// enter product description
			// Corrected Code
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[1]"))).sendKeys("The Aladdin platform (Asset, Liability, and Debt and Derivative Investment Network) is an end-to-end investment and risk management software developed by BlackRock. It unifies the entire investment process—from portfolio management and risk assessment to trade execution and compliance—using a single, centralized dataset");
			
			// click on add product button
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[2]/div[1]/button"))).click();
			
			// enter product name
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[2]/div[2]/div[2]/div/div[2]/div[1]/input"))).sendKeys("BlackRock Investment Institute (BII)");
			
			// Enter product image
			WebElement productImage1 = wait.until(
				    ExpectedConditions.presenceOfElementLocated(
				        By.xpath("(//input[@type='file'])[3]")
				    )
				);

				productImage1.sendKeys("C:\\Users\\user\\Downloads\\download (7).png");
				
				// enter product description
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/div[1]"))).sendKeys("The BlackRock Investment Institute (BII) is the research arm of BlackRock, providing insights and analysis on global markets, economies, and investment strategies. BII conducts in-depth research on macroeconomic trends, asset allocation, and risk management to inform BlackRock's investment decisions and provide thought leadership to clients worldwide.");

		
		// click on save button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[3]/button[2]"))).click();

	}

}
